package services;

import com.google.gson.Gson;
import model.LibroDTO;
import model.ListaLibros;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    public LibroDTO obtenerLibros(String url){
        System.out.println(url);
        String json;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();
            Gson gson = new Gson();
            ListaLibros datos = gson.fromJson(json,ListaLibros.class);
            System.out.println(datos.results().get(0));
            return datos.results().get(0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
