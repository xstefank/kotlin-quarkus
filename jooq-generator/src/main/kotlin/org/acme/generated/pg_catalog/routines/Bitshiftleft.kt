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
open class Bitshiftleft : AbstractRoutine<String>("bitshiftleft", PgCatalog.PG_CATALOG, SQLDataType.CHAR) {
    companion object {

        /**
         * The parameter <code>pg_catalog.bitshiftleft.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CHAR, false, false)

        /**
         * The parameter <code>pg_catalog.bitshiftleft._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CHAR, false, true)

        /**
         * The parameter <code>pg_catalog.bitshiftleft._2</code>.
         */
        val _2: Parameter<Int?> = Internal.createParameter("_2", SQLDataType.INTEGER, false, true)
    }

    init {
        returnParameter = Bitshiftleft.RETURN_VALUE
        addInParameter(Bitshiftleft._1)
        addInParameter(Bitshiftleft._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(Bitshiftleft._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(Bitshiftleft._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Int?): Unit = setValue(Bitshiftleft._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Int?>): Unit {
        setField(Bitshiftleft._2, field)
    }
}