/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_SUBSCRIPTION_REL_SRRELID_SRSUBID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgSubscriptionRelRecord
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
import org.jooq.impl.DefaultDataType
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgSubscriptionRel(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgSubscriptionRelRecord>?,
    parentPath: InverseForeignKey<out Record, PgSubscriptionRelRecord>?,
    aliased: Table<PgSubscriptionRelRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgSubscriptionRelRecord>(
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
         * The reference instance of <code>pg_catalog.pg_subscription_rel</code>
         */
        val PG_SUBSCRIPTION_REL: PgSubscriptionRel = PgSubscriptionRel()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgSubscriptionRelRecord> = PgSubscriptionRelRecord::class.java

    /**
     * The column <code>pg_catalog.pg_subscription_rel.srsubid</code>.
     */
    val SRSUBID: TableField<PgSubscriptionRelRecord, Long?> = createField(DSL.name("srsubid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_subscription_rel.srrelid</code>.
     */
    val SRRELID: TableField<PgSubscriptionRelRecord, Long?> = createField(DSL.name("srrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_subscription_rel.srsubstate</code>.
     */
    val SRSUBSTATE: TableField<PgSubscriptionRelRecord, String?> = createField(DSL.name("srsubstate"), SQLDataType.CHAR.nullable(false), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val SRSUBLSN: TableField<PgSubscriptionRelRecord, Any?> = createField(DSL.name("srsublsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    private constructor(alias: Name, aliased: Table<PgSubscriptionRelRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgSubscriptionRelRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgSubscriptionRelRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_subscription_rel</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_subscription_rel</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_subscription_rel</code> table reference
     */
    constructor(): this(DSL.name("pg_subscription_rel"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgSubscriptionRelRecord> = PG_SUBSCRIPTION_REL_SRRELID_SRSUBID_INDEX
    override fun `as`(alias: String): PgSubscriptionRel = PgSubscriptionRel(DSL.name(alias), this)
    override fun `as`(alias: Name): PgSubscriptionRel = PgSubscriptionRel(alias, this)
    override fun `as`(alias: Table<*>): PgSubscriptionRel = PgSubscriptionRel(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgSubscriptionRel = PgSubscriptionRel(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgSubscriptionRel = PgSubscriptionRel(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgSubscriptionRel = PgSubscriptionRel(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgSubscriptionRel = PgSubscriptionRel(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgSubscriptionRel = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgSubscriptionRel = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgSubscriptionRel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgSubscriptionRel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgSubscriptionRel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgSubscriptionRel = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgSubscriptionRel = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgSubscriptionRel = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgSubscriptionRel = where(DSL.notExists(select))
}