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
open class Xideqint4 : AbstractRoutine<Boolean>("xideqint4", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.xideqint4.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.xideqint4._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.xideqint4._2</code>.
         */
        val _2: Parameter<Int?> = Internal.createParameter("_2", SQLDataType.INTEGER, false, true)
    }

    init {
        returnParameter = Xideqint4.RETURN_VALUE
        addInParameter(Xideqint4._1)
        addInParameter(Xideqint4._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(Xideqint4._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Long?>): Unit {
        setField(Xideqint4._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Int?): Unit = setValue(Xideqint4._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Int?>): Unit {
        setField(Xideqint4._2, field)
    }
}
