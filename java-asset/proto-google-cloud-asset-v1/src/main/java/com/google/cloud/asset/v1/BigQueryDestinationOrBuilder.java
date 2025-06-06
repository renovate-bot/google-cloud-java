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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.asset.v1;

public interface BigQueryDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.BigQueryDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset in format
   * "projects/projectId/datasets/datasetId", to which the snapshot result
   * should be exported. If this dataset does not exist, the export call returns
   * an INVALID_ARGUMENT error. Setting the `contentType` for `exportAssets`
   * determines the
   * [schema](/asset-inventory/docs/exporting-to-bigquery#bigquery-schema)
   * of the BigQuery table. Setting `separateTablesPerAssetType` to `TRUE` also
   * influences the schema.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset in format
   * "projects/projectId/datasets/datasetId", to which the snapshot result
   * should be exported. If this dataset does not exist, the export call returns
   * an INVALID_ARGUMENT error. Setting the `contentType` for `exportAssets`
   * determines the
   * [schema](/asset-inventory/docs/exporting-to-bigquery#bigquery-schema)
   * of the BigQuery table. Setting `separateTablesPerAssetType` to `TRUE` also
   * influences the schema.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to which the snapshot result should be
   * written. If this table does not exist, a new table with the given name
   * will be created.
   * </pre>
   *
   * <code>string table = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The table.
   */
  java.lang.String getTable();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to which the snapshot result should be
   * written. If this table does not exist, a new table with the given name
   * will be created.
   * </pre>
   *
   * <code>string table = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for table.
   */
  com.google.protobuf.ByteString getTableBytes();

  /**
   *
   *
   * <pre>
   * If the destination table already exists and this flag is `TRUE`, the
   * table will be overwritten by the contents of assets snapshot. If the flag
   * is `FALSE` or unset and the destination table already exists, the export
   * call returns an INVALID_ARGUMEMT error.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  boolean getForce();

  /**
   *
   *
   * <pre>
   * [partition_spec] determines whether to export to partitioned table(s) and
   * how to partition the data.
   *
   * If [partition_spec] is unset or [partition_spec.partition_key] is unset or
   * `PARTITION_KEY_UNSPECIFIED`, the snapshot results will be exported to
   * non-partitioned table(s). [force] will decide whether to overwrite existing
   * table(s).
   *
   * If [partition_spec] is specified. First, the snapshot results will be
   * written to partitioned table(s) with two additional timestamp columns,
   * readTime and requestTime, one of which will be the partition key. Secondly,
   * in the case when any destination table already exists, it will first try to
   * update existing table's schema as necessary by appending additional
   * columns. Then, if [force] is `TRUE`, the corresponding partition will be
   * overwritten by the snapshot results (data in different partitions will
   * remain intact); if [force] is unset or `FALSE`, it will append the data. An
   * error will be returned if the schema update or data appension fails.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.PartitionSpec partition_spec = 4;</code>
   *
   * @return Whether the partitionSpec field is set.
   */
  boolean hasPartitionSpec();

  /**
   *
   *
   * <pre>
   * [partition_spec] determines whether to export to partitioned table(s) and
   * how to partition the data.
   *
   * If [partition_spec] is unset or [partition_spec.partition_key] is unset or
   * `PARTITION_KEY_UNSPECIFIED`, the snapshot results will be exported to
   * non-partitioned table(s). [force] will decide whether to overwrite existing
   * table(s).
   *
   * If [partition_spec] is specified. First, the snapshot results will be
   * written to partitioned table(s) with two additional timestamp columns,
   * readTime and requestTime, one of which will be the partition key. Secondly,
   * in the case when any destination table already exists, it will first try to
   * update existing table's schema as necessary by appending additional
   * columns. Then, if [force] is `TRUE`, the corresponding partition will be
   * overwritten by the snapshot results (data in different partitions will
   * remain intact); if [force] is unset or `FALSE`, it will append the data. An
   * error will be returned if the schema update or data appension fails.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.PartitionSpec partition_spec = 4;</code>
   *
   * @return The partitionSpec.
   */
  com.google.cloud.asset.v1.PartitionSpec getPartitionSpec();

  /**
   *
   *
   * <pre>
   * [partition_spec] determines whether to export to partitioned table(s) and
   * how to partition the data.
   *
   * If [partition_spec] is unset or [partition_spec.partition_key] is unset or
   * `PARTITION_KEY_UNSPECIFIED`, the snapshot results will be exported to
   * non-partitioned table(s). [force] will decide whether to overwrite existing
   * table(s).
   *
   * If [partition_spec] is specified. First, the snapshot results will be
   * written to partitioned table(s) with two additional timestamp columns,
   * readTime and requestTime, one of which will be the partition key. Secondly,
   * in the case when any destination table already exists, it will first try to
   * update existing table's schema as necessary by appending additional
   * columns. Then, if [force] is `TRUE`, the corresponding partition will be
   * overwritten by the snapshot results (data in different partitions will
   * remain intact); if [force] is unset or `FALSE`, it will append the data. An
   * error will be returned if the schema update or data appension fails.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.PartitionSpec partition_spec = 4;</code>
   */
  com.google.cloud.asset.v1.PartitionSpecOrBuilder getPartitionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * If this flag is `TRUE`, the snapshot results will be written to one or
   * multiple tables, each of which contains results of one asset type. The
   * [force] and [partition_spec] fields will apply to each of them.
   *
   * Field [table] will be concatenated with "_" and the asset type names (see
   * https://cloud.google.com/asset-inventory/docs/supported-asset-types for
   * supported asset types) to construct per-asset-type table names, in which
   * all non-alphanumeric characters like "." and "/" will be substituted by
   * "_". Example: if field [table] is "mytable" and snapshot results
   * contain "storage.googleapis.com/Bucket" assets, the corresponding table
   * name will be "mytable_storage_googleapis_com_Bucket". If any of these
   * tables does not exist, a new table with the concatenated name will be
   * created.
   *
   * When [content_type] in the ExportAssetsRequest is `RESOURCE`, the schema of
   * each table will include RECORD-type columns mapped to the nested fields in
   * the Asset.resource.data field of that asset type (up to the 15 nested level
   * BigQuery supports
   * (https://cloud.google.com/bigquery/docs/nested-repeated#limitations)). The
   * fields in &gt;15 nested levels will be stored in JSON format string as a child
   * column of its parent RECORD column.
   *
   * If error occurs when exporting to any table, the whole export call will
   * return an error but the export results that already succeed will persist.
   * Example: if exporting to table_type_A succeeds when exporting to
   * table_type_B fails during one export call, the results in table_type_A will
   * persist and there will not be partial results persisting in a table.
   * </pre>
   *
   * <code>bool separate_tables_per_asset_type = 5;</code>
   *
   * @return The separateTablesPerAssetType.
   */
  boolean getSeparateTablesPerAssetType();
}
