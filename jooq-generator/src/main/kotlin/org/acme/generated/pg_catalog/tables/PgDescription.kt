/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_DESCRIPTION_O_C_O_INDEX
import org.acme.generated.pg_catalog.tables.records.PgDescriptionRecord
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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgDescription(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgDescriptionRecord>?,
    parentPath: InverseForeignKey<out Record, PgDescriptionRecord>?,
    aliased: Table<PgDescriptionRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgDescriptionRecord>(
    alias,
    PgCatalog.PG_CATALOG,
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
         * The reference instance of <code>pg_catalog.pg_description</code>
         */
        val PG_DESCRIPTION: PgDescription = PgDescription()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgDescriptionRecord> = PgDescriptionRecord::class.java

    /**
     * The column <code>pg_catalog.pg_description.objoid</code>.
     */
    val OBJOID: TableField<PgDescriptionRecord, Long?> = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_description.classoid</code>.
     */
    val CLASSOID: TableField<PgDescriptionRecord, Long?> = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_description.objsubid</code>.
     */
    val OBJSUBID: TableField<PgDescriptionRecord, Int?> = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_description.description</code>.
     */
    val DESCRIPTION: TableField<PgDescriptionRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgDescriptionRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgDescriptionRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgDescriptionRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_description</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_description</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_description</code> table reference
     */
    constructor(): this(DSL.name("pg_description"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgDescriptionRecord> = PG_DESCRIPTION_O_C_O_INDEX
    override fun `as`(alias: String): PgDescription = PgDescription(DSL.name(alias), this)
    override fun `as`(alias: Name): PgDescription = PgDescription(alias, this)
    override fun `as`(alias: Table<*>): PgDescription = PgDescription(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgDescription = PgDescription(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgDescription = PgDescription(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgDescription = PgDescription(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgDescription = PgDescription(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgDescription = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgDescription = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgDescription = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgDescription = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgDescription = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgDescription = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgDescription = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgDescription = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgDescription = where(DSL.notExists(select))
}
