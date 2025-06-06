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

public interface ObjectTrackingAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Non-streaming batch mode ONLY.
   * Each object track corresponds to one video segment where it appears.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.VideoSegment segment = 3;</code>
   *
   * @return Whether the segment field is set.
   */
  boolean hasSegment();

  /**
   *
   *
   * <pre>
   * Non-streaming batch mode ONLY.
   * Each object track corresponds to one video segment where it appears.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.VideoSegment segment = 3;</code>
   *
   * @return The segment.
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegment getSegment();

  /**
   *
   *
   * <pre>
   * Non-streaming batch mode ONLY.
   * Each object track corresponds to one video segment where it appears.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.VideoSegment segment = 3;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder getSegmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Streaming mode ONLY.
   * In streaming mode, we do not know the end time of a tracked object
   * before it is completed. Hence, there is no VideoSegment info returned.
   * Instead, we provide a unique identifiable integer track_id so that
   * the customers can correlate the results of the ongoing
   * ObjectTrackAnnotation of the same track_id over time.
   * </pre>
   *
   * <code>int64 track_id = 5;</code>
   *
   * @return Whether the trackId field is set.
   */
  boolean hasTrackId();

  /**
   *
   *
   * <pre>
   * Streaming mode ONLY.
   * In streaming mode, we do not know the end time of a tracked object
   * before it is completed. Hence, there is no VideoSegment info returned.
   * Instead, we provide a unique identifiable integer track_id so that
   * the customers can correlate the results of the ongoing
   * ObjectTrackAnnotation of the same track_id over time.
   * </pre>
   *
   * <code>int64 track_id = 5;</code>
   *
   * @return The trackId.
   */
  long getTrackId();

  /**
   *
   *
   * <pre>
   * Entity to specify the object category that this track is labeled as.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Entity entity = 1;</code>
   *
   * @return Whether the entity field is set.
   */
  boolean hasEntity();

  /**
   *
   *
   * <pre>
   * Entity to specify the object category that this track is labeled as.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Entity entity = 1;</code>
   *
   * @return The entity.
   */
  com.google.cloud.videointelligence.v1p3beta1.Entity getEntity();

  /**
   *
   *
   * <pre>
   * Entity to specify the object category that this track is labeled as.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Entity entity = 1;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.EntityOrBuilder getEntityOrBuilder();

  /**
   *
   *
   * <pre>
   * Object category's labeling confidence of this track.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   *
   * @return The confidence.
   */
  float getConfidence();

  /**
   *
   *
   * <pre>
   * Information corresponding to all frames where this object track appears.
   * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
   * messages in frames.
   * Streaming mode: it can only be one ObjectTrackingFrame message in frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrame frames = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrame> getFramesList();

  /**
   *
   *
   * <pre>
   * Information corresponding to all frames where this object track appears.
   * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
   * messages in frames.
   * Streaming mode: it can only be one ObjectTrackingFrame message in frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrame frames = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrame getFrames(int index);

  /**
   *
   *
   * <pre>
   * Information corresponding to all frames where this object track appears.
   * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
   * messages in frames.
   * Streaming mode: it can only be one ObjectTrackingFrame message in frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrame frames = 2;</code>
   */
  int getFramesCount();

  /**
   *
   *
   * <pre>
   * Information corresponding to all frames where this object track appears.
   * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
   * messages in frames.
   * Streaming mode: it can only be one ObjectTrackingFrame message in frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrame frames = 2;</code>
   */
  java.util.List<
          ? extends com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrameOrBuilder>
      getFramesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Information corresponding to all frames where this object track appears.
   * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
   * messages in frames.
   * Streaming mode: it can only be one ObjectTrackingFrame message in frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrame frames = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingFrameOrBuilder getFramesOrBuilder(
      int index);

  com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation.TrackInfoCase
      getTrackInfoCase();
}
