// Exercicio 5
public class Pedido {
	
	String cliente;
	String ultimoPedido;
	boolean pedidoPendente;
	double valorTotal;
	
	void fazPedido(String pedido, double valor) {
		ultimoPedido = pedido;
		pedidoPendente = true;
		valorTotal = calculaTotal(valor);
	}
	
	void entregaPedido() {
		pedidoPendente = false;
	}
	
	double calculaTotal(double valor) {
		return valorTotal + valor;
	}
}
