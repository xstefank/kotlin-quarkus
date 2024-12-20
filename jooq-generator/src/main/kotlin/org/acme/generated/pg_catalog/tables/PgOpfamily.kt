/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_OPFAMILY_AM_NAME_NSP_INDEX
import org.acme.generated.pg_catalog.keys.PG_OPFAMILY_OID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgOpfamilyRecord
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
open class PgOpfamily(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgOpfamilyRecord>?,
    parentPath: InverseForeignKey<out Record, PgOpfamilyRecord>?,
    aliased: Table<PgOpfamilyRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgOpfamilyRecord>(
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
         * The reference instance of <code>pg_catalog.pg_opfamily</code>
         */
        val PG_OPFAMILY: PgOpfamily = PgOpfamily()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgOpfamilyRecord> = PgOpfamilyRecord::class.java

    /**
     * The column <code>pg_catalog.pg_opfamily.oid</code>.
     */
    val OID: TableField<PgOpfamilyRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    val OPFMETHOD: TableField<PgOpfamilyRecord, Long?> = createField(DSL.name("opfmethod"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    val OPFNAME: TableField<PgOpfamilyRecord, String?> = createField(DSL.name("opfname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    val OPFNAMESPACE: TableField<PgOpfamilyRecord, Long?> = createField(DSL.name("opfnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    val OPFOWNER: TableField<PgOpfamilyRecord, Long?> = createField(DSL.name("opfowner"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgOpfamilyRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgOpfamilyRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgOpfamilyRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_opfamily</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_opfamily</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_opfamily</code> table reference
     */
    constructor(): this(DSL.name("pg_opfamily"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgOpfamilyRecord> = PG_OPFAMILY_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgOpfamilyRecord>> = listOf(PG_OPFAMILY_AM_NAME_NSP_INDEX)
    override fun `as`(alias: String): PgOpfamily = PgOpfamily(DSL.name(alias), this)
    override fun `as`(alias: Name): PgOpfamily = PgOpfamily(alias, this)
    override fun `as`(alias: Table<*>): PgOpfamily = PgOpfamily(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgOpfamily = PgOpfamily(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgOpfamily = PgOpfamily(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgOpfamily = PgOpfamily(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgOpfamily = PgOpfamily(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgOpfamily = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgOpfamily = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgOpfamily = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgOpfamily = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgOpfamily = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgOpfamily = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgOpfamily = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgOpfamily = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgOpfamily = where(DSL.notExists(select))
}
