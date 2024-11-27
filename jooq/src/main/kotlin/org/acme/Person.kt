package org.acme

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.persistence.Entity

@Entity
data class Person(
    var firstName: String = "",
    var lastName: String = "",
    var age: Int = 0)
    : PanacheEntity()