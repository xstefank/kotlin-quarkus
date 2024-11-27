/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.domains.YES_OR_NO
import org.acme.generated.information_schema.tables.records.TablesRecord
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
open class Tables(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TablesRecord>?,
    parentPath: InverseForeignKey<out Record, TablesRecord>?,
    aliased: Table<TablesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TablesRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "tables" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
      (nc.nspname)::information_schema.sql_identifier AS table_schema,
      (c.relname)::information_schema.sql_identifier AS table_name,
      (
          CASE
              WHEN (nc.oid = pg_my_temp_schema()) THEN 'LOCAL TEMPORARY'::text
              WHEN (c.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) THEN 'BASE TABLE'::text
              WHEN (c.relkind = 'v'::"char") THEN 'VIEW'::text
              WHEN (c.relkind = 'f'::"char") THEN 'FOREIGN'::text
              ELSE NULL::text
          END)::information_schema.character_data AS table_type,
      (NULL::name)::information_schema.sql_identifier AS self_referencing_column_name,
      (NULL::character varying)::information_schema.character_data AS reference_generation,
      (
          CASE
              WHEN (t.typname IS NOT NULL) THEN current_database()
              ELSE NULL::name
          END)::information_schema.sql_identifier AS user_defined_type_catalog,
      (nt.nspname)::information_schema.sql_identifier AS user_defined_type_schema,
      (t.typname)::information_schema.sql_identifier AS user_defined_type_name,
      (
          CASE
              WHEN ((c.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) OR ((c.relkind = ANY (ARRAY['v'::"char", 'f'::"char"])) AND ((pg_relation_is_updatable((c.oid)::regclass, false) & 8) = 8))) THEN 'YES'::text
              ELSE 'NO'::text
          END)::information_schema.yes_or_no AS is_insertable_into,
      (
          CASE
              WHEN (t.typname IS NOT NULL) THEN 'YES'::text
              ELSE 'NO'::text
          END)::information_schema.yes_or_no AS is_typed,
      (NULL::character varying)::information_schema.character_data AS commit_action
     FROM ((pg_namespace nc
       JOIN pg_class c ON ((nc.oid = c.relnamespace)))
       LEFT JOIN (pg_type t
       JOIN pg_namespace nt ON ((t.typnamespace = nt.oid))) ON ((c.reloftype = t.oid)))
    WHERE ((c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (NOT pg_is_other_temp_schema(nc.oid)) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'SELECT, INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'SELECT, INSERT, UPDATE, REFERENCES'::text)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>information_schema.tables</code>
         */
        val TABLES: Tables = Tables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TablesRecord> = TablesRecord::class.java

    /**
     * The column <code>information_schema.tables.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<TablesRecord, String?> = createField(DSL.name("table_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<TablesRecord, String?> = createField(DSL.name("table_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.table_name</code>.
     */
    val TABLE_NAME: TableField<TablesRecord, String?> = createField(DSL.name("table_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.table_type</code>.
     */
    val TABLE_TYPE: TableField<TablesRecord, String?> = createField(DSL.name("table_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.tables.self_referencing_column_name</code>.
     */
    val SELF_REFERENCING_COLUMN_NAME: TableField<TablesRecord, String?> = createField(DSL.name("self_referencing_column_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.reference_generation</code>.
     */
    val REFERENCE_GENERATION: TableField<TablesRecord, String?> = createField(DSL.name("reference_generation"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.tables.user_defined_type_catalog</code>.
     */
    val USER_DEFINED_TYPE_CATALOG: TableField<TablesRecord, String?> = createField(DSL.name("user_defined_type_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.tables.user_defined_type_schema</code>.
     */
    val USER_DEFINED_TYPE_SCHEMA: TableField<TablesRecord, String?> = createField(DSL.name("user_defined_type_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.user_defined_type_name</code>.
     */
    val USER_DEFINED_TYPE_NAME: TableField<TablesRecord, String?> = createField(DSL.name("user_defined_type_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.is_insertable_into</code>.
     */
    val IS_INSERTABLE_INTO: TableField<TablesRecord, String?> = createField(DSL.name("is_insertable_into"), YES_OR_NO.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.is_typed</code>.
     */
    val IS_TYPED: TableField<TablesRecord, String?> = createField(DSL.name("is_typed"), YES_OR_NO.getDataType(), this, "")

    /**
     * The column <code>information_schema.tables.commit_action</code>.
     */
    val COMMIT_ACTION: TableField<TablesRecord, String?> = createField(DSL.name("commit_action"), CHARACTER_DATA.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<TablesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TablesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TablesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.tables</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.tables</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.tables</code> table reference
     */
    constructor(): this(DSL.name("tables"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Tables = Tables(DSL.name(alias), this)
    override fun `as`(alias: Name): Tables = Tables(alias, this)
    override fun `as`(alias: Table<*>): Tables = Tables(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Tables = Tables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Tables = Tables(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Tables = Tables(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Tables = Tables(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Tables = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Tables = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Tables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Tables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Tables = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Tables = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Tables = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Tables = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Tables = where(DSL.notExists(select))
}