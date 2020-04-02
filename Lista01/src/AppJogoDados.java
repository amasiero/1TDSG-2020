import java.util.Scanner;

public class AppJogoDados {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do jogador 1: ");
		
		String nome = scan.nextLine();
		Jogador jogador1 = new Jogador(nome);

		System.out.print("Digite o nome do jogador 2: ");
		
		nome = scan.nextLine();
		Jogador jogador2 = new Jogador(nome);
		
		JogoDados jogo = new JogoDados(jogador1, jogador2);
		jogo.joga();
		jogo.joga();
		jogo.joga();
		
		jogo.verPlacar();
		
		Jogador j = jogo.vencedor();
		if(j == null) {
			System.out.println("Deu empate!"); 
		} else {
			System.out.println("O jogador " + j.getNome() + " foi o vencedor.");
		}
		
		jogo.reinicia();
		
		scan.close();
	}
	
}
