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
// source: google/cloud/configdelivery/v1beta/config_delivery.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.configdelivery.v1beta;

public interface ReleaseInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.configdelivery.v1beta.ReleaseInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. path to the oci image the service uploads to on a `Release`
   * creation.
   * </pre>
   *
   * <code>string oci_image_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ociImagePath.
   */
  java.lang.String getOciImagePath();

  /**
   *
   *
   * <pre>
   * Output only. path to the oci image the service uploads to on a `Release`
   * creation.
   * </pre>
   *
   * <code>string oci_image_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ociImagePath.
   */
  com.google.protobuf.ByteString getOciImagePathBytes();

  /**
   *
   *
   * <pre>
   * Output only. per-variant paths to the oci images the service uploads on
   * package release creation
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; variant_oci_image_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getVariantOciImagePathsCount();

  /**
   *
   *
   * <pre>
   * Output only. per-variant paths to the oci images the service uploads on
   * package release creation
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; variant_oci_image_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsVariantOciImagePaths(java.lang.String key);

  /** Use {@link #getVariantOciImagePathsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getVariantOciImagePaths();

  /**
   *
   *
   * <pre>
   * Output only. per-variant paths to the oci images the service uploads on
   * package release creation
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; variant_oci_image_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getVariantOciImagePathsMap();

  /**
   *
   *
   * <pre>
   * Output only. per-variant paths to the oci images the service uploads on
   * package release creation
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; variant_oci_image_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  java.lang.String getVariantOciImagePathsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. per-variant paths to the oci images the service uploads on
   * package release creation
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; variant_oci_image_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getVariantOciImagePathsOrThrow(java.lang.String key);
}
