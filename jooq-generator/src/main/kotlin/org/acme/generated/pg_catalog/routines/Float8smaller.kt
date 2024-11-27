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
open class Float8smaller : AbstractRoutine<Double>("float8smaller", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE) {
    companion object {

        /**
         * The parameter <code>pg_catalog.float8smaller.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Double?> = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false)

        /**
         * The parameter <code>pg_catalog.float8smaller._1</code>.
         */
        val _1: Parameter<Double?> = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true)

        /**
         * The parameter <code>pg_catalog.float8smaller._2</code>.
         */
        val _2: Parameter<Double?> = Internal.createParameter("_2", SQLDataType.DOUBLE, false, true)
    }

    init {
        returnParameter = Float8smaller.RETURN_VALUE
        addInParameter(Float8smaller._1)
        addInParameter(Float8smaller._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Double?): Unit = setValue(Float8smaller._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Double?>): Unit {
        setField(Float8smaller._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Double?): Unit = setValue(Float8smaller._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Double?>): Unit {
        setField(Float8smaller._2, field)
    }
}
