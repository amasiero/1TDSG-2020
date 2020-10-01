package br.com.fiap.patterns.factory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        try {
            Connection conn = ConnectionFactory.getConnection(Database.ORACLE);
            if (conn != null) {
                System.out.println("Conexão realizada com sucesso.");
                conn.close();
            }
        } catch (SQLException | ClassNotFoundException | IOException throwables) {
            throwables.printStackTrace();
        }

        try {
            Connection conn2 = ConnectionReflectionFactory.getConnection("Oracle");
            if (conn2 != null) {
                System.out.println("Conexão com reflection realizada com sucesso.");
                conn2.close();
            }
        } catch (InstantiationException | SQLException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
