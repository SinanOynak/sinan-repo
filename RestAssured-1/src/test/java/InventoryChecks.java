import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
public class InventoryChecks {
    @Test
    public void stockTestGetHealth(){
        given()
                .get("https://inventory-check-service.stockdev.getirapi.com/health")
                .then()
                .statusCode(200)
                .body("status",equalTo("OK"));

    }

    @Test
    public void stockTestGetInventoryCheckHappyPath(){
        given()
                .get("https://inventory-check-service.stockdev.getirapi.com/inventory-checks/6153317ff378a7cd96daef80")
                .then().log().all()
                .statusCode(200)
                .body("_id",equalTo("6153317ff378a7cd96daef80"));

    }

    @Test
    public void stockTestGetInventoryCheckShortId(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .get("https://inventory-check-service.stockdev.getirapi.com/inventory-checks/123456")
                .then().log().all()
                .statusCode(500)
                .body("error",equalTo("ValidationError"));
    }

    @Test
    public void stockTestGetInventoryCheckInvalidId(){
        given()
                .contentType(ContentType.JSON)
                .get("https://inventory-check-service.stockdev.getirapi.com/inventory-checks/123456123456123456123456")
                .then()
                .body("code",equalTo(31203));
    }
}
