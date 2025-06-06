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
// source: google/cloud/tpu/v1/cloud_tpu.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tpu.v1;

public interface SchedulingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v1.SchedulingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Defines whether the node is preemptible.
   * </pre>
   *
   * <code>bool preemptible = 1;</code>
   *
   * @return The preemptible.
   */
  boolean getPreemptible();

  /**
   *
   *
   * <pre>
   * Whether the node is created under a reservation.
   * </pre>
   *
   * <code>bool reserved = 2;</code>
   *
   * @return The reserved.
   */
  boolean getReserved();
}
