package br.com.fiap.pousada.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pousada.domain.Quarto;
import br.com.fiap.pousada.domain.Reserva;

public class ReservaBD {
	private Connection conn;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private void conecta() throws ClassNotFoundException, SQLException {
		this.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
	}

	public List<Reserva> consultaTodas() throws ClassNotFoundException, SQLException {
		List<Reserva> reservas = new ArrayList<>();
		this.conecta();
		
		String sql = "select * from tb_reserva";
		Statement stmt = this.conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			Long id = rs.getLong("id");
			Integer numeroQuarto = rs.getInt("id_quarto");
			LocalDate dataEntrada = rs.getDate("data_entrada").toLocalDate();
			LocalDate dataSaida = rs.getDate("data_saida").toLocalDate();
			Integer qtdePessoas = rs.getInt("qtde_pessoas");
			
			Quarto quarto = new QuartoBD().consultaPorNumero(numeroQuarto);
			
			reservas.add(new Reserva(id,  quarto, dataEntrada, dataSaida, qtdePessoas));
		}

		this.desconecta();
		return reservas.isEmpty() ? null : reservas;
	}
	
	public void salva(Reserva reserva) throws ClassNotFoundException, SQLException {
		this.conecta();
		String sql = String.format("insert into tb_reserva(id, id_quarto, data_entrada, data_saida, qtde_pessoas)"
				+ "values(sq_reserva.nextval, %s, TO_DATE('%s', 'dd/mm/yyyy'), TO_DATE('%s', 'dd/mm/yyyy'), %s)",
				reserva.getQuarto().getNumero(), formatter.format(reserva.getDataEntrada()),
				formatter.format(reserva.getDataSaida()), reserva.getQtdePessoas());
		Statement stmt = this.conn.createStatement();
		stmt.executeUpdate(sql);	
		this.desconecta();
	}

	private void desconecta() throws SQLException {
		if (!conn.isClosed())
			conn.close();
	}
}
