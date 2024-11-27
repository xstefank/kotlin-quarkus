/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.tables.PgStatActivity
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatActivityRecord() : TableRecordImpl<PgStatActivityRecord>(PgStatActivity.PG_STAT_ACTIVITY) {

    open var datid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var datname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var pid: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var leaderPid: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var usesysid: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var usename: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var applicationName: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var clientAddr: Any?
        set(value): Unit = set(7, value)
        get(): Any? = get(7) as Any?

    open var clientHostname: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var clientPort: Int?
        set(value): Unit = set(9, value)
        get(): Int? = get(9) as Int?

    open var backendStart: OffsetDateTime?
        set(value): Unit = set(10, value)
        get(): OffsetDateTime? = get(10) as OffsetDateTime?

    open var xactStart: OffsetDateTime?
        set(value): Unit = set(11, value)
        get(): OffsetDateTime? = get(11) as OffsetDateTime?

    open var queryStart: OffsetDateTime?
        set(value): Unit = set(12, value)
        get(): OffsetDateTime? = get(12) as OffsetDateTime?

    open var stateChange: OffsetDateTime?
        set(value): Unit = set(13, value)
        get(): OffsetDateTime? = get(13) as OffsetDateTime?

    open var waitEventType: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var waitEvent: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var state: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var backendXid: Long?
        set(value): Unit = set(17, value)
        get(): Long? = get(17) as Long?

    open var backendXmin: Long?
        set(value): Unit = set(18, value)
        get(): Long? = get(18) as Long?

    open var queryId: Long?
        set(value): Unit = set(19, value)
        get(): Long? = get(19) as Long?

    open var query: String?
        set(value): Unit = set(20, value)
        get(): String? = get(20) as String?

    open var backendType: String?
        set(value): Unit = set(21, value)
        get(): String? = get(21) as String?

    /**
     * Create a detached, initialised PgStatActivityRecord
     */
    constructor(datid: Long? = null, datname: String? = null, pid: Int? = null, leaderPid: Int? = null, usesysid: Long? = null, usename: String? = null, applicationName: String? = null, clientAddr: Any? = null, clientHostname: String? = null, clientPort: Int? = null, backendStart: OffsetDateTime? = null, xactStart: OffsetDateTime? = null, queryStart: OffsetDateTime? = null, stateChange: OffsetDateTime? = null, waitEventType: String? = null, waitEvent: String? = null, state: String? = null, backendXid: Long? = null, backendXmin: Long? = null, queryId: Long? = null, query: String? = null, backendType: String? = null): this() {
        this.datid = datid
        this.datname = datname
        this.pid = pid
        this.leaderPid = leaderPid
        this.usesysid = usesysid
        this.usename = usename
        this.applicationName = applicationName
        this.clientAddr = clientAddr
        this.clientHostname = clientHostname
        this.clientPort = clientPort
        this.backendStart = backendStart
        this.xactStart = xactStart
        this.queryStart = queryStart
        this.stateChange = stateChange
        this.waitEventType = waitEventType
        this.waitEvent = waitEvent
        this.state = state
        this.backendXid = backendXid
        this.backendXmin = backendXmin
        this.queryId = queryId
        this.query = query
        this.backendType = backendType
        resetChangedOnNotNull()
    }
}