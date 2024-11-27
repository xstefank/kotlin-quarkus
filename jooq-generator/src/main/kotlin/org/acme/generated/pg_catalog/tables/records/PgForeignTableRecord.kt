/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgForeignTable
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgForeignTableRecord() : UpdatableRecordImpl<PgForeignTableRecord>(PgForeignTable.PG_FOREIGN_TABLE) {

    open var ftrelid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var ftserver: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var ftoptions: Array<String?>?
        set(value): Unit = set(2, value)
        get(): Array<String?>? = get(2) as Array<String?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgForeignTableRecord
     */
    constructor(ftrelid: Long? = null, ftserver: Long? = null, ftoptions: Array<String?>? = null): this() {
        this.ftrelid = ftrelid
        this.ftserver = ftserver
        this.ftoptions = ftoptions
        resetChangedOnNotNull()
    }
}