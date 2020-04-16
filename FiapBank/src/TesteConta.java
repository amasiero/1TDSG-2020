
public class TesteConta {
	
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		novaConta.saldo = 1000;
		System.out.println(novaConta.saldo);
		novaConta.deposita(500);
		System.out.println(novaConta.saldo);
		
		Conta segundaNovaConta = new Conta();
		segundaNovaConta.saldo = 500;
		System.out.println(segundaNovaConta.saldo);
		boolean sacou = segundaNovaConta.saca(230);
		if(sacou) {
			System.out.println("Saque efetuado com sucesso.");
		} else {
			System.err.println("Saldo insuficiente.");
		}
		System.out.println(segundaNovaConta.saldo);
		
		if(novaConta.transfere(500, segundaNovaConta)) {
			System.out.println("Transferência efetuada com sucesso.");
		} else {
			System.err.println("Saldo insuficiente.");
		}
		System.out.println(novaConta.saldo);
		System.out.println(segundaNovaConta.saldo);
		
	}
}
