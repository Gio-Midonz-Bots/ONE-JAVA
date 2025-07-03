package br.com.POOalura.ViaCep;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco buscarEndereco(String cep){
    URI enderero =URI.create("https://viacep.com.br/ws/" + cep + "/json");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(enderero)
                .build();


        HttpResponse<String> response = null;
        try{
           response = HttpClient
                   .newHttpClient()
                   .send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e){
            throw new RuntimeException("Não conseguir obter o endereço a partir desse CEP");
        }

        return new Gson().fromJson(response.body(), Endereco.class);
    }
}
