/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgAmproc
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgAmprocRecord() : UpdatableRecordImpl<PgAmprocRecord>(PgAmproc.PG_AMPROC) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var amprocfamily: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var amproclefttype: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var amprocrighttype: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var amprocnum: Short?
        set(value): Unit = set(4, value)
        get(): Short? = get(4) as Short?

    open var amproc: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgAmprocRecord
     */
    constructor(oid: Long? = null, amprocfamily: Long? = null, amproclefttype: Long? = null, amprocrighttype: Long? = null, amprocnum: Short? = null, amproc: String? = null): this() {
        this.oid = oid
        this.amprocfamily = amprocfamily
        this.amproclefttype = amproclefttype
        this.amprocrighttype = amprocrighttype
        this.amprocnum = amprocnum
        this.amproc = amproc
        resetChangedOnNotNull()
    }
}
