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
// source: google/cloud/automl/v1beta1/tables.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public interface TablesDatasetMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TablesDatasetMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The table_spec_id of the primary table of this dataset.
   * </pre>
   *
   * <code>string primary_table_spec_id = 1;</code>
   *
   * @return The primaryTableSpecId.
   */
  java.lang.String getPrimaryTableSpecId();

  /**
   *
   *
   * <pre>
   * Output only. The table_spec_id of the primary table of this dataset.
   * </pre>
   *
   * <code>string primary_table_spec_id = 1;</code>
   *
   * @return The bytes for primaryTableSpecId.
   */
  com.google.protobuf.ByteString getPrimaryTableSpecIdBytes();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * training &amp; prediction target.
   * This column must be non-nullable and have one of following data types
   * (otherwise model creation will error):
   *
   * * CATEGORY
   *
   * * FLOAT64
   *
   * If the type is CATEGORY , only up to
   * 100 unique values may exist in that column across all rows.
   *
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string target_column_spec_id = 2;</code>
   *
   * @return The targetColumnSpecId.
   */
  java.lang.String getTargetColumnSpecId();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * training &amp; prediction target.
   * This column must be non-nullable and have one of following data types
   * (otherwise model creation will error):
   *
   * * CATEGORY
   *
   * * FLOAT64
   *
   * If the type is CATEGORY , only up to
   * 100 unique values may exist in that column across all rows.
   *
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string target_column_spec_id = 2;</code>
   *
   * @return The bytes for targetColumnSpecId.
   */
  com.google.protobuf.ByteString getTargetColumnSpecIdBytes();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * weight column, i.e. the higher the value the more important the row will be
   * during model training.
   * Required type: FLOAT64.
   * Allowed values: 0 to 10000, inclusive on both ends; 0 means the row is
   *                 ignored for training.
   * If not set all rows are assumed to have equal weight of 1.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string weight_column_spec_id = 3;</code>
   *
   * @return The weightColumnSpecId.
   */
  java.lang.String getWeightColumnSpecId();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * weight column, i.e. the higher the value the more important the row will be
   * during model training.
   * Required type: FLOAT64.
   * Allowed values: 0 to 10000, inclusive on both ends; 0 means the row is
   *                 ignored for training.
   * If not set all rows are assumed to have equal weight of 1.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string weight_column_spec_id = 3;</code>
   *
   * @return The bytes for weightColumnSpecId.
   */
  com.google.protobuf.ByteString getWeightColumnSpecIdBytes();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table column which specifies a possible ML
   * use of the row, i.e. the column will be used to split the rows into TRAIN,
   * VALIDATE and TEST sets.
   * Required type: STRING.
   * This column, if set, must either have all of `TRAIN`, `VALIDATE`, `TEST`
   * among its values, or only have `TEST`, `UNASSIGNED` values. In the latter
   * case the rows with `UNASSIGNED` value will be assigned by AutoML. Note
   * that if a given ml use distribution makes it impossible to create a "good"
   * model, that call will error describing the issue.
   * If both this column_spec_id and primary table's time_column_spec_id are not
   * set, then all rows are treated as `UNASSIGNED`.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string ml_use_column_spec_id = 4;</code>
   *
   * @return The mlUseColumnSpecId.
   */
  java.lang.String getMlUseColumnSpecId();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table column which specifies a possible ML
   * use of the row, i.e. the column will be used to split the rows into TRAIN,
   * VALIDATE and TEST sets.
   * Required type: STRING.
   * This column, if set, must either have all of `TRAIN`, `VALIDATE`, `TEST`
   * among its values, or only have `TEST`, `UNASSIGNED` values. In the latter
   * case the rows with `UNASSIGNED` value will be assigned by AutoML. Note
   * that if a given ml use distribution makes it impossible to create a "good"
   * model, that call will error describing the issue.
   * If both this column_spec_id and primary table's time_column_spec_id are not
   * set, then all rows are treated as `UNASSIGNED`.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string ml_use_column_spec_id = 4;</code>
   *
   * @return The bytes for mlUseColumnSpecId.
   */
  com.google.protobuf.ByteString getMlUseColumnSpecIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   *
   * [TablesDatasetMetadata.target_column_spec_id][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column_spec_id],
   * and other columns of the
   *
   * [TablesDatasetMetadataprimary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  int getTargetColumnCorrelationsCount();

  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   *
   * [TablesDatasetMetadata.target_column_spec_id][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column_spec_id],
   * and other columns of the
   *
   * [TablesDatasetMetadataprimary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  boolean containsTargetColumnCorrelations(java.lang.String key);

  /** Use {@link #getTargetColumnCorrelationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.CorrelationStats>
      getTargetColumnCorrelations();

  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   *
   * [TablesDatasetMetadata.target_column_spec_id][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column_spec_id],
   * and other columns of the
   *
   * [TablesDatasetMetadataprimary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.CorrelationStats>
      getTargetColumnCorrelationsMap();

  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   *
   * [TablesDatasetMetadata.target_column_spec_id][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column_spec_id],
   * and other columns of the
   *
   * [TablesDatasetMetadataprimary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  /* nullable */
  com.google.cloud.automl.v1beta1.CorrelationStats getTargetColumnCorrelationsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.automl.v1beta1.CorrelationStats defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   *
   * [TablesDatasetMetadata.target_column_spec_id][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column_spec_id],
   * and other columns of the
   *
   * [TablesDatasetMetadataprimary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  com.google.cloud.automl.v1beta1.CorrelationStats getTargetColumnCorrelationsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The most recent timestamp when target_column_correlations
   * field and all descendant ColumnSpec.data_stats and
   * ColumnSpec.top_correlated_columns fields were last (re-)generated. Any
   * changes that happened to the dataset afterwards are not reflected in these
   * fields values. The regeneration happens in the background on a best effort
   * basis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp stats_update_time = 7;</code>
   *
   * @return Whether the statsUpdateTime field is set.
   */
  boolean hasStatsUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The most recent timestamp when target_column_correlations
   * field and all descendant ColumnSpec.data_stats and
   * ColumnSpec.top_correlated_columns fields were last (re-)generated. Any
   * changes that happened to the dataset afterwards are not reflected in these
   * fields values. The regeneration happens in the background on a best effort
   * basis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp stats_update_time = 7;</code>
   *
   * @return The statsUpdateTime.
   */
  com.google.protobuf.Timestamp getStatsUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The most recent timestamp when target_column_correlations
   * field and all descendant ColumnSpec.data_stats and
   * ColumnSpec.top_correlated_columns fields were last (re-)generated. Any
   * changes that happened to the dataset afterwards are not reflected in these
   * fields values. The regeneration happens in the background on a best effort
   * basis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp stats_update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStatsUpdateTimeOrBuilder();
}
