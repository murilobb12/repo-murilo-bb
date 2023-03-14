import br.com.murilo.model.Fruta;
import br.com.murilo.repository.FrutaRepository;
import br.com.murilo.resource.FrutaResource;
import io.quarkus.test.Mock;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(FrutaResource.class)
public class FrutaResourceTest {

//    @Mock
//    FrutaRepository repository;


    @Test
    public void listAllFruits(){
        given()
                .when()
                .get()
                .then()
                .statusCode(200);
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
