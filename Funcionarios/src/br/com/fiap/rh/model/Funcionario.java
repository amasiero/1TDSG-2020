package br.com.fiap.rh.model;

public class Funcionario {
	private String nome;
	private double valorHora;
	private int horasTrabalhadas;
	
	public Funcionario(String nome, double valorHora) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public double getValorHora() {
		return valorHora;
	}
	
	public double calculaSalario() {
		return this.valorHora * this.horasTrabalhadas;
	}
}
