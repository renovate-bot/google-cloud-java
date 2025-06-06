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
// source: google/cloud/networkmanagement/v1/trace.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkmanagement.v1;

public interface ProxyConnectionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.ProxyConnectionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
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
   * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
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
   * Source IP address of an original connection.
   * </pre>
   *
   * <code>string old_source_ip = 2;</code>
   *
   * @return The oldSourceIp.
   */
  java.lang.String getOldSourceIp();

  /**
   *
   *
   * <pre>
   * Source IP address of an original connection.
   * </pre>
   *
   * <code>string old_source_ip = 2;</code>
   *
   * @return The bytes for oldSourceIp.
   */
  com.google.protobuf.ByteString getOldSourceIpBytes();

  /**
   *
   *
   * <pre>
   * Source IP address of a new connection.
   * </pre>
   *
   * <code>string new_source_ip = 3;</code>
   *
   * @return The newSourceIp.
   */
  java.lang.String getNewSourceIp();

  /**
   *
   *
   * <pre>
   * Source IP address of a new connection.
   * </pre>
   *
   * <code>string new_source_ip = 3;</code>
   *
   * @return The bytes for newSourceIp.
   */
  com.google.protobuf.ByteString getNewSourceIpBytes();

  /**
   *
   *
   * <pre>
   * Destination IP address of an original connection
   * </pre>
   *
   * <code>string old_destination_ip = 4;</code>
   *
   * @return The oldDestinationIp.
   */
  java.lang.String getOldDestinationIp();

  /**
   *
   *
   * <pre>
   * Destination IP address of an original connection
   * </pre>
   *
   * <code>string old_destination_ip = 4;</code>
   *
   * @return The bytes for oldDestinationIp.
   */
  com.google.protobuf.ByteString getOldDestinationIpBytes();

  /**
   *
   *
   * <pre>
   * Destination IP address of a new connection.
   * </pre>
   *
   * <code>string new_destination_ip = 5;</code>
   *
   * @return The newDestinationIp.
   */
  java.lang.String getNewDestinationIp();

  /**
   *
   *
   * <pre>
   * Destination IP address of a new connection.
   * </pre>
   *
   * <code>string new_destination_ip = 5;</code>
   *
   * @return The bytes for newDestinationIp.
   */
  com.google.protobuf.ByteString getNewDestinationIpBytes();

  /**
   *
   *
   * <pre>
   * Source port of an original connection. Only valid when protocol is TCP or
   * UDP.
   * </pre>
   *
   * <code>int32 old_source_port = 6;</code>
   *
   * @return The oldSourcePort.
   */
  int getOldSourcePort();

  /**
   *
   *
   * <pre>
   * Source port of a new connection. Only valid when protocol is TCP or UDP.
   * </pre>
   *
   * <code>int32 new_source_port = 7;</code>
   *
   * @return The newSourcePort.
   */
  int getNewSourcePort();

  /**
   *
   *
   * <pre>
   * Destination port of an original connection. Only valid when protocol is TCP
   * or UDP.
   * </pre>
   *
   * <code>int32 old_destination_port = 8;</code>
   *
   * @return The oldDestinationPort.
   */
  int getOldDestinationPort();

  /**
   *
   *
   * <pre>
   * Destination port of a new connection. Only valid when protocol is TCP or
   * UDP.
   * </pre>
   *
   * <code>int32 new_destination_port = 9;</code>
   *
   * @return The newDestinationPort.
   */
  int getNewDestinationPort();

  /**
   *
   *
   * <pre>
   * Uri of proxy subnet.
   * </pre>
   *
   * <code>string subnet_uri = 10;</code>
   *
   * @return The subnetUri.
   */
  java.lang.String getSubnetUri();

  /**
   *
   *
   * <pre>
   * Uri of proxy subnet.
   * </pre>
   *
   * <code>string subnet_uri = 10;</code>
   *
   * @return The bytes for subnetUri.
   */
  com.google.protobuf.ByteString getSubnetUriBytes();

  /**
   *
   *
   * <pre>
   * URI of the network where connection is proxied.
   * </pre>
   *
   * <code>string network_uri = 11;</code>
   *
   * @return The networkUri.
   */
  java.lang.String getNetworkUri();

  /**
   *
   *
   * <pre>
   * URI of the network where connection is proxied.
   * </pre>
   *
   * <code>string network_uri = 11;</code>
   *
   * @return The bytes for networkUri.
   */
  com.google.protobuf.ByteString getNetworkUriBytes();
}
