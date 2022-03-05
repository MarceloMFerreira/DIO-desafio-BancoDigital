package dio.desafio;

public class Principal {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco();
		banco1.setNome("Banco DIO");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Marcelo");

		Conta cc = new ContaCorrente(cliente1, banco1);
		cc.depositar(100);
	
		
		Conta cp = new ContaPoupanca(cliente1, banco1);
		cc.transferir(90, cp);
		
		

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
