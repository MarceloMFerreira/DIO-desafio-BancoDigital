package dio.desafio;

public class ContaCorrente extends Conta {


	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("====== Extrato Conta Corrente =======");
		ImprimirDadosConta();

	}

}
