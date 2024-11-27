/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.XML
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SchemaToXmlschema : AbstractRoutine<XML>("schema_to_xmlschema", PgCatalog.PG_CATALOG, SQLDataType.XML) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.schema_to_xmlschema.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<XML?> = Internal.createParameter("RETURN_VALUE", SQLDataType.XML, false, false)

        /**
         * The parameter <code>pg_catalog.schema_to_xmlschema.schema</code>.
         */
        val SCHEMA: Parameter<String?> = Internal.createParameter("schema", SQLDataType.VARCHAR, false, false)

        /**
         * The parameter <code>pg_catalog.schema_to_xmlschema.nulls</code>.
         */
        val NULLS: Parameter<Boolean?> = Internal.createParameter("nulls", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter
         * <code>pg_catalog.schema_to_xmlschema.tableforest</code>.
         */
        val TABLEFOREST: Parameter<Boolean?> = Internal.createParameter("tableforest", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.schema_to_xmlschema.targetns</code>.
         */
        val TARGETNS: Parameter<String?> = Internal.createParameter("targetns", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = SchemaToXmlschema.RETURN_VALUE
        addInParameter(SchemaToXmlschema.SCHEMA)
        addInParameter(SchemaToXmlschema.NULLS)
        addInParameter(SchemaToXmlschema.TABLEFOREST)
        addInParameter(SchemaToXmlschema.TARGETNS)
    }

    /**
     * Set the <code>schema</code> parameter IN value to the routine
     */
    fun setSchema_(value: String?): Unit = setValue(SchemaToXmlschema.SCHEMA, value)

    /**
     * Set the <code>schema</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setSchema_(field: Field<String?>): Unit {
        setField(SchemaToXmlschema.SCHEMA, field)
    }

    /**
     * Set the <code>nulls</code> parameter IN value to the routine
     */
    fun setNulls(value: Boolean?): Unit = setValue(SchemaToXmlschema.NULLS, value)

    /**
     * Set the <code>nulls</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setNulls(field: Field<Boolean?>): Unit {
        setField(SchemaToXmlschema.NULLS, field)
    }

    /**
     * Set the <code>tableforest</code> parameter IN value to the routine
     */
    fun setTableforest(value: Boolean?): Unit = setValue(SchemaToXmlschema.TABLEFOREST, value)

    /**
     * Set the <code>tableforest</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    fun setTableforest(field: Field<Boolean?>): Unit {
        setField(SchemaToXmlschema.TABLEFOREST, field)
    }

    /**
     * Set the <code>targetns</code> parameter IN value to the routine
     */
    fun setTargetns(value: String?): Unit = setValue(SchemaToXmlschema.TARGETNS, value)

    /**
     * Set the <code>targetns</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setTargetns(field: Field<String?>): Unit {
        setField(SchemaToXmlschema.TARGETNS, field)
    }
}