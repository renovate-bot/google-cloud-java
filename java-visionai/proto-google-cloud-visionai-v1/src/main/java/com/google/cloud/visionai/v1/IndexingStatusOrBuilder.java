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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface IndexingStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.IndexingStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. State of this asset's indexing.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.IndexingStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. State of this asset's indexing.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.IndexingStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.visionai.v1.IndexingStatus.State getState();

  /**
   *
   *
   * <pre>
   * Detailed message describing the state.
   * </pre>
   *
   * <code>string status_message = 3;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();

  /**
   *
   *
   * <pre>
   * Detailed message describing the state.
   * </pre>
   *
   * <code>string status_message = 3;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();
}
