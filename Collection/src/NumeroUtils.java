import java.util.*;
import java.util.stream.Collectors;

public class NumeroUtils {
	
	public List<Integer> filtra(List<Integer> numeros, Predicado regra) {
		return numeros.stream()
				.filter(regra::valida) // Method Reference
				.collect(Collectors.toList());
	}
	
	public List<Integer> filtraComForEach(List<Integer> numeros, Predicado regra) {
		List<Integer> lista = new ArrayList<>();
		
		numeros.forEach(numero -> {
			if(regra.valida(numero)) {
				lista.add(numero);
			}
		});
		
		return lista;
	}
	
	public List<Integer> pares(List<Integer> numeros) {
		List<Integer> lista = new ArrayList<>();
		
		numeros.forEach(numero -> {
			if(numero % 2 == 0) {
				lista.add(numero);
			}
		});
		
		return lista;
	}
	
	public List<Integer> impares(List<Integer> numeros) {
		List<Integer> lista = new ArrayList<>();
		
		numeros.forEach(numero -> {
			if(numero % 2 == 1) {
				lista.add(numero);
			}
		});
		
		return lista;
	}

}
