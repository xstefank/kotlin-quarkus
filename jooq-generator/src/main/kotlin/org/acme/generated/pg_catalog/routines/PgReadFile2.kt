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
open class PgReadFile2 : AbstractRoutine<String>("pg_read_file", PgCatalog.PG_CATALOG, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_read_file.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>pg_catalog.pg_read_file._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CLOB, false, true)

        /**
         * The parameter <code>pg_catalog.pg_read_file._2</code>.
         */
        val _2: Parameter<Long?> = Internal.createParameter("_2", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.pg_read_file._3</code>.
         */
        val _3: Parameter<Long?> = Internal.createParameter("_3", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.pg_read_file._4</code>.
         */
        val _4: Parameter<Boolean?> = Internal.createParameter("_4", SQLDataType.BOOLEAN, false, true)
    }

    init {
        returnParameter = PgReadFile2.RETURN_VALUE
        addInParameter(PgReadFile2._1)
        addInParameter(PgReadFile2._2)
        addInParameter(PgReadFile2._3)
        addInParameter(PgReadFile2._4)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(PgReadFile2._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(PgReadFile2._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Long?): Unit = setValue(PgReadFile2._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Long?>): Unit {
        setField(PgReadFile2._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Long?): Unit = setValue(PgReadFile2._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Long?>): Unit {
        setField(PgReadFile2._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: Boolean?): Unit = setValue(PgReadFile2._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<Boolean?>): Unit {
        setField(PgReadFile2._4, field)
    }
}