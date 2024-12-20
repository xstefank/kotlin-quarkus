/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.AclexplodeRecord
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Aclexplode(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, AclexplodeRecord>?,
    parentPath: InverseForeignKey<out Record, AclexplodeRecord>?,
    aliased: Table<AclexplodeRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<AclexplodeRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.aclexplode</code>
         */
        val ACLEXPLODE: Aclexplode = Aclexplode()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<AclexplodeRecord> = AclexplodeRecord::class.java

    /**
     * The column <code>pg_catalog.aclexplode.grantor</code>.
     */
    val GRANTOR: TableField<AclexplodeRecord, Long?> = createField(DSL.name("grantor"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.aclexplode.grantee</code>.
     */
    val GRANTEE: TableField<AclexplodeRecord, Long?> = createField(DSL.name("grantee"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    val PRIVILEGE_TYPE: TableField<AclexplodeRecord, String?> = createField(DSL.name("privilege_type"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    val IS_GRANTABLE: TableField<AclexplodeRecord, Boolean?> = createField(DSL.name("is_grantable"), SQLDataType.BOOLEAN, this, "")

    private constructor(alias: Name, aliased: Table<AclexplodeRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.VARCHAR.array())
    ), null)
    private constructor(alias: Name, aliased: Table<AclexplodeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.aclexplode</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.aclexplode</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.aclexplode</code> table reference
     */
    constructor(): this(DSL.name("aclexplode"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): Aclexplode = Aclexplode(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): Aclexplode = Aclexplode(alias, this, parameters)
    override fun `as`(alias: Table<*>): Aclexplode = Aclexplode(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): Aclexplode = Aclexplode(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Aclexplode = Aclexplode(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Aclexplode = Aclexplode(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          acl: Array<String?>?
    ): Aclexplode = Aclexplode(DSL.name("aclexplode"), null, arrayOf(
        DSL.value(acl, SQLDataType.VARCHAR.array())
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          acl: Field<Array<String?>?>
    ): Aclexplode = Aclexplode(DSL.name("aclexplode"), null, arrayOf(
        acl
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
