/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatioAllSequencesRecord
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
open class PgStatioAllSequences(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatioAllSequencesRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatioAllSequencesRecord>?,
    aliased: Table<PgStatioAllSequencesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatioAllSequencesRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_statio_all_sequences" as  SELECT c.oid AS relid,
      n.nspname AS schemaname,
      c.relname,
      (pg_stat_get_blocks_fetched(c.oid) - pg_stat_get_blocks_hit(c.oid)) AS blks_read,
      pg_stat_get_blocks_hit(c.oid) AS blks_hit
     FROM (pg_class c
       LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
    WHERE (c.relkind = 'S'::"char");
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_statio_all_sequences</code>
         */
        val PG_STATIO_ALL_SEQUENCES: PgStatioAllSequences = PgStatioAllSequences()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatioAllSequencesRecord> = PgStatioAllSequencesRecord::class.java

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.relid</code>.
     */
    val RELID: TableField<PgStatioAllSequencesRecord, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgStatioAllSequencesRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.relname</code>.
     */
    val RELNAME: TableField<PgStatioAllSequencesRecord, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.blks_read</code>.
     */
    val BLKS_READ: TableField<PgStatioAllSequencesRecord, Long?> = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_statio_all_sequences.blks_hit</code>.
     */
    val BLKS_HIT: TableField<PgStatioAllSequencesRecord, Long?> = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PgStatioAllSequencesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatioAllSequencesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatioAllSequencesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_sequences</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_sequences</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_statio_all_sequences</code> table reference
     */
    constructor(): this(DSL.name("pg_statio_all_sequences"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatioAllSequences = PgStatioAllSequences(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatioAllSequences = PgStatioAllSequences(alias, this)
    override fun `as`(alias: Table<*>): PgStatioAllSequences = PgStatioAllSequences(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatioAllSequences = PgStatioAllSequences(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatioAllSequences = PgStatioAllSequences(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatioAllSequences = PgStatioAllSequences(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatioAllSequences = PgStatioAllSequences(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatioAllSequences = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatioAllSequences = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatioAllSequences = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatioAllSequences = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatioAllSequences = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatioAllSequences = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatioAllSequences = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatioAllSequences = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatioAllSequences = where(DSL.notExists(select))
}