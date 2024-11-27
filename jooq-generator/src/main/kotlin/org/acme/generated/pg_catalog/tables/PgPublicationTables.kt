/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgPublicationTablesRecord
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
open class PgPublicationTables(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgPublicationTablesRecord>?,
    parentPath: InverseForeignKey<out Record, PgPublicationTablesRecord>?,
    aliased: Table<PgPublicationTablesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgPublicationTablesRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_publication_tables" as  SELECT p.pubname,
      n.nspname AS schemaname,
      c.relname AS tablename
     FROM pg_publication p,
      LATERAL pg_get_publication_tables((p.pubname)::text) gpt(relid),
      (pg_class c
       JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
    WHERE (c.oid = gpt.relid);
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_publication_tables</code>
         */
        val PG_PUBLICATION_TABLES: PgPublicationTables = PgPublicationTables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgPublicationTablesRecord> = PgPublicationTablesRecord::class.java

    /**
     * The column <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    val PUBNAME: TableField<PgPublicationTablesRecord, String?> = createField(DSL.name("pubname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgPublicationTablesRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    val TABLENAME: TableField<PgPublicationTablesRecord, String?> = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "")

    private constructor(alias: Name, aliased: Table<PgPublicationTablesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgPublicationTablesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgPublicationTablesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_publication_tables</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_publication_tables</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_publication_tables</code> table reference
     */
    constructor(): this(DSL.name("pg_publication_tables"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgPublicationTables = PgPublicationTables(DSL.name(alias), this)
    override fun `as`(alias: Name): PgPublicationTables = PgPublicationTables(alias, this)
    override fun `as`(alias: Table<*>): PgPublicationTables = PgPublicationTables(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgPublicationTables = PgPublicationTables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgPublicationTables = PgPublicationTables(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgPublicationTables = PgPublicationTables(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgPublicationTables = PgPublicationTables(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgPublicationTables = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgPublicationTables = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgPublicationTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgPublicationTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgPublicationTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgPublicationTables = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgPublicationTables = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgPublicationTables = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgPublicationTables = where(DSL.notExists(select))
}
