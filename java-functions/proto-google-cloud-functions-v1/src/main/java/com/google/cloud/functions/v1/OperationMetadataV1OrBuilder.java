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
// source: google/cloud/functions/v1/operations.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.functions.v1;

public interface OperationMetadataV1OrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.OperationMetadataV1)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Target of the operation - for example
   * `projects/project-1/locations/region-1/functions/function-1`
   * </pre>
   *
   * <code>string target = 1;</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();

  /**
   *
   *
   * <pre>
   * Target of the operation - for example
   * `projects/project-1/locations/region-1/functions/function-1`
   * </pre>
   *
   * <code>string target = 1;</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Type of operation.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.OperationType type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * Type of operation.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.OperationType type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.functions.v1.OperationType getType();

  /**
   *
   *
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request = 3;</code>
   *
   * @return Whether the request field is set.
   */
  boolean hasRequest();

  /**
   *
   *
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request = 3;</code>
   *
   * @return The request.
   */
  com.google.protobuf.Any getRequest();

  /**
   *
   *
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * Version id of the function created or updated by an API call.
   * This field is only populated for Create and Update operations.
   * </pre>
   *
   * <code>int64 version_id = 4;</code>
   *
   * @return The versionId.
   */
  long getVersionId();

  /**
   *
   *
   * <pre>
   * The last update timestamp of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * The last update timestamp of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * The last update timestamp of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud Build ID of the function created or updated by an API call.
   * This field is only populated for Create and Update operations.
   * </pre>
   *
   * <code>string build_id = 6;</code>
   *
   * @return The buildId.
   */
  java.lang.String getBuildId();

  /**
   *
   *
   * <pre>
   * The Cloud Build ID of the function created or updated by an API call.
   * This field is only populated for Create and Update operations.
   * </pre>
   *
   * <code>string build_id = 6;</code>
   *
   * @return The bytes for buildId.
   */
  com.google.protobuf.ByteString getBuildIdBytes();

  /**
   *
   *
   * <pre>
   * An identifier for Firebase function sources. Disclaimer: This field is only
   * supported for Firebase function deployments.
   * </pre>
   *
   * <code>string source_token = 7;</code>
   *
   * @return The sourceToken.
   */
  java.lang.String getSourceToken();

  /**
   *
   *
   * <pre>
   * An identifier for Firebase function sources. Disclaimer: This field is only
   * supported for Firebase function deployments.
   * </pre>
   *
   * <code>string source_token = 7;</code>
   *
   * @return The bytes for sourceToken.
   */
  com.google.protobuf.ByteString getSourceTokenBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Build Name of the function deployment.
   * This field is only populated for Create and Update operations.
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/builds/&lt;build-id&gt;`.
   * </pre>
   *
   * <code>string build_name = 8;</code>
   *
   * @return The buildName.
   */
  java.lang.String getBuildName();

  /**
   *
   *
   * <pre>
   * The Cloud Build Name of the function deployment.
   * This field is only populated for Create and Update operations.
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/builds/&lt;build-id&gt;`.
   * </pre>
   *
   * <code>string build_name = 8;</code>
   *
   * @return The bytes for buildName.
   */
  com.google.protobuf.ByteString getBuildNameBytes();
}
