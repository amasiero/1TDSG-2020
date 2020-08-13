package br.com.fiap.concessionaria;

import java.util.Arrays;
import java.util.List;

public class ConcessionariaApplication {

	public static void main(String[] args) {
		Automovel a = new Automovel("Ferrari", "F540", 15000.0);
		Automovel b = new Automovel("Lamborguini", "Aventador", 18000.0);
		Automovel c = new Automovel("Ferrari", "F540", 15000.0);
		
		if(a.equals(b)) {
			System.out.println("É o mesmo veículo.");
			System.out.println(a);
		} else {
			System.out.println("São veículos diferentes.");
			System.out.println(a);
			System.out.println(b);
		}
		
		if(a.equals(c)) {
			System.out.println("É o mesmo veículo.");
			System.out.println(a);
		} else {
			System.out.println("São veículos diferentes.");
			System.out.println(a);
			System.out.println(c);
		}
		
		Concessionaria concessionaria = new Concessionaria();
		concessionaria.adicionaVeiculo(a);
		concessionaria.adicionaVeiculo(b);
		
		System.out.println(concessionaria.consultaEstoqueVeiculos());
		
		List<Automovel> automoveis = concessionaria.consultaEstoqueVeiculos();
		double[] precos = automoveis.stream()
				.mapToDouble(automovel -> automovel.getPreco())
				.toArray();
		
		
		System.out.println(Arrays.toString(precos));
		
		concessionaria.vendaVeiculo(a);
		System.out.println(concessionaria.consultaEstoqueVeiculos());
		System.out.println(concessionaria.consultaVeiculo(a));
		System.out.println(concessionaria.consultaVeiculo(b));

	}

}
