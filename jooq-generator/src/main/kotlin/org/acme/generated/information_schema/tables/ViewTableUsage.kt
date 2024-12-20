/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.ViewTableUsageRecord
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
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ViewTableUsage(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ViewTableUsageRecord>?,
    parentPath: InverseForeignKey<out Record, ViewTableUsageRecord>?,
    aliased: Table<ViewTableUsageRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ViewTableUsageRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "view_table_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS view_catalog,
      (nv.nspname)::information_schema.sql_identifier AS view_schema,
      (v.relname)::information_schema.sql_identifier AS view_name,
      (current_database())::information_schema.sql_identifier AS table_catalog,
      (nt.nspname)::information_schema.sql_identifier AS table_schema,
      (t.relname)::information_schema.sql_identifier AS table_name
     FROM pg_namespace nv,
      pg_class v,
      pg_depend dv,
      pg_depend dt,
      pg_class t,
      pg_namespace nt
    WHERE ((nv.oid = v.relnamespace) AND (v.relkind = 'v'::"char") AND (v.oid = dv.refobjid) AND (dv.refclassid = ('pg_class'::regclass)::oid) AND (dv.classid = ('pg_rewrite'::regclass)::oid) AND (dv.deptype = 'i'::"char") AND (dv.objid = dt.objid) AND (dv.refobjid <> dt.refobjid) AND (dt.classid = ('pg_rewrite'::regclass)::oid) AND (dt.refclassid = ('pg_class'::regclass)::oid) AND (dt.refobjid = t.oid) AND (t.relnamespace = nt.oid) AND (t.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND pg_has_role(t.relowner, 'USAGE'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.view_table_usage</code>
         */
        val VIEW_TABLE_USAGE: ViewTableUsage = ViewTableUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ViewTableUsageRecord> = ViewTableUsageRecord::class.java

    /**
     * The column <code>information_schema.view_table_usage.view_catalog</code>.
     */
    val VIEW_CATALOG: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("view_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.view_table_usage.view_schema</code>.
     */
    val VIEW_SCHEMA: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("view_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.view_table_usage.view_name</code>.
     */
    val VIEW_NAME: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("view_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.view_table_usage.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("table_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.view_table_usage.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("table_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.view_table_usage.table_name</code>.
     */
    val TABLE_NAME: TableField<ViewTableUsageRecord, String?> = createField(DSL.name("table_name"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<ViewTableUsageRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ViewTableUsageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ViewTableUsageRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.view_table_usage</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.view_table_usage</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.view_table_usage</code> table reference
     */
    constructor(): this(DSL.name("view_table_usage"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ViewTableUsage = ViewTableUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): ViewTableUsage = ViewTableUsage(alias, this)
    override fun `as`(alias: Table<*>): ViewTableUsage = ViewTableUsage(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ViewTableUsage = ViewTableUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ViewTableUsage = ViewTableUsage(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ViewTableUsage = ViewTableUsage(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ViewTableUsage = ViewTableUsage(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ViewTableUsage = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ViewTableUsage = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ViewTableUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ViewTableUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ViewTableUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ViewTableUsage = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ViewTableUsage = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ViewTableUsage = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ViewTableUsage = where(DSL.notExists(select))
}
