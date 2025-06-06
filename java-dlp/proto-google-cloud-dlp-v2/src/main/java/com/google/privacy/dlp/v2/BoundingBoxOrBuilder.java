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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface BoundingBoxOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.BoundingBox)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Top coordinate of the bounding box. (0,0) is upper left.
   * </pre>
   *
   * <code>int32 top = 1;</code>
   *
   * @return The top.
   */
  int getTop();

  /**
   *
   *
   * <pre>
   * Left coordinate of the bounding box. (0,0) is upper left.
   * </pre>
   *
   * <code>int32 left = 2;</code>
   *
   * @return The left.
   */
  int getLeft();

  /**
   *
   *
   * <pre>
   * Width of the bounding box in pixels.
   * </pre>
   *
   * <code>int32 width = 3;</code>
   *
   * @return The width.
   */
  int getWidth();

  /**
   *
   *
   * <pre>
   * Height of the bounding box in pixels.
   * </pre>
   *
   * <code>int32 height = 4;</code>
   *
   * @return The height.
   */
  int getHeight();
}
