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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface MetastoreConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.MetastoreConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of an existing Dataproc Metastore service.
   *
   * Example:
   *
   * * `projects/[project_id]/locations/[dataproc_region]/services/[service-name]`
   * </pre>
   *
   * <code>
   * string dataproc_metastore_service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataprocMetastoreService.
   */
  java.lang.String getDataprocMetastoreService();

  /**
   *
   *
   * <pre>
   * Required. Resource name of an existing Dataproc Metastore service.
   *
   * Example:
   *
   * * `projects/[project_id]/locations/[dataproc_region]/services/[service-name]`
   * </pre>
   *
   * <code>
   * string dataproc_metastore_service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataprocMetastoreService.
   */
  com.google.protobuf.ByteString getDataprocMetastoreServiceBytes();
}
