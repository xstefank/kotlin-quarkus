/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgIndexes
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgIndexesRecord() : TableRecordImpl<PgIndexesRecord>(PgIndexes.PG_INDEXES) {

    open var schemaname: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tablename: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var indexname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var tablespace: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var indexdef: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    /**
     * Create a detached, initialised PgIndexesRecord
     */
    constructor(schemaname: String? = null, tablename: String? = null, indexname: String? = null, tablespace: String? = null, indexdef: String? = null): this() {
        this.schemaname = schemaname
        this.tablename = tablename
        this.indexname = indexname
        this.tablespace = tablespace
        this.indexdef = indexdef
        resetChangedOnNotNull()
    }
}
