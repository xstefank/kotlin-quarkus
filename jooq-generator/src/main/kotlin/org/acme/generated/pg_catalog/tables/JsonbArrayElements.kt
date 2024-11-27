/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.JsonbArrayElementsRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.JSONB
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
open class JsonbArrayElements(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, JsonbArrayElementsRecord>?,
    parentPath: InverseForeignKey<out Record, JsonbArrayElementsRecord>?,
    aliased: Table<JsonbArrayElementsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<JsonbArrayElementsRecord>(
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
         * <code>pg_catalog.jsonb_array_elements</code>
         */
        val JSONB_ARRAY_ELEMENTS: JsonbArrayElements = JsonbArrayElements()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<JsonbArrayElementsRecord> = JsonbArrayElementsRecord::class.java

    /**
     * The column <code>pg_catalog.jsonb_array_elements.value</code>.
     */
    val VALUE: TableField<JsonbArrayElementsRecord, JSONB?> = createField(DSL.name("value"), SQLDataType.JSONB, this, "")

    private constructor(alias: Name, aliased: Table<JsonbArrayElementsRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.JSONB)
    ), null)
    private constructor(alias: Name, aliased: Table<JsonbArrayElementsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.jsonb_array_elements</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.jsonb_array_elements</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.jsonb_array_elements</code> table reference
     */
    constructor(): this(DSL.name("jsonb_array_elements"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonbArrayElements = JsonbArrayElements(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonbArrayElements = JsonbArrayElements(alias, this, parameters)
    override fun `as`(alias: Table<*>): JsonbArrayElements = JsonbArrayElements(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonbArrayElements = JsonbArrayElements(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonbArrayElements = JsonbArrayElements(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): JsonbArrayElements = JsonbArrayElements(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          fromJson: JSONB?
    ): JsonbArrayElements = JsonbArrayElements(DSL.name("jsonb_array_elements"), null, arrayOf(
        DSL.value(fromJson, SQLDataType.JSONB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          fromJson: Field<JSONB?>
    ): JsonbArrayElements = JsonbArrayElements(DSL.name("jsonb_array_elements"), null, arrayOf(
        fromJson
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}