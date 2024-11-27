/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgLogicalSlotPeekBinaryChangesRecord
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
import org.jooq.impl.DefaultDataType
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLogicalSlotPeekBinaryChanges(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgLogicalSlotPeekBinaryChangesRecord>?,
    parentPath: InverseForeignKey<out Record, PgLogicalSlotPeekBinaryChangesRecord>?,
    aliased: Table<PgLogicalSlotPeekBinaryChangesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgLogicalSlotPeekBinaryChangesRecord>(
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
         * <code>pg_catalog.pg_logical_slot_peek_binary_changes</code>
         */
        val PG_LOGICAL_SLOT_PEEK_BINARY_CHANGES: PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgLogicalSlotPeekBinaryChangesRecord> = PgLogicalSlotPeekBinaryChangesRecord::class.java
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val LSN: TableField<PgLogicalSlotPeekBinaryChangesRecord, Any?> = createField(DSL.name("lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.xid</code>.
     */
    val XID: TableField<PgLogicalSlotPeekBinaryChangesRecord, Long?> = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.data</code>.
     */
    val DATA: TableField<PgLogicalSlotPeekBinaryChangesRecord, ByteArray?> = createField(DSL.name("data"), SQLDataType.BLOB, this, "")

    private constructor(alias: Name, aliased: Table<PgLogicalSlotPeekBinaryChangesRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.VARCHAR),
        DSL.value(null, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
        DSL.value(null, SQLDataType.INTEGER),
        DSL.value(null, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
    ), null)
    private constructor(alias: Name, aliased: Table<PgLogicalSlotPeekBinaryChangesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_logical_slot_peek_binary_changes</code>
     * table reference
     */
    constructor(): this(DSL.name("pg_logical_slot_peek_binary_changes"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          slotName: String?
        , uptoLsn: Any?
        , uptoNchanges: Int?
        , options: Array<String?>?
    ): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(DSL.name("pg_logical_slot_peek_binary_changes"), null, arrayOf(
        DSL.value(slotName, SQLDataType.VARCHAR),
        DSL.value(uptoLsn, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
        DSL.value(uptoNchanges, SQLDataType.INTEGER),
        DSL.value(options, SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB)).array())
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          slotName: Field<String?>
        , uptoLsn: Field<Any?>
        , uptoNchanges: Field<Int?>
        , options: Field<Array<String?>?>
    ): PgLogicalSlotPeekBinaryChanges = PgLogicalSlotPeekBinaryChanges(DSL.name("pg_logical_slot_peek_binary_changes"), null, arrayOf(
        slotName,
        uptoLsn,
        uptoNchanges,
        options
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
