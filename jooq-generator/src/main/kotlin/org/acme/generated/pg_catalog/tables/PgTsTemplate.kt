/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_TS_TEMPLATE_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_TS_TEMPLATE_TMPLNAME_INDEX
import org.acme.generated.pg_catalog.tables.records.PgTsTemplateRecord
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
open class PgTsTemplate(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgTsTemplateRecord>?,
    parentPath: InverseForeignKey<out Record, PgTsTemplateRecord>?,
    aliased: Table<PgTsTemplateRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgTsTemplateRecord>(
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
         * The reference instance of <code>pg_catalog.pg_ts_template</code>
         */
        val PG_TS_TEMPLATE: PgTsTemplate = PgTsTemplate()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgTsTemplateRecord> = PgTsTemplateRecord::class.java

    /**
     * The column <code>pg_catalog.pg_ts_template.oid</code>.
     */
    val OID: TableField<PgTsTemplateRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    val TMPLNAME: TableField<PgTsTemplateRecord, String?> = createField(DSL.name("tmplname"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    val TMPLNAMESPACE: TableField<PgTsTemplateRecord, Long?> = createField(DSL.name("tmplnamespace"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    val TMPLINIT: TableField<PgTsTemplateRecord, String?> = createField(DSL.name("tmplinit"), SQLDataType.VARCHAR.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    val TMPLLEXIZE: TableField<PgTsTemplateRecord, String?> = createField(DSL.name("tmpllexize"), SQLDataType.VARCHAR.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgTsTemplateRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgTsTemplateRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgTsTemplateRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_ts_template</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_ts_template</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_ts_template</code> table reference
     */
    constructor(): this(DSL.name("pg_ts_template"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgTsTemplateRecord> = PG_TS_TEMPLATE_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgTsTemplateRecord>> = listOf(PG_TS_TEMPLATE_TMPLNAME_INDEX)
    override fun `as`(alias: String): PgTsTemplate = PgTsTemplate(DSL.name(alias), this)
    override fun `as`(alias: Name): PgTsTemplate = PgTsTemplate(alias, this)
    override fun `as`(alias: Table<*>): PgTsTemplate = PgTsTemplate(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgTsTemplate = PgTsTemplate(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgTsTemplate = PgTsTemplate(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgTsTemplate = PgTsTemplate(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgTsTemplate = PgTsTemplate(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgTsTemplate = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgTsTemplate = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgTsTemplate = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgTsTemplate = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgTsTemplate = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgTsTemplate = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgTsTemplate = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgTsTemplate = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgTsTemplate = where(DSL.notExists(select))
}