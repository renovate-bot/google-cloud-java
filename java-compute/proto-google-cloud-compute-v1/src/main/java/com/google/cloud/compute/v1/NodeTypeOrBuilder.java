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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface NodeTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The CPU platform used by this node type.
   * </pre>
   *
   * <code>optional string cpu_platform = 410285354;</code>
   *
   * @return Whether the cpuPlatform field is set.
   */
  boolean hasCpuPlatform();

  /**
   *
   *
   * <pre>
   * [Output Only] The CPU platform used by this node type.
   * </pre>
   *
   * <code>optional string cpu_platform = 410285354;</code>
   *
   * @return The cpuPlatform.
   */
  java.lang.String getCpuPlatform();

  /**
   *
   *
   * <pre>
   * [Output Only] The CPU platform used by this node type.
   * </pre>
   *
   * <code>optional string cpu_platform = 410285354;</code>
   *
   * @return The bytes for cpuPlatform.
   */
  com.google.protobuf.ByteString getCpuPlatformBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The deprecation status associated with this node type.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   *
   * @return Whether the deprecated field is set.
   */
  boolean hasDeprecated();

  /**
   *
   *
   * <pre>
   * [Output Only] The deprecation status associated with this node type.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   *
   * @return The deprecated.
   */
  com.google.cloud.compute.v1.DeprecationStatus getDeprecated();

  /**
   *
   *
   * <pre>
   * [Output Only] The deprecation status associated with this node type.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   */
  com.google.cloud.compute.v1.DeprecationStatusOrBuilder getDeprecatedOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The number of virtual CPUs that are available to the node type.
   * </pre>
   *
   * <code>optional int32 guest_cpus = 393356754;</code>
   *
   * @return Whether the guestCpus field is set.
   */
  boolean hasGuestCpus();

  /**
   *
   *
   * <pre>
   * [Output Only] The number of virtual CPUs that are available to the node type.
   * </pre>
   *
   * <code>optional int32 guest_cpus = 393356754;</code>
   *
   * @return The guestCpus.
   */
  int getGuestCpus();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#nodeType for node types.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#nodeType for node types.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#nodeType for node types.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Local SSD available to the node type, defined in GB.
   * </pre>
   *
   * <code>optional int32 local_ssd_gb = 329237578;</code>
   *
   * @return Whether the localSsdGb field is set.
   */
  boolean hasLocalSsdGb();

  /**
   *
   *
   * <pre>
   * [Output Only] Local SSD available to the node type, defined in GB.
   * </pre>
   *
   * <code>optional int32 local_ssd_gb = 329237578;</code>
   *
   * @return The localSsdGb.
   */
  int getLocalSsdGb();

  /**
   *
   *
   * <pre>
   * [Output Only] Maximum number of VMs that can be created for this node type.
   * </pre>
   *
   * <code>optional int32 max_vms = 307579713;</code>
   *
   * @return Whether the maxVms field is set.
   */
  boolean hasMaxVms();

  /**
   *
   *
   * <pre>
   * [Output Only] Maximum number of VMs that can be created for this node type.
   * </pre>
   *
   * <code>optional int32 max_vms = 307579713;</code>
   *
   * @return The maxVms.
   */
  int getMaxVms();

  /**
   *
   *
   * <pre>
   * [Output Only] The amount of physical memory available to the node type, defined in MB.
   * </pre>
   *
   * <code>optional int32 memory_mb = 116001171;</code>
   *
   * @return Whether the memoryMb field is set.
   */
  boolean hasMemoryMb();

  /**
   *
   *
   * <pre>
   * [Output Only] The amount of physical memory available to the node type, defined in MB.
   * </pre>
   *
   * <code>optional int32 memory_mb = 116001171;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * [Output Only] Name of the resource.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();

  /**
   *
   *
   * <pre>
   * [Output Only] Name of the resource.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * [Output Only] Name of the resource.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the node type resides, such as us-central1-a.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the node type resides, such as us-central1-a.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the node type resides, such as us-central1-a.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
