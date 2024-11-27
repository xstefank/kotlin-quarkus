package org.acme

import jakarta.transaction.Transactional
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.jooq.DSLContext

@Path("/")
class GreetingResource(var dsl: DSLContext) {

    @GET
    @Transactional
    fun hello(): String {
        val person = Person("Tony", "Stark", 40)
        person.persist()
        return "Hello from Quarkus REST"
    }

    @GET
    @Path("/jooq")
    fun jooq() {
        val fetch = dsl.select()
            .from("person")
            .fetch()

        println(fetch)
    }
}