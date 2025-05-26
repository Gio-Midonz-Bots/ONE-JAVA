package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() +
                "\nAno de lançamento: " + this.getAnoDeLancamento() +
                "\nDiretor: " + getDiretor()+
                "\nDuração do filme: " + getDuracaoEmMinutos();
}
