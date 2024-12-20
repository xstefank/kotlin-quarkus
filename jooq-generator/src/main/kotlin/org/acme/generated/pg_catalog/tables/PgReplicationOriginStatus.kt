/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgReplicationOriginStatusRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
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
open class PgReplicationOriginStatus(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgReplicationOriginStatusRecord>?,
    parentPath: InverseForeignKey<out Record, PgReplicationOriginStatusRecord>?,
    aliased: Table<PgReplicationOriginStatusRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgReplicationOriginStatusRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_replication_origin_status" as  SELECT pg_show_replication_origin_status.local_id,
     pg_show_replication_origin_status.external_id,
     pg_show_replication_origin_status.remote_lsn,
     pg_show_replication_origin_status.local_lsn
    FROM pg_show_replication_origin_status() pg_show_replication_origin_status(local_id, external_id, remote_lsn, local_lsn);
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>pg_catalog.pg_replication_origin_status</code>
         */
        val PG_REPLICATION_ORIGIN_STATUS: PgReplicationOriginStatus = PgReplicationOriginStatus()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgReplicationOriginStatusRecord> = PgReplicationOriginStatusRecord::class.java

    /**
     * The column <code>pg_catalog.pg_replication_origin_status.local_id</code>.
     */
    val LOCAL_ID: TableField<PgReplicationOriginStatusRecord, Long?> = createField(DSL.name("local_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>pg_catalog.pg_replication_origin_status.external_id</code>.
     */
    val EXTERNAL_ID: TableField<PgReplicationOriginStatusRecord, String?> = createField(DSL.name("external_id"), SQLDataType.CLOB, this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val REMOTE_LSN: TableField<PgReplicationOriginStatusRecord, Any?> = createField(DSL.name("remote_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val LOCAL_LSN: TableField<PgReplicationOriginStatusRecord, Any?> = createField(DSL.name("local_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "")

    private constructor(alias: Name, aliased: Table<PgReplicationOriginStatusRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgReplicationOriginStatusRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgReplicationOriginStatusRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin_status</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin_status</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_replication_origin_status</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_replication_origin_status"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgReplicationOriginStatus = PgReplicationOriginStatus(DSL.name(alias), this)
    override fun `as`(alias: Name): PgReplicationOriginStatus = PgReplicationOriginStatus(alias, this)
    override fun `as`(alias: Table<*>): PgReplicationOriginStatus = PgReplicationOriginStatus(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgReplicationOriginStatus = PgReplicationOriginStatus(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgReplicationOriginStatus = PgReplicationOriginStatus(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgReplicationOriginStatus = PgReplicationOriginStatus(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgReplicationOriginStatus = PgReplicationOriginStatus(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgReplicationOriginStatus = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgReplicationOriginStatus = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgReplicationOriginStatus = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgReplicationOriginStatus = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgReplicationOriginStatus = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgReplicationOriginStatus = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgReplicationOriginStatus = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgReplicationOriginStatus = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgReplicationOriginStatus = where(DSL.notExists(select))
}
