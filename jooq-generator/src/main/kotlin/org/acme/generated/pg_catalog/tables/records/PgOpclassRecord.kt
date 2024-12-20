/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgOpclass
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgOpclassRecord() : UpdatableRecordImpl<PgOpclassRecord>(PgOpclass.PG_OPCLASS) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var opcmethod: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var opcname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var opcnamespace: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var opcowner: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var opcfamily: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var opcintype: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var opcdefault: Boolean?
        set(value): Unit = set(7, value)
        get(): Boolean? = get(7) as Boolean?

    open var opckeytype: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgOpclassRecord
     */
    constructor(oid: Long? = null, opcmethod: Long? = null, opcname: String? = null, opcnamespace: Long? = null, opcowner: Long? = null, opcfamily: Long? = null, opcintype: Long? = null, opcdefault: Boolean? = null, opckeytype: Long? = null): this() {
        this.oid = oid
        this.opcmethod = opcmethod
        this.opcname = opcname
        this.opcnamespace = opcnamespace
        this.opcowner = opcowner
        this.opcfamily = opcfamily
        this.opcintype = opcintype
        this.opcdefault = opcdefault
        this.opckeytype = opckeytype
        resetChangedOnNotNull()
    }
}
