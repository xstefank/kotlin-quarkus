/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgGetObjectAddress : AbstractRoutine<java.lang.Void>("pg_get_object_address", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.type</code>.
         */
        val TYPE: Parameter<String?> = Internal.createParameter("type", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_get_object_address.object_names</code>.
         */
        val OBJECT_NAMES: Parameter<Array<String?>?> = Internal.createParameter("object_names", SQLDataType.CLOB.array(), false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_get_object_address.object_args</code>.
         */
        val OBJECT_ARGS: Parameter<Array<String?>?> = Internal.createParameter("object_args", SQLDataType.CLOB.array(), false, false)

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.classid</code>.
         */
        val CLASSID: Parameter<Long?> = Internal.createParameter("classid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.objid</code>.
         */
        val OBJID: Parameter<Long?> = Internal.createParameter("objid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.pg_get_object_address.objsubid</code>.
         */
        val OBJSUBID: Parameter<Int?> = Internal.createParameter("objsubid", SQLDataType.INTEGER, false, false)
    }

    init {
        addInParameter(PgGetObjectAddress.TYPE)
        addInParameter(PgGetObjectAddress.OBJECT_NAMES)
        addInParameter(PgGetObjectAddress.OBJECT_ARGS)
        addOutParameter(PgGetObjectAddress.CLASSID)
        addOutParameter(PgGetObjectAddress.OBJID)
        addOutParameter(PgGetObjectAddress.OBJSUBID)
    }

    /**
     * Set the <code>type</code> parameter IN value to the routine
     */
    fun setType(value: String?): Unit = setValue(PgGetObjectAddress.TYPE, value)

    /**
     * Set the <code>object_names</code> parameter IN value to the routine
     */
    fun setObjectNames(value: Array<String?>?): Unit = setValue(PgGetObjectAddress.OBJECT_NAMES, value)

    /**
     * Set the <code>object_args</code> parameter IN value to the routine
     */
    fun setObjectArgs(value: Array<String?>?): Unit = setValue(PgGetObjectAddress.OBJECT_ARGS, value)

    /**
     * Get the <code>classid</code> parameter OUT value from the routine
     */
    fun getClassid(): Long? = get(PgGetObjectAddress.CLASSID)

    /**
     * Get the <code>objid</code> parameter OUT value from the routine
     */
    fun getObjid(): Long? = get(PgGetObjectAddress.OBJID)

    /**
     * Get the <code>objsubid</code> parameter OUT value from the routine
     */
    fun getObjsubid(): Int? = get(PgGetObjectAddress.OBJSUBID)
}
