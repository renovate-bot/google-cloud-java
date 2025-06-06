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

public interface EntryGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.EntryGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the entry group in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   *
   * Note that this EntryGroup and its child resources may not actually be
   * stored in the location in this name.
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
   * Identifier. The resource name of the entry group in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   *
   * Note that this EntryGroup and its child resources may not actually be
   * stored in the location in this name.
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
   * A short name to identify the entry group, for example,
   * "analytics data - jan 2011". Default value is an empty string.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * A short name to identify the entry group, for example,
   * "analytics data - jan 2011". Default value is an empty string.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Entry group description, which can consist of several sentences or
   * paragraphs that describe entry group contents. Default value is an empty
   * string.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Entry group description, which can consist of several sentences or
   * paragraphs that describe entry group contents. Default value is an empty
   * string.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about this EntryGroup. Default value is empty
   * timestamps.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps data_catalog_timestamps = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataCatalogTimestamps field is set.
   */
  boolean hasDataCatalogTimestamps();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about this EntryGroup. Default value is empty
   * timestamps.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps data_catalog_timestamps = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataCatalogTimestamps.
   */
  com.google.cloud.datacatalog.v1beta1.SystemTimestamps getDataCatalogTimestamps();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about this EntryGroup. Default value is empty
   * timestamps.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps data_catalog_timestamps = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.SystemTimestampsOrBuilder
      getDataCatalogTimestampsOrBuilder();
}
