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
open class Int2AvgAccumInv : AbstractRoutine<Array<Long?>>("int2_avg_accum_inv", PgCatalog.PG_CATALOG, SQLDataType.BIGINT.array()) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.int2_avg_accum_inv.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Array<Long?>?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT.array(), false, false)

        /**
         * The parameter <code>pg_catalog.int2_avg_accum_inv._1</code>.
         */
        val _1: Parameter<Array<Long?>?> = Internal.createParameter("_1", SQLDataType.BIGINT.array(), false, true)

        /**
         * The parameter <code>pg_catalog.int2_avg_accum_inv._2</code>.
         */
        val _2: Parameter<Short?> = Internal.createParameter("_2", SQLDataType.SMALLINT, false, true)
    }

    init {
        returnParameter = Int2AvgAccumInv.RETURN_VALUE
        addInParameter(Int2AvgAccumInv._1)
        addInParameter(Int2AvgAccumInv._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Long?>?): Unit = setValue(Int2AvgAccumInv._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Long?>?>): Unit {
        setField(Int2AvgAccumInv._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Short?): Unit = setValue(Int2AvgAccumInv._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Short?>): Unit {
        setField(Int2AvgAccumInv._2, field)
    }
}