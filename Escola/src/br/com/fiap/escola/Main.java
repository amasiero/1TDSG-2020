package br.com.fiap.escola;

import java.util.List;
import java.util.Scanner;

import br.com.fiap.escola.dao.AlunoDAO;
import br.com.fiap.escola.dao.DAO;
import br.com.fiap.escola.domain.Aluno;
import br.com.fiap.escola.exception.AlunoException;
import br.com.fiap.escola.validation.AlunoValidator;

public class Main {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int opcao = 0;
			do {
				menu();
				System.out.print("> ");
				opcao = scan.nextInt();

				switch (opcao) {
				case 1:
					cadastraAluno(scan);
					break;
				case 2:
					consultaPorRM(scan);
					break;
				case 3:
					consultaAlunos();
					break;
				case 4:
					atualizaAluno(scan);
					break;
				case 5:
					excluiAluno(scan);
					break;
				}

				System.out.println("\n\n");
			} while (opcao != 0);

			System.out.println("#--- Programa finalizado com sucesso ---#");
		}

	}

	private static void excluiAluno(Scanner scan) {
		System.out.println("#--- EXCLUI CADASTRO DO ALUNO ---#");
		
		System.out.print("Digite o número do RM: > ");
		Integer rm = scan.nextInt();
		
		AlunoDAO db = new AlunoDAO();
		db.exclui(rm);
		
		System.out.println("#--- ALUNO REMOVIDO COM SUCESSO.");
	}

	private static void atualizaAluno(Scanner scan) {
		try {
			System.out.println("#--- ATUALIZA CADASTRO DO ALUNO ---#");
			Aluno aluno = buscaAlunoPorRM(scan);

			System.out.print("Digite a nota 1: > ");
			Double nota1 = scan.nextDouble();

			System.out.print("Digite a nota 2: > ");
			Double nota2 = scan.nextDouble();

			aluno.setNota1(nota1);
			aluno.setNota2(nota2);

			DAO<Aluno> db = new AlunoDAO();
			db.atualiza(aluno);

			System.out.println("#--- Cadastro atualizado com sucesso.");
		}catch (AlunoException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void consultaAlunos() {
		System.out.println("#--- CONSULTA ALUNOS ---#");
		
		AlunoDAO db = new AlunoDAO();
		List<Aluno> alunos = db.consultaTodos();
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
		
	}

	private static void consultaPorRM(Scanner scan) {
		System.out.println("#--- CONSULTA ALUNO POR RM ---#");

		try {
			Aluno aluno = buscaAlunoPorRM(scan);
			System.out.println(aluno);
		} catch (AlunoException e) {
			System.err.println(e.getMessage());
		}
	}

	private static Aluno buscaAlunoPorRM(Scanner scan) throws AlunoException {
		System.out.print("Digite o número do RM: > ");
		Integer rm = scan.nextInt();
		AlunoValidator.validaRM(rm);

		AlunoDAO db = new AlunoDAO();
		Aluno aluno = db.consultaPorRm(rm);
		AlunoValidator.validaObjetoAluno(aluno);

		return aluno;
	}
	
	private static void cadastraAluno(Scanner scan) {
		System.out.println("#--- NOVO ALUNO ---#");
		
		System.out.print("Digite o número do RM: > ");
		Integer rm = scan.nextInt(); // não pega o caracter de nova linha '\n' (mas ele fica na memória)
		scan.nextLine();
		
		System.out.print("Digite o nome: > ");
		String nome = scan.nextLine(); // O nextline entende que o \n foi digitado
		
		Aluno aluno = new Aluno(rm, nome);
		AlunoDAO db = new AlunoDAO();
		aluno = db.salva(aluno);
		
		if(aluno.getId() != null) {
			System.out.println("#--- Cadastro realizado com sucesso.");
		}
		System.out.println(aluno);
		
	}

	private static void menu() {
		System.out.println("|-----------------------------|");
		System.out.println("|           ESCOLA            |");
		System.out.println("|                             |");
		System.out.println("| Digite a opção desejada:    |");
		System.out.println("| 1 - Cadastrar aluno         |");
		System.out.println("| 2 - Consultar por RM        |");
		System.out.println("| 3 - Consultar alunos        |");
		System.out.println("| 4 - Atualizar aluno         |");
		System.out.println("| 5 - Excluir aluno           |");
		System.out.println("| 0 - Sair do sistema         |");
		System.out.println("|-----------------------------|");
	}

}
