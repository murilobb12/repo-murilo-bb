package br.com.murilo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.*;



@QuarkusTest
public class AnimalResourceTest {


    @Test
    public void testGetAll(){

        given()
                .when()
                .get("/animais")
                .then()
                .statusCode(200)
                .body("size()", is(2), "id", hasItems(1,2));
    }



}
