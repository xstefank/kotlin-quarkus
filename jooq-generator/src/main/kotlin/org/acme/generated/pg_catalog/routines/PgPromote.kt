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
open class PgPromote : AbstractRoutine<Boolean>("pg_promote", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_promote.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.pg_promote.wait</code>.
         */
        val WAIT: Parameter<Boolean?> = Internal.createParameter("wait", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), true, false)

        /**
         * The parameter <code>pg_catalog.pg_promote.wait_seconds</code>.
         */
        val WAIT_SECONDS: Parameter<Int?> = Internal.createParameter("wait_seconds", SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("60"), SQLDataType.INTEGER)), true, false)
    }

    init {
        returnParameter = PgPromote.RETURN_VALUE
        addInParameter(PgPromote.WAIT)
        addInParameter(PgPromote.WAIT_SECONDS)
    }

    /**
     * Set the <code>wait</code> parameter IN value to the routine
     */
    fun setWait(value: Boolean?): Unit = setValue(PgPromote.WAIT, value)

    /**
     * Set the <code>wait</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setWait(field: Field<Boolean?>): Unit {
        setField(PgPromote.WAIT, field)
    }

    /**
     * Set the <code>wait_seconds</code> parameter IN value to the routine
     */
    fun setWaitSeconds(value: Int?): Unit = setValue(PgPromote.WAIT_SECONDS, value)

    /**
     * Set the <code>wait_seconds</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    fun setWaitSeconds(field: Field<Int?>): Unit {
        setField(PgPromote.WAIT_SECONDS, field)
    }
}
