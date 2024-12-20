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
open class SatisfiesHashPartition : AbstractRoutine<Boolean>("satisfies_hash_partition", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.satisfies_hash_partition.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.satisfies_hash_partition._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.satisfies_hash_partition._2</code>.
         */
        val _2: Parameter<Int?> = Internal.createParameter("_2", SQLDataType.INTEGER, false, true)

        /**
         * The parameter <code>pg_catalog.satisfies_hash_partition._3</code>.
         */
        val _3: Parameter<Int?> = Internal.createParameter("_3", SQLDataType.INTEGER, false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _4: Parameter<Any?> = Internal.createParameter("_4", SQLDataType.OTHER, false, true)
    }

    init {
        returnParameter = SatisfiesHashPartition.RETURN_VALUE
        addInParameter(SatisfiesHashPartition._1)
        addInParameter(SatisfiesHashPartition._2)
        addInParameter(SatisfiesHashPartition._3)
        addInParameter(SatisfiesHashPartition._4)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(SatisfiesHashPartition._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Long?>): Unit {
        setField(SatisfiesHashPartition._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Int?): Unit = setValue(SatisfiesHashPartition._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Int?>): Unit {
        setField(SatisfiesHashPartition._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Int?): Unit = setValue(SatisfiesHashPartition._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Int?>): Unit {
        setField(SatisfiesHashPartition._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: Any?): Unit = setValue(SatisfiesHashPartition._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<Any?>): Unit {
        setField(SatisfiesHashPartition._4, field)
    }
}
