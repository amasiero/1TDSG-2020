package br.com.fiap.escola.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import br.com.fiap.escola.domain.Aluno;
import br.com.fiap.escola.exception.FileEscolaException;
import br.com.fiap.escola.helper.FileHelper;

// DAO -> Data Access Object -> Objeto de Acesso ao Dados (Banco de Dados)
public class AlunoDAO { // Métodos de conexão com o banco de dados
	
	private Connection conn;
	
	private void conecta() {
		try {
			Properties props = FileHelper.getEnvProperties();
			this.conn = DriverManager.getConnection(props.getProperty("database.url"),
					props.getProperty("database.user"), props.getProperty("database.password"));
		} catch (SQLException | FileEscolaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public Aluno salva(Aluno aluno) {
		try {
			conecta();
			String sqlConsultaId = "SELECT SQ_ALUNO.NEXTVAL AS ID FROM DUAL";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlConsultaId);
			if(rs.next()) aluno.setId(rs.getInt("ID"));
			
			String sqlSalvaAluno = "INSERT INTO TB_ALUNO(ID, RM, NOME, ATIVO, NOTA1, NOTA2)"
					+ " VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sqlSalvaAluno);
			
			pStmt.setInt(1, aluno.getId());
			pStmt.setInt(2, aluno.getRm());
			pStmt.setString(3, aluno.getNome());
			pStmt.setBoolean(4, aluno.getAtivo());
			pStmt.setDouble(5, aluno.getNota1());
			pStmt.setDouble(6, aluno.getNota2());
			
			pStmt.executeUpdate();
			
			return aluno;
		
		} catch(SQLException e) {
			
			System.err.println(e.getMessage());
			return null;
			
		} finally {
			desconecta();
		}
		
	}
	
	public void atualiza(Aluno aluno) {
		try {
			conecta();
			String sql = String.format("UPDATE TB_ALUNO SET RM = %s, NOME = '%s', ATIVO = %s, NOTA1 = %s,"
					+ "NOTA2 = %s WHERE ID = %s", aluno.getRm(), aluno.getNome(), aluno.getAtivo() ? 1 : 0, aluno.getNota1(),
					aluno.getNota2(), aluno.getId());
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			desconecta();
		}
	}
	
	public void exclui(Integer rm) {
		try {
			conecta();
			String sql = String.format("DELETE FROM TB_ALUNO WHERE RM = %s", rm);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			desconecta();
		}
	}
	
	public List<Aluno> consultaTodos() {
		try {
			conecta();
			
			String sql = "SELECT * FROM TB_ALUNO";
			Statement stmt = conn.createStatement();
			List<Aluno> alunos = new ArrayList<>();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Integer id = rs.getInt("ID");
				Integer rm = rs.getInt("RM");
				String nome = rs.getString("NOME");
				Boolean ativo = rs.getBoolean("ATIVO");
				Double nota1 = rs.getDouble("NOTA1");
				Double nota2 = rs.getDouble("NOTA2");
				
				Aluno aluno = new Aluno(id, rm, nome, ativo, nota1, nota2);
				alunos.add(aluno);
			}
			
			return alunos;
		} catch(SQLException e) {
			System.err.println(e.getMessage());
			return null;
		} finally {
			desconecta();
		}
	}
	
	public Aluno consultaPorRm(Integer rm) {
		try {
			conecta();
			
			String sql = String.format("SELECT * FROM TB_ALUNO WHERE RM = %s", rm);
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				Integer id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				Boolean ativo = rs.getBoolean("ATIVO");
				Double nota1 = rs.getDouble("NOTA1");
				Double nota2 = rs.getDouble("NOTA2");
				
				Aluno aluno = new Aluno(id, rm, nome, ativo, nota1, nota2);
				return aluno;
			}
			
			return null;
		} catch(SQLException e) {
			System.err.println(e.getMessage());
			return null;
		} finally {
			desconecta();
		}
	}
	
	private void desconecta() {
		try {
			if(!conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
