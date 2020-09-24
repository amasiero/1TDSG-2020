package br.com.fiap.escola.test;

import br.com.fiap.escola.exception.AlunoException;
import br.com.fiap.escola.validation.AlunoValidator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlunoTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testaRMNulo() throws AlunoException {
        exceptionRule.expect(AlunoException.class);
        exceptionRule.expectMessage("Não foi informado o RM.");
        Integer rm = null;
        AlunoValidator.validaRM(rm);
    }

    @Test(expected = AlunoException.class)
    public void testaRMComMenosDigitos() throws AlunoException {
        Integer rm = 1234;
        AlunoValidator.validaRM(rm);
    }

    @Test
    public void testaRMOk() throws AlunoException {
        Integer rm = 12345;
        AlunoValidator.validaRM(rm);
    }

}
