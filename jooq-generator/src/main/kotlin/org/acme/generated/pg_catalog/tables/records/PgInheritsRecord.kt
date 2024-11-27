/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgInherits
import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgInheritsRecord() : UpdatableRecordImpl<PgInheritsRecord>(PgInherits.PG_INHERITS) {

    open var inhrelid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var inhparent: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var inhseqno: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var inhdetachpending: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Long?, Int?> = super.key() as Record2<Long?, Int?>

    /**
     * Create a detached, initialised PgInheritsRecord
     */
    constructor(inhrelid: Long? = null, inhparent: Long? = null, inhseqno: Int? = null, inhdetachpending: Boolean? = null): this() {
        this.inhrelid = inhrelid
        this.inhparent = inhparent
        this.inhseqno = inhseqno
        this.inhdetachpending = inhdetachpending
        resetChangedOnNotNull()
    }
}