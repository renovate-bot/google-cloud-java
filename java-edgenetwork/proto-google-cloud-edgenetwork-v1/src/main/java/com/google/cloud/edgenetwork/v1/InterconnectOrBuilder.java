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
// source: google/cloud/edgenetwork/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.edgenetwork.v1;

public interface InterconnectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgenetwork.v1.Interconnect)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The canonical resource name of the interconnect.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The canonical resource name of the interconnect.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the subnet was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the subnet was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the subnet was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the subnet was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the subnet was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the subnet was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Type of interconnect, which takes only the value 'DEDICATED' for
   * now.
   * </pre>
   *
   * <code>
   * .google.cloud.edgenetwork.v1.Interconnect.InterconnectType interconnect_type = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for interconnectType.
   */
  int getInterconnectTypeValue();

  /**
   *
   *
   * <pre>
   * Optional. Type of interconnect, which takes only the value 'DEDICATED' for
   * now.
   * </pre>
   *
   * <code>
   * .google.cloud.edgenetwork.v1.Interconnect.InterconnectType interconnect_type = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The interconnectType.
   */
  com.google.cloud.edgenetwork.v1.Interconnect.InterconnectType getInterconnectType();

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier for the link.
   * </pre>
   *
   * <code>string uuid = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uuid.
   */
  java.lang.String getUuid();

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier for the link.
   * </pre>
   *
   * <code>string uuid = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString getUuidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Cloud resource name of the switch device.
   * </pre>
   *
   * <code>string device_cloud_resource_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deviceCloudResourceName.
   */
  java.lang.String getDeviceCloudResourceName();

  /**
   *
   *
   * <pre>
   * Output only. Cloud resource name of the switch device.
   * </pre>
   *
   * <code>string device_cloud_resource_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for deviceCloudResourceName.
   */
  com.google.protobuf.ByteString getDeviceCloudResourceNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Physical ports (e.g., TenGigE0/0/0/1) that form the
   * interconnect.
   * </pre>
   *
   * <code>repeated string physical_ports = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the physicalPorts.
   */
  java.util.List<java.lang.String> getPhysicalPortsList();

  /**
   *
   *
   * <pre>
   * Output only. Physical ports (e.g., TenGigE0/0/0/1) that form the
   * interconnect.
   * </pre>
   *
   * <code>repeated string physical_ports = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of physicalPorts.
   */
  int getPhysicalPortsCount();

  /**
   *
   *
   * <pre>
   * Output only. Physical ports (e.g., TenGigE0/0/0/1) that form the
   * interconnect.
   * </pre>
   *
   * <code>repeated string physical_ports = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The physicalPorts at the given index.
   */
  java.lang.String getPhysicalPorts(int index);

  /**
   *
   *
   * <pre>
   * Output only. Physical ports (e.g., TenGigE0/0/0/1) that form the
   * interconnect.
   * </pre>
   *
   * <code>repeated string physical_ports = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the physicalPorts at the given index.
   */
  com.google.protobuf.ByteString getPhysicalPortsBytes(int index);
}
