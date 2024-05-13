import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConsultaTasaCambio {


    public double consultarAPI(String moneda1, String moneda2, double valorUsuario) throws IOException, InterruptedException{

        String url = "https://v6.exchangerate-api.com/v6/66c8e0e19b8f74d8954e58ec/pair/"+moneda1+"/"+moneda2;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, BodyHandlers.ofString());

        Gson gson = new GsonBuilder().create();

        Moneda moneda = gson.fromJson(response.body(), Moneda.class);

        return (valorUsuario * moneda.conversion_rate());

        
    }

}
