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
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vision.v1p3beta1;

public interface LocalizedObjectAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.LocalizedObjectAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Object ID that should align with EntityAnnotation mid.
   * </pre>
   *
   * <code>string mid = 1;</code>
   *
   * @return The mid.
   */
  java.lang.String getMid();

  /**
   *
   *
   * <pre>
   * Object ID that should align with EntityAnnotation mid.
   * </pre>
   *
   * <code>string mid = 1;</code>
   *
   * @return The bytes for mid.
   */
  com.google.protobuf.ByteString getMidBytes();

  /**
   *
   *
   * <pre>
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();

  /**
   *
   *
   * <pre>
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Object name, expressed in its `language_code` language.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Object name, expressed in its `language_code` language.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Score of the result. Range [0, 1].
   * </pre>
   *
   * <code>float score = 4;</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 5;</code>
   *
   * @return Whether the boundingPoly field is set.
   */
  boolean hasBoundingPoly();

  /**
   *
   *
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 5;</code>
   *
   * @return The boundingPoly.
   */
  com.google.cloud.vision.v1p3beta1.BoundingPoly getBoundingPoly();

  /**
   *
   *
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 5;</code>
   */
  com.google.cloud.vision.v1p3beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();
}
