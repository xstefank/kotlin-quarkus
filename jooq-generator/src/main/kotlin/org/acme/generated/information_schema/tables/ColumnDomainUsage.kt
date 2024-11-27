/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.ColumnDomainUsageRecord
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
open class ColumnDomainUsage(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ColumnDomainUsageRecord>?,
    parentPath: InverseForeignKey<out Record, ColumnDomainUsageRecord>?,
    aliased: Table<ColumnDomainUsageRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ColumnDomainUsageRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "column_domain_usage" as  SELECT (current_database())::information_schema.sql_identifier AS domain_catalog,
      (nt.nspname)::information_schema.sql_identifier AS domain_schema,
      (t.typname)::information_schema.sql_identifier AS domain_name,
      (current_database())::information_schema.sql_identifier AS table_catalog,
      (nc.nspname)::information_schema.sql_identifier AS table_schema,
      (c.relname)::information_schema.sql_identifier AS table_name,
      (a.attname)::information_schema.sql_identifier AS column_name
     FROM pg_type t,
      pg_namespace nt,
      pg_class c,
      pg_namespace nc,
      pg_attribute a
    WHERE ((t.typnamespace = nt.oid) AND (c.relnamespace = nc.oid) AND (a.attrelid = c.oid) AND (a.atttypid = t.oid) AND (t.typtype = 'd'::"char") AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (a.attnum > 0) AND (NOT a.attisdropped) AND pg_has_role(t.typowner, 'USAGE'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.column_domain_usage</code>
         */
        val COLUMN_DOMAIN_USAGE: ColumnDomainUsage = ColumnDomainUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ColumnDomainUsageRecord> = ColumnDomainUsageRecord::class.java

    /**
     * The column
     * <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    val DOMAIN_CATALOG: TableField<ColumnDomainUsageRecord, String?> = createField(DSL.name("domain_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    val DOMAIN_SCHEMA: TableField<ColumnDomainUsageRecord, String?> = createField(DSL.name("domain_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_domain_usage.domain_name</code>.
     */
    val DOMAIN_NAME: TableField<ColumnDomainUsageRecord, String?> = createField(DSL.name("domain_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<ColumnDomainUsageRecord, String?> = createField(DSL.name("table_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_domain_usage.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<ColumnDomainUsageRecord, String?> = createField(DSL.name("table_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_domain_usage.table_name</code>.
     */
    val TABLE_NAME: TableField<ColumnDomainUsageRecord, String?> = createField(DSL.name("table_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_domain_usage.column_name</code>.
     */
    val COLUMN_NAME: TableField<ColumnDomainUsageRecord, String?> = createField(DSL.name("column_name"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<ColumnDomainUsageRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ColumnDomainUsageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ColumnDomainUsageRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.column_domain_usage</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.column_domain_usage</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.column_domain_usage</code> table
     * reference
     */
    constructor(): this(DSL.name("column_domain_usage"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ColumnDomainUsage = ColumnDomainUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): ColumnDomainUsage = ColumnDomainUsage(alias, this)
    override fun `as`(alias: Table<*>): ColumnDomainUsage = ColumnDomainUsage(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ColumnDomainUsage = ColumnDomainUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ColumnDomainUsage = ColumnDomainUsage(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ColumnDomainUsage = ColumnDomainUsage(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ColumnDomainUsage = ColumnDomainUsage(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ColumnDomainUsage = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ColumnDomainUsage = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ColumnDomainUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ColumnDomainUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ColumnDomainUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ColumnDomainUsage = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ColumnDomainUsage = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ColumnDomainUsage = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ColumnDomainUsage = where(DSL.notExists(select))
}
