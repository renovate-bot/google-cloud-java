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
// source: google/cloud/alloydb/v1alpha/data_model.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1alpha;

public interface SqlResultValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.SqlResultValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The cell value represented in string format.
   * Timestamps are converted to string using RFC3339Nano format.
   * </pre>
   *
   * <code>optional string value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();

  /**
   *
   *
   * <pre>
   * The cell value represented in string format.
   * Timestamps are converted to string using RFC3339Nano format.
   * </pre>
   *
   * <code>optional string value = 1;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();

  /**
   *
   *
   * <pre>
   * The cell value represented in string format.
   * Timestamps are converted to string using RFC3339Nano format.
   * </pre>
   *
   * <code>optional string value = 1;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * Set to true if cell value is null.
   * </pre>
   *
   * <code>optional bool null_value = 2;</code>
   *
   * @return Whether the nullValue field is set.
   */
  boolean hasNullValue();

  /**
   *
   *
   * <pre>
   * Set to true if cell value is null.
   * </pre>
   *
   * <code>optional bool null_value = 2;</code>
   *
   * @return The nullValue.
   */
  boolean getNullValue();
}
