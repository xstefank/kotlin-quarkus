/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbObject2 : AbstractRoutine<JSONB>("jsonb_object", PgCatalog.PG_CATALOG, SQLDataType.JSONB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.jsonb_object.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSONB?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_object._1</code>.
         */
        val _1: Parameter<Array<String?>?> = Internal.createParameter("_1", SQLDataType.CLOB.array(), false, true)

        /**
         * The parameter <code>pg_catalog.jsonb_object._2</code>.
         */
        val _2: Parameter<Array<String?>?> = Internal.createParameter("_2", SQLDataType.CLOB.array(), false, true)
    }

    init {
        returnParameter = JsonbObject2.RETURN_VALUE
        addInParameter(JsonbObject2._1)
        addInParameter(JsonbObject2._2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<String?>?): Unit = setValue(JsonbObject2._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<String?>?>): Unit {
        setField(JsonbObject2._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Array<String?>?): Unit = setValue(JsonbObject2._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Array<String?>?>): Unit {
        setField(JsonbObject2._2, field)
    }
}
