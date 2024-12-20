/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgTablespaceDatabases
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgTablespaceDatabasesRecord() : TableRecordImpl<PgTablespaceDatabasesRecord>(PgTablespaceDatabases.PG_TABLESPACE_DATABASES) {

    open var pgTablespaceDatabases: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    /**
     * Create a detached, initialised PgTablespaceDatabasesRecord
     */
    constructor(pgTablespaceDatabases: Long? = null): this() {
        this.pgTablespaceDatabases = pgTablespaceDatabases
        resetChangedOnNotNull()
    }
}
