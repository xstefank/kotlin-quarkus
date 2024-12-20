/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables


import org.acme.generated.pg_catalog.PgCatalog
import org.acme.generated.pg_catalog.tables.records.PgStatGetProgressInfoRecord
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
open class PgStatGetProgressInfo(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PgStatGetProgressInfoRecord>?,
    parentPath: InverseForeignKey<out Record, PgStatGetProgressInfoRecord>?,
    aliased: Table<PgStatGetProgressInfoRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PgStatGetProgressInfoRecord>(
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
         * The reference instance of
         * <code>pg_catalog.pg_stat_get_progress_info</code>
         */
        val PG_STAT_GET_PROGRESS_INFO: PgStatGetProgressInfo = PgStatGetProgressInfo()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PgStatGetProgressInfoRecord> = PgStatGetProgressInfoRecord::class.java

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.pid</code>.
     */
    val PID: TableField<PgStatGetProgressInfoRecord, Int?> = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.datid</code>.
     */
    val DATID: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.relid</code>.
     */
    val RELID: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param1</code>.
     */
    val PARAM1: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param1"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param2</code>.
     */
    val PARAM2: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param2"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param3</code>.
     */
    val PARAM3: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param3"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param4</code>.
     */
    val PARAM4: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param4"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param5</code>.
     */
    val PARAM5: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param5"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param6</code>.
     */
    val PARAM6: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param6"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param7</code>.
     */
    val PARAM7: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param7"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param8</code>.
     */
    val PARAM8: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param8"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param9</code>.
     */
    val PARAM9: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param9"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param10</code>.
     */
    val PARAM10: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param10"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param11</code>.
     */
    val PARAM11: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param11"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param12</code>.
     */
    val PARAM12: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param12"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param13</code>.
     */
    val PARAM13: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param13"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param14</code>.
     */
    val PARAM14: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param14"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param15</code>.
     */
    val PARAM15: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param15"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param16</code>.
     */
    val PARAM16: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param16"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param17</code>.
     */
    val PARAM17: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param17"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param18</code>.
     */
    val PARAM18: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param18"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param19</code>.
     */
    val PARAM19: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param19"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>pg_catalog.pg_stat_get_progress_info.param20</code>.
     */
    val PARAM20: TableField<PgStatGetProgressInfoRecord, Long?> = createField(DSL.name("param20"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<PgStatGetProgressInfoRecord>?): this(alias, null, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.CLOB)
    ), null)
    private constructor(alias: Name, aliased: Table<PgStatGetProgressInfoRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_progress_info</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_progress_info</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>pg_catalog.pg_stat_get_progress_info</code> table
     * reference
     */
    constructor(): this(DSL.name("pg_stat_get_progress_info"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PgCatalog.PG_CATALOG
    override fun `as`(alias: String): PgStatGetProgressInfo = PgStatGetProgressInfo(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): PgStatGetProgressInfo = PgStatGetProgressInfo(alias, this, parameters)
    override fun `as`(alias: Table<*>): PgStatGetProgressInfo = PgStatGetProgressInfo(alias.qualifiedName, this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): PgStatGetProgressInfo = PgStatGetProgressInfo(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PgStatGetProgressInfo = PgStatGetProgressInfo(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PgStatGetProgressInfo = PgStatGetProgressInfo(name.qualifiedName, null, parameters)

    /**
     * Call this table-valued function
     */
    fun call(
          cmdtype: String?
    ): PgStatGetProgressInfo = PgStatGetProgressInfo(DSL.name("pg_stat_get_progress_info"), null, arrayOf(
        DSL.value(cmdtype, SQLDataType.CLOB)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          cmdtype: Field<String?>
    ): PgStatGetProgressInfo = PgStatGetProgressInfo(DSL.name("pg_stat_get_progress_info"), null, arrayOf(
        cmdtype
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }
}
