/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CARDINAL_NUMBER
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.ElementTypesRecord
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
open class ElementTypes(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ElementTypesRecord>?,
    parentPath: InverseForeignKey<out Record, ElementTypesRecord>?,
    aliased: Table<ElementTypesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ElementTypesRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "element_types" as  SELECT (current_database())::information_schema.sql_identifier AS object_catalog,
      (n.nspname)::information_schema.sql_identifier AS object_schema,
      x.objname AS object_name,
      (x.objtype)::information_schema.character_data AS object_type,
      (x.objdtdid)::information_schema.sql_identifier AS collection_type_identifier,
      (
          CASE
              WHEN (nbt.nspname = 'pg_catalog'::name) THEN format_type(bt.oid, NULL::integer)
              ELSE 'USER-DEFINED'::text
          END)::information_schema.character_data AS data_type,
      (NULL::integer)::information_schema.cardinal_number AS character_maximum_length,
      (NULL::integer)::information_schema.cardinal_number AS character_octet_length,
      (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
      (NULL::name)::information_schema.sql_identifier AS character_set_schema,
      (NULL::name)::information_schema.sql_identifier AS character_set_name,
      (
          CASE
              WHEN (nco.nspname IS NOT NULL) THEN current_database()
              ELSE NULL::name
          END)::information_schema.sql_identifier AS collation_catalog,
      (nco.nspname)::information_schema.sql_identifier AS collation_schema,
      (co.collname)::information_schema.sql_identifier AS collation_name,
      (NULL::integer)::information_schema.cardinal_number AS numeric_precision,
      (NULL::integer)::information_schema.cardinal_number AS numeric_precision_radix,
      (NULL::integer)::information_schema.cardinal_number AS numeric_scale,
      (NULL::integer)::information_schema.cardinal_number AS datetime_precision,
      (NULL::character varying)::information_schema.character_data AS interval_type,
      (NULL::integer)::information_schema.cardinal_number AS interval_precision,
      (NULL::character varying)::information_schema.character_data AS domain_default,
      (current_database())::information_schema.sql_identifier AS udt_catalog,
      (nbt.nspname)::information_schema.sql_identifier AS udt_schema,
      (bt.typname)::information_schema.sql_identifier AS udt_name,
      (NULL::name)::information_schema.sql_identifier AS scope_catalog,
      (NULL::name)::information_schema.sql_identifier AS scope_schema,
      (NULL::name)::information_schema.sql_identifier AS scope_name,
      (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,
      (('a'::text || (x.objdtdid)::text))::information_schema.sql_identifier AS dtd_identifier
     FROM pg_namespace n,
      pg_type at,
      pg_namespace nbt,
      pg_type bt,
      (( SELECT c.relnamespace,
              (c.relname)::information_schema.sql_identifier AS relname,
                  CASE
                      WHEN (c.relkind = 'c'::"char") THEN 'USER-DEFINED TYPE'::text
                      ELSE 'TABLE'::text
                  END AS "case",
              a.attnum,
              a.atttypid,
              a.attcollation
             FROM pg_class c,
              pg_attribute a
            WHERE ((c.oid = a.attrelid) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'c'::"char", 'p'::"char"])) AND (a.attnum > 0) AND (NOT a.attisdropped))
          UNION ALL
           SELECT t.typnamespace,
              (t.typname)::information_schema.sql_identifier AS typname,
              'DOMAIN'::text AS text,
              1,
              t.typbasetype,
              t.typcollation
             FROM pg_type t
            WHERE (t.typtype = 'd'::"char")
          UNION ALL
           SELECT ss.pronamespace,
              (nameconcatoid(ss.proname, ss.oid))::information_schema.sql_identifier AS nameconcatoid,
              'ROUTINE'::text AS text,
              (ss.x).n AS n,
              (ss.x).x AS x,
              0
             FROM ( SELECT p.pronamespace,
                      p.proname,
                      p.oid,
                      information_schema._pg_expandarray(COALESCE(p.proallargtypes, (p.proargtypes)::oid[])) AS x
                     FROM pg_proc p) ss
          UNION ALL
           SELECT p.pronamespace,
              (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS nameconcatoid,
              'ROUTINE'::text AS text,
              0,
              p.prorettype,
              0
             FROM pg_proc p) x(objschema, objname, objtype, objdtdid, objtypeid, objcollation)
       LEFT JOIN (pg_collation co
       JOIN pg_namespace nco ON ((co.collnamespace = nco.oid))) ON (((x.objcollation = co.oid) AND ((nco.nspname <> 'pg_catalog'::name) OR (co.collname <> 'default'::name)))))
    WHERE ((n.oid = x.objschema) AND (at.oid = x.objtypeid) AND ((at.typelem <> (0)::oid) AND (at.typlen = '-1'::integer)) AND (at.typelem = bt.oid) AND (nbt.oid = bt.typnamespace) AND ((n.nspname, (x.objname)::name, x.objtype, ((x.objdtdid)::information_schema.sql_identifier)::name) IN ( SELECT data_type_privileges.object_schema,
              data_type_privileges.object_name,
              data_type_privileges.object_type,
              data_type_privileges.dtd_identifier
             FROM information_schema.data_type_privileges)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.element_types</code>
         */
        val ELEMENT_TYPES: ElementTypes = ElementTypes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ElementTypesRecord> = ElementTypesRecord::class.java

    /**
     * The column <code>information_schema.element_types.object_catalog</code>.
     */
    val OBJECT_CATALOG: TableField<ElementTypesRecord, String?> = createField(DSL.name("object_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.object_schema</code>.
     */
    val OBJECT_SCHEMA: TableField<ElementTypesRecord, String?> = createField(DSL.name("object_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.object_name</code>.
     */
    val OBJECT_NAME: TableField<ElementTypesRecord, String?> = createField(DSL.name("object_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.object_type</code>.
     */
    val OBJECT_TYPE: TableField<ElementTypesRecord, String?> = createField(DSL.name("object_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.collection_type_identifier</code>.
     */
    val COLLECTION_TYPE_IDENTIFIER: TableField<ElementTypesRecord, String?> = createField(DSL.name("collection_type_identifier"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.data_type</code>.
     */
    val DATA_TYPE: TableField<ElementTypesRecord, String?> = createField(DSL.name("data_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.character_maximum_length</code>.
     */
    val CHARACTER_MAXIMUM_LENGTH: TableField<ElementTypesRecord, Int?> = createField(DSL.name("character_maximum_length"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.character_octet_length</code>.
     */
    val CHARACTER_OCTET_LENGTH: TableField<ElementTypesRecord, Int?> = createField(DSL.name("character_octet_length"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.character_set_catalog</code>.
     */
    val CHARACTER_SET_CATALOG: TableField<ElementTypesRecord, String?> = createField(DSL.name("character_set_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.character_set_schema</code>.
     */
    val CHARACTER_SET_SCHEMA: TableField<ElementTypesRecord, String?> = createField(DSL.name("character_set_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.character_set_name</code>.
     */
    val CHARACTER_SET_NAME: TableField<ElementTypesRecord, String?> = createField(DSL.name("character_set_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.collation_catalog</code>.
     */
    val COLLATION_CATALOG: TableField<ElementTypesRecord, String?> = createField(DSL.name("collation_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.collation_schema</code>.
     */
    val COLLATION_SCHEMA: TableField<ElementTypesRecord, String?> = createField(DSL.name("collation_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.collation_name</code>.
     */
    val COLLATION_NAME: TableField<ElementTypesRecord, String?> = createField(DSL.name("collation_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.numeric_precision</code>.
     */
    val NUMERIC_PRECISION: TableField<ElementTypesRecord, Int?> = createField(DSL.name("numeric_precision"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.numeric_precision_radix</code>.
     */
    val NUMERIC_PRECISION_RADIX: TableField<ElementTypesRecord, Int?> = createField(DSL.name("numeric_precision_radix"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.numeric_scale</code>.
     */
    val NUMERIC_SCALE: TableField<ElementTypesRecord, Int?> = createField(DSL.name("numeric_scale"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.datetime_precision</code>.
     */
    val DATETIME_PRECISION: TableField<ElementTypesRecord, Int?> = createField(DSL.name("datetime_precision"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.interval_type</code>.
     */
    val INTERVAL_TYPE: TableField<ElementTypesRecord, String?> = createField(DSL.name("interval_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.interval_precision</code>.
     */
    val INTERVAL_PRECISION: TableField<ElementTypesRecord, Int?> = createField(DSL.name("interval_precision"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.domain_default</code>.
     */
    val DOMAIN_DEFAULT: TableField<ElementTypesRecord, String?> = createField(DSL.name("domain_default"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.udt_catalog</code>.
     */
    val UDT_CATALOG: TableField<ElementTypesRecord, String?> = createField(DSL.name("udt_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.udt_schema</code>.
     */
    val UDT_SCHEMA: TableField<ElementTypesRecord, String?> = createField(DSL.name("udt_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.udt_name</code>.
     */
    val UDT_NAME: TableField<ElementTypesRecord, String?> = createField(DSL.name("udt_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.scope_catalog</code>.
     */
    val SCOPE_CATALOG: TableField<ElementTypesRecord, String?> = createField(DSL.name("scope_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.scope_schema</code>.
     */
    val SCOPE_SCHEMA: TableField<ElementTypesRecord, String?> = createField(DSL.name("scope_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.scope_name</code>.
     */
    val SCOPE_NAME: TableField<ElementTypesRecord, String?> = createField(DSL.name("scope_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.element_types.maximum_cardinality</code>.
     */
    val MAXIMUM_CARDINALITY: TableField<ElementTypesRecord, Int?> = createField(DSL.name("maximum_cardinality"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column <code>information_schema.element_types.dtd_identifier</code>.
     */
    val DTD_IDENTIFIER: TableField<ElementTypesRecord, String?> = createField(DSL.name("dtd_identifier"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<ElementTypesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ElementTypesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ElementTypesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.element_types</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.element_types</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.element_types</code> table reference
     */
    constructor(): this(DSL.name("element_types"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ElementTypes = ElementTypes(DSL.name(alias), this)
    override fun `as`(alias: Name): ElementTypes = ElementTypes(alias, this)
    override fun `as`(alias: Table<*>): ElementTypes = ElementTypes(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ElementTypes = ElementTypes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ElementTypes = ElementTypes(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ElementTypes = ElementTypes(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ElementTypes = ElementTypes(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ElementTypes = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ElementTypes = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ElementTypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ElementTypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ElementTypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ElementTypes = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ElementTypes = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ElementTypes = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ElementTypes = where(DSL.notExists(select))
}
