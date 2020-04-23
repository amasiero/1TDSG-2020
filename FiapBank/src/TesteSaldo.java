
public class TesteSaldo {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Antonio");
		
		Conta conta = new Conta();
		conta.setTitular(cliente);
		conta.deposita(10000);
		
		conta.saca(122000);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getSaldo());
	}
}
