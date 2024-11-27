/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatGetProgressInfo
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatGetProgressInfoRecord() : TableRecordImpl<PgStatGetProgressInfoRecord>(PgStatGetProgressInfo.PG_STAT_GET_PROGRESS_INFO) {

    open var pid: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var datid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var relid: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var param1: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var param2: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var param3: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var param4: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var param5: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var param6: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var param7: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    open var param8: Long?
        set(value): Unit = set(10, value)
        get(): Long? = get(10) as Long?

    open var param9: Long?
        set(value): Unit = set(11, value)
        get(): Long? = get(11) as Long?

    open var param10: Long?
        set(value): Unit = set(12, value)
        get(): Long? = get(12) as Long?

    open var param11: Long?
        set(value): Unit = set(13, value)
        get(): Long? = get(13) as Long?

    open var param12: Long?
        set(value): Unit = set(14, value)
        get(): Long? = get(14) as Long?

    open var param13: Long?
        set(value): Unit = set(15, value)
        get(): Long? = get(15) as Long?

    open var param14: Long?
        set(value): Unit = set(16, value)
        get(): Long? = get(16) as Long?

    open var param15: Long?
        set(value): Unit = set(17, value)
        get(): Long? = get(17) as Long?

    open var param16: Long?
        set(value): Unit = set(18, value)
        get(): Long? = get(18) as Long?

    open var param17: Long?
        set(value): Unit = set(19, value)
        get(): Long? = get(19) as Long?

    open var param18: Long?
        set(value): Unit = set(20, value)
        get(): Long? = get(20) as Long?

    open var param19: Long?
        set(value): Unit = set(21, value)
        get(): Long? = get(21) as Long?

    open var param20: Long?
        set(value): Unit = set(22, value)
        get(): Long? = get(22) as Long?

    /**
     * Create a detached, initialised PgStatGetProgressInfoRecord
     */
    constructor(pid: Int? = null, datid: Long? = null, relid: Long? = null, param1: Long? = null, param2: Long? = null, param3: Long? = null, param4: Long? = null, param5: Long? = null, param6: Long? = null, param7: Long? = null, param8: Long? = null, param9: Long? = null, param10: Long? = null, param11: Long? = null, param12: Long? = null, param13: Long? = null, param14: Long? = null, param15: Long? = null, param16: Long? = null, param17: Long? = null, param18: Long? = null, param19: Long? = null, param20: Long? = null): this() {
        this.pid = pid
        this.datid = datid
        this.relid = relid
        this.param1 = param1
        this.param2 = param2
        this.param3 = param3
        this.param4 = param4
        this.param5 = param5
        this.param6 = param6
        this.param7 = param7
        this.param8 = param8
        this.param9 = param9
        this.param10 = param10
        this.param11 = param11
        this.param12 = param12
        this.param13 = param13
        this.param14 = param14
        this.param15 = param15
        this.param16 = param16
        this.param17 = param17
        this.param18 = param18
        this.param19 = param19
        this.param20 = param20
        resetChangedOnNotNull()
    }
}
