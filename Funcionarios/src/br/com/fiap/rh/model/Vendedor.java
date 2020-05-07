package br.com.fiap.rh.model;

public class Vendedor extends Funcionario {
	
	private double comissao;
	
	public Vendedor(String nome, double valorHora) {
		super(nome, valorHora);
	}
	
	public Vendedor(String nome, double valorHora, double comissao) {
		this(nome, valorHora);
		
		if(comissao < 0 && comissao > 1) {
			this.comissao = 0;
		} else {
			this.comissao = comissao;
		}
	}

	public double getComissao() {
		return comissao;
	}
	
	@Override
	public double calculaSalario() {
		return this.getValorHora() * this.getHorasTrabalhadas() * (1 + this.comissao);
	}

}
