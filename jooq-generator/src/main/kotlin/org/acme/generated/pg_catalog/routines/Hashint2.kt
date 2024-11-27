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
open class Hashint2 : AbstractRoutine<Int>("hashint2", PgCatalog.PG_CATALOG, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>pg_catalog.hashint2.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.hashint2._1</code>.
         */
        val _1: Parameter<Short?> = Internal.createParameter("_1", SQLDataType.SMALLINT, false, true)
    }

    init {
        returnParameter = Hashint2.RETURN_VALUE
        addInParameter(Hashint2._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Short?): Unit = setValue(Hashint2._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Short?>): Unit {
        setField(Hashint2._1, field)
    }
}
