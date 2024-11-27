/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_EXTENSION_NAME_INDEX
import org.acme.generated.pg_catalog.keys.PG_EXTENSION_OID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgExtensionRecord
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
open class PgExtension(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgExtensionRecord>?,
    parentPath: InverseForeignKey<out Record, PgExtensionRecord>?,
    aliased: Table<PgExtensionRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgExtensionRecord>(
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
         * The reference instance of <code>pg_catalog.pg_extension</code>
         */
        val PG_EXTENSION: PgExtension = PgExtension()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgExtensionRecord> = PgExtensionRecord::class.java

    /**
     * The column <code>pg_catalog.pg_extension.oid</code>.
     */
    val OID: TableField<PgExtensionRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_extension.extname</code>.
     */
    val EXTNAME: TableField<PgExtensionRecord, String?> = createField(DSL.name("extname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_extension.extowner</code>.
     */
    val EXTOWNER: TableField<PgExtensionRecord, Long?> = createField(DSL.name("extowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_extension.extnamespace</code>.
     */
    val EXTNAMESPACE: TableField<PgExtensionRecord, Long?> = createField(DSL.name("extnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_extension.extrelocatable</code>.
     */
    val EXTRELOCATABLE: TableField<PgExtensionRecord, Boolean?> = createField(DSL.name("extrelocatable"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_extension.extversion</code>.
     */
    val EXTVERSION: TableField<PgExtensionRecord, String?> = createField(DSL.name("extversion"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_extension.extconfig</code>.
     */
    val EXTCONFIG: TableField<PgExtensionRecord, Array<Long?>?> = createField(DSL.name("extconfig"), SQLDataType.BIGINT.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_extension.extcondition</code>.
     */
    val EXTCONDITION: TableField<PgExtensionRecord, Array<String?>?> = createField(DSL.name("extcondition"), SQLDataType.CLOB.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgExtensionRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgExtensionRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgExtensionRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_extension</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_extension</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_extension</code> table reference
     */
    constructor(): this(DSL.name("pg_extension"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgExtensionRecord> = PG_EXTENSION_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgExtensionRecord>> = listOf(PG_EXTENSION_NAME_INDEX)
    override fun `as`(alias: String): PgExtension = PgExtension(DSL.name(alias), this)
    override fun `as`(alias: Name): PgExtension = PgExtension(alias, this)
    override fun `as`(alias: Table<*>): PgExtension = PgExtension(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgExtension = PgExtension(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgExtension = PgExtension(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgExtension = PgExtension(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgExtension = PgExtension(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgExtension = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgExtension = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgExtension = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgExtension = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgExtension = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgExtension = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgExtension = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgExtension = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgExtension = where(DSL.notExists(select))
}
