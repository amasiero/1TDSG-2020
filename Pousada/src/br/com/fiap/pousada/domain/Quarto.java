package br.com.fiap.pousada.domain;

public class Quarto {
	
	private Integer numero;
	private Categoria categoria;
	private Integer maxPessoas;
	private Double valorDiaria;
	
	public Quarto(Integer numero, Categoria categoria, Integer maxPessoas, Double valorDiaria) {
		this.numero = numero;
		this.categoria = categoria;
		this.maxPessoas = maxPessoas;
		this.valorDiaria = valorDiaria;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setMaxPessoas(Integer maxPessoas) {
		this.maxPessoas = maxPessoas;
	}
	
	public Integer getMaxPessoas() {
		return maxPessoas;
	}
	
	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public Double getValorDiaria() {
		return valorDiaria;
	}
	
	@Override
	public String toString() {
		return String.format("Quarto nro: %s -> { categoria: %s, maxPessoas: %s, valorDiaria: %.2f }", 
					numero, categoria, maxPessoas, valorDiaria);
	}

}
