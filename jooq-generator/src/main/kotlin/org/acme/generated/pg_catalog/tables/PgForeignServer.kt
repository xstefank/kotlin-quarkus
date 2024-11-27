/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_FOREIGN_SERVER_NAME_INDEX
import org.acme.generated.pg_catalog.keys.PG_FOREIGN_SERVER_OID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgForeignServerRecord
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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgForeignServer(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgForeignServerRecord>?,
    parentPath: InverseForeignKey<out Record, PgForeignServerRecord>?,
    aliased: Table<PgForeignServerRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgForeignServerRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_foreign_server</code>
         */
        val PG_FOREIGN_SERVER: PgForeignServer = PgForeignServer()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgForeignServerRecord> = PgForeignServerRecord::class.java

    /**
     * The column <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    val OID: TableField<PgForeignServerRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    val SRVNAME: TableField<PgForeignServerRecord, String?> = createField(DSL.name("srvname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    val SRVOWNER: TableField<PgForeignServerRecord, Long?> = createField(DSL.name("srvowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    val SRVFDW: TableField<PgForeignServerRecord, Long?> = createField(DSL.name("srvfdw"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    val SRVTYPE: TableField<PgForeignServerRecord, String?> = createField(DSL.name("srvtype"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    val SRVVERSION: TableField<PgForeignServerRecord, String?> = createField(DSL.name("srvversion"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    val SRVACL: TableField<PgForeignServerRecord, Array<String?>?> = createField(DSL.name("srvacl"), SQLDataType.VARCHAR.array(), this, "")

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    val SRVOPTIONS: TableField<PgForeignServerRecord, Array<String?>?> = createField(DSL.name("srvoptions"), SQLDataType.CLOB.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgForeignServerRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgForeignServerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgForeignServerRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_server</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_server</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_foreign_server</code> table reference
     */
    constructor(): this(DSL.name("pg_foreign_server"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgForeignServerRecord> = PG_FOREIGN_SERVER_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgForeignServerRecord>> = listOf(PG_FOREIGN_SERVER_NAME_INDEX)
    override fun `as`(alias: String): PgForeignServer = PgForeignServer(DSL.name(alias), this)
    override fun `as`(alias: Name): PgForeignServer = PgForeignServer(alias, this)
    override fun `as`(alias: Table<*>): PgForeignServer = PgForeignServer(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgForeignServer = PgForeignServer(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgForeignServer = PgForeignServer(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgForeignServer = PgForeignServer(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgForeignServer = PgForeignServer(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgForeignServer = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgForeignServer = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgForeignServer = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgForeignServer = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgForeignServer = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgForeignServer = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgForeignServer = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgForeignServer = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgForeignServer = where(DSL.notExists(select))
}