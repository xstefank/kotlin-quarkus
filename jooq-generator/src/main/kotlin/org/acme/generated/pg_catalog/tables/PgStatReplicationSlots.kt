/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import java.time.OffsetDateTime

import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatReplicationSlotsRecord
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
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatReplicationSlots(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatReplicationSlotsRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatReplicationSlotsRecord>?,
    aliased: Table<PgStatReplicationSlotsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatReplicationSlotsRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_stat_replication_slots" as  SELECT s.slot_name,
      s.spill_txns,
      s.spill_count,
      s.spill_bytes,
      s.stream_txns,
      s.stream_count,
      s.stream_bytes,
      s.total_txns,
      s.total_bytes,
      s.stats_reset
     FROM pg_replication_slots r,
      LATERAL pg_stat_get_replication_slot((r.slot_name)::text) s(slot_name, spill_txns, spill_count, spill_bytes, stream_txns, stream_count, stream_bytes, total_txns, total_bytes, stats_reset)
    WHERE (r.datoid IS NOT NULL);
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_replication_slots</code>
         */
        val PG_STAT_REPLICATION_SLOTS: PgStatReplicationSlots = PgStatReplicationSlots()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatReplicationSlotsRecord> = PgStatReplicationSlotsRecord::class.java

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.slot_name</code>.
     */
    val SLOT_NAME: TableField<PgStatReplicationSlotsRecord, String?> = createField(DSL.name("slot_name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.spill_txns</code>.
     */
    val SPILL_TXNS: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("spill_txns"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.spill_count</code>.
     */
    val SPILL_COUNT: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("spill_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.spill_bytes</code>.
     */
    val SPILL_BYTES: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("spill_bytes"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.stream_txns</code>.
     */
    val STREAM_TXNS: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("stream_txns"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_replication_slots.stream_count</code>.
     */
    val STREAM_COUNT: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("stream_count"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_replication_slots.stream_bytes</code>.
     */
    val STREAM_BYTES: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("stream_bytes"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.total_txns</code>.
     */
    val TOTAL_TXNS: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("total_txns"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.total_bytes</code>.
     */
    val TOTAL_BYTES: TableField<PgStatReplicationSlotsRecord, Long?> = createField(DSL.name("total_bytes"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_replication_slots.stats_reset</code>.
     */
    val STATS_RESET: TableField<PgStatReplicationSlotsRecord, OffsetDateTime?> = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<PgStatReplicationSlotsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatReplicationSlotsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatReplicationSlotsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication_slots</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication_slots</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_replication_slots</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_stat_replication_slots"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatReplicationSlots = PgStatReplicationSlots(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatReplicationSlots = PgStatReplicationSlots(alias, this)
    override fun `as`(alias: Table<*>): PgStatReplicationSlots = PgStatReplicationSlots(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatReplicationSlots = PgStatReplicationSlots(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatReplicationSlots = PgStatReplicationSlots(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatReplicationSlots = PgStatReplicationSlots(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatReplicationSlots = PgStatReplicationSlots(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatReplicationSlots = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatReplicationSlots = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatReplicationSlots = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatReplicationSlots = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatReplicationSlots = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatReplicationSlots = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatReplicationSlots = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatReplicationSlots = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatReplicationSlots = where(DSL.notExists(select))
}
