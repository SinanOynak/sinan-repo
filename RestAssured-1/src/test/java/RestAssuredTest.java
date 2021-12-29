import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class RestAssuredTest {
    //testng
    @Test
    public void singleUserBddTest(){
        when()
                .get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .body("data.email",equalTo("janet.weaver@reqres.in"))
                .time(lessThan(10000L)); //1 sn den sonra cevap veriyorsa testi fail et demek
    }

    @Test
    public void singleUserTest() {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("/api/users/2");
        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        System.out.println(bodyAsString);
        Assert.assertTrue(bodyAsString.contains("janet.weaver@reqres.in"), "String did not found");
        //body olmayan bir değeri asserte yazarsa test fail alır.
    }

    @Test
    public void createUserTest() {
        // (ters slash n) bir alt satıra geçmemize yarıyor. (ters slah " ) (") yerine kullanılıyor
        String postData = "{\n" +
                "  \"name\": \"morpheus\",\n" +
                "  \"job\": \"leader\"\n" +
                "}";
        given().
                contentType(ContentType.JSON).
                body(postData).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201).
                body("name", equalTo("morpheus"));
    }

}
