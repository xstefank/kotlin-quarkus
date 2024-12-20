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
open class Factorial : AbstractRoutine<BigDecimal>("factorial", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC) {
    companion object {

        /**
         * The parameter <code>pg_catalog.factorial.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<BigDecimal?> = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false)

        /**
         * The parameter <code>pg_catalog.factorial._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)
    }

    init {
        returnParameter = Factorial.RETURN_VALUE
        addInParameter(Factorial._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(Factorial._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Long?>): Unit {
        setField(Factorial._1, field)
    }
}
