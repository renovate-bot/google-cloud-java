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
// source: google/cloud/parallelstore/v1/parallelstore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.parallelstore.v1;

public interface SourceGcsBucketOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.parallelstore.v1.SourceGcsBucket)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. URI to a Cloud Storage bucket in the format:
   * `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;`. The path inside the bucket is
   * optional.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();

  /**
   *
   *
   * <pre>
   * Required. URI to a Cloud Storage bucket in the format:
   * `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;`. The path inside the bucket is
   * optional.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();
}
