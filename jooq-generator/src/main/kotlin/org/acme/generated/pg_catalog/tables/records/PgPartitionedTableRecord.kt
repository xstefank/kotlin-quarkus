/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgPartitionedTable
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgPartitionedTableRecord() : UpdatableRecordImpl<PgPartitionedTableRecord>(PgPartitionedTable.PG_PARTITIONED_TABLE) {

    open var partrelid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var partstrat: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var partnatts: Short?
        set(value): Unit = set(2, value)
        get(): Short? = get(2) as Short?

    open var partdefid: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var partattrs: Array<Any?>?
        set(value): Unit = set(4, value)
        get(): Array<Any?>? = get(4) as Array<Any?>?

    open var partclass: Array<Any?>?
        set(value): Unit = set(5, value)
        get(): Array<Any?>? = get(5) as Array<Any?>?

    open var partcollation: Array<Any?>?
        set(value): Unit = set(6, value)
        get(): Array<Any?>? = get(6) as Array<Any?>?

    open var partexprs: Any?
        set(value): Unit = set(7, value)
        get(): Any? = get(7) as Any?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PgPartitionedTableRecord
     */
    constructor(partrelid: Long? = null, partstrat: String? = null, partnatts: Short? = null, partdefid: Long? = null, partattrs: Array<Any?>? = null, partclass: Array<Any?>? = null, partcollation: Array<Any?>? = null, partexprs: Any? = null): this() {
        this.partrelid = partrelid
        this.partstrat = partstrat
        this.partnatts = partnatts
        this.partdefid = partdefid
        this.partattrs = partattrs
        this.partclass = partclass
        this.partcollation = partcollation
        this.partexprs = partexprs
        resetChangedOnNotNull()
    }
}
