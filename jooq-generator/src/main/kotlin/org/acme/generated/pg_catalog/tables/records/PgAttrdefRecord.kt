/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgAttrdef
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgAttrdefRecord() : UpdatableRecordImpl<PgAttrdefRecord>(PgAttrdef.PG_ATTRDEF) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var adrelid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var adnum: Short?
        set(value): Unit = set(2, value)
        get(): Short? = get(2) as Short?

    open var adbin: Any?
        set(value): Unit = set(3, value)
        get(): Any? = get(3) as Any?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgAttrdefRecord
     */
    constructor(oid: Long? = null, adrelid: Long? = null, adnum: Short? = null, adbin: Any? = null): this() {
        this.oid = oid
        this.adrelid = adrelid
        this.adnum = adnum
        this.adbin = adbin
        resetChangedOnNotNull()
    }
}