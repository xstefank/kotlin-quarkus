/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatUserIndexesRecord
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
open class PgStatUserIndexes(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatUserIndexesRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatUserIndexesRecord>?,
    aliased: Table<PgStatUserIndexesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatUserIndexesRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_stat_user_indexes" as  SELECT pg_stat_all_indexes.relid,
      pg_stat_all_indexes.indexrelid,
      pg_stat_all_indexes.schemaname,
      pg_stat_all_indexes.relname,
      pg_stat_all_indexes.indexrelname,
      pg_stat_all_indexes.idx_scan,
      pg_stat_all_indexes.idx_tup_read,
      pg_stat_all_indexes.idx_tup_fetch
     FROM pg_stat_all_indexes
    WHERE ((pg_stat_all_indexes.schemaname <> ALL (ARRAY['pg_catalog'::name, 'information_schema'::name])) AND (pg_stat_all_indexes.schemaname !~ '^pg_toast'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_stat_user_indexes</code>
         */
        val PG_STAT_USER_INDEXES: PgStatUserIndexes = PgStatUserIndexes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatUserIndexesRecord> = PgStatUserIndexesRecord::class.java

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    val RELID: TableField<PgStatUserIndexesRecord, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    val INDEXRELID: TableField<PgStatUserIndexesRecord, Long?> = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgStatUserIndexesRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    val RELNAME: TableField<PgStatUserIndexesRecord, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    val INDEXRELNAME: TableField<PgStatUserIndexesRecord, String?> = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    val IDX_SCAN: TableField<PgStatUserIndexesRecord, Long?> = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    val IDX_TUP_READ: TableField<PgStatUserIndexesRecord, Long?> = createField(DSL.name("idx_tup_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    val IDX_TUP_FETCH: TableField<PgStatUserIndexesRecord, Long?> = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PgStatUserIndexesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatUserIndexesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatUserIndexesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_indexes</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_indexes</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_user_indexes</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_user_indexes"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatUserIndexes = PgStatUserIndexes(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatUserIndexes = PgStatUserIndexes(alias, this)
    override fun `as`(alias: Table<*>): PgStatUserIndexes = PgStatUserIndexes(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatUserIndexes = PgStatUserIndexes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatUserIndexes = PgStatUserIndexes(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatUserIndexes = PgStatUserIndexes(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatUserIndexes = PgStatUserIndexes(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatUserIndexes = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatUserIndexes = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatUserIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatUserIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatUserIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatUserIndexes = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatUserIndexes = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatUserIndexes = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatUserIndexes = where(DSL.notExists(select))
}
