/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgGetReplicationSlotsRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.DefaultDataType
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgGetReplicationSlots(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgGetReplicationSlotsRecord>?,
    parentPath: InverseForeignKey<out Record, PgGetReplicationSlotsRecord>?,
    aliased: Table<PgGetReplicationSlotsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgGetReplicationSlotsRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function(),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_get_replication_slots</code>
         */
        val PG_GET_REPLICATION_SLOTS: PgGetReplicationSlots = PgGetReplicationSlots()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgGetReplicationSlotsRecord> = PgGetReplicationSlotsRecord::class.java

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    val SLOT_NAME: TableField<PgGetReplicationSlotsRecord, String?> = createField(DSL.name("slot_name"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    val PLUGIN: TableField<PgGetReplicationSlotsRecord, String?> = createField(DSL.name("plugin"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    val SLOT_TYPE: TableField<PgGetReplicationSlotsRecord, String?> = createField(DSL.name("slot_type"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    val DATOID: TableField<PgGetReplicationSlotsRecord, Long?> = createField(DSL.name("datoid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    val TEMPORARY: TableField<PgGetReplicationSlotsRecord, Boolean?> = createField(DSL.name("temporary"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    val ACTIVE: TableField<PgGetReplicationSlotsRecord, Boolean?> = createField(DSL.name("active"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    val ACTIVE_PID: TableField<PgGetReplicationSlotsRecord, Int?> = createField(DSL.name("active_pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    val XMIN: TableField<PgGetReplicationSlotsRecord, Long?> = createField(DSL.name("xmin"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    val CATALOG_XMIN: TableField<PgGetReplicationSlotsRecord, Long?> = createField(DSL.name("catalog_xmin"), SQLDataType.BIGINT, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val RESTART_LSN: TableField<PgGetReplicationSlotsRecord, Any?> = createField(DSL.name("restart_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val CONFIRMED_FLUSH_LSN: TableField<PgGetReplicationSlotsRecord, Any?> = createField(DSL.name("confirmed_flush_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    val WAL_STATUS: TableField<PgGetReplicationSlotsRecord, String?> = createField(DSL.name("wal_status"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    val SAFE_WAL_SIZE: TableField<PgGetReplicationSlotsRecord, Long?> = createField(DSL.name("safe_wal_size"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    val TWO_PHASE: TableField<PgGetReplicationSlotsRecord, Boolean?> = createField(DSL.name("two_phase"), SQLDataType.BOOLEAN, this, "")

    private constructor(alias: Name, aliased: Table<PgGetReplicationSlotsRecord>?): this(alias, null, null, null, aliased, arrayOf(
    ), null)
    private constructor(alias: Name, aliased: Table<PgGetReplicationSlotsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.pg_get_replication_slots</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_get_replication_slots</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_get_replication_slots</code> table reference
     */
    constructor(): this(DSL.name("pg_get_replication_slots"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgGetReplicationSlots = PgGetReplicationSlots(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgGetReplicationSlots = PgGetReplicationSlots(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgGetReplicationSlots = PgGetReplicationSlots(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgGetReplicationSlots = PgGetReplicationSlots(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgGetReplicationSlots = PgGetReplicationSlots(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgGetReplicationSlots = PgGetReplicationSlots(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgGetReplicationSlots = PgGetReplicationSlots(DSL.name("pg_get_replication_slots"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
