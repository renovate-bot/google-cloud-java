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
// source: google/cloud/dataform/v1/dataform.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataform.v1;

public interface CommitWorkspaceChangesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1.CommitWorkspaceChangesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The commit's author.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1.CommitAuthor author = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the author field is set.
   */
  boolean hasAuthor();

  /**
   *
   *
   * <pre>
   * Required. The commit's author.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1.CommitAuthor author = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The author.
   */
  com.google.cloud.dataform.v1.CommitAuthor getAuthor();

  /**
   *
   *
   * <pre>
   * Required. The commit's author.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1.CommitAuthor author = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataform.v1.CommitAuthorOrBuilder getAuthorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The commit's message.
   * </pre>
   *
   * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The commitMessage.
   */
  java.lang.String getCommitMessage();

  /**
   *
   *
   * <pre>
   * Optional. The commit's message.
   * </pre>
   *
   * <code>string commit_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for commitMessage.
   */
  com.google.protobuf.ByteString getCommitMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Full file paths to commit including filename, rooted at workspace
   * root. If left empty, all files will be committed.
   * </pre>
   *
   * <code>repeated string paths = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the paths.
   */
  java.util.List<java.lang.String> getPathsList();

  /**
   *
   *
   * <pre>
   * Optional. Full file paths to commit including filename, rooted at workspace
   * root. If left empty, all files will be committed.
   * </pre>
   *
   * <code>repeated string paths = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of paths.
   */
  int getPathsCount();

  /**
   *
   *
   * <pre>
   * Optional. Full file paths to commit including filename, rooted at workspace
   * root. If left empty, all files will be committed.
   * </pre>
   *
   * <code>repeated string paths = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  java.lang.String getPaths(int index);

  /**
   *
   *
   * <pre>
   * Optional. Full file paths to commit including filename, rooted at workspace
   * root. If left empty, all files will be committed.
   * </pre>
   *
   * <code>repeated string paths = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the paths at the given index.
   */
  com.google.protobuf.ByteString getPathsBytes(int index);
}
