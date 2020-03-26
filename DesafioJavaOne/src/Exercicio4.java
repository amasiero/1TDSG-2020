import java.util.Random;

public class Exercicio4 {
	
	int dado1;
	int dado2;
	int soma;
	
	void jogar() {
		dado1 = new Random().nextInt(6) + 1;
		dado2 = new Random().nextInt(6) + 1;
		soma();
	}
	
	void soma() {
		soma = dado1 + dado2;
	}
	
}
