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
// source: google/cloud/run/v2/build.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.run.v2;

public interface SubmitBuildResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.SubmitBuildResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Build operation to be polled via CloudBuild API.
   * </pre>
   *
   * <code>.google.longrunning.Operation build_operation = 1;</code>
   *
   * @return Whether the buildOperation field is set.
   */
  boolean hasBuildOperation();

  /**
   *
   *
   * <pre>
   * Cloud Build operation to be polled via CloudBuild API.
   * </pre>
   *
   * <code>.google.longrunning.Operation build_operation = 1;</code>
   *
   * @return The buildOperation.
   */
  com.google.longrunning.Operation getBuildOperation();

  /**
   *
   *
   * <pre>
   * Cloud Build operation to be polled via CloudBuild API.
   * </pre>
   *
   * <code>.google.longrunning.Operation build_operation = 1;</code>
   */
  com.google.longrunning.OperationOrBuilder getBuildOperationOrBuilder();

  /**
   *
   *
   * <pre>
   * URI of the base builder image in Artifact Registry being used in the build.
   * Used to opt into automatic base image updates.
   * </pre>
   *
   * <code>string base_image_uri = 2;</code>
   *
   * @return The baseImageUri.
   */
  java.lang.String getBaseImageUri();

  /**
   *
   *
   * <pre>
   * URI of the base builder image in Artifact Registry being used in the build.
   * Used to opt into automatic base image updates.
   * </pre>
   *
   * <code>string base_image_uri = 2;</code>
   *
   * @return The bytes for baseImageUri.
   */
  com.google.protobuf.ByteString getBaseImageUriBytes();

  /**
   *
   *
   * <pre>
   * Warning message for the base image.
   * </pre>
   *
   * <code>string base_image_warning = 3;</code>
   *
   * @return The baseImageWarning.
   */
  java.lang.String getBaseImageWarning();

  /**
   *
   *
   * <pre>
   * Warning message for the base image.
   * </pre>
   *
   * <code>string base_image_warning = 3;</code>
   *
   * @return The bytes for baseImageWarning.
   */
  com.google.protobuf.ByteString getBaseImageWarningBytes();
}
