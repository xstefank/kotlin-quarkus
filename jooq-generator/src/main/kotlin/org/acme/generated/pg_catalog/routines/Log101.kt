/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


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
open class Log101 : AbstractRoutine<Double>("log10", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE) {
    companion object {

        /**
         * The parameter <code>pg_catalog.log10.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Double?> = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false)

        /**
         * The parameter <code>pg_catalog.log10._1</code>.
         */
        val _1: Parameter<Double?> = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true)
    }

    init {
        returnParameter = Log101.RETURN_VALUE
        addInParameter(Log101._1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Double?): Unit = setValue(Log101._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Double?>): Unit {
        setField(Log101._1, field)
    }
}
