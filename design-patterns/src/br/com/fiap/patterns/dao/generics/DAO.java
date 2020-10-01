package br.com.fiap.patterns.dao.generics;

import java.util.List;

// Conceito de Generics ou Programação Genérica
public interface DAO<T> {
    List<T> findAll();
    T findById(long id);
    void save(T t);
    void update(T t);
    void remove(T t);
}
