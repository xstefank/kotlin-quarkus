package org.acme

import io.quarkus.test.junit.QuarkusIntegrationTest
import io.quarkus.logging.Log
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusIntegrationTest
class GreetingResourceIT : GreetingResourceTest() {
    @Test
    fun testHelloEndpoint2() {
        Log.error("Running 2 " + javaClass.name)
        given()
            .`when`().get("/hello")
            .then()
            .statusCode(200)
            .body(`is`("Hello from Quarkus REST"))
    }

}
