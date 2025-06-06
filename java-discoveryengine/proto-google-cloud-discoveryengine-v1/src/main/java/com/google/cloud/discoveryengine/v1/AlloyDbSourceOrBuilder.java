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
// source: google/cloud/discoveryengine/v1/import_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public interface AlloyDbSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.AlloyDbSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project ID that contains the AlloyDB source.
   * Has a length limit of 128 characters. If not specified, inherits the
   * project ID from the parent request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();

  /**
   *
   *
   * <pre>
   * The project ID that contains the AlloyDB source.
   * Has a length limit of 128 characters. If not specified, inherits the
   * project ID from the parent request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB location to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string location_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB location to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string location_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB cluster to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string cluster_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clusterId.
   */
  java.lang.String getClusterId();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB cluster to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string cluster_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clusterId.
   */
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB database to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string database_id = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The databaseId.
   */
  java.lang.String getDatabaseId();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB database to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string database_id = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for databaseId.
   */
  com.google.protobuf.ByteString getDatabaseIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB table to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string table_id = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tableId.
   */
  java.lang.String getTableId();

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB table to copy the data from with a length limit of
   * 256 characters.
   * </pre>
   *
   * <code>string table_id = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString getTableIdBytes();

  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * AlloyDB export to a specific Cloud Storage directory.
   *
   * Ensure that the AlloyDB service account has the necessary Cloud
   * Storage Admin permissions to access the specified Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 6;</code>
   *
   * @return The gcsStagingDir.
   */
  java.lang.String getGcsStagingDir();

  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * AlloyDB export to a specific Cloud Storage directory.
   *
   * Ensure that the AlloyDB service account has the necessary Cloud
   * Storage Admin permissions to access the specified Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 6;</code>
   *
   * @return The bytes for gcsStagingDir.
   */
  com.google.protobuf.ByteString getGcsStagingDirBytes();
}
