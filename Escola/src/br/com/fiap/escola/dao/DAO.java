package br.com.fiap.escola.dao;

import java.util.List;

public interface DAO<T> {
    T salva(T t);
    List<T> consultaTodos();
    void atualiza(T t);
    void exclui(Integer t);
}
