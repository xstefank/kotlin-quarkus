/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.SqlImplementationInfo
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SqlImplementationInfoRecord() : TableRecordImpl<SqlImplementationInfoRecord>(SqlImplementationInfo.SQL_IMPLEMENTATION_INFO) {

    open var implementationInfoId: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var implementationInfoName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var integerValue: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var characterValue: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var comments: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    /**
     * Create a detached, initialised SqlImplementationInfoRecord
     */
    constructor(implementationInfoId: String? = null, implementationInfoName: String? = null, integerValue: Int? = null, characterValue: String? = null, comments: String? = null): this() {
        this.implementationInfoId = implementationInfoId
        this.implementationInfoName = implementationInfoName
        this.integerValue = integerValue
        this.characterValue = characterValue
        this.comments = comments
        resetChangedOnNotNull()
    }
}