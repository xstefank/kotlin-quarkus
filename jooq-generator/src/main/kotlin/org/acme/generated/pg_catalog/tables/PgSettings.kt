/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgSettingsRecord
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
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgSettings(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgSettingsRecord>?,
    parentPath: InverseForeignKey<out Record, PgSettingsRecord>?,
    aliased: Table<PgSettingsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgSettingsRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_settings" as  SELECT a.name,
     a.setting,
     a.unit,
     a.category,
     a.short_desc,
     a.extra_desc,
     a.context,
     a.vartype,
     a.source,
     a.min_val,
     a.max_val,
     a.enumvals,
     a.boot_val,
     a.reset_val,
     a.sourcefile,
     a.sourceline,
     a.pending_restart
    FROM pg_show_all_settings() a(name, setting, unit, category, short_desc, extra_desc, context, vartype, source, min_val, max_val, enumvals, boot_val, reset_val, sourcefile, sourceline, pending_restart);
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_settings</code>
         */
        val PG_SETTINGS: PgSettings = PgSettings()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgSettingsRecord> = PgSettingsRecord::class.java

    /**
     * The column <code>pg_catalog.pg_settings.name</code>.
     */
    val NAME: TableField<PgSettingsRecord, String?> = createField(DSL.name("name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.setting</code>.
     */
    val SETTING: TableField<PgSettingsRecord, String?> = createField(DSL.name("setting"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.unit</code>.
     */
    val UNIT: TableField<PgSettingsRecord, String?> = createField(DSL.name("unit"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.category</code>.
     */
    val CATEGORY: TableField<PgSettingsRecord, String?> = createField(DSL.name("category"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.short_desc</code>.
     */
    val SHORT_DESC: TableField<PgSettingsRecord, String?> = createField(DSL.name("short_desc"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.extra_desc</code>.
     */
    val EXTRA_DESC: TableField<PgSettingsRecord, String?> = createField(DSL.name("extra_desc"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.context</code>.
     */
    val CONTEXT: TableField<PgSettingsRecord, String?> = createField(DSL.name("context"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.vartype</code>.
     */
    val VARTYPE: TableField<PgSettingsRecord, String?> = createField(DSL.name("vartype"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.source</code>.
     */
    val SOURCE: TableField<PgSettingsRecord, String?> = createField(DSL.name("source"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.min_val</code>.
     */
    val MIN_VAL: TableField<PgSettingsRecord, String?> = createField(DSL.name("min_val"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.max_val</code>.
     */
    val MAX_VAL: TableField<PgSettingsRecord, String?> = createField(DSL.name("max_val"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.enumvals</code>.
     */
    val ENUMVALS: TableField<PgSettingsRecord, Array<String?>?> = createField(DSL.name("enumvals"), SQLDataType.CLOB.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_settings.boot_val</code>.
     */
    val BOOT_VAL: TableField<PgSettingsRecord, String?> = createField(DSL.name("boot_val"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.reset_val</code>.
     */
    val RESET_VAL: TableField<PgSettingsRecord, String?> = createField(DSL.name("reset_val"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.sourcefile</code>.
     */
    val SOURCEFILE: TableField<PgSettingsRecord, String?> = createField(DSL.name("sourcefile"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.sourceline</code>.
     */
    val SOURCELINE: TableField<PgSettingsRecord, Int?> = createField(DSL.name("sourceline"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_settings.pending_restart</code>.
     */
    val PENDING_RESTART: TableField<PgSettingsRecord, Boolean?> = createField(DSL.name("pending_restart"), SQLDataType.BOOLEAN, this, "")

    private constructor(alias: Name, aliased: Table<PgSettingsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgSettingsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgSettingsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_settings</code> table reference
     */
    constructor(): this(DSL.name("pg_settings"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgSettings = PgSettings(DSL.name(alias), this)
    override fun `as`(alias: Name): PgSettings = PgSettings(alias, this)
    override fun `as`(alias: Table<*>): PgSettings = PgSettings(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgSettings = PgSettings(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgSettings = PgSettings(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgSettings = PgSettings(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgSettings = PgSettings(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgSettings = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgSettings = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgSettings = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgSettings = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgSettings = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgSettings = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgSettings = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgSettings = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgSettings = where(DSL.notExists(select))
}
