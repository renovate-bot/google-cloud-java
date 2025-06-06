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
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.speech.v2;

public interface RecognitionResponseMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.RecognitionResponseMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Global request identifier auto-generated by the API.
   * </pre>
   *
   * <code>string request_id = 9 [(.google.api.field_info) = { ... }</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * Global request identifier auto-generated by the API.
   * </pre>
   *
   * <code>string request_id = 9 [(.google.api.field_info) = { ... }</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
   *
   * @return Whether the totalBilledDuration field is set.
   */
  boolean hasTotalBilledDuration();

  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
   *
   * @return The totalBilledDuration.
   */
  com.google.protobuf.Duration getTotalBilledDuration();

  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getTotalBilledDurationOrBuilder();
}
