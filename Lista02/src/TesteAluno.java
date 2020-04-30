import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Informe sua matricula: ");
		int matricula = scanner.nextInt();
		aluno.setMatricula(matricula);

		System.out.print("Informe seu nome: ");
		String nome = scanner.next();
		aluno.setNome(nome);
		
		System.out.print("Informe a nota da prova 1: ");
		double prova1 = scanner.nextDouble();
		aluno.setProva1(prova1);
		
		System.out.print("Informe a nota da prova 2: ");
		double prova2 = scanner.nextDouble();
		aluno.setProva2(prova2);
		
		System.out.print("Informe a nota do trabalho: ");
		double trabalho = scanner.nextDouble();
		aluno.setTrabalho(trabalho);
				
		System.out.println("Sua media foi " + aluno.media());
		if(aluno.avaliacaoFinal() > 0) {
			System.out.println("Voce precisa de " + aluno.avaliacaoFinal() + " em sua avaliacao final");
		} else {
			System.out.println("Nao existe necessidade de realizar a avaliação final");
		}
		
		scanner.close();
		
	}
}
