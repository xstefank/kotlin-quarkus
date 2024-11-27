/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.domains.YES_OR_NO
import org.acme.generated.information_schema.tables.records.ColumnPrivilegesRecord
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
open class ColumnPrivileges(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ColumnPrivilegesRecord>?,
    parentPath: InverseForeignKey<out Record, ColumnPrivilegesRecord>?,
    aliased: Table<ColumnPrivilegesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ColumnPrivilegesRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "column_privileges" as  SELECT (u_grantor.rolname)::information_schema.sql_identifier AS grantor,
      (grantee.rolname)::information_schema.sql_identifier AS grantee,
      (current_database())::information_schema.sql_identifier AS table_catalog,
      (nc.nspname)::information_schema.sql_identifier AS table_schema,
      (x.relname)::information_schema.sql_identifier AS table_name,
      (x.attname)::information_schema.sql_identifier AS column_name,
      (x.prtype)::information_schema.character_data AS privilege_type,
      (
          CASE
              WHEN (pg_has_role(x.grantee, x.relowner, 'USAGE'::text) OR x.grantable) THEN 'YES'::text
              ELSE 'NO'::text
          END)::information_schema.yes_or_no AS is_grantable
     FROM ( SELECT pr_c.grantor,
              pr_c.grantee,
              a.attname,
              pr_c.relname,
              pr_c.relnamespace,
              pr_c.prtype,
              pr_c.grantable,
              pr_c.relowner
             FROM ( SELECT pg_class.oid,
                      pg_class.relname,
                      pg_class.relnamespace,
                      pg_class.relowner,
                      (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantor AS grantor,
                      (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantee AS grantee,
                      (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).privilege_type AS privilege_type,
                      (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).is_grantable AS is_grantable
                     FROM pg_class
                    WHERE (pg_class.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"]))) pr_c(oid, relname, relnamespace, relowner, grantor, grantee, prtype, grantable),
              pg_attribute a
            WHERE ((a.attrelid = pr_c.oid) AND (a.attnum > 0) AND (NOT a.attisdropped))
          UNION
           SELECT pr_a.grantor,
              pr_a.grantee,
              pr_a.attname,
              c.relname,
              c.relnamespace,
              pr_a.prtype,
              pr_a.grantable,
              c.relowner
             FROM ( SELECT a.attrelid,
                      a.attname,
                      (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).grantor AS grantor,
                      (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).grantee AS grantee,
                      (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).privilege_type AS privilege_type,
                      (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).is_grantable AS is_grantable
                     FROM (pg_attribute a
                       JOIN pg_class cc ON ((a.attrelid = cc.oid)))
                    WHERE ((a.attnum > 0) AND (NOT a.attisdropped))) pr_a(attrelid, attname, grantor, grantee, prtype, grantable),
              pg_class c
            WHERE ((pr_a.attrelid = c.oid) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])))) x,
      pg_namespace nc,
      pg_authid u_grantor,
      ( SELECT pg_authid.oid,
              pg_authid.rolname
             FROM pg_authid
          UNION ALL
           SELECT (0)::oid AS oid,
              'PUBLIC'::name) grantee(oid, rolname)
    WHERE ((x.relnamespace = nc.oid) AND (x.grantee = grantee.oid) AND (x.grantor = u_grantor.oid) AND (x.prtype = ANY (ARRAY['INSERT'::text, 'SELECT'::text, 'UPDATE'::text, 'REFERENCES'::text])) AND (pg_has_role(u_grantor.oid, 'USAGE'::text) OR pg_has_role(grantee.oid, 'USAGE'::text) OR (grantee.rolname = 'PUBLIC'::name)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.column_privileges</code>
         */
        val COLUMN_PRIVILEGES: ColumnPrivileges = ColumnPrivileges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ColumnPrivilegesRecord> = ColumnPrivilegesRecord::class.java

    /**
     * The column <code>information_schema.column_privileges.grantor</code>.
     */
    val GRANTOR: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("grantor"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.column_privileges.grantee</code>.
     */
    val GRANTEE: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("grantee"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_privileges.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("table_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_privileges.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("table_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.column_privileges.table_name</code>.
     */
    val TABLE_NAME: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("table_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.column_privileges.column_name</code>.
     */
    val COLUMN_NAME: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("column_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_privileges.privilege_type</code>.
     */
    val PRIVILEGE_TYPE: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("privilege_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.column_privileges.is_grantable</code>.
     */
    val IS_GRANTABLE: TableField<ColumnPrivilegesRecord, String?> = createField(DSL.name("is_grantable"), YES_OR_NO.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<ColumnPrivilegesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ColumnPrivilegesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ColumnPrivilegesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.column_privileges</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.column_privileges</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.column_privileges</code> table
     * reference
     */
    constructor(): this(DSL.name("column_privileges"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ColumnPrivileges = ColumnPrivileges(DSL.name(alias), this)
    override fun `as`(alias: Name): ColumnPrivileges = ColumnPrivileges(alias, this)
    override fun `as`(alias: Table<*>): ColumnPrivileges = ColumnPrivileges(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ColumnPrivileges = ColumnPrivileges(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ColumnPrivileges = ColumnPrivileges(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ColumnPrivileges = ColumnPrivileges(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ColumnPrivileges = ColumnPrivileges(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ColumnPrivileges = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ColumnPrivileges = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ColumnPrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ColumnPrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ColumnPrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ColumnPrivileges = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ColumnPrivileges = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ColumnPrivileges = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ColumnPrivileges = where(DSL.notExists(select))
}
