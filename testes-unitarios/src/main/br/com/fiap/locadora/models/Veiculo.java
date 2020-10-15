package main.br.com.fiap.locadora.models;

public class Veiculo {
    private String modelo;
    private Integer disponiveis;
    private Double precoLocacao;

    public Veiculo() {}

    public Veiculo(String modelo, Integer disponiveis, Double precoLocacao) {
        this.modelo = modelo;
        this.disponiveis = disponiveis;
        this.precoLocacao = precoLocacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(Integer disponiveis) {
        this.disponiveis = disponiveis;
    }

    public Double getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(Double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }
}
