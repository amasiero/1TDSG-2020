
public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jose", 30, Genero.MASCULINO);
		Pessoa p2 = new Pessoa("Maria", 28, Genero.FEMININO);
		Pessoa p3 = new Pessoa("Jose", 30, Genero.MASCULINO);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
