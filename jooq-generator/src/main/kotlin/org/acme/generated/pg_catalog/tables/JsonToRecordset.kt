/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.JsonToRecordsetRecord
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
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonToRecordset(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, JsonToRecordsetRecord>?,
    parentPath: InverseForeignKey<out Record, JsonToRecordsetRecord>?,
    aliased: Table<JsonToRecordsetRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<JsonToRecordsetRecord>(
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
         * The reference instance of <code>pg_catalog.json_to_recordset</code>
         */
        val JSON_TO_RECORDSET: JsonToRecordset = JsonToRecordset()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<JsonToRecordsetRecord> = JsonToRecordsetRecord::class.java

    /**
     * The column <code>pg_catalog.json_to_recordset.json_to_recordset</code>.
     */
    val JSON_TO_RECORDSET_: TableField<JsonToRecordsetRecord, Record?> = createField(DSL.name("json_to_recordset"), SQLDataType.RECORD, this, "")

    private constructor(alias: Name, aliased: Table<JsonToRecordsetRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.JSON)
    ), null)
    private constructor(alias: Name, aliased: Table<JsonToRecordsetRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.json_to_recordset</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.json_to_recordset</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.json_to_recordset</code> table reference
     */
    constructor(): this(DSL.name("json_to_recordset"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonToRecordset = JsonToRecordset(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonToRecordset = JsonToRecordset(alias, this, parameters)
    override fun `as`(alias: Table<*>): JsonToRecordset = JsonToRecordset(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonToRecordset = JsonToRecordset(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonToRecordset = JsonToRecordset(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): JsonToRecordset = JsonToRecordset(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: JSON?
    ): JsonToRecordset = JsonToRecordset(DSL.name("json_to_recordset"), null, arrayOf(
        DSL.value(__1, SQLDataType.JSON)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<JSON?>
    ): JsonToRecordset = JsonToRecordset(DSL.name("json_to_recordset"), null, arrayOf(
        __1
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
