
public class TesteEstoque {
	
	public static void main(String[] args) {
		Produto lightsaber = new Produto();
		lightsaber.descricao = "Lightsaber";
		lightsaber.quantidadeAtual = 5;
		lightsaber.quantidadeMinima = 2;
		lightsaber.quantidadeMaxima = 20;
		lightsaber.precoVenda = 2400.0;
		
		Venda venda = new Venda();
		venda.vende(lightsaber, 2);
		
		System.out.printf("Existem %d %s com valor unitário de R$ %.2f.\n", 
				lightsaber.quantidadeAtual, lightsaber.descricao, 
				lightsaber.precoVenda);
		System.out.println("");
		System.out.printf("Foi realizada uma venda de %d %s em um valor total"
				+ " de R$ %.2f.",
				venda.quantidade, venda.produto.descricao, venda.valorVenda);
	}
	
}
