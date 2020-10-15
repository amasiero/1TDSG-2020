package test.br.com.fiap.locadora.testes;

import main.br.com.fiap.locadora.models.Cliente;
import main.br.com.fiap.locadora.models.Locacao;
import main.br.com.fiap.locadora.models.Veiculo;
import main.br.com.fiap.locadora.services.LocacaoService;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.time.LocalDate;

import static main.br.com.fiap.locadora.utils.DateUtils.*;
import static org.hamcrest.CoreMatchers.*;


public class LocacaoTest {

    private LocacaoService service;

    @Rule
    public ErrorCollector erros = new ErrorCollector();

    @Before
    public void inicia() {
        System.out.println("É parecido com o comportamento de um construtor");
        this.service = new LocacaoService();
    }

    @Test
    public void testePrimeiraLocacao() {
        // Cenário do Teste
        Cliente cliente =  new Cliente("Andrey", "eu@eu.com");
        Veiculo veiculo = new Veiculo("Dodge Charger SRT8", 3, 100.0);

        // Ação do Teste
        Locacao locacao = service.alugaCarro(cliente, veiculo);

        // Verificação do Teste
        erros.checkThat(locacao.getValor(), is(equalTo(100.0)));
        erros.checkThat(locacao.getValor(), is(not(50.0)));
        erros.checkThat(ehMesmaData(locacao.getDataRetirada(), LocalDate.now()), is(true));
        erros.checkThat(ehMesmaData(locacao.getDataRetorno(),
                obterDataComDiferencaDias(3)), is(true));
    }


    @After
    public void finaliza() {
        System.out.println("É executado após a finalização do teste");
    }

}
