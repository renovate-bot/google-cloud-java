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
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.translate.v3beta1;

public interface DocumentInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.DocumentInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Document's content represented as a stream of bytes.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();

  /**
   *
   *
   * <pre>
   * Document's content represented as a stream of bytes.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location. This must be a single file.
   * For example: gs://example_bucket/example_file.pdf
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 2;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location. This must be a single file.
   * For example: gs://example_bucket/example_file.pdf
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 2;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.translate.v3beta1.GcsSource getGcsSource();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location. This must be a single file.
   * For example: gs://example_bucket/example_file.pdf
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 2;</code>
   */
  com.google.cloud.translate.v3beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the input document's mime_type.
   *
   * If not specified it will be determined using the file extension for
   * gcs_source provided files. For a file provided through bytes content the
   * mime_type must be provided.
   * Currently supported mime types are:
   * - application/pdf
   * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   * </pre>
   *
   * <code>string mime_type = 4;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();

  /**
   *
   *
   * <pre>
   * Specifies the input document's mime_type.
   *
   * If not specified it will be determined using the file extension for
   * gcs_source provided files. For a file provided through bytes content the
   * mime_type must be provided.
   * Currently supported mime types are:
   * - application/pdf
   * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   * </pre>
   *
   * <code>string mime_type = 4;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  com.google.cloud.translate.v3beta1.DocumentInputConfig.SourceCase getSourceCase();
}
