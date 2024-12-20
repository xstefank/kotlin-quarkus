/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgShseclabel
import org.jooq.Record3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgShseclabelRecord() : UpdatableRecordImpl<PgShseclabelRecord>(PgShseclabel.PG_SHSECLABEL) {

    open var objoid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var classoid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var provider: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var label: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record3<Long?, Long?, String?> = super.key() as Record3<Long?, Long?, String?>

    /**
     * Create a detached, initialised PgShseclabelRecord
     */
    constructor(objoid: Long? = null, classoid: Long? = null, provider: String? = null, label: String? = null): this() {
        this.objoid = objoid
        this.classoid = classoid
        this.provider = provider
        this.label = label
        resetChangedOnNotNull()
    }
}
