/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgClass
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgClassRecord() : UpdatableRecordImpl<PgClassRecord>(PgClass.PG_CLASS) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var relname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var relnamespace: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var reltype: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var reloftype: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var relowner: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var relam: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var relfilenode: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var reltablespace: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var relpages: Int?
        set(value): Unit = set(9, value)
        get(): Int? = get(9) as Int?

    open var reltuples: Float?
        set(value): Unit = set(10, value)
        get(): Float? = get(10) as Float?

    open var relallvisible: Int?
        set(value): Unit = set(11, value)
        get(): Int? = get(11) as Int?

    open var reltoastrelid: Long?
        set(value): Unit = set(12, value)
        get(): Long? = get(12) as Long?

    open var relhasindex: Boolean?
        set(value): Unit = set(13, value)
        get(): Boolean? = get(13) as Boolean?

    open var relisshared: Boolean?
        set(value): Unit = set(14, value)
        get(): Boolean? = get(14) as Boolean?

    open var relpersistence: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var relkind: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var relnatts: Short?
        set(value): Unit = set(17, value)
        get(): Short? = get(17) as Short?

    open var relchecks: Short?
        set(value): Unit = set(18, value)
        get(): Short? = get(18) as Short?

    open var relhasrules: Boolean?
        set(value): Unit = set(19, value)
        get(): Boolean? = get(19) as Boolean?

    open var relhastriggers: Boolean?
        set(value): Unit = set(20, value)
        get(): Boolean? = get(20) as Boolean?

    open var relhassubclass: Boolean?
        set(value): Unit = set(21, value)
        get(): Boolean? = get(21) as Boolean?

    open var relrowsecurity: Boolean?
        set(value): Unit = set(22, value)
        get(): Boolean? = get(22) as Boolean?

    open var relforcerowsecurity: Boolean?
        set(value): Unit = set(23, value)
        get(): Boolean? = get(23) as Boolean?

    open var relispopulated: Boolean?
        set(value): Unit = set(24, value)
        get(): Boolean? = get(24) as Boolean?

    open var relreplident: String?
        set(value): Unit = set(25, value)
        get(): String? = get(25) as String?

    open var relispartition: Boolean?
        set(value): Unit = set(26, value)
        get(): Boolean? = get(26) as Boolean?

    open var relrewrite: Long?
        set(value): Unit = set(27, value)
        get(): Long? = get(27) as Long?

    open var relfrozenxid: Long?
        set(value): Unit = set(28, value)
        get(): Long? = get(28) as Long?

    open var relminmxid: Long?
        set(value): Unit = set(29, value)
        get(): Long? = get(29) as Long?

    open var relacl: Array<String?>?
        set(value): Unit = set(30, value)
        get(): Array<String?>? = get(30) as Array<String?>?

    open var reloptions: Array<String?>?
        set(value): Unit = set(31, value)
        get(): Array<String?>? = get(31) as Array<String?>?

    open var relpartbound: Any?
        set(value): Unit = set(32, value)
        get(): Any? = get(32) as Any?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgClassRecord
     */
    constructor(oid: Long? = null, relname: String? = null, relnamespace: Long? = null, reltype: Long? = null, reloftype: Long? = null, relowner: Long? = null, relam: Long? = null, relfilenode: Long? = null, reltablespace: Long? = null, relpages: Int? = null, reltuples: Float? = null, relallvisible: Int? = null, reltoastrelid: Long? = null, relhasindex: Boolean? = null, relisshared: Boolean? = null, relpersistence: String? = null, relkind: String? = null, relnatts: Short? = null, relchecks: Short? = null, relhasrules: Boolean? = null, relhastriggers: Boolean? = null, relhassubclass: Boolean? = null, relrowsecurity: Boolean? = null, relforcerowsecurity: Boolean? = null, relispopulated: Boolean? = null, relreplident: String? = null, relispartition: Boolean? = null, relrewrite: Long? = null, relfrozenxid: Long? = null, relminmxid: Long? = null, relacl: Array<String?>? = null, reloptions: Array<String?>? = null, relpartbound: Any? = null): this() {
        this.oid = oid
        this.relname = relname
        this.relnamespace = relnamespace
        this.reltype = reltype
        this.reloftype = reloftype
        this.relowner = relowner
        this.relam = relam
        this.relfilenode = relfilenode
        this.reltablespace = reltablespace
        this.relpages = relpages
        this.reltuples = reltuples
        this.relallvisible = relallvisible
        this.reltoastrelid = reltoastrelid
        this.relhasindex = relhasindex
        this.relisshared = relisshared
        this.relpersistence = relpersistence
        this.relkind = relkind
        this.relnatts = relnatts
        this.relchecks = relchecks
        this.relhasrules = relhasrules
        this.relhastriggers = relhastriggers
        this.relhassubclass = relhassubclass
        this.relrowsecurity = relrowsecurity
        this.relforcerowsecurity = relforcerowsecurity
        this.relispopulated = relispopulated
        this.relreplident = relreplident
        this.relispartition = relispartition
        this.relrewrite = relrewrite
        this.relfrozenxid = relfrozenxid
        this.relminmxid = relminmxid
        this.relacl = relacl
        this.reloptions = reloptions
        this.relpartbound = relpartbound
        resetChangedOnNotNull()
    }
}
