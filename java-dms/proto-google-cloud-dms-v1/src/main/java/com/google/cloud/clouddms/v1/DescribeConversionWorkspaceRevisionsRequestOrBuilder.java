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

public interface DescribeConversionWorkspaceRevisionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.DescribeConversionWorkspaceRevisionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the conversion workspace resource whose revisions are
   * listed. Must be in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>
   * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The conversionWorkspace.
   */
  java.lang.String getConversionWorkspace();

  /**
   *
   *
   * <pre>
   * Required. Name of the conversion workspace resource whose revisions are
   * listed. Must be in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>
   * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for conversionWorkspace.
   */
  com.google.protobuf.ByteString getConversionWorkspaceBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional filter to request a specific commit ID.
   * </pre>
   *
   * <code>string commit_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The commitId.
   */
  java.lang.String getCommitId();

  /**
   *
   *
   * <pre>
   * Optional. Optional filter to request a specific commit ID.
   * </pre>
   *
   * <code>string commit_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for commitId.
   */
  com.google.protobuf.ByteString getCommitIdBytes();
}
