package br.com.fiap.escola.validation;

import br.com.fiap.escola.domain.Aluno;
import br.com.fiap.escola.exception.AlunoException;

import java.util.regex.Pattern;

public class AlunoValidator {

    public static void validaRM(Integer rm) throws AlunoException {
        if(rm == null)
            throw new AlunoException("Não foi informado o RM.");

        if(!Pattern.compile("^[0-9]{5}$").matcher(rm.toString()).find())
            throw new AlunoException("O RM precisa conter 5 digitos.");
    }

    public static void validaObjetoAluno(Aluno aluno) throws AlunoException {
        if(aluno == null) throw new AlunoException("Não foi encontrado nenhum aluno");
    }
}
