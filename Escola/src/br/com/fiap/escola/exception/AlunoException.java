package br.com.fiap.escola.exception;

public class AlunoException extends Exception {

    public AlunoException() {
        this("Problemas de validação do objeto Aluno");
    }

    public AlunoException(String msg) {
        super(msg);
    }
}
