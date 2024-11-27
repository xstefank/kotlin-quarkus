/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatsRecord
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
open class PgStats(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatsRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatsRecord>?,
    aliased: Table<PgStatsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatsRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_stats" as  SELECT n.nspname AS schemaname,
      c.relname AS tablename,
      a.attname,
      s.stainherit AS inherited,
      s.stanullfrac AS null_frac,
      s.stawidth AS avg_width,
      s.stadistinct AS n_distinct,
          CASE
              WHEN (s.stakind1 = 1) THEN s.stavalues1
              WHEN (s.stakind2 = 1) THEN s.stavalues2
              WHEN (s.stakind3 = 1) THEN s.stavalues3
              WHEN (s.stakind4 = 1) THEN s.stavalues4
              WHEN (s.stakind5 = 1) THEN s.stavalues5
              ELSE NULL::anyarray
          END AS most_common_vals,
          CASE
              WHEN (s.stakind1 = 1) THEN s.stanumbers1
              WHEN (s.stakind2 = 1) THEN s.stanumbers2
              WHEN (s.stakind3 = 1) THEN s.stanumbers3
              WHEN (s.stakind4 = 1) THEN s.stanumbers4
              WHEN (s.stakind5 = 1) THEN s.stanumbers5
              ELSE NULL::real[]
          END AS most_common_freqs,
          CASE
              WHEN (s.stakind1 = 2) THEN s.stavalues1
              WHEN (s.stakind2 = 2) THEN s.stavalues2
              WHEN (s.stakind3 = 2) THEN s.stavalues3
              WHEN (s.stakind4 = 2) THEN s.stavalues4
              WHEN (s.stakind5 = 2) THEN s.stavalues5
              ELSE NULL::anyarray
          END AS histogram_bounds,
          CASE
              WHEN (s.stakind1 = 3) THEN s.stanumbers1[1]
              WHEN (s.stakind2 = 3) THEN s.stanumbers2[1]
              WHEN (s.stakind3 = 3) THEN s.stanumbers3[1]
              WHEN (s.stakind4 = 3) THEN s.stanumbers4[1]
              WHEN (s.stakind5 = 3) THEN s.stanumbers5[1]
              ELSE NULL::real
          END AS correlation,
          CASE
              WHEN (s.stakind1 = 4) THEN s.stavalues1
              WHEN (s.stakind2 = 4) THEN s.stavalues2
              WHEN (s.stakind3 = 4) THEN s.stavalues3
              WHEN (s.stakind4 = 4) THEN s.stavalues4
              WHEN (s.stakind5 = 4) THEN s.stavalues5
              ELSE NULL::anyarray
          END AS most_common_elems,
          CASE
              WHEN (s.stakind1 = 4) THEN s.stanumbers1
              WHEN (s.stakind2 = 4) THEN s.stanumbers2
              WHEN (s.stakind3 = 4) THEN s.stanumbers3
              WHEN (s.stakind4 = 4) THEN s.stanumbers4
              WHEN (s.stakind5 = 4) THEN s.stanumbers5
              ELSE NULL::real[]
          END AS most_common_elem_freqs,
          CASE
              WHEN (s.stakind1 = 5) THEN s.stanumbers1
              WHEN (s.stakind2 = 5) THEN s.stanumbers2
              WHEN (s.stakind3 = 5) THEN s.stanumbers3
              WHEN (s.stakind4 = 5) THEN s.stanumbers4
              WHEN (s.stakind5 = 5) THEN s.stanumbers5
              ELSE NULL::real[]
          END AS elem_count_histogram
     FROM (((pg_statistic s
       JOIN pg_class c ON ((c.oid = s.starelid)))
       JOIN pg_attribute a ON (((c.oid = a.attrelid) AND (a.attnum = s.staattnum))))
       LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
    WHERE ((NOT a.attisdropped) AND has_column_privilege(c.oid, a.attnum, 'select'::text) AND ((c.relrowsecurity = false) OR (NOT row_security_active(c.oid))));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_stats</code>
         */
        val PG_STATS: PgStats = PgStats()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatsRecord> = PgStatsRecord::class.java

    /**
     * The column <code>pg_catalog.pg_stats.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgStatsRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.tablename</code>.
     */
    val TABLENAME: TableField<PgStatsRecord, String?> = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.attname</code>.
     */
    val ATTNAME: TableField<PgStatsRecord, String?> = createField(DSL.name("attname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.inherited</code>.
     */
    val INHERITED: TableField<PgStatsRecord, Boolean?> = createField(DSL.name("inherited"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.null_frac</code>.
     */
    val NULL_FRAC: TableField<PgStatsRecord, Float?> = createField(DSL.name("null_frac"), SQLDataType.REAL, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.avg_width</code>.
     */
    val AVG_WIDTH: TableField<PgStatsRecord, Int?> = createField(DSL.name("avg_width"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.n_distinct</code>.
     */
    val N_DISTINCT: TableField<PgStatsRecord, Float?> = createField(DSL.name("n_distinct"), SQLDataType.REAL, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.most_common_vals</code>.
     */
    val MOST_COMMON_VALS: TableField<PgStatsRecord, Array<Any?>?> = createField(DSL.name("most_common_vals"), SQLDataType.OTHER.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_stats.most_common_freqs</code>.
     */
    val MOST_COMMON_FREQS: TableField<PgStatsRecord, Array<Float?>?> = createField(DSL.name("most_common_freqs"), SQLDataType.REAL.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_stats.histogram_bounds</code>.
     */
    val HISTOGRAM_BOUNDS: TableField<PgStatsRecord, Array<Any?>?> = createField(DSL.name("histogram_bounds"), SQLDataType.OTHER.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_stats.correlation</code>.
     */
    val CORRELATION: TableField<PgStatsRecord, Float?> = createField(DSL.name("correlation"), SQLDataType.REAL, this, "")

    /**
     * The column <code>pg_catalog.pg_stats.most_common_elems</code>.
     */
    val MOST_COMMON_ELEMS: TableField<PgStatsRecord, Array<Any?>?> = createField(DSL.name("most_common_elems"), SQLDataType.OTHER.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_stats.most_common_elem_freqs</code>.
     */
    val MOST_COMMON_ELEM_FREQS: TableField<PgStatsRecord, Array<Float?>?> = createField(DSL.name("most_common_elem_freqs"), SQLDataType.REAL.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_stats.elem_count_histogram</code>.
     */
    val ELEM_COUNT_HISTOGRAM: TableField<PgStatsRecord, Array<Float?>?> = createField(DSL.name("elem_count_histogram"), SQLDataType.REAL.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgStatsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_stats</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stats</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stats</code> table reference
     */
    constructor(): this(DSL.name("pg_stats"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStats = PgStats(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStats = PgStats(alias, this)
    override fun `as`(alias: Table<*>): PgStats = PgStats(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStats = PgStats(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStats = PgStats(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStats = PgStats(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStats = PgStats(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStats = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStats = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStats = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStats = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStats = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStats = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStats = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStats = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStats = where(DSL.notExists(select))
}