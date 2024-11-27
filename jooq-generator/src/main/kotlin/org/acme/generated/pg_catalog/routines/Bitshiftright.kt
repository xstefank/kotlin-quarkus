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
open class Bitshiftright : AbstractRoutine<String>("bitshiftright", PgCatalog.PG_CATALOG, SQLDataType.CHAR) {
    companion object {

        /**
         * The parameter <code>pg_catalog.bitshiftright.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CHAR, false, false)

        /**
         * The parameter <code>pg_catalog.bitshiftright._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CHAR, false, true)

        /**
         * The parameter <code>pg_catalog.bitshiftright._2</code>.
         */
        val _2: Parameter<Int?> = Internal.createParameter("_2", SQLDataType.INTEGER, false, true)
    }

    init {
        returnParameter = Bitshiftright.RETURN_VALUE
        addInParameter(Bitshiftright._1)
        addInParameter(Bitshiftright._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(Bitshiftright._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(Bitshiftright._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Int?): Unit = setValue(Bitshiftright._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Int?>): Unit {
        setField(Bitshiftright._2, field)
    }
}
