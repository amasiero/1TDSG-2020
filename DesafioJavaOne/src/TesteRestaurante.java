
public class TesteRestaurante {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.cliente = "Anakin";
		pedido.fazPedido("Moqueca de Jaca", 40);
		pedido.entregaPedido();
		
		System.out.printf("%s pediu %s no valor de R$ %.2f\n", pedido.cliente,
				pedido.ultimoPedido, pedido.valorTotal);
		System.out.println("");
		System.out.printf("O pedido estah pendente? %b", pedido.pedidoPendente);
		
	}
	
}
