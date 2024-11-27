/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.indexes.PG_CLASS_TBLSPC_RELFILENODE_INDEX
import org.acme.generated.pg_catalog.keys.PG_CLASS_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_CLASS_RELNAME_NSP_INDEX
import org.acme.generated.pg_catalog.tables.records.PgClassRecord
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
open class PgClass(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgClassRecord>?,
    parentPath: InverseForeignKey<out Record, PgClassRecord>?,
    aliased: Table<PgClassRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgClassRecord>(
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
         * The reference instance of <code>pg_catalog.pg_class</code>
         */
        val PG_CLASS: PgClass = PgClass()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgClassRecord> = PgClassRecord::class.java

    /**
     * The column <code>pg_catalog.pg_class.oid</code>.
     */
    val OID: TableField<PgClassRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relname</code>.
     */
    val RELNAME: TableField<PgClassRecord, String?> = createField(DSL.name("relname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relnamespace</code>.
     */
    val RELNAMESPACE: TableField<PgClassRecord, Long?> = createField(DSL.name("relnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltype</code>.
     */
    val RELTYPE: TableField<PgClassRecord, Long?> = createField(DSL.name("reltype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reloftype</code>.
     */
    val RELOFTYPE: TableField<PgClassRecord, Long?> = createField(DSL.name("reloftype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relowner</code>.
     */
    val RELOWNER: TableField<PgClassRecord, Long?> = createField(DSL.name("relowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relam</code>.
     */
    val RELAM: TableField<PgClassRecord, Long?> = createField(DSL.name("relam"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relfilenode</code>.
     */
    val RELFILENODE: TableField<PgClassRecord, Long?> = createField(DSL.name("relfilenode"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltablespace</code>.
     */
    val RELTABLESPACE: TableField<PgClassRecord, Long?> = createField(DSL.name("reltablespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relpages</code>.
     */
    val RELPAGES: TableField<PgClassRecord, Int?> = createField(DSL.name("relpages"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltuples</code>.
     */
    val RELTUPLES: TableField<PgClassRecord, Float?> = createField(DSL.name("reltuples"), SQLDataType.REAL.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relallvisible</code>.
     */
    val RELALLVISIBLE: TableField<PgClassRecord, Int?> = createField(DSL.name("relallvisible"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reltoastrelid</code>.
     */
    val RELTOASTRELID: TableField<PgClassRecord, Long?> = createField(DSL.name("reltoastrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhasindex</code>.
     */
    val RELHASINDEX: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relhasindex"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relisshared</code>.
     */
    val RELISSHARED: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relisshared"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relpersistence</code>.
     */
    val RELPERSISTENCE: TableField<PgClassRecord, String?> = createField(DSL.name("relpersistence"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relkind</code>.
     */
    val RELKIND: TableField<PgClassRecord, String?> = createField(DSL.name("relkind"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relnatts</code>.
     */
    val RELNATTS: TableField<PgClassRecord, Short?> = createField(DSL.name("relnatts"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relchecks</code>.
     */
    val RELCHECKS: TableField<PgClassRecord, Short?> = createField(DSL.name("relchecks"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhasrules</code>.
     */
    val RELHASRULES: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relhasrules"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhastriggers</code>.
     */
    val RELHASTRIGGERS: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relhastriggers"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relhassubclass</code>.
     */
    val RELHASSUBCLASS: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relhassubclass"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relrowsecurity</code>.
     */
    val RELROWSECURITY: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relrowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relforcerowsecurity</code>.
     */
    val RELFORCEROWSECURITY: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relforcerowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relispopulated</code>.
     */
    val RELISPOPULATED: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relispopulated"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relreplident</code>.
     */
    val RELREPLIDENT: TableField<PgClassRecord, String?> = createField(DSL.name("relreplident"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relispartition</code>.
     */
    val RELISPARTITION: TableField<PgClassRecord, Boolean?> = createField(DSL.name("relispartition"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relrewrite</code>.
     */
    val RELREWRITE: TableField<PgClassRecord, Long?> = createField(DSL.name("relrewrite"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relfrozenxid</code>.
     */
    val RELFROZENXID: TableField<PgClassRecord, Long?> = createField(DSL.name("relfrozenxid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relminmxid</code>.
     */
    val RELMINMXID: TableField<PgClassRecord, Long?> = createField(DSL.name("relminmxid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_class.relacl</code>.
     */
    val RELACL: TableField<PgClassRecord, Array<String?>?> = createField(DSL.name("relacl"), SQLDataType.VARCHAR.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_class.reloptions</code>.
     */
    val RELOPTIONS: TableField<PgClassRecord, Array<String?>?> = createField(DSL.name("reloptions"), SQLDataType.CLOB.array(), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val RELPARTBOUND: TableField<PgClassRecord, Any?> = createField(DSL.name("relpartbound"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "")

    private constructor(alias: Name, aliased: Table<PgClassRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgClassRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgClassRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_class</code> table reference
     */
    constructor(): this(DSL.name("pg_class"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getIndexes(): List<Index> = listOf(PG_CLASS_TBLSPC_RELFILENODE_INDEX)
    override fun getPrimaryKey(): UniqueKey<PgClassRecord> = PG_CLASS_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgClassRecord>> = listOf(PG_CLASS_RELNAME_NSP_INDEX)
    override fun `as`(alias: String): PgClass = PgClass(DSL.name(alias), this)
    override fun `as`(alias: Name): PgClass = PgClass(alias, this)
    override fun `as`(alias: Table<*>): PgClass = PgClass(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgClass = PgClass(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgClass = PgClass(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgClass = PgClass(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgClass = PgClass(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgClass = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgClass = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgClass = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgClass = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgClass = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgClass = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgClass = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgClass = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgClass = where(DSL.notExists(select))
}
