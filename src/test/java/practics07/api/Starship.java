package practics07.api;

import com.google.gson.Gson;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class Starship {

    public int shipId = 9;
    public String baseUrl = "https://swapi.dev/api/";
    public String starship = String.format("starships/&d/", shipId);

    @Test
    public void deathStarTest() throws ClientProtocolException, IOException {
        /*HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(baseUrl + starship);
        request.addHeader("Accept", "application/json");
        HttpResponse response = client,execute(request);

        InputStreamReader streamReader = new InputStreamReader(response.getEntity().getContent());
        StarshipModel starship = new Gson().fromJson(streamReader, StarshipModel.class);

        int statusCode = response.getStatusLine().getStatusCode();
        Assert.assertTrue(statusCode == 200);
        Assert.assertEquals(starship.getName(), "Death Star");

        System.out.println(starship.getCostInCredits());

        System.out.println("*************");
        System.out.println(planet);*/
    }
}
