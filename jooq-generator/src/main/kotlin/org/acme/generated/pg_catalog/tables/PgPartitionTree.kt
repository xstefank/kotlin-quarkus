/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgPartitionTreeRecord
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
open class PgPartitionTree(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgPartitionTreeRecord>?,
    parentPath: InverseForeignKey<out Record, PgPartitionTreeRecord>?,
    aliased: Table<PgPartitionTreeRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgPartitionTreeRecord>(
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
         * The reference instance of <code>pg_catalog.pg_partition_tree</code>
         */
        val PG_PARTITION_TREE: PgPartitionTree = PgPartitionTree()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgPartitionTreeRecord> = PgPartitionTreeRecord::class.java
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val RELID: TableField<PgPartitionTreeRecord, Any?> = createField(DSL.name("relid"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val PARENTRELID: TableField<PgPartitionTreeRecord, Any?> = createField(DSL.name("parentrelid"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), this, "")

    /**
     * The column <code>pg_catalog.pg_partition_tree.isleaf</code>.
     */
    val ISLEAF: TableField<PgPartitionTreeRecord, Boolean?> = createField(DSL.name("isleaf"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_partition_tree.level</code>.
     */
    val LEVEL: TableField<PgPartitionTreeRecord, Int?> = createField(DSL.name("level"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<PgPartitionTreeRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
    ), null)
    private constructor(alias: Name, aliased: Table<PgPartitionTreeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.pg_partition_tree</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_partition_tree</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_partition_tree</code> table reference
     */
    constructor(): this(DSL.name("pg_partition_tree"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgPartitionTree = PgPartitionTree(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgPartitionTree = PgPartitionTree(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgPartitionTree = PgPartitionTree(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgPartitionTree = PgPartitionTree(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgPartitionTree = PgPartitionTree(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgPartitionTree = PgPartitionTree(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          rootrelid: Any?
    ): PgPartitionTree = PgPartitionTree(DSL.name("pg_partition_tree"), null, arrayOf(
        DSL.value(rootrelid, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          rootrelid: Field<Any?>
    ): PgPartitionTree = PgPartitionTree(DSL.name("pg_partition_tree"), null, arrayOf(
        rootrelid
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
