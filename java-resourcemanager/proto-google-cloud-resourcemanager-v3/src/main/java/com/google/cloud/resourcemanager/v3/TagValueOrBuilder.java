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
// source: google/cloud/resourcemanager/v3/tag_values.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.resourcemanager.v3;

public interface TagValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.TagValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Resource name for TagValue in the format `tagValues/456`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Immutable. Resource name for TagValue in the format `tagValues/456`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the new TagValue's parent TagKey.
   * Must be of the form `tagKeys/{tag_key_id}`.
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the new TagValue's parent TagKey.
   * Must be of the form `tagKeys/{tag_key_id}`.
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. User-assigned short name for TagValue. The short name
   * should be unique for TagValues within the same parent TagKey.
   *
   * The short name must be 63 characters or less, beginning and ending with
   * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_),
   * dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>
   * string short_name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The shortName.
   */
  java.lang.String getShortName();

  /**
   *
   *
   * <pre>
   * Required. Immutable. User-assigned short name for TagValue. The short name
   * should be unique for TagValues within the same parent TagKey.
   *
   * The short name must be 63 characters or less, beginning and ending with
   * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_),
   * dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>
   * string short_name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for shortName.
   */
  com.google.protobuf.ByteString getShortNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The namespaced name of the TagValue. Can be in the form
   * `{organization_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_number}/{tag_key_short_name}/{tag_value_short_name}`.
   * </pre>
   *
   * <code>string namespaced_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The namespacedName.
   */
  java.lang.String getNamespacedName();

  /**
   *
   *
   * <pre>
   * Output only. The namespaced name of the TagValue. Can be in the form
   * `{organization_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_number}/{tag_key_short_name}/{tag_value_short_name}`.
   * </pre>
   *
   * <code>string namespaced_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for namespacedName.
   */
  com.google.protobuf.ByteString getNamespacedNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-assigned description of the TagValue.
   * Must not exceed 256 characters.
   *
   * Read-write.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. User-assigned description of the TagValue.
   * Must not exceed 256 characters.
   *
   * Read-write.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Entity tag which users can pass to prevent race conditions. This
   * field is always set in server responses. See UpdateTagValueRequest for
   * details.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. Entity tag which users can pass to prevent race conditions. This
   * field is always set in server responses. See UpdateTagValueRequest for
   * details.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
