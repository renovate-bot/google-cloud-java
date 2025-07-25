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
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securesourcemanager.v1;

public interface CreateIssueCommentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securesourcemanager.v1.CreateIssueCommentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The issue in which to create the issue comment. Format:
   * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}/issues/{issue_id}`
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
   * Required. The issue in which to create the issue comment. Format:
   * `projects/{project_number}/locations/{location_id}/repositories/{repository_id}/issues/{issue_id}`
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
   * Required. The issue comment to create.
   * </pre>
   *
   * <code>
   * .google.cloud.securesourcemanager.v1.IssueComment issue_comment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the issueComment field is set.
   */
  boolean hasIssueComment();

  /**
   *
   *
   * <pre>
   * Required. The issue comment to create.
   * </pre>
   *
   * <code>
   * .google.cloud.securesourcemanager.v1.IssueComment issue_comment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The issueComment.
   */
  com.google.cloud.securesourcemanager.v1.IssueComment getIssueComment();

  /**
   *
   *
   * <pre>
   * Required. The issue comment to create.
   * </pre>
   *
   * <code>
   * .google.cloud.securesourcemanager.v1.IssueComment issue_comment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securesourcemanager.v1.IssueCommentOrBuilder getIssueCommentOrBuilder();
}
