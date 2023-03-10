package br.com.murilo;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
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

    @Test
    public void testIdNaoEncontrado(){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/animais/3")
                .then()
                .extract().response();

        Assertions.assertEquals(404, response.statusCode());

    }

    @Test
    public void testIdExistente(){
        given()
                .when().get("/animais/1")
                .then()
                .statusCode(200);
    }


    @Test
    public void testAtualizarNomeAnimal(){
        given().header("Content-type", "application/json")
                .body("{\n\t\"nome\":\"Tigre\"")
                .when().put("animais/1")
                .then()
                .statusCode(200);
    }


}
