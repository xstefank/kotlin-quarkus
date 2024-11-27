/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgTablesRecord
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
open class PgTables(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgTablesRecord>?,
    parentPath: InverseForeignKey<out Record, PgTablesRecord>?,
    aliased: Table<PgTablesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgTablesRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_tables" as  SELECT n.nspname AS schemaname,
      c.relname AS tablename,
      pg_get_userbyid(c.relowner) AS tableowner,
      t.spcname AS tablespace,
      c.relhasindex AS hasindexes,
      c.relhasrules AS hasrules,
      c.relhastriggers AS hastriggers,
      c.relrowsecurity AS rowsecurity
     FROM ((pg_class c
       LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
       LEFT JOIN pg_tablespace t ON ((t.oid = c.reltablespace)))
    WHERE (c.relkind = ANY (ARRAY['r'::"char", 'p'::"char"]));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_tables</code>
         */
        val PG_TABLES: PgTables = PgTables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgTablesRecord> = PgTablesRecord::class.java

    /**
     * The column <code>pg_catalog.pg_tables.schemaname</code>.
     */
    val SCHEMANAME: TableField<PgTablesRecord, String?> = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_tables.tablename</code>.
     */
    val TABLENAME: TableField<PgTablesRecord, String?> = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_tables.tableowner</code>.
     */
    val TABLEOWNER: TableField<PgTablesRecord, String?> = createField(DSL.name("tableowner"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_tables.tablespace</code>.
     */
    val TABLESPACE: TableField<PgTablesRecord, String?> = createField(DSL.name("tablespace"), SQLDataType.VARCHAR, this, "")

    /**
     * The column <code>pg_catalog.pg_tables.hasindexes</code>.
     */
    val HASINDEXES: TableField<PgTablesRecord, Boolean?> = createField(DSL.name("hasindexes"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_tables.hasrules</code>.
     */
    val HASRULES: TableField<PgTablesRecord, Boolean?> = createField(DSL.name("hasrules"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_tables.hastriggers</code>.
     */
    val HASTRIGGERS: TableField<PgTablesRecord, Boolean?> = createField(DSL.name("hastriggers"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_tables.rowsecurity</code>.
     */
    val ROWSECURITY: TableField<PgTablesRecord, Boolean?> = createField(DSL.name("rowsecurity"), SQLDataType.BOOLEAN, this, "")

    private constructor(alias: Name, aliased: Table<PgTablesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgTablesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgTablesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_tables</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_tables</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_tables</code> table reference
     */
    constructor(): this(DSL.name("pg_tables"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgTables = PgTables(DSL.name(alias), this)
    override fun `as`(alias: Name): PgTables = PgTables(alias, this)
    override fun `as`(alias: Table<*>): PgTables = PgTables(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgTables = PgTables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgTables = PgTables(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgTables = PgTables(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgTables = PgTables(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgTables = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgTables = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgTables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgTables = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgTables = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgTables = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgTables = where(DSL.notExists(select))
}
