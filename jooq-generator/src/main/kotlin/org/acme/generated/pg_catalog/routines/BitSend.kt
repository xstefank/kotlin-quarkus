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
open class BitSend : AbstractRoutine<ByteArray>("bit_send", PgCatalog.PG_CATALOG, SQLDataType.BLOB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.bit_send.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<ByteArray?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BLOB, false, false)

        /**
         * The parameter <code>pg_catalog.bit_send._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CHAR, false, true)
    }

    init {
        returnParameter = BitSend.RETURN_VALUE
        addInParameter(BitSend._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(BitSend._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(BitSend._1, field)
    }
}
