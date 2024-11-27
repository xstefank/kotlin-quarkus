/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatistic
import org.jooq.Record3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatisticRecord() : UpdatableRecordImpl<PgStatisticRecord>(PgStatistic.PG_STATISTIC) {

    open var starelid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var staattnum: Short?
        set(value): Unit = set(1, value)
        get(): Short? = get(1) as Short?

    open var stainherit: Boolean?
        set(value): Unit = set(2, value)
        get(): Boolean? = get(2) as Boolean?

    open var stanullfrac: Float?
        set(value): Unit = set(3, value)
        get(): Float? = get(3) as Float?

    open var stawidth: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var stadistinct: Float?
        set(value): Unit = set(5, value)
        get(): Float? = get(5) as Float?

    open var stakind1: Short?
        set(value): Unit = set(6, value)
        get(): Short? = get(6) as Short?

    open var stakind2: Short?
        set(value): Unit = set(7, value)
        get(): Short? = get(7) as Short?

    open var stakind3: Short?
        set(value): Unit = set(8, value)
        get(): Short? = get(8) as Short?

    open var stakind4: Short?
        set(value): Unit = set(9, value)
        get(): Short? = get(9) as Short?

    open var stakind5: Short?
        set(value): Unit = set(10, value)
        get(): Short? = get(10) as Short?

    open var staop1: Long?
        set(value): Unit = set(11, value)
        get(): Long? = get(11) as Long?

    open var staop2: Long?
        set(value): Unit = set(12, value)
        get(): Long? = get(12) as Long?

    open var staop3: Long?
        set(value): Unit = set(13, value)
        get(): Long? = get(13) as Long?

    open var staop4: Long?
        set(value): Unit = set(14, value)
        get(): Long? = get(14) as Long?

    open var staop5: Long?
        set(value): Unit = set(15, value)
        get(): Long? = get(15) as Long?

    open var stacoll1: Long?
        set(value): Unit = set(16, value)
        get(): Long? = get(16) as Long?

    open var stacoll2: Long?
        set(value): Unit = set(17, value)
        get(): Long? = get(17) as Long?

    open var stacoll3: Long?
        set(value): Unit = set(18, value)
        get(): Long? = get(18) as Long?

    open var stacoll4: Long?
        set(value): Unit = set(19, value)
        get(): Long? = get(19) as Long?

    open var stacoll5: Long?
        set(value): Unit = set(20, value)
        get(): Long? = get(20) as Long?

    open var stanumbers1: Array<Float?>?
        set(value): Unit = set(21, value)
        get(): Array<Float?>? = get(21) as Array<Float?>?

    open var stanumbers2: Array<Float?>?
        set(value): Unit = set(22, value)
        get(): Array<Float?>? = get(22) as Array<Float?>?

    open var stanumbers3: Array<Float?>?
        set(value): Unit = set(23, value)
        get(): Array<Float?>? = get(23) as Array<Float?>?

    open var stanumbers4: Array<Float?>?
        set(value): Unit = set(24, value)
        get(): Array<Float?>? = get(24) as Array<Float?>?

    open var stanumbers5: Array<Float?>?
        set(value): Unit = set(25, value)
        get(): Array<Float?>? = get(25) as Array<Float?>?

    open var stavalues1: Array<Any?>?
        set(value): Unit = set(26, value)
        get(): Array<Any?>? = get(26) as Array<Any?>?

    open var stavalues2: Array<Any?>?
        set(value): Unit = set(27, value)
        get(): Array<Any?>? = get(27) as Array<Any?>?

    open var stavalues3: Array<Any?>?
        set(value): Unit = set(28, value)
        get(): Array<Any?>? = get(28) as Array<Any?>?

    open var stavalues4: Array<Any?>?
        set(value): Unit = set(29, value)
        get(): Array<Any?>? = get(29) as Array<Any?>?

    open var stavalues5: Array<Any?>?
        set(value): Unit = set(30, value)
        get(): Array<Any?>? = get(30) as Array<Any?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record3<Long?, Short?, Boolean?> = super.key() as Record3<Long?, Short?, Boolean?>

    /**
     * Create a detached, initialised PgStatisticRecord
     */
    constructor(starelid: Long? = null, staattnum: Short? = null, stainherit: Boolean? = null, stanullfrac: Float? = null, stawidth: Int? = null, stadistinct: Float? = null, stakind1: Short? = null, stakind2: Short? = null, stakind3: Short? = null, stakind4: Short? = null, stakind5: Short? = null, staop1: Long? = null, staop2: Long? = null, staop3: Long? = null, staop4: Long? = null, staop5: Long? = null, stacoll1: Long? = null, stacoll2: Long? = null, stacoll3: Long? = null, stacoll4: Long? = null, stacoll5: Long? = null, stanumbers1: Array<Float?>? = null, stanumbers2: Array<Float?>? = null, stanumbers3: Array<Float?>? = null, stanumbers4: Array<Float?>? = null, stanumbers5: Array<Float?>? = null, stavalues1: Array<Any?>? = null, stavalues2: Array<Any?>? = null, stavalues3: Array<Any?>? = null, stavalues4: Array<Any?>? = null, stavalues5: Array<Any?>? = null): this() {
        this.starelid = starelid
        this.staattnum = staattnum
        this.stainherit = stainherit
        this.stanullfrac = stanullfrac
        this.stawidth = stawidth
        this.stadistinct = stadistinct
        this.stakind1 = stakind1
        this.stakind2 = stakind2
        this.stakind3 = stakind3
        this.stakind4 = stakind4
        this.stakind5 = stakind5
        this.staop1 = staop1
        this.staop2 = staop2
        this.staop3 = staop3
        this.staop4 = staop4
        this.staop5 = staop5
        this.stacoll1 = stacoll1
        this.stacoll2 = stacoll2
        this.stacoll3 = stacoll3
        this.stacoll4 = stacoll4
        this.stacoll5 = stacoll5
        this.stanumbers1 = stanumbers1
        this.stanumbers2 = stanumbers2
        this.stanumbers3 = stanumbers3
        this.stanumbers4 = stanumbers4
        this.stanumbers5 = stanumbers5
        this.stavalues1 = stavalues1
        this.stavalues2 = stavalues2
        this.stavalues3 = stavalues3
        this.stavalues4 = stavalues4
        this.stavalues5 = stavalues5
        resetChangedOnNotNull()
    }
}