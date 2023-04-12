package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal { // classe br.com.alura.screenmatch.principal
    public static void main(String[] args) {
        // Referência ao objeto br.com.alura.screenmatch.modelo.Filme.

        // instanciando um novo objeto do tipo filme com construtor.
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(10);

        System.out.println("A média das avaliações é: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média das avaliações é: " + meuFilme.mediaDasAvaliacoes());

        System.out.println("""
                
                --------------------------
                """);

        // instanciando um novo objeto do tipo Serie com construtor.
        Serie serieDoKelvyn = new Serie("Lucifer", 2016);
        serieDoKelvyn.setTemporadas(5);
        serieDoKelvyn.setNumeroDeEpisodios(10);
        serieDoKelvyn.setMinutosPorEpisodio(45);
        serieDoKelvyn.exibeFichaTecnica();   // exibindo a ficha técnica da série

        System.out.println("A duração total da série é: " + serieDoKelvyn.getDuracaoEmMinutos() + " minutos");

        System.out.println("""
                
                --------------------------
                """);

        // instanciando um novo objeto do tipo Filme com construtor
        Filme outroFilme = new Filme("Avatar o ultimo mestre do ar", 2009);
        outroFilme.setDuracaoEmMinutos(162);
        outroFilme.exibeFichaTecnica(); // exibindo a ficha técnica do filme
        System.out.println(
                """
                        
                        --------------------------
                        """
        );


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serieDoKelvyn);
        System.out.println("O tempo total de filmes e Series é: " + calculadora.getTempoTotal() + " minutos");


        FiltroRecomendacao filtro = new FiltroRecomendacao(); // instanciando o filtro
        filtro.filtra(meuFilme);
        Episodio episodio = new Episodio(); // instanciando um episódio
        episodio.setNumero(1);
        episodio.setSerie(serieDoKelvyn);
        episodio.setTotalVisualizacoes(500); // setando o total de visualizações do episódio
        filtro.filtra(episodio);

        // instanciando um novo objeto do tipo Filme com construtor
        Filme filmeDoKelvyn = new Filme("John Wick 4", 2023);
        filmeDoKelvyn.setDuracaoEmMinutos(120); // setando a duração do filme
        filmeDoKelvyn.avalia(9); // avaliando o filme
        System.out.println("""
                
                --------------------------
                """);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();// criação de um ArrayList de filmes
        listaDeFilmes.add(meuFilme);   // adicionando o filme meuFilme ao ArrayList
        listaDeFilmes.add(outroFilme);        // adicionando o filme outroFilme ao ArrayList
        listaDeFilmes.add(filmeDoKelvyn);          // adicionando o filme filmeDoKelvyn ao ArrayList
        System.out.println("A lista de filmes tem " + listaDeFilmes.size() + " filmes"); // exibindo o tamanho do ArrayList
        System.out.println("O primeiro filme da lista é: " + listaDeFilmes.get(0).toString()); // exibindo o primeiro filme da lista
        System.out.println(listaDeFilmes); // exibindo a lista de filmes
        System.out.println("""
                
                --------------------------
                """);

    }


}
