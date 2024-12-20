/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.indexes.PG_STATISTIC_EXT_RELID_INDEX
import org.acme.generated.pg_catalog.keys.PG_STATISTIC_EXT_NAME_INDEX
import org.acme.generated.pg_catalog.keys.PG_STATISTIC_EXT_OID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgStatisticExtRecord
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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.DefaultDataType
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatisticExt(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatisticExtRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatisticExtRecord>?,
    aliased: Table<PgStatisticExtRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatisticExtRecord>(
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
         * The reference instance of <code>pg_catalog.pg_statistic_ext</code>
         */
        val PG_STATISTIC_EXT: PgStatisticExt = PgStatisticExt()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatisticExtRecord> = PgStatisticExtRecord::class.java

    /**
     * The column <code>pg_catalog.pg_statistic_ext.oid</code>.
     */
    val OID: TableField<PgStatisticExtRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxrelid</code>.
     */
    val STXRELID: TableField<PgStatisticExtRecord, Long?> = createField(DSL.name("stxrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxname</code>.
     */
    val STXNAME: TableField<PgStatisticExtRecord, String?> = createField(DSL.name("stxname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxnamespace</code>.
     */
    val STXNAMESPACE: TableField<PgStatisticExtRecord, Long?> = createField(DSL.name("stxnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxowner</code>.
     */
    val STXOWNER: TableField<PgStatisticExtRecord, Long?> = createField(DSL.name("stxowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxstattarget</code>.
     */
    val STXSTATTARGET: TableField<PgStatisticExtRecord, Int?> = createField(DSL.name("stxstattarget"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkeys</code>.
     */
    val STXKEYS: TableField<PgStatisticExtRecord, Array<Any?>?> = createField(DSL.name("stxkeys"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").nullable(false).array(), this, "")

    /**
     * The column <code>pg_catalog.pg_statistic_ext.stxkind</code>.
     */
    val STXKIND: TableField<PgStatisticExtRecord, Array<String?>?> = createField(DSL.name("stxkind"), SQLDataType.CHAR.nullable(false).array(), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val STXEXPRS: TableField<PgStatisticExtRecord, Any?> = createField(DSL.name("stxexprs"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "")

    private constructor(alias: Name, aliased: Table<PgStatisticExtRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatisticExtRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatisticExtRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_statistic_ext</code> table reference
     */
    constructor(): this(DSL.name("pg_statistic_ext"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_STATISTIC_EXT_RELID_INDEX)
    override fun getPrimaryKey(): UniqueKey<PgStatisticExtRecord> = PG_STATISTIC_EXT_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgStatisticExtRecord>> = listOf(PG_STATISTIC_EXT_NAME_INDEX)
    override fun `as`(alias: String): PgStatisticExt = PgStatisticExt(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatisticExt = PgStatisticExt(alias, this)
    override fun `as`(alias: Table<*>): PgStatisticExt = PgStatisticExt(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatisticExt = PgStatisticExt(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatisticExt = PgStatisticExt(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatisticExt = PgStatisticExt(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatisticExt = PgStatisticExt(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatisticExt = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatisticExt = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatisticExt = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatisticExt = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatisticExt = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatisticExt = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatisticExt = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatisticExt = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatisticExt = where(DSL.notExists(select))
}
