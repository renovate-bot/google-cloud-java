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
// source: google/cloud/metastore/v1/metastore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.metastore.v1;

public interface MoveTableToDatabaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.MoveTableToDatabaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to mutate
   * metadata, in the following format:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The service.
   */
  java.lang.String getService();

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to mutate
   * metadata, in the following format:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the table to be moved.
   * </pre>
   *
   * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tableName.
   */
  java.lang.String getTableName();

  /**
   *
   *
   * <pre>
   * Required. The name of the table to be moved.
   * </pre>
   *
   * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString getTableNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table resides.
   * </pre>
   *
   * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dbName.
   */
  java.lang.String getDbName();

  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table resides.
   * </pre>
   *
   * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dbName.
   */
  com.google.protobuf.ByteString getDbNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table should be moved.
   * </pre>
   *
   * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The destinationDbName.
   */
  java.lang.String getDestinationDbName();

  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table should be moved.
   * </pre>
   *
   * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for destinationDbName.
   */
  com.google.protobuf.ByteString getDestinationDbNameBytes();
}
