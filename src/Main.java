
public class Main {

	public static void main(String[] args) {
		
		Cliente leticia = new Cliente();
		leticia.setNome("Letícia");
		
		Conta cc = new ContaCorrente(leticia);		
		Conta poupanca = new ContaPoupanca(leticia);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
