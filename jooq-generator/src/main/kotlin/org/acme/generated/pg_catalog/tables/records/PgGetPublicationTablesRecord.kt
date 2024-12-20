/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgGetPublicationTables
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgGetPublicationTablesRecord() : TableRecordImpl<PgGetPublicationTablesRecord>(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES) {

    open var relid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    /**
     * Create a detached, initialised PgGetPublicationTablesRecord
     */
    constructor(relid: Long? = null): this() {
        this.relid = relid
        resetChangedOnNotNull()
    }
}
