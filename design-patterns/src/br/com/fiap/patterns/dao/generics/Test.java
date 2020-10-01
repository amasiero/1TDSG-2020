package br.com.fiap.patterns.dao.generics;

public class Test {

    public static void main(String[] args) {
        DAO<String> pessoaDao = new PessoaDAO(); // Declaração genérica explicita
        DAO<?> dao = new PessoaDAO(); // Declaração genérica com o coringa
        dao = new NumeroDAO();
    }

}
