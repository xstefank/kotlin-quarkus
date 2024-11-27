/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgProc
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgProcRecord() : UpdatableRecordImpl<PgProcRecord>(PgProc.PG_PROC) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var proname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var pronamespace: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var proowner: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var prolang: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var procost: Float?
        set(value): Unit = set(5, value)
        get(): Float? = get(5) as Float?

    open var prorows: Float?
        set(value): Unit = set(6, value)
        get(): Float? = get(6) as Float?

    open var provariadic: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var prosupport: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var prokind: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var prosecdef: Boolean?
        set(value): Unit = set(10, value)
        get(): Boolean? = get(10) as Boolean?

    open var proleakproof: Boolean?
        set(value): Unit = set(11, value)
        get(): Boolean? = get(11) as Boolean?

    open var proisstrict: Boolean?
        set(value): Unit = set(12, value)
        get(): Boolean? = get(12) as Boolean?

    open var proretset: Boolean?
        set(value): Unit = set(13, value)
        get(): Boolean? = get(13) as Boolean?

    open var provolatile: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var proparallel: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var pronargs: Short?
        set(value): Unit = set(16, value)
        get(): Short? = get(16) as Short?

    open var pronargdefaults: Short?
        set(value): Unit = set(17, value)
        get(): Short? = get(17) as Short?

    open var prorettype: Long?
        set(value): Unit = set(18, value)
        get(): Long? = get(18) as Long?

    open var proargtypes: Array<Any?>?
        set(value): Unit = set(19, value)
        get(): Array<Any?>? = get(19) as Array<Any?>?

    open var proallargtypes: Array<Long?>?
        set(value): Unit = set(20, value)
        get(): Array<Long?>? = get(20) as Array<Long?>?

    open var proargmodes: Array<String?>?
        set(value): Unit = set(21, value)
        get(): Array<String?>? = get(21) as Array<String?>?

    open var proargnames: Array<String?>?
        set(value): Unit = set(22, value)
        get(): Array<String?>? = get(22) as Array<String?>?

    open var proargdefaults: Any?
        set(value): Unit = set(23, value)
        get(): Any? = get(23) as Any?

    open var protrftypes: Array<Long?>?
        set(value): Unit = set(24, value)
        get(): Array<Long?>? = get(24) as Array<Long?>?

    open var prosrc: String?
        set(value): Unit = set(25, value)
        get(): String? = get(25) as String?

    open var probin: String?
        set(value): Unit = set(26, value)
        get(): String? = get(26) as String?

    open var prosqlbody: Any?
        set(value): Unit = set(27, value)
        get(): Any? = get(27) as Any?

    open var proconfig: Array<String?>?
        set(value): Unit = set(28, value)
        get(): Array<String?>? = get(28) as Array<String?>?

    open var proacl: Array<String?>?
        set(value): Unit = set(29, value)
        get(): Array<String?>? = get(29) as Array<String?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgProcRecord
     */
    constructor(oid: Long? = null, proname: String? = null, pronamespace: Long? = null, proowner: Long? = null, prolang: Long? = null, procost: Float? = null, prorows: Float? = null, provariadic: Long? = null, prosupport: String? = null, prokind: String? = null, prosecdef: Boolean? = null, proleakproof: Boolean? = null, proisstrict: Boolean? = null, proretset: Boolean? = null, provolatile: String? = null, proparallel: String? = null, pronargs: Short? = null, pronargdefaults: Short? = null, prorettype: Long? = null, proargtypes: Array<Any?>? = null, proallargtypes: Array<Long?>? = null, proargmodes: Array<String?>? = null, proargnames: Array<String?>? = null, proargdefaults: Any? = null, protrftypes: Array<Long?>? = null, prosrc: String? = null, probin: String? = null, prosqlbody: Any? = null, proconfig: Array<String?>? = null, proacl: Array<String?>? = null): this() {
        this.oid = oid
        this.proname = proname
        this.pronamespace = pronamespace
        this.proowner = proowner
        this.prolang = prolang
        this.procost = procost
        this.prorows = prorows
        this.provariadic = provariadic
        this.prosupport = prosupport
        this.prokind = prokind
        this.prosecdef = prosecdef
        this.proleakproof = proleakproof
        this.proisstrict = proisstrict
        this.proretset = proretset
        this.provolatile = provolatile
        this.proparallel = proparallel
        this.pronargs = pronargs
        this.pronargdefaults = pronargdefaults
        this.prorettype = prorettype
        this.proargtypes = proargtypes
        this.proallargtypes = proallargtypes
        this.proargmodes = proargmodes
        this.proargnames = proargnames
        this.proargdefaults = proargdefaults
        this.protrftypes = protrftypes
        this.prosrc = prosrc
        this.probin = probin
        this.prosqlbody = prosqlbody
        this.proconfig = proconfig
        this.proacl = proacl
        resetChangedOnNotNull()
    }
}
