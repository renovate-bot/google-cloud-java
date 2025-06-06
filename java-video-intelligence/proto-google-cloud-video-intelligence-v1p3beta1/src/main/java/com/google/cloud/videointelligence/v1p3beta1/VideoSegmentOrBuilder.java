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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.videointelligence.v1p3beta1;

public interface VideoSegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.VideoSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   *
   * @return Whether the startTimeOffset field is set.
   */
  boolean hasStartTimeOffset();

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   *
   * @return The startTimeOffset.
   */
  com.google.protobuf.Duration getStartTimeOffset();

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   *
   * @return Whether the endTimeOffset field is set.
   */
  boolean hasEndTimeOffset();

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   *
   * @return The endTimeOffset.
   */
  com.google.protobuf.Duration getEndTimeOffset();

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOffsetOrBuilder();
}
