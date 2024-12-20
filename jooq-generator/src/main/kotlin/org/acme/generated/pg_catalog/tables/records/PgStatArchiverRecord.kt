/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.tables.PgStatArchiver
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatArchiverRecord() : TableRecordImpl<PgStatArchiverRecord>(PgStatArchiver.PG_STAT_ARCHIVER) {

    open var archivedCount: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var lastArchivedWal: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var lastArchivedTime: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var failedCount: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var lastFailedWal: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var lastFailedTime: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    open var statsReset: OffsetDateTime?
        set(value): Unit = set(6, value)
        get(): OffsetDateTime? = get(6) as OffsetDateTime?

    /**
     * Create a detached, initialised PgStatArchiverRecord
     */
    constructor(archivedCount: Long? = null, lastArchivedWal: String? = null, lastArchivedTime: OffsetDateTime? = null, failedCount: Long? = null, lastFailedWal: String? = null, lastFailedTime: OffsetDateTime? = null, statsReset: OffsetDateTime? = null): this() {
        this.archivedCount = archivedCount
        this.lastArchivedWal = lastArchivedWal
        this.lastArchivedTime = lastArchivedTime
        this.failedCount = failedCount
        this.lastFailedWal = lastFailedWal
        this.lastFailedTime = lastFailedTime
        this.statsReset = statsReset
        resetChangedOnNotNull()
    }
}
