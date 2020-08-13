package br.com.fiap.concessionaria;

import java.util.Objects;

public class Automovel {
	
	private String marca;
	private String modelo;
	private Double preco;
	
	public Automovel(String marca, String modelo, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Double getPreco() {
		return preco;
	}
	
	@Override
	public boolean equals(Object o) {
		// Verifica se o objeto recebido como parâmetro é da classe Automovel
		if(!(o instanceof Automovel)) return false;
		
		Automovel auto = (Automovel) o; // Casting ou Coerção
		return this.marca.equalsIgnoreCase(auto.getMarca()) &&
				this.modelo.equalsIgnoreCase(auto.getModelo()) &&
				this.preco.equals(auto.getPreco());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, preco);
	}
	
	@Override
	public String toString() {
		return String.format("Veiculo: %s %s, preço R$ %.2f", marca, modelo, preco);
	}
}
