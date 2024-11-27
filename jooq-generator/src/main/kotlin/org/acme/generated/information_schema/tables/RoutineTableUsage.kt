/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.RoutineTableUsageRecord
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
open class RoutineTableUsage(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RoutineTableUsageRecord>?,
    parentPath: InverseForeignKey<out Record, RoutineTableUsageRecord>?,
    aliased: Table<RoutineTableUsageRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RoutineTableUsageRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "routine_table_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS specific_catalog,
      (np.nspname)::information_schema.sql_identifier AS specific_schema,
      (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,
      (current_database())::information_schema.sql_identifier AS routine_catalog,
      (np.nspname)::information_schema.sql_identifier AS routine_schema,
      (p.proname)::information_schema.sql_identifier AS routine_name,
      (current_database())::information_schema.sql_identifier AS table_catalog,
      (nt.nspname)::information_schema.sql_identifier AS table_schema,
      (t.relname)::information_schema.sql_identifier AS table_name
     FROM pg_namespace np,
      pg_proc p,
      pg_depend d,
      pg_class t,
      pg_namespace nt
    WHERE ((np.oid = p.pronamespace) AND (p.oid = d.objid) AND (d.classid = ('pg_proc'::regclass)::oid) AND (d.refobjid = t.oid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (t.relnamespace = nt.oid) AND (t.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND pg_has_role(t.relowner, 'USAGE'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.routine_table_usage</code>
         */
        val ROUTINE_TABLE_USAGE: RoutineTableUsage = RoutineTableUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RoutineTableUsageRecord> = RoutineTableUsageRecord::class.java

    /**
     * The column
     * <code>information_schema.routine_table_usage.specific_catalog</code>.
     */
    val SPECIFIC_CATALOG: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("specific_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.specific_schema</code>.
     */
    val SPECIFIC_SCHEMA: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("specific_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.specific_name</code>.
     */
    val SPECIFIC_NAME: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("specific_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.routine_catalog</code>.
     */
    val ROUTINE_CATALOG: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("routine_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.routine_schema</code>.
     */
    val ROUTINE_SCHEMA: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("routine_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.routine_name</code>.
     */
    val ROUTINE_NAME: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("routine_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("table_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("table_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_table_usage.table_name</code>.
     */
    val TABLE_NAME: TableField<RoutineTableUsageRecord, String?> = createField(DSL.name("table_name"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<RoutineTableUsageRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RoutineTableUsageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RoutineTableUsageRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.routine_table_usage</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.routine_table_usage</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.routine_table_usage</code> table
     * reference
     */
    constructor(): this(DSL.name("routine_table_usage"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): RoutineTableUsage = RoutineTableUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): RoutineTableUsage = RoutineTableUsage(alias, this)
    override fun `as`(alias: Table<*>): RoutineTableUsage = RoutineTableUsage(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RoutineTableUsage = RoutineTableUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RoutineTableUsage = RoutineTableUsage(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RoutineTableUsage = RoutineTableUsage(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): RoutineTableUsage = RoutineTableUsage(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): RoutineTableUsage = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): RoutineTableUsage = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): RoutineTableUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): RoutineTableUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): RoutineTableUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): RoutineTableUsage = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): RoutineTableUsage = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): RoutineTableUsage = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): RoutineTableUsage = where(DSL.notExists(select))
}
