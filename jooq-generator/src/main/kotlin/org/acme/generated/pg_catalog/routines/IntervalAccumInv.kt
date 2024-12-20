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
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class IntervalAccumInv : AbstractRoutine<Array<YearToSecond?>>("interval_accum_inv", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL.array()) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.interval_accum_inv.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Array<YearToSecond?>?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL.array(), false, false)

        /**
         * The parameter <code>pg_catalog.interval_accum_inv._1</code>.
         */
        val _1: Parameter<Array<YearToSecond?>?> = Internal.createParameter("_1", SQLDataType.INTERVAL.array(), false, true)

        /**
         * The parameter <code>pg_catalog.interval_accum_inv._2</code>.
         */
        val _2: Parameter<YearToSecond?> = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true)
    }

    init {
        returnParameter = IntervalAccumInv.RETURN_VALUE
        addInParameter(IntervalAccumInv._1)
        addInParameter(IntervalAccumInv._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<YearToSecond?>?): Unit = setValue(IntervalAccumInv._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<YearToSecond?>?>): Unit {
        setField(IntervalAccumInv._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: YearToSecond?): Unit = setValue(IntervalAccumInv._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<YearToSecond?>): Unit {
        setField(IntervalAccumInv._2, field)
    }
}
