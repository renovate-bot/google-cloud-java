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

public interface NatIpInfoNatIpInfoMappingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NatIpInfoNatIpInfoMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies whether NAT IP is auto or manual.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return Whether the mode field is set.
   */
  boolean hasMode();

  /**
   *
   *
   * <pre>
   * Specifies whether NAT IP is auto or manual.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The mode.
   */
  java.lang.String getMode();

  /**
   *
   *
   * <pre>
   * Specifies whether NAT IP is auto or manual.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString getModeBytes();

  /**
   *
   *
   * <pre>
   * NAT IP address. For example: 203.0.113.11.
   * </pre>
   *
   * <code>optional string nat_ip = 21113093;</code>
   *
   * @return Whether the natIp field is set.
   */
  boolean hasNatIp();

  /**
   *
   *
   * <pre>
   * NAT IP address. For example: 203.0.113.11.
   * </pre>
   *
   * <code>optional string nat_ip = 21113093;</code>
   *
   * @return The natIp.
   */
  java.lang.String getNatIp();

  /**
   *
   *
   * <pre>
   * NAT IP address. For example: 203.0.113.11.
   * </pre>
   *
   * <code>optional string nat_ip = 21113093;</code>
   *
   * @return The bytes for natIp.
   */
  com.google.protobuf.ByteString getNatIpBytes();

  /**
   *
   *
   * <pre>
   * Specifies whether NAT IP is currently serving at least one endpoint or not.
   * Check the Usage enum for the list of possible values.
   * </pre>
   *
   * <code>optional string usage = 111574433;</code>
   *
   * @return Whether the usage field is set.
   */
  boolean hasUsage();

  /**
   *
   *
   * <pre>
   * Specifies whether NAT IP is currently serving at least one endpoint or not.
   * Check the Usage enum for the list of possible values.
   * </pre>
   *
   * <code>optional string usage = 111574433;</code>
   *
   * @return The usage.
   */
  java.lang.String getUsage();

  /**
   *
   *
   * <pre>
   * Specifies whether NAT IP is currently serving at least one endpoint or not.
   * Check the Usage enum for the list of possible values.
   * </pre>
   *
   * <code>optional string usage = 111574433;</code>
   *
   * @return The bytes for usage.
   */
  com.google.protobuf.ByteString getUsageBytes();
}
