/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.Record
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RecordImageEq : AbstractRoutine<Boolean>("record_image_eq", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.record_image_eq.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.record_image_eq._1</code>.
         */
        val _1: Parameter<Record?> = Internal.createParameter("_1", SQLDataType.RECORD, false, true)

        /**
         * The parameter <code>pg_catalog.record_image_eq._2</code>.
         */
        val _2: Parameter<Record?> = Internal.createParameter("_2", SQLDataType.RECORD, false, true)
    }

    init {
        returnParameter = RecordImageEq.RETURN_VALUE
        addInParameter(RecordImageEq._1)
        addInParameter(RecordImageEq._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Record?): Unit = setValue(RecordImageEq._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Record?>): Unit {
        setField(RecordImageEq._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Record?): Unit = setValue(RecordImageEq._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Record?>): Unit {
        setField(RecordImageEq._2, field)
    }
}
