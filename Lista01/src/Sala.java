public class Sala {
	// ATRIBUTOS
	private int capacidade;
	private int lugaresOcupados;
	
	// METODOS
	// CONSTRUTORES
	public Sala(int capacidade) {
		this.capacidade = capacidade;
		this.lugaresOcupados = 0;
	}
	
	// DE ACESSO: GETTERS E SETTERS
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public int getLugaresOcupados() {
		return this.lugaresOcupados;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setLugaresOcupados(int lugaresOcupados) {
		this.lugaresOcupados = lugaresOcupados;
	}
	
	// DE NEGOCIO
	public boolean temLugar() {
		return this.lugaresOcupados < this.capacidade;
	}
	
	public void ocupaLugar() {
		if(this.temLugar()) {
			this.lugaresOcupados++; // this.lugaresOcupados = this.lugaresOcupados + 1;
		} else {
			System.err.println("Não existe lugares disponíveis nessa sessão.");
		}
	}
	
	public void esvazia() {
		this.lugaresOcupados = 0;
	}
}
