package br.com.fiap.patterns.factory;

import java.sql.SQLException;

public interface Connection {
    java.sql.Connection getConnection() throws ClassNotFoundException, SQLException;
}
