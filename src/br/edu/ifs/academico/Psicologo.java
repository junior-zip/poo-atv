package br.edu.ifs.academico;

public class Psicologo extends Pessoa {
	
	public Psicologo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	private int numeroDoConselho;
	private double cargaHoraria;
	
	public int getNumeroDoConselho() {
		return numeroDoConselho;
	}
	public void setNumeroDoConselho(int numeroDoConselho) {
		this.numeroDoConselho = numeroDoConselho;
	}
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
