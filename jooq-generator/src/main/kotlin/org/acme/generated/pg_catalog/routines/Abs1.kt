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
open class Abs1 : AbstractRoutine<Float>("abs", PgCatalog.PG_CATALOG, SQLDataType.REAL) {
    companion object {

        /**
         * The parameter <code>pg_catalog.abs.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Float?> = Internal.createParameter("RETURN_VALUE", SQLDataType.REAL, false, false)

        /**
         * The parameter <code>pg_catalog.abs._1</code>.
         */
        val _1: Parameter<Float?> = Internal.createParameter("_1", SQLDataType.REAL, false, true)
    }

    init {
        returnParameter = Abs1.RETURN_VALUE
        addInParameter(Abs1._1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Float?): Unit = setValue(Abs1._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Float?>): Unit {
        setField(Abs1._1, field)
    }
}
