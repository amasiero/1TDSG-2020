
public class Venda {
	Produto produto;
	int quantidade;
	double valorVenda;
	
	void vende(Produto p, int qtde) {
		produto = p;
		quantidade = qtde;
		valorVenda = produto.precoVenda * quantidade;
	}
}
