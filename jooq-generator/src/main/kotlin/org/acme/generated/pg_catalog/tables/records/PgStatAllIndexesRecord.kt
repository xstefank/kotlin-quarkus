/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatAllIndexes
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatAllIndexesRecord() : TableRecordImpl<PgStatAllIndexesRecord>(PgStatAllIndexes.PG_STAT_ALL_INDEXES) {

    open var relid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var indexrelid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var schemaname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var relname: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var indexrelname: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var idxScan: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var idxTupRead: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var idxTupFetch: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    /**
     * Create a detached, initialised PgStatAllIndexesRecord
     */
    constructor(relid: Long? = null, indexrelid: Long? = null, schemaname: String? = null, relname: String? = null, indexrelname: String? = null, idxScan: Long? = null, idxTupRead: Long? = null, idxTupFetch: Long? = null): this() {
        this.relid = relid
        this.indexrelid = indexrelid
        this.schemaname = schemaname
        this.relname = relname
        this.indexrelname = indexrelname
        this.idxScan = idxScan
        this.idxTupRead = idxTupRead
        this.idxTupFetch = idxTupFetch
        resetChangedOnNotNull()
    }
}
