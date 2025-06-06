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
// source: google/cloud/visionai/v1/streaming_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface ControlledModeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ControlledMode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This can be set to the following logical starting points:
   *
   * "begin": This will read from the earliest available message.
   *
   * "most-recent": This will read from the latest available message.
   *
   * "end": This will read only future messages.
   *
   * "stored": This will resume reads one past the last committed offset.
   *           It is the only option that resumes progress; all others
   *           jump unilaterally.
   * </pre>
   *
   * <code>string starting_logical_offset = 1;</code>
   *
   * @return Whether the startingLogicalOffset field is set.
   */
  boolean hasStartingLogicalOffset();

  /**
   *
   *
   * <pre>
   * This can be set to the following logical starting points:
   *
   * "begin": This will read from the earliest available message.
   *
   * "most-recent": This will read from the latest available message.
   *
   * "end": This will read only future messages.
   *
   * "stored": This will resume reads one past the last committed offset.
   *           It is the only option that resumes progress; all others
   *           jump unilaterally.
   * </pre>
   *
   * <code>string starting_logical_offset = 1;</code>
   *
   * @return The startingLogicalOffset.
   */
  java.lang.String getStartingLogicalOffset();

  /**
   *
   *
   * <pre>
   * This can be set to the following logical starting points:
   *
   * "begin": This will read from the earliest available message.
   *
   * "most-recent": This will read from the latest available message.
   *
   * "end": This will read only future messages.
   *
   * "stored": This will resume reads one past the last committed offset.
   *           It is the only option that resumes progress; all others
   *           jump unilaterally.
   * </pre>
   *
   * <code>string starting_logical_offset = 1;</code>
   *
   * @return The bytes for startingLogicalOffset.
   */
  com.google.protobuf.ByteString getStartingLogicalOffsetBytes();

  /**
   *
   *
   * <pre>
   * This is the logical starting point to fallback upon should the
   * specified starting offset be unavailable.
   *
   * This can be one of the following values:
   *
   * "begin": This will read from the earliest available message.
   *
   * "end": This will read only future messages.
   * </pre>
   *
   * <code>string fallback_starting_offset = 2;</code>
   *
   * @return The fallbackStartingOffset.
   */
  java.lang.String getFallbackStartingOffset();

  /**
   *
   *
   * <pre>
   * This is the logical starting point to fallback upon should the
   * specified starting offset be unavailable.
   *
   * This can be one of the following values:
   *
   * "begin": This will read from the earliest available message.
   *
   * "end": This will read only future messages.
   * </pre>
   *
   * <code>string fallback_starting_offset = 2;</code>
   *
   * @return The bytes for fallbackStartingOffset.
   */
  com.google.protobuf.ByteString getFallbackStartingOffsetBytes();

  com.google.cloud.visionai.v1.ControlledMode.StartingOffsetCase getStartingOffsetCase();
}
