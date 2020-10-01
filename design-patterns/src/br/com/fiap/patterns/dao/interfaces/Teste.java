package br.com.fiap.patterns.dao.interfaces;

public class Teste {
    public static void main(String[] args) {
        PessoaDAO dao = new OraclePessoaDAO();
        dao = new MySQLPessoaDAO();
    }
}
