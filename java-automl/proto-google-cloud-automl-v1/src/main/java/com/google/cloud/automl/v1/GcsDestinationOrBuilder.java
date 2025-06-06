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
// source: google/cloud/automl/v1/io.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1;

public interface GcsDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URI to output directory, up to 2000
   * characters long.
   * Accepted forms:
   * * Prefix path: gs://bucket/directory
   * The requesting user must have write permission to the bucket.
   * The directory is created if it doesn't exist.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The outputUriPrefix.
   */
  java.lang.String getOutputUriPrefix();

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URI to output directory, up to 2000
   * characters long.
   * Accepted forms:
   * * Prefix path: gs://bucket/directory
   * The requesting user must have write permission to the bucket.
   * The directory is created if it doesn't exist.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for outputUriPrefix.
   */
  com.google.protobuf.ByteString getOutputUriPrefixBytes();
}
