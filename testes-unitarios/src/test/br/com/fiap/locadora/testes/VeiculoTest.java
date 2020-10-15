package test.br.com.fiap.locadora.testes;

import main.br.com.fiap.locadora.models.Cliente;
import main.br.com.fiap.locadora.models.Veiculo;
import org.junit.Assert;
import org.junit.Test;


public class VeiculoTest {

    @Test // Todo método de teste, precisa dessa anotação
    public void testeVeiculoInstanciado() {
        Veiculo veiculo = new Veiculo();
        Assert.assertNotNull(veiculo); // Testa se o objeto é não nulo
    }

    @Test
    public void testeVeiculoNulo() {
        Veiculo veiculo = null;
        Assert.assertNull(veiculo); // Testa se o objeto é nulo
    }

    @Test
    public void testeInteirosIguais() {
        int i = 5;
        Integer j = 5;
        /*
            Não é possível comparar no assertEquals, tipos primitivos vs classe do tipo
            Integer.valueOf -> Transforma o tipo primitivo em classe
            assertEquals verifica se os valores são iguais
         */
        Assert.assertEquals(Integer.valueOf(i), j);
    }

    @Test
    public void testeInteirosDiferentes() {
        Integer i = 5, j = 10;
        Assert.assertNotEquals(i, j); // Verifica se são diferentes
    }

    @Test
    public void testeReaisIguais() {
        // Para verificar números com ponto fluante é necessário o
        // terceiro parâmetro dizendo até qual casa decimal considerar.
        Assert.assertEquals(0.51234, 0.5123, 0.0001);
    }

    @Test
    public void testeReaisDiferentes() {
        Assert.assertNotEquals(0.512, 0.51, 0.001);
    }

    @Test
    public void testeRetornoVerdadeiro() {
        // Verifica se o resultado é verdadeiro
        Assert.assertTrue("veiculo".equalsIgnoreCase("Veiculo"));
    }

    @Test
    public void testeRetornoFalso() {
        // Verifica se o resultado é falso
        Assert.assertFalse("veiculo".startsWith("Ve"));
    }

    @Test
    public void testeObjetosIguais() {
        Cliente c1 = new Cliente("Andrey", "eu@eu.com");
        Assert.assertSame(c1, c1); // Compara o endereço da instância
    }

    @Test
    public void testeObjetosDiferentes() {
        Cliente c1 = new Cliente("Andrey", "eu@eu.com");
        Cliente c2 = new Cliente("Andrey", "eu@eu.com");
        Assert.assertNotSame(c1, c2); // Compara o endereço da instância
    }

}
