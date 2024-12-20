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
open class Boolle : AbstractRoutine<Boolean>("boolle", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.boolle.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.boolle._1</code>.
         */
        val _1: Parameter<Boolean?> = Internal.createParameter("_1", SQLDataType.BOOLEAN, false, true)

        /**
         * The parameter <code>pg_catalog.boolle._2</code>.
         */
        val _2: Parameter<Boolean?> = Internal.createParameter("_2", SQLDataType.BOOLEAN, false, true)
    }

    init {
        returnParameter = Boolle.RETURN_VALUE
        addInParameter(Boolle._1)
        addInParameter(Boolle._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Boolean?): Unit = setValue(Boolle._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Boolean?>): Unit {
        setField(Boolle._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Boolean?): Unit = setValue(Boolle._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Boolean?>): Unit {
        setField(Boolle._2, field)
    }
}
