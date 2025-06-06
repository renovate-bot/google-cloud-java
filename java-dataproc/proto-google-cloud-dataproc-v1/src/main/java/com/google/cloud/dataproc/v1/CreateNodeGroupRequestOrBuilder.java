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
// source: google/cloud/dataproc/v1/node_groups.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface CreateNodeGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.CreateNodeGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this node group will be created.
   * Format: `projects/{project}/regions/{region}/clusters/{cluster}`
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
   * Required. The parent resource where this node group will be created.
   * Format: `projects/{project}/regions/{region}/clusters/{cluster}`
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
   * Required. The node group to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.NodeGroup node_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the nodeGroup field is set.
   */
  boolean hasNodeGroup();

  /**
   *
   *
   * <pre>
   * Required. The node group to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.NodeGroup node_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The nodeGroup.
   */
  com.google.cloud.dataproc.v1.NodeGroup getNodeGroup();

  /**
   *
   *
   * <pre>
   * Required. The node group to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.NodeGroup node_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.NodeGroupOrBuilder getNodeGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional node group ID. Generated if not specified.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of from 3 to 33 characters.
   * </pre>
   *
   * <code>string node_group_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The nodeGroupId.
   */
  java.lang.String getNodeGroupId();

  /**
   *
   *
   * <pre>
   * Optional. An optional node group ID. Generated if not specified.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of from 3 to 33 characters.
   * </pre>
   *
   * <code>string node_group_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for nodeGroupId.
   */
  com.google.protobuf.ByteString getNodeGroupIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the server receives
   * two
   * [CreateNodeGroupRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateNodeGroupRequests)
   * with the same ID, the second request is ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created
   * and stored in the backend is returned.
   *
   * Recommendation: Set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the server receives
   * two
   * [CreateNodeGroupRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateNodeGroupRequests)
   * with the same ID, the second request is ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created
   * and stored in the backend is returned.
   *
   * Recommendation: Set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
