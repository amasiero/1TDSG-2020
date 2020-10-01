package br.com.fiap.patterns.dao.interfaces;

import java.util.List;

public interface PessoaDAO {
    List<String> findAll(); // GENERICS ou Programação Genérica
    String findById(int id);
    void save(String pessoa);
    void update(String pessoa);
    void remove(String pessoa);
}
