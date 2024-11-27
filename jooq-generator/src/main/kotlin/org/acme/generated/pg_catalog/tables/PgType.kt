/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_TYPE_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_TYPE_TYPNAME_NSP_INDEX
import org.acme.generated.pg_catalog.tables.records.PgTypeRecord
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
open class PgType(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgTypeRecord>?,
    parentPath: InverseForeignKey<out Record, PgTypeRecord>?,
    aliased: Table<PgTypeRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgTypeRecord>(
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
         * The reference instance of <code>pg_catalog.pg_type</code>
         */
        val PG_TYPE: PgType = PgType()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgTypeRecord> = PgTypeRecord::class.java

    /**
     * The column <code>pg_catalog.pg_type.oid</code>.
     */
    val OID: TableField<PgTypeRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typname</code>.
     */
    val TYPNAME: TableField<PgTypeRecord, String?> = createField(DSL.name("typname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typnamespace</code>.
     */
    val TYPNAMESPACE: TableField<PgTypeRecord, Long?> = createField(DSL.name("typnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typowner</code>.
     */
    val TYPOWNER: TableField<PgTypeRecord, Long?> = createField(DSL.name("typowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typlen</code>.
     */
    val TYPLEN: TableField<PgTypeRecord, Short?> = createField(DSL.name("typlen"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typbyval</code>.
     */
    val TYPBYVAL: TableField<PgTypeRecord, Boolean?> = createField(DSL.name("typbyval"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typtype</code>.
     */
    val TYPTYPE: TableField<PgTypeRecord, String?> = createField(DSL.name("typtype"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typcategory</code>.
     */
    val TYPCATEGORY: TableField<PgTypeRecord, String?> = createField(DSL.name("typcategory"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typispreferred</code>.
     */
    val TYPISPREFERRED: TableField<PgTypeRecord, Boolean?> = createField(DSL.name("typispreferred"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typisdefined</code>.
     */
    val TYPISDEFINED: TableField<PgTypeRecord, Boolean?> = createField(DSL.name("typisdefined"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typdelim</code>.
     */
    val TYPDELIM: TableField<PgTypeRecord, String?> = createField(DSL.name("typdelim"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typrelid</code>.
     */
    val TYPRELID: TableField<PgTypeRecord, Long?> = createField(DSL.name("typrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typsubscript</code>.
     */
    val TYPSUBSCRIPT: TableField<PgTypeRecord, String?> = createField(DSL.name("typsubscript"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typelem</code>.
     */
    val TYPELEM: TableField<PgTypeRecord, Long?> = createField(DSL.name("typelem"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typarray</code>.
     */
    val TYPARRAY: TableField<PgTypeRecord, Long?> = createField(DSL.name("typarray"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typinput</code>.
     */
    val TYPINPUT: TableField<PgTypeRecord, String?> = createField(DSL.name("typinput"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typoutput</code>.
     */
    val TYPOUTPUT: TableField<PgTypeRecord, String?> = createField(DSL.name("typoutput"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typreceive</code>.
     */
    val TYPRECEIVE: TableField<PgTypeRecord, String?> = createField(DSL.name("typreceive"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typsend</code>.
     */
    val TYPSEND: TableField<PgTypeRecord, String?> = createField(DSL.name("typsend"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typmodin</code>.
     */
    val TYPMODIN: TableField<PgTypeRecord, String?> = createField(DSL.name("typmodin"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typmodout</code>.
     */
    val TYPMODOUT: TableField<PgTypeRecord, String?> = createField(DSL.name("typmodout"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typanalyze</code>.
     */
    val TYPANALYZE: TableField<PgTypeRecord, String?> = createField(DSL.name("typanalyze"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typalign</code>.
     */
    val TYPALIGN: TableField<PgTypeRecord, String?> = createField(DSL.name("typalign"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typstorage</code>.
     */
    val TYPSTORAGE: TableField<PgTypeRecord, String?> = createField(DSL.name("typstorage"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typnotnull</code>.
     */
    val TYPNOTNULL: TableField<PgTypeRecord, Boolean?> = createField(DSL.name("typnotnull"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typbasetype</code>.
     */
    val TYPBASETYPE: TableField<PgTypeRecord, Long?> = createField(DSL.name("typbasetype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typtypmod</code>.
     */
    val TYPTYPMOD: TableField<PgTypeRecord, Int?> = createField(DSL.name("typtypmod"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typndims</code>.
     */
    val TYPNDIMS: TableField<PgTypeRecord, Int?> = createField(DSL.name("typndims"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typcollation</code>.
     */
    val TYPCOLLATION: TableField<PgTypeRecord, Long?> = createField(DSL.name("typcollation"), SQLDataType.BIGINT.nullable(false), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val TYPDEFAULTBIN: TableField<PgTypeRecord, Any?> = createField(DSL.name("typdefaultbin"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "")

    /**
     * The column <code>pg_catalog.pg_type.typdefault</code>.
     */
    val TYPDEFAULT: TableField<PgTypeRecord, String?> = createField(DSL.name("typdefault"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_type.typacl</code>.
     */
    val TYPACL: TableField<PgTypeRecord, Array<String?>?> = createField(DSL.name("typacl"), SQLDataType.VARCHAR.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgTypeRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgTypeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgTypeRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_type</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_type</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_type</code> table reference
     */
    constructor(): this(DSL.name("pg_type"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgTypeRecord> = PG_TYPE_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgTypeRecord>> = listOf(PG_TYPE_TYPNAME_NSP_INDEX)
    override fun `as`(alias: String): PgType = PgType(DSL.name(alias), this)
    override fun `as`(alias: Name): PgType = PgType(alias, this)
    override fun `as`(alias: Table<*>): PgType = PgType(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgType = PgType(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgType = PgType(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgType = PgType(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgType = PgType(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgType = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgType = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgType = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgType = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgType = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgType = where(DSL.notExists(select))
}
