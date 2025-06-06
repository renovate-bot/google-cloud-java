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
// source: google/cloud/bigquery/migration/v2/translation_details.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.migration.v2;

public interface SourceEnvironmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.SourceEnvironment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The default database name to fully qualify SQL objects when their database
   * name is missing.
   * </pre>
   *
   * <code>string default_database = 1;</code>
   *
   * @return The defaultDatabase.
   */
  java.lang.String getDefaultDatabase();

  /**
   *
   *
   * <pre>
   * The default database name to fully qualify SQL objects when their database
   * name is missing.
   * </pre>
   *
   * <code>string default_database = 1;</code>
   *
   * @return The bytes for defaultDatabase.
   */
  com.google.protobuf.ByteString getDefaultDatabaseBytes();

  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @return A list containing the schemaSearchPath.
   */
  java.util.List<java.lang.String> getSchemaSearchPathList();

  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @return The count of schemaSearchPath.
   */
  int getSchemaSearchPathCount();

  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The schemaSearchPath at the given index.
   */
  java.lang.String getSchemaSearchPath(int index);

  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the schemaSearchPath at the given index.
   */
  com.google.protobuf.ByteString getSchemaSearchPathBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
   * project-123.metadata_store_123.  If specified, translation will search and
   * read the required schema information from a metadata store in this dataset.
   * If metadata store doesn't exist, translation will parse the metadata file
   * and upload the schema info to a temp table in the dataset to speed up
   * future translation jobs.
   * </pre>
   *
   * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The metadataStoreDataset.
   */
  java.lang.String getMetadataStoreDataset();

  /**
   *
   *
   * <pre>
   * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
   * project-123.metadata_store_123.  If specified, translation will search and
   * read the required schema information from a metadata store in this dataset.
   * If metadata store doesn't exist, translation will parse the metadata file
   * and upload the schema info to a temp table in the dataset to speed up
   * future translation jobs.
   * </pre>
   *
   * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for metadataStoreDataset.
   */
  com.google.protobuf.ByteString getMetadataStoreDatasetBytes();
}
