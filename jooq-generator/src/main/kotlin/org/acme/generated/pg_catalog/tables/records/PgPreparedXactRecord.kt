/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.tables.PgPreparedXact
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgPreparedXactRecord() : TableRecordImpl<PgPreparedXactRecord>(PgPreparedXact.PG_PREPARED_XACT) {

    open var transaction: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var gid: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var prepared: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var ownerid: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var dbid: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    /**
     * Create a detached, initialised PgPreparedXactRecord
     */
    constructor(transaction: Long? = null, gid: String? = null, prepared: OffsetDateTime? = null, ownerid: Long? = null, dbid: Long? = null): this() {
        this.transaction = transaction
        this.gid = gid
        this.prepared = prepared
        this.ownerid = ownerid
        this.dbid = dbid
        resetChangedOnNotNull()
    }
}
