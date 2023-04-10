package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 5) {
            System.out.println("Os preferidos da galera");
        } else if (classificavel.getClassificacao() >= 4) {
            System.out.println("Os mais assistidos da semana");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("recomendados para você");
        }   else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Assista mais tarde");
        } else {
            System.out.println("Talvez possa interessar");
        }
    }
}
