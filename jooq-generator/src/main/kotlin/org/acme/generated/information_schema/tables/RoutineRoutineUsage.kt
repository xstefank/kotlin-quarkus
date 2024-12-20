/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.RoutineRoutineUsageRecord
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
open class RoutineRoutineUsage(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RoutineRoutineUsageRecord>?,
    parentPath: InverseForeignKey<out Record, RoutineRoutineUsageRecord>?,
    aliased: Table<RoutineRoutineUsageRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RoutineRoutineUsageRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "routine_routine_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS specific_catalog,
      (np.nspname)::information_schema.sql_identifier AS specific_schema,
      (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,
      (current_database())::information_schema.sql_identifier AS routine_catalog,
      (np1.nspname)::information_schema.sql_identifier AS routine_schema,
      (nameconcatoid(p1.proname, p1.oid))::information_schema.sql_identifier AS routine_name
     FROM pg_namespace np,
      pg_proc p,
      pg_depend d,
      pg_proc p1,
      pg_namespace np1
    WHERE ((np.oid = p.pronamespace) AND (p.oid = d.objid) AND (d.classid = ('pg_proc'::regclass)::oid) AND (d.refobjid = p1.oid) AND (d.refclassid = ('pg_proc'::regclass)::oid) AND (p1.pronamespace = np1.oid) AND (p.prokind = ANY (ARRAY['f'::"char", 'p'::"char"])) AND (p1.prokind = ANY (ARRAY['f'::"char", 'p'::"char"])) AND pg_has_role(p1.proowner, 'USAGE'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.routine_routine_usage</code>
         */
        val ROUTINE_ROUTINE_USAGE: RoutineRoutineUsage = RoutineRoutineUsage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RoutineRoutineUsageRecord> = RoutineRoutineUsageRecord::class.java

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_catalog</code>.
     */
    val SPECIFIC_CATALOG: TableField<RoutineRoutineUsageRecord, String?> = createField(DSL.name("specific_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_schema</code>.
     */
    val SPECIFIC_SCHEMA: TableField<RoutineRoutineUsageRecord, String?> = createField(DSL.name("specific_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_name</code>.
     */
    val SPECIFIC_NAME: TableField<RoutineRoutineUsageRecord, String?> = createField(DSL.name("specific_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_catalog</code>.
     */
    val ROUTINE_CATALOG: TableField<RoutineRoutineUsageRecord, String?> = createField(DSL.name("routine_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_schema</code>.
     */
    val ROUTINE_SCHEMA: TableField<RoutineRoutineUsageRecord, String?> = createField(DSL.name("routine_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_name</code>.
     */
    val ROUTINE_NAME: TableField<RoutineRoutineUsageRecord, String?> = createField(DSL.name("routine_name"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<RoutineRoutineUsageRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RoutineRoutineUsageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RoutineRoutineUsageRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.routine_routine_usage</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.routine_routine_usage</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.routine_routine_usage</code> table
     * reference
     */
    constructor(): this(DSL.name("routine_routine_usage"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): RoutineRoutineUsage = RoutineRoutineUsage(DSL.name(alias), this)
    override fun `as`(alias: Name): RoutineRoutineUsage = RoutineRoutineUsage(alias, this)
    override fun `as`(alias: Table<*>): RoutineRoutineUsage = RoutineRoutineUsage(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RoutineRoutineUsage = RoutineRoutineUsage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RoutineRoutineUsage = RoutineRoutineUsage(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RoutineRoutineUsage = RoutineRoutineUsage(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): RoutineRoutineUsage = RoutineRoutineUsage(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): RoutineRoutineUsage = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): RoutineRoutineUsage = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): RoutineRoutineUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): RoutineRoutineUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): RoutineRoutineUsage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): RoutineRoutineUsage = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): RoutineRoutineUsage = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): RoutineRoutineUsage = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): RoutineRoutineUsage = where(DSL.notExists(select))
}
