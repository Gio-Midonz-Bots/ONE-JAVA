package br.com.POOalura.ViaCep;

public class Principal {
    public static void main(String[] args) {

        ConsultaCep colsuta = new ConsultaCep();
        Endereco novo = colsuta.buscarEndereco("01001000");
        System.out.println(novo);
    }
}
