
public class Aluno {
	private int matricula;
	private String nome;
	private double prova1;
	private double prova2;
	private double trabalho;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getProva1() {
		return prova1;
	}
	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}
	public double getProva2() {
		return prova2;
	}
	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}
	public double getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	
	public double media() {
		// Passo 1
		// double nota1 = this.prova1;
		// Passo 2
		// double nota2 = this.prova2;
		// Passo 3
		// double nota3 = this.trabalho;
		// Passo 4
		// double peso1 = 2.5;
		// Passo 5
		// double peso2 = 2.5;
		// Passo 6
		// double peso3 = 2.0;
		double pesoAvaliacao = 2.5;
		double pesoTrabalho = 2.0;
		// Passo 7
		double produto1 = this.prova1 * pesoAvaliacao;
		// Passo 8
		double produto2 = this.prova2 * pesoAvaliacao;
		// Passo 9
		double produto3 = this.trabalho * pesoTrabalho;
		// Passo 10
		double somaProdutos = produto1 + produto2 + produto3;
		// Passo 11
		double somaPesos = (2 * pesoAvaliacao) + pesoTrabalho;
		// Passo 12
		double media = somaProdutos / somaPesos;
		// Passo 13
		return media;
	}
	
	public double avaliacaoFinal() {
		double media = this.media();
		if(media < 6 && media >= 4) {
			return (double) (12 - media); 
		}
		return 0;
	}
}
