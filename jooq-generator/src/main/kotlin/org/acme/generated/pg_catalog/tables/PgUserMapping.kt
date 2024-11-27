/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import kotlin.collections.Collection
import kotlin.collections.List

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.keys.PG_USER_MAPPING_OID_INDEX
import org.acme.generated.pg_catalog.keys.PG_USER_MAPPING_USER_SERVER_INDEX
import org.acme.generated.pg_catalog.tables.records.PgUserMappingRecord
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
open class PgUserMapping(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgUserMappingRecord>?,
    parentPath: InverseForeignKey<out Record, PgUserMappingRecord>?,
    aliased: Table<PgUserMappingRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgUserMappingRecord>(
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
         * The reference instance of <code>pg_catalog.pg_user_mapping</code>
         */
        val PG_USER_MAPPING: PgUserMapping = PgUserMapping()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgUserMappingRecord> = PgUserMappingRecord::class.java

    /**
     * The column <code>pg_catalog.pg_user_mapping.oid</code>.
     */
    val OID: TableField<PgUserMappingRecord, Long?> = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_user_mapping.umuser</code>.
     */
    val UMUSER: TableField<PgUserMappingRecord, Long?> = createField(DSL.name("umuser"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_user_mapping.umserver</code>.
     */
    val UMSERVER: TableField<PgUserMappingRecord, Long?> = createField(DSL.name("umserver"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>pg_catalog.pg_user_mapping.umoptions</code>.
     */
    val UMOPTIONS: TableField<PgUserMappingRecord, Array<String?>?> = createField(DSL.name("umoptions"), SQLDataType.CLOB.array(), this, "")

    private constructor(alias: Name, aliased: Table<PgUserMappingRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgUserMappingRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgUserMappingRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_user_mapping</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_user_mapping</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_user_mapping</code> table reference
     */
    constructor(): this(DSL.name("pg_user_mapping"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun getPrimaryKey(): UniqueKey<PgUserMappingRecord> = PG_USER_MAPPING_OID_INDEX
    override fun getUniqueKeys(): List<UniqueKey<PgUserMappingRecord>> = listOf(PG_USER_MAPPING_USER_SERVER_INDEX)
    override fun `as`(alias: String): PgUserMapping = PgUserMapping(DSL.name(alias), this)
    override fun `as`(alias: Name): PgUserMapping = PgUserMapping(alias, this)
    override fun `as`(alias: Table<*>): PgUserMapping = PgUserMapping(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgUserMapping = PgUserMapping(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgUserMapping = PgUserMapping(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgUserMapping = PgUserMapping(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgUserMapping = PgUserMapping(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgUserMapping = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgUserMapping = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgUserMapping = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgUserMapping = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgUserMapping = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgUserMapping = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgUserMapping = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgUserMapping = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgUserMapping = where(DSL.notExists(select))
}