import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String apiKey= ApiKey.apiKey;
        String uriTop150= "https://imdb-api.com/en/API/Top250Movies/"+ apiKey;



      String top150Json= getJsonBody(uriTop150);
      top150Json= getMoviesList(top150Json);
      System.out.println(top150Json);

        /* final var json= top150Json;
        final var objectMapper = new ObjectMapper();

        final var movies = objectMapper.readValue(json, new TypeReference<Movie>() {});

        System.out.println(movies.getTitle());*/


        }

        private static String getMoviesList(String json) throws JsonProcessingException {

            final var objectMapper = new ObjectMapper();
            final var imdbItems = objectMapper.readValue(json, ImdbBody.class);
            return imdbItems.getItems();

        }



        public static String getJsonBody(String uriRequestedString)throws IOException, InterruptedException{
            URI uriRequested= URI.create(uriRequestedString);
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request= HttpRequest.newBuilder()
                    .uri(uriRequested)
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());



            return response.body();

        }


       /*
        https://imdb-api.com/en/API/Search/k_y8kogbt5/{Inception 2010}
        OkHttpClient client = new OkHttpClient().newBuilder()

                .build();

        Request request = new Request.Builder()

                .url("https://imdb-api.com/en/API/Title/k_1234567/tt1832382")

                .method("GET", null)

                .build();

        Response response = client.newCall(request).execute();*/
    }
