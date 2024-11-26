package org.acme

import io.quarkus.mongodb.panache.common.MongoEntity
import io.quarkus.mongodb.panache.kotlin.PanacheMongoEntityBase
import org.bson.types.ObjectId

@MongoEntity(collection = "persons")
data class Person(
    var id: ObjectId? = null,
    var name: String,
    var surname: String,
    var age: Int
) : PanacheMongoEntityBase() {
    constructor(): this(null, "", "", 0)
}