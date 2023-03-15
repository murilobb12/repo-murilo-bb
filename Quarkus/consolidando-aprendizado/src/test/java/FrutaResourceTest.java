import br.com.murilo.resource.FrutaResource;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@QuarkusTest
@TestHTTPEndpoint(FrutaResource.class)
public class FrutaResourceTest {


    @Order(2)
    @Test
    public void listAllFruits() {

        Response response = given()
                .contentType(MediaType.APPLICATION_JSON)
                .when()
                .get()
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("Banana", response.jsonPath().getString("nome[0]"));


    }


    @Order(1)
    @Test
    public void insertFruitTest() {

        String requestBody = "{\"nome\":\"Banana\",\t\"peso\": 2}";

        Response response = given()
                .header("Content-type", "application/json")
                .body(requestBody)
                .when()
                .post()
                .then()
                .extract().response();

        Assertions.assertEquals(201, response.statusCode());
        Assertions.assertEquals("Banana", response.jsonPath().getString("nome"));
        Assertions.assertEquals(2L, response.jsonPath().getLong("peso"));


    }


//    @BeforeAll
//    public void inicializar(){
//
//        Fruta fruta = new Fruta(1L,"Melancia", 5L);
//
//        repository.persist(fruta);
//
//
//    }

}
