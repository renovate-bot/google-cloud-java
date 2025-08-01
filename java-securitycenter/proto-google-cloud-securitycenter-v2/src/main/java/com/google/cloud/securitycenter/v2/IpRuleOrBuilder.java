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
// source: google/cloud/securitycenter/v2/ip_rules.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public interface IpRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.IpRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The IP protocol this rule applies to. This value can either be one of the
   * following well known protocol strings (TCP, UDP, ICMP, ESP, AH, IPIP,
   * SCTP) or a string representation of the integer value.
   * </pre>
   *
   * <code>string protocol = 1;</code>
   *
   * @return The protocol.
   */
  java.lang.String getProtocol();

  /**
   *
   *
   * <pre>
   * The IP protocol this rule applies to. This value can either be one of the
   * following well known protocol strings (TCP, UDP, ICMP, ESP, AH, IPIP,
   * SCTP) or a string representation of the integer value.
   * </pre>
   *
   * <code>string protocol = 1;</code>
   *
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString getProtocolBytes();

  /**
   *
   *
   * <pre>
   * Optional. An optional list of ports to which this rule applies. This field
   * is only applicable for the UDP or (S)TCP protocols. Each entry must be
   * either an integer or a range including a min and max port number.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.IpRule.PortRange port_ranges = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.securitycenter.v2.IpRule.PortRange> getPortRangesList();

  /**
   *
   *
   * <pre>
   * Optional. An optional list of ports to which this rule applies. This field
   * is only applicable for the UDP or (S)TCP protocols. Each entry must be
   * either an integer or a range including a min and max port number.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.IpRule.PortRange port_ranges = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.securitycenter.v2.IpRule.PortRange getPortRanges(int index);

  /**
   *
   *
   * <pre>
   * Optional. An optional list of ports to which this rule applies. This field
   * is only applicable for the UDP or (S)TCP protocols. Each entry must be
   * either an integer or a range including a min and max port number.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.IpRule.PortRange port_ranges = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPortRangesCount();

  /**
   *
   *
   * <pre>
   * Optional. An optional list of ports to which this rule applies. This field
   * is only applicable for the UDP or (S)TCP protocols. Each entry must be
   * either an integer or a range including a min and max port number.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.IpRule.PortRange port_ranges = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v2.IpRule.PortRangeOrBuilder>
      getPortRangesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. An optional list of ports to which this rule applies. This field
   * is only applicable for the UDP or (S)TCP protocols. Each entry must be
   * either an integer or a range including a min and max port number.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.IpRule.PortRange port_ranges = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.securitycenter.v2.IpRule.PortRangeOrBuilder getPortRangesOrBuilder(int index);
}
