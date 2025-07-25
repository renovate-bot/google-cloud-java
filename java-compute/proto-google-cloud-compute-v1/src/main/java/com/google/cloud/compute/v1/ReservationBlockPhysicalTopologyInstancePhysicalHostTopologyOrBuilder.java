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

public interface ReservationBlockPhysicalTopologyInstancePhysicalHostTopologyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ReservationBlockPhysicalTopologyInstancePhysicalHostTopology)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Host hash for a given instance
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return Whether the host field is set.
   */
  boolean hasHost();

  /**
   *
   *
   * <pre>
   * Host hash for a given instance
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();

  /**
   *
   *
   * <pre>
   * Host hash for a given instance
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Sub block hash for a given instance
   * </pre>
   *
   * <code>optional string sub_block = 478033358;</code>
   *
   * @return Whether the subBlock field is set.
   */
  boolean hasSubBlock();

  /**
   *
   *
   * <pre>
   * Sub block hash for a given instance
   * </pre>
   *
   * <code>optional string sub_block = 478033358;</code>
   *
   * @return The subBlock.
   */
  java.lang.String getSubBlock();

  /**
   *
   *
   * <pre>
   * Sub block hash for a given instance
   * </pre>
   *
   * <code>optional string sub_block = 478033358;</code>
   *
   * @return The bytes for subBlock.
   */
  com.google.protobuf.ByteString getSubBlockBytes();
}
