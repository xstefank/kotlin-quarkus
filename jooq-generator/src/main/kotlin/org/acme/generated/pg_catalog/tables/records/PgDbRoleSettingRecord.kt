/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgDbRoleSetting
import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgDbRoleSettingRecord() : UpdatableRecordImpl<PgDbRoleSettingRecord>(PgDbRoleSetting.PG_DB_ROLE_SETTING) {

    open var setdatabase: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var setrole: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var setconfig: Array<String?>?
        set(value): Unit = set(2, value)
        get(): Array<String?>? = get(2) as Array<String?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Long?, Long?> = super.key() as Record2<Long?, Long?>

    /**
     * Create a detached, initialised PgDbRoleSettingRecord
     */
    constructor(setdatabase: Long? = null, setrole: Long? = null, setconfig: Array<String?>? = null): this() {
        this.setdatabase = setdatabase
        this.setrole = setrole
        this.setconfig = setconfig
        resetChangedOnNotNull()
    }
}