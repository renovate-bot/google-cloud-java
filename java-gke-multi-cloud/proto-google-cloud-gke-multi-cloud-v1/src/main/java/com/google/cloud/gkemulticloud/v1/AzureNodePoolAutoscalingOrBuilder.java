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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

public interface AzureNodePoolAutoscalingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Minimum number of nodes in the node pool. Must be greater than or
   * equal to 1 and less than or equal to max_node_count.
   * </pre>
   *
   * <code>int32 min_node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The minNodeCount.
   */
  int getMinNodeCount();

  /**
   *
   *
   * <pre>
   * Required. Maximum number of nodes in the node pool. Must be greater than or
   * equal to min_node_count and less than or equal to 50.
   * </pre>
   *
   * <code>int32 max_node_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The maxNodeCount.
   */
  int getMaxNodeCount();
}
