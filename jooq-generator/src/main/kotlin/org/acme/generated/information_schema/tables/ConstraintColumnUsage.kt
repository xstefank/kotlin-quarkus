/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.ConstraintColumnUsageRecord
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
open class ConstraintColumnUsage(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ConstraintColumnUsageRecord>?,
    parentPath: InverseForeignKey<out Record, ConstraintColumnUsageRecord>?,
    aliased: Table<ConstraintColumnUsageRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ConstraintColumnUsageRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "constraint_column_usage" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
      (x.tblschema)::information_schema.sql_identifier AS table_schema,
      (x.tblname)::information_schema.sql_identifier AS table_name,
      (x.colname)::information_schema.sql_identifier AS column_name,
      (current_database())::information_schema.sql_identifier AS constraint_catalog,
      (x.cstrschema)::information_schema.sql_identifier AS constraint_schema,
      (x.cstrname)::information_schema.sql_identifier AS constraint_name
     FROM ( SELECT DISTINCT nr.nspname,
              r.relname,
              r.relowner,
              a.attname,
              nc.nspname,
              c.conname
             FROM pg_namespace nr,
              pg_class r,
              pg_attribute a,
              pg_depend d,
              pg_namespace nc,
              pg_constraint c
            WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (d.refobjid = r.oid) AND (d.refobjsubid = a.attnum) AND (d.classid = ('pg_constraint'::regclass)::oid) AND (d.objid = c.oid) AND (c.connamespace = nc.oid) AND (c.contype = 'c'::"char") AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND (NOT a.attisdropped))
          UNION ALL
           SELECT nr.nspname,
              r.relname,
              r.relowner,
              a.attname,
              nc.nspname,
              c.conname
             FROM pg_namespace nr,
              pg_class r,
              pg_attribute a,
              pg_namespace nc,
              pg_constraint c
            WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (nc.oid = c.connamespace) AND (r.oid =
                  CASE c.contype
                      WHEN 'f'::"char" THEN c.confrelid
                      ELSE c.conrelid
                  END) AND (a.attnum = ANY (
                  CASE c.contype
                      WHEN 'f'::"char" THEN c.confkey
                      ELSE c.conkey
                  END)) AND (NOT a.attisdropped) AND (c.contype = ANY (ARRAY['p'::"char", 'u'::"char", 'f'::"char"])) AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])))) x(tblschema, tblname, tblowner, colname, cstrschema, cstrname)
    WHERE pg_has_role(x.tblowner, 'USAGE'::text);
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.constraint_column_usage</code>
         */
        val CONSTRAINT_COLUMN_USAGE: ConstraintColumnUsage = ConstraintColumnUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ConstraintColumnUsageRecord> = ConstraintColumnUsageRecord::class.java

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<ConstraintColumnUsageRecord, String?> = createField(DSL.name("table_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<ConstraintColumnUsageRecord, String?> = createField(DSL.name("table_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_name</code>.
     */
    val TABLE_NAME: TableField<ConstraintColumnUsageRecord, String?> = createField(DSL.name("table_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.constraint_column_usage.column_name</code>.
     */
    val COLUMN_NAME: TableField<ConstraintColumnUsageRecord, String?> = createField(DSL.name("column_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_catalog</code>.
     */
    val CONSTRAINT_CATALOG: TableField<ConstraintColumnUsageRecord, String?> = createField(DSL.name("constraint_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_schema</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<ConstraintColumnUsageRecord, String?> = createField(DSL.name("constraint_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_name</code>.
     */
    val CONSTRAINT_NAME: TableField<ConstraintColumnUsageRecord, String?> = createField(DSL.name("constraint_name"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<ConstraintColumnUsageRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ConstraintColumnUsageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ConstraintColumnUsageRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.constraint_column_usage</code> table
     * reference
     */
    constructor(): this(DSL.name("constraint_column_usage"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ConstraintColumnUsage = ConstraintColumnUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): ConstraintColumnUsage = ConstraintColumnUsage(alias, this)
    override fun `as`(alias: Table<*>): ConstraintColumnUsage = ConstraintColumnUsage(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ConstraintColumnUsage = ConstraintColumnUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ConstraintColumnUsage = ConstraintColumnUsage(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ConstraintColumnUsage = ConstraintColumnUsage(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ConstraintColumnUsage = ConstraintColumnUsage(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ConstraintColumnUsage = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ConstraintColumnUsage = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ConstraintColumnUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ConstraintColumnUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ConstraintColumnUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ConstraintColumnUsage = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ConstraintColumnUsage = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ConstraintColumnUsage = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ConstraintColumnUsage = where(DSL.notExists(select))
}
