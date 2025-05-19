package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int epsodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsodiosPorTemporadas() {
        return epsodiosPorTemporadas;
    }

    public void setEpsodiosPorTemporadas(int epsodiosPorTemporadas) {
        this.epsodiosPorTemporadas = epsodiosPorTemporadas;
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

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiosPorTemporadas * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Nome do Série:" + getNome() +
                "\nAno de lançamento: " + getAnoDeLancamento()+
                "\nQuantidade de Temporadas: " + temporadas+
                "\nEpsodios por temporadas: " + epsodiosPorTemporadas +
                "\nMinutos por episodios: " + minutosPorEpisodio +
                "\nDuração em minutos: " + getDuracaoEmMinutos();

    }
}
