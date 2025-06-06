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
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.videointelligence.v1p2beta1;

public interface TextFrameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p2beta1.TextFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Bounding polygon of the detected text for this frame.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p2beta1.NormalizedBoundingPoly rotated_bounding_box = 1;
   * </code>
   *
   * @return Whether the rotatedBoundingBox field is set.
   */
  boolean hasRotatedBoundingBox();

  /**
   *
   *
   * <pre>
   * Bounding polygon of the detected text for this frame.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p2beta1.NormalizedBoundingPoly rotated_bounding_box = 1;
   * </code>
   *
   * @return The rotatedBoundingBox.
   */
  com.google.cloud.videointelligence.v1p2beta1.NormalizedBoundingPoly getRotatedBoundingBox();

  /**
   *
   *
   * <pre>
   * Bounding polygon of the detected text for this frame.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p2beta1.NormalizedBoundingPoly rotated_bounding_box = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.NormalizedBoundingPolyOrBuilder
      getRotatedBoundingBoxOrBuilder();

  /**
   *
   *
   * <pre>
   * Timestamp of this frame.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();

  /**
   *
   *
   * <pre>
   * Timestamp of this frame.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();

  /**
   *
   *
   * <pre>
   * Timestamp of this frame.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();
}
