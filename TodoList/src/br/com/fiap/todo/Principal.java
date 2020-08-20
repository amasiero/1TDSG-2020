package br.com.fiap.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Principal {
	
	public static void main(String[] args) {
		
		try {
			// Carrega a classe OracleDriver para a memória
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Criar a conexão com o Banco de Dados
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"system", "system");
			
			System.out.println("Conexão realizada com sucesso!");
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO TB_TAREFA(ID, DESCRICAO, DATA_LIMITE) "
					+ "VALUES (SQ_TAREFA.NEXTVAL, 'Sair para correr durante 1 hr', "
					+ "TO_DATE('20/08/2020', 'dd/mm/yyyy'))");
			
			stmt.executeUpdate("UPDATE TB_TAREFA SET FEITA = 1 WHERE DESCRICAO LIKE '%correr%'");
			
			stmt.executeUpdate("DELETE FROM TB_TAREFA WHERE ID = 2");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_TAREFA");
			
			while(rs.next()) {
				Integer id = rs.getInt("ID");
				String descricao = rs.getString("DESCRICAO");
				Boolean feita = rs.getBoolean("FEITA");
				LocalDate dataLimite = rs.getDate("DATA_LIMITE").toLocalDate();
				
				System.out.println("Tarefa : { " + id + ", " + descricao + ", " + 
						feita + ", " + dataLimite.toString() + " }");
			}
					
			// Fechar a conexão com o Banco de Dados
			conn.close();
		
		} catch(ClassNotFoundException e) {
			System.err.printf("O driver JDBC não foi encontrado: %s\n", e.getMessage());
		} catch(SQLException e) {
			System.err.println("Não foi possível estabelecer a conexão com o banco de dados");
			System.err.println(e.getMessage());
		}
	}

}
