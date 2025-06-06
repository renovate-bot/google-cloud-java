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
// source: google/cloud/bigquery/biglake/v1alpha1/metastore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.biglake.v1alpha1;

public interface CreateTableRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this table will be created.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this table will be created.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The table to create. The `name` field does not need to be
   * provided for the table creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the table field is set.
   */
  boolean hasTable();

  /**
   *
   *
   * <pre>
   * Required. The table to create. The `name` field does not need to be
   * provided for the table creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The table.
   */
  com.google.cloud.bigquery.biglake.v1alpha1.Table getTable();

  /**
   *
   *
   * <pre>
   * Required. The table to create. The `name` field does not need to be
   * provided for the table creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.biglake.v1alpha1.TableOrBuilder getTableOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the table, which will become the final
   * component of the table's resource name.
   * </pre>
   *
   * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tableId.
   */
  java.lang.String getTableId();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the table, which will become the final
   * component of the table's resource name.
   * </pre>
   *
   * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString getTableIdBytes();
}
