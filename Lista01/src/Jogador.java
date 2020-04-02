
public class Jogador {
	
	private String nome;
	private int pontos;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.pontos = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void marcaPontos(int pontos) {
		this.pontos += pontos; // this.pontos = this.pontos + pontos;
	}
	
	public void zeraPontos() {
		this.pontos = 0;
	}
}
