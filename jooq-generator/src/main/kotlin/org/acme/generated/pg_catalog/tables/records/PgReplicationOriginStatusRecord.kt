/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgReplicationOriginStatus
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgReplicationOriginStatusRecord() : TableRecordImpl<PgReplicationOriginStatusRecord>(PgReplicationOriginStatus.PG_REPLICATION_ORIGIN_STATUS) {

    open var localId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var externalId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var remoteLsn: Any?
        set(value): Unit = set(2, value)
        get(): Any? = get(2) as Any?

    open var localLsn: Any?
        set(value): Unit = set(3, value)
        get(): Any? = get(3) as Any?

    /**
     * Create a detached, initialised PgReplicationOriginStatusRecord
     */
    constructor(localId: Long? = null, externalId: String? = null, remoteLsn: Any? = null, localLsn: Any? = null): this() {
        this.localId = localId
        this.externalId = externalId
        this.remoteLsn = remoteLsn
        this.localLsn = localLsn
        resetChangedOnNotNull()
    }
}
