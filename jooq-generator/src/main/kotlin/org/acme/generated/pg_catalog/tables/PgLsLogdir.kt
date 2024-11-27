/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgLsLogdirRecord
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
open class PgLsLogdir(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgLsLogdirRecord>?,
    parentPath: InverseForeignKey<out Record, PgLsLogdirRecord>?,
    aliased: Table<PgLsLogdirRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgLsLogdirRecord>(
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
         * The reference instance of <code>pg_catalog.pg_ls_logdir</code>
         */
        val PG_LS_LOGDIR: PgLsLogdir = PgLsLogdir()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgLsLogdirRecord> = PgLsLogdirRecord::class.java

    /**
     * The column <code>pg_catalog.pg_ls_logdir.name</code>.
     */
    val NAME: TableField<PgLsLogdirRecord, String?> = createField(DSL.name("name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_ls_logdir.size</code>.
     */
    val SIZE: TableField<PgLsLogdirRecord, Long?> = createField(DSL.name("size"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_ls_logdir.modification</code>.
     */
    val MODIFICATION: TableField<PgLsLogdirRecord, OffsetDateTime?> = createField(DSL.name("modification"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<PgLsLogdirRecord>?): this(alias, null, null, null, aliased, arrayOf(
    ), null)
    private constructor(alias: Name, aliased: Table<PgLsLogdirRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_ls_logdir</code> table reference
     */
    constructor(): this(DSL.name("pg_ls_logdir"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgLsLogdir = PgLsLogdir(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgLsLogdir = PgLsLogdir(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgLsLogdir = PgLsLogdir(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLsLogdir = PgLsLogdir(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLsLogdir = PgLsLogdir(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgLsLogdir = PgLsLogdir(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(): PgLsLogdir = PgLsLogdir(DSL.name("pg_ls_logdir"), null, arrayOf()).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
