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
open class LoTruncate64 : AbstractRoutine<Int>("lo_truncate64", PgCatalog.PG_CATALOG, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>pg_catalog.lo_truncate64.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.lo_truncate64._1</code>.
         */
        val _1: Parameter<Int?> = Internal.createParameter("_1", SQLDataType.INTEGER, false, true)

        /**
         * The parameter <code>pg_catalog.lo_truncate64._2</code>.
         */
        val _2: Parameter<Long?> = Internal.createParameter("_2", SQLDataType.BIGINT, false, true)
    }

    init {
        returnParameter = LoTruncate64.RETURN_VALUE
        addInParameter(LoTruncate64._1)
        addInParameter(LoTruncate64._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Int?): Unit = setValue(LoTruncate64._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Int?>): Unit {
        setField(LoTruncate64._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Long?): Unit = setValue(LoTruncate64._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Long?>): Unit {
        setField(LoTruncate64._2, field)
    }
}
