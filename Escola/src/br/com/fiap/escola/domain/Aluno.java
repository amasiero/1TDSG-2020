package br.com.fiap.escola.domain;

public class Aluno { // domain, model, bean (java), entity (JPA)
	
	private Integer id;
	private Integer rm;
	private String nome;
	private Boolean ativo;
	private Double nota1;
	private Double nota2;
	
	public Aluno(Integer rm, String nome) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.ativo = true;
		this.nota1 = 0.0;
		this.nota2 = 0.0;
	}
	
	public Aluno(Integer rm, String nome, Boolean ativo) {
		this(rm, nome);
		this.ativo = ativo;
	}
	
	public Aluno(Integer id, Integer rm, String nome, Boolean ativo, Double nota1, Double nota2) {
		this(rm, nome, ativo);
		this.id = id;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Integer getRm() {
		return rm;
	}

	public String getNome() {
		return nome;
	}
	
	public Double getMedia() {
		return (nota1 + nota2) / 2;
	}
	
	@Override
	public String toString() {
		String ehAtivo = ativo ? "sim" : "não"; // Operador Tenário
		return String.format("Aluno : {\n\tid: %s,\n\trm: %s,\n\tnome: %s,\n\tativo: %s,"
				+ "\n\tnota1: %.1f,\n\tnota2: %.1f,\n\tMédia: %.1f\n}", id, rm, nome, ehAtivo,
						nota1, nota2, getMedia());
	}
	
}
