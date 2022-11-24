package br.edu.ifs.academico;

public class Coordenador extends Professor {
	
	public Coordenador(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
