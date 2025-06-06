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

public interface BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An optional, arbitrary JSON object with configuration data, understood by a locally installed custom policy implementation.
   * </pre>
   *
   * <code>optional string data = 3076010;</code>
   *
   * @return Whether the data field is set.
   */
  boolean hasData();

  /**
   *
   *
   * <pre>
   * An optional, arbitrary JSON object with configuration data, understood by a locally installed custom policy implementation.
   * </pre>
   *
   * <code>optional string data = 3076010;</code>
   *
   * @return The data.
   */
  java.lang.String getData();

  /**
   *
   *
   * <pre>
   * An optional, arbitrary JSON object with configuration data, understood by a locally installed custom policy implementation.
   * </pre>
   *
   * <code>optional string data = 3076010;</code>
   *
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString getDataBytes();

  /**
   *
   *
   * <pre>
   * Identifies the custom policy. The value should match the name of a custom implementation registered on the gRPC clients. It should follow protocol buffer message naming conventions and include the full path (for example, myorg.CustomLbPolicy). The maximum length is 256 characters. Do not specify the same custom policy more than once for a backend. If you do, the configuration is rejected. For an example of how to use this field, see Use a custom policy.
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
   * Identifies the custom policy. The value should match the name of a custom implementation registered on the gRPC clients. It should follow protocol buffer message naming conventions and include the full path (for example, myorg.CustomLbPolicy). The maximum length is 256 characters. Do not specify the same custom policy more than once for a backend. If you do, the configuration is rejected. For an example of how to use this field, see Use a custom policy.
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
   * Identifies the custom policy. The value should match the name of a custom implementation registered on the gRPC clients. It should follow protocol buffer message naming conventions and include the full path (for example, myorg.CustomLbPolicy). The maximum length is 256 characters. Do not specify the same custom policy more than once for a backend. If you do, the configuration is rejected. For an example of how to use this field, see Use a custom policy.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
