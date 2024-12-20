/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatGssapi
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatGssapiRecord() : TableRecordImpl<PgStatGssapiRecord>(PgStatGssapi.PG_STAT_GSSAPI) {

    open var pid: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var gssAuthenticated: Boolean?
        set(value): Unit = set(1, value)
        get(): Boolean? = get(1) as Boolean?

    open var principal: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var encrypted: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    /**
     * Create a detached, initialised PgStatGssapiRecord
     */
    constructor(pid: Int? = null, gssAuthenticated: Boolean? = null, principal: String? = null, encrypted: Boolean? = null): this() {
        this.pid = pid
        this.gssAuthenticated = gssAuthenticated
        this.principal = principal
        this.encrypted = encrypted
        resetChangedOnNotNull()
    }
}
