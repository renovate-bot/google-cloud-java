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
// source: google/cloud/bigquery/migration/v2/translation_details.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.migration.v2;

public interface LiteralOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.Literal)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Literal string data.
   * </pre>
   *
   * <code>string literal_string = 2;</code>
   *
   * @return Whether the literalString field is set.
   */
  boolean hasLiteralString();

  /**
   *
   *
   * <pre>
   * Literal string data.
   * </pre>
   *
   * <code>string literal_string = 2;</code>
   *
   * @return The literalString.
   */
  java.lang.String getLiteralString();

  /**
   *
   *
   * <pre>
   * Literal string data.
   * </pre>
   *
   * <code>string literal_string = 2;</code>
   *
   * @return The bytes for literalString.
   */
  com.google.protobuf.ByteString getLiteralStringBytes();

  /**
   *
   *
   * <pre>
   * Literal byte data.
   * </pre>
   *
   * <code>bytes literal_bytes = 3;</code>
   *
   * @return Whether the literalBytes field is set.
   */
  boolean hasLiteralBytes();

  /**
   *
   *
   * <pre>
   * Literal byte data.
   * </pre>
   *
   * <code>bytes literal_bytes = 3;</code>
   *
   * @return The literalBytes.
   */
  com.google.protobuf.ByteString getLiteralBytes();

  /**
   *
   *
   * <pre>
   * Required. The identifier of the literal entry.
   * </pre>
   *
   * <code>string relative_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The relativePath.
   */
  java.lang.String getRelativePath();

  /**
   *
   *
   * <pre>
   * Required. The identifier of the literal entry.
   * </pre>
   *
   * <code>string relative_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for relativePath.
   */
  com.google.protobuf.ByteString getRelativePathBytes();

  com.google.cloud.bigquery.migration.v2.Literal.LiteralDataCase getLiteralDataCase();
}
