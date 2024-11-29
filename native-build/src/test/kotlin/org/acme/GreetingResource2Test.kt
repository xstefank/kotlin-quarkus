package org.acme

import io.quarkus.logging.Log
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

//@QuarkusTest
class GreetingResource2Test {

    @Test
    fun testHelloEndpoint() {
        Log.error("Running " + javaClass.name)
        given()
          .`when`().get("/hello2")
          .then()
             .statusCode(200)
             .body(`is`("Hello from Quarkus REST"))
    }

}