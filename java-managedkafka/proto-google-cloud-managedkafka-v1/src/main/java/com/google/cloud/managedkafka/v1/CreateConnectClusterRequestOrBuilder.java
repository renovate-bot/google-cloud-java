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
// source: google/cloud/managedkafka/v1/managed_kafka_connect.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.managedkafka.v1;

public interface CreateConnectClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedkafka.v1.CreateConnectClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent project/location in which to create the Kafka Connect
   * cluster. Structured like
   * `projects/{project}/locations/{location}/`.
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
   * Required. The parent project/location in which to create the Kafka Connect
   * cluster. Structured like
   * `projects/{project}/locations/{location}/`.
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
   * Required. The ID to use for the Connect cluster, which will become the
   * final component of the cluster's name. The ID must be 1-63 characters long,
   * and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` to comply
   * with RFC 1035.
   *
   * This value is structured like: `my-cluster-id`.
   * </pre>
   *
   * <code>string connect_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The connectClusterId.
   */
  java.lang.String getConnectClusterId();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the Connect cluster, which will become the
   * final component of the cluster's name. The ID must be 1-63 characters long,
   * and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` to comply
   * with RFC 1035.
   *
   * This value is structured like: `my-cluster-id`.
   * </pre>
   *
   * <code>string connect_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for connectClusterId.
   */
  com.google.protobuf.ByteString getConnectClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Configuration of the Kafka Connect cluster to create. Its `name`
   * field is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.managedkafka.v1.ConnectCluster connect_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connectCluster field is set.
   */
  boolean hasConnectCluster();

  /**
   *
   *
   * <pre>
   * Required. Configuration of the Kafka Connect cluster to create. Its `name`
   * field is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.managedkafka.v1.ConnectCluster connect_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connectCluster.
   */
  com.google.cloud.managedkafka.v1.ConnectCluster getConnectCluster();

  /**
   *
   *
   * <pre>
   * Required. Configuration of the Kafka Connect cluster to create. Its `name`
   * field is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.managedkafka.v1.ConnectCluster connect_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.managedkafka.v1.ConnectClusterOrBuilder getConnectClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID to avoid duplication of requests. If a request times out or
   * fails, retrying with the same ID allows the server to recognize the
   * previous attempt. For at least 60 minutes, the server ignores duplicate
   * requests bearing the same ID.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID
   * within 60 minutes of the last request, the server checks if an original
   * operation with the same request ID was received. If so, the server ignores
   * the second request.
   *
   * The request ID must be a valid UUID. A zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID to avoid duplication of requests. If a request times out or
   * fails, retrying with the same ID allows the server to recognize the
   * previous attempt. For at least 60 minutes, the server ignores duplicate
   * requests bearing the same ID.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID
   * within 60 minutes of the last request, the server checks if an original
   * operation with the same request ID was received. If so, the server ignores
   * the second request.
   *
   * The request ID must be a valid UUID. A zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
