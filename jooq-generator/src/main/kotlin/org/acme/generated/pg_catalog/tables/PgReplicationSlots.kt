/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgReplicationSlotsRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
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
open class PgReplicationSlots(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgReplicationSlotsRecord>?,
    parentPath: InverseForeignKey<out Record, PgReplicationSlotsRecord>?,
    aliased: Table<PgReplicationSlotsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgReplicationSlotsRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_replication_slots" as  SELECT l.slot_name,
     l.plugin,
     l.slot_type,
     l.datoid,
     d.datname AS database,
     l.temporary,
     l.active,
     l.active_pid,
     l.xmin,
     l.catalog_xmin,
     l.restart_lsn,
     l.confirmed_flush_lsn,
     l.wal_status,
     l.safe_wal_size,
     l.two_phase
    FROM (pg_get_replication_slots() l(slot_name, plugin, slot_type, datoid, temporary, active, active_pid, xmin, catalog_xmin, restart_lsn, confirmed_flush_lsn, wal_status, safe_wal_size, two_phase)
      LEFT JOIN pg_database d ON ((l.datoid = d.oid)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_replication_slots</code>
         */
        val PG_REPLICATION_SLOTS: PgReplicationSlots = PgReplicationSlots()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgReplicationSlotsRecord> = PgReplicationSlotsRecord::class.java

    /**
     * The column <code>pg_catalog.pg_replication_slots.slot_name</code>.
     */
    val SLOT_NAME: TableField<PgReplicationSlotsRecord, String?> = createField(DSL.name("slot_name"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.plugin</code>.
     */
    val PLUGIN: TableField<PgReplicationSlotsRecord, String?> = createField(DSL.name("plugin"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.slot_type</code>.
     */
    val SLOT_TYPE: TableField<PgReplicationSlotsRecord, String?> = createField(DSL.name("slot_type"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.datoid</code>.
     */
    val DATOID: TableField<PgReplicationSlotsRecord, Long?> = createField(DSL.name("datoid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.database</code>.
     */
    val DATABASE: TableField<PgReplicationSlotsRecord, String?> = createField(DSL.name("database"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.temporary</code>.
     */
    val TEMPORARY: TableField<PgReplicationSlotsRecord, Boolean?> = createField(DSL.name("temporary"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.active</code>.
     */
    val ACTIVE: TableField<PgReplicationSlotsRecord, Boolean?> = createField(DSL.name("active"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.active_pid</code>.
     */
    val ACTIVE_PID: TableField<PgReplicationSlotsRecord, Int?> = createField(DSL.name("active_pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.xmin</code>.
     */
    val XMIN: TableField<PgReplicationSlotsRecord, Long?> = createField(DSL.name("xmin"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.catalog_xmin</code>.
     */
    val CATALOG_XMIN: TableField<PgReplicationSlotsRecord, Long?> = createField(DSL.name("catalog_xmin"), SQLDataType.BIGINT, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val RESTART_LSN: TableField<PgReplicationSlotsRecord, Any?> = createField(DSL.name("restart_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val CONFIRMED_FLUSH_LSN: TableField<PgReplicationSlotsRecord, Any?> = createField(DSL.name("confirmed_flush_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.wal_status</code>.
     */
    val WAL_STATUS: TableField<PgReplicationSlotsRecord, String?> = createField(DSL.name("wal_status"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.safe_wal_size</code>.
     */
    val SAFE_WAL_SIZE: TableField<PgReplicationSlotsRecord, Long?> = createField(DSL.name("safe_wal_size"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_replication_slots.two_phase</code>.
     */
    val TWO_PHASE: TableField<PgReplicationSlotsRecord, Boolean?> = createField(DSL.name("two_phase"), SQLDataType.BOOLEAN, this, "")

    private constructor(alias: Name, aliased: Table<PgReplicationSlotsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgReplicationSlotsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgReplicationSlotsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_replication_slots</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_replication_slots</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_replication_slots</code> table reference
     */
    constructor(): this(DSL.name("pg_replication_slots"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgReplicationSlots = PgReplicationSlots(DSL.name(alias), this)
    override fun `as`(alias: Name): PgReplicationSlots = PgReplicationSlots(alias, this)
    override fun `as`(alias: Table<*>): PgReplicationSlots = PgReplicationSlots(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgReplicationSlots = PgReplicationSlots(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgReplicationSlots = PgReplicationSlots(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgReplicationSlots = PgReplicationSlots(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgReplicationSlots = PgReplicationSlots(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgReplicationSlots = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgReplicationSlots = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgReplicationSlots = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgReplicationSlots = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgReplicationSlots = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgReplicationSlots = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgReplicationSlots = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgReplicationSlots = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgReplicationSlots = where(DSL.notExists(select))
}