/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgLanguage
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLanguageRecord() : UpdatableRecordImpl<PgLanguageRecord>(PgLanguage.PG_LANGUAGE) {

    open var oid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var lanname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var lanowner: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var lanispl: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    open var lanpltrusted: Boolean?
        set(value): Unit = set(4, value)
        get(): Boolean? = get(4) as Boolean?

    open var lanplcallfoid: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var laninline: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var lanvalidator: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var lanacl: Array<String?>?
        set(value): Unit = set(8, value)
        get(): Array<String?>? = get(8) as Array<String?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgLanguageRecord
     */
    constructor(oid: Long? = null, lanname: String? = null, lanowner: Long? = null, lanispl: Boolean? = null, lanpltrusted: Boolean? = null, lanplcallfoid: Long? = null, laninline: Long? = null, lanvalidator: Long? = null, lanacl: Array<String?>? = null): this() {
        this.oid = oid
        this.lanname = lanname
        this.lanowner = lanowner
        this.lanispl = lanispl
        this.lanpltrusted = lanpltrusted
        this.lanplcallfoid = lanplcallfoid
        this.laninline = laninline
        this.lanvalidator = lanvalidator
        this.lanacl = lanacl
        resetChangedOnNotNull()
    }
}
