package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { //classe filha - subclasse

    private String diretor;

    public Filme(String nome, int anoDeLancamento) { //construtor da subclasse chamando o construtor da superclasse
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaDasAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " - " + this.getAnoDeLancamento() ;
    }
}

