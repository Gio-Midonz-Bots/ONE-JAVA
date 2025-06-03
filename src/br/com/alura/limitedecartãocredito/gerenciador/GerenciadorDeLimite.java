package br.com.alura.limitedecartãocredito.gerenciador;

import br.com.alura.limitedecartãocredito.model.Cartao;

import java.util.ArrayList;

public class GerenciadorDeLimite {
    ArrayList<Cartao> lista = new ArrayList();

    public double visualizarLimite(double limite) {

        for (Cartao i : lista) {
            System.out.println(i.getLimite());
        }
        return limite;
    }

}
