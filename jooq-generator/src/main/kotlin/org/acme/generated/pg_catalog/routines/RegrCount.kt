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
open class RegrCount : AbstractRoutine<Long>("regr_count", PgCatalog.PG_CATALOG, SQLDataType.BIGINT) {
    companion object {

        /**
         * The parameter <code>pg_catalog.regr_count.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Long?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.regr_count._1</code>.
         */
        val _1: Parameter<Double?> = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true)

        /**
         * The parameter <code>pg_catalog.regr_count._2</code>.
         */
        val _2: Parameter<Double?> = Internal.createParameter("_2", SQLDataType.DOUBLE, false, true)
    }

    init {
        returnParameter = RegrCount.RETURN_VALUE
        addInParameter(RegrCount._1)
        addInParameter(RegrCount._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Double?): Unit = setValue(RegrCount._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Double?>): Unit {
        setField(RegrCount._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Double?): Unit = setValue(RegrCount._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Double?>): Unit {
        setField(RegrCount._2, field)
    }
}