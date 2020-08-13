package br.com.fiap.concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
	
	private List<Automovel> automoveis;
	
	public Concessionaria() {
		this.automoveis = new ArrayList<>();
	}
	
	public void adicionaVeiculo(Automovel automovel) {
		this.automoveis.add(automovel);
	}
	
	public void vendaVeiculo(Automovel automovel) {
		this.automoveis.remove(automovel);
	}
	
	public List<Automovel> consultaEstoqueVeiculos() {
		return automoveis;
	}
	
	public Double somaEstoque() {
		// Solução com forEach
//		Double soma = 0.0;
//		for(Automovel automovel : automoveis) { // Significa stream() // Em Python => for automovel in automoveis
//			soma += automovel.getPreco();
//		}
//		return soma;
		
		return automoveis.stream()
				.mapToDouble(automovel -> automovel.getPreco())
				.sum();
		
	}
	
	public Boolean consultaVeiculo(Automovel automovel) {
		return automoveis.stream()
				.filter(automovel::equals) // Method Reference
				.count() == 1;
	}
}
