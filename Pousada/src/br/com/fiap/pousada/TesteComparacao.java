package br.com.fiap.pousada;

public class TesteComparacao {
	public static void main(String[] args) {
		
		// verifica as duas condicoes
		System.out.println(true | metodo());
		
		// se a primeira � verdade, n�o verifico a segunda
		System.out.println(true || metodo());
		
	}
	
	public static boolean metodo() {
		System.out.println("executei o metodo");
		return true;
	}
}
