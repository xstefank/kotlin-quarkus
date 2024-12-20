/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_LARGEOBJECT_METADATA_OID_INDEX
import org.acme.generated.pg_catalog.tables.records.PgLargeobjectMetadataRecord
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
open class PgLargeobjectMetadata(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgLargeobjectMetadataRecord>?,
    parentPath: InverseForeignKey<out Record, PgLargeobjectMetadataRecord>?,
    aliased: Table<PgLargeobjectMetadataRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgLargeobjectMetadataRecord>(
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
         * The reference instance of
         * <code>pg_catalog.pg_largeobject_metadata</code>
         */
        val PG_LARGEOBJECT_METADATA: PgLargeobjectMetadata = PgLargeobjectMetadata()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgLargeobjectMetadataRecord> = PgLargeobjectMetadataRecord::class.java

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.oid</code>.
     */
    val OID: TableField<PgLargeobjectMetadataRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    val LOMOWNER: TableField<PgLargeobjectMetadataRecord, Long?> = createField(DSL.name("lomowner"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    val LOMACL: TableField<PgLargeobjectMetadataRecord, Array<String?>?> = createField(DSL.name("lomacl"), SQLDataType.VARCHAR.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgLargeobjectMetadataRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgLargeobjectMetadataRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgLargeobjectMetadataRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject_metadata</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject_metadata</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_largeobject_metadata</code> table reference
     */
    constructor(): this(DSL.name("pg_largeobject_metadata"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgLargeobjectMetadataRecord> = PG_LARGEOBJECT_METADATA_OID_INDEX
    override fun `as`(alias: String): PgLargeobjectMetadata = PgLargeobjectMetadata(DSL.name(alias), this)
    override fun `as`(alias: Name): PgLargeobjectMetadata = PgLargeobjectMetadata(alias, this)
    override fun `as`(alias: Table<*>): PgLargeobjectMetadata = PgLargeobjectMetadata(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgLargeobjectMetadata = PgLargeobjectMetadata(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgLargeobjectMetadata = PgLargeobjectMetadata(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgLargeobjectMetadata = PgLargeobjectMetadata(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgLargeobjectMetadata = PgLargeobjectMetadata(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgLargeobjectMetadata = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgLargeobjectMetadata = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgLargeobjectMetadata = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgLargeobjectMetadata = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgLargeobjectMetadata = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgLargeobjectMetadata = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgLargeobjectMetadata = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgLargeobjectMetadata = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgLargeobjectMetadata = where(DSL.notExists(select))
}
