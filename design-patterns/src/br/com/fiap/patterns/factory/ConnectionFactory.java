package br.com.fiap.patterns.factory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

// Design Pattern -> Factory
// GoF Pattern (Gang of Four)
// Exemplo: Conexão com Banco
public class ConnectionFactory {

    public static Connection getConnection(Database db) throws SQLException, ClassNotFoundException, IOException {
        if(db == Database.ORACLE) return new OracleConnection().getConnection();
        return null;
    }

}
