/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgTsParser
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgTsParserRecord() : UpdatableRecordImpl<PgTsParserRecord>(PgTsParser.PG_TS_PARSER) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var prsname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var prsnamespace: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var prsstart: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var prstoken: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var prsend: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var prsheadline: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var prslextype: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgTsParserRecord
     */
    constructor(oid: Long? = null, prsname: String? = null, prsnamespace: Long? = null, prsstart: String? = null, prstoken: String? = null, prsend: String? = null, prsheadline: String? = null, prslextype: String? = null): this() {
        this.oid = oid
        this.prsname = prsname
        this.prsnamespace = prsnamespace
        this.prsstart = prsstart
        this.prstoken = prstoken
        this.prsend = prsend
        this.prsheadline = prsheadline
        this.prslextype = prslextype
        resetChangedOnNotNull()
    }
}
