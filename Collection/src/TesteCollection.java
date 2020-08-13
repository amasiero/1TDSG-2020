import java.util.*;
import java.util.function.Consumer;

public class TesteCollection {

	public static void main(String[] args) {
		// int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// int[] numeros = new int[10];
		
		// Collection API
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		numeros.remove(1);
		
		System.out.println("--------------------------------------");
		System.out.println(numeros);
		
		System.out.println("--------------------------------------");
		for(int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			System.out.println(numero);
		}
		
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
		
		// Para o Java 8 utilize Arrays.asList()
		numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Java 10 ou -
		numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Java 11 ou + 
		
		System.out.println("--------------------------------------");
		// A partir Java 8
		ExibeNumeros exibe = new ExibeNumeros();
		numeros.forEach(exibe);
		
		System.out.println("--------------------------------------");
		// Classe Anonima
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);				
			}
		};
		
		numeros.forEach(consumer);
		
		System.out.println("--------------------------------------");
		numeros.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);				
			}
		});
		
		
		// Expressão Lambda
		System.out.println("--------------------------------------");
		numeros.forEach((Integer t) -> {
				System.out.println(t);				
		});
		
		System.out.println("--------------------------------------");
		numeros.forEach((t) -> {
				System.out.println(t);				
		});
		
		System.out.println("--------------------------------------");
		numeros.forEach(t -> {
				System.out.println(t);				
		});
		
		System.out.println("--------------------------------------");
		numeros.forEach(numero -> System.out.println(numero));
		
		// Method Reference
		System.out.println("--------------------------------------");
		numeros.forEach(System.out::println);
	}

}
