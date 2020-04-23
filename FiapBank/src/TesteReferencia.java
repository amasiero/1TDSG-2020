
public class TesteReferencia {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(500);
		System.out.println(conta.getSaldo());
		
		Conta novaConta = conta;
		System.out.println(novaConta.getSaldo());
		
		conta.deposita(1000.0);
		System.out.println(novaConta.getSaldo());
		
		System.out.println(conta);
		System.out.println(novaConta);
		
		System.out.println(conta == novaConta);
	}
}
