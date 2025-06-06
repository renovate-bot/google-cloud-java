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
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.videointelligence.v1p1beta1;

public interface AnnotateVideoResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.AnnotateVideoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults>
      getAnnotationResultsList();

  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults getAnnotationResults(
      int index);

  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  int getAnnotationResultsCount();

  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationResultsOrBuilder>
      getAnnotationResultsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p1beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationResultsOrBuilder
      getAnnotationResultsOrBuilder(int index);
}
