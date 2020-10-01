package br.com.fiap.patterns.singleton;

import br.com.fiap.patterns.factory.Database;
import br.com.fiap.patterns.factory.OracleConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class SingletonConnectionFactory {

    private static SingletonConnectionFactory factory;
    private static Database database;

    private SingletonConnectionFactory(Database db) {
        database = db;
    }

    public static SingletonConnectionFactory getInstance(Database database) {
        if(factory == null) factory = new SingletonConnectionFactory(database);
        return factory;
    }

    public Connection getConnection() throws IOException, SQLException, ClassNotFoundException {
        if(database == Database.ORACLE) return new OracleConnection().getConnection();
        return null;
    }
}
