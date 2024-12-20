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
open class RecordNe : AbstractRoutine<Boolean>("record_ne", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.record_ne.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.record_ne._1</code>.
         */
        val _1: Parameter<Record?> = Internal.createParameter("_1", SQLDataType.RECORD, false, true)

        /**
         * The parameter <code>pg_catalog.record_ne._2</code>.
         */
        val _2: Parameter<Record?> = Internal.createParameter("_2", SQLDataType.RECORD, false, true)
    }

    init {
        returnParameter = RecordNe.RETURN_VALUE
        addInParameter(RecordNe._1)
        addInParameter(RecordNe._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Record?): Unit = setValue(RecordNe._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Record?>): Unit {
        setField(RecordNe._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Record?): Unit = setValue(RecordNe._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Record?>): Unit {
        setField(RecordNe._2, field)
    }
}
