/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CARDINAL_NUMBER
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.tables.records.SqlSizingRecord
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
open class SqlSizing(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, SqlSizingRecord>?,
    parentPath: InverseForeignKey<out Record, SqlSizingRecord>?,
    aliased: Table<SqlSizingRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<SqlSizingRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>information_schema.sql_sizing</code>
         */
        val SQL_SIZING: SqlSizing = SqlSizing()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SqlSizingRecord> = SqlSizingRecord::class.java

    /**
     * The column <code>information_schema.sql_sizing.sizing_id</code>.
     */
    val SIZING_ID: TableField<SqlSizingRecord, Int?> = createField(DSL.name("sizing_id"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.sql_sizing.sizing_name</code>.
     */
    val SIZING_NAME: TableField<SqlSizingRecord, String?> = createField(DSL.name("sizing_name"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.sql_sizing.supported_value</code>.
     */
    val SUPPORTED_VALUE: TableField<SqlSizingRecord, Int?> = createField(DSL.name("supported_value"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.sql_sizing.comments</code>.
     */
    val COMMENTS: TableField<SqlSizingRecord, String?> = createField(DSL.name("comments"), CHARACTER_DATA.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<SqlSizingRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<SqlSizingRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<SqlSizingRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.sql_sizing</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.sql_sizing</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.sql_sizing</code> table reference
     */
    constructor(): this(DSL.name("sql_sizing"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): SqlSizing = SqlSizing(DSL.name(alias), this)
    override fun `as`(alias: Name): SqlSizing = SqlSizing(alias, this)
    override fun `as`(alias: Table<*>): SqlSizing = SqlSizing(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SqlSizing = SqlSizing(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SqlSizing = SqlSizing(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SqlSizing = SqlSizing(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): SqlSizing = SqlSizing(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): SqlSizing = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): SqlSizing = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): SqlSizing = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): SqlSizing = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): SqlSizing = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): SqlSizing = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): SqlSizing = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): SqlSizing = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): SqlSizing = where(DSL.notExists(select))
}
