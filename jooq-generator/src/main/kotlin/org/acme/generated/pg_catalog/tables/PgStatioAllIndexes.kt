/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatioAllIndexesRecord
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
open class PgStatioAllIndexes(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatioAllIndexesRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatioAllIndexesRecord>?,
    aliased: Table<PgStatioAllIndexesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatioAllIndexesRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_statio_all_indexes" as  SELECT c.oid AS relid,
      i.oid AS indexrelid,
      n.nspname AS schemaname,
      c.relname,
      i.relname AS indexrelname,
      (pg_stat_get_blocks_fetched(i.oid) - pg_stat_get_blocks_hit(i.oid)) AS idx_blks_read,
      pg_stat_get_blocks_hit(i.oid) AS idx_blks_hit
     FROM (((pg_class c
       JOIN pg_index x ON ((c.oid = x.indrelid)))
       JOIN pg_class i ON ((i.oid = x.indexrelid)))
       LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
    WHERE (c.relkind = ANY (ARRAY['r'::"char", 't'::"char", 'm'::"char"]));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_statio_all_indexes</code>
         */
        val PG_STATIO_ALL_INDEXES: PgStatioAllIndexes = PgStatioAllIndexes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatioAllIndexesRecord> = PgStatioAllIndexesRecord::class.java

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.relid</code>.
     */
    val RELID: TableField<PgStatioAllIndexesRecord, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.indexrelid</code>.
     */
    val INDEXRELID: TableField<PgStatioAllIndexesRecord, Long?> = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgStatioAllIndexesRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.relname</code>.
     */
    val RELNAME: TableField<PgStatioAllIndexesRecord, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.indexrelname</code>.
     */
    val INDEXRELNAME: TableField<PgStatioAllIndexesRecord, String?> = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.idx_blks_read</code>.
     */
    val IDX_BLKS_READ: TableField<PgStatioAllIndexesRecord, Long?> = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_indexes.idx_blks_hit</code>.
     */
    val IDX_BLKS_HIT: TableField<PgStatioAllIndexesRecord, Long?> = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PgStatioAllIndexesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatioAllIndexesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatioAllIndexesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_indexes</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_indexes</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_statio_all_indexes</code> table reference
     */
    constructor(): this(DSL.name("pg_statio_all_indexes"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatioAllIndexes = PgStatioAllIndexes(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatioAllIndexes = PgStatioAllIndexes(alias, this)
    override fun `as`(alias: Table<*>): PgStatioAllIndexes = PgStatioAllIndexes(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatioAllIndexes = PgStatioAllIndexes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatioAllIndexes = PgStatioAllIndexes(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatioAllIndexes = PgStatioAllIndexes(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatioAllIndexes = PgStatioAllIndexes(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatioAllIndexes = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatioAllIndexes = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatioAllIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatioAllIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatioAllIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatioAllIndexes = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatioAllIndexes = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatioAllIndexes = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatioAllIndexes = where(DSL.notExists(select))
}
