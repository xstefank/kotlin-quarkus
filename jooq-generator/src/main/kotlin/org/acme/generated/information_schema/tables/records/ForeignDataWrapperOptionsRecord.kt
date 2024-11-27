/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.ForeignDataWrapperOptions
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ForeignDataWrapperOptionsRecord() : TableRecordImpl<ForeignDataWrapperOptionsRecord>(ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS) {

    open var foreignDataWrapperCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var foreignDataWrapperName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var optionName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var optionValue: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    /**
     * Create a detached, initialised ForeignDataWrapperOptionsRecord
     */
    constructor(foreignDataWrapperCatalog: String? = null, foreignDataWrapperName: String? = null, optionName: String? = null, optionValue: String? = null): this() {
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog
        this.foreignDataWrapperName = foreignDataWrapperName
        this.optionName = optionName
        this.optionValue = optionValue
        resetChangedOnNotNull()
    }
}
