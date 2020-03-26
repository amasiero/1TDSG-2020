import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Exercicio1 ex1 = new Exercicio1();
		ex1.smile();
		
		Exercicio2 ex2 = new Exercicio2();
		System.out.print("Digite a temperatura em Celsius: ");
		ex2.celsius = scan.nextDouble();
		ex2.celsiusParaFahrenheit();
		System.out.println(ex2.fahrenheit);
		
		Exercicio3 ex3 = new Exercicio3();
		
		System.out.print("Informe um cateto: ");
		ex3.cateto1 = scan.nextDouble();
		
		System.out.print("Informe outro cateto: ");
		ex3.cateto2 = scan.nextDouble();
		
		ex3.calculaHipotenusa();
		
		System.out.println(ex3.hipotenusa);
		
		Exercicio4 ex4 = new Exercicio4();
		ex4.jogar();
		System.out.println(ex4.dado1);
		System.out.println(ex4.dado2);
		System.out.println(ex4.soma);
		
		scan.close();
	}
}
