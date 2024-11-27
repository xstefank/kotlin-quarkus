/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.ReferentialConstraintsRecord
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
open class ReferentialConstraints(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ReferentialConstraintsRecord>?,
    parentPath: InverseForeignKey<out Record, ReferentialConstraintsRecord>?,
    aliased: Table<ReferentialConstraintsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ReferentialConstraintsRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "referential_constraints" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,
      (ncon.nspname)::information_schema.sql_identifier AS constraint_schema,
      (con.conname)::information_schema.sql_identifier AS constraint_name,
      (
          CASE
              WHEN (npkc.nspname IS NULL) THEN NULL::name
              ELSE current_database()
          END)::information_schema.sql_identifier AS unique_constraint_catalog,
      (npkc.nspname)::information_schema.sql_identifier AS unique_constraint_schema,
      (pkc.conname)::information_schema.sql_identifier AS unique_constraint_name,
      (
          CASE con.confmatchtype
              WHEN 'f'::"char" THEN 'FULL'::text
              WHEN 'p'::"char" THEN 'PARTIAL'::text
              WHEN 's'::"char" THEN 'NONE'::text
              ELSE NULL::text
          END)::information_schema.character_data AS match_option,
      (
          CASE con.confupdtype
              WHEN 'c'::"char" THEN 'CASCADE'::text
              WHEN 'n'::"char" THEN 'SET NULL'::text
              WHEN 'd'::"char" THEN 'SET DEFAULT'::text
              WHEN 'r'::"char" THEN 'RESTRICT'::text
              WHEN 'a'::"char" THEN 'NO ACTION'::text
              ELSE NULL::text
          END)::information_schema.character_data AS update_rule,
      (
          CASE con.confdeltype
              WHEN 'c'::"char" THEN 'CASCADE'::text
              WHEN 'n'::"char" THEN 'SET NULL'::text
              WHEN 'd'::"char" THEN 'SET DEFAULT'::text
              WHEN 'r'::"char" THEN 'RESTRICT'::text
              WHEN 'a'::"char" THEN 'NO ACTION'::text
              ELSE NULL::text
          END)::information_schema.character_data AS delete_rule
     FROM ((((((pg_namespace ncon
       JOIN pg_constraint con ON ((ncon.oid = con.connamespace)))
       JOIN pg_class c ON (((con.conrelid = c.oid) AND (con.contype = 'f'::"char"))))
       LEFT JOIN pg_depend d1 ON (((d1.objid = con.oid) AND (d1.classid = ('pg_constraint'::regclass)::oid) AND (d1.refclassid = ('pg_class'::regclass)::oid) AND (d1.refobjsubid = 0))))
       LEFT JOIN pg_depend d2 ON (((d2.refclassid = ('pg_constraint'::regclass)::oid) AND (d2.classid = ('pg_class'::regclass)::oid) AND (d2.objid = d1.refobjid) AND (d2.objsubid = 0) AND (d2.deptype = 'i'::"char"))))
       LEFT JOIN pg_constraint pkc ON (((pkc.oid = d2.refobjid) AND (pkc.contype = ANY (ARRAY['p'::"char", 'u'::"char"])) AND (pkc.conrelid = con.confrelid))))
       LEFT JOIN pg_namespace npkc ON ((pkc.connamespace = npkc.oid)))
    WHERE (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'INSERT, UPDATE, REFERENCES'::text));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.referential_constraints</code>
         */
        val REFERENTIAL_CONSTRAINTS: ReferentialConstraints = ReferentialConstraints()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReferentialConstraintsRecord> = ReferentialConstraintsRecord::class.java

    /**
     * The column
     * <code>information_schema.referential_constraints.constraint_catalog</code>.
     */
    val CONSTRAINT_CATALOG: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("constraint_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.constraint_schema</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("constraint_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.constraint_name</code>.
     */
    val CONSTRAINT_NAME: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("constraint_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.unique_constraint_catalog</code>.
     */
    val UNIQUE_CONSTRAINT_CATALOG: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("unique_constraint_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.unique_constraint_schema</code>.
     */
    val UNIQUE_CONSTRAINT_SCHEMA: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("unique_constraint_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.unique_constraint_name</code>.
     */
    val UNIQUE_CONSTRAINT_NAME: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("unique_constraint_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.match_option</code>.
     */
    val MATCH_OPTION: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("match_option"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.update_rule</code>.
     */
    val UPDATE_RULE: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("update_rule"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.referential_constraints.delete_rule</code>.
     */
    val DELETE_RULE: TableField<ReferentialConstraintsRecord, String?> = createField(DSL.name("delete_rule"), CHARACTER_DATA.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<ReferentialConstraintsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ReferentialConstraintsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ReferentialConstraintsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.referential_constraints</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.referential_constraints</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.referential_constraints</code> table
     * reference
     */
    constructor(): this(DSL.name("referential_constraints"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ReferentialConstraints = ReferentialConstraints(DSL.name(alias), this)
    override fun `as`(alias: Name): ReferentialConstraints = ReferentialConstraints(alias, this)
    override fun `as`(alias: Table<*>): ReferentialConstraints = ReferentialConstraints(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReferentialConstraints = ReferentialConstraints(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReferentialConstraints = ReferentialConstraints(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ReferentialConstraints = ReferentialConstraints(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ReferentialConstraints = ReferentialConstraints(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ReferentialConstraints = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ReferentialConstraints = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ReferentialConstraints = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ReferentialConstraints = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ReferentialConstraints = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ReferentialConstraints = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ReferentialConstraints = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ReferentialConstraints = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ReferentialConstraints = where(DSL.notExists(select))
}