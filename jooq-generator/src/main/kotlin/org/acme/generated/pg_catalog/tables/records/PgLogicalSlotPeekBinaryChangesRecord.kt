/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgLogicalSlotPeekBinaryChanges
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLogicalSlotPeekBinaryChangesRecord() : TableRecordImpl<PgLogicalSlotPeekBinaryChangesRecord>(PgLogicalSlotPeekBinaryChanges.PG_LOGICAL_SLOT_PEEK_BINARY_CHANGES) {

    open var lsn: Any?
        set(value): Unit = set(0, value)
        get(): Any? = get(0) as Any?

    open var xid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var `data`: ByteArray?
        set(value): Unit = set(2, value)
        get(): ByteArray? = get(2) as ByteArray?

    /**
     * Create a detached, initialised PgLogicalSlotPeekBinaryChangesRecord
     */
    constructor(lsn: Any? = null, xid: Long? = null, `data`: ByteArray? = null): this() {
        this.lsn = lsn
        this.xid = xid
        this.`data` = `data`
        resetChangedOnNotNull()
    }
}
