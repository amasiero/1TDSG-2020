package br.com.fiap.escola.domain;

/**
 * Descrição da classe.
 *
 * @author Andrey Masiero
 * @version 1.0
 *
 */
public class Aluno { // domain, model, bean (java), entity (JPA)

	/**
	 * Descrição do atributo. Cada atributo precisa de um comentário JavaDoc
	 */
	private Integer id;
	private Integer rm;
	private String nome;
	private Boolean ativo;
	private Double nota1;
	private Double nota2;

	/**
	 * Construtor da classe.
	 *
	 * @param rm numero inteiro de identificação do aluno
	 * @param nome string que representa o nome completo do aluno
	 * @since 1.0
	 *
	 */
	public Aluno(Integer rm, String nome) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.ativo = true;
		this.nota1 = 0.0;
		this.nota2 = 0.0;
	}

	/**
	 * Construtor da classe
	 *
	 * @param rm numero inteiro de identificação do aluno
	 * @param nome string que representa o nome completo do aluno
	 * @param ativo boolean informando se o aluno ainda está ativo
	 * @since 1.0
	 *
	 */
	public Aluno(Integer rm, String nome, Boolean ativo) {
		this(rm, nome);
		this.ativo = ativo;
	}

	/**
	 * Construtor da classe
	 *
	 * @param id numero inteiro que identifica o registro no banco de dados
	 * @param rm numero inteiro de identificação do aluno
	 * @param nome string que representa o nome completo do aluno
	 * @param ativo boolean informando se o aluno ainda está ativo
	 * @param nota1 double que armazena a nota da primeira prova do aluno
	 * @param nota2 double que armazena a nota da segunda prova do aluno
	 */
	public Aluno(Integer id, Integer rm, String nome, Boolean ativo, Double nota1, Double nota2) {
		this(rm, nome, ativo);
		this.id = id;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	/**
	 * Método de consulta ao id da classe
	 *
	 * @return o inteiro do atributo id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Atribui o valor do id da classe
	 *
	 * @param id numero inteiro que identifica o registro no banco de dados
	 */
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

	/**
	 * Método sobreescrito da classe {@link java.lang.Object}
	 *
	 * @return uma string formatada que representa o objeto.
	 */
	@Override
	public String toString() {
		String ehAtivo = ativo ? "sim" : "não"; // Operador Tenário
		return String.format("""
						Aluno : {
						\tid: %s,
						\trm: %s,
						\tnome: %s,
						\tativo: %s,
						\tnota1: %.1f,
						\tnota2: %.1f,
						\tMédia: %.1f
						}""", id, rm, nome, ehAtivo,
						nota1, nota2, getMedia());
	}

}
