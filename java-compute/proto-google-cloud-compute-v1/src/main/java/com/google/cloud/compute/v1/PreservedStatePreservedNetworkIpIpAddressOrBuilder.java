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

public interface PreservedStatePreservedNetworkIpIpAddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URL of the reservation for this IP address.
   * </pre>
   *
   * <code>optional string address = 462920692;</code>
   *
   * @return Whether the address field is set.
   */
  boolean hasAddress();

  /**
   *
   *
   * <pre>
   * The URL of the reservation for this IP address.
   * </pre>
   *
   * <code>optional string address = 462920692;</code>
   *
   * @return The address.
   */
  java.lang.String getAddress();

  /**
   *
   *
   * <pre>
   * The URL of the reservation for this IP address.
   * </pre>
   *
   * <code>optional string address = 462920692;</code>
   *
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString getAddressBytes();

  /**
   *
   *
   * <pre>
   * An IPv4 internal network address to assign to the instance for this network interface.
   * </pre>
   *
   * <code>optional string literal = 182460591;</code>
   *
   * @return Whether the literal field is set.
   */
  boolean hasLiteral();

  /**
   *
   *
   * <pre>
   * An IPv4 internal network address to assign to the instance for this network interface.
   * </pre>
   *
   * <code>optional string literal = 182460591;</code>
   *
   * @return The literal.
   */
  java.lang.String getLiteral();

  /**
   *
   *
   * <pre>
   * An IPv4 internal network address to assign to the instance for this network interface.
   * </pre>
   *
   * <code>optional string literal = 182460591;</code>
   *
   * @return The bytes for literal.
   */
  com.google.protobuf.ByteString getLiteralBytes();
}
