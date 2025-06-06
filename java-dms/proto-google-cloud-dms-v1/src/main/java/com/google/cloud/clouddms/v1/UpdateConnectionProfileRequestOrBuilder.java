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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

public interface UpdateConnectionProfileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.UpdateConnectionProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten by the
   * update in the conversion workspace resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten by the
   * update in the conversion workspace resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten by the
   * update in the conversion workspace resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The connection profile parameters to update.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConnectionProfile connection_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connectionProfile field is set.
   */
  boolean hasConnectionProfile();

  /**
   *
   *
   * <pre>
   * Required. The connection profile parameters to update.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConnectionProfile connection_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connectionProfile.
   */
  com.google.cloud.clouddms.v1.ConnectionProfile getConnectionProfile();

  /**
   *
   *
   * <pre>
   * Required. The connection profile parameters to update.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ConnectionProfile connection_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.clouddms.v1.ConnectionProfileOrBuilder getConnectionProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the server receives
   * two requests with the same ID, then the second request is ignored.
   *
   * It is recommended to always set this value to a UUID.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the server receives
   * two requests with the same ID, then the second request is ignored.
   *
   * It is recommended to always set this value to a UUID.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Only validate the connection profile, but don't update any
   * resources. The default is false. Only supported for Oracle connection
   * profiles.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Optional. Update the connection profile without validating it.
   * The default is false.
   * Only supported for Oracle connection profiles.
   * </pre>
   *
   * <code>bool skip_validation = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The skipValidation.
   */
  boolean getSkipValidation();
}
