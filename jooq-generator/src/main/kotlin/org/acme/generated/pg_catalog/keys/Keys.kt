/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.keys


import org.acme.generated.pg_catalog.tables.PgAggregate
import org.acme.generated.pg_catalog.tables.PgAm
import org.acme.generated.pg_catalog.tables.PgAmop
import org.acme.generated.pg_catalog.tables.PgAmproc
import org.acme.generated.pg_catalog.tables.PgAttrdef
import org.acme.generated.pg_catalog.tables.PgAttribute
import org.acme.generated.pg_catalog.tables.PgAuthMembers
import org.acme.generated.pg_catalog.tables.PgAuthid
import org.acme.generated.pg_catalog.tables.PgCast
import org.acme.generated.pg_catalog.tables.PgClass
import org.acme.generated.pg_catalog.tables.PgCollation
import org.acme.generated.pg_catalog.tables.PgConstraint
import org.acme.generated.pg_catalog.tables.PgConversion
import org.acme.generated.pg_catalog.tables.PgDatabase
import org.acme.generated.pg_catalog.tables.PgDbRoleSetting
import org.acme.generated.pg_catalog.tables.PgDefaultAcl
import org.acme.generated.pg_catalog.tables.PgDescription
import org.acme.generated.pg_catalog.tables.PgEnum
import org.acme.generated.pg_catalog.tables.PgEventTrigger
import org.acme.generated.pg_catalog.tables.PgExtension
import org.acme.generated.pg_catalog.tables.PgForeignDataWrapper
import org.acme.generated.pg_catalog.tables.PgForeignServer
import org.acme.generated.pg_catalog.tables.PgForeignTable
import org.acme.generated.pg_catalog.tables.PgIndex
import org.acme.generated.pg_catalog.tables.PgInherits
import org.acme.generated.pg_catalog.tables.PgInitPrivs
import org.acme.generated.pg_catalog.tables.PgLanguage
import org.acme.generated.pg_catalog.tables.PgLargeobject
import org.acme.generated.pg_catalog.tables.PgLargeobjectMetadata
import org.acme.generated.pg_catalog.tables.PgNamespace
import org.acme.generated.pg_catalog.tables.PgOpclass
import org.acme.generated.pg_catalog.tables.PgOperator
import org.acme.generated.pg_catalog.tables.PgOpfamily
import org.acme.generated.pg_catalog.tables.PgPartitionedTable
import org.acme.generated.pg_catalog.tables.PgPolicy
import org.acme.generated.pg_catalog.tables.PgProc
import org.acme.generated.pg_catalog.tables.PgPublication
import org.acme.generated.pg_catalog.tables.PgPublicationRel
import org.acme.generated.pg_catalog.tables.PgRange
import org.acme.generated.pg_catalog.tables.PgReplicationOrigin
import org.acme.generated.pg_catalog.tables.PgRewrite
import org.acme.generated.pg_catalog.tables.PgSeclabel
import org.acme.generated.pg_catalog.tables.PgSequence
import org.acme.generated.pg_catalog.tables.PgShdescription
import org.acme.generated.pg_catalog.tables.PgShseclabel
import org.acme.generated.pg_catalog.tables.PgStatistic
import org.acme.generated.pg_catalog.tables.PgStatisticExt
import org.acme.generated.pg_catalog.tables.PgStatisticExtData
import org.acme.generated.pg_catalog.tables.PgSubscription
import org.acme.generated.pg_catalog.tables.PgSubscriptionRel
import org.acme.generated.pg_catalog.tables.PgTablespace
import org.acme.generated.pg_catalog.tables.PgTransform
import org.acme.generated.pg_catalog.tables.PgTrigger
import org.acme.generated.pg_catalog.tables.PgTsConfig
import org.acme.generated.pg_catalog.tables.PgTsConfigMap
import org.acme.generated.pg_catalog.tables.PgTsDict
import org.acme.generated.pg_catalog.tables.PgTsParser
import org.acme.generated.pg_catalog.tables.PgTsTemplate
import org.acme.generated.pg_catalog.tables.PgType
import org.acme.generated.pg_catalog.tables.PgUserMapping
import org.acme.generated.pg_catalog.tables.records.PgAggregateRecord
import org.acme.generated.pg_catalog.tables.records.PgAmRecord
import org.acme.generated.pg_catalog.tables.records.PgAmopRecord
import org.acme.generated.pg_catalog.tables.records.PgAmprocRecord
import org.acme.generated.pg_catalog.tables.records.PgAttrdefRecord
import org.acme.generated.pg_catalog.tables.records.PgAttributeRecord
import org.acme.generated.pg_catalog.tables.records.PgAuthMembersRecord
import org.acme.generated.pg_catalog.tables.records.PgAuthidRecord
import org.acme.generated.pg_catalog.tables.records.PgCastRecord
import org.acme.generated.pg_catalog.tables.records.PgClassRecord
import org.acme.generated.pg_catalog.tables.records.PgCollationRecord
import org.acme.generated.pg_catalog.tables.records.PgConstraintRecord
import org.acme.generated.pg_catalog.tables.records.PgConversionRecord
import org.acme.generated.pg_catalog.tables.records.PgDatabaseRecord
import org.acme.generated.pg_catalog.tables.records.PgDbRoleSettingRecord
import org.acme.generated.pg_catalog.tables.records.PgDefaultAclRecord
import org.acme.generated.pg_catalog.tables.records.PgDescriptionRecord
import org.acme.generated.pg_catalog.tables.records.PgEnumRecord
import org.acme.generated.pg_catalog.tables.records.PgEventTriggerRecord
import org.acme.generated.pg_catalog.tables.records.PgExtensionRecord
import org.acme.generated.pg_catalog.tables.records.PgForeignDataWrapperRecord
import org.acme.generated.pg_catalog.tables.records.PgForeignServerRecord
import org.acme.generated.pg_catalog.tables.records.PgForeignTableRecord
import org.acme.generated.pg_catalog.tables.records.PgIndexRecord
import org.acme.generated.pg_catalog.tables.records.PgInheritsRecord
import org.acme.generated.pg_catalog.tables.records.PgInitPrivsRecord
import org.acme.generated.pg_catalog.tables.records.PgLanguageRecord
import org.acme.generated.pg_catalog.tables.records.PgLargeobjectMetadataRecord
import org.acme.generated.pg_catalog.tables.records.PgLargeobjectRecord
import org.acme.generated.pg_catalog.tables.records.PgNamespaceRecord
import org.acme.generated.pg_catalog.tables.records.PgOpclassRecord
import org.acme.generated.pg_catalog.tables.records.PgOperatorRecord
import org.acme.generated.pg_catalog.tables.records.PgOpfamilyRecord
import org.acme.generated.pg_catalog.tables.records.PgPartitionedTableRecord
import org.acme.generated.pg_catalog.tables.records.PgPolicyRecord
import org.acme.generated.pg_catalog.tables.records.PgProcRecord
import org.acme.generated.pg_catalog.tables.records.PgPublicationRecord
import org.acme.generated.pg_catalog.tables.records.PgPublicationRelRecord
import org.acme.generated.pg_catalog.tables.records.PgRangeRecord
import org.acme.generated.pg_catalog.tables.records.PgReplicationOriginRecord
import org.acme.generated.pg_catalog.tables.records.PgRewriteRecord
import org.acme.generated.pg_catalog.tables.records.PgSeclabelRecord
import org.acme.generated.pg_catalog.tables.records.PgSequenceRecord
import org.acme.generated.pg_catalog.tables.records.PgShdescriptionRecord
import org.acme.generated.pg_catalog.tables.records.PgShseclabelRecord
import org.acme.generated.pg_catalog.tables.records.PgStatisticExtDataRecord
import org.acme.generated.pg_catalog.tables.records.PgStatisticExtRecord
import org.acme.generated.pg_catalog.tables.records.PgStatisticRecord
import org.acme.generated.pg_catalog.tables.records.PgSubscriptionRecord
import org.acme.generated.pg_catalog.tables.records.PgSubscriptionRelRecord
import org.acme.generated.pg_catalog.tables.records.PgTablespaceRecord
import org.acme.generated.pg_catalog.tables.records.PgTransformRecord
import org.acme.generated.pg_catalog.tables.records.PgTriggerRecord
import org.acme.generated.pg_catalog.tables.records.PgTsConfigMapRecord
import org.acme.generated.pg_catalog.tables.records.PgTsConfigRecord
import org.acme.generated.pg_catalog.tables.records.PgTsDictRecord
import org.acme.generated.pg_catalog.tables.records.PgTsParserRecord
import org.acme.generated.pg_catalog.tables.records.PgTsTemplateRecord
import org.acme.generated.pg_catalog.tables.records.PgTypeRecord
import org.acme.generated.pg_catalog.tables.records.PgUserMappingRecord
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val PG_AGGREGATE_FNOID_INDEX: UniqueKey<PgAggregateRecord> = Internal.createUniqueKey(PgAggregate.PG_AGGREGATE, DSL.name("pg_aggregate_fnoid_index"), arrayOf(PgAggregate.PG_AGGREGATE.AGGFNOID), true)
val PG_AM_NAME_INDEX: UniqueKey<PgAmRecord> = Internal.createUniqueKey(PgAm.PG_AM, DSL.name("pg_am_name_index"), arrayOf(PgAm.PG_AM.AMNAME), true)
val PG_AM_OID_INDEX: UniqueKey<PgAmRecord> = Internal.createUniqueKey(PgAm.PG_AM, DSL.name("pg_am_oid_index"), arrayOf(PgAm.PG_AM.OID), true)
val PG_AMOP_FAM_STRAT_INDEX: UniqueKey<PgAmopRecord> = Internal.createUniqueKey(PgAmop.PG_AMOP, DSL.name("pg_amop_fam_strat_index"), arrayOf(PgAmop.PG_AMOP.AMOPFAMILY, PgAmop.PG_AMOP.AMOPLEFTTYPE, PgAmop.PG_AMOP.AMOPRIGHTTYPE, PgAmop.PG_AMOP.AMOPSTRATEGY), true)
val PG_AMOP_OID_INDEX: UniqueKey<PgAmopRecord> = Internal.createUniqueKey(PgAmop.PG_AMOP, DSL.name("pg_amop_oid_index"), arrayOf(PgAmop.PG_AMOP.OID), true)
val PG_AMOP_OPR_FAM_INDEX: UniqueKey<PgAmopRecord> = Internal.createUniqueKey(PgAmop.PG_AMOP, DSL.name("pg_amop_opr_fam_index"), arrayOf(PgAmop.PG_AMOP.AMOPOPR, PgAmop.PG_AMOP.AMOPPURPOSE, PgAmop.PG_AMOP.AMOPFAMILY), true)
val PG_AMPROC_FAM_PROC_INDEX: UniqueKey<PgAmprocRecord> = Internal.createUniqueKey(PgAmproc.PG_AMPROC, DSL.name("pg_amproc_fam_proc_index"), arrayOf(PgAmproc.PG_AMPROC.AMPROCFAMILY, PgAmproc.PG_AMPROC.AMPROCLEFTTYPE, PgAmproc.PG_AMPROC.AMPROCRIGHTTYPE, PgAmproc.PG_AMPROC.AMPROCNUM), true)
val PG_AMPROC_OID_INDEX: UniqueKey<PgAmprocRecord> = Internal.createUniqueKey(PgAmproc.PG_AMPROC, DSL.name("pg_amproc_oid_index"), arrayOf(PgAmproc.PG_AMPROC.OID), true)
val PG_ATTRDEF_ADRELID_ADNUM_INDEX: UniqueKey<PgAttrdefRecord> = Internal.createUniqueKey(PgAttrdef.PG_ATTRDEF, DSL.name("pg_attrdef_adrelid_adnum_index"), arrayOf(PgAttrdef.PG_ATTRDEF.ADRELID, PgAttrdef.PG_ATTRDEF.ADNUM), true)
val PG_ATTRDEF_OID_INDEX: UniqueKey<PgAttrdefRecord> = Internal.createUniqueKey(PgAttrdef.PG_ATTRDEF, DSL.name("pg_attrdef_oid_index"), arrayOf(PgAttrdef.PG_ATTRDEF.OID), true)
val PG_ATTRIBUTE_RELID_ATTNAM_INDEX: UniqueKey<PgAttributeRecord> = Internal.createUniqueKey(PgAttribute.PG_ATTRIBUTE, DSL.name("pg_attribute_relid_attnam_index"), arrayOf(PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNAME), true)
val PG_ATTRIBUTE_RELID_ATTNUM_INDEX: UniqueKey<PgAttributeRecord> = Internal.createUniqueKey(PgAttribute.PG_ATTRIBUTE, DSL.name("pg_attribute_relid_attnum_index"), arrayOf(PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNUM), true)
val PG_AUTH_MEMBERS_MEMBER_ROLE_INDEX: UniqueKey<PgAuthMembersRecord> = Internal.createUniqueKey(PgAuthMembers.PG_AUTH_MEMBERS, DSL.name("pg_auth_members_member_role_index"), arrayOf(PgAuthMembers.PG_AUTH_MEMBERS.MEMBER, PgAuthMembers.PG_AUTH_MEMBERS.ROLEID), true)
val PG_AUTH_MEMBERS_ROLE_MEMBER_INDEX: UniqueKey<PgAuthMembersRecord> = Internal.createUniqueKey(PgAuthMembers.PG_AUTH_MEMBERS, DSL.name("pg_auth_members_role_member_index"), arrayOf(PgAuthMembers.PG_AUTH_MEMBERS.ROLEID, PgAuthMembers.PG_AUTH_MEMBERS.MEMBER), true)
val PG_AUTHID_OID_INDEX: UniqueKey<PgAuthidRecord> = Internal.createUniqueKey(PgAuthid.PG_AUTHID, DSL.name("pg_authid_oid_index"), arrayOf(PgAuthid.PG_AUTHID.OID), true)
val PG_AUTHID_ROLNAME_INDEX: UniqueKey<PgAuthidRecord> = Internal.createUniqueKey(PgAuthid.PG_AUTHID, DSL.name("pg_authid_rolname_index"), arrayOf(PgAuthid.PG_AUTHID.ROLNAME), true)
val PG_CAST_OID_INDEX: UniqueKey<PgCastRecord> = Internal.createUniqueKey(PgCast.PG_CAST, DSL.name("pg_cast_oid_index"), arrayOf(PgCast.PG_CAST.OID), true)
val PG_CAST_SOURCE_TARGET_INDEX: UniqueKey<PgCastRecord> = Internal.createUniqueKey(PgCast.PG_CAST, DSL.name("pg_cast_source_target_index"), arrayOf(PgCast.PG_CAST.CASTSOURCE, PgCast.PG_CAST.CASTTARGET), true)
val PG_CLASS_OID_INDEX: UniqueKey<PgClassRecord> = Internal.createUniqueKey(PgClass.PG_CLASS, DSL.name("pg_class_oid_index"), arrayOf(PgClass.PG_CLASS.OID), true)
val PG_CLASS_RELNAME_NSP_INDEX: UniqueKey<PgClassRecord> = Internal.createUniqueKey(PgClass.PG_CLASS, DSL.name("pg_class_relname_nsp_index"), arrayOf(PgClass.PG_CLASS.RELNAME, PgClass.PG_CLASS.RELNAMESPACE), true)
val PG_COLLATION_NAME_ENC_NSP_INDEX: UniqueKey<PgCollationRecord> = Internal.createUniqueKey(PgCollation.PG_COLLATION, DSL.name("pg_collation_name_enc_nsp_index"), arrayOf(PgCollation.PG_COLLATION.COLLNAME, PgCollation.PG_COLLATION.COLLENCODING, PgCollation.PG_COLLATION.COLLNAMESPACE), true)
val PG_COLLATION_OID_INDEX: UniqueKey<PgCollationRecord> = Internal.createUniqueKey(PgCollation.PG_COLLATION, DSL.name("pg_collation_oid_index"), arrayOf(PgCollation.PG_COLLATION.OID), true)
val PG_CONSTRAINT_CONRELID_CONTYPID_CONNAME_INDEX: UniqueKey<PgConstraintRecord> = Internal.createUniqueKey(PgConstraint.PG_CONSTRAINT, DSL.name("pg_constraint_conrelid_contypid_conname_index"), arrayOf(PgConstraint.PG_CONSTRAINT.CONRELID, PgConstraint.PG_CONSTRAINT.CONTYPID, PgConstraint.PG_CONSTRAINT.CONNAME), true)
val PG_CONSTRAINT_OID_INDEX: UniqueKey<PgConstraintRecord> = Internal.createUniqueKey(PgConstraint.PG_CONSTRAINT, DSL.name("pg_constraint_oid_index"), arrayOf(PgConstraint.PG_CONSTRAINT.OID), true)
val PG_CONVERSION_DEFAULT_INDEX: UniqueKey<PgConversionRecord> = Internal.createUniqueKey(PgConversion.PG_CONVERSION, DSL.name("pg_conversion_default_index"), arrayOf(PgConversion.PG_CONVERSION.CONNAMESPACE, PgConversion.PG_CONVERSION.CONFORENCODING, PgConversion.PG_CONVERSION.CONTOENCODING, PgConversion.PG_CONVERSION.OID), true)
val PG_CONVERSION_NAME_NSP_INDEX: UniqueKey<PgConversionRecord> = Internal.createUniqueKey(PgConversion.PG_CONVERSION, DSL.name("pg_conversion_name_nsp_index"), arrayOf(PgConversion.PG_CONVERSION.CONNAME, PgConversion.PG_CONVERSION.CONNAMESPACE), true)
val PG_CONVERSION_OID_INDEX: UniqueKey<PgConversionRecord> = Internal.createUniqueKey(PgConversion.PG_CONVERSION, DSL.name("pg_conversion_oid_index"), arrayOf(PgConversion.PG_CONVERSION.OID), true)
val PG_DATABASE_DATNAME_INDEX: UniqueKey<PgDatabaseRecord> = Internal.createUniqueKey(PgDatabase.PG_DATABASE, DSL.name("pg_database_datname_index"), arrayOf(PgDatabase.PG_DATABASE.DATNAME), true)
val PG_DATABASE_OID_INDEX: UniqueKey<PgDatabaseRecord> = Internal.createUniqueKey(PgDatabase.PG_DATABASE, DSL.name("pg_database_oid_index"), arrayOf(PgDatabase.PG_DATABASE.OID), true)
val PG_DB_ROLE_SETTING_DATABASEID_ROL_INDEX: UniqueKey<PgDbRoleSettingRecord> = Internal.createUniqueKey(PgDbRoleSetting.PG_DB_ROLE_SETTING, DSL.name("pg_db_role_setting_databaseid_rol_index"), arrayOf(PgDbRoleSetting.PG_DB_ROLE_SETTING.SETDATABASE, PgDbRoleSetting.PG_DB_ROLE_SETTING.SETROLE), true)
val PG_DEFAULT_ACL_OID_INDEX: UniqueKey<PgDefaultAclRecord> = Internal.createUniqueKey(PgDefaultAcl.PG_DEFAULT_ACL, DSL.name("pg_default_acl_oid_index"), arrayOf(PgDefaultAcl.PG_DEFAULT_ACL.OID), true)
val PG_DEFAULT_ACL_ROLE_NSP_OBJ_INDEX: UniqueKey<PgDefaultAclRecord> = Internal.createUniqueKey(PgDefaultAcl.PG_DEFAULT_ACL, DSL.name("pg_default_acl_role_nsp_obj_index"), arrayOf(PgDefaultAcl.PG_DEFAULT_ACL.DEFACLROLE, PgDefaultAcl.PG_DEFAULT_ACL.DEFACLNAMESPACE, PgDefaultAcl.PG_DEFAULT_ACL.DEFACLOBJTYPE), true)
val PG_DESCRIPTION_O_C_O_INDEX: UniqueKey<PgDescriptionRecord> = Internal.createUniqueKey(PgDescription.PG_DESCRIPTION, DSL.name("pg_description_o_c_o_index"), arrayOf(PgDescription.PG_DESCRIPTION.OBJOID, PgDescription.PG_DESCRIPTION.CLASSOID, PgDescription.PG_DESCRIPTION.OBJSUBID), true)
val PG_ENUM_OID_INDEX: UniqueKey<PgEnumRecord> = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_oid_index"), arrayOf(PgEnum.PG_ENUM.OID), true)
val PG_ENUM_TYPID_LABEL_INDEX: UniqueKey<PgEnumRecord> = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_typid_label_index"), arrayOf(PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMLABEL), true)
val PG_ENUM_TYPID_SORTORDER_INDEX: UniqueKey<PgEnumRecord> = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_typid_sortorder_index"), arrayOf(PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMSORTORDER), true)
val PG_EVENT_TRIGGER_EVTNAME_INDEX: UniqueKey<PgEventTriggerRecord> = Internal.createUniqueKey(PgEventTrigger.PG_EVENT_TRIGGER, DSL.name("pg_event_trigger_evtname_index"), arrayOf(PgEventTrigger.PG_EVENT_TRIGGER.EVTNAME), true)
val PG_EVENT_TRIGGER_OID_INDEX: UniqueKey<PgEventTriggerRecord> = Internal.createUniqueKey(PgEventTrigger.PG_EVENT_TRIGGER, DSL.name("pg_event_trigger_oid_index"), arrayOf(PgEventTrigger.PG_EVENT_TRIGGER.OID), true)
val PG_EXTENSION_NAME_INDEX: UniqueKey<PgExtensionRecord> = Internal.createUniqueKey(PgExtension.PG_EXTENSION, DSL.name("pg_extension_name_index"), arrayOf(PgExtension.PG_EXTENSION.EXTNAME), true)
val PG_EXTENSION_OID_INDEX: UniqueKey<PgExtensionRecord> = Internal.createUniqueKey(PgExtension.PG_EXTENSION, DSL.name("pg_extension_oid_index"), arrayOf(PgExtension.PG_EXTENSION.OID), true)
val PG_FOREIGN_DATA_WRAPPER_NAME_INDEX: UniqueKey<PgForeignDataWrapperRecord> = Internal.createUniqueKey(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER, DSL.name("pg_foreign_data_wrapper_name_index"), arrayOf(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWNAME), true)
val PG_FOREIGN_DATA_WRAPPER_OID_INDEX: UniqueKey<PgForeignDataWrapperRecord> = Internal.createUniqueKey(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER, DSL.name("pg_foreign_data_wrapper_oid_index"), arrayOf(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.OID), true)
val PG_FOREIGN_SERVER_NAME_INDEX: UniqueKey<PgForeignServerRecord> = Internal.createUniqueKey(PgForeignServer.PG_FOREIGN_SERVER, DSL.name("pg_foreign_server_name_index"), arrayOf(PgForeignServer.PG_FOREIGN_SERVER.SRVNAME), true)
val PG_FOREIGN_SERVER_OID_INDEX: UniqueKey<PgForeignServerRecord> = Internal.createUniqueKey(PgForeignServer.PG_FOREIGN_SERVER, DSL.name("pg_foreign_server_oid_index"), arrayOf(PgForeignServer.PG_FOREIGN_SERVER.OID), true)
val PG_FOREIGN_TABLE_RELID_INDEX: UniqueKey<PgForeignTableRecord> = Internal.createUniqueKey(PgForeignTable.PG_FOREIGN_TABLE, DSL.name("pg_foreign_table_relid_index"), arrayOf(PgForeignTable.PG_FOREIGN_TABLE.FTRELID), true)
val PG_INDEX_INDEXRELID_INDEX: UniqueKey<PgIndexRecord> = Internal.createUniqueKey(PgIndex.PG_INDEX, DSL.name("pg_index_indexrelid_index"), arrayOf(PgIndex.PG_INDEX.INDEXRELID), true)
val PG_INHERITS_RELID_SEQNO_INDEX: UniqueKey<PgInheritsRecord> = Internal.createUniqueKey(PgInherits.PG_INHERITS, DSL.name("pg_inherits_relid_seqno_index"), arrayOf(PgInherits.PG_INHERITS.INHRELID, PgInherits.PG_INHERITS.INHSEQNO), true)
val PG_INIT_PRIVS_O_C_O_INDEX: UniqueKey<PgInitPrivsRecord> = Internal.createUniqueKey(PgInitPrivs.PG_INIT_PRIVS, DSL.name("pg_init_privs_o_c_o_index"), arrayOf(PgInitPrivs.PG_INIT_PRIVS.OBJOID, PgInitPrivs.PG_INIT_PRIVS.CLASSOID, PgInitPrivs.PG_INIT_PRIVS.OBJSUBID), true)
val PG_LANGUAGE_NAME_INDEX: UniqueKey<PgLanguageRecord> = Internal.createUniqueKey(PgLanguage.PG_LANGUAGE, DSL.name("pg_language_name_index"), arrayOf(PgLanguage.PG_LANGUAGE.LANNAME), true)
val PG_LANGUAGE_OID_INDEX: UniqueKey<PgLanguageRecord> = Internal.createUniqueKey(PgLanguage.PG_LANGUAGE, DSL.name("pg_language_oid_index"), arrayOf(PgLanguage.PG_LANGUAGE.OID), true)
val PG_LARGEOBJECT_LOID_PN_INDEX: UniqueKey<PgLargeobjectRecord> = Internal.createUniqueKey(PgLargeobject.PG_LARGEOBJECT, DSL.name("pg_largeobject_loid_pn_index"), arrayOf(PgLargeobject.PG_LARGEOBJECT.LOID, PgLargeobject.PG_LARGEOBJECT.PAGENO), true)
val PG_LARGEOBJECT_METADATA_OID_INDEX: UniqueKey<PgLargeobjectMetadataRecord> = Internal.createUniqueKey(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA, DSL.name("pg_largeobject_metadata_oid_index"), arrayOf(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.OID), true)
val PG_NAMESPACE_NSPNAME_INDEX: UniqueKey<PgNamespaceRecord> = Internal.createUniqueKey(PgNamespace.PG_NAMESPACE, DSL.name("pg_namespace_nspname_index"), arrayOf(PgNamespace.PG_NAMESPACE.NSPNAME), true)
val PG_NAMESPACE_OID_INDEX: UniqueKey<PgNamespaceRecord> = Internal.createUniqueKey(PgNamespace.PG_NAMESPACE, DSL.name("pg_namespace_oid_index"), arrayOf(PgNamespace.PG_NAMESPACE.OID), true)
val PG_OPCLASS_AM_NAME_NSP_INDEX: UniqueKey<PgOpclassRecord> = Internal.createUniqueKey(PgOpclass.PG_OPCLASS, DSL.name("pg_opclass_am_name_nsp_index"), arrayOf(PgOpclass.PG_OPCLASS.OPCMETHOD, PgOpclass.PG_OPCLASS.OPCNAME, PgOpclass.PG_OPCLASS.OPCNAMESPACE), true)
val PG_OPCLASS_OID_INDEX: UniqueKey<PgOpclassRecord> = Internal.createUniqueKey(PgOpclass.PG_OPCLASS, DSL.name("pg_opclass_oid_index"), arrayOf(PgOpclass.PG_OPCLASS.OID), true)
val PG_OPERATOR_OID_INDEX: UniqueKey<PgOperatorRecord> = Internal.createUniqueKey(PgOperator.PG_OPERATOR, DSL.name("pg_operator_oid_index"), arrayOf(PgOperator.PG_OPERATOR.OID), true)
val PG_OPERATOR_OPRNAME_L_R_N_INDEX: UniqueKey<PgOperatorRecord> = Internal.createUniqueKey(PgOperator.PG_OPERATOR, DSL.name("pg_operator_oprname_l_r_n_index"), arrayOf(PgOperator.PG_OPERATOR.OPRNAME, PgOperator.PG_OPERATOR.OPRLEFT, PgOperator.PG_OPERATOR.OPRRIGHT, PgOperator.PG_OPERATOR.OPRNAMESPACE), true)
val PG_OPFAMILY_AM_NAME_NSP_INDEX: UniqueKey<PgOpfamilyRecord> = Internal.createUniqueKey(PgOpfamily.PG_OPFAMILY, DSL.name("pg_opfamily_am_name_nsp_index"), arrayOf(PgOpfamily.PG_OPFAMILY.OPFMETHOD, PgOpfamily.PG_OPFAMILY.OPFNAME, PgOpfamily.PG_OPFAMILY.OPFNAMESPACE), true)
val PG_OPFAMILY_OID_INDEX: UniqueKey<PgOpfamilyRecord> = Internal.createUniqueKey(PgOpfamily.PG_OPFAMILY, DSL.name("pg_opfamily_oid_index"), arrayOf(PgOpfamily.PG_OPFAMILY.OID), true)
val PG_PARTITIONED_TABLE_PARTRELID_INDEX: UniqueKey<PgPartitionedTableRecord> = Internal.createUniqueKey(PgPartitionedTable.PG_PARTITIONED_TABLE, DSL.name("pg_partitioned_table_partrelid_index"), arrayOf(PgPartitionedTable.PG_PARTITIONED_TABLE.PARTRELID), true)
val PG_POLICY_OID_INDEX: UniqueKey<PgPolicyRecord> = Internal.createUniqueKey(PgPolicy.PG_POLICY, DSL.name("pg_policy_oid_index"), arrayOf(PgPolicy.PG_POLICY.OID), true)
val PG_POLICY_POLRELID_POLNAME_INDEX: UniqueKey<PgPolicyRecord> = Internal.createUniqueKey(PgPolicy.PG_POLICY, DSL.name("pg_policy_polrelid_polname_index"), arrayOf(PgPolicy.PG_POLICY.POLRELID, PgPolicy.PG_POLICY.POLNAME), true)
val PG_PROC_OID_INDEX: UniqueKey<PgProcRecord> = Internal.createUniqueKey(PgProc.PG_PROC, DSL.name("pg_proc_oid_index"), arrayOf(PgProc.PG_PROC.OID), true)
val PG_PROC_PRONAME_ARGS_NSP_INDEX: UniqueKey<PgProcRecord> = Internal.createUniqueKey(PgProc.PG_PROC, DSL.name("pg_proc_proname_args_nsp_index"), arrayOf(PgProc.PG_PROC.PRONAME, PgProc.PG_PROC.PROARGTYPES, PgProc.PG_PROC.PRONAMESPACE), true)
val PG_PUBLICATION_OID_INDEX: UniqueKey<PgPublicationRecord> = Internal.createUniqueKey(PgPublication.PG_PUBLICATION, DSL.name("pg_publication_oid_index"), arrayOf(PgPublication.PG_PUBLICATION.OID), true)
val PG_PUBLICATION_PUBNAME_INDEX: UniqueKey<PgPublicationRecord> = Internal.createUniqueKey(PgPublication.PG_PUBLICATION, DSL.name("pg_publication_pubname_index"), arrayOf(PgPublication.PG_PUBLICATION.PUBNAME), true)
val PG_PUBLICATION_REL_OID_INDEX: UniqueKey<PgPublicationRelRecord> = Internal.createUniqueKey(PgPublicationRel.PG_PUBLICATION_REL, DSL.name("pg_publication_rel_oid_index"), arrayOf(PgPublicationRel.PG_PUBLICATION_REL.OID), true)
val PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX: UniqueKey<PgPublicationRelRecord> = Internal.createUniqueKey(PgPublicationRel.PG_PUBLICATION_REL, DSL.name("pg_publication_rel_prrelid_prpubid_index"), arrayOf(PgPublicationRel.PG_PUBLICATION_REL.PRRELID, PgPublicationRel.PG_PUBLICATION_REL.PRPUBID), true)
val PG_RANGE_RNGMULTITYPID_INDEX: UniqueKey<PgRangeRecord> = Internal.createUniqueKey(PgRange.PG_RANGE, DSL.name("pg_range_rngmultitypid_index"), arrayOf(PgRange.PG_RANGE.RNGMULTITYPID), true)
val PG_RANGE_RNGTYPID_INDEX: UniqueKey<PgRangeRecord> = Internal.createUniqueKey(PgRange.PG_RANGE, DSL.name("pg_range_rngtypid_index"), arrayOf(PgRange.PG_RANGE.RNGTYPID), true)
val PG_REPLICATION_ORIGIN_ROIIDENT_INDEX: UniqueKey<PgReplicationOriginRecord> = Internal.createUniqueKey(PgReplicationOrigin.PG_REPLICATION_ORIGIN, DSL.name("pg_replication_origin_roiident_index"), arrayOf(PgReplicationOrigin.PG_REPLICATION_ORIGIN.ROIDENT), true)
val PG_REPLICATION_ORIGIN_RONAME_INDEX: UniqueKey<PgReplicationOriginRecord> = Internal.createUniqueKey(PgReplicationOrigin.PG_REPLICATION_ORIGIN, DSL.name("pg_replication_origin_roname_index"), arrayOf(PgReplicationOrigin.PG_REPLICATION_ORIGIN.RONAME), true)
val PG_REWRITE_OID_INDEX: UniqueKey<PgRewriteRecord> = Internal.createUniqueKey(PgRewrite.PG_REWRITE, DSL.name("pg_rewrite_oid_index"), arrayOf(PgRewrite.PG_REWRITE.OID), true)
val PG_REWRITE_REL_RULENAME_INDEX: UniqueKey<PgRewriteRecord> = Internal.createUniqueKey(PgRewrite.PG_REWRITE, DSL.name("pg_rewrite_rel_rulename_index"), arrayOf(PgRewrite.PG_REWRITE.EV_CLASS, PgRewrite.PG_REWRITE.RULENAME), true)
val PG_SECLABEL_OBJECT_INDEX: UniqueKey<PgSeclabelRecord> = Internal.createUniqueKey(PgSeclabel.PG_SECLABEL, DSL.name("pg_seclabel_object_index"), arrayOf(PgSeclabel.PG_SECLABEL.OBJOID, PgSeclabel.PG_SECLABEL.CLASSOID, PgSeclabel.PG_SECLABEL.OBJSUBID, PgSeclabel.PG_SECLABEL.PROVIDER), true)
val PG_SEQUENCE_SEQRELID_INDEX: UniqueKey<PgSequenceRecord> = Internal.createUniqueKey(PgSequence.PG_SEQUENCE, DSL.name("pg_sequence_seqrelid_index"), arrayOf(PgSequence.PG_SEQUENCE.SEQRELID), true)
val PG_SHDESCRIPTION_O_C_INDEX: UniqueKey<PgShdescriptionRecord> = Internal.createUniqueKey(PgShdescription.PG_SHDESCRIPTION, DSL.name("pg_shdescription_o_c_index"), arrayOf(PgShdescription.PG_SHDESCRIPTION.OBJOID, PgShdescription.PG_SHDESCRIPTION.CLASSOID), true)
val PG_SHSECLABEL_OBJECT_INDEX: UniqueKey<PgShseclabelRecord> = Internal.createUniqueKey(PgShseclabel.PG_SHSECLABEL, DSL.name("pg_shseclabel_object_index"), arrayOf(PgShseclabel.PG_SHSECLABEL.OBJOID, PgShseclabel.PG_SHSECLABEL.CLASSOID, PgShseclabel.PG_SHSECLABEL.PROVIDER), true)
val PG_STATISTIC_RELID_ATT_INH_INDEX: UniqueKey<PgStatisticRecord> = Internal.createUniqueKey(PgStatistic.PG_STATISTIC, DSL.name("pg_statistic_relid_att_inh_index"), arrayOf(PgStatistic.PG_STATISTIC.STARELID, PgStatistic.PG_STATISTIC.STAATTNUM, PgStatistic.PG_STATISTIC.STAINHERIT), true)
val PG_STATISTIC_EXT_NAME_INDEX: UniqueKey<PgStatisticExtRecord> = Internal.createUniqueKey(PgStatisticExt.PG_STATISTIC_EXT, DSL.name("pg_statistic_ext_name_index"), arrayOf(PgStatisticExt.PG_STATISTIC_EXT.STXNAME, PgStatisticExt.PG_STATISTIC_EXT.STXNAMESPACE), true)
val PG_STATISTIC_EXT_OID_INDEX: UniqueKey<PgStatisticExtRecord> = Internal.createUniqueKey(PgStatisticExt.PG_STATISTIC_EXT, DSL.name("pg_statistic_ext_oid_index"), arrayOf(PgStatisticExt.PG_STATISTIC_EXT.OID), true)
val PG_STATISTIC_EXT_DATA_STXOID_INDEX: UniqueKey<PgStatisticExtDataRecord> = Internal.createUniqueKey(PgStatisticExtData.PG_STATISTIC_EXT_DATA, DSL.name("pg_statistic_ext_data_stxoid_index"), arrayOf(PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXOID), true)
val PG_SUBSCRIPTION_OID_INDEX: UniqueKey<PgSubscriptionRecord> = Internal.createUniqueKey(PgSubscription.PG_SUBSCRIPTION, DSL.name("pg_subscription_oid_index"), arrayOf(PgSubscription.PG_SUBSCRIPTION.OID), true)
val PG_SUBSCRIPTION_SUBNAME_INDEX: UniqueKey<PgSubscriptionRecord> = Internal.createUniqueKey(PgSubscription.PG_SUBSCRIPTION, DSL.name("pg_subscription_subname_index"), arrayOf(PgSubscription.PG_SUBSCRIPTION.SUBDBID, PgSubscription.PG_SUBSCRIPTION.SUBNAME), true)
val PG_SUBSCRIPTION_REL_SRRELID_SRSUBID_INDEX: UniqueKey<PgSubscriptionRelRecord> = Internal.createUniqueKey(PgSubscriptionRel.PG_SUBSCRIPTION_REL, DSL.name("pg_subscription_rel_srrelid_srsubid_index"), arrayOf(PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRRELID, PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRSUBID), true)
val PG_TABLESPACE_OID_INDEX: UniqueKey<PgTablespaceRecord> = Internal.createUniqueKey(PgTablespace.PG_TABLESPACE, DSL.name("pg_tablespace_oid_index"), arrayOf(PgTablespace.PG_TABLESPACE.OID), true)
val PG_TABLESPACE_SPCNAME_INDEX: UniqueKey<PgTablespaceRecord> = Internal.createUniqueKey(PgTablespace.PG_TABLESPACE, DSL.name("pg_tablespace_spcname_index"), arrayOf(PgTablespace.PG_TABLESPACE.SPCNAME), true)
val PG_TRANSFORM_OID_INDEX: UniqueKey<PgTransformRecord> = Internal.createUniqueKey(PgTransform.PG_TRANSFORM, DSL.name("pg_transform_oid_index"), arrayOf(PgTransform.PG_TRANSFORM.OID), true)
val PG_TRANSFORM_TYPE_LANG_INDEX: UniqueKey<PgTransformRecord> = Internal.createUniqueKey(PgTransform.PG_TRANSFORM, DSL.name("pg_transform_type_lang_index"), arrayOf(PgTransform.PG_TRANSFORM.TRFTYPE, PgTransform.PG_TRANSFORM.TRFLANG), true)
val PG_TRIGGER_OID_INDEX: UniqueKey<PgTriggerRecord> = Internal.createUniqueKey(PgTrigger.PG_TRIGGER, DSL.name("pg_trigger_oid_index"), arrayOf(PgTrigger.PG_TRIGGER.OID), true)
val PG_TRIGGER_TGRELID_TGNAME_INDEX: UniqueKey<PgTriggerRecord> = Internal.createUniqueKey(PgTrigger.PG_TRIGGER, DSL.name("pg_trigger_tgrelid_tgname_index"), arrayOf(PgTrigger.PG_TRIGGER.TGRELID, PgTrigger.PG_TRIGGER.TGNAME), true)
val PG_TS_CONFIG_CFGNAME_INDEX: UniqueKey<PgTsConfigRecord> = Internal.createUniqueKey(PgTsConfig.PG_TS_CONFIG, DSL.name("pg_ts_config_cfgname_index"), arrayOf(PgTsConfig.PG_TS_CONFIG.CFGNAME, PgTsConfig.PG_TS_CONFIG.CFGNAMESPACE), true)
val PG_TS_CONFIG_OID_INDEX: UniqueKey<PgTsConfigRecord> = Internal.createUniqueKey(PgTsConfig.PG_TS_CONFIG, DSL.name("pg_ts_config_oid_index"), arrayOf(PgTsConfig.PG_TS_CONFIG.OID), true)
val PG_TS_CONFIG_MAP_INDEX: UniqueKey<PgTsConfigMapRecord> = Internal.createUniqueKey(PgTsConfigMap.PG_TS_CONFIG_MAP, DSL.name("pg_ts_config_map_index"), arrayOf(PgTsConfigMap.PG_TS_CONFIG_MAP.MAPCFG, PgTsConfigMap.PG_TS_CONFIG_MAP.MAPTOKENTYPE, PgTsConfigMap.PG_TS_CONFIG_MAP.MAPSEQNO), true)
val PG_TS_DICT_DICTNAME_INDEX: UniqueKey<PgTsDictRecord> = Internal.createUniqueKey(PgTsDict.PG_TS_DICT, DSL.name("pg_ts_dict_dictname_index"), arrayOf(PgTsDict.PG_TS_DICT.DICTNAME, PgTsDict.PG_TS_DICT.DICTNAMESPACE), true)
val PG_TS_DICT_OID_INDEX: UniqueKey<PgTsDictRecord> = Internal.createUniqueKey(PgTsDict.PG_TS_DICT, DSL.name("pg_ts_dict_oid_index"), arrayOf(PgTsDict.PG_TS_DICT.OID), true)
val PG_TS_PARSER_OID_INDEX: UniqueKey<PgTsParserRecord> = Internal.createUniqueKey(PgTsParser.PG_TS_PARSER, DSL.name("pg_ts_parser_oid_index"), arrayOf(PgTsParser.PG_TS_PARSER.OID), true)
val PG_TS_PARSER_PRSNAME_INDEX: UniqueKey<PgTsParserRecord> = Internal.createUniqueKey(PgTsParser.PG_TS_PARSER, DSL.name("pg_ts_parser_prsname_index"), arrayOf(PgTsParser.PG_TS_PARSER.PRSNAME, PgTsParser.PG_TS_PARSER.PRSNAMESPACE), true)
val PG_TS_TEMPLATE_OID_INDEX: UniqueKey<PgTsTemplateRecord> = Internal.createUniqueKey(PgTsTemplate.PG_TS_TEMPLATE, DSL.name("pg_ts_template_oid_index"), arrayOf(PgTsTemplate.PG_TS_TEMPLATE.OID), true)
val PG_TS_TEMPLATE_TMPLNAME_INDEX: UniqueKey<PgTsTemplateRecord> = Internal.createUniqueKey(PgTsTemplate.PG_TS_TEMPLATE, DSL.name("pg_ts_template_tmplname_index"), arrayOf(PgTsTemplate.PG_TS_TEMPLATE.TMPLNAME, PgTsTemplate.PG_TS_TEMPLATE.TMPLNAMESPACE), true)
val PG_TYPE_OID_INDEX: UniqueKey<PgTypeRecord> = Internal.createUniqueKey(PgType.PG_TYPE, DSL.name("pg_type_oid_index"), arrayOf(PgType.PG_TYPE.OID), true)
val PG_TYPE_TYPNAME_NSP_INDEX: UniqueKey<PgTypeRecord> = Internal.createUniqueKey(PgType.PG_TYPE, DSL.name("pg_type_typname_nsp_index"), arrayOf(PgType.PG_TYPE.TYPNAME, PgType.PG_TYPE.TYPNAMESPACE), true)
val PG_USER_MAPPING_OID_INDEX: UniqueKey<PgUserMappingRecord> = Internal.createUniqueKey(PgUserMapping.PG_USER_MAPPING, DSL.name("pg_user_mapping_oid_index"), arrayOf(PgUserMapping.PG_USER_MAPPING.OID), true)
val PG_USER_MAPPING_USER_SERVER_INDEX: UniqueKey<PgUserMappingRecord> = Internal.createUniqueKey(PgUserMapping.PG_USER_MAPPING, DSL.name("pg_user_mapping_user_server_index"), arrayOf(PgUserMapping.PG_USER_MAPPING.UMUSER, PgUserMapping.PG_USER_MAPPING.UMSERVER), true)