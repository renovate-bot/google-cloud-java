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
// source: google/appengine/v1/version.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public interface BasicScalingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.BasicScaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Duration of time after the last request that an instance must wait before
   * the instance is shut down.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 1;</code>
   *
   * @return Whether the idleTimeout field is set.
   */
  boolean hasIdleTimeout();

  /**
   *
   *
   * <pre>
   * Duration of time after the last request that an instance must wait before
   * the instance is shut down.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 1;</code>
   *
   * @return The idleTimeout.
   */
  com.google.protobuf.Duration getIdleTimeout();

  /**
   *
   *
   * <pre>
   * Duration of time after the last request that an instance must wait before
   * the instance is shut down.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getIdleTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of instances to create for this version.
   * </pre>
   *
   * <code>int32 max_instances = 2;</code>
   *
   * @return The maxInstances.
   */
  int getMaxInstances();
}
