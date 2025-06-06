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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.videointelligence.v1;

public interface NormalizedBoundingBoxOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.NormalizedBoundingBox)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Left X coordinate.
   * </pre>
   *
   * <code>float left = 1;</code>
   *
   * @return The left.
   */
  float getLeft();

  /**
   *
   *
   * <pre>
   * Top Y coordinate.
   * </pre>
   *
   * <code>float top = 2;</code>
   *
   * @return The top.
   */
  float getTop();

  /**
   *
   *
   * <pre>
   * Right X coordinate.
   * </pre>
   *
   * <code>float right = 3;</code>
   *
   * @return The right.
   */
  float getRight();

  /**
   *
   *
   * <pre>
   * Bottom Y coordinate.
   * </pre>
   *
   * <code>float bottom = 4;</code>
   *
   * @return The bottom.
   */
  float getBottom();
}
