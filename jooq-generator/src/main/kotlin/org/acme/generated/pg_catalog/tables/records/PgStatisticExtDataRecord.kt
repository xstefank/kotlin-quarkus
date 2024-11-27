/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatisticExtData
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatisticExtDataRecord() : UpdatableRecordImpl<PgStatisticExtDataRecord>(PgStatisticExtData.PG_STATISTIC_EXT_DATA) {

    open var stxoid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var stxdndistinct: Any?
        set(value): Unit = set(1, value)
        get(): Any? = get(1) as Any?

    open var stxddependencies: Any?
        set(value): Unit = set(2, value)
        get(): Any? = get(2) as Any?

    open var stxdmcv: Any?
        set(value): Unit = set(3, value)
        get(): Any? = get(3) as Any?

    open var stxdexpr: Array<PgStatisticRecord?>?
        set(value): Unit = set(4, value)
        get(): Array<PgStatisticRecord?>? = get(4) as Array<PgStatisticRecord?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgStatisticExtDataRecord
     */
    constructor(stxoid: Long? = null, stxdndistinct: Any? = null, stxddependencies: Any? = null, stxdmcv: Any? = null, stxdexpr: Array<PgStatisticRecord?>? = null): this() {
        this.stxoid = stxoid
        this.stxdndistinct = stxdndistinct
        this.stxddependencies = stxddependencies
        this.stxdmcv = stxdmcv
        this.stxdexpr = stxdexpr
        resetChangedOnNotNull()
    }
}
