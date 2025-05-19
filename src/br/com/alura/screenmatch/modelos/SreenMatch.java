package br.com.alura.screenmatch.modelos;

public class SreenMatch {
    public static void main(String[] args) {
        Serie serie = new Serie();
        Filme filme = new Filme();

        filme.setNome("Alto da Compadecida ");
        filme.setDiretor("Ariano Suassuna");
        filme.setAnoDeLancamento(2000);
        filme.setDuracaoEmMinutos(158);
        filme.setIncluidoNoPlano(true);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(8.5);
        filme.avalia(9.3);

        System.out.println("A avaliação do Filme: " + filme.getTotalDeAvaliacoes());
        System.out.println("-----------------------------------------------" );

        serie.setNome("Game of Thrones");
        serie.setIncluidoNoPlano(true);
        serie.setAnoDeLancamento(2011);
        serie.setEpsodiosPorTemporadas(10);
        serie.setTemporadas(8);
        serie.setMinutosPorEpisodio(92);

        //serie.exibeFichaTecnica();
        System.out.println(serie.toString());

    }
}

