/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.CheckConstraints
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CheckConstraintsRecord() : TableRecordImpl<CheckConstraintsRecord>(CheckConstraints.CHECK_CONSTRAINTS) {

    open var constraintCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var constraintSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var constraintName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var checkClause: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    /**
     * Create a detached, initialised CheckConstraintsRecord
     */
    constructor(constraintCatalog: String? = null, constraintSchema: String? = null, constraintName: String? = null, checkClause: String? = null): this() {
        this.constraintCatalog = constraintCatalog
        this.constraintSchema = constraintSchema
        this.constraintName = constraintName
        this.checkClause = checkClause
        resetChangedOnNotNull()
    }
}
