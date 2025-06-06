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
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmmigration.v1;

public interface AwsVmDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.AwsVmDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The VM ID in AWS.
   * </pre>
   *
   * <code>string vm_id = 1;</code>
   *
   * @return The vmId.
   */
  java.lang.String getVmId();

  /**
   *
   *
   * <pre>
   * The VM ID in AWS.
   * </pre>
   *
   * <code>string vm_id = 1;</code>
   *
   * @return The bytes for vmId.
   */
  com.google.protobuf.ByteString getVmIdBytes();

  /**
   *
   *
   * <pre>
   * The display name of the VM. Note that this value is not necessarily unique.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * The display name of the VM. Note that this value is not necessarily unique.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The id of the AWS's source this VM is connected to.
   * </pre>
   *
   * <code>string source_id = 3;</code>
   *
   * @return The sourceId.
   */
  java.lang.String getSourceId();

  /**
   *
   *
   * <pre>
   * The id of the AWS's source this VM is connected to.
   * </pre>
   *
   * <code>string source_id = 3;</code>
   *
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString getSourceIdBytes();

  /**
   *
   *
   * <pre>
   * The descriptive name of the AWS's source this VM is connected to.
   * </pre>
   *
   * <code>string source_description = 4;</code>
   *
   * @return The sourceDescription.
   */
  java.lang.String getSourceDescription();

  /**
   *
   *
   * <pre>
   * The descriptive name of the AWS's source this VM is connected to.
   * </pre>
   *
   * <code>string source_description = 4;</code>
   *
   * @return The bytes for sourceDescription.
   */
  com.google.protobuf.ByteString getSourceDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The power state of the VM at the moment list was taken.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.AwsVmDetails.PowerState power_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for powerState.
   */
  int getPowerStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The power state of the VM at the moment list was taken.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.AwsVmDetails.PowerState power_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The powerState.
   */
  com.google.cloud.vmmigration.v1.AwsVmDetails.PowerState getPowerState();

  /**
   *
   *
   * <pre>
   * The number of cpus the VM has.
   * </pre>
   *
   * <code>int32 cpu_count = 6;</code>
   *
   * @return The cpuCount.
   */
  int getCpuCount();

  /**
   *
   *
   * <pre>
   * The memory size of the VM in MB.
   * </pre>
   *
   * <code>int32 memory_mb = 7;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * The number of disks the VM has.
   * </pre>
   *
   * <code>int32 disk_count = 8;</code>
   *
   * @return The diskCount.
   */
  int getDiskCount();

  /**
   *
   *
   * <pre>
   * The total size of the storage allocated to the VM in MB.
   * </pre>
   *
   * <code>int64 committed_storage_mb = 9;</code>
   *
   * @return The committedStorageMb.
   */
  long getCommittedStorageMb();

  /**
   *
   *
   * <pre>
   * The VM's OS.
   * </pre>
   *
   * <code>string os_description = 10;</code>
   *
   * @return The osDescription.
   */
  java.lang.String getOsDescription();

  /**
   *
   *
   * <pre>
   * The VM's OS.
   * </pre>
   *
   * <code>string os_description = 10;</code>
   *
   * @return The bytes for osDescription.
   */
  com.google.protobuf.ByteString getOsDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The VM Boot Option.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsVmDetails.BootOption boot_option = 11;</code>
   *
   * @return The enum numeric value on the wire for bootOption.
   */
  int getBootOptionValue();

  /**
   *
   *
   * <pre>
   * The VM Boot Option.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsVmDetails.BootOption boot_option = 11;</code>
   *
   * @return The bootOption.
   */
  com.google.cloud.vmmigration.v1.AwsVmDetails.BootOption getBootOption();

  /**
   *
   *
   * <pre>
   * The instance type of the VM.
   * </pre>
   *
   * <code>string instance_type = 12;</code>
   *
   * @return The instanceType.
   */
  java.lang.String getInstanceType();

  /**
   *
   *
   * <pre>
   * The instance type of the VM.
   * </pre>
   *
   * <code>string instance_type = 12;</code>
   *
   * @return The bytes for instanceType.
   */
  com.google.protobuf.ByteString getInstanceTypeBytes();

  /**
   *
   *
   * <pre>
   * The VPC ID the VM belongs to.
   * </pre>
   *
   * <code>string vpc_id = 13;</code>
   *
   * @return The vpcId.
   */
  java.lang.String getVpcId();

  /**
   *
   *
   * <pre>
   * The VPC ID the VM belongs to.
   * </pre>
   *
   * <code>string vpc_id = 13;</code>
   *
   * @return The bytes for vpcId.
   */
  com.google.protobuf.ByteString getVpcIdBytes();

  /**
   *
   *
   * <pre>
   * The security groups the VM belongs to.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.AwsSecurityGroup security_groups = 14;</code>
   */
  java.util.List<com.google.cloud.vmmigration.v1.AwsSecurityGroup> getSecurityGroupsList();

  /**
   *
   *
   * <pre>
   * The security groups the VM belongs to.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.AwsSecurityGroup security_groups = 14;</code>
   */
  com.google.cloud.vmmigration.v1.AwsSecurityGroup getSecurityGroups(int index);

  /**
   *
   *
   * <pre>
   * The security groups the VM belongs to.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.AwsSecurityGroup security_groups = 14;</code>
   */
  int getSecurityGroupsCount();

  /**
   *
   *
   * <pre>
   * The security groups the VM belongs to.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.AwsSecurityGroup security_groups = 14;</code>
   */
  java.util.List<? extends com.google.cloud.vmmigration.v1.AwsSecurityGroupOrBuilder>
      getSecurityGroupsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The security groups the VM belongs to.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.AwsSecurityGroup security_groups = 14;</code>
   */
  com.google.cloud.vmmigration.v1.AwsSecurityGroupOrBuilder getSecurityGroupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The tags of the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 15;</code>
   */
  int getTagsCount();

  /**
   *
   *
   * <pre>
   * The tags of the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 15;</code>
   */
  boolean containsTags(java.lang.String key);

  /** Use {@link #getTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getTags();

  /**
   *
   *
   * <pre>
   * The tags of the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getTagsMap();

  /**
   *
   *
   * <pre>
   * The tags of the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 15;</code>
   */
  /* nullable */
  java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * The tags of the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 15;</code>
   */
  java.lang.String getTagsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The AWS zone of the VM.
   * </pre>
   *
   * <code>string zone = 16;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();

  /**
   *
   *
   * <pre>
   * The AWS zone of the VM.
   * </pre>
   *
   * <code>string zone = 16;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * The virtualization type.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsVmDetails.VmVirtualizationType virtualization_type = 17;
   * </code>
   *
   * @return The enum numeric value on the wire for virtualizationType.
   */
  int getVirtualizationTypeValue();

  /**
   *
   *
   * <pre>
   * The virtualization type.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsVmDetails.VmVirtualizationType virtualization_type = 17;
   * </code>
   *
   * @return The virtualizationType.
   */
  com.google.cloud.vmmigration.v1.AwsVmDetails.VmVirtualizationType getVirtualizationType();

  /**
   *
   *
   * <pre>
   * The CPU architecture.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsVmDetails.VmArchitecture architecture = 18;</code>
   *
   * @return The enum numeric value on the wire for architecture.
   */
  int getArchitectureValue();

  /**
   *
   *
   * <pre>
   * The CPU architecture.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsVmDetails.VmArchitecture architecture = 18;</code>
   *
   * @return The architecture.
   */
  com.google.cloud.vmmigration.v1.AwsVmDetails.VmArchitecture getArchitecture();
}
