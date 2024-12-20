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
open class Max1 : AbstractRoutine<Array<Any?>>("max", PgCatalog.PG_CATALOG, SQLDataType.OTHER.array()) {
    companion object {

        /**
         * The parameter <code>pg_catalog.max.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Array<Any?>?> = Internal.createParameter("RETURN_VALUE", SQLDataType.OTHER.array(), false, false)

        /**
         * The parameter <code>pg_catalog.max._1</code>.
         */
        val _1: Parameter<Array<Any?>?> = Internal.createParameter("_1", SQLDataType.OTHER.array(), false, true)
    }

    init {
        returnParameter = Max1.RETURN_VALUE
        addInParameter(Max1._1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Any?>?): Unit = setValue(Max1._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Any?>?>): Unit {
        setField(Max1._1, field)
    }
}
