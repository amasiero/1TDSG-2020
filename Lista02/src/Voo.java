
public class Voo {
	private int numero;
	private Data data;
	private final int maxLugares;
	private int ocupados;
	private static int totalVoos; // Apenas para questões de estudo
	
	public Voo(int numero, Data data) {
		Voo.totalVoos++; // Apenas para questões de estudo
		System.out.println("Primeiro Construtor " + Voo.totalVoos); // Apenas para questões de estudo
		this.numero = numero;
		this.data = data;
		this.maxLugares = 100;
	}
	
	public Voo(int numero, Data data, int ocupados) {
		this(numero, data);
		System.out.println("Segundo Construtor " + Voo.totalVoos); // Apenas para questões de estudo
		this.ocupados = ocupados;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Data getData() {
		return data;
	}
	
	public int proximoLivre() {
		return this.ocupados + 1;
	}
	
	public boolean verifica(int lugar) {
		return lugar > this.ocupados;
	}
	
	public boolean ocupa(int lugar) {
		if(this.verifica(lugar) && this.vagas() > 0) {
			this.ocupados++;
			return true;
		} else {
			return false;
		}	
	}
	
	public int vagas() {
		return this.maxLugares - this.ocupados;
	}
	
	public Voo clone() {
		return new Voo(this.numero, this.data, this.ocupados);
	}
}
