/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgCast
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgCastRecord() : UpdatableRecordImpl<PgCastRecord>(PgCast.PG_CAST) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var castsource: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var casttarget: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var castfunc: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var castcontext: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var castmethod: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgCastRecord
     */
    constructor(oid: Long? = null, castsource: Long? = null, casttarget: Long? = null, castfunc: Long? = null, castcontext: String? = null, castmethod: String? = null): this() {
        this.oid = oid
        this.castsource = castsource
        this.casttarget = casttarget
        this.castfunc = castfunc
        this.castcontext = castcontext
        this.castmethod = castmethod
        resetChangedOnNotNull()
    }
}
