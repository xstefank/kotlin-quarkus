/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.tables.PgStatBgwriter
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatBgwriterRecord() : TableRecordImpl<PgStatBgwriterRecord>(PgStatBgwriter.PG_STAT_BGWRITER) {

    open var checkpointsTimed: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var checkpointsReq: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var checkpointWriteTime: Double?
        set(value): Unit = set(2, value)
        get(): Double? = get(2) as Double?

    open var checkpointSyncTime: Double?
        set(value): Unit = set(3, value)
        get(): Double? = get(3) as Double?

    open var buffersCheckpoint: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var buffersClean: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var maxwrittenClean: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var buffersBackend: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var buffersBackendFsync: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var buffersAlloc: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    open var statsReset: OffsetDateTime?
        set(value): Unit = set(10, value)
        get(): OffsetDateTime? = get(10) as OffsetDateTime?

    /**
     * Create a detached, initialised PgStatBgwriterRecord
     */
    constructor(checkpointsTimed: Long? = null, checkpointsReq: Long? = null, checkpointWriteTime: Double? = null, checkpointSyncTime: Double? = null, buffersCheckpoint: Long? = null, buffersClean: Long? = null, maxwrittenClean: Long? = null, buffersBackend: Long? = null, buffersBackendFsync: Long? = null, buffersAlloc: Long? = null, statsReset: OffsetDateTime? = null): this() {
        this.checkpointsTimed = checkpointsTimed
        this.checkpointsReq = checkpointsReq
        this.checkpointWriteTime = checkpointWriteTime
        this.checkpointSyncTime = checkpointSyncTime
        this.buffersCheckpoint = buffersCheckpoint
        this.buffersClean = buffersClean
        this.maxwrittenClean = maxwrittenClean
        this.buffersBackend = buffersBackend
        this.buffersBackendFsync = buffersBackendFsync
        this.buffersAlloc = buffersAlloc
        this.statsReset = statsReset
        resetChangedOnNotNull()
    }
}