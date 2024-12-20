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
open class HasColumnPrivilege2 : AbstractRoutine<Boolean>("has_column_privilege", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.has_column_privilege.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.has_column_privilege._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.VARCHAR, false, true)

        /**
         * The parameter <code>pg_catalog.has_column_privilege._2</code>.
         */
        val _2: Parameter<String?> = Internal.createParameter("_2", SQLDataType.CLOB, false, true)

        /**
         * The parameter <code>pg_catalog.has_column_privilege._3</code>.
         */
        val _3: Parameter<Short?> = Internal.createParameter("_3", SQLDataType.SMALLINT, false, true)

        /**
         * The parameter <code>pg_catalog.has_column_privilege._4</code>.
         */
        val _4: Parameter<String?> = Internal.createParameter("_4", SQLDataType.CLOB, false, true)
    }

    init {
        returnParameter = HasColumnPrivilege2.RETURN_VALUE
        addInParameter(HasColumnPrivilege2._1)
        addInParameter(HasColumnPrivilege2._2)
        addInParameter(HasColumnPrivilege2._3)
        addInParameter(HasColumnPrivilege2._4)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(HasColumnPrivilege2._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(HasColumnPrivilege2._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: String?): Unit = setValue(HasColumnPrivilege2._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<String?>): Unit {
        setField(HasColumnPrivilege2._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Short?): Unit = setValue(HasColumnPrivilege2._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Short?>): Unit {
        setField(HasColumnPrivilege2._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: String?): Unit = setValue(HasColumnPrivilege2._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<String?>): Unit {
        setField(HasColumnPrivilege2._4, field)
    }
}
