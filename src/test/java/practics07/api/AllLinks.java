package practics07.api;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class AllLinks {

    public String baseUrl = "https://swapi.dev/api/";

    /*@Test
    public void nameTest() throws ClientProtocolException, IOException {
        HttpClient client = HttpClientBuilder.create().build();

        HttpGet request = new HttpGet(baseUrl);
        request.addHeader("Accept", "application/json");

        //Execute stage
        HttpResponse response = client.execute(request);

        String allInOneLine = EntityUtils.toString(response.getEntity());

        System.out.println("-------------");
        System.out.println(allInOneLine);
        System.out.println("-------------");

        String[] arrayLinks = allInOneLine.split(",");
    }*/

}