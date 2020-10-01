package br.com.fiap.patterns.dao;

import java.util.List;

// DAO -> Data Access Object => Objeto de Acesso ao Banco de Dados
// J2EE Patterns
public class PessoaDAO {

    public List<String> findAll() {
        return List.of("Gloria Maria", "Maria Antunieta", "Tereza Cristina");
    }

    public String findById(int id) {
        return findAll().get(id);
    }

    public void save(String pessoa) {
        System.out.println(pessoa);
    }

    public void update(String pessoa) {
        System.out.println(pessoa);
    }

    public void remove(String pessoa) {
        System.out.println("removido com sucesso");
    }

}
