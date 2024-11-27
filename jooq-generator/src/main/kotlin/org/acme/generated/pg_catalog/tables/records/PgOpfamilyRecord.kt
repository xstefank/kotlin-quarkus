/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgOpfamily
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgOpfamilyRecord() : UpdatableRecordImpl<PgOpfamilyRecord>(PgOpfamily.PG_OPFAMILY) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var opfmethod: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var opfname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var opfnamespace: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var opfowner: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgOpfamilyRecord
     */
    constructor(oid: Long? = null, opfmethod: Long? = null, opfname: String? = null, opfnamespace: Long? = null, opfowner: Long? = null): this() {
        this.oid = oid
        this.opfmethod = opfmethod
        this.opfname = opfname
        this.opfnamespace = opfnamespace
        this.opfowner = opfowner
        resetChangedOnNotNull()
    }
}