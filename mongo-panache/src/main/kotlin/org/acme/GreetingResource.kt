package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/")
class GreetingResource(var personRepository: PersonRepository) {

    @GET
    @Path("/persist")
    fun hello() {
        val person = Person(null, "Tony", "Stark", 40)
        personRepository.persist(person)

        println("Person id = ${person.id}")

        "Hello from Quarkus REST"
    }

    @GET
    fun getPeople() = personRepository.listAll()
}