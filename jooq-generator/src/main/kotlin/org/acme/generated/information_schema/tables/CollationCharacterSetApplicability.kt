/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.CollationCharacterSetApplicabilityRecord
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
import org.jooq.impl.DSL
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CollationCharacterSetApplicability(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CollationCharacterSetApplicabilityRecord>?,
    parentPath: InverseForeignKey<out Record, CollationCharacterSetApplicabilityRecord>?,
    aliased: Table<CollationCharacterSetApplicabilityRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CollationCharacterSetApplicabilityRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "collation_character_set_applicability" as  SELECT (current_database())::information_schema.sql_identifier AS collation_catalog,
      (nc.nspname)::information_schema.sql_identifier AS collation_schema,
      (c.collname)::information_schema.sql_identifier AS collation_name,
      (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
      (NULL::name)::information_schema.sql_identifier AS character_set_schema,
      (getdatabaseencoding())::information_schema.sql_identifier AS character_set_name
     FROM pg_collation c,
      pg_namespace nc
    WHERE ((c.collnamespace = nc.oid) AND (c.collencoding = ANY (ARRAY['-1'::integer, ( SELECT pg_database.encoding
             FROM pg_database
            WHERE (pg_database.datname = current_database()))])));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.collation_character_set_applicability</code>
         */
        val COLLATION_CHARACTER_SET_APPLICABILITY: CollationCharacterSetApplicability = CollationCharacterSetApplicability()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CollationCharacterSetApplicabilityRecord> = CollationCharacterSetApplicabilityRecord::class.java

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    val COLLATION_CATALOG: TableField<CollationCharacterSetApplicabilityRecord, String?> = createField(DSL.name("collation_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    val COLLATION_SCHEMA: TableField<CollationCharacterSetApplicabilityRecord, String?> = createField(DSL.name("collation_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    val COLLATION_NAME: TableField<CollationCharacterSetApplicabilityRecord, String?> = createField(DSL.name("collation_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    val CHARACTER_SET_CATALOG: TableField<CollationCharacterSetApplicabilityRecord, String?> = createField(DSL.name("character_set_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    val CHARACTER_SET_SCHEMA: TableField<CollationCharacterSetApplicabilityRecord, String?> = createField(DSL.name("character_set_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    val CHARACTER_SET_NAME: TableField<CollationCharacterSetApplicabilityRecord, String?> = createField(DSL.name("character_set_name"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<CollationCharacterSetApplicabilityRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CollationCharacterSetApplicabilityRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CollationCharacterSetApplicabilityRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    constructor(): this(DSL.name("collation_character_set_applicability"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): CollationCharacterSetApplicability = CollationCharacterSetApplicability(DSL.name(alias), this)
    override fun `as`(alias: Name): CollationCharacterSetApplicability = CollationCharacterSetApplicability(alias, this)
    override fun `as`(alias: Table<*>): CollationCharacterSetApplicability = CollationCharacterSetApplicability(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CollationCharacterSetApplicability = CollationCharacterSetApplicability(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CollationCharacterSetApplicability = CollationCharacterSetApplicability(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CollationCharacterSetApplicability = CollationCharacterSetApplicability(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): CollationCharacterSetApplicability = CollationCharacterSetApplicability(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): CollationCharacterSetApplicability = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): CollationCharacterSetApplicability = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): CollationCharacterSetApplicability = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): CollationCharacterSetApplicability = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): CollationCharacterSetApplicability = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): CollationCharacterSetApplicability = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): CollationCharacterSetApplicability = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): CollationCharacterSetApplicability = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): CollationCharacterSetApplicability = where(DSL.notExists(select))
}