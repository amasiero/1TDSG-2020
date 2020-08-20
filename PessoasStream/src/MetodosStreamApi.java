import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MetodosStreamApi {

	public static void main(String[] args) {
		List<Pessoa> pessoas = getPessoas();
		
		// Declarative Programming -> Stream API -> a partir Java 8
		// Filter
		List<Pessoa> filtrado = pessoas.stream()
				.filter(pessoa -> pessoa.getIdade() > 25)
				.collect(Collectors.toList());
		
		filtrado.forEach(Pessoa::exibe); // Method Reference
		
		// Sort
		List<Pessoa> ordenado = pessoas.stream()
				.sorted(Comparator
						.comparing(Pessoa::getIdade)
						.thenComparing(Pessoa::getGenero)
						.thenComparing(Pessoa::getNome))
				.collect(Collectors.toList());
		
		ordenado.forEach(System.out::println);		

		// All match
		boolean allMatch = pessoas.stream()
				.allMatch(pessoa -> pessoa.getIdade() > 15);
		System.out.println(allMatch);
		
		// Any match
		boolean anyMatch = pessoas.stream()
				.anyMatch(pessoa -> pessoa.getIdade() > 60);
		System.out.println(anyMatch);
		
		// None match
		boolean noneMatch = pessoas.stream()
				.noneMatch(pessoa -> pessoa.getIdade() < 15);
		System.out.println(noneMatch);
		
		// Max
		Optional<Pessoa> max = pessoas.stream()
			.max(Comparator.comparing(Pessoa::getIdade));
		//	.ifPresent(System.out::println);
		if(max.isPresent())
			System.out.println(max.get());
		
		max.ifPresent(System.out::println);
		
		// Min
		Optional<Pessoa> min = pessoas.stream()
			.min(Comparator.comparing(Pessoa::getIdade));
		min.ifPresent(System.out::println);
		

	}
	
	public static List<Pessoa> getPessoas() {
		return List.of(
			new Pessoa("Jose", 30, Genero.MASCULINO),
			new Pessoa("Maria", 28, Genero.FEMININO),
			new Pessoa("Gloria Maria", 23, Genero.FEMININO),
			new Pessoa("Rodolfo", 17, Genero.MASCULINO),
			new Pessoa("Manuel", 45, Genero.MASCULINO),
			new Pessoa("Maricleide", 36, Genero.FEMININO),
			new Pessoa("Julia", 23, Genero.FEMININO),
			new Pessoa("Joao", 23, Genero.MASCULINO),
			new Pessoa("Cleiton", 51, Genero.MASCULINO),
			new Pessoa("Elena", 42, Genero.FEMININO),
			new Pessoa("Klaus", 19, Genero.MASCULINO),
			new Pessoa("Damon", 23, Genero.MASCULINO),
			new Pessoa("Leia", 62, Genero.FEMININO),
			new Pessoa("Rey", 24, Genero.FEMININO)
		);
	}

}
