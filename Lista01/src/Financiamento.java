
public class Financiamento {
	private double valor;
	private double juros;
	private int tempo;
	
	public Financiamento(double valor, double juros, int tempo) {
		this.valor = valor;
		this.juros = juros;
		this.tempo = tempo;	
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public double calculaValorTotalAPagar() {
		return this.valor * this.juros * this.tempo;
	}

}
