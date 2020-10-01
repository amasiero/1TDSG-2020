package br.com.fiap.patterns.factory;

import java.sql.SQLException;

public class ConnectionReflectionFactory {

    public static java.sql.Connection getConnection(String db) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> c = Class.forName("br.com.fiap.patterns.factory." + db + "Connection");
        return ((Connection) c.newInstance()).getConnection();
    }
}
