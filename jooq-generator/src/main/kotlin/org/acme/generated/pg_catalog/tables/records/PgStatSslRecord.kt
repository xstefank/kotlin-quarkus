/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.math.BigDecimal

import org.acme.generated.pg_catalog.tables.PgStatSsl
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatSslRecord() : TableRecordImpl<PgStatSslRecord>(PgStatSsl.PG_STAT_SSL) {

    open var pid: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var ssl: Boolean?
        set(value): Unit = set(1, value)
        get(): Boolean? = get(1) as Boolean?

    open var version: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var cipher: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var bits: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var clientDn: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var clientSerial: BigDecimal?
        set(value): Unit = set(6, value)
        get(): BigDecimal? = get(6) as BigDecimal?

    open var issuerDn: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    /**
     * Create a detached, initialised PgStatSslRecord
     */
    constructor(pid: Int? = null, ssl: Boolean? = null, version: String? = null, cipher: String? = null, bits: Int? = null, clientDn: String? = null, clientSerial: BigDecimal? = null, issuerDn: String? = null): this() {
        this.pid = pid
        this.ssl = ssl
        this.version = version
        this.cipher = cipher
        this.bits = bits
        this.clientDn = clientDn
        this.clientSerial = clientSerial
        this.issuerDn = issuerDn
        resetChangedOnNotNull()
    }
}
