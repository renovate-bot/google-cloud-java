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

public interface NodeGroupNodeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroupNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> getAcceleratorsList();

  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code>
   */
  com.google.cloud.compute.v1.AcceleratorConfig getAccelerators(int index);

  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code>
   */
  int getAcceleratorsCount();

  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
      getAcceleratorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Accelerators for this node.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code>
   */
  com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Node resources that are reserved by all instances.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumed_resources = 334527118;
   * </code>
   *
   * @return Whether the consumedResources field is set.
   */
  boolean hasConsumedResources();

  /**
   *
   *
   * <pre>
   * Node resources that are reserved by all instances.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumed_resources = 334527118;
   * </code>
   *
   * @return The consumedResources.
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfo getConsumedResources();

  /**
   *
   *
   * <pre>
   * Node resources that are reserved by all instances.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumed_resources = 334527118;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder getConsumedResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * Check the CpuOvercommitType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cpu_overcommit_type = 247727959;</code>
   *
   * @return Whether the cpuOvercommitType field is set.
   */
  boolean hasCpuOvercommitType();

  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * Check the CpuOvercommitType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cpu_overcommit_type = 247727959;</code>
   *
   * @return The cpuOvercommitType.
   */
  java.lang.String getCpuOvercommitType();

  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * Check the CpuOvercommitType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cpu_overcommit_type = 247727959;</code>
   *
   * @return The bytes for cpuOvercommitType.
   */
  com.google.protobuf.ByteString getCpuOvercommitTypeBytes();

  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  java.util.List<com.google.cloud.compute.v1.LocalDisk> getDisksList();

  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.LocalDisk getDisks(int index);

  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  int getDisksCount();

  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.LocalDiskOrBuilder> getDisksOrBuilderList();

  /**
   *
   *
   * <pre>
   * Local disk configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.LocalDiskOrBuilder getDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Instance data that shows consumed resources on the node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceConsumptionData instance_consumption_data = 84715576;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InstanceConsumptionData>
      getInstanceConsumptionDataList();

  /**
   *
   *
   * <pre>
   * Instance data that shows consumed resources on the node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceConsumptionData instance_consumption_data = 84715576;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceConsumptionData getInstanceConsumptionData(int index);

  /**
   *
   *
   * <pre>
   * Instance data that shows consumed resources on the node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceConsumptionData instance_consumption_data = 84715576;
   * </code>
   */
  int getInstanceConsumptionDataCount();

  /**
   *
   *
   * <pre>
   * Instance data that shows consumed resources on the node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceConsumptionData instance_consumption_data = 84715576;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InstanceConsumptionDataOrBuilder>
      getInstanceConsumptionDataOrBuilderList();

  /**
   *
   *
   * <pre>
   * Instance data that shows consumed resources on the node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceConsumptionData instance_consumption_data = 84715576;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceConsumptionDataOrBuilder getInstanceConsumptionDataOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return A list containing the instances.
   */
  java.util.List<java.lang.String> getInstancesList();

  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return The count of instances.
   */
  int getInstancesCount();

  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  java.lang.String getInstances(int index);

  /**
   *
   *
   * <pre>
   * Instances scheduled on this node.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  com.google.protobuf.ByteString getInstancesBytes(int index);

  /**
   *
   *
   * <pre>
   * The name of the node.
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
   * The name of the node.
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
   * The name of the node.
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
   * The type of this node.
   * </pre>
   *
   * <code>optional string node_type = 465832791;</code>
   *
   * @return Whether the nodeType field is set.
   */
  boolean hasNodeType();

  /**
   *
   *
   * <pre>
   * The type of this node.
   * </pre>
   *
   * <code>optional string node_type = 465832791;</code>
   *
   * @return The nodeType.
   */
  java.lang.String getNodeType();

  /**
   *
   *
   * <pre>
   * The type of this node.
   * </pre>
   *
   * <code>optional string node_type = 465832791;</code>
   *
   * @return The bytes for nodeType.
   */
  com.google.protobuf.ByteString getNodeTypeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   *
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Binding properties for the physical server.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   *
   * @return Whether the serverBinding field is set.
   */
  boolean hasServerBinding();

  /**
   *
   *
   * <pre>
   * Binding properties for the physical server.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   *
   * @return The serverBinding.
   */
  com.google.cloud.compute.v1.ServerBinding getServerBinding();

  /**
   *
   *
   * <pre>
   * Binding properties for the physical server.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   */
  com.google.cloud.compute.v1.ServerBindingOrBuilder getServerBindingOrBuilder();

  /**
   *
   *
   * <pre>
   * Server ID associated with this node.
   * </pre>
   *
   * <code>optional string server_id = 339433367;</code>
   *
   * @return Whether the serverId field is set.
   */
  boolean hasServerId();

  /**
   *
   *
   * <pre>
   * Server ID associated with this node.
   * </pre>
   *
   * <code>optional string server_id = 339433367;</code>
   *
   * @return The serverId.
   */
  java.lang.String getServerId();

  /**
   *
   *
   * <pre>
   * Server ID associated with this node.
   * </pre>
   *
   * <code>optional string server_id = 339433367;</code>
   *
   * @return The bytes for serverId.
   */
  com.google.protobuf.ByteString getServerIdBytes();

  /**
   *
   *
   * <pre>
   *
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();

  /**
   *
   *
   * <pre>
   *
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();

  /**
   *
   *
   * <pre>
   *
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();

  /**
   *
   *
   * <pre>
   * Total amount of available resources on the node.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo total_resources = 97406698;
   * </code>
   *
   * @return Whether the totalResources field is set.
   */
  boolean hasTotalResources();

  /**
   *
   *
   * <pre>
   * Total amount of available resources on the node.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo total_resources = 97406698;
   * </code>
   *
   * @return The totalResources.
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfo getTotalResources();

  /**
   *
   *
   * <pre>
   * Total amount of available resources on the node.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo total_resources = 97406698;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder getTotalResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The information about an upcoming maintenance event.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UpcomingMaintenance upcoming_maintenance = 227348592;
   * </code>
   *
   * @return Whether the upcomingMaintenance field is set.
   */
  boolean hasUpcomingMaintenance();

  /**
   *
   *
   * <pre>
   * [Output Only] The information about an upcoming maintenance event.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UpcomingMaintenance upcoming_maintenance = 227348592;
   * </code>
   *
   * @return The upcomingMaintenance.
   */
  com.google.cloud.compute.v1.UpcomingMaintenance getUpcomingMaintenance();

  /**
   *
   *
   * <pre>
   * [Output Only] The information about an upcoming maintenance event.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UpcomingMaintenance upcoming_maintenance = 227348592;
   * </code>
   */
  com.google.cloud.compute.v1.UpcomingMaintenanceOrBuilder getUpcomingMaintenanceOrBuilder();
}
