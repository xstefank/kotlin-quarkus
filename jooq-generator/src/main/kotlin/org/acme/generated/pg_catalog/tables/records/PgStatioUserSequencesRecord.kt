/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatioUserSequences
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatioUserSequencesRecord() : TableRecordImpl<PgStatioUserSequencesRecord>(PgStatioUserSequences.PG_STATIO_USER_SEQUENCES) {

    open var relid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var schemaname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var relname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var blksRead: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var blksHit: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    /**
     * Create a detached, initialised PgStatioUserSequencesRecord
     */
    constructor(relid: Long? = null, schemaname: String? = null, relname: String? = null, blksRead: Long? = null, blksHit: Long? = null): this() {
        this.relid = relid
        this.schemaname = schemaname
        this.relname = relname
        this.blksRead = blksRead
        this.blksHit = blksHit
        resetChangedOnNotNull()
    }
}