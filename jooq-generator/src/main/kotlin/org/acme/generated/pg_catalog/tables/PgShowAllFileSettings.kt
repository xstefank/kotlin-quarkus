/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgShowAllFileSettingsRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
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
open class PgShowAllFileSettings(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgShowAllFileSettingsRecord>?,
    parentPath: InverseForeignKey<out Record, PgShowAllFileSettingsRecord>?,
    aliased: Table<PgShowAllFileSettingsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgShowAllFileSettingsRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function(),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_show_all_file_settings</code>
         */
        val PG_SHOW_ALL_FILE_SETTINGS: PgShowAllFileSettings = PgShowAllFileSettings()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgShowAllFileSettingsRecord> = PgShowAllFileSettingsRecord::class.java

    /**
     * The column <code>pg_catalog.pg_show_all_file_settings.sourcefile</code>.
     */
    val SOURCEFILE: TableField<PgShowAllFileSettingsRecord, String?> = createField(DSL.name("sourcefile"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_show_all_file_settings.sourceline</code>.
     */
    val SOURCELINE: TableField<PgShowAllFileSettingsRecord, Int?> = createField(DSL.name("sourceline"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_show_all_file_settings.seqno</code>.
     */
    val SEQNO: TableField<PgShowAllFileSettingsRecord, Int?> = createField(DSL.name("seqno"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_show_all_file_settings.name</code>.
     */
    val NAME: TableField<PgShowAllFileSettingsRecord, String?> = createField(DSL.name("name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_show_all_file_settings.setting</code>.
     */
    val SETTING: TableField<PgShowAllFileSettingsRecord, String?> = createField(DSL.name("setting"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_show_all_file_settings.applied</code>.
     */
    val APPLIED: TableField<PgShowAllFileSettingsRecord, Boolean?> = createField(DSL.name("applied"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_show_all_file_settings.error</code>.
     */
    val ERROR: TableField<PgShowAllFileSettingsRecord, String?> = createField(DSL.name("error"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<PgShowAllFileSettingsRecord>?): this(alias, null, null, null, aliased, arrayOf(
    ), null)
    private constructor(alias: Name, aliased: Table<PgShowAllFileSettingsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.pg_show_all_file_settings</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_show_all_file_settings</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_show_all_file_settings</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_show_all_file_settings"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgShowAllFileSettings = PgShowAllFileSettings(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgShowAllFileSettings = PgShowAllFileSettings(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgShowAllFileSettings = PgShowAllFileSettings(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgShowAllFileSettings = PgShowAllFileSettings(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgShowAllFileSettings = PgShowAllFileSettings(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgShowAllFileSettings = PgShowAllFileSettings(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgShowAllFileSettings = PgShowAllFileSettings(DSL.name("pg_show_all_file_settings"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
