/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgSeclabel
import org.jooq.Record4
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgSeclabelRecord() : UpdatableRecordImpl<PgSeclabelRecord>(PgSeclabel.PG_SECLABEL) {

    open var objoid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var classoid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var objsubid: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var provider: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var label: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record4<Long?, Long?, Int?, String?> = super.key() as Record4<Long?, Long?, Int?, String?>

    /**
     * Create a detached, initialised PgSeclabelRecord
     */
    constructor(objoid: Long? = null, classoid: Long? = null, objsubid: Int? = null, provider: String? = null, label: String? = null): this() {
        this.objoid = objoid
        this.classoid = classoid
        this.objsubid = objsubid
        this.provider = provider
        this.label = label
        resetChangedOnNotNull()
    }
}
