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
// source: google/cloud/aiplatform/v1/io.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface GoogleDriveSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.GoogleDriveSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Google Drive resource IDs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.GoogleDriveSource.ResourceId resource_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.GoogleDriveSource.ResourceId> getResourceIdsList();

  /**
   *
   *
   * <pre>
   * Required. Google Drive resource IDs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.GoogleDriveSource.ResourceId resource_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.GoogleDriveSource.ResourceId getResourceIds(int index);

  /**
   *
   *
   * <pre>
   * Required. Google Drive resource IDs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.GoogleDriveSource.ResourceId resource_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getResourceIdsCount();

  /**
   *
   *
   * <pre>
   * Required. Google Drive resource IDs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.GoogleDriveSource.ResourceId resource_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.GoogleDriveSource.ResourceIdOrBuilder>
      getResourceIdsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Google Drive resource IDs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.GoogleDriveSource.ResourceId resource_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.GoogleDriveSource.ResourceIdOrBuilder getResourceIdsOrBuilder(
      int index);
}
