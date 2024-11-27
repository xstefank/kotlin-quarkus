/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_OPERATOR_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_OPERATOR_OPRNAME_L_R_N_INDEX
import org.acme.generated.pg_catalog.tables.records.PgOperatorRecord
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
open class PgOperator(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgOperatorRecord>?,
    parentPath: InverseForeignKey<out Record, PgOperatorRecord>?,
    aliased: Table<PgOperatorRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgOperatorRecord>(
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
         * The reference instance of <code>pg_catalog.pg_operator</code>
         */
        val PG_OPERATOR: PgOperator = PgOperator()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgOperatorRecord> = PgOperatorRecord::class.java

    /**
     * The column <code>pg_catalog.pg_operator.oid</code>.
     */
    val OID: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprname</code>.
     */
    val OPRNAME: TableField<PgOperatorRecord, String?> = createField(DSL.name("oprname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    val OPRNAMESPACE: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oprnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprowner</code>.
     */
    val OPROWNER: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oprowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprkind</code>.
     */
    val OPRKIND: TableField<PgOperatorRecord, String?> = createField(DSL.name("oprkind"), SQLDataType.CHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    val OPRCANMERGE: TableField<PgOperatorRecord, Boolean?> = createField(DSL.name("oprcanmerge"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    val OPRCANHASH: TableField<PgOperatorRecord, Boolean?> = createField(DSL.name("oprcanhash"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprleft</code>.
     */
    val OPRLEFT: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oprleft"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprright</code>.
     */
    val OPRRIGHT: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oprright"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprresult</code>.
     */
    val OPRRESULT: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oprresult"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcom</code>.
     */
    val OPRCOM: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oprcom"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    val OPRNEGATE: TableField<PgOperatorRecord, Long?> = createField(DSL.name("oprnegate"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprcode</code>.
     */
    val OPRCODE: TableField<PgOperatorRecord, String?> = createField(DSL.name("oprcode"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprrest</code>.
     */
    val OPRREST: TableField<PgOperatorRecord, String?> = createField(DSL.name("oprrest"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    val OPRJOIN: TableField<PgOperatorRecord, String?> = createField(DSL.name("oprjoin"), SQLDataType.VARCHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgOperatorRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgOperatorRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgOperatorRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_operator</code> table reference
     */
    constructor(): this(DSL.name("pg_operator"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgOperatorRecord> = PG_OPERATOR_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgOperatorRecord>> = listOf(PG_OPERATOR_OPRNAME_L_R_N_INDEX)
    override fun `as`(alias: String): PgOperator = PgOperator(DSL.name(alias), this)
    override fun `as`(alias: Name): PgOperator = PgOperator(alias, this)
    override fun `as`(alias: Table<*>): PgOperator = PgOperator(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgOperator = PgOperator(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgOperator = PgOperator(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgOperator = PgOperator(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgOperator = PgOperator(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgOperator = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgOperator = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgOperator = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgOperator = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgOperator = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgOperator = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgOperator = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgOperator = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgOperator = where(DSL.notExists(select))
}
