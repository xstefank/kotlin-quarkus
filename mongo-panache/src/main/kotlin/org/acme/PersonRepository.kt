package org.acme

import io.quarkus.mongodb.panache.kotlin.PanacheMongoRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class PersonRepository : PanacheMongoRepository<Person> {
}