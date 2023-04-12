package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel { //classe filha - subclasse

    private int temporadas;
    private int numeroDeEpisodios;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) { //construtor da subclasse chamando o construtor da superclasse
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // sobrescrita do metodo duracaoEmMinutos

    @Override //@Override anotação do java para sobrescrever o método.
    public int getDuracaoEmMinutos() {  return temporadas * numeroDeEpisodios * minutosPorEpisodio;  }
    // retorna a duração em minutos da série

    @Override
    public int getClassificacao() {
        return (int) mediaDasAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + " - " + this.getAnoDeLancamento();
    }
}

