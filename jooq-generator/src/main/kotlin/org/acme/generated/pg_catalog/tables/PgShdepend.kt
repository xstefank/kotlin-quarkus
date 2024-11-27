/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.indexes.PG_SHDEPEND_DEPENDER_INDEX
import org.acme.generated.pg_catalog.indexes.PG_SHDEPEND_REFERENCE_INDEX
import org.acme.generated.pg_catalog.tables.records.PgShdependRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
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
open class PgShdepend(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgShdependRecord>?,
    parentPath: InverseForeignKey<out Record, PgShdependRecord>?,
    aliased: Table<PgShdependRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgShdependRecord>(
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
         * The reference instance of <code>pg_catalog.pg_shdepend</code>
         */
        val PG_SHDEPEND: PgShdepend = PgShdepend()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgShdependRecord> = PgShdependRecord::class.java

    /**
     * The column <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    val DBID: TableField<PgShdependRecord, Long?> = createField(DSL.name("dbid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_shdepend.classid</code>.
     */
    val CLASSID: TableField<PgShdependRecord, Long?> = createField(DSL.name("classid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_shdepend.objid</code>.
     */
    val OBJID: TableField<PgShdependRecord, Long?> = createField(DSL.name("objid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    val OBJSUBID: TableField<PgShdependRecord, Int?> = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    val REFCLASSID: TableField<PgShdependRecord, Long?> = createField(DSL.name("refclassid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    val REFOBJID: TableField<PgShdependRecord, Long?> = createField(DSL.name("refobjid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    val DEPTYPE: TableField<PgShdependRecord, String?> = createField(DSL.name("deptype"), SQLDataType.CHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgShdependRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgShdependRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgShdependRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_shdepend</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_shdepend</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_shdepend</code> table reference
     */
    constructor(): this(DSL.name("pg_shdepend"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_SHDEPEND_DEPENDER_INDEX, PG_SHDEPEND_REFERENCE_INDEX)
    override fun `as`(alias: String): PgShdepend = PgShdepend(DSL.name(alias), this)
    override fun `as`(alias: Name): PgShdepend = PgShdepend(alias, this)
    override fun `as`(alias: Table<*>): PgShdepend = PgShdepend(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgShdepend = PgShdepend(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgShdepend = PgShdepend(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgShdepend = PgShdepend(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgShdepend = PgShdepend(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgShdepend = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgShdepend = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgShdepend = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgShdepend = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgShdepend = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgShdepend = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgShdepend = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgShdepend = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgShdepend = where(DSL.notExists(select))
}