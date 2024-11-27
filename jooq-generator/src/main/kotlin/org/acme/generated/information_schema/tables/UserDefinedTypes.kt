/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CARDINAL_NUMBER
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.domains.YES_OR_NO
import org.acme.generated.information_schema.tables.records.UserDefinedTypesRecord
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
open class UserDefinedTypes(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, UserDefinedTypesRecord>?,
    parentPath: InverseForeignKey<out Record, UserDefinedTypesRecord>?,
    aliased: Table<UserDefinedTypesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<UserDefinedTypesRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "user_defined_types" as  SELECT (current_database())::information_schema.sql_identifier AS user_defined_type_catalog,
      (n.nspname)::information_schema.sql_identifier AS user_defined_type_schema,
      (c.relname)::information_schema.sql_identifier AS user_defined_type_name,
      ('STRUCTURED'::character varying)::information_schema.character_data AS user_defined_type_category,
      ('YES'::character varying)::information_schema.yes_or_no AS is_instantiable,
      (NULL::character varying)::information_schema.yes_or_no AS is_final,
      (NULL::character varying)::information_schema.character_data AS ordering_form,
      (NULL::character varying)::information_schema.character_data AS ordering_category,
      (NULL::name)::information_schema.sql_identifier AS ordering_routine_catalog,
      (NULL::name)::information_schema.sql_identifier AS ordering_routine_schema,
      (NULL::name)::information_schema.sql_identifier AS ordering_routine_name,
      (NULL::character varying)::information_schema.character_data AS reference_type,
      (NULL::character varying)::information_schema.character_data AS data_type,
      (NULL::integer)::information_schema.cardinal_number AS character_maximum_length,
      (NULL::integer)::information_schema.cardinal_number AS character_octet_length,
      (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
      (NULL::name)::information_schema.sql_identifier AS character_set_schema,
      (NULL::name)::information_schema.sql_identifier AS character_set_name,
      (NULL::name)::information_schema.sql_identifier AS collation_catalog,
      (NULL::name)::information_schema.sql_identifier AS collation_schema,
      (NULL::name)::information_schema.sql_identifier AS collation_name,
      (NULL::integer)::information_schema.cardinal_number AS numeric_precision,
      (NULL::integer)::information_schema.cardinal_number AS numeric_precision_radix,
      (NULL::integer)::information_schema.cardinal_number AS numeric_scale,
      (NULL::integer)::information_schema.cardinal_number AS datetime_precision,
      (NULL::character varying)::information_schema.character_data AS interval_type,
      (NULL::integer)::information_schema.cardinal_number AS interval_precision,
      (NULL::name)::information_schema.sql_identifier AS source_dtd_identifier,
      (NULL::name)::information_schema.sql_identifier AS ref_dtd_identifier
     FROM pg_namespace n,
      pg_class c,
      pg_type t
    WHERE ((n.oid = c.relnamespace) AND (t.typrelid = c.oid) AND (c.relkind = 'c'::"char") AND (pg_has_role(t.typowner, 'USAGE'::text) OR has_type_privilege(t.oid, 'USAGE'::text)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.user_defined_types</code>
         */
        val USER_DEFINED_TYPES: UserDefinedTypes = UserDefinedTypes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<UserDefinedTypesRecord> = UserDefinedTypesRecord::class.java

    /**
     * The column
     * <code>information_schema.user_defined_types.user_defined_type_catalog</code>.
     */
    val USER_DEFINED_TYPE_CATALOG: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("user_defined_type_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.user_defined_type_schema</code>.
     */
    val USER_DEFINED_TYPE_SCHEMA: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("user_defined_type_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.user_defined_type_name</code>.
     */
    val USER_DEFINED_TYPE_NAME: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("user_defined_type_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.user_defined_type_category</code>.
     */
    val USER_DEFINED_TYPE_CATEGORY: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("user_defined_type_category"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.is_instantiable</code>.
     */
    val IS_INSTANTIABLE: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("is_instantiable"), YES_OR_NO.getDataType(), this, "")

    /**
     * The column <code>information_schema.user_defined_types.is_final</code>.
     */
    val IS_FINAL: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("is_final"), YES_OR_NO.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.ordering_form</code>.
     */
    val ORDERING_FORM: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("ordering_form"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.ordering_category</code>.
     */
    val ORDERING_CATEGORY: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("ordering_category"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.ordering_routine_catalog</code>.
     */
    val ORDERING_ROUTINE_CATALOG: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("ordering_routine_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.ordering_routine_schema</code>.
     */
    val ORDERING_ROUTINE_SCHEMA: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("ordering_routine_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.ordering_routine_name</code>.
     */
    val ORDERING_ROUTINE_NAME: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("ordering_routine_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.reference_type</code>.
     */
    val REFERENCE_TYPE: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("reference_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column <code>information_schema.user_defined_types.data_type</code>.
     */
    val DATA_TYPE: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("data_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.character_maximum_length</code>.
     */
    val CHARACTER_MAXIMUM_LENGTH: TableField<UserDefinedTypesRecord, Int?> = createField(DSL.name("character_maximum_length"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.character_octet_length</code>.
     */
    val CHARACTER_OCTET_LENGTH: TableField<UserDefinedTypesRecord, Int?> = createField(DSL.name("character_octet_length"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.character_set_catalog</code>.
     */
    val CHARACTER_SET_CATALOG: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("character_set_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.character_set_schema</code>.
     */
    val CHARACTER_SET_SCHEMA: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("character_set_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.character_set_name</code>.
     */
    val CHARACTER_SET_NAME: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("character_set_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.collation_catalog</code>.
     */
    val COLLATION_CATALOG: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("collation_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.collation_schema</code>.
     */
    val COLLATION_SCHEMA: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("collation_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.collation_name</code>.
     */
    val COLLATION_NAME: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("collation_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.numeric_precision</code>.
     */
    val NUMERIC_PRECISION: TableField<UserDefinedTypesRecord, Int?> = createField(DSL.name("numeric_precision"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.numeric_precision_radix</code>.
     */
    val NUMERIC_PRECISION_RADIX: TableField<UserDefinedTypesRecord, Int?> = createField(DSL.name("numeric_precision_radix"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.numeric_scale</code>.
     */
    val NUMERIC_SCALE: TableField<UserDefinedTypesRecord, Int?> = createField(DSL.name("numeric_scale"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.datetime_precision</code>.
     */
    val DATETIME_PRECISION: TableField<UserDefinedTypesRecord, Int?> = createField(DSL.name("datetime_precision"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.interval_type</code>.
     */
    val INTERVAL_TYPE: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("interval_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.interval_precision</code>.
     */
    val INTERVAL_PRECISION: TableField<UserDefinedTypesRecord, Int?> = createField(DSL.name("interval_precision"), CARDINAL_NUMBER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.source_dtd_identifier</code>.
     */
    val SOURCE_DTD_IDENTIFIER: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("source_dtd_identifier"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.user_defined_types.ref_dtd_identifier</code>.
     */
    val REF_DTD_IDENTIFIER: TableField<UserDefinedTypesRecord, String?> = createField(DSL.name("ref_dtd_identifier"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<UserDefinedTypesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<UserDefinedTypesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<UserDefinedTypesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.user_defined_types</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.user_defined_types</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.user_defined_types</code> table
     * reference
     */
    constructor(): this(DSL.name("user_defined_types"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): UserDefinedTypes = UserDefinedTypes(DSL.name(alias), this)
    override fun `as`(alias: Name): UserDefinedTypes = UserDefinedTypes(alias, this)
    override fun `as`(alias: Table<*>): UserDefinedTypes = UserDefinedTypes(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): UserDefinedTypes = UserDefinedTypes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): UserDefinedTypes = UserDefinedTypes(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): UserDefinedTypes = UserDefinedTypes(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): UserDefinedTypes = UserDefinedTypes(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): UserDefinedTypes = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): UserDefinedTypes = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): UserDefinedTypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): UserDefinedTypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): UserDefinedTypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): UserDefinedTypes = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): UserDefinedTypes = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): UserDefinedTypes = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): UserDefinedTypes = where(DSL.notExists(select))
}
