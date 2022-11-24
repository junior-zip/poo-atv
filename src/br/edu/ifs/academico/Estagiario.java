package br.edu.ifs.academico;

public class Estagiario extends Pessoa {
	
	public Estagiario(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	private String instituicao;
	private double periodoAtual;
	private String curso;
	
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public double getPeriodoAtual() {
		return periodoAtual;
	}
	public void setPeriodoAtual(double periodoAtual) {
		this.periodoAtual = periodoAtual;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
