package br.com.fiap.pousada.domain;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pousada.bd.ReservaBD;

public class Pousada {
	
	private List<Reserva> reservas;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Pousada() {
		this.reservas = new ArrayList<>();
	}
	
	public void atualiza() throws ClassNotFoundException, SQLException {
		List<Reserva> reservas = new ReservaBD().consultaTodas();
		if(reservas != null) this.reservas = reservas;
	}
	
	public void efetuaReserva(Reserva reserva) throws ClassNotFoundException, SQLException {
		new ReservaBD().salva(reserva);
		reservas.add(reserva);
	}
	
	public Reserva consultaReservaPorId(Long id) {
		return reservas.stream()
				.filter(reserva -> reserva.getId().equals(id))
				.findFirst()
				.get();
	}
	
	public Reserva consultaReservaPorQuarto(Integer nroQuarto) {
		return reservas.stream()
				.filter(reserva -> reserva.getQuarto().getNumero().equals(nroQuarto))
				.findFirst()
				.get();
	}
	
	public List<Reserva> consultaReservas() {
		return reservas;
	}
	
	public void efetuaCheckout(Long id) {
		Reserva reserva = this.consultaReservaPorId(id);
		this.imprimiRecibo(reserva);
		this.reservas.remove(reserva);
	}

	private void imprimiRecibo(Reserva reserva) {
		System.out.println("|-----------------------------|");
		System.out.println("|           RECIBO            |");
		System.out.println("|                             |");
		System.out.println(
				String.format("| Reserva nro: %s             |", reserva.getId())
		);
		System.out.println(
				String.format("| Quarto nro:  %s             |", reserva.getQuarto().getNumero())
		);
		System.out.println(
				String.format("| Check-in:    %s             |", formatter.format(reserva.getDataEntrada()))
		);
		System.out.println(
				String.format("| Check-out:   %s             |", formatter.format(reserva.getDataSaida()))
		);
		System.out.println(
				String.format("| Total pago: R$ %.2f         |", reserva.calculaTotal())
		);
		System.out.println("|-----------------------------|");
		
	}
}
