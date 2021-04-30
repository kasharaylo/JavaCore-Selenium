package practics07.api;
import static io.restassured.RestAssured.*;

import com.google.gson.Gson;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import practics07.models.PlanetModel;

public class PlanetWithRestAssured {

    public String baseUrl = "https://swapi.dev/api/planets/2/";

    @Test
    public void PlanetTwoTest() {
        String jsonBody =
                given()
                        .accept("application/json")
                .when()
                        .get(baseUrl)
                .then()
                        .assertThat()
                        .statusCode(HttpStatus.SC_OK)
                        .extract()
                        .asString();
        //PlanetModel planet = new Gson().fromJson(jsonBody.PlanetModel.class);

        //Assert.assertEquals(planet.getPopulation(), "20000000");
    }
}
