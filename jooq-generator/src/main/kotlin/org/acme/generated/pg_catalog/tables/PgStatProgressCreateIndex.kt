/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatProgressCreateIndexRecord
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
open class PgStatProgressCreateIndex(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatProgressCreateIndexRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatProgressCreateIndexRecord>?,
    aliased: Table<PgStatProgressCreateIndexRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatProgressCreateIndexRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_stat_progress_create_index" as  SELECT s.pid,
     s.datid,
     d.datname,
     s.relid,
     (s.param7)::oid AS index_relid,
         CASE s.param1
             WHEN 1 THEN 'CREATE INDEX'::text
             WHEN 2 THEN 'CREATE INDEX CONCURRENTLY'::text
             WHEN 3 THEN 'REINDEX'::text
             WHEN 4 THEN 'REINDEX CONCURRENTLY'::text
             ELSE NULL::text
         END AS command,
         CASE s.param10
             WHEN 0 THEN 'initializing'::text
             WHEN 1 THEN 'waiting for writers before build'::text
             WHEN 2 THEN ('building index'::text || COALESCE((': '::text || pg_indexam_progress_phasename((s.param9)::oid, s.param11)), ''::text))
             WHEN 3 THEN 'waiting for writers before validation'::text
             WHEN 4 THEN 'index validation: scanning index'::text
             WHEN 5 THEN 'index validation: sorting tuples'::text
             WHEN 6 THEN 'index validation: scanning table'::text
             WHEN 7 THEN 'waiting for old snapshots'::text
             WHEN 8 THEN 'waiting for readers before marking dead'::text
             WHEN 9 THEN 'waiting for readers before dropping'::text
             ELSE NULL::text
         END AS phase,
     s.param4 AS lockers_total,
     s.param5 AS lockers_done,
     s.param6 AS current_locker_pid,
     s.param16 AS blocks_total,
     s.param17 AS blocks_done,
     s.param12 AS tuples_total,
     s.param13 AS tuples_done,
     s.param14 AS partitions_total,
     s.param15 AS partitions_done
    FROM (pg_stat_get_progress_info('CREATE INDEX'::text) s(pid, datid, relid, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20)
      LEFT JOIN pg_database d ON ((s.datid = d.oid)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_progress_create_index</code>
         */
        val PG_STAT_PROGRESS_CREATE_INDEX: PgStatProgressCreateIndex = PgStatProgressCreateIndex()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatProgressCreateIndexRecord> = PgStatProgressCreateIndexRecord::class.java

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.pid</code>.
     */
    val PID: TableField<PgStatProgressCreateIndexRecord, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.datid</code>.
     */
    val DATID: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.datname</code>.
     */
    val DATNAME: TableField<PgStatProgressCreateIndexRecord, String?> = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.relid</code>.
     */
    val RELID: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.index_relid</code>.
     */
    val INDEX_RELID: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("index_relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.command</code>.
     */
    val COMMAND: TableField<PgStatProgressCreateIndexRecord, String?> = createField(DSL.name("command"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_progress_create_index.phase</code>.
     */
    val PHASE: TableField<PgStatProgressCreateIndexRecord, String?> = createField(DSL.name("phase"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_total</code>.
     */
    val LOCKERS_TOTAL: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("lockers_total"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_done</code>.
     */
    val LOCKERS_DONE: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("lockers_done"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.current_locker_pid</code>.
     */
    val CURRENT_LOCKER_PID: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("current_locker_pid"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_total</code>.
     */
    val BLOCKS_TOTAL: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("blocks_total"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_done</code>.
     */
    val BLOCKS_DONE: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("blocks_done"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_total</code>.
     */
    val TUPLES_TOTAL: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("tuples_total"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_done</code>.
     */
    val TUPLES_DONE: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("tuples_done"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_total</code>.
     */
    val PARTITIONS_TOTAL: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("partitions_total"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_done</code>.
     */
    val PARTITIONS_DONE: TableField<PgStatProgressCreateIndexRecord, Long?> = createField(DSL.name("partitions_done"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PgStatProgressCreateIndexRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatProgressCreateIndexRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatProgressCreateIndexRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_create_index</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_create_index</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_progress_create_index</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_stat_progress_create_index"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatProgressCreateIndex = PgStatProgressCreateIndex(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatProgressCreateIndex = PgStatProgressCreateIndex(alias, this)
    override fun `as`(alias: Table<*>): PgStatProgressCreateIndex = PgStatProgressCreateIndex(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatProgressCreateIndex = PgStatProgressCreateIndex(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatProgressCreateIndex = PgStatProgressCreateIndex(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatProgressCreateIndex = PgStatProgressCreateIndex(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatProgressCreateIndex = PgStatProgressCreateIndex(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatProgressCreateIndex = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatProgressCreateIndex = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatProgressCreateIndex = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatProgressCreateIndex = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatProgressCreateIndex = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatProgressCreateIndex = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatProgressCreateIndex = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatProgressCreateIndex = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatProgressCreateIndex = where(DSL.notExists(select))
}