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
open class PercentileCont2 : AbstractRoutine<YearToSecond>("percentile_cont", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL) {
    companion object {

        /**
         * The parameter <code>pg_catalog.percentile_cont.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<YearToSecond?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false)

        /**
         * The parameter <code>pg_catalog.percentile_cont._1</code>.
         */
        val _1: Parameter<Double?> = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true)

        /**
         * The parameter <code>pg_catalog.percentile_cont._2</code>.
         */
        val _2: Parameter<YearToSecond?> = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true)
    }

    init {
        returnParameter = PercentileCont2.RETURN_VALUE
        addInParameter(PercentileCont2._1)
        addInParameter(PercentileCont2._2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Double?): Unit = setValue(PercentileCont2._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Double?>): Unit {
        setField(PercentileCont2._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: YearToSecond?): Unit = setValue(PercentileCont2._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<YearToSecond?>): Unit {
        setField(PercentileCont2._2, field)
    }
}
