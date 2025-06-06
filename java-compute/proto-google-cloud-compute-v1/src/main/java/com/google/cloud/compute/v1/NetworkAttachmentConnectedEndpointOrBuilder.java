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

public interface NetworkAttachmentConnectedEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkAttachmentConnectedEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The IPv4 address assigned to the producer instance network interface. This value will be a range in case of Serverless.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();

  /**
   *
   *
   * <pre>
   * The IPv4 address assigned to the producer instance network interface. This value will be a range in case of Serverless.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();

  /**
   *
   *
   * <pre>
   * The IPv4 address assigned to the producer instance network interface. This value will be a range in case of Serverless.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * The IPv6 address assigned to the producer instance network interface. This is only assigned when the stack types of both the instance network interface and the consumer subnet are IPv4_IPv6.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   *
   * @return Whether the ipv6Address field is set.
   */
  boolean hasIpv6Address();

  /**
   *
   *
   * <pre>
   * The IPv6 address assigned to the producer instance network interface. This is only assigned when the stack types of both the instance network interface and the consumer subnet are IPv4_IPv6.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   *
   * @return The ipv6Address.
   */
  java.lang.String getIpv6Address();

  /**
   *
   *
   * <pre>
   * The IPv6 address assigned to the producer instance network interface. This is only assigned when the stack types of both the instance network interface and the consumer subnet are IPv4_IPv6.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   *
   * @return The bytes for ipv6Address.
   */
  com.google.protobuf.ByteString getIpv6AddressBytes();

  /**
   *
   *
   * <pre>
   * The project id or number of the interface to which the IP was assigned.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return Whether the projectIdOrNum field is set.
   */
  boolean hasProjectIdOrNum();

  /**
   *
   *
   * <pre>
   * The project id or number of the interface to which the IP was assigned.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return The projectIdOrNum.
   */
  java.lang.String getProjectIdOrNum();

  /**
   *
   *
   * <pre>
   * The project id or number of the interface to which the IP was assigned.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return The bytes for projectIdOrNum.
   */
  com.google.protobuf.ByteString getProjectIdOrNumBytes();

  /**
   *
   *
   * <pre>
   * Alias IP ranges from the same subnetwork.
   * </pre>
   *
   * <code>repeated string secondary_ip_cidr_ranges = 117184788;</code>
   *
   * @return A list containing the secondaryIpCidrRanges.
   */
  java.util.List<java.lang.String> getSecondaryIpCidrRangesList();

  /**
   *
   *
   * <pre>
   * Alias IP ranges from the same subnetwork.
   * </pre>
   *
   * <code>repeated string secondary_ip_cidr_ranges = 117184788;</code>
   *
   * @return The count of secondaryIpCidrRanges.
   */
  int getSecondaryIpCidrRangesCount();

  /**
   *
   *
   * <pre>
   * Alias IP ranges from the same subnetwork.
   * </pre>
   *
   * <code>repeated string secondary_ip_cidr_ranges = 117184788;</code>
   *
   * @param index The index of the element to return.
   * @return The secondaryIpCidrRanges at the given index.
   */
  java.lang.String getSecondaryIpCidrRanges(int index);

  /**
   *
   *
   * <pre>
   * Alias IP ranges from the same subnetwork.
   * </pre>
   *
   * <code>repeated string secondary_ip_cidr_ranges = 117184788;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the secondaryIpCidrRanges at the given index.
   */
  com.google.protobuf.ByteString getSecondaryIpCidrRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * The status of a connected endpoint to this network attachment.
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
   * The status of a connected endpoint to this network attachment.
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
   * The status of a connected endpoint to this network attachment.
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
   * The subnetwork used to assign the IP to the producer instance network interface.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return Whether the subnetwork field is set.
   */
  boolean hasSubnetwork();

  /**
   *
   *
   * <pre>
   * The subnetwork used to assign the IP to the producer instance network interface.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();

  /**
   *
   *
   * <pre>
   * The subnetwork used to assign the IP to the producer instance network interface.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The CIDR range of the subnet from which the IPv4 internal IP was allocated from.
   * </pre>
   *
   * <code>optional string subnetwork_cidr_range = 383249827;</code>
   *
   * @return Whether the subnetworkCidrRange field is set.
   */
  boolean hasSubnetworkCidrRange();

  /**
   *
   *
   * <pre>
   * [Output Only] The CIDR range of the subnet from which the IPv4 internal IP was allocated from.
   * </pre>
   *
   * <code>optional string subnetwork_cidr_range = 383249827;</code>
   *
   * @return The subnetworkCidrRange.
   */
  java.lang.String getSubnetworkCidrRange();

  /**
   *
   *
   * <pre>
   * [Output Only] The CIDR range of the subnet from which the IPv4 internal IP was allocated from.
   * </pre>
   *
   * <code>optional string subnetwork_cidr_range = 383249827;</code>
   *
   * @return The bytes for subnetworkCidrRange.
   */
  com.google.protobuf.ByteString getSubnetworkCidrRangeBytes();
}
