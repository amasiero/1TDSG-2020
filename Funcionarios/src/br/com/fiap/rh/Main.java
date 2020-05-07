package br.com.fiap.rh;

import br.com.fiap.rh.model.Gerente;
import br.com.fiap.rh.model.Vendedor;

public class Main {

	public static void main(String[] args) {
	
		Vendedor v = new Vendedor("Henrique", 50.0, 0.2);
		Gerente g = new Gerente("Natam", 250.0);
		
		g.setHorasTrabalhadas(220);
		v.setHorasTrabalhadas(160);
		
		System.out.println(g.calculaSalario());
		System.out.println(v.calculaSalario());
		
	}

}
