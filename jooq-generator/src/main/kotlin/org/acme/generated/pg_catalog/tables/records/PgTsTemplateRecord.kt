/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgTsTemplate
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgTsTemplateRecord() : UpdatableRecordImpl<PgTsTemplateRecord>(PgTsTemplate.PG_TS_TEMPLATE) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var tmplname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var tmplnamespace: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var tmplinit: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var tmpllexize: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgTsTemplateRecord
     */
    constructor(oid: Long? = null, tmplname: String? = null, tmplnamespace: Long? = null, tmplinit: String? = null, tmpllexize: String? = null): this() {
        this.oid = oid
        this.tmplname = tmplname
        this.tmplnamespace = tmplnamespace
        this.tmplinit = tmplinit
        this.tmpllexize = tmpllexize
        resetChangedOnNotNull()
    }
}
