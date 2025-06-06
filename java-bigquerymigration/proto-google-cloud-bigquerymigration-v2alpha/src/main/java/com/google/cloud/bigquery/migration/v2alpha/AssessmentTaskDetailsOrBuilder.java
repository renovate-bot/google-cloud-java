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
// source: google/cloud/bigquery/migration/v2alpha/assessment_task.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.migration.v2alpha;

public interface AssessmentTaskDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Cloud Storage path for assessment input files.
   * </pre>
   *
   * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The inputPath.
   */
  java.lang.String getInputPath();

  /**
   *
   *
   * <pre>
   * Required. The Cloud Storage path for assessment input files.
   * </pre>
   *
   * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for inputPath.
   */
  com.google.protobuf.ByteString getInputPathBytes();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset for output.
   * </pre>
   *
   * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The outputDataset.
   */
  java.lang.String getOutputDataset();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset for output.
   * </pre>
   *
   * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for outputDataset.
   */
  com.google.protobuf.ByteString getOutputDatasetBytes();

  /**
   *
   *
   * <pre>
   * Optional. An optional Cloud Storage path to write the query logs (which is
   * then used as an input path on the translation task)
   * </pre>
   *
   * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The querylogsPath.
   */
  java.lang.String getQuerylogsPath();

  /**
   *
   *
   * <pre>
   * Optional. An optional Cloud Storage path to write the query logs (which is
   * then used as an input path on the translation task)
   * </pre>
   *
   * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for querylogsPath.
   */
  com.google.protobuf.ByteString getQuerylogsPathBytes();

  /**
   *
   *
   * <pre>
   * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
   * from which the input data is extracted.
   * </pre>
   *
   * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();

  /**
   *
   *
   * <pre>
   * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
   * from which the input data is extracted.
   * </pre>
   *
   * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();
}
