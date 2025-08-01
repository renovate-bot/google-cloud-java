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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1;

public interface SetNodePoolAutoscalingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetNodePoolAutoscalingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3842
   * @return The projectId.
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();

  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.project_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3842
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available)
   * in which the cluster resides. This field has been deprecated and replaced
   * by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3848
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available)
   * in which the cluster resides. This field has been deprecated and replaced
   * by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.zone is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3848
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3852
   * @return The clusterId.
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.cluster_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3852
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.node_pool_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3856
   * @return The nodePoolId.
   */
  @java.lang.Deprecated
  java.lang.String getNodePoolId();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.SetNodePoolAutoscalingRequest.node_pool_id is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3856
   * @return The bytes for nodePoolId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNodePoolIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>
   * .google.container.v1.NodePoolAutoscaling autoscaling = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the autoscaling field is set.
   */
  boolean hasAutoscaling();

  /**
   *
   *
   * <pre>
   * Required. Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>
   * .google.container.v1.NodePoolAutoscaling autoscaling = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The autoscaling.
   */
  com.google.container.v1.NodePoolAutoscaling getAutoscaling();

  /**
   *
   *
   * <pre>
   * Required. Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>
   * .google.container.v1.NodePoolAutoscaling autoscaling = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.container.v1.NodePoolAutoscalingOrBuilder getAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to set
   * autoscaler settings. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to set
   * autoscaler settings. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
