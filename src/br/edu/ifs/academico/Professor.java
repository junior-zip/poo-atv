package br.edu.ifs.academico;

public class Professor extends Pessoa {
	
	public Professor(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

}
