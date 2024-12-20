/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatisticExt
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatisticExtRecord() : UpdatableRecordImpl<PgStatisticExtRecord>(PgStatisticExt.PG_STATISTIC_EXT) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var stxrelid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var stxname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var stxnamespace: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var stxowner: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var stxstattarget: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var stxkeys: Array<Any?>?
        set(value): Unit = set(6, value)
        get(): Array<Any?>? = get(6) as Array<Any?>?

    open var stxkind: Array<String?>?
        set(value): Unit = set(7, value)
        get(): Array<String?>? = get(7) as Array<String?>?

    open var stxexprs: Any?
        set(value): Unit = set(8, value)
        get(): Any? = get(8) as Any?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgStatisticExtRecord
     */
    constructor(oid: Long? = null, stxrelid: Long? = null, stxname: String? = null, stxnamespace: Long? = null, stxowner: Long? = null, stxstattarget: Int? = null, stxkeys: Array<Any?>? = null, stxkind: Array<String?>? = null, stxexprs: Any? = null): this() {
        this.oid = oid
        this.stxrelid = stxrelid
        this.stxname = stxname
        this.stxnamespace = stxnamespace
        this.stxowner = stxowner
        this.stxstattarget = stxstattarget
        this.stxkeys = stxkeys
        this.stxkind = stxkind
        this.stxexprs = stxexprs
        resetChangedOnNotNull()
    }
}
