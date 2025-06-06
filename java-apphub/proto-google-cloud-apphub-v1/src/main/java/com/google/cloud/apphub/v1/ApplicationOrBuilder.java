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
// source: google/cloud/apphub/v1/application.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apphub.v1;

public interface ApplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apphub.v1.Application)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of an Application. Format:
   * `"projects/{host-project-id}/locations/{location}/applications/{application-id}"`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of an Application. Format:
   * `"projects/{host-project-id}/locations/{location}/applications/{application-id}"`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-defined name for the Application.
   * Can have a maximum length of 63 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Optional. User-defined name for the Application.
   * Can have a maximum length of 63 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-defined description of an Application.
   * Can have a maximum length of 2048 characters.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. User-defined description of an Application.
   * Can have a maximum length of 2048 characters.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Consumer provided attributes.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Attributes attributes = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();

  /**
   *
   *
   * <pre>
   * Optional. Consumer provided attributes.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Attributes attributes = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The attributes.
   */
  com.google.cloud.apphub.v1.Attributes getAttributes();

  /**
   *
   *
   * <pre>
   * Optional. Consumer provided attributes.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Attributes attributes = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.AttributesOrBuilder getAttributesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Defines what data can be included into this
   * Application. Limits which Services and Workloads can be registered.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Scope scope = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the scope field is set.
   */
  boolean hasScope();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Defines what data can be included into this
   * Application. Limits which Services and Workloads can be registered.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Scope scope = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The scope.
   */
  com.google.cloud.apphub.v1.Scope getScope();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Defines what data can be included into this
   * Application. Limits which Services and Workloads can be registered.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Scope scope = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.apphub.v1.ScopeOrBuilder getScopeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A universally unique identifier (in UUID4 format) for the
   * `Application`.
   * </pre>
   *
   * <code>
   * string uid = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. A universally unique identifier (in UUID4 format) for the
   * `Application`.
   * </pre>
   *
   * <code>
   * string uid = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Application state.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Application.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Application state.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Application.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.apphub.v1.Application.State getState();
}
