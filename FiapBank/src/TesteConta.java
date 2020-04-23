
public class TesteConta {
	
	public static void main(String[] args) {
		// Criando a instância/referência para um objeto do tipo Conta
		Conta novaConta = new Conta();
		// Criando a instância/referência para um objeto do tipo Cliente
		Cliente novoCliente = new Cliente();
		// Associando nome ao novoCliente
		novoCliente.setNome("Henrique");
		// Associação do titular da novaConta com o novoCliente
		novaConta.setTitular(novoCliente);
		// Associação de um valor para o saldo
		novaConta.deposita(1000);
		
		System.out.println(novaConta.getTitular().getNome());
		System.out.println(novaConta.getSaldo());
		novaConta.deposita(500);
		System.out.println(novaConta.getSaldo());
		
		Conta segundaNovaConta = new Conta();
		segundaNovaConta.deposita(500);
		System.out.println(segundaNovaConta.getSaldo());
		boolean sacou = segundaNovaConta.saca(230);
		if(sacou) {
			System.out.println("Saque efetuado com sucesso.");
		} else {
			System.err.println("Saldo insuficiente.");
		}
		System.out.println(segundaNovaConta.getSaldo());
		
		if(novaConta.transfere(500, segundaNovaConta)) {
			System.out.println("Transferência efetuada com sucesso.");
		} else {
			System.err.println("Saldo insuficiente.");
		}
		System.out.println(novaConta.getSaldo());
		System.out.println(segundaNovaConta.getSaldo());
		
	}
}
