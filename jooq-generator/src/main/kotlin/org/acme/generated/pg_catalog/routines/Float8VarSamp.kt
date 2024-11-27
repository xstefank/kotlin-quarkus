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
open class Float8VarSamp : AbstractRoutine<Double>("float8_var_samp", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE) {
    companion object {

        /**
         * The parameter <code>pg_catalog.float8_var_samp.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Double?> = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false)

        /**
         * The parameter <code>pg_catalog.float8_var_samp._1</code>.
         */
        val _1: Parameter<Array<Double?>?> = Internal.createParameter("_1", SQLDataType.FLOAT.array(), false, true)
    }

    init {
        returnParameter = Float8VarSamp.RETURN_VALUE
        addInParameter(Float8VarSamp._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Double?>?): Unit = setValue(Float8VarSamp._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Double?>?>): Unit {
        setField(Float8VarSamp._1, field)
    }
}
