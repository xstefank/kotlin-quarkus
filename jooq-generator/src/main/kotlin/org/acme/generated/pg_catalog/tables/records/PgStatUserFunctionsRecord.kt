/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatUserFunctions
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatUserFunctionsRecord() : TableRecordImpl<PgStatUserFunctionsRecord>(PgStatUserFunctions.PG_STAT_USER_FUNCTIONS) {

    open var funcid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var schemaname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var funcname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var calls: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var totalTime: Double?
        set(value): Unit = set(4, value)
        get(): Double? = get(4) as Double?

    open var selfTime: Double?
        set(value): Unit = set(5, value)
        get(): Double? = get(5) as Double?

    /**
     * Create a detached, initialised PgStatUserFunctionsRecord
     */
    constructor(funcid: Long? = null, schemaname: String? = null, funcname: String? = null, calls: Long? = null, totalTime: Double? = null, selfTime: Double? = null): this() {
        this.funcid = funcid
        this.schemaname = schemaname
        this.funcname = funcname
        this.calls = calls
        this.totalTime = totalTime
        this.selfTime = selfTime
        resetChangedOnNotNull()
    }
}
