/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Oidvectoreq : AbstractRoutine<Boolean>("oidvectoreq", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.oidvectoreq.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.oidvectoreq._1</code>.
         */
        val _1: Parameter<Array<Any?>?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").array(), false, true)

        /**
         * The parameter <code>pg_catalog.oidvectoreq._2</code>.
         */
        val _2: Parameter<Array<Any?>?> = Internal.createParameter("_2", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").array(), false, true)
    }

    init {
        returnParameter = Oidvectoreq.RETURN_VALUE
        addInParameter(Oidvectoreq._1)
        addInParameter(Oidvectoreq._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Any?>?): Unit = setValue(Oidvectoreq._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Any?>?>): Unit {
        setField(Oidvectoreq._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Array<Any?>?): Unit = setValue(Oidvectoreq._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Array<Any?>?>): Unit {
        setField(Oidvectoreq._2, field)
    }
}
