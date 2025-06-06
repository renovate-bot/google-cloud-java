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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface StorageConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.StorageConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the Cloud Storage bucket used by the environment. No
   * `gs://` prefix.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();

  /**
   *
   *
   * <pre>
   * Optional. The name of the Cloud Storage bucket used by the environment. No
   * `gs://` prefix.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();
}
