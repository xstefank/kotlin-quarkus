/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgLogicalSlotPeekChanges
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLogicalSlotPeekChangesRecord() : TableRecordImpl<PgLogicalSlotPeekChangesRecord>(PgLogicalSlotPeekChanges.PG_LOGICAL_SLOT_PEEK_CHANGES) {

    open var lsn: Any?
        set(value): Unit = set(0, value)
        get(): Any? = get(0) as Any?

    open var xid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var `data`: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    /**
     * Create a detached, initialised PgLogicalSlotPeekChangesRecord
     */
    constructor(lsn: Any? = null, xid: Long? = null, `data`: String? = null): this() {
        this.lsn = lsn
        this.xid = xid
        this.`data` = `data`
        resetChangedOnNotNull()
    }
}
