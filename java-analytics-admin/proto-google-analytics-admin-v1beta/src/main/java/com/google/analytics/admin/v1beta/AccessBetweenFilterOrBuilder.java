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
// source: google/analytics/admin/v1beta/access_report.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1beta;

public interface AccessBetweenFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.AccessBetweenFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue from_value = 1;</code>
   *
   * @return Whether the fromValue field is set.
   */
  boolean hasFromValue();

  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue from_value = 1;</code>
   *
   * @return The fromValue.
   */
  com.google.analytics.admin.v1beta.NumericValue getFromValue();

  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue from_value = 1;</code>
   */
  com.google.analytics.admin.v1beta.NumericValueOrBuilder getFromValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue to_value = 2;</code>
   *
   * @return Whether the toValue field is set.
   */
  boolean hasToValue();

  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue to_value = 2;</code>
   *
   * @return The toValue.
   */
  com.google.analytics.admin.v1beta.NumericValue getToValue();

  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue to_value = 2;</code>
   */
  com.google.analytics.admin.v1beta.NumericValueOrBuilder getToValueOrBuilder();
}
