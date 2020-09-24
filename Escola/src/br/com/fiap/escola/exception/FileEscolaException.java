package br.com.fiap.escola.exception;

public class FileEscolaException extends Exception {

    public FileEscolaException() {
        this("Ocorreu um problema na manipula��o do arquivo.");
    }

    public FileEscolaException(String msg) {
        super(msg);
    }
}
