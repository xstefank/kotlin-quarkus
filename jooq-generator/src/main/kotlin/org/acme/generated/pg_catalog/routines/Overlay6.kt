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
open class Overlay6 : AbstractRoutine<ByteArray>("overlay", PgCatalog.PG_CATALOG, SQLDataType.BLOB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.overlay.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<ByteArray?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BLOB, false, false)

        /**
         * The parameter <code>pg_catalog.overlay._1</code>.
         */
        val _1: Parameter<ByteArray?> = Internal.createParameter("_1", SQLDataType.BLOB, false, true)

        /**
         * The parameter <code>pg_catalog.overlay._2</code>.
         */
        val _2: Parameter<ByteArray?> = Internal.createParameter("_2", SQLDataType.BLOB, false, true)

        /**
         * The parameter <code>pg_catalog.overlay._3</code>.
         */
        val _3: Parameter<Int?> = Internal.createParameter("_3", SQLDataType.INTEGER, false, true)
    }

    init {
        returnParameter = Overlay6.RETURN_VALUE
        addInParameter(Overlay6._1)
        addInParameter(Overlay6._2)
        addInParameter(Overlay6._3)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: ByteArray?): Unit = setValue(Overlay6._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<ByteArray?>): Unit {
        setField(Overlay6._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: ByteArray?): Unit = setValue(Overlay6._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<ByteArray?>): Unit {
        setField(Overlay6._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Int?): Unit = setValue(Overlay6._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Int?>): Unit {
        setField(Overlay6._3, field)
    }
}
