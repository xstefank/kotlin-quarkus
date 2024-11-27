/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_AGGREGATE_FNOID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgAggregateRecord
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
open class PgAggregate(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgAggregateRecord>?,
    parentPath: InverseForeignKey<out Record, PgAggregateRecord>?,
    aliased: Table<PgAggregateRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgAggregateRecord>(
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
         * The reference instance of <code>pg_catalog.pg_aggregate</code>
         */
        val PG_AGGREGATE: PgAggregate = PgAggregate()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgAggregateRecord> = PgAggregateRecord::class.java

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfnoid</code>.
     */
    val AGGFNOID: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggfnoid"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggkind</code>.
     */
    val AGGKIND: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggkind"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggnumdirectargs</code>.
     */
    val AGGNUMDIRECTARGS: TableField<PgAggregateRecord, Short?> = createField(DSL.name("aggnumdirectargs"), SQLDataType.SMALLINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtransfn</code>.
     */
    val AGGTRANSFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggtransfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalfn</code>.
     */
    val AGGFINALFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggfinalfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggcombinefn</code>.
     */
    val AGGCOMBINEFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggcombinefn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggserialfn</code>.
     */
    val AGGSERIALFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggserialfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggdeserialfn</code>.
     */
    val AGGDESERIALFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggdeserialfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtransfn</code>.
     */
    val AGGMTRANSFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggmtransfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggminvtransfn</code>.
     */
    val AGGMINVTRANSFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggminvtransfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalfn</code>.
     */
    val AGGMFINALFN: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggmfinalfn"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalextra</code>.
     */
    val AGGFINALEXTRA: TableField<PgAggregateRecord, Boolean?> = createField(DSL.name("aggfinalextra"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalextra</code>.
     */
    val AGGMFINALEXTRA: TableField<PgAggregateRecord, Boolean?> = createField(DSL.name("aggmfinalextra"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggfinalmodify</code>.
     */
    val AGGFINALMODIFY: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggfinalmodify"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmfinalmodify</code>.
     */
    val AGGMFINALMODIFY: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggmfinalmodify"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggsortop</code>.
     */
    val AGGSORTOP: TableField<PgAggregateRecord, Long?> = createField(DSL.name("aggsortop"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtranstype</code>.
     */
    val AGGTRANSTYPE: TableField<PgAggregateRecord, Long?> = createField(DSL.name("aggtranstype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggtransspace</code>.
     */
    val AGGTRANSSPACE: TableField<PgAggregateRecord, Int?> = createField(DSL.name("aggtransspace"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtranstype</code>.
     */
    val AGGMTRANSTYPE: TableField<PgAggregateRecord, Long?> = createField(DSL.name("aggmtranstype"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggmtransspace</code>.
     */
    val AGGMTRANSSPACE: TableField<PgAggregateRecord, Int?> = createField(DSL.name("aggmtransspace"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.agginitval</code>.
     */
    val AGGINITVAL: TableField<PgAggregateRecord, String?> = createField(DSL.name("agginitval"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_aggregate.aggminitval</code>.
     */
    val AGGMINITVAL: TableField<PgAggregateRecord, String?> = createField(DSL.name("aggminitval"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<PgAggregateRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgAggregateRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgAggregateRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_aggregate</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_aggregate</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_aggregate</code> table reference
     */
    constructor(): this(DSL.name("pg_aggregate"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgAggregateRecord> = PG_AGGREGATE_FNOID_INDEX
    override fun `as`(alias: String): PgAggregate = PgAggregate(DSL.name(alias), this)
    override fun `as`(alias: Name): PgAggregate = PgAggregate(alias, this)
    override fun `as`(alias: Table<*>): PgAggregate = PgAggregate(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgAggregate = PgAggregate(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgAggregate = PgAggregate(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgAggregate = PgAggregate(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgAggregate = PgAggregate(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgAggregate = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgAggregate = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgAggregate = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgAggregate = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgAggregate = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgAggregate = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgAggregate = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgAggregate = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgAggregate = where(DSL.notExists(select))
}