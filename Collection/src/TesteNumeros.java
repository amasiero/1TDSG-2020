import java.util.List;

public class TesteNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		NumeroUtils utils = new NumeroUtils();
		
		System.out.println(utils.filtra(numeros, numero -> numero % 2 == 0));
		System.out.println(utils.filtra(numeros, numero -> numero % 2 == 1));
		System.out.println(utils.filtra(numeros, numero -> numero % 3 == 0));
	}
}
