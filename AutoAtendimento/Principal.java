class Principal {
	public static void main(String[] args) {
		System.out.println("**************************");
		System.out.println("  Bem vindo ao FIAP Bank  ");
		System.out.println("**************************");
		
		Cliente cliente = new Cliente();
		cliente.nome = "FIAP";
		cliente.endereco = "Av. Paulista, 1100";
		cliente.rg = "47107140471";
		cliente.cpf = 123123123;
		
		ContaCorrente cc = new ContaCorrente();
		cc.agencia = 1234;
		cc.numero = 123123123;
		cc.saldo = 1200000000.01;
		cc.cliente = cliente;

		System.out.println(cc.cliente.nome);
		System.out.println(cc.cliente);
	}
}