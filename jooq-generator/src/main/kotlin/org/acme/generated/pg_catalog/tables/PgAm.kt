/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_AM_NAME_INDEX
import org.acme.generated.pg_catalog.keys.PG_AM_OID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgAmRecord
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
open class PgAm(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgAmRecord>?,
    parentPath: InverseForeignKey<out Record, PgAmRecord>?,
    aliased: Table<PgAmRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgAmRecord>(
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
         * The reference instance of <code>pg_catalog.pg_am</code>
         */
        val PG_AM: PgAm = PgAm()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgAmRecord> = PgAmRecord::class.java

    /**
     * The column <code>pg_catalog.pg_am.oid</code>.
     */
    val OID: TableField<PgAmRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_am.amname</code>.
     */
    val AMNAME: TableField<PgAmRecord, String?> = createField(DSL.name("amname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_am.amhandler</code>.
     */
    val AMHANDLER: TableField<PgAmRecord, String?> = createField(DSL.name("amhandler"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_am.amtype</code>.
     */
    val AMTYPE: TableField<PgAmRecord, String?> = createField(DSL.name("amtype"), SQLDataType.CHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgAmRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgAmRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgAmRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_am</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_am</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_am</code> table reference
     */
    constructor(): this(DSL.name("pg_am"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgAmRecord> = PG_AM_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgAmRecord>> = listOf(PG_AM_NAME_INDEX)
    override fun `as`(alias: String): PgAm = PgAm(DSL.name(alias), this)
    override fun `as`(alias: Name): PgAm = PgAm(alias, this)
    override fun `as`(alias: Table<*>): PgAm = PgAm(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgAm = PgAm(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgAm = PgAm(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgAm = PgAm(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgAm = PgAm(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgAm = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgAm = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgAm = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgAm = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgAm = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgAm = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgAm = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgAm = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgAm = where(DSL.notExists(select))
}