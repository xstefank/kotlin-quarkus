/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgWalfileNameOffset : AbstractRoutine<java.lang.Void>("pg_walfile_name_offset", PgCatalog.PG_CATALOG) {
    companion object {
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val LSN: Parameter<Any?> = Internal.createParameter("lsn", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_walfile_name_offset.file_name</code>.
         */
        val FILE_NAME: Parameter<String?> = Internal.createParameter("file_name", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_walfile_name_offset.file_offset</code>.
         */
        val FILE_OFFSET: Parameter<Int?> = Internal.createParameter("file_offset", SQLDataType.INTEGER, false, false)
    }

    init {
        addInParameter(PgWalfileNameOffset.LSN)
        addOutParameter(PgWalfileNameOffset.FILE_NAME)
        addOutParameter(PgWalfileNameOffset.FILE_OFFSET)
    }

    /**
     * Set the <code>lsn</code> parameter IN value to the routine
     */
    fun setLsn(value: Any?): Unit = setValue(PgWalfileNameOffset.LSN, value)

    /**
     * Get the <code>file_name</code> parameter OUT value from the routine
     */
    fun getFileName(): String? = get(PgWalfileNameOffset.FILE_NAME)

    /**
     * Get the <code>file_offset</code> parameter OUT value from the routine
     */
    fun getFileOffset(): Int? = get(PgWalfileNameOffset.FILE_OFFSET)
}
