/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_ENUM_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_ENUM_TYPID_LABEL_INDEX
import org.acme.generated.pg_catalog.keys.PG_ENUM_TYPID_SORTORDER_INDEX
import org.acme.generated.pg_catalog.tables.records.PgEnumRecord
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
open class PgEnum(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgEnumRecord>?,
    parentPath: InverseForeignKey<out Record, PgEnumRecord>?,
    aliased: Table<PgEnumRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgEnumRecord>(
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
         * The reference instance of <code>pg_catalog.pg_enum</code>
         */
        val PG_ENUM: PgEnum = PgEnum()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgEnumRecord> = PgEnumRecord::class.java

    /**
     * The column <code>pg_catalog.pg_enum.oid</code>.
     */
    val OID: TableField<PgEnumRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_enum.enumtypid</code>.
     */
    val ENUMTYPID: TableField<PgEnumRecord, Long?> = createField(DSL.name("enumtypid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_enum.enumsortorder</code>.
     */
    val ENUMSORTORDER: TableField<PgEnumRecord, Float?> = createField(DSL.name("enumsortorder"), SQLDataType.REAL.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_enum.enumlabel</code>.
     */
    val ENUMLABEL: TableField<PgEnumRecord, String?> = createField(DSL.name("enumlabel"), SQLDataType.VARCHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgEnumRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgEnumRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgEnumRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_enum</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_enum</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_enum</code> table reference
     */
    constructor(): this(DSL.name("pg_enum"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgEnumRecord> = PG_ENUM_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgEnumRecord>> = listOf(PG_ENUM_TYPID_LABEL_INDEX, PG_ENUM_TYPID_SORTORDER_INDEX)
    override fun `as`(alias: String): PgEnum = PgEnum(DSL.name(alias), this)
    override fun `as`(alias: Name): PgEnum = PgEnum(alias, this)
    override fun `as`(alias: Table<*>): PgEnum = PgEnum(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgEnum = PgEnum(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgEnum = PgEnum(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgEnum = PgEnum(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgEnum = PgEnum(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgEnum = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgEnum = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgEnum = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgEnum = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgEnum = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgEnum = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgEnum = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgEnum = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgEnum = where(DSL.notExists(select))
}
