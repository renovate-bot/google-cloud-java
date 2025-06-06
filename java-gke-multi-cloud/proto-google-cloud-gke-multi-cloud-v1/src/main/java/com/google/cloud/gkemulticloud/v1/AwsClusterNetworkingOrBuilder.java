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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

public interface AwsClusterNetworkingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsClusterNetworking)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The VPC associated with the cluster. All component clusters
   * (i.e. control plane and node pools) run on a single VPC.
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>string vpc_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vpcId.
   */
  java.lang.String getVpcId();

  /**
   *
   *
   * <pre>
   * Required. The VPC associated with the cluster. All component clusters
   * (i.e. control plane and node pools) run on a single VPC.
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>string vpc_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for vpcId.
   */
  com.google.protobuf.ByteString getVpcIdBytes();

  /**
   *
   *
   * <pre>
   * Required. All pods in the cluster are assigned an IPv4 address from these
   * ranges. Only a single range is supported. This field cannot be changed
   * after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the podAddressCidrBlocks.
   */
  java.util.List<java.lang.String> getPodAddressCidrBlocksList();

  /**
   *
   *
   * <pre>
   * Required. All pods in the cluster are assigned an IPv4 address from these
   * ranges. Only a single range is supported. This field cannot be changed
   * after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of podAddressCidrBlocks.
   */
  int getPodAddressCidrBlocksCount();

  /**
   *
   *
   * <pre>
   * Required. All pods in the cluster are assigned an IPv4 address from these
   * ranges. Only a single range is supported. This field cannot be changed
   * after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The podAddressCidrBlocks at the given index.
   */
  java.lang.String getPodAddressCidrBlocks(int index);

  /**
   *
   *
   * <pre>
   * Required. All pods in the cluster are assigned an IPv4 address from these
   * ranges. Only a single range is supported. This field cannot be changed
   * after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the podAddressCidrBlocks at the given index.
   */
  com.google.protobuf.ByteString getPodAddressCidrBlocksBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. All services in the cluster are assigned an IPv4 address from
   * these ranges. Only a single range is supported. This field cannot be
   * changed after creation.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the serviceAddressCidrBlocks.
   */
  java.util.List<java.lang.String> getServiceAddressCidrBlocksList();

  /**
   *
   *
   * <pre>
   * Required. All services in the cluster are assigned an IPv4 address from
   * these ranges. Only a single range is supported. This field cannot be
   * changed after creation.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of serviceAddressCidrBlocks.
   */
  int getServiceAddressCidrBlocksCount();

  /**
   *
   *
   * <pre>
   * Required. All services in the cluster are assigned an IPv4 address from
   * these ranges. Only a single range is supported. This field cannot be
   * changed after creation.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The serviceAddressCidrBlocks at the given index.
   */
  java.lang.String getServiceAddressCidrBlocks(int index);

  /**
   *
   *
   * <pre>
   * Required. All services in the cluster are assigned an IPv4 address from
   * these ranges. Only a single range is supported. This field cannot be
   * changed after creation.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the serviceAddressCidrBlocks at the given index.
   */
  com.google.protobuf.ByteString getServiceAddressCidrBlocksBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Disable the per node pool subnet security group rules on the
   * control plane security group. When set to true, you must also provide one
   * or more security groups that ensure node pools are able to send requests to
   * the control plane on TCP/443 and TCP/8132. Failure to do so may result in
   * unavailable node pools.
   * </pre>
   *
   * <code>bool per_node_pool_sg_rules_disabled = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The perNodePoolSgRulesDisabled.
   */
  boolean getPerNodePoolSgRulesDisabled();
}
