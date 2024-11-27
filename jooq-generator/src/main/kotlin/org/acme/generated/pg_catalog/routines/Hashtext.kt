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
open class Hashtext : AbstractRoutine<Int>("hashtext", PgCatalog.PG_CATALOG, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>pg_catalog.hashtext.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.hashtext._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CLOB, false, true)
    }

    init {
        returnParameter = Hashtext.RETURN_VALUE
        addInParameter(Hashtext._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(Hashtext._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(Hashtext._1, field)
    }
}
