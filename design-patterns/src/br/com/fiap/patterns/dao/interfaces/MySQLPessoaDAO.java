package br.com.fiap.patterns.dao.interfaces;

import java.sql.Connection;
import java.util.List;

public class MySQLPessoaDAO implements PessoaDAO{

    Connection conn;

    @Override
    public List<String> findAll() {
        return null;
    }

    @Override
    public String findById(int id) {
        return null;
    }

    @Override
    public void save(String pessoa) {

    }

    @Override
    public void update(String pessoa) {

    }

    @Override
    public void remove(String pessoa) {

    }
}
