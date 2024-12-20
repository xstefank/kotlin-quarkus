/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgTsDict
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgTsDictRecord() : UpdatableRecordImpl<PgTsDictRecord>(PgTsDict.PG_TS_DICT) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var dictname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var dictnamespace: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var dictowner: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var dicttemplate: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var dictinitoption: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgTsDictRecord
     */
    constructor(oid: Long? = null, dictname: String? = null, dictnamespace: Long? = null, dictowner: Long? = null, dicttemplate: Long? = null, dictinitoption: String? = null): this() {
        this.oid = oid
        this.dictname = dictname
        this.dictnamespace = dictnamespace
        this.dictowner = dictowner
        this.dicttemplate = dicttemplate
        this.dictinitoption = dictinitoption
        resetChangedOnNotNull()
    }
}
