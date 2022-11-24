package br.edu.ifs.academico;

public class Pesquisador extends Pessoa {
	
	public Pesquisador(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private int codigoPesquisa;
	private String grupoPesquisa;
	private String instituicaoVinculada;
	
	public void setCodigoPesquisa(int codigoPesquisa) {
		this.codigoPesquisa = codigoPesquisa;
	}
	
	public int getCodigoPesquisa() {
		return codigoPesquisa;
	}
	
	public void setGrupoPesquisa(String grupoPesquisa) {
		this.grupoPesquisa = grupoPesquisa;
	}
	
	public String getGrupoPesquisa() {
		return grupoPesquisa;
	}
	
	public void setInstituicaoVinculada(String instituicaoVinculada) {
		this.instituicaoVinculada = instituicaoVinculada;
	}
	
	public String getInstituicaoVinculada() {
		return instituicaoVinculada;
	}

}
