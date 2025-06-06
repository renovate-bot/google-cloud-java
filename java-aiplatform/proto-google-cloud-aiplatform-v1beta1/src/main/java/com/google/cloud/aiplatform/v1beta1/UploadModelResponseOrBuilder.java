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
// source: google/cloud/aiplatform/v1beta1/model_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface UploadModelResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UploadModelResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the uploaded Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>string model = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The model.
   */
  java.lang.String getModel();

  /**
   *
   *
   * <pre>
   * The name of the uploaded Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>string model = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Output only. The version ID of the model that is uploaded.
   * </pre>
   *
   * <code>string model_version_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The modelVersionId.
   */
  java.lang.String getModelVersionId();

  /**
   *
   *
   * <pre>
   * Output only. The version ID of the model that is uploaded.
   * </pre>
   *
   * <code>string model_version_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for modelVersionId.
   */
  com.google.protobuf.ByteString getModelVersionIdBytes();
}
