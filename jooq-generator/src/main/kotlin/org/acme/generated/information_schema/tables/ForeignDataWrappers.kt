/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.ForeignDataWrappersRecord
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
open class ForeignDataWrappers(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ForeignDataWrappersRecord>?,
    parentPath: InverseForeignKey<out Record, ForeignDataWrappersRecord>?,
    aliased: Table<ForeignDataWrappersRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ForeignDataWrappersRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "foreign_data_wrappers" as  SELECT w.foreign_data_wrapper_catalog,
     w.foreign_data_wrapper_name,
     w.authorization_identifier,
     (NULL::character varying)::information_schema.character_data AS library_name,
     w.foreign_data_wrapper_language
    FROM information_schema._pg_foreign_data_wrappers w;
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.foreign_data_wrappers</code>
         */
        val FOREIGN_DATA_WRAPPERS: ForeignDataWrappers = ForeignDataWrappers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ForeignDataWrappersRecord> = ForeignDataWrappersRecord::class.java

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    val FOREIGN_DATA_WRAPPER_CATALOG: TableField<ForeignDataWrappersRecord, String?> = createField(DSL.name("foreign_data_wrapper_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    val FOREIGN_DATA_WRAPPER_NAME: TableField<ForeignDataWrappersRecord, String?> = createField(DSL.name("foreign_data_wrapper_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.authorization_identifier</code>.
     */
    val AUTHORIZATION_IDENTIFIER: TableField<ForeignDataWrappersRecord, String?> = createField(DSL.name("authorization_identifier"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.library_name</code>.
     */
    val LIBRARY_NAME: TableField<ForeignDataWrappersRecord, String?> = createField(DSL.name("library_name"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    val FOREIGN_DATA_WRAPPER_LANGUAGE: TableField<ForeignDataWrappersRecord, String?> = createField(DSL.name("foreign_data_wrapper_language"), CHARACTER_DATA.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<ForeignDataWrappersRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ForeignDataWrappersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ForeignDataWrappersRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.foreign_data_wrappers</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.foreign_data_wrappers</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.foreign_data_wrappers</code> table
     * reference
     */
    constructor(): this(DSL.name("foreign_data_wrappers"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ForeignDataWrappers = ForeignDataWrappers(DSL.name(alias), this)
    override fun `as`(alias: Name): ForeignDataWrappers = ForeignDataWrappers(alias, this)
    override fun `as`(alias: Table<*>): ForeignDataWrappers = ForeignDataWrappers(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ForeignDataWrappers = ForeignDataWrappers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ForeignDataWrappers = ForeignDataWrappers(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ForeignDataWrappers = ForeignDataWrappers(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ForeignDataWrappers = ForeignDataWrappers(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ForeignDataWrappers = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ForeignDataWrappers = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ForeignDataWrappers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ForeignDataWrappers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ForeignDataWrappers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ForeignDataWrappers = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ForeignDataWrappers = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ForeignDataWrappers = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ForeignDataWrappers = where(DSL.notExists(select))
}
