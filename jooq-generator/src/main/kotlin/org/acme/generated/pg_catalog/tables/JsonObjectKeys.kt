/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.JsonObjectKeysRecord
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
open class JsonObjectKeys(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, JsonObjectKeysRecord>?,
    parentPath: InverseForeignKey<out Record, JsonObjectKeysRecord>?,
    aliased: Table<JsonObjectKeysRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<JsonObjectKeysRecord>(
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
         * The reference instance of <code>pg_catalog.json_object_keys</code>
         */
        val JSON_OBJECT_KEYS: JsonObjectKeys = JsonObjectKeys()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<JsonObjectKeysRecord> = JsonObjectKeysRecord::class.java

    /**
     * The column <code>pg_catalog.json_object_keys.json_object_keys</code>.
     */
    val JSON_OBJECT_KEYS_: TableField<JsonObjectKeysRecord, String?> = createField(DSL.name("json_object_keys"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<JsonObjectKeysRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.JSON)
    ), null)
    private constructor(alias: Name, aliased: Table<JsonObjectKeysRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.json_object_keys</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.json_object_keys</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.json_object_keys</code> table reference
     */
    constructor(): this(DSL.name("json_object_keys"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): JsonObjectKeys = JsonObjectKeys(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): JsonObjectKeys = JsonObjectKeys(alias, this, parameters)
    override fun `as`(alias: Table<*>): JsonObjectKeys = JsonObjectKeys(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): JsonObjectKeys = JsonObjectKeys(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JsonObjectKeys = JsonObjectKeys(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): JsonObjectKeys = JsonObjectKeys(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          __1: JSON?
    ): JsonObjectKeys = JsonObjectKeys(DSL.name("json_object_keys"), null, arrayOf(
        DSL.value(__1, SQLDataType.JSON)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          __1: Field<JSON?>
    ): JsonObjectKeys = JsonObjectKeys(DSL.name("json_object_keys"), null, arrayOf(
        __1
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
