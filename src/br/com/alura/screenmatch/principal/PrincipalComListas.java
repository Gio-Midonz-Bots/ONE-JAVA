package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscarPorArtistas = new ArrayList<>();
        buscarPorArtistas.add("Doja Cat");
        buscarPorArtistas.add("Zelia");
        buscarPorArtistas.add("Everton");
        buscarPorArtistas.add("Matheus Reis");
        buscarPorArtistas.add("Giovanna Midonz");
        Collections.sort(buscarPorArtistas);
        for(int i=0; i<buscarPorArtistas.size();i++){
            System.out.println(buscarPorArtistas.get(i));
        }

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("-------DEPOIS de UTILIZAR COMPARATOR-------");
        for (Titulo i: lista) {
            System.out.println(i.toString());
        }
    }
}