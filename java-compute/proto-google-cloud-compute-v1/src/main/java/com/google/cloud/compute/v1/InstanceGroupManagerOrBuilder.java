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

public interface InstanceGroupManagerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManager)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies configuration that overrides the instance template configuration for the group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig all_instances_config = 112596737;
   * </code>
   *
   * @return Whether the allInstancesConfig field is set.
   */
  boolean hasAllInstancesConfig();

  /**
   *
   *
   * <pre>
   * Specifies configuration that overrides the instance template configuration for the group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig all_instances_config = 112596737;
   * </code>
   *
   * @return The allInstancesConfig.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig getAllInstancesConfig();

  /**
   *
   *
   * <pre>
   * Specifies configuration that overrides the instance template configuration for the group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig all_instances_config = 112596737;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfigOrBuilder
      getAllInstancesConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The autohealing policy for this managed instance group. You can specify only one value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy auto_healing_policies = 456799109;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy>
      getAutoHealingPoliciesList();

  /**
   *
   *
   * <pre>
   * The autohealing policy for this managed instance group. You can specify only one value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy auto_healing_policies = 456799109;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy getAutoHealingPolicies(
      int index);

  /**
   *
   *
   * <pre>
   * The autohealing policy for this managed instance group. You can specify only one value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy auto_healing_policies = 456799109;
   * </code>
   */
  int getAutoHealingPoliciesCount();

  /**
   *
   *
   * <pre>
   * The autohealing policy for this managed instance group. You can specify only one value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy auto_healing_policies = 456799109;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicyOrBuilder>
      getAutoHealingPoliciesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The autohealing policy for this managed instance group. You can specify only one value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy auto_healing_policies = 456799109;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicyOrBuilder
      getAutoHealingPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The base instance name is a prefix that you want to attach to the names of all VMs in a MIG. The maximum character length is 58 and the name must comply with RFC1035 format. When a VM is created in the group, the MIG appends a hyphen and a random four-character string to the base instance name. If you want the MIG to assign sequential numbers instead of a random string, then end the base instance name with a hyphen followed by one or more hash symbols. The hash symbols indicate the number of digits. For example, a base instance name of "vm-###" results in "vm-001" as a VM name. &#64;pattern [a-z](([-a-z0-9]{0,57})|([-a-z0-9]{0,51}-#{1,10}(&#92;&#92;[[0-9]{1,10}&#92;&#92;])?))
   * </pre>
   *
   * <code>optional string base_instance_name = 389106439;</code>
   *
   * @return Whether the baseInstanceName field is set.
   */
  boolean hasBaseInstanceName();

  /**
   *
   *
   * <pre>
   * The base instance name is a prefix that you want to attach to the names of all VMs in a MIG. The maximum character length is 58 and the name must comply with RFC1035 format. When a VM is created in the group, the MIG appends a hyphen and a random four-character string to the base instance name. If you want the MIG to assign sequential numbers instead of a random string, then end the base instance name with a hyphen followed by one or more hash symbols. The hash symbols indicate the number of digits. For example, a base instance name of "vm-###" results in "vm-001" as a VM name. &#64;pattern [a-z](([-a-z0-9]{0,57})|([-a-z0-9]{0,51}-#{1,10}(&#92;&#92;[[0-9]{1,10}&#92;&#92;])?))
   * </pre>
   *
   * <code>optional string base_instance_name = 389106439;</code>
   *
   * @return The baseInstanceName.
   */
  java.lang.String getBaseInstanceName();

  /**
   *
   *
   * <pre>
   * The base instance name is a prefix that you want to attach to the names of all VMs in a MIG. The maximum character length is 58 and the name must comply with RFC1035 format. When a VM is created in the group, the MIG appends a hyphen and a random four-character string to the base instance name. If you want the MIG to assign sequential numbers instead of a random string, then end the base instance name with a hyphen followed by one or more hash symbols. The hash symbols indicate the number of digits. For example, a base instance name of "vm-###" results in "vm-001" as a VM name. &#64;pattern [a-z](([-a-z0-9]{0,57})|([-a-z0-9]{0,51}-#{1,10}(&#92;&#92;[[0-9]{1,10}&#92;&#92;])?))
   * </pre>
   *
   * <code>optional string base_instance_name = 389106439;</code>
   *
   * @return The bytes for baseInstanceName.
   */
  com.google.protobuf.ByteString getBaseInstanceNameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The creation timestamp for this managed instance group in RFC3339 text format.
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
   * [Output Only] The creation timestamp for this managed instance group in RFC3339 text format.
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
   * [Output Only] The creation timestamp for this managed instance group in RFC3339 text format.
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
   * [Output Only] The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerActionsSummary current_actions = 164045879;
   * </code>
   *
   * @return Whether the currentActions field is set.
   */
  boolean hasCurrentActions();

  /**
   *
   *
   * <pre>
   * [Output Only] The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerActionsSummary current_actions = 164045879;
   * </code>
   *
   * @return The currentActions.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary getCurrentActions();

  /**
   *
   *
   * <pre>
   * [Output Only] The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerActionsSummary current_actions = 164045879;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerActionsSummaryOrBuilder
      getCurrentActionsOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional description of this resource.
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
   * An optional description of this resource.
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
   * An optional description of this resource.
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
   * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DistributionPolicy distribution_policy = 534558541;
   * </code>
   *
   * @return Whether the distributionPolicy field is set.
   */
  boolean hasDistributionPolicy();

  /**
   *
   *
   * <pre>
   * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DistributionPolicy distribution_policy = 534558541;
   * </code>
   *
   * @return The distributionPolicy.
   */
  com.google.cloud.compute.v1.DistributionPolicy getDistributionPolicy();

  /**
   *
   *
   * <pre>
   * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DistributionPolicy distribution_policy = 534558541;
   * </code>
   */
  com.google.cloud.compute.v1.DistributionPolicyOrBuilder getDistributionPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
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
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
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
   * Instance flexibility allowing MIG to create VMs from multiple types of machines. Instance flexibility configuration on MIG overrides instance template configuration.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy instance_flexibility_policy = 26937090;
   * </code>
   *
   * @return Whether the instanceFlexibilityPolicy field is set.
   */
  boolean hasInstanceFlexibilityPolicy();

  /**
   *
   *
   * <pre>
   * Instance flexibility allowing MIG to create VMs from multiple types of machines. Instance flexibility configuration on MIG overrides instance template configuration.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy instance_flexibility_policy = 26937090;
   * </code>
   *
   * @return The instanceFlexibilityPolicy.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
      getInstanceFlexibilityPolicy();

  /**
   *
   *
   * <pre>
   * Instance flexibility allowing MIG to create VMs from multiple types of machines. Instance flexibility configuration on MIG overrides instance template configuration.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy instance_flexibility_policy = 26937090;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyOrBuilder
      getInstanceFlexibilityPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the Instance Group resource.
   * </pre>
   *
   * <code>optional string instance_group = 81095253;</code>
   *
   * @return Whether the instanceGroup field is set.
   */
  boolean hasInstanceGroup();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the Instance Group resource.
   * </pre>
   *
   * <code>optional string instance_group = 81095253;</code>
   *
   * @return The instanceGroup.
   */
  java.lang.String getInstanceGroup();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the Instance Group resource.
   * </pre>
   *
   * <code>optional string instance_group = 81095253;</code>
   *
   * @return The bytes for instanceGroup.
   */
  com.google.protobuf.ByteString getInstanceGroupBytes();

  /**
   *
   *
   * <pre>
   * The repair policy for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerInstanceLifecyclePolicy instance_lifecycle_policy = 447961617;
   * </code>
   *
   * @return Whether the instanceLifecyclePolicy field is set.
   */
  boolean hasInstanceLifecyclePolicy();

  /**
   *
   *
   * <pre>
   * The repair policy for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerInstanceLifecyclePolicy instance_lifecycle_policy = 447961617;
   * </code>
   *
   * @return The instanceLifecyclePolicy.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerInstanceLifecyclePolicy
      getInstanceLifecyclePolicy();

  /**
   *
   *
   * <pre>
   * The repair policy for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerInstanceLifecyclePolicy instance_lifecycle_policy = 447961617;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerInstanceLifecyclePolicyOrBuilder
      getInstanceLifecyclePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   *
   * @return Whether the instanceTemplate field is set.
   */
  boolean hasInstanceTemplate();

  /**
   *
   *
   * <pre>
   * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   *
   * @return The instanceTemplate.
   */
  java.lang.String getInstanceTemplate();

  /**
   *
   *
   * <pre>
   * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   *
   * @return The bytes for instanceTemplate.
   */
  com.google.protobuf.ByteString getInstanceTemplateBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The resource type, which is always compute#instanceGroupManager for managed instance groups.
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
   * [Output Only] The resource type, which is always compute#instanceGroupManager for managed instance groups.
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
   * [Output Only] The resource type, which is always compute#instanceGroupManager for managed instance groups.
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
   * Pagination behavior of the listManagedInstances API method for this managed instance group.
   * Check the ListManagedInstancesResults enum for the list of possible values.
   * </pre>
   *
   * <code>optional string list_managed_instances_results = 296047156;</code>
   *
   * @return Whether the listManagedInstancesResults field is set.
   */
  boolean hasListManagedInstancesResults();

  /**
   *
   *
   * <pre>
   * Pagination behavior of the listManagedInstances API method for this managed instance group.
   * Check the ListManagedInstancesResults enum for the list of possible values.
   * </pre>
   *
   * <code>optional string list_managed_instances_results = 296047156;</code>
   *
   * @return The listManagedInstancesResults.
   */
  java.lang.String getListManagedInstancesResults();

  /**
   *
   *
   * <pre>
   * Pagination behavior of the listManagedInstances API method for this managed instance group.
   * Check the ListManagedInstancesResults enum for the list of possible values.
   * </pre>
   *
   * <code>optional string list_managed_instances_results = 296047156;</code>
   *
   * @return The bytes for listManagedInstancesResults.
   */
  com.google.protobuf.ByteString getListManagedInstancesResultsBytes();

  /**
   *
   *
   * <pre>
   * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
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
   * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
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
   * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
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
   * [Output Only] Named ports configured on the Instance Groups complementary to this Instance Group Manager.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NamedPort> getNamedPortsList();

  /**
   *
   *
   * <pre>
   * [Output Only] Named ports configured on the Instance Groups complementary to this Instance Group Manager.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  com.google.cloud.compute.v1.NamedPort getNamedPorts(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Named ports configured on the Instance Groups complementary to this Instance Group Manager.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  int getNamedPortsCount();

  /**
   *
   *
   * <pre>
   * [Output Only] Named ports configured on the Instance Groups complementary to this Instance Group Manager.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NamedPortOrBuilder>
      getNamedPortsOrBuilderList();

  /**
   *
   *
   * <pre>
   * [Output Only] Named ports configured on the Instance Groups complementary to this Instance Group Manager.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  com.google.cloud.compute.v1.NamedPortOrBuilder getNamedPortsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the managed instance group resides (for regional resources).
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the managed instance group resides (for regional resources).
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the managed instance group resides (for regional resources).
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Resource policies for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerResourcePolicies resource_policies = 22220385;
   * </code>
   *
   * @return Whether the resourcePolicies field is set.
   */
  boolean hasResourcePolicies();

  /**
   *
   *
   * <pre>
   * Resource policies for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerResourcePolicies resource_policies = 22220385;
   * </code>
   *
   * @return The resourcePolicies.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerResourcePolicies getResourcePolicies();

  /**
   *
   *
   * <pre>
   * Resource policies for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerResourcePolicies resource_policies = 22220385;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerResourcePoliciesOrBuilder
      getResourcePoliciesOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzi = 480964257;</code>
   *
   * @return Whether the satisfiesPzi field is set.
   */
  boolean hasSatisfiesPzi();

  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzi = 480964257;</code>
   *
   * @return The satisfiesPzi.
   */
  boolean getSatisfiesPzi();

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
   * [Output Only] The URL for this managed instance group. The server defines this URL.
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
   * [Output Only] The URL for this managed instance group. The server defines this URL.
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
   * [Output Only] The URL for this managed instance group. The server defines this URL.
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
   * Standby policy for stopped and suspended instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStandbyPolicy standby_policy = 499352324;
   * </code>
   *
   * @return Whether the standbyPolicy field is set.
   */
  boolean hasStandbyPolicy();

  /**
   *
   *
   * <pre>
   * Standby policy for stopped and suspended instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStandbyPolicy standby_policy = 499352324;
   * </code>
   *
   * @return The standbyPolicy.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStandbyPolicy getStandbyPolicy();

  /**
   *
   *
   * <pre>
   * Standby policy for stopped and suspended instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStandbyPolicy standby_policy = 499352324;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStandbyPolicyOrBuilder
      getStandbyPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Stateful configuration for this Instanced Group Manager
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.StatefulPolicy stateful_policy = 47538565;</code>
   *
   * @return Whether the statefulPolicy field is set.
   */
  boolean hasStatefulPolicy();

  /**
   *
   *
   * <pre>
   * Stateful configuration for this Instanced Group Manager
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.StatefulPolicy stateful_policy = 47538565;</code>
   *
   * @return The statefulPolicy.
   */
  com.google.cloud.compute.v1.StatefulPolicy getStatefulPolicy();

  /**
   *
   *
   * <pre>
   * Stateful configuration for this Instanced Group Manager
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.StatefulPolicy stateful_policy = 47538565;</code>
   */
  com.google.cloud.compute.v1.StatefulPolicyOrBuilder getStatefulPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of this managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceGroupManagerStatus status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of this managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceGroupManagerStatus status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatus getStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of this managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceGroupManagerStatus status = 181260274;</code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @return A list containing the targetPools.
   */
  java.util.List<java.lang.String> getTargetPoolsList();

  /**
   *
   *
   * <pre>
   * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @return The count of targetPools.
   */
  int getTargetPoolsCount();

  /**
   *
   *
   * <pre>
   * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @param index The index of the element to return.
   * @return The targetPools at the given index.
   */
  java.lang.String getTargetPools(int index);

  /**
   *
   *
   * <pre>
   * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetPools at the given index.
   */
  com.google.protobuf.ByteString getTargetPoolsBytes(int index);

  /**
   *
   *
   * <pre>
   * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
   * </pre>
   *
   * <code>optional int32 target_size = 62880239;</code>
   *
   * @return Whether the targetSize field is set.
   */
  boolean hasTargetSize();

  /**
   *
   *
   * <pre>
   * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
   * </pre>
   *
   * <code>optional int32 target_size = 62880239;</code>
   *
   * @return The targetSize.
   */
  int getTargetSize();

  /**
   *
   *
   * <pre>
   * The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
   * </pre>
   *
   * <code>optional int32 target_stopped_size = 2419489;</code>
   *
   * @return Whether the targetStoppedSize field is set.
   */
  boolean hasTargetStoppedSize();

  /**
   *
   *
   * <pre>
   * The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
   * </pre>
   *
   * <code>optional int32 target_stopped_size = 2419489;</code>
   *
   * @return The targetStoppedSize.
   */
  int getTargetStoppedSize();

  /**
   *
   *
   * <pre>
   * The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
   * </pre>
   *
   * <code>optional int32 target_suspended_size = 308085843;</code>
   *
   * @return Whether the targetSuspendedSize field is set.
   */
  boolean hasTargetSuspendedSize();

  /**
   *
   *
   * <pre>
   * The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
   * </pre>
   *
   * <code>optional int32 target_suspended_size = 308085843;</code>
   *
   * @return The targetSuspendedSize.
   */
  int getTargetSuspendedSize();

  /**
   *
   *
   * <pre>
   * The update policy for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy update_policy = 175809896;
   * </code>
   *
   * @return Whether the updatePolicy field is set.
   */
  boolean hasUpdatePolicy();

  /**
   *
   *
   * <pre>
   * The update policy for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy update_policy = 175809896;
   * </code>
   *
   * @return The updatePolicy.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy getUpdatePolicy();

  /**
   *
   *
   * <pre>
   * The update policy for this managed instance group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy update_policy = 175809896;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicyOrBuilder getUpdatePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroupManagerVersion versions = 162430619;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InstanceGroupManagerVersion> getVersionsList();

  /**
   *
   *
   * <pre>
   * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroupManagerVersion versions = 162430619;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerVersion getVersions(int index);

  /**
   *
   *
   * <pre>
   * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroupManagerVersion versions = 162430619;
   * </code>
   */
  int getVersionsCount();

  /**
   *
   *
   * <pre>
   * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroupManagerVersion versions = 162430619;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InstanceGroupManagerVersionOrBuilder>
      getVersionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroupManagerVersion versions = 162430619;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerVersionOrBuilder getVersionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of a zone where the managed instance group is located (for zonal resources).
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
   * [Output Only] The URL of a zone where the managed instance group is located (for zonal resources).
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
   * [Output Only] The URL of a zone where the managed instance group is located (for zonal resources).
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
