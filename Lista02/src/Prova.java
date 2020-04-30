
public class Prova {
	private Aluno aluno;
	private char[] respostas;
	private Gabarito gabarito;
	private int questao;
	
	public Prova(Gabarito gabarito) {
		this.gabarito = gabarito;
		this.respostas = new char[15];
	}
	
	public void respostaAluno(char resposta) {
		this.respostas[this.questao] = resposta;
		this.questao++;
	}
}
