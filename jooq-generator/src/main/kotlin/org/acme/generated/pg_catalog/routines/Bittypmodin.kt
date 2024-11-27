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
open class Bittypmodin : AbstractRoutine<Int>("bittypmodin", PgCatalog.PG_CATALOG, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>pg_catalog.bittypmodin.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.bittypmodin._1</code>.
         */
        val _1: Parameter<Array<Any?>?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\"").array(), false, true)
    }

    init {
        returnParameter = Bittypmodin.RETURN_VALUE
        addInParameter(Bittypmodin._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Any?>?): Unit = setValue(Bittypmodin._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Any?>?>): Unit {
        setField(Bittypmodin._1, field)
    }
}
