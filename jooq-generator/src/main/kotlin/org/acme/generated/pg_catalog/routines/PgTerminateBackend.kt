/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgTerminateBackend : AbstractRoutine<Boolean>("pg_terminate_backend", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_terminate_backend.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.pg_terminate_backend.pid</code>.
         */
        val PID: Parameter<Int?> = Internal.createParameter("pid", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.pg_terminate_backend.timeout</code>.
         */
        val TIMEOUT: Parameter<Long?> = Internal.createParameter("timeout", SQLDataType.BIGINT.defaultValue(DSL.field(DSL.raw("0"), SQLDataType.BIGINT)), true, false)
    }

    init {
        returnParameter = PgTerminateBackend.RETURN_VALUE
        addInParameter(PgTerminateBackend.PID)
        addInParameter(PgTerminateBackend.TIMEOUT)
    }

    /**
     * Set the <code>pid</code> parameter IN value to the routine
     */
    fun setPid(value: Int?): Unit = setValue(PgTerminateBackend.PID, value)

    /**
     * Set the <code>pid</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setPid(field: Field<Int?>): Unit {
        setField(PgTerminateBackend.PID, field)
    }

    /**
     * Set the <code>timeout</code> parameter IN value to the routine
     */
    fun setTimeout(value: Long?): Unit = setValue(PgTerminateBackend.TIMEOUT, value)

    /**
     * Set the <code>timeout</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setTimeout(field: Field<Long?>): Unit {
        setField(PgTerminateBackend.TIMEOUT, field)
    }
}
