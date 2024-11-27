/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.GenerateSeriesRecord
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
open class GenerateSeries(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, GenerateSeriesRecord>?,
    parentPath: InverseForeignKey<out Record, GenerateSeriesRecord>?,
    aliased: Table<GenerateSeriesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<GenerateSeriesRecord>(
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
         * The reference instance of <code>pg_catalog.generate_series</code>
         */
        val GENERATE_SERIES: GenerateSeries = GenerateSeries()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<GenerateSeriesRecord> = GenerateSeriesRecord::class.java

    /**
     * The column <code>pg_catalog.generate_series.generate_series</code>.
     */
    val GENERATE_SERIES_: TableField<GenerateSeriesRecord, Long?> = createField(DSL.name("generate_series"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<GenerateSeriesRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.BIGINT),
        DSL.value(null, SQLDataType.BIGINT)
    ), null)
    private constructor(alias: Name, aliased: Table<GenerateSeriesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.generate_series</code> table reference
     */
    constructor(): this(DSL.name("generate_series"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): GenerateSeries = GenerateSeries(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): GenerateSeries = GenerateSeries(alias, this, parameters)
    override fun `as`(alias: Table<*>): GenerateSeries = GenerateSeries(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): GenerateSeries = GenerateSeries(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): GenerateSeries = GenerateSeries(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): GenerateSeries = GenerateSeries(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Long?
        , __2: Long?
    ): GenerateSeries = GenerateSeries(DSL.name("generate_series"), null, arrayOf(
        DSL.value(__1, SQLDataType.BIGINT),
        DSL.value(__2, SQLDataType.BIGINT)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<Long?>
        , __2: Field<Long?>
    ): GenerateSeries = GenerateSeries(DSL.name("generate_series"), null, arrayOf(
        __1,
        __2
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}