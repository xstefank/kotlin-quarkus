/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgInitPrivs
import org.jooq.Record3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgInitPrivsRecord() : UpdatableRecordImpl<PgInitPrivsRecord>(PgInitPrivs.PG_INIT_PRIVS) {

    open var objoid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var classoid: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var objsubid: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var privtype: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var initprivs: Array<String?>?
        set(value): Unit = set(4, value)
        get(): Array<String?>? = get(4) as Array<String?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record3<Long?, Long?, Int?> = super.key() as Record3<Long?, Long?, Int?>

    /**
     * Create a detached, initialised PgInitPrivsRecord
     */
    constructor(objoid: Long? = null, classoid: Long? = null, objsubid: Int? = null, privtype: String? = null, initprivs: Array<String?>? = null): this() {
        this.objoid = objoid
        this.classoid = classoid
        this.objsubid = objsubid
        this.privtype = privtype
        this.initprivs = initprivs
        resetChangedOnNotNull()
    }
}
