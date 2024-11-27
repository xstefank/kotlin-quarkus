/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_PROC_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_PROC_PRONAME_ARGS_NSP_INDEX
import org.acme.generated.pg_catalog.tables.records.PgProcRecord
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
open class PgProc(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgProcRecord>?,
    parentPath: InverseForeignKey<out Record, PgProcRecord>?,
    aliased: Table<PgProcRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgProcRecord>(
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
         * The reference instance of <code>pg_catalog.pg_proc</code>
         */
        val PG_PROC: PgProc = PgProc()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgProcRecord> = PgProcRecord::class.java

    /**
     * The column <code>pg_catalog.pg_proc.oid</code>.
     */
    val OID: TableField<PgProcRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proname</code>.
     */
    val PRONAME: TableField<PgProcRecord, String?> = createField(DSL.name("proname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.pronamespace</code>.
     */
    val PRONAMESPACE: TableField<PgProcRecord, Long?> = createField(DSL.name("pronamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proowner</code>.
     */
    val PROOWNER: TableField<PgProcRecord, Long?> = createField(DSL.name("proowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.prolang</code>.
     */
    val PROLANG: TableField<PgProcRecord, Long?> = createField(DSL.name("prolang"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.procost</code>.
     */
    val PROCOST: TableField<PgProcRecord, Float?> = createField(DSL.name("procost"), SQLDataType.REAL.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.prorows</code>.
     */
    val PROROWS: TableField<PgProcRecord, Float?> = createField(DSL.name("prorows"), SQLDataType.REAL.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.provariadic</code>.
     */
    val PROVARIADIC: TableField<PgProcRecord, Long?> = createField(DSL.name("provariadic"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.prosupport</code>.
     */
    val PROSUPPORT: TableField<PgProcRecord, String?> = createField(DSL.name("prosupport"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.prokind</code>.
     */
    val PROKIND: TableField<PgProcRecord, String?> = createField(DSL.name("prokind"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.prosecdef</code>.
     */
    val PROSECDEF: TableField<PgProcRecord, Boolean?> = createField(DSL.name("prosecdef"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proleakproof</code>.
     */
    val PROLEAKPROOF: TableField<PgProcRecord, Boolean?> = createField(DSL.name("proleakproof"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proisstrict</code>.
     */
    val PROISSTRICT: TableField<PgProcRecord, Boolean?> = createField(DSL.name("proisstrict"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proretset</code>.
     */
    val PRORETSET: TableField<PgProcRecord, Boolean?> = createField(DSL.name("proretset"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.provolatile</code>.
     */
    val PROVOLATILE: TableField<PgProcRecord, String?> = createField(DSL.name("provolatile"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proparallel</code>.
     */
    val PROPARALLEL: TableField<PgProcRecord, String?> = createField(DSL.name("proparallel"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.pronargs</code>.
     */
    val PRONARGS: TableField<PgProcRecord, Short?> = createField(DSL.name("pronargs"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.pronargdefaults</code>.
     */
    val PRONARGDEFAULTS: TableField<PgProcRecord, Short?> = createField(DSL.name("pronargdefaults"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.prorettype</code>.
     */
    val PRORETTYPE: TableField<PgProcRecord, Long?> = createField(DSL.name("prorettype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proargtypes</code>.
     */
    val PROARGTYPES: TableField<PgProcRecord, Array<Any?>?> = createField(DSL.name("proargtypes"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").nullable(false).array(), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proallargtypes</code>.
     */
    val PROALLARGTYPES: TableField<PgProcRecord, Array<Long?>?> = createField(DSL.name("proallargtypes"), SQLDataType.BIGINT.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proargmodes</code>.
     */
    val PROARGMODES: TableField<PgProcRecord, Array<String?>?> = createField(DSL.name("proargmodes"), SQLDataType.CHAR.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proargnames</code>.
     */
    val PROARGNAMES: TableField<PgProcRecord, Array<String?>?> = createField(DSL.name("proargnames"), SQLDataType.CLOB.array(), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val PROARGDEFAULTS: TableField<PgProcRecord, Any?> = createField(DSL.name("proargdefaults"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.protrftypes</code>.
     */
    val PROTRFTYPES: TableField<PgProcRecord, Array<Long?>?> = createField(DSL.name("protrftypes"), SQLDataType.BIGINT.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.prosrc</code>.
     */
    val PROSRC: TableField<PgProcRecord, String?> = createField(DSL.name("prosrc"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.probin</code>.
     */
    val PROBIN: TableField<PgProcRecord, String?> = createField(DSL.name("probin"), SQLDataType.CLOB, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val PROSQLBODY: TableField<PgProcRecord, Any?> = createField(DSL.name("prosqlbody"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proconfig</code>.
     */
    val PROCONFIG: TableField<PgProcRecord, Array<String?>?> = createField(DSL.name("proconfig"), SQLDataType.CLOB.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_proc.proacl</code>.
     */
    val PROACL: TableField<PgProcRecord, Array<String?>?> = createField(DSL.name("proacl"), SQLDataType.VARCHAR.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgProcRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgProcRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgProcRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_proc</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_proc</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_proc</code> table reference
     */
    constructor(): this(DSL.name("pg_proc"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgProcRecord> = PG_PROC_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgProcRecord>> = listOf(PG_PROC_PRONAME_ARGS_NSP_INDEX)
    override fun `as`(alias: String): PgProc = PgProc(DSL.name(alias), this)
    override fun `as`(alias: Name): PgProc = PgProc(alias, this)
    override fun `as`(alias: Table<*>): PgProc = PgProc(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgProc = PgProc(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgProc = PgProc(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgProc = PgProc(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgProc = PgProc(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgProc = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgProc = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgProc = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgProc = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgProc = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgProc = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgProc = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgProc = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgProc = where(DSL.notExists(select))
}
