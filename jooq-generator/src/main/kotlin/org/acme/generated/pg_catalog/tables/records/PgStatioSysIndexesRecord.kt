/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatioSysIndexes
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatioSysIndexesRecord() : TableRecordImpl<PgStatioSysIndexesRecord>(PgStatioSysIndexes.PG_STATIO_SYS_INDEXES) {

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

    open var idxBlksRead: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var idxBlksHit: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    /**
     * Create a detached, initialised PgStatioSysIndexesRecord
     */
    constructor(relid: Long? = null, indexrelid: Long? = null, schemaname: String? = null, relname: String? = null, indexrelname: String? = null, idxBlksRead: Long? = null, idxBlksHit: Long? = null): this() {
        this.relid = relid
        this.indexrelid = indexrelid
        this.schemaname = schemaname
        this.relname = relname
        this.indexrelname = indexrelname
        this.idxBlksRead = idxBlksRead
        this.idxBlksHit = idxBlksHit
        resetChangedOnNotNull()
    }
}
