/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.tables.PgStatSubscription
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatSubscriptionRecord() : TableRecordImpl<PgStatSubscriptionRecord>(PgStatSubscription.PG_STAT_SUBSCRIPTION) {

    open var subid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var subname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var pid: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var relid: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var receivedLsn: Any?
        set(value): Unit = set(4, value)
        get(): Any? = get(4) as Any?

    open var lastMsgSendTime: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    open var lastMsgReceiptTime: OffsetDateTime?
        set(value): Unit = set(6, value)
        get(): OffsetDateTime? = get(6) as OffsetDateTime?

    open var latestEndLsn: Any?
        set(value): Unit = set(7, value)
        get(): Any? = get(7) as Any?

    open var latestEndTime: OffsetDateTime?
        set(value): Unit = set(8, value)
        get(): OffsetDateTime? = get(8) as OffsetDateTime?

    /**
     * Create a detached, initialised PgStatSubscriptionRecord
     */
    constructor(subid: Long? = null, subname: String? = null, pid: Int? = null, relid: Long? = null, receivedLsn: Any? = null, lastMsgSendTime: OffsetDateTime? = null, lastMsgReceiptTime: OffsetDateTime? = null, latestEndLsn: Any? = null, latestEndTime: OffsetDateTime? = null): this() {
        this.subid = subid
        this.subname = subname
        this.pid = pid
        this.relid = relid
        this.receivedLsn = receivedLsn
        this.lastMsgSendTime = lastMsgSendTime
        this.lastMsgReceiptTime = lastMsgReceiptTime
        this.latestEndLsn = latestEndLsn
        this.latestEndTime = latestEndTime
        resetChangedOnNotNull()
    }
}