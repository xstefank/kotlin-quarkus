/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.CharacterSets
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CharacterSetsRecord() : TableRecordImpl<CharacterSetsRecord>(CharacterSets.CHARACTER_SETS) {

    open var characterSetCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var characterSetSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var characterSetName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var characterRepertoire: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var formOfUse: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var defaultCollateCatalog: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var defaultCollateSchema: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var defaultCollateName: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    /**
     * Create a detached, initialised CharacterSetsRecord
     */
    constructor(characterSetCatalog: String? = null, characterSetSchema: String? = null, characterSetName: String? = null, characterRepertoire: String? = null, formOfUse: String? = null, defaultCollateCatalog: String? = null, defaultCollateSchema: String? = null, defaultCollateName: String? = null): this() {
        this.characterSetCatalog = characterSetCatalog
        this.characterSetSchema = characterSetSchema
        this.characterSetName = characterSetName
        this.characterRepertoire = characterRepertoire
        this.formOfUse = formOfUse
        this.defaultCollateCatalog = defaultCollateCatalog
        this.defaultCollateSchema = defaultCollateSchema
        this.defaultCollateName = defaultCollateName
        resetChangedOnNotNull()
    }
}
