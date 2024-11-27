/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_LANGUAGE_NAME_INDEX
import org.acme.generated.pg_catalog.keys.PG_LANGUAGE_OID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgLanguageRecord
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
open class PgLanguage(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgLanguageRecord>?,
    parentPath: InverseForeignKey<out Record, PgLanguageRecord>?,
    aliased: Table<PgLanguageRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgLanguageRecord>(
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
         * The reference instance of <code>pg_catalog.pg_language</code>
         */
        val PG_LANGUAGE: PgLanguage = PgLanguage()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgLanguageRecord> = PgLanguageRecord::class.java

    /**
     * The column <code>pg_catalog.pg_language.oid</code>.
     */
    val OID: TableField<PgLanguageRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanname</code>.
     */
    val LANNAME: TableField<PgLanguageRecord, String?> = createField(DSL.name("lanname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanowner</code>.
     */
    val LANOWNER: TableField<PgLanguageRecord, Long?> = createField(DSL.name("lanowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanispl</code>.
     */
    val LANISPL: TableField<PgLanguageRecord, Boolean?> = createField(DSL.name("lanispl"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    val LANPLTRUSTED: TableField<PgLanguageRecord, Boolean?> = createField(DSL.name("lanpltrusted"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    val LANPLCALLFOID: TableField<PgLanguageRecord, Long?> = createField(DSL.name("lanplcallfoid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.laninline</code>.
     */
    val LANINLINE: TableField<PgLanguageRecord, Long?> = createField(DSL.name("laninline"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    val LANVALIDATOR: TableField<PgLanguageRecord, Long?> = createField(DSL.name("lanvalidator"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_language.lanacl</code>.
     */
    val LANACL: TableField<PgLanguageRecord, Array<String?>?> = createField(DSL.name("lanacl"), SQLDataType.VARCHAR.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgLanguageRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgLanguageRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgLanguageRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_language</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_language</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_language</code> table reference
     */
    constructor(): this(DSL.name("pg_language"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgLanguageRecord> = PG_LANGUAGE_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgLanguageRecord>> = listOf(PG_LANGUAGE_NAME_INDEX)
    override fun `as`(alias: String): PgLanguage = PgLanguage(DSL.name(alias), this)
    override fun `as`(alias: Name): PgLanguage = PgLanguage(alias, this)
    override fun `as`(alias: Table<*>): PgLanguage = PgLanguage(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLanguage = PgLanguage(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLanguage = PgLanguage(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgLanguage = PgLanguage(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgLanguage = PgLanguage(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgLanguage = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgLanguage = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgLanguage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgLanguage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgLanguage = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgLanguage = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgLanguage = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgLanguage = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgLanguage = where(DSL.notExists(select))
}