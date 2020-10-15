package main.br.com.fiap.locadora.services;

import main.br.com.fiap.locadora.models.Cliente;
import main.br.com.fiap.locadora.models.Locacao;
import main.br.com.fiap.locadora.models.Veiculo;
import main.br.com.fiap.locadora.utils.DateUtils;

import java.time.LocalDate;

public class LocacaoService {

    public Locacao alugaCarro(Cliente cliente, Veiculo veiculo) {
        Locacao locacao = new Locacao();
        locacao.setVeiculo(veiculo);
        locacao.setCliente(cliente);
        locacao.setDataRetirada(LocalDate.now());
        locacao.setDataRetorno(DateUtils.adicionaDias(LocalDate.now(), 3));
        locacao.setValor(veiculo.getPrecoLocacao());

        // Colocar o acesso a DAO para salvar no banco de dados

        return locacao;
    }

    public static void main(String... args) {
        // Cenário do Teste
        LocacaoService service = new LocacaoService();
        Cliente cliente =  new Cliente("Andrey", "eu@andrey.com");
        Veiculo veiculo = new Veiculo("Dodge Challenger SRT8", 3, 100.0);

        // Ação do Teste
        Locacao locacao = service.alugaCarro(cliente, veiculo);

        // Verificação do Teste
        System.out.println(locacao.getValor() == 100.0);
        System.out.println(DateUtils.ehMesmaData(locacao.getDataRetirada(), LocalDate.now()));
        System.out.println(DateUtils.ehMesmaData(locacao.getDataRetorno(),
                DateUtils.obterDataComDiferencaDias(3)));
    }


}
