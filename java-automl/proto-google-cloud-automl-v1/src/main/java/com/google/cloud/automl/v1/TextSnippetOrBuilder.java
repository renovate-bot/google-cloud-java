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
// source: google/cloud/automl/v1/data_items.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1;

public interface TextSnippetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.TextSnippet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The content of the text snippet as a string. Up to 250000
   * characters long.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();

  /**
   *
   *
   * <pre>
   * Required. The content of the text snippet as a string. Up to 250000
   * characters long.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The format of [content][google.cloud.automl.v1.TextSnippet.content]. Currently the only two allowed
   * values are "text/html" and "text/plain". If left blank, the format is
   * automatically determined from the type of the uploaded [content][google.cloud.automl.v1.TextSnippet.content].
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();

  /**
   *
   *
   * <pre>
   * Optional. The format of [content][google.cloud.automl.v1.TextSnippet.content]. Currently the only two allowed
   * values are "text/html" and "text/plain". If left blank, the format is
   * automatically determined from the type of the uploaded [content][google.cloud.automl.v1.TextSnippet.content].
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. HTTP URI where you can download the content.
   * </pre>
   *
   * <code>string content_uri = 4;</code>
   *
   * @return The contentUri.
   */
  java.lang.String getContentUri();

  /**
   *
   *
   * <pre>
   * Output only. HTTP URI where you can download the content.
   * </pre>
   *
   * <code>string content_uri = 4;</code>
   *
   * @return The bytes for contentUri.
   */
  com.google.protobuf.ByteString getContentUriBytes();
}
