package practics07;

import com.google.gson.Gson;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class ResponseCode {

    public static void main(String[] args) throws ClientProtocolException, IOException {

        //String url = String.format("http://httpstat.us/%d" , 502);
        /*String urlOld = "http://httpstat.us/201";

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(urlOld);
        request.addHeader("Accept", "application/json");

        //Execute stage
        HttpResponse response = client.execute(request);

        InputStreamReader streamReader = new InputStreamReader(response.getEntity().getContent());
        StatusCodeModel currentCode = new Gson().fromJson(streamReader, StatusCodeModel.class);

        System.out.println(currentCode);
        System.out.println(currentCode.getDescription());
        System.out.println(currentCode.getCode());
        System.out.println(currentCode.getCode()==401);*/
    }
}
