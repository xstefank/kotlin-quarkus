/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.JsonPopulateRecordsetRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.JSON
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.DefaultDataType
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonPopulateRecordset(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, JsonPopulateRecordsetRecord>?,
    parentPath: InverseForeignKey<out Record, JsonPopulateRecordsetRecord>?,
    aliased: Table<JsonPopulateRecordsetRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<JsonPopulateRecordsetRecord>(
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
         * <code>pg_catalog.json_populate_recordset</code>
         */
        val JSON_POPULATE_RECORDSET: JsonPopulateRecordset = JsonPopulateRecordset()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<JsonPopulateRecordsetRecord> = JsonPopulateRecordsetRecord::class.java
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val JSON_POPULATE_RECORDSET_: TableField<JsonPopulateRecordsetRecord, Any?> = createField(DSL.name("json_populate_recordset"), DefaultDataType.getDefaultDataType("\"anyelement\""), this, "")

    private constructor(alias: Name, aliased: Table<JsonPopulateRecordsetRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\"")),
        DSL.value(null, SQLDataType.JSON),
        DSL.value(null, SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)))
    ), null)
    private constructor(alias: Name, aliased: Table<JsonPopulateRecordsetRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.json_populate_recordset</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.json_populate_recordset</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.json_populate_recordset</code> table reference
     */
    constructor(): this(DSL.name("json_populate_recordset"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonPopulateRecordset = JsonPopulateRecordset(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonPopulateRecordset = JsonPopulateRecordset(alias, this, parameters)
    override fun `as`(alias: Table<*>): JsonPopulateRecordset = JsonPopulateRecordset(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonPopulateRecordset = JsonPopulateRecordset(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonPopulateRecordset = JsonPopulateRecordset(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): JsonPopulateRecordset = JsonPopulateRecordset(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          base: Any?
        , fromJson: JSON?
        , useJsonAsText: Boolean?
    ): JsonPopulateRecordset = JsonPopulateRecordset(DSL.name("json_populate_recordset"), null, arrayOf(
        DSL.value(base, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\"")),
        DSL.value(fromJson, SQLDataType.JSON),
        DSL.value(useJsonAsText, SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)))
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          base: Field<Any?>
        , fromJson: Field<JSON?>
        , useJsonAsText: Field<Boolean?>
    ): JsonPopulateRecordset = JsonPopulateRecordset(DSL.name("json_populate_recordset"), null, arrayOf(
        base,
        fromJson,
        useJsonAsText
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}