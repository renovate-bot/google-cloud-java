/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

public interface MappingRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.MappingRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full name of the mapping rule resource, in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{set}/mappingRule/{rule}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Full name of the mapping rule resource, in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{set}/mappingRule/{rule}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A human readable name
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Optional. A human readable name
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The mapping rule state
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MappingRule.State state = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Optional. The mapping rule state
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MappingRule.State state = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.clouddms.v1.MappingRule.State getState();

  /**
   *
   *
   * <pre>
   * Required. The rule scope
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.DatabaseEntityType rule_scope = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for ruleScope.
   */
  int getRuleScopeValue();

  /**
   *
   *
   * <pre>
   * Required. The rule scope
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.DatabaseEntityType rule_scope = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ruleScope.
   */
  com.google.cloud.clouddms.v1.DatabaseEntityType getRuleScope();

  /**
   *
   *
   * <pre>
   * Required. The rule filter
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MappingRuleFilter filter = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();

  /**
   *
   *
   * <pre>
   * Required. The rule filter
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MappingRuleFilter filter = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The filter.
   */
  com.google.cloud.clouddms.v1.MappingRuleFilter getFilter();

  /**
   *
   *
   * <pre>
   * Required. The rule filter
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MappingRuleFilter filter = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.clouddms.v1.MappingRuleFilterOrBuilder getFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The order in which the rule is applied. Lower order rules are
   * applied before higher value rules so they may end up being overridden.
   * </pre>
   *
   * <code>int64 rule_order = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The ruleOrder.
   */
  long getRuleOrder();

  /**
   *
   *
   * <pre>
   * Output only. The revision ID of the mapping rule.
   * A new revision is committed whenever the mapping rule is changed in any
   * way. The format is an 8-character hexadecimal string.
   * </pre>
   *
   * <code>string revision_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();

  /**
   *
   *
   * <pre>
   * Output only. The revision ID of the mapping rule.
   * A new revision is committed whenever the mapping rule is changed in any
   * way. The format is an 8-character hexadecimal string.
   * </pre>
   *
   * <code>string revision_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the revisionCreateTime field is set.
   */
  boolean hasRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionCreateTime.
   */
  com.google.protobuf.Timestamp getRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single entity should be renamed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SingleEntityRename single_entity_rename = 102 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the singleEntityRename field is set.
   */
  boolean hasSingleEntityRename();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single entity should be renamed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SingleEntityRename single_entity_rename = 102 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The singleEntityRename.
   */
  com.google.cloud.clouddms.v1.SingleEntityRename getSingleEntityRename();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single entity should be renamed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SingleEntityRename single_entity_rename = 102 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.SingleEntityRenameOrBuilder getSingleEntityRenameOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple entities should be renamed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MultiEntityRename multi_entity_rename = 103 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the multiEntityRename field is set.
   */
  boolean hasMultiEntityRename();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple entities should be renamed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MultiEntityRename multi_entity_rename = 103 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The multiEntityRename.
   */
  com.google.cloud.clouddms.v1.MultiEntityRename getMultiEntityRename();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple entities should be renamed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MultiEntityRename multi_entity_rename = 103 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.MultiEntityRenameOrBuilder getMultiEntityRenameOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple entities should be relocated into
   * a different schema.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.EntityMove entity_move = 105 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the entityMove field is set.
   */
  boolean hasEntityMove();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple entities should be relocated into
   * a different schema.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.EntityMove entity_move = 105 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The entityMove.
   */
  com.google.cloud.clouddms.v1.EntityMove getEntityMove();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple entities should be relocated into
   * a different schema.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.EntityMove entity_move = 105 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.EntityMoveOrBuilder getEntityMoveOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single column is converted.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SingleColumnChange single_column_change = 106 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the singleColumnChange field is set.
   */
  boolean hasSingleColumnChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single column is converted.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SingleColumnChange single_column_change = 106 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The singleColumnChange.
   */
  com.google.cloud.clouddms.v1.SingleColumnChange getSingleColumnChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single column is converted.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SingleColumnChange single_column_change = 106 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.SingleColumnChangeOrBuilder getSingleColumnChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple columns should be converted to a
   * different data type.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MultiColumnDatatypeChange multi_column_data_type_change = 107 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the multiColumnDataTypeChange field is set.
   */
  boolean hasMultiColumnDataTypeChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple columns should be converted to a
   * different data type.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MultiColumnDatatypeChange multi_column_data_type_change = 107 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The multiColumnDataTypeChange.
   */
  com.google.cloud.clouddms.v1.MultiColumnDatatypeChange getMultiColumnDataTypeChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple columns should be converted to a
   * different data type.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MultiColumnDatatypeChange multi_column_data_type_change = 107 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.MultiColumnDatatypeChangeOrBuilder
      getMultiColumnDataTypeChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how the data contained in a column should be
   * transformed (such as trimmed, rounded, etc) provided that the data meets
   * certain criteria.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConditionalColumnSetValue conditional_column_set_value = 108 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the conditionalColumnSetValue field is set.
   */
  boolean hasConditionalColumnSetValue();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how the data contained in a column should be
   * transformed (such as trimmed, rounded, etc) provided that the data meets
   * certain criteria.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConditionalColumnSetValue conditional_column_set_value = 108 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The conditionalColumnSetValue.
   */
  com.google.cloud.clouddms.v1.ConditionalColumnSetValue getConditionalColumnSetValue();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how the data contained in a column should be
   * transformed (such as trimmed, rounded, etc) provided that the data meets
   * certain criteria.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConditionalColumnSetValue conditional_column_set_value = 108 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.ConditionalColumnSetValueOrBuilder
      getConditionalColumnSetValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple tables should be converted with an
   * additional rowid column.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConvertRowIdToColumn convert_rowid_column = 114 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the convertRowidColumn field is set.
   */
  boolean hasConvertRowidColumn();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple tables should be converted with an
   * additional rowid column.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConvertRowIdToColumn convert_rowid_column = 114 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The convertRowidColumn.
   */
  com.google.cloud.clouddms.v1.ConvertRowIdToColumn getConvertRowidColumn();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how multiple tables should be converted with an
   * additional rowid column.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConvertRowIdToColumn convert_rowid_column = 114 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.ConvertRowIdToColumnOrBuilder getConvertRowidColumnOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify the primary key for a table
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SetTablePrimaryKey set_table_primary_key = 115 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the setTablePrimaryKey field is set.
   */
  boolean hasSetTablePrimaryKey();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify the primary key for a table
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SetTablePrimaryKey set_table_primary_key = 115 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The setTablePrimaryKey.
   */
  com.google.cloud.clouddms.v1.SetTablePrimaryKey getSetTablePrimaryKey();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify the primary key for a table
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SetTablePrimaryKey set_table_primary_key = 115 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.SetTablePrimaryKeyOrBuilder getSetTablePrimaryKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single package is converted.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SinglePackageChange single_package_change = 116 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the singlePackageChange field is set.
   */
  boolean hasSinglePackageChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single package is converted.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SinglePackageChange single_package_change = 116 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The singlePackageChange.
   */
  com.google.cloud.clouddms.v1.SinglePackageChange getSinglePackageChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify how a single package is converted.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SinglePackageChange single_package_change = 116 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.SinglePackageChangeOrBuilder getSinglePackageChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to change the sql code for an entity, for example,
   * function, procedure.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceSqlChange source_sql_change = 117 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sourceSqlChange field is set.
   */
  boolean hasSourceSqlChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to change the sql code for an entity, for example,
   * function, procedure.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceSqlChange source_sql_change = 117 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sourceSqlChange.
   */
  com.google.cloud.clouddms.v1.SourceSqlChange getSourceSqlChange();

  /**
   *
   *
   * <pre>
   * Optional. Rule to change the sql code for an entity, for example,
   * function, procedure.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SourceSqlChange source_sql_change = 117 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.SourceSqlChangeOrBuilder getSourceSqlChangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify the list of columns to include or exclude from
   * a table.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.FilterTableColumns filter_table_columns = 118 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the filterTableColumns field is set.
   */
  boolean hasFilterTableColumns();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify the list of columns to include or exclude from
   * a table.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.FilterTableColumns filter_table_columns = 118 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The filterTableColumns.
   */
  com.google.cloud.clouddms.v1.FilterTableColumns getFilterTableColumns();

  /**
   *
   *
   * <pre>
   * Optional. Rule to specify the list of columns to include or exclude from
   * a table.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.FilterTableColumns filter_table_columns = 118 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.FilterTableColumnsOrBuilder getFilterTableColumnsOrBuilder();

  com.google.cloud.clouddms.v1.MappingRule.DetailsCase getDetailsCase();
}
