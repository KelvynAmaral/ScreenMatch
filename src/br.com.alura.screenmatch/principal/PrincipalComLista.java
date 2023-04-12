package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar o ultimo mestre do ar", 2009);
        outroFilme.avalia(6);
        Filme filmeDoKelvyn = new Filme("John Wick 4", 2023);
        filmeDoKelvyn.avalia(10);
        Serie serieDoKelvyn = new Serie("Lucifer", 2016);
        serieDoKelvyn.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();// criação de um ArrayList de filmes
        lista.add(meuFilme);   // adicionando o filme meuFilme ao ArrayList
        lista.add(outroFilme);        // adicionando o filme outroFilme ao ArrayList
        lista.add(filmeDoKelvyn);          // adicionando o filme filmeDoKelvyn ao ArrayList
        lista.add(serieDoKelvyn);          // adicionando o filme serieDoKelvyn ao ArrayList
        for (Titulo item: lista) {
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
                System.out.println(item.getNome());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>(); // criando uma List de Strings
        buscaPorArtista.add("Keanu Reeves");
        buscaPorArtista.add("Tom Cruise");
        buscaPorArtista.add("Angelina Jolie");
        buscaPorArtista.add("Scarlett Johansson");
        System.out.println(buscaPorArtista); // exibindo a lista de artistas

        Collections.sort(buscaPorArtista); // ordenando a lista de A - Z
        System.out.println("Artistas: " + buscaPorArtista);
        System.out.println("lista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("lista de titulos ordenados por ano de lançamento: ");
        System.out.println(lista);

    }
}

