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
// source: google/cloud/video/stitcher/v1/ad_tag_details.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.video.stitcher.v1;

public interface ResponseMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.ResponseMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Error message received when making the ad request.
   * </pre>
   *
   * <code>string error = 1;</code>
   *
   * @return The error.
   */
  java.lang.String getError();

  /**
   *
   *
   * <pre>
   * Error message received when making the ad request.
   * </pre>
   *
   * <code>string error = 1;</code>
   *
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString getErrorBytes();

  /**
   *
   *
   * <pre>
   * Headers from the response.
   * </pre>
   *
   * <code>.google.protobuf.Struct headers = 2;</code>
   *
   * @return Whether the headers field is set.
   */
  boolean hasHeaders();

  /**
   *
   *
   * <pre>
   * Headers from the response.
   * </pre>
   *
   * <code>.google.protobuf.Struct headers = 2;</code>
   *
   * @return The headers.
   */
  com.google.protobuf.Struct getHeaders();

  /**
   *
   *
   * <pre>
   * Headers from the response.
   * </pre>
   *
   * <code>.google.protobuf.Struct headers = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getHeadersOrBuilder();

  /**
   *
   *
   * <pre>
   * Status code for the response.
   * </pre>
   *
   * <code>string status_code = 3;</code>
   *
   * @return The statusCode.
   */
  java.lang.String getStatusCode();

  /**
   *
   *
   * <pre>
   * Status code for the response.
   * </pre>
   *
   * <code>string status_code = 3;</code>
   *
   * @return The bytes for statusCode.
   */
  com.google.protobuf.ByteString getStatusCodeBytes();

  /**
   *
   *
   * <pre>
   * Size in bytes of the response.
   * </pre>
   *
   * <code>int32 size_bytes = 4;</code>
   *
   * @return The sizeBytes.
   */
  int getSizeBytes();

  /**
   *
   *
   * <pre>
   * Total time elapsed for the response.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();

  /**
   *
   *
   * <pre>
   * Total time elapsed for the response.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();

  /**
   *
   *
   * <pre>
   * Total time elapsed for the response.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The body of the response.
   * </pre>
   *
   * <code>string body = 6;</code>
   *
   * @return The body.
   */
  java.lang.String getBody();

  /**
   *
   *
   * <pre>
   * The body of the response.
   * </pre>
   *
   * <code>string body = 6;</code>
   *
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString getBodyBytes();
}
