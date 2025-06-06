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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1beta1;

public interface CreateEntryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entry group this entry is in. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   *
   * Note that this Entry and its child resources may not actually be stored in
   * the location in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The name of the entry group this entry is in. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   *
   * Note that this Entry and its child resources may not actually be stored in
   * the location in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the entry to create.
   * </pre>
   *
   * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entryId.
   */
  java.lang.String getEntryId();

  /**
   *
   *
   * <pre>
   * Required. The id of the entry to create.
   * </pre>
   *
   * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entryId.
   */
  com.google.protobuf.ByteString getEntryIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entry field is set.
   */
  boolean hasEntry();

  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entry.
   */
  com.google.cloud.datacatalog.v1beta1.Entry getEntry();

  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.EntryOrBuilder getEntryOrBuilder();
}
