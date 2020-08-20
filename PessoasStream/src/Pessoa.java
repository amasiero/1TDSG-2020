import java.util.Objects;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Genero genero;
	
	public Pessoa(String nome, Integer idade, Genero genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public Genero getGenero() {
		return genero;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Pessoa) {
			Pessoa p = (Pessoa) o; // Casting
			return p.getNome().equals(this.nome) &&
					p.getIdade().equals(this.idade) &&
					p.getGenero().equals(this.genero);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, idade, genero);
	}
	
	@Override
	public String toString() {
		return String.format("{ nome = %s, idade = %d, genero = %s }",
				nome, idade, genero);
	}
	
	public static void exibe(Pessoa p) {
		System.out.println(p);
	}
}
