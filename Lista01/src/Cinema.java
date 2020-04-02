public class Cinema {

	private double precoIngresso;
	private Sala sala;
		
	public Cinema(Sala sala, double precoIngresso) {
		this.sala = sala;
		this.precoIngresso = precoIngresso;
	}

	public double getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public void vendeIngresso() {
		this.sala.ocupaLugar();
	}
	
	public double calculaFaturamento() {
		return this.sala.getLugaresOcupados() * this.precoIngresso;
	}
	
	public String finalizaSessao() {
		String relatorio = "A ocupação foi de " + this.sala.getLugaresOcupados() +
				" para um total de " + this.sala.getCapacidade() + ", resultando " +
				"em um faturamento de R$ " + this.calculaFaturamento();
		this.sala.esvazia();
		return relatorio;
	}
	
	
}
