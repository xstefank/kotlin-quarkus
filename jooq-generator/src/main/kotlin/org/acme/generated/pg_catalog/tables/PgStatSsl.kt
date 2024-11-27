/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import java.math.BigDecimal

import kotlin.collections.Collection

import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatSslRecord
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
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatSsl(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatSslRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatSslRecord>?,
    aliased: Table<PgStatSslRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatSslRecord>(
    alias,
    PgCatalog.PG_CATALOG,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "pg_stat_ssl" as  SELECT s.pid,
      s.ssl,
      s.sslversion AS version,
      s.sslcipher AS cipher,
      s.sslbits AS bits,
      s.ssl_client_dn AS client_dn,
      s.ssl_client_serial AS client_serial,
      s.ssl_issuer_dn AS issuer_dn
     FROM pg_stat_get_activity(NULL::integer) s(datid, pid, usesysid, application_name, state, query, wait_event_type, wait_event, xact_start, query_start, backend_start, state_change, client_addr, client_hostname, client_port, backend_xid, backend_xmin, backend_type, ssl, sslversion, sslcipher, sslbits, ssl_client_dn, ssl_client_serial, ssl_issuer_dn, gss_auth, gss_princ, gss_enc, leader_pid, query_id)
    WHERE (s.client_port IS NOT NULL);
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>pg_catalog.pg_stat_ssl</code>
         */
        val PG_STAT_SSL: PgStatSsl = PgStatSsl()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatSslRecord> = PgStatSslRecord::class.java

    /**
     * The column <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    val PID: TableField<PgStatSslRecord, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    val SSL: TableField<PgStatSslRecord, Boolean?> = createField(DSL.name("ssl"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    val VERSION: TableField<PgStatSslRecord, String?> = createField(DSL.name("version"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    val CIPHER: TableField<PgStatSslRecord, String?> = createField(DSL.name("cipher"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    val BITS: TableField<PgStatSslRecord, Int?> = createField(DSL.name("bits"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    val CLIENT_DN: TableField<PgStatSslRecord, String?> = createField(DSL.name("client_dn"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    val CLIENT_SERIAL: TableField<PgStatSslRecord, BigDecimal?> = createField(DSL.name("client_serial"), SQLDataType.NUMERIC, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    val ISSUER_DN: TableField<PgStatSslRecord, String?> = createField(DSL.name("issuer_dn"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<PgStatSslRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PgStatSslRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PgStatSslRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_ssl</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_ssl</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_ssl</code> table reference
     */
    constructor(): this(DSL.name("pg_stat_ssl"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatSsl = PgStatSsl(DSL.name(alias), this)
    override fun `as`(alias: Name): PgStatSsl = PgStatSsl(alias, this)
    override fun `as`(alias: Table<*>): PgStatSsl = PgStatSsl(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatSsl = PgStatSsl(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatSsl = PgStatSsl(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatSsl = PgStatSsl(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PgStatSsl = PgStatSsl(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PgStatSsl = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PgStatSsl = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PgStatSsl = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PgStatSsl = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PgStatSsl = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PgStatSsl = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PgStatSsl = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PgStatSsl = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PgStatSsl = where(DSL.notExists(select))
}
