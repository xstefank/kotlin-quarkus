/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.domains.YES_OR_NO
import org.acme.generated.information_schema.tables.records.TablePrivilegesRecord
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
open class TablePrivileges(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TablePrivilegesRecord>?,
    parentPath: InverseForeignKey<out Record, TablePrivilegesRecord>?,
    aliased: Table<TablePrivilegesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TablePrivilegesRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "table_privileges" as  SELECT (u_grantor.rolname)::information_schema.sql_identifier AS grantor,
      (grantee.rolname)::information_schema.sql_identifier AS grantee,
      (current_database())::information_schema.sql_identifier AS table_catalog,
      (nc.nspname)::information_schema.sql_identifier AS table_schema,
      (c.relname)::information_schema.sql_identifier AS table_name,
      (c.prtype)::information_schema.character_data AS privilege_type,
      (
          CASE
              WHEN (pg_has_role(grantee.oid, c.relowner, 'USAGE'::text) OR c.grantable) THEN 'YES'::text
              ELSE 'NO'::text
          END)::information_schema.yes_or_no AS is_grantable,
      (
          CASE
              WHEN (c.prtype = 'SELECT'::text) THEN 'YES'::text
              ELSE 'NO'::text
          END)::information_schema.yes_or_no AS with_hierarchy
     FROM ( SELECT pg_class.oid,
              pg_class.relname,
              pg_class.relnamespace,
              pg_class.relkind,
              pg_class.relowner,
              (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantor AS grantor,
              (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantee AS grantee,
              (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).privilege_type AS privilege_type,
              (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).is_grantable AS is_grantable
             FROM pg_class) c(oid, relname, relnamespace, relkind, relowner, grantor, grantee, prtype, grantable),
      pg_namespace nc,
      pg_authid u_grantor,
      ( SELECT pg_authid.oid,
              pg_authid.rolname
             FROM pg_authid
          UNION ALL
           SELECT (0)::oid AS oid,
              'PUBLIC'::name) grantee(oid, rolname)
    WHERE ((c.relnamespace = nc.oid) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (c.grantee = grantee.oid) AND (c.grantor = u_grantor.oid) AND (c.prtype = ANY (ARRAY['INSERT'::text, 'SELECT'::text, 'UPDATE'::text, 'DELETE'::text, 'TRUNCATE'::text, 'REFERENCES'::text, 'TRIGGER'::text])) AND (pg_has_role(u_grantor.oid, 'USAGE'::text) OR pg_has_role(grantee.oid, 'USAGE'::text) OR (grantee.rolname = 'PUBLIC'::name)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.table_privileges</code>
         */
        val TABLE_PRIVILEGES: TablePrivileges = TablePrivileges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TablePrivilegesRecord> = TablePrivilegesRecord::class.java

    /**
     * The column <code>information_schema.table_privileges.grantor</code>.
     */
    val GRANTOR: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("grantor"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.table_privileges.grantee</code>.
     */
    val GRANTEE: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("grantee"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.table_privileges.table_catalog</code>.
     */
    val TABLE_CATALOG: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("table_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.table_privileges.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("table_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.table_privileges.table_name</code>.
     */
    val TABLE_NAME: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("table_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.table_privileges.privilege_type</code>.
     */
    val PRIVILEGE_TYPE: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("privilege_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.table_privileges.is_grantable</code>.
     */
    val IS_GRANTABLE: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("is_grantable"), YES_OR_NO.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.table_privileges.with_hierarchy</code>.
     */
    val WITH_HIERARCHY: TableField<TablePrivilegesRecord, String?> = createField(DSL.name("with_hierarchy"), YES_OR_NO.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<TablePrivilegesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TablePrivilegesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TablePrivilegesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.table_privileges</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.table_privileges</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.table_privileges</code> table reference
     */
    constructor(): this(DSL.name("table_privileges"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): TablePrivileges = TablePrivileges(DSL.name(alias), this)
    override fun `as`(alias: Name): TablePrivileges = TablePrivileges(alias, this)
    override fun `as`(alias: Table<*>): TablePrivileges = TablePrivileges(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TablePrivileges = TablePrivileges(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TablePrivileges = TablePrivileges(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TablePrivileges = TablePrivileges(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): TablePrivileges = TablePrivileges(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): TablePrivileges = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): TablePrivileges = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): TablePrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): TablePrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): TablePrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): TablePrivileges = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): TablePrivileges = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): TablePrivileges = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): TablePrivileges = where(DSL.notExists(select))
}
