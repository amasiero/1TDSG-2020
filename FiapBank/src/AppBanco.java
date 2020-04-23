//import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppBanco {

	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		System.out.print("Informe o nome do titular: ");
//		String nomeTitular = entrada.next();
//		System.out.print("Informe o valor do deposito inicial: ");
//		double valorDepositoInicial = entrada.nextDouble();
//		
//		Cliente cliente = new Cliente();
//		cliente.setNome(nomeTitular);
//		
//		Conta conta = new Conta();
//		conta.setTitular(cliente);
//		conta.deposita(valorDepositoInicial);
//		
//		System.out.printf("A conta do cliente %s, foi aberta com sucesso.\nSeu saldo inicial é de R$ %.2f",
//				conta.titular.nome, conta.saldo);
//		
//		entrada.close();
		
		
		String nomeTitular = JOptionPane.showInputDialog("Informe o nome do titular");
		double valorDepositoInicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito inicial"));
		
		Cliente cliente = new Cliente();
		cliente.setNome(nomeTitular);
		
		Conta conta = new Conta();
		conta.setTitular(cliente);
		conta.deposita(valorDepositoInicial);
		
		System.out.printf("A conta do cliente %s, foi aberta com sucesso.\nSeu saldo inicial é de R$ %.2f",
				conta.getTitular().getNome(), conta.getSaldo());
		
	}
}
