/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatXactUserTablesRecord
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
open class PgStatXactUserTables(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatXactUserTablesRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatXactUserTablesRecord>?,
    aliased: Table<PgStatXactUserTablesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatXactUserTablesRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_stat_xact_user_tables" as  SELECT pg_stat_xact_all_tables.relid,
      pg_stat_xact_all_tables.schemaname,
      pg_stat_xact_all_tables.relname,
      pg_stat_xact_all_tables.seq_scan,
      pg_stat_xact_all_tables.seq_tup_read,
      pg_stat_xact_all_tables.idx_scan,
      pg_stat_xact_all_tables.idx_tup_fetch,
      pg_stat_xact_all_tables.n_tup_ins,
      pg_stat_xact_all_tables.n_tup_upd,
      pg_stat_xact_all_tables.n_tup_del,
      pg_stat_xact_all_tables.n_tup_hot_upd
     FROM pg_stat_xact_all_tables
    WHERE ((pg_stat_xact_all_tables.schemaname <> ALL (ARRAY['pg_catalog'::name, 'information_schema'::name])) AND (pg_stat_xact_all_tables.schemaname !~ '^pg_toast'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_xact_user_tables</code>
         */
        val PG_STAT_XACT_USER_TABLES: PgStatXactUserTables = PgStatXactUserTables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatXactUserTablesRecord> = PgStatXactUserTablesRecord::class.java

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.relid</code>.
     */
    val RELID: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgStatXactUserTablesRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.relname</code>.
     */
    val RELNAME: TableField<PgStatXactUserTablesRecord, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.seq_scan</code>.
     */
    val SEQ_SCAN: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.seq_tup_read</code>.
     */
    val SEQ_TUP_READ: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.idx_scan</code>.
     */
    val IDX_SCAN: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_tables.idx_tup_fetch</code>.
     */
    val IDX_TUP_FETCH: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.n_tup_ins</code>.
     */
    val N_TUP_INS: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.n_tup_upd</code>.
     */
    val N_TUP_UPD: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_tables.n_tup_del</code>.
     */
    val N_TUP_DEL: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_user_tables.n_tup_hot_upd</code>.
     */
    val N_TUP_HOT_UPD: TableField<PgStatXactUserTablesRecord, Long?> = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PgStatXactUserTablesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatXactUserTablesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatXactUserTablesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_tables</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_tables</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_xact_user_tables</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_xact_user_tables"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatXactUserTables = PgStatXactUserTables(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatXactUserTables = PgStatXactUserTables(alias, this)
    override fun `as`(alias: Table<*>): PgStatXactUserTables = PgStatXactUserTables(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatXactUserTables = PgStatXactUserTables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatXactUserTables = PgStatXactUserTables(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatXactUserTables = PgStatXactUserTables(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatXactUserTables = PgStatXactUserTables(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatXactUserTables = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatXactUserTables = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatXactUserTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatXactUserTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatXactUserTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatXactUserTables = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatXactUserTables = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatXactUserTables = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatXactUserTables = where(DSL.notExists(select))
}