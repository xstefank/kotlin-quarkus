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
open class InRange14 : AbstractRoutine<Boolean>("in_range", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.in_range.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.in_range._1</code>.
         */
        val _1: Parameter<Double?> = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true)

        /**
         * The parameter <code>pg_catalog.in_range._2</code>.
         */
        val _2: Parameter<Double?> = Internal.createParameter("_2", SQLDataType.DOUBLE, false, true)

        /**
         * The parameter <code>pg_catalog.in_range._3</code>.
         */
        val _3: Parameter<Double?> = Internal.createParameter("_3", SQLDataType.DOUBLE, false, true)

        /**
         * The parameter <code>pg_catalog.in_range._4</code>.
         */
        val _4: Parameter<Boolean?> = Internal.createParameter("_4", SQLDataType.BOOLEAN, false, true)

        /**
         * The parameter <code>pg_catalog.in_range._5</code>.
         */
        val _5: Parameter<Boolean?> = Internal.createParameter("_5", SQLDataType.BOOLEAN, false, true)
    }

    init {
        returnParameter = InRange14.RETURN_VALUE
        addInParameter(InRange14._1)
        addInParameter(InRange14._2)
        addInParameter(InRange14._3)
        addInParameter(InRange14._4)
        addInParameter(InRange14._5)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Double?): Unit = setValue(InRange14._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Double?>): Unit {
        setField(InRange14._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Double?): Unit = setValue(InRange14._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Double?>): Unit {
        setField(InRange14._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Double?): Unit = setValue(InRange14._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Double?>): Unit {
        setField(InRange14._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: Boolean?): Unit = setValue(InRange14._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<Boolean?>): Unit {
        setField(InRange14._4, field)
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    fun set__5(value: Boolean?): Unit = setValue(InRange14._5, value)

    /**
     * Set the <code>_5</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__5(field: Field<Boolean?>): Unit {
        setField(InRange14._5, field)
    }
}
