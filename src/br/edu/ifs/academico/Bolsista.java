package br.edu.ifs.academico;

public class Bolsista extends Pessoa{

    private Integer valorDaBolsa;
    private String orientador;

    public Bolsista(String nome) {
        super(nome);
    }

    public Integer getValorDaBolsa() {
        return valorDaBolsa;
    }

    public void setValorDaBolsa(Integer valorDaBolsa) {
        this.valorDaBolsa = valorDaBolsa;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }
}
