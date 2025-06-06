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
// source: google/devtools/artifactregistry/v1/version.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public interface BatchDeleteVersionsMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.BatchDeleteVersionsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The versions the operation failed to delete.
   * </pre>
   *
   * <code>repeated string failed_versions = 2;</code>
   *
   * @return A list containing the failedVersions.
   */
  java.util.List<java.lang.String> getFailedVersionsList();

  /**
   *
   *
   * <pre>
   * The versions the operation failed to delete.
   * </pre>
   *
   * <code>repeated string failed_versions = 2;</code>
   *
   * @return The count of failedVersions.
   */
  int getFailedVersionsCount();

  /**
   *
   *
   * <pre>
   * The versions the operation failed to delete.
   * </pre>
   *
   * <code>repeated string failed_versions = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The failedVersions at the given index.
   */
  java.lang.String getFailedVersions(int index);

  /**
   *
   *
   * <pre>
   * The versions the operation failed to delete.
   * </pre>
   *
   * <code>repeated string failed_versions = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the failedVersions at the given index.
   */
  com.google.protobuf.ByteString getFailedVersionsBytes(int index);
}
