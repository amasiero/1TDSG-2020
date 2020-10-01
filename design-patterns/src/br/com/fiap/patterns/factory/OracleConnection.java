package br.com.fiap.patterns.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnection implements br.com.fiap.patterns.factory.Connection {

    private Properties props;

    public OracleConnection() throws IOException {
        props = new Properties();
        props.load(new FileInputStream("application.properties"));
        if(!props.getProperty("database.dbms").equals("ORACLE"))
            throw new IOException("Configure o application.properties para um banco Oracle");
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleConnection");
        return DriverManager.getConnection(
                props.getProperty("database.url"),
                props.getProperty("database.user"),
                props.getProperty("database.password"));
    }

}
