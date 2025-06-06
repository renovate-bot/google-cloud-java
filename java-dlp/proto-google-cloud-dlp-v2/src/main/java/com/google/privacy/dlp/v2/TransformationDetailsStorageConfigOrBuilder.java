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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface TransformationDetailsStorageConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TransformationDetailsStorageConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The BigQuery table in which to store the output. This may be an existing
   * table or in a new table in an existing dataset.
   * If table_id is not set a new one will be generated for you with the
   * following format:
   * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
   * time zone will be used for generating the date details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return Whether the table field is set.
   */
  boolean hasTable();

  /**
   *
   *
   * <pre>
   * The BigQuery table in which to store the output. This may be an existing
   * table or in a new table in an existing dataset.
   * If table_id is not set a new one will be generated for you with the
   * following format:
   * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
   * time zone will be used for generating the date details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return The table.
   */
  com.google.privacy.dlp.v2.BigQueryTable getTable();

  /**
   *
   *
   * <pre>
   * The BigQuery table in which to store the output. This may be an existing
   * table or in a new table in an existing dataset.
   * If table_id is not set a new one will be generated for you with the
   * following format:
   * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
   * time zone will be used for generating the date details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder();

  com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.TypeCase getTypeCase();
}
