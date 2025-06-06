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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmwareengine.v1;

public interface NodeTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.NodeType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of this node type.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-proj/locations/us-central1-a/nodeTypes/standard-72`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of this node type.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-proj/locations/us-central1-a/nodeTypes/standard-72`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The canonical identifier of the node type
   * (corresponds to the `NodeType`). For example: standard-72.
   * </pre>
   *
   * <code>string node_type_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nodeTypeId.
   */
  java.lang.String getNodeTypeId();

  /**
   *
   *
   * <pre>
   * Output only. The canonical identifier of the node type
   * (corresponds to the `NodeType`). For example: standard-72.
   * </pre>
   *
   * <code>string node_type_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nodeTypeId.
   */
  com.google.protobuf.ByteString getNodeTypeIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The friendly name for this node type.
   * For example: ve1-standard-72
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Output only. The friendly name for this node type.
   * For example: ve1-standard-72
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The total number of virtual CPUs in a single node.
   * </pre>
   *
   * <code>int32 virtual_cpu_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The virtualCpuCount.
   */
  int getVirtualCpuCount();

  /**
   *
   *
   * <pre>
   * Output only. The total number of CPU cores in a single node.
   * </pre>
   *
   * <code>int32 total_core_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The totalCoreCount.
   */
  int getTotalCoreCount();

  /**
   *
   *
   * <pre>
   * Output only. The amount of physical memory available, defined in GB.
   * </pre>
   *
   * <code>int32 memory_gb = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The memoryGb.
   */
  int getMemoryGb();

  /**
   *
   *
   * <pre>
   * Output only. The amount of storage available, defined in GB.
   * </pre>
   *
   * <code>int32 disk_size_gb = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The diskSizeGb.
   */
  int getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Output only. List of possible values of custom core count.
   * </pre>
   *
   * <code>
   * repeated int32 available_custom_core_counts = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the availableCustomCoreCounts.
   */
  java.util.List<java.lang.Integer> getAvailableCustomCoreCountsList();

  /**
   *
   *
   * <pre>
   * Output only. List of possible values of custom core count.
   * </pre>
   *
   * <code>
   * repeated int32 available_custom_core_counts = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of availableCustomCoreCounts.
   */
  int getAvailableCustomCoreCountsCount();

  /**
   *
   *
   * <pre>
   * Output only. List of possible values of custom core count.
   * </pre>
   *
   * <code>
   * repeated int32 available_custom_core_counts = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The availableCustomCoreCounts at the given index.
   */
  int getAvailableCustomCoreCounts(int index);

  /**
   *
   *
   * <pre>
   * Output only. The type of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.NodeType.Kind kind = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();

  /**
   *
   *
   * <pre>
   * Output only. The type of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.NodeType.Kind kind = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The kind.
   */
  com.google.cloud.vmwareengine.v1.NodeType.Kind getKind();

  /**
   *
   *
   * <pre>
   * Output only. Families of the node type.
   * For node types to be in the same cluster
   * they must share at least one element in the `families`.
   * </pre>
   *
   * <code>repeated string families = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the families.
   */
  java.util.List<java.lang.String> getFamiliesList();

  /**
   *
   *
   * <pre>
   * Output only. Families of the node type.
   * For node types to be in the same cluster
   * they must share at least one element in the `families`.
   * </pre>
   *
   * <code>repeated string families = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of families.
   */
  int getFamiliesCount();

  /**
   *
   *
   * <pre>
   * Output only. Families of the node type.
   * For node types to be in the same cluster
   * they must share at least one element in the `families`.
   * </pre>
   *
   * <code>repeated string families = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The families at the given index.
   */
  java.lang.String getFamilies(int index);

  /**
   *
   *
   * <pre>
   * Output only. Families of the node type.
   * For node types to be in the same cluster
   * they must share at least one element in the `families`.
   * </pre>
   *
   * <code>repeated string families = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the families at the given index.
   */
  com.google.protobuf.ByteString getFamiliesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this node type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.NodeType.Capability capabilities = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the capabilities.
   */
  java.util.List<com.google.cloud.vmwareengine.v1.NodeType.Capability> getCapabilitiesList();

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this node type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.NodeType.Capability capabilities = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of capabilities.
   */
  int getCapabilitiesCount();

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this node type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.NodeType.Capability capabilities = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The capabilities at the given index.
   */
  com.google.cloud.vmwareengine.v1.NodeType.Capability getCapabilities(int index);

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this node type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.NodeType.Capability capabilities = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for capabilities.
   */
  java.util.List<java.lang.Integer> getCapabilitiesValueList();

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this node type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.NodeType.Capability capabilities = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capabilities at the given index.
   */
  int getCapabilitiesValue(int index);
}
