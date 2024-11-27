/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables


import kotlin.collections.Collection

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.information_schema.domains.CHARACTER_DATA
import org.acme.generated.information_schema.domains.SQL_IDENTIFIER
import org.acme.generated.information_schema.tables.records.DataTypePrivilegesRecord
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
open class DataTypePrivileges(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, DataTypePrivilegesRecord>?,
    parentPath: InverseForeignKey<out Record, DataTypePrivilegesRecord>?,
    aliased: Table<DataTypePrivilegesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<DataTypePrivilegesRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "data_type_privileges" as  SELECT (current_database())::information_schema.sql_identifier AS object_catalog,
     x.objschema AS object_schema,
     x.objname AS object_name,
     (x.objtype)::information_schema.character_data AS object_type,
     x.objdtdid AS dtd_identifier
    FROM ( SELECT attributes.udt_schema,
             attributes.udt_name,
             'USER-DEFINED TYPE'::text AS text,
             attributes.dtd_identifier
            FROM information_schema.attributes
         UNION ALL
          SELECT columns.table_schema,
             columns.table_name,
             'TABLE'::text AS text,
             columns.dtd_identifier
            FROM information_schema.columns
         UNION ALL
          SELECT domains.domain_schema,
             domains.domain_name,
             'DOMAIN'::text AS text,
             domains.dtd_identifier
            FROM information_schema.domains
         UNION ALL
          SELECT parameters.specific_schema,
             parameters.specific_name,
             'ROUTINE'::text AS text,
             parameters.dtd_identifier
            FROM information_schema.parameters
         UNION ALL
          SELECT routines.specific_schema,
             routines.specific_name,
             'ROUTINE'::text AS text,
             routines.dtd_identifier
            FROM information_schema.routines) x(objschema, objname, objtype, objdtdid);
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>information_schema.data_type_privileges</code>
         */
        val DATA_TYPE_PRIVILEGES: DataTypePrivileges = DataTypePrivileges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DataTypePrivilegesRecord> = DataTypePrivilegesRecord::class.java

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_catalog</code>.
     */
    val OBJECT_CATALOG: TableField<DataTypePrivilegesRecord, String?> = createField(DSL.name("object_catalog"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_schema</code>.
     */
    val OBJECT_SCHEMA: TableField<DataTypePrivilegesRecord, String?> = createField(DSL.name("object_schema"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_name</code>.
     */
    val OBJECT_NAME: TableField<DataTypePrivilegesRecord, String?> = createField(DSL.name("object_name"), SQL_IDENTIFIER.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_type</code>.
     */
    val OBJECT_TYPE: TableField<DataTypePrivilegesRecord, String?> = createField(DSL.name("object_type"), CHARACTER_DATA.getDataType(), this, "")

    /**
     * The column
     * <code>information_schema.data_type_privileges.dtd_identifier</code>.
     */
    val DTD_IDENTIFIER: TableField<DataTypePrivilegesRecord, String?> = createField(DSL.name("dtd_identifier"), SQL_IDENTIFIER.getDataType(), this, "")

    private constructor(alias: Name, aliased: Table<DataTypePrivilegesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<DataTypePrivilegesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<DataTypePrivilegesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.data_type_privileges</code> table
     * reference
     */
    constructor(): this(DSL.name("data_type_privileges"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): DataTypePrivileges = DataTypePrivileges(DSL.name(alias), this)
    override fun `as`(alias: Name): DataTypePrivileges = DataTypePrivileges(alias, this)
    override fun `as`(alias: Table<*>): DataTypePrivileges = DataTypePrivileges(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): DataTypePrivileges = DataTypePrivileges(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): DataTypePrivileges = DataTypePrivileges(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): DataTypePrivileges = DataTypePrivileges(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): DataTypePrivileges = DataTypePrivileges(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): DataTypePrivileges = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): DataTypePrivileges = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): DataTypePrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): DataTypePrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): DataTypePrivileges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): DataTypePrivileges = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): DataTypePrivileges = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): DataTypePrivileges = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): DataTypePrivileges = where(DSL.notExists(select))
}