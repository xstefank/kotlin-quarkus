/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.references


import org.acme.generated.information_schema.tables.AdministrableRoleAuthorizations
import org.acme.generated.information_schema.tables.ApplicableRoles
import org.acme.generated.information_schema.tables.Attributes
import org.acme.generated.information_schema.tables.CharacterSets
import org.acme.generated.information_schema.tables.CheckConstraintRoutineUsage
import org.acme.generated.information_schema.tables.CheckConstraints
import org.acme.generated.information_schema.tables.CollationCharacterSetApplicability
import org.acme.generated.information_schema.tables.Collations
import org.acme.generated.information_schema.tables.ColumnColumnUsage
import org.acme.generated.information_schema.tables.ColumnDomainUsage
import org.acme.generated.information_schema.tables.ColumnOptions
import org.acme.generated.information_schema.tables.ColumnPrivileges
import org.acme.generated.information_schema.tables.ColumnUdtUsage
import org.acme.generated.information_schema.tables.Columns
import org.acme.generated.information_schema.tables.ConstraintColumnUsage
import org.acme.generated.information_schema.tables.ConstraintTableUsage
import org.acme.generated.information_schema.tables.DataTypePrivileges
import org.acme.generated.information_schema.tables.DomainConstraints
import org.acme.generated.information_schema.tables.DomainUdtUsage
import org.acme.generated.information_schema.tables.Domains
import org.acme.generated.information_schema.tables.ElementTypes
import org.acme.generated.information_schema.tables.EnabledRoles
import org.acme.generated.information_schema.tables.ForeignDataWrapperOptions
import org.acme.generated.information_schema.tables.ForeignDataWrappers
import org.acme.generated.information_schema.tables.ForeignServerOptions
import org.acme.generated.information_schema.tables.ForeignServers
import org.acme.generated.information_schema.tables.ForeignTableOptions
import org.acme.generated.information_schema.tables.ForeignTables
import org.acme.generated.information_schema.tables.InformationSchemaCatalogName
import org.acme.generated.information_schema.tables.KeyColumnUsage
import org.acme.generated.information_schema.tables.Parameters
import org.acme.generated.information_schema.tables.ReferentialConstraints
import org.acme.generated.information_schema.tables.RoleColumnGrants
import org.acme.generated.information_schema.tables.RoleRoutineGrants
import org.acme.generated.information_schema.tables.RoleTableGrants
import org.acme.generated.information_schema.tables.RoleUdtGrants
import org.acme.generated.information_schema.tables.RoleUsageGrants
import org.acme.generated.information_schema.tables.RoutineColumnUsage
import org.acme.generated.information_schema.tables.RoutinePrivileges
import org.acme.generated.information_schema.tables.RoutineRoutineUsage
import org.acme.generated.information_schema.tables.RoutineSequenceUsage
import org.acme.generated.information_schema.tables.RoutineTableUsage
import org.acme.generated.information_schema.tables.Routines
import org.acme.generated.information_schema.tables.Schemata
import org.acme.generated.information_schema.tables.Sequences
import org.acme.generated.information_schema.tables.SqlFeatures
import org.acme.generated.information_schema.tables.SqlImplementationInfo
import org.acme.generated.information_schema.tables.SqlParts
import org.acme.generated.information_schema.tables.SqlSizing
import org.acme.generated.information_schema.tables.TableConstraints
import org.acme.generated.information_schema.tables.TablePrivileges
import org.acme.generated.information_schema.tables.Transforms
import org.acme.generated.information_schema.tables.TriggeredUpdateColumns
import org.acme.generated.information_schema.tables.Triggers
import org.acme.generated.information_schema.tables.UdtPrivileges
import org.acme.generated.information_schema.tables.UsagePrivileges
import org.acme.generated.information_schema.tables.UserDefinedTypes
import org.acme.generated.information_schema.tables.UserMappingOptions
import org.acme.generated.information_schema.tables.UserMappings
import org.acme.generated.information_schema.tables.ViewColumnUsage
import org.acme.generated.information_schema.tables.ViewRoutineUsage
import org.acme.generated.information_schema.tables.ViewTableUsage
import org.acme.generated.information_schema.tables.Views
import org.acme.generated.information_schema.tables._PgExpandarray
import org.acme.generated.information_schema.tables._PgForeignDataWrappers
import org.acme.generated.information_schema.tables._PgForeignServers
import org.acme.generated.information_schema.tables._PgForeignTableColumns
import org.acme.generated.information_schema.tables._PgForeignTables
import org.acme.generated.information_schema.tables._PgUserMappings
import org.acme.generated.information_schema.tables.records._PgExpandarrayRecord
import org.jooq.Configuration
import org.jooq.Field
import org.jooq.Result



/**
 * The table <code>information_schema._pg_expandarray</code>.
 */
val _PG_EXPANDARRAY: _PgExpandarray = _PgExpandarray._PG_EXPANDARRAY

/**
 * Call <code>information_schema._pg_expandarray</code>.
 */
fun _PG_EXPANDARRAY(
      configuration: Configuration
    , __1: Array<Any?>?
): Result<_PgExpandarrayRecord> = configuration.dsl().selectFrom(org.acme.generated.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
      __1
)).fetch()

/**
 * Get <code>information_schema._pg_expandarray</code> as a table.
 */
fun _PG_EXPANDARRAY(
      __1: Array<Any?>?
): _PgExpandarray = org.acme.generated.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
    __1
)

/**
 * Get <code>information_schema._pg_expandarray</code> as a table.
 */
fun _PG_EXPANDARRAY(
      __1: Field<Array<Any?>?>
): _PgExpandarray = org.acme.generated.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
    __1
)

/**
 * The table <code>information_schema._pg_foreign_data_wrappers</code>.
 */
val _PG_FOREIGN_DATA_WRAPPERS: _PgForeignDataWrappers = _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS

/**
 * The table <code>information_schema._pg_foreign_servers</code>.
 */
val _PG_FOREIGN_SERVERS: _PgForeignServers = _PgForeignServers._PG_FOREIGN_SERVERS

/**
 * The table <code>information_schema._pg_foreign_table_columns</code>.
 */
val _PG_FOREIGN_TABLE_COLUMNS: _PgForeignTableColumns = _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS

/**
 * The table <code>information_schema._pg_foreign_tables</code>.
 */
val _PG_FOREIGN_TABLES: _PgForeignTables = _PgForeignTables._PG_FOREIGN_TABLES

/**
 * The table <code>information_schema._pg_user_mappings</code>.
 */
val _PG_USER_MAPPINGS: _PgUserMappings = _PgUserMappings._PG_USER_MAPPINGS

/**
 * The table <code>information_schema.administrable_role_authorizations</code>.
 */
val ADMINISTRABLE_ROLE_AUTHORIZATIONS: AdministrableRoleAuthorizations = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS

/**
 * The table <code>information_schema.applicable_roles</code>.
 */
val APPLICABLE_ROLES: ApplicableRoles = ApplicableRoles.APPLICABLE_ROLES

/**
 * The table <code>information_schema.attributes</code>.
 */
val ATTRIBUTES: Attributes = Attributes.ATTRIBUTES

/**
 * The table <code>information_schema.character_sets</code>.
 */
val CHARACTER_SETS: CharacterSets = CharacterSets.CHARACTER_SETS

/**
 * The table <code>information_schema.check_constraint_routine_usage</code>.
 */
val CHECK_CONSTRAINT_ROUTINE_USAGE: CheckConstraintRoutineUsage = CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE

/**
 * The table <code>information_schema.check_constraints</code>.
 */
val CHECK_CONSTRAINTS: CheckConstraints = CheckConstraints.CHECK_CONSTRAINTS

/**
 * The table
 * <code>information_schema.collation_character_set_applicability</code>.
 */
val COLLATION_CHARACTER_SET_APPLICABILITY: CollationCharacterSetApplicability = CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY

/**
 * The table <code>information_schema.collations</code>.
 */
val COLLATIONS: Collations = Collations.COLLATIONS

/**
 * The table <code>information_schema.column_column_usage</code>.
 */
val COLUMN_COLUMN_USAGE: ColumnColumnUsage = ColumnColumnUsage.COLUMN_COLUMN_USAGE

/**
 * The table <code>information_schema.column_domain_usage</code>.
 */
val COLUMN_DOMAIN_USAGE: ColumnDomainUsage = ColumnDomainUsage.COLUMN_DOMAIN_USAGE

/**
 * The table <code>information_schema.column_options</code>.
 */
val COLUMN_OPTIONS: ColumnOptions = ColumnOptions.COLUMN_OPTIONS

/**
 * The table <code>information_schema.column_privileges</code>.
 */
val COLUMN_PRIVILEGES: ColumnPrivileges = ColumnPrivileges.COLUMN_PRIVILEGES

/**
 * The table <code>information_schema.column_udt_usage</code>.
 */
val COLUMN_UDT_USAGE: ColumnUdtUsage = ColumnUdtUsage.COLUMN_UDT_USAGE

/**
 * The table <code>information_schema.columns</code>.
 */
val COLUMNS: Columns = Columns.COLUMNS

/**
 * The table <code>information_schema.constraint_column_usage</code>.
 */
val CONSTRAINT_COLUMN_USAGE: ConstraintColumnUsage = ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE

/**
 * The table <code>information_schema.constraint_table_usage</code>.
 */
val CONSTRAINT_TABLE_USAGE: ConstraintTableUsage = ConstraintTableUsage.CONSTRAINT_TABLE_USAGE

/**
 * The table <code>information_schema.data_type_privileges</code>.
 */
val DATA_TYPE_PRIVILEGES: DataTypePrivileges = DataTypePrivileges.DATA_TYPE_PRIVILEGES

/**
 * The table <code>information_schema.domain_constraints</code>.
 */
val DOMAIN_CONSTRAINTS: DomainConstraints = DomainConstraints.DOMAIN_CONSTRAINTS

/**
 * The table <code>information_schema.domain_udt_usage</code>.
 */
val DOMAIN_UDT_USAGE: DomainUdtUsage = DomainUdtUsage.DOMAIN_UDT_USAGE

/**
 * The table <code>information_schema.domains</code>.
 */
val DOMAINS: Domains = Domains.DOMAINS

/**
 * The table <code>information_schema.element_types</code>.
 */
val ELEMENT_TYPES: ElementTypes = ElementTypes.ELEMENT_TYPES

/**
 * The table <code>information_schema.enabled_roles</code>.
 */
val ENABLED_ROLES: EnabledRoles = EnabledRoles.ENABLED_ROLES

/**
 * The table <code>information_schema.foreign_data_wrapper_options</code>.
 */
val FOREIGN_DATA_WRAPPER_OPTIONS: ForeignDataWrapperOptions = ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS

/**
 * The table <code>information_schema.foreign_data_wrappers</code>.
 */
val FOREIGN_DATA_WRAPPERS: ForeignDataWrappers = ForeignDataWrappers.FOREIGN_DATA_WRAPPERS

/**
 * The table <code>information_schema.foreign_server_options</code>.
 */
val FOREIGN_SERVER_OPTIONS: ForeignServerOptions = ForeignServerOptions.FOREIGN_SERVER_OPTIONS

/**
 * The table <code>information_schema.foreign_servers</code>.
 */
val FOREIGN_SERVERS: ForeignServers = ForeignServers.FOREIGN_SERVERS

/**
 * The table <code>information_schema.foreign_table_options</code>.
 */
val FOREIGN_TABLE_OPTIONS: ForeignTableOptions = ForeignTableOptions.FOREIGN_TABLE_OPTIONS

/**
 * The table <code>information_schema.foreign_tables</code>.
 */
val FOREIGN_TABLES: ForeignTables = ForeignTables.FOREIGN_TABLES

/**
 * The table <code>information_schema.information_schema_catalog_name</code>.
 */
val INFORMATION_SCHEMA_CATALOG_NAME: InformationSchemaCatalogName = InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME

/**
 * The table <code>information_schema.key_column_usage</code>.
 */
val KEY_COLUMN_USAGE: KeyColumnUsage = KeyColumnUsage.KEY_COLUMN_USAGE

/**
 * The table <code>information_schema.parameters</code>.
 */
val PARAMETERS: Parameters = Parameters.PARAMETERS

/**
 * The table <code>information_schema.referential_constraints</code>.
 */
val REFERENTIAL_CONSTRAINTS: ReferentialConstraints = ReferentialConstraints.REFERENTIAL_CONSTRAINTS

/**
 * The table <code>information_schema.role_column_grants</code>.
 */
val ROLE_COLUMN_GRANTS: RoleColumnGrants = RoleColumnGrants.ROLE_COLUMN_GRANTS

/**
 * The table <code>information_schema.role_routine_grants</code>.
 */
val ROLE_ROUTINE_GRANTS: RoleRoutineGrants = RoleRoutineGrants.ROLE_ROUTINE_GRANTS

/**
 * The table <code>information_schema.role_table_grants</code>.
 */
val ROLE_TABLE_GRANTS: RoleTableGrants = RoleTableGrants.ROLE_TABLE_GRANTS

/**
 * The table <code>information_schema.role_udt_grants</code>.
 */
val ROLE_UDT_GRANTS: RoleUdtGrants = RoleUdtGrants.ROLE_UDT_GRANTS

/**
 * The table <code>information_schema.role_usage_grants</code>.
 */
val ROLE_USAGE_GRANTS: RoleUsageGrants = RoleUsageGrants.ROLE_USAGE_GRANTS

/**
 * The table <code>information_schema.routine_column_usage</code>.
 */
val ROUTINE_COLUMN_USAGE: RoutineColumnUsage = RoutineColumnUsage.ROUTINE_COLUMN_USAGE

/**
 * The table <code>information_schema.routine_privileges</code>.
 */
val ROUTINE_PRIVILEGES: RoutinePrivileges = RoutinePrivileges.ROUTINE_PRIVILEGES

/**
 * The table <code>information_schema.routine_routine_usage</code>.
 */
val ROUTINE_ROUTINE_USAGE: RoutineRoutineUsage = RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE

/**
 * The table <code>information_schema.routine_sequence_usage</code>.
 */
val ROUTINE_SEQUENCE_USAGE: RoutineSequenceUsage = RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE

/**
 * The table <code>information_schema.routine_table_usage</code>.
 */
val ROUTINE_TABLE_USAGE: RoutineTableUsage = RoutineTableUsage.ROUTINE_TABLE_USAGE

/**
 * The table <code>information_schema.routines</code>.
 */
val ROUTINES: Routines = Routines.ROUTINES

/**
 * The table <code>information_schema.schemata</code>.
 */
val SCHEMATA: Schemata = Schemata.SCHEMATA

/**
 * The table <code>information_schema.sequences</code>.
 */
val SEQUENCES: Sequences = Sequences.SEQUENCES

/**
 * The table <code>information_schema.sql_features</code>.
 */
val SQL_FEATURES: SqlFeatures = SqlFeatures.SQL_FEATURES

/**
 * The table <code>information_schema.sql_implementation_info</code>.
 */
val SQL_IMPLEMENTATION_INFO: SqlImplementationInfo = SqlImplementationInfo.SQL_IMPLEMENTATION_INFO

/**
 * The table <code>information_schema.sql_parts</code>.
 */
val SQL_PARTS: SqlParts = SqlParts.SQL_PARTS

/**
 * The table <code>information_schema.sql_sizing</code>.
 */
val SQL_SIZING: SqlSizing = SqlSizing.SQL_SIZING

/**
 * The table <code>information_schema.table_constraints</code>.
 */
val TABLE_CONSTRAINTS: TableConstraints = TableConstraints.TABLE_CONSTRAINTS

/**
 * The table <code>information_schema.table_privileges</code>.
 */
val TABLE_PRIVILEGES: TablePrivileges = TablePrivileges.TABLE_PRIVILEGES

/**
 * The table <code>information_schema.tables</code>.
 */
val TABLES: org.acme.generated.information_schema.tables.Tables = org.acme.generated.information_schema.tables.Tables.TABLES

/**
 * The table <code>information_schema.transforms</code>.
 */
val TRANSFORMS: Transforms = Transforms.TRANSFORMS

/**
 * The table <code>information_schema.triggered_update_columns</code>.
 */
val TRIGGERED_UPDATE_COLUMNS: TriggeredUpdateColumns = TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS

/**
 * The table <code>information_schema.triggers</code>.
 */
val TRIGGERS: Triggers = Triggers.TRIGGERS

/**
 * The table <code>information_schema.udt_privileges</code>.
 */
val UDT_PRIVILEGES: UdtPrivileges = UdtPrivileges.UDT_PRIVILEGES

/**
 * The table <code>information_schema.usage_privileges</code>.
 */
val USAGE_PRIVILEGES: UsagePrivileges = UsagePrivileges.USAGE_PRIVILEGES

/**
 * The table <code>information_schema.user_defined_types</code>.
 */
val USER_DEFINED_TYPES: UserDefinedTypes = UserDefinedTypes.USER_DEFINED_TYPES

/**
 * The table <code>information_schema.user_mapping_options</code>.
 */
val USER_MAPPING_OPTIONS: UserMappingOptions = UserMappingOptions.USER_MAPPING_OPTIONS

/**
 * The table <code>information_schema.user_mappings</code>.
 */
val USER_MAPPINGS: UserMappings = UserMappings.USER_MAPPINGS

/**
 * The table <code>information_schema.view_column_usage</code>.
 */
val VIEW_COLUMN_USAGE: ViewColumnUsage = ViewColumnUsage.VIEW_COLUMN_USAGE

/**
 * The table <code>information_schema.view_routine_usage</code>.
 */
val VIEW_ROUTINE_USAGE: ViewRoutineUsage = ViewRoutineUsage.VIEW_ROUTINE_USAGE

/**
 * The table <code>information_schema.view_table_usage</code>.
 */
val VIEW_TABLE_USAGE: ViewTableUsage = ViewTableUsage.VIEW_TABLE_USAGE

/**
 * The table <code>information_schema.views</code>.
 */
val VIEWS: Views = Views.VIEWS
