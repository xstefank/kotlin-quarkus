/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


@Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
@Suppress("UNCHECKED_CAST")
open class PgStartBackup : AbstractRoutine<Any>("pg_start_backup", PgCatalog.PG_CATALOG, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")) {
    companion object {
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val RETURN_VALUE: Parameter<Any?> = Internal.createParameter("RETURN_VALUE", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false)

        /**
         * The parameter <code>pg_catalog.pg_start_backup.label</code>.
         */
        val LABEL: Parameter<String?> = Internal.createParameter("label", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>pg_catalog.pg_start_backup.fast</code>.
         */
        val FAST: Parameter<Boolean?> = Internal.createParameter("fast", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), true, false)

        /**
         * The parameter <code>pg_catalog.pg_start_backup.exclusive</code>.
         */
        val EXCLUSIVE: Parameter<Boolean?> = Internal.createParameter("exclusive", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), true, false)
    }

    init {
        returnParameter = PgStartBackup.RETURN_VALUE
        addInParameter(PgStartBackup.LABEL)
        addInParameter(PgStartBackup.FAST)
        addInParameter(PgStartBackup.EXCLUSIVE)
    }

    /**
     * Set the <code>label</code> parameter IN value to the routine
     */
    fun setLabel(value: String?): Unit = setValue(PgStartBackup.LABEL, value)

    /**
     * Set the <code>label</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setLabel(field: Field<String?>): Unit {
        setField(PgStartBackup.LABEL, field)
    }

    /**
     * Set the <code>fast</code> parameter IN value to the routine
     */
    fun setFast(value: Boolean?): Unit = setValue(PgStartBackup.FAST, value)

    /**
     * Set the <code>fast</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setFast(field: Field<Boolean?>): Unit {
        setField(PgStartBackup.FAST, field)
    }

    /**
     * Set the <code>exclusive</code> parameter IN value to the routine
     */
    fun setExclusive(value: Boolean?): Unit = setValue(PgStartBackup.EXCLUSIVE, value)

    /**
     * Set the <code>exclusive</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setExclusive(field: Field<Boolean?>): Unit {
        setField(PgStartBackup.EXCLUSIVE, field)
    }
}
