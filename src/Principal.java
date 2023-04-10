import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal { // classe principal
    public static void main(String[] args) {
        // Referência ao objeto br.com.alura.screenmatch.modelo.Filme.

        Filme meuFilme = new Filme();

        //instanciação do objeto br.com.alura.screenmatch.modelo.Filme.
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
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

        Serie lucifer = new Serie();
        lucifer.setNome("Lucifer");
        lucifer.setAnoDeLancamento(2016);
        lucifer.setTemporadas(5);
        lucifer.setNumeroDeEpisodios(10);
        lucifer.setMinutosPorEpisodio(45);
        lucifer.exibeFichaTecnica();

        System.out.println("A duração total da série é: " + lucifer.getDuracaoEmMinutos() + " minutos");

        System.out.println("""
                
                --------------------------
                """);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar o último mestre do ar");
        outroFilme.setAnoDeLancamento(2009);
        outroFilme.setDuracaoEmMinutos(162);
        outroFilme.exibeFichaTecnica();
        System.out.println(
                """
                        
                        --------------------------
                        """
        );


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lucifer);
        System.out.println("O tempo total de filmes e Series é: " + calculadora.getTempoTotal() + " minutos");


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lucifer);
        episodio.setTotalVisualizacoes(500);
        filtro.filtra(episodio);
    }
}
