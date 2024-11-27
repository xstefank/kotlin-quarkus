/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgOptionsToTableRecord
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
open class PgOptionsToTable(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgOptionsToTableRecord>?,
    parentPath: InverseForeignKey<out Record, PgOptionsToTableRecord>?,
    aliased: Table<PgOptionsToTableRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgOptionsToTableRecord>(
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
         * The reference instance of <code>pg_catalog.pg_options_to_table</code>
         */
        val PG_OPTIONS_TO_TABLE: PgOptionsToTable = PgOptionsToTable()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgOptionsToTableRecord> = PgOptionsToTableRecord::class.java

    /**
     * The column <code>pg_catalog.pg_options_to_table.option_name</code>.
     */
    val OPTION_NAME: TableField<PgOptionsToTableRecord, String?> = createField(DSL.name("option_name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_options_to_table.option_value</code>.
     */
    val OPTION_VALUE: TableField<PgOptionsToTableRecord, String?> = createField(DSL.name("option_value"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<PgOptionsToTableRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.CLOB.array())
    ), null)
    private constructor(alias: Name, aliased: Table<PgOptionsToTableRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.pg_options_to_table</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_options_to_table</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_options_to_table</code> table reference
     */
    constructor(): this(DSL.name("pg_options_to_table"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgOptionsToTable = PgOptionsToTable(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgOptionsToTable = PgOptionsToTable(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgOptionsToTable = PgOptionsToTable(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgOptionsToTable = PgOptionsToTable(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgOptionsToTable = PgOptionsToTable(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgOptionsToTable = PgOptionsToTable(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          optionsArray: Array<String?>?
    ): PgOptionsToTable = PgOptionsToTable(DSL.name("pg_options_to_table"), null, arrayOf(
        DSL.value(optionsArray, SQLDataType.CLOB.array())
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          optionsArray: Field<Array<String?>?>
    ): PgOptionsToTable = PgOptionsToTable(DSL.name("pg_options_to_table"), null, arrayOf(
        optionsArray
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
