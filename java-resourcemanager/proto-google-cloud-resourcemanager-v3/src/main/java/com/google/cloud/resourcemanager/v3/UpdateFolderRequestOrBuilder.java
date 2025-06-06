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
// source: google/cloud/resourcemanager/v3/folders.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.resourcemanager.v3;

public interface UpdateFolderRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.UpdateFolderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The new definition of the Folder. It must include the `name`
   * field, which cannot be changed.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the folder field is set.
   */
  boolean hasFolder();

  /**
   *
   *
   * <pre>
   * Required. The new definition of the Folder. It must include the `name`
   * field, which cannot be changed.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The folder.
   */
  com.google.cloud.resourcemanager.v3.Folder getFolder();

  /**
   *
   *
   * <pre>
   * Required. The new definition of the Folder. It must include the `name`
   * field, which cannot be changed.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.resourcemanager.v3.FolderOrBuilder getFolderOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Fields to be updated.
   * Only the `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Fields to be updated.
   * Only the `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Fields to be updated.
   * Only the `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
