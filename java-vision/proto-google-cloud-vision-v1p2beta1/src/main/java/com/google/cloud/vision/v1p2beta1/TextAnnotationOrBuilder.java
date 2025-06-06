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
// source: google/cloud/vision/v1p2beta1/text_annotation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vision.v1p2beta1;

public interface TextAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.TextAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Page pages = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p2beta1.Page> getPagesList();

  /**
   *
   *
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Page pages = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.Page getPages(int index);

  /**
   *
   *
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Page pages = 1;</code>
   */
  int getPagesCount();

  /**
   *
   *
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Page pages = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p2beta1.PageOrBuilder> getPagesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.Page pages = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.PageOrBuilder getPagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * UTF-8 text detected on the pages.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return The text.
   */
  java.lang.String getText();

  /**
   *
   *
   * <pre>
   * UTF-8 text detected on the pages.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();
}
