package br.com.fiap.patterns.dao.generics;

import java.util.List;

public class PessoaDAO implements DAO<String>{
    @Override
    public List<String> findAll() {
        return null;
    }

    @Override
    public String findById(long id) {
        return null;
    }

    @Override
    public void save(String s) {

    }

    @Override
    public void update(String s) {

    }

    @Override
    public void remove(String s) {

    }
}
