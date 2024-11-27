/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgType
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgTypeRecord() : UpdatableRecordImpl<PgTypeRecord>(PgType.PG_TYPE) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var typname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var typnamespace: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var typowner: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var typlen: Short?
        set(value): Unit = set(4, value)
        get(): Short? = get(4) as Short?

    open var typbyval: Boolean?
        set(value): Unit = set(5, value)
        get(): Boolean? = get(5) as Boolean?

    open var typtype: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var typcategory: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var typispreferred: Boolean?
        set(value): Unit = set(8, value)
        get(): Boolean? = get(8) as Boolean?

    open var typisdefined: Boolean?
        set(value): Unit = set(9, value)
        get(): Boolean? = get(9) as Boolean?

    open var typdelim: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var typrelid: Long?
        set(value): Unit = set(11, value)
        get(): Long? = get(11) as Long?

    open var typsubscript: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var typelem: Long?
        set(value): Unit = set(13, value)
        get(): Long? = get(13) as Long?

    open var typarray: Long?
        set(value): Unit = set(14, value)
        get(): Long? = get(14) as Long?

    open var typinput: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var typoutput: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var typreceive: String?
        set(value): Unit = set(17, value)
        get(): String? = get(17) as String?

    open var typsend: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    open var typmodin: String?
        set(value): Unit = set(19, value)
        get(): String? = get(19) as String?

    open var typmodout: String?
        set(value): Unit = set(20, value)
        get(): String? = get(20) as String?

    open var typanalyze: String?
        set(value): Unit = set(21, value)
        get(): String? = get(21) as String?

    open var typalign: String?
        set(value): Unit = set(22, value)
        get(): String? = get(22) as String?

    open var typstorage: String?
        set(value): Unit = set(23, value)
        get(): String? = get(23) as String?

    open var typnotnull: Boolean?
        set(value): Unit = set(24, value)
        get(): Boolean? = get(24) as Boolean?

    open var typbasetype: Long?
        set(value): Unit = set(25, value)
        get(): Long? = get(25) as Long?

    open var typtypmod: Int?
        set(value): Unit = set(26, value)
        get(): Int? = get(26) as Int?

    open var typndims: Int?
        set(value): Unit = set(27, value)
        get(): Int? = get(27) as Int?

    open var typcollation: Long?
        set(value): Unit = set(28, value)
        get(): Long? = get(28) as Long?

    open var typdefaultbin: Any?
        set(value): Unit = set(29, value)
        get(): Any? = get(29) as Any?

    open var typdefault: String?
        set(value): Unit = set(30, value)
        get(): String? = get(30) as String?

    open var typacl: Array<String?>?
        set(value): Unit = set(31, value)
        get(): Array<String?>? = get(31) as Array<String?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgTypeRecord
     */
    constructor(oid: Long? = null, typname: String? = null, typnamespace: Long? = null, typowner: Long? = null, typlen: Short? = null, typbyval: Boolean? = null, typtype: String? = null, typcategory: String? = null, typispreferred: Boolean? = null, typisdefined: Boolean? = null, typdelim: String? = null, typrelid: Long? = null, typsubscript: String? = null, typelem: Long? = null, typarray: Long? = null, typinput: String? = null, typoutput: String? = null, typreceive: String? = null, typsend: String? = null, typmodin: String? = null, typmodout: String? = null, typanalyze: String? = null, typalign: String? = null, typstorage: String? = null, typnotnull: Boolean? = null, typbasetype: Long? = null, typtypmod: Int? = null, typndims: Int? = null, typcollation: Long? = null, typdefaultbin: Any? = null, typdefault: String? = null, typacl: Array<String?>? = null): this() {
        this.oid = oid
        this.typname = typname
        this.typnamespace = typnamespace
        this.typowner = typowner
        this.typlen = typlen
        this.typbyval = typbyval
        this.typtype = typtype
        this.typcategory = typcategory
        this.typispreferred = typispreferred
        this.typisdefined = typisdefined
        this.typdelim = typdelim
        this.typrelid = typrelid
        this.typsubscript = typsubscript
        this.typelem = typelem
        this.typarray = typarray
        this.typinput = typinput
        this.typoutput = typoutput
        this.typreceive = typreceive
        this.typsend = typsend
        this.typmodin = typmodin
        this.typmodout = typmodout
        this.typanalyze = typanalyze
        this.typalign = typalign
        this.typstorage = typstorage
        this.typnotnull = typnotnull
        this.typbasetype = typbasetype
        this.typtypmod = typtypmod
        this.typndims = typndims
        this.typcollation = typcollation
        this.typdefaultbin = typdefaultbin
        this.typdefault = typdefault
        this.typacl = typacl
        resetChangedOnNotNull()
    }
}