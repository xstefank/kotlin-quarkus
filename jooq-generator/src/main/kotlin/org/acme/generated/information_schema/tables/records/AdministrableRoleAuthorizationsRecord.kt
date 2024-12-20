/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.AdministrableRoleAuthorizations
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AdministrableRoleAuthorizationsRecord() : TableRecordImpl<AdministrableRoleAuthorizationsRecord>(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS) {

    open var grantee: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var roleName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsGrantable")
    open var isGrantable: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    /**
     * Create a detached, initialised AdministrableRoleAuthorizationsRecord
     */
    constructor(grantee: String? = null, roleName: String? = null, isGrantable: String? = null): this() {
        this.grantee = grantee
        this.roleName = roleName
        this.isGrantable = isGrantable
        resetChangedOnNotNull()
    }
}
