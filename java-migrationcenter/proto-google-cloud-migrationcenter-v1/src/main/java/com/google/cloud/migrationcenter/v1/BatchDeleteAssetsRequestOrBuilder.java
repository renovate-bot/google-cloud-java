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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface BatchDeleteAssetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.BatchDeleteAssetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent value for batch asset delete.
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
   * Required. Parent value for batch asset delete.
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
   * Required. The IDs of the assets to delete.
   * A maximum of 1000 assets can be deleted in a batch.
   * Format: projects/{project}/locations/{location}/assets/{name}.
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the names.
   */
  java.util.List<java.lang.String> getNamesList();

  /**
   *
   *
   * <pre>
   * Required. The IDs of the assets to delete.
   * A maximum of 1000 assets can be deleted in a batch.
   * Format: projects/{project}/locations/{location}/assets/{name}.
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of names.
   */
  int getNamesCount();

  /**
   *
   *
   * <pre>
   * Required. The IDs of the assets to delete.
   * A maximum of 1000 assets can be deleted in a batch.
   * Format: projects/{project}/locations/{location}/assets/{name}.
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);

  /**
   *
   *
   * <pre>
   * Required. The IDs of the assets to delete.
   * A maximum of 1000 assets can be deleted in a batch.
   * Format: projects/{project}/locations/{location}/assets/{name}.
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString getNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. When this value is set to `true` the request is a no-op for
   * non-existing assets. See https://google.aip.dev/135#delete-if-existing for
   * additional details. Default value is `false`.
   * </pre>
   *
   * <code>bool allow_missing = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
