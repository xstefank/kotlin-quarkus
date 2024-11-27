/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgGetReplicationSlots
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgGetReplicationSlotsRecord() : TableRecordImpl<PgGetReplicationSlotsRecord>(PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS) {

    open var slotName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var plugin: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var slotType: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var datoid: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var temporary: Boolean?
        set(value): Unit = set(4, value)
        get(): Boolean? = get(4) as Boolean?

    open var active: Boolean?
        set(value): Unit = set(5, value)
        get(): Boolean? = get(5) as Boolean?

    open var activePid: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var xmin: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var catalogXmin: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var restartLsn: Any?
        set(value): Unit = set(9, value)
        get(): Any? = get(9) as Any?

    open var confirmedFlushLsn: Any?
        set(value): Unit = set(10, value)
        get(): Any? = get(10) as Any?

    open var walStatus: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var safeWalSize: Long?
        set(value): Unit = set(12, value)
        get(): Long? = get(12) as Long?

    open var twoPhase: Boolean?
        set(value): Unit = set(13, value)
        get(): Boolean? = get(13) as Boolean?

    /**
     * Create a detached, initialised PgGetReplicationSlotsRecord
     */
    constructor(slotName: String? = null, plugin: String? = null, slotType: String? = null, datoid: Long? = null, temporary: Boolean? = null, active: Boolean? = null, activePid: Int? = null, xmin: Long? = null, catalogXmin: Long? = null, restartLsn: Any? = null, confirmedFlushLsn: Any? = null, walStatus: String? = null, safeWalSize: Long? = null, twoPhase: Boolean? = null): this() {
        this.slotName = slotName
        this.plugin = plugin
        this.slotType = slotType
        this.datoid = datoid
        this.temporary = temporary
        this.active = active
        this.activePid = activePid
        this.xmin = xmin
        this.catalogXmin = catalogXmin
        this.restartLsn = restartLsn
        this.confirmedFlushLsn = confirmedFlushLsn
        this.walStatus = walStatus
        this.safeWalSize = safeWalSize
        this.twoPhase = twoPhase
        resetChangedOnNotNull()
    }
}
