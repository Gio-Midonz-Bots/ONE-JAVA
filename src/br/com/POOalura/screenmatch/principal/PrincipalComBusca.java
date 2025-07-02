package br.com.POOalura.screenmatch.principal;

import br.com.POOalura.screenmatch.modelos.TituloOmdB;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = sc.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=e0966007";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json);
        System.out.println(response.body());
        Gson gson = new Gson();
        //Titulo meuTitilo = gson.fromJson(json, Titulo.class);
        TituloOmdB meuTitilo = gson.fromJson(json, TituloOmdB.class);
        System.out.println( meuTitilo);
    }
}
