import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

public class LocalTest {
    @Test
    public void test1(){
        RestAssured.baseURI = "https://reqres.in/api/users";

        given().
                queryParam("page",2)
                .body("")
                .when()
                .get()
                .then().log().all()
                .assertThat().statusCode(200)
                .body("page",equalTo(2));

    }

    @Test
    public void createTest2(){
        RestAssured.baseURI = "https://reqres.in/api/users";

        String tbody = "{\n" +
                "  \"name\": \"morpheus\",\n" +
                "  \"job\": \"leader\"\n" +
                "}";

        given().body(tbody)
                .when()
                .post()
                .then().log().all()
                .assertThat()
                .statusCode(201)
                .body("id", is(notNullValue()));
    }

}
