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
// source: google/cloud/visionai/v1/platform.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface VideoStreamInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.VideoStreamInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string streams = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.visionai.v1.VideoStreamInputConfig.streams is deprecated. See
   *     google/cloud/visionai/v1/platform.proto;l=2040
   * @return A list containing the streams.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.String> getStreamsList();

  /**
   * <code>repeated string streams = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.visionai.v1.VideoStreamInputConfig.streams is deprecated. See
   *     google/cloud/visionai/v1/platform.proto;l=2040
   * @return The count of streams.
   */
  @java.lang.Deprecated
  int getStreamsCount();

  /**
   * <code>repeated string streams = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.visionai.v1.VideoStreamInputConfig.streams is deprecated. See
   *     google/cloud/visionai/v1/platform.proto;l=2040
   * @param index The index of the element to return.
   * @return The streams at the given index.
   */
  @java.lang.Deprecated
  java.lang.String getStreams(int index);

  /**
   * <code>repeated string streams = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.visionai.v1.VideoStreamInputConfig.streams is deprecated. See
   *     google/cloud/visionai/v1/platform.proto;l=2040
   * @param index The index of the value to return.
   * @return The bytes of the streams at the given index.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getStreamsBytes(int index);

  /**
   * <code>
   * repeated .google.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.visionai.v1.StreamWithAnnotation> getStreamsWithAnnotationList();

  /**
   * <code>
   * repeated .google.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.visionai.v1.StreamWithAnnotation getStreamsWithAnnotation(int index);

  /**
   * <code>
   * repeated .google.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getStreamsWithAnnotationCount();

  /**
   * <code>
   * repeated .google.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<? extends com.google.cloud.visionai.v1.StreamWithAnnotationOrBuilder>
      getStreamsWithAnnotationOrBuilderList();

  /**
   * <code>
   * repeated .google.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.visionai.v1.StreamWithAnnotationOrBuilder getStreamsWithAnnotationOrBuilder(
      int index);
}
