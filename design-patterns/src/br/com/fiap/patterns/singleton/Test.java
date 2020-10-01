package br.com.fiap.patterns.singleton;

import br.com.fiap.patterns.factory.Database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2) {
            System.out.println("São a mesma instância.");
        }

        try {
            Connection conn = SingletonConnectionFactory.getInstance(Database.ORACLE).getConnection();
            if (conn != null) {
                System.out.println("Conexão realizada com sucesso.");
                conn.close();
            }
        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
