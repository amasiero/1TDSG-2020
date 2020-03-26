import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a placa do veiculo: ");
		String placa = scan.nextLine();
		
		System.out.print("Digite a marca do veiculo: ");
		String marca = scan.nextLine();
		
		System.out.print("Digite o modelo do veiculo: ");
		String modelo = scan.nextLine();
		
		Veiculo veiculo = new Veiculo(placa, marca, modelo);
		
		System.out.printf("Veiculo %s %s, com placa %s, foi cadastrado com sucesso.\n",
				veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca());
		scan.close();
	}

}
