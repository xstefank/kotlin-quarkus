package org.acme

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.bson.Document

@Path("/")
class GreetingResource(var mongoClient: MongoClient) {

    @GET
    @Path("/persist")
    fun hello() {
        val person = Document()
            .append("name", "Tony")
            .append("surname", "Stark")
            .append("age", 40)

        getCollection().insertOne(person)
    }

    @GET
    fun listAll() = getCollection().find().iterator().asSequence().toList()

    fun getCollection(): MongoCollection<Document> = mongoClient.getDatabase("person").getCollection("person")
}