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
// source: google/cloud/run/v2/k8s.min.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.run.v2;

public interface BuildInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.BuildInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Entry point of the function when the image is a Cloud Run
   * function.
   * </pre>
   *
   * <code>string function_target = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The functionTarget.
   */
  java.lang.String getFunctionTarget();

  /**
   *
   *
   * <pre>
   * Output only. Entry point of the function when the image is a Cloud Run
   * function.
   * </pre>
   *
   * <code>string function_target = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for functionTarget.
   */
  com.google.protobuf.ByteString getFunctionTargetBytes();

  /**
   *
   *
   * <pre>
   * Output only. Source code location of the image.
   * </pre>
   *
   * <code>string source_location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sourceLocation.
   */
  java.lang.String getSourceLocation();

  /**
   *
   *
   * <pre>
   * Output only. Source code location of the image.
   * </pre>
   *
   * <code>string source_location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for sourceLocation.
   */
  com.google.protobuf.ByteString getSourceLocationBytes();
}
