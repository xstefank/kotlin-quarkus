/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_PUBLICATION_REL_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgPublicationRelRecord
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
open class PgPublicationRel(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgPublicationRelRecord>?,
    parentPath: InverseForeignKey<out Record, PgPublicationRelRecord>?,
    aliased: Table<PgPublicationRelRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgPublicationRelRecord>(
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
         * The reference instance of <code>pg_catalog.pg_publication_rel</code>
         */
        val PG_PUBLICATION_REL: PgPublicationRel = PgPublicationRel()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgPublicationRelRecord> = PgPublicationRelRecord::class.java

    /**
     * The column <code>pg_catalog.pg_publication_rel.oid</code>.
     */
    val OID: TableField<PgPublicationRelRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    val PRPUBID: TableField<PgPublicationRelRecord, Long?> = createField(DSL.name("prpubid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    val PRRELID: TableField<PgPublicationRelRecord, Long?> = createField(DSL.name("prrelid"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PgPublicationRelRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgPublicationRelRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgPublicationRelRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_publication_rel</code> table reference
     */
    constructor(): this(DSL.name("pg_publication_rel"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgPublicationRelRecord> = PG_PUBLICATION_REL_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgPublicationRelRecord>> = listOf(PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX)
    override fun `as`(alias: String): PgPublicationRel = PgPublicationRel(DSL.name(alias), this)
    override fun `as`(alias: Name): PgPublicationRel = PgPublicationRel(alias, this)
    override fun `as`(alias: Table<*>): PgPublicationRel = PgPublicationRel(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgPublicationRel = PgPublicationRel(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgPublicationRel = PgPublicationRel(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgPublicationRel = PgPublicationRel(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgPublicationRel = PgPublicationRel(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgPublicationRel = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgPublicationRel = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgPublicationRel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgPublicationRel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgPublicationRel = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgPublicationRel = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgPublicationRel = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgPublicationRel = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgPublicationRel = where(DSL.notExists(select))
}
