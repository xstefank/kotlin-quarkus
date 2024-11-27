/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_SECLABEL_OBJECT_INDEX
import org.acme.generated.pg_catalog.tables.records.PgSeclabelRecord
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
open class PgSeclabel(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgSeclabelRecord>?,
    parentPath: InverseForeignKey<out Record, PgSeclabelRecord>?,
    aliased: Table<PgSeclabelRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgSeclabelRecord>(
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
         * The reference instance of <code>pg_catalog.pg_seclabel</code>
         */
        val PG_SECLABEL: PgSeclabel = PgSeclabel()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgSeclabelRecord> = PgSeclabelRecord::class.java

    /**
     * The column <code>pg_catalog.pg_seclabel.objoid</code>.
     */
    val OBJOID: TableField<PgSeclabelRecord, Long?> = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_seclabel.classoid</code>.
     */
    val CLASSOID: TableField<PgSeclabelRecord, Long?> = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_seclabel.objsubid</code>.
     */
    val OBJSUBID: TableField<PgSeclabelRecord, Int?> = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_seclabel.provider</code>.
     */
    val PROVIDER: TableField<PgSeclabelRecord, String?> = createField(DSL.name("provider"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_seclabel.label</code>.
     */
    val LABEL: TableField<PgSeclabelRecord, String?> = createField(DSL.name("label"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgSeclabelRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgSeclabelRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgSeclabelRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_seclabel</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_seclabel</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_seclabel</code> table reference
     */
    constructor(): this(DSL.name("pg_seclabel"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgSeclabelRecord> = PG_SECLABEL_OBJECT_INDEX
    override fun `as`(alias: String): PgSeclabel = PgSeclabel(DSL.name(alias), this)
    override fun `as`(alias: Name): PgSeclabel = PgSeclabel(alias, this)
    override fun `as`(alias: Table<*>): PgSeclabel = PgSeclabel(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgSeclabel = PgSeclabel(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgSeclabel = PgSeclabel(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgSeclabel = PgSeclabel(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgSeclabel = PgSeclabel(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgSeclabel = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgSeclabel = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgSeclabel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgSeclabel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgSeclabel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgSeclabel = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgSeclabel = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgSeclabel = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgSeclabel = where(DSL.notExists(select))
}