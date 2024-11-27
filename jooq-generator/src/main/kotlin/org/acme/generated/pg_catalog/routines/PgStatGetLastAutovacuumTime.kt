/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatGetLastAutovacuumTime : AbstractRoutine<OffsetDateTime>("pg_stat_get_last_autovacuum_time", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6)) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_stat_get_last_autovacuum_time.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_stat_get_last_autovacuum_time._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)
    }

    init {
        returnParameter = PgStatGetLastAutovacuumTime.RETURN_VALUE
        addInParameter(PgStatGetLastAutovacuumTime._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(PgStatGetLastAutovacuumTime._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Long?>): Unit {
        setField(PgStatGetLastAutovacuumTime._1, field)
    }
}
