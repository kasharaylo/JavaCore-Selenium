package practics07.api;

import com.google.gson.Gson;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import practics07.models.PlanetModel;

import java.io.IOException;
import java.io.InputStreamReader;

public class Planet {

    @Test
    public void nameTest() throws ClientProtocolException, IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        /*HttpGet request = new HttpGet(baseUrl + "planets/2/");
        request.addHeader("Accept", "application/json");

        InputStreamReader streamReader = new InputStreamReader(response.getEntity().getContent());
        PlanetModel planet = new Gson().fromJson(streamReader, PlanetModel.class);

        int statusCode = response.getStatusLine().getStatusCode();
        Assert.assertTrue(statusCode == 200);

        Assert.assertEquals(planet.getName(), "Alderaan");
        Assert.assertEquals(planet.getDiameter(), "12500");
        Assert.assertEquals(planet.getPopulation(), "20000000");
        System.err.println("Population of the planet is: " + planet.getPopulation());

        System.out.println("*************");
        System.out.println(planet);*/
    }
}
