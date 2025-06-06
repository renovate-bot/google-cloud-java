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
// source: google/cloud/orchestration/airflow/service/v1/operations.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The current operation state.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.OperationMetadata.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current operation state.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.OperationMetadata.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.orchestration.airflow.service.v1.OperationMetadata.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The type of operation being performed.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.OperationMetadata.Type operation_type = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for operationType.
   */
  int getOperationTypeValue();

  /**
   *
   *
   * <pre>
   * Output only. The type of operation being performed.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.OperationMetadata.Type operation_type = 2;
   * </code>
   *
   * @return The operationType.
   */
  com.google.cloud.orchestration.airflow.service.v1.OperationMetadata.Type getOperationType();

  /**
   *
   *
   * <pre>
   * Output only. The resource being operated on, as a [relative resource name](
   * /apis/design/resource_names#relative_resource_name).
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();

  /**
   *
   *
   * <pre>
   * Output only. The resource being operated on, as a [relative resource name](
   * /apis/design/resource_names#relative_resource_name).
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Output only. The UUID of the resource being operated on.
   * </pre>
   *
   * <code>string resource_uuid = 4;</code>
   *
   * @return The resourceUuid.
   */
  java.lang.String getResourceUuid();

  /**
   *
   *
   * <pre>
   * Output only. The UUID of the resource being operated on.
   * </pre>
   *
   * <code>string resource_uuid = 4;</code>
   *
   * @return The bytes for resourceUuid.
   */
  com.google.protobuf.ByteString getResourceUuidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the operation terminated, regardless of its
   * success. This field is unset if the operation is still ongoing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the operation terminated, regardless of its
   * success. This field is unset if the operation is still ongoing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the operation terminated, regardless of its
   * success. This field is unset if the operation is still ongoing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
