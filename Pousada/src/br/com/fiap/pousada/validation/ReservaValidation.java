package br.com.fiap.pousada.validation;

import java.util.List;

import br.com.fiap.pousada.domain.Categoria;
import br.com.fiap.pousada.domain.Reserva;

public class ReservaValidation {

	public static boolean excedeuMaxQuartos(List<Reserva> reservas, Categoria categoria, int maxPermitido) {
		 return reservas.stream()
				 .filter(reserva -> reserva.getQuarto().getCategoria() == categoria)
				 .count() > maxPermitido;
	}
	
}
