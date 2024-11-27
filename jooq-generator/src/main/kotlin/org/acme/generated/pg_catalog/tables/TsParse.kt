/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.TsParseRecord
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
open class TsParse(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TsParseRecord>?,
    parentPath: InverseForeignKey<out Record, TsParseRecord>?,
    aliased: Table<TsParseRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TsParseRecord>(
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
         * The reference instance of <code>pg_catalog.ts_parse</code>
         */
        val TS_PARSE: TsParse = TsParse()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TsParseRecord> = TsParseRecord::class.java

    /**
     * The column <code>pg_catalog.ts_parse.tokid</code>.
     */
    val TOKID: TableField<TsParseRecord, Int?> = createField(DSL.name("tokid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.ts_parse.token</code>.
     */
    val TOKEN: TableField<TsParseRecord, String?> = createField(DSL.name("token"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<TsParseRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.BIGINT),
        DSL.value(null, SQLDataType.CLOB)
    ), null)
    private constructor(alias: Name, aliased: Table<TsParseRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.ts_parse</code> table reference
     */
    constructor(): this(DSL.name("ts_parse"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): TsParse = TsParse(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): TsParse = TsParse(alias, this, parameters)
    override fun `as`(alias: Table<*>): TsParse = TsParse(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): TsParse = TsParse(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TsParse = TsParse(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TsParse = TsParse(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          parserOid: Long?
        , txt: String?
    ): TsParse = TsParse(DSL.name("ts_parse"), null, arrayOf(
        DSL.value(parserOid, SQLDataType.BIGINT),
        DSL.value(txt, SQLDataType.CLOB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          parserOid: Field<Long?>
        , txt: Field<String?>
    ): TsParse = TsParse(DSL.name("ts_parse"), null, arrayOf(
        parserOid,
        txt
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}