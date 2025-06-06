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
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

public interface StateFamilyConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.StateFamilyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state family value.
   * </pre>
   *
   * <code>string state_family = 1;</code>
   *
   * @return The stateFamily.
   */
  java.lang.String getStateFamily();

  /**
   *
   *
   * <pre>
   * The state family value.
   * </pre>
   *
   * <code>string state_family = 1;</code>
   *
   * @return The bytes for stateFamily.
   */
  com.google.protobuf.ByteString getStateFamilyBytes();

  /**
   *
   *
   * <pre>
   * If true, this family corresponds to a read operation.
   * </pre>
   *
   * <code>bool is_read = 2;</code>
   *
   * @return The isRead.
   */
  boolean getIsRead();
}
