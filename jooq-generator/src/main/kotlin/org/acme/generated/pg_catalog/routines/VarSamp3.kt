/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.math.BigDecimal

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
open class VarSamp3 : AbstractRoutine<BigDecimal>("var_samp", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC) {
    companion object {

        /**
         * The parameter <code>pg_catalog.var_samp.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<BigDecimal?> = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false)

        /**
         * The parameter <code>pg_catalog.var_samp._1</code>.
         */
        val _1: Parameter<Short?> = Internal.createParameter("_1", SQLDataType.SMALLINT, false, true)
    }

    init {
        returnParameter = VarSamp3.RETURN_VALUE
        addInParameter(VarSamp3._1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Short?): Unit = setValue(VarSamp3._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Short?>): Unit {
        setField(VarSamp3._1, field)
    }
}