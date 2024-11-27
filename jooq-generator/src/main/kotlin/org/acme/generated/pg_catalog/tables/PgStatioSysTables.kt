/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatioSysTablesRecord
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
open class PgStatioSysTables(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatioSysTablesRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatioSysTablesRecord>?,
    aliased: Table<PgStatioSysTablesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatioSysTablesRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_statio_sys_tables" as  SELECT pg_statio_all_tables.relid,
      pg_statio_all_tables.schemaname,
      pg_statio_all_tables.relname,
      pg_statio_all_tables.heap_blks_read,
      pg_statio_all_tables.heap_blks_hit,
      pg_statio_all_tables.idx_blks_read,
      pg_statio_all_tables.idx_blks_hit,
      pg_statio_all_tables.toast_blks_read,
      pg_statio_all_tables.toast_blks_hit,
      pg_statio_all_tables.tidx_blks_read,
      pg_statio_all_tables.tidx_blks_hit
     FROM pg_statio_all_tables
    WHERE ((pg_statio_all_tables.schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (pg_statio_all_tables.schemaname ~ '^pg_toast'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_statio_sys_tables</code>
         */
        val PG_STATIO_SYS_TABLES: PgStatioSysTables = PgStatioSysTables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatioSysTablesRecord> = PgStatioSysTablesRecord::class.java

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.relid</code>.
     */
    val RELID: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgStatioSysTablesRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.relname</code>.
     */
    val RELNAME: TableField<PgStatioSysTablesRecord, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.heap_blks_read</code>.
     */
    val HEAP_BLKS_READ: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("heap_blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.heap_blks_hit</code>.
     */
    val HEAP_BLKS_HIT: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("heap_blks_hit"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.idx_blks_read</code>.
     */
    val IDX_BLKS_READ: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.idx_blks_hit</code>.
     */
    val IDX_BLKS_HIT: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.toast_blks_read</code>.
     */
    val TOAST_BLKS_READ: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("toast_blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.toast_blks_hit</code>.
     */
    val TOAST_BLKS_HIT: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("toast_blks_hit"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.tidx_blks_read</code>.
     */
    val TIDX_BLKS_READ: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("tidx_blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.tidx_blks_hit</code>.
     */
    val TIDX_BLKS_HIT: TableField<PgStatioSysTablesRecord, Long?> = createField(DSL.name("tidx_blks_hit"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PgStatioSysTablesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatioSysTablesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatioSysTablesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_tables</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_tables</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_statio_sys_tables</code> table reference
     */
    constructor(): this(DSL.name("pg_statio_sys_tables"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatioSysTables = PgStatioSysTables(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatioSysTables = PgStatioSysTables(alias, this)
    override fun `as`(alias: Table<*>): PgStatioSysTables = PgStatioSysTables(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatioSysTables = PgStatioSysTables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatioSysTables = PgStatioSysTables(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatioSysTables = PgStatioSysTables(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatioSysTables = PgStatioSysTables(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatioSysTables = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatioSysTables = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatioSysTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatioSysTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatioSysTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatioSysTables = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatioSysTables = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatioSysTables = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatioSysTables = where(DSL.notExists(select))
}
