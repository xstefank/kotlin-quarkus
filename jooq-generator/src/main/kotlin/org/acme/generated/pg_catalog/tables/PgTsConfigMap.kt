/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_TS_CONFIG_MAP_INDEX
import org.acme.generated.pg_catalog.tables.records.PgTsConfigMapRecord
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
open class PgTsConfigMap(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgTsConfigMapRecord>?,
    parentPath: InverseForeignKey<out Record, PgTsConfigMapRecord>?,
    aliased: Table<PgTsConfigMapRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgTsConfigMapRecord>(
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
         * The reference instance of <code>pg_catalog.pg_ts_config_map</code>
         */
        val PG_TS_CONFIG_MAP: PgTsConfigMap = PgTsConfigMap()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgTsConfigMapRecord> = PgTsConfigMapRecord::class.java

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapcfg</code>.
     */
    val MAPCFG: TableField<PgTsConfigMapRecord, Long?> = createField(DSL.name("mapcfg"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_ts_config_map.maptokentype</code>.
     */
    val MAPTOKENTYPE: TableField<PgTsConfigMapRecord, Int?> = createField(DSL.name("maptokentype"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapseqno</code>.
     */
    val MAPSEQNO: TableField<PgTsConfigMapRecord, Int?> = createField(DSL.name("mapseqno"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapdict</code>.
     */
    val MAPDICT: TableField<PgTsConfigMapRecord, Long?> = createField(DSL.name("mapdict"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgTsConfigMapRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgTsConfigMapRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgTsConfigMapRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config_map</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config_map</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_ts_config_map</code> table reference
     */
    constructor(): this(DSL.name("pg_ts_config_map"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgTsConfigMapRecord> = PG_TS_CONFIG_MAP_INDEX
    override fun `as`(alias: String): PgTsConfigMap = PgTsConfigMap(DSL.name(alias), this)
    override fun `as`(alias: Name): PgTsConfigMap = PgTsConfigMap(alias, this)
    override fun `as`(alias: Table<*>): PgTsConfigMap = PgTsConfigMap(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgTsConfigMap = PgTsConfigMap(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgTsConfigMap = PgTsConfigMap(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgTsConfigMap = PgTsConfigMap(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgTsConfigMap = PgTsConfigMap(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgTsConfigMap = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgTsConfigMap = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgTsConfigMap = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgTsConfigMap = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgTsConfigMap = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgTsConfigMap = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgTsConfigMap = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgTsConfigMap = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgTsConfigMap = where(DSL.notExists(select))
}
