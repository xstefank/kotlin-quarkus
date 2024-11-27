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
open class Int2xor : AbstractRoutine<Short>("int2xor", PgCatalog.PG_CATALOG, SQLDataType.SMALLINT) {
    companion object {

        /**
         * The parameter <code>pg_catalog.int2xor.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Short?> = Internal.createParameter("RETURN_VALUE", SQLDataType.SMALLINT, false, false)

        /**
         * The parameter <code>pg_catalog.int2xor._1</code>.
         */
        val _1: Parameter<Short?> = Internal.createParameter("_1", SQLDataType.SMALLINT, false, true)

        /**
         * The parameter <code>pg_catalog.int2xor._2</code>.
         */
        val _2: Parameter<Short?> = Internal.createParameter("_2", SQLDataType.SMALLINT, false, true)
    }

    init {
        returnParameter = Int2xor.RETURN_VALUE
        addInParameter(Int2xor._1)
        addInParameter(Int2xor._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Short?): Unit = setValue(Int2xor._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Short?>): Unit {
        setField(Int2xor._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Short?): Unit = setValue(Int2xor._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Short?>): Unit {
        setField(Int2xor._2, field)
    }
}
