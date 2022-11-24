package br.edu.ifs.academico;

public class Tecnico extends Pessoa {
	
	public Tecnico(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
