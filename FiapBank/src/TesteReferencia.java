
public class TesteReferencia {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 500;
		System.out.println(conta.saldo);
		
		Conta novaConta = conta;
		System.out.println(novaConta.saldo);
		
		conta.saldo = 1000.0;
		System.out.println(novaConta.saldo);
		
		System.out.println(conta);
		System.out.println(novaConta);
		
		System.out.println(conta == novaConta);
	}
}
