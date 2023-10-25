package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import jakarta.ws.rs.core.Response;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class CheckOpenApiTest {

    private final String RESOURCE = "/q/openapi";

    @Test
    void checkOpenApi() throws Exception {
        String result = given().get(RESOURCE)
                .then()
                .log().ifValidationFails()
                .statusCode(Response.Status.OK.getStatusCode())
                .extract()
                .response().asString();
        assertThat(result, containsString("VALUE_ONE"));
        assertThat(result, containsString("VALUE_TWO"));
        assertThat(result, containsString("VALUE_THREE"));
        assertThat(result, containsString("description: A special Enum"));
    }

}
