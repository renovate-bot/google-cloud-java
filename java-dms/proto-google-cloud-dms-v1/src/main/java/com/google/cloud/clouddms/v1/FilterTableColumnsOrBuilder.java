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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

public interface FilterTableColumnsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.FilterTableColumns)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be included for a particular table.
   * </pre>
   *
   * <code>repeated string include_columns = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the includeColumns.
   */
  java.util.List<java.lang.String> getIncludeColumnsList();

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be included for a particular table.
   * </pre>
   *
   * <code>repeated string include_columns = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of includeColumns.
   */
  int getIncludeColumnsCount();

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be included for a particular table.
   * </pre>
   *
   * <code>repeated string include_columns = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The includeColumns at the given index.
   */
  java.lang.String getIncludeColumns(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be included for a particular table.
   * </pre>
   *
   * <code>repeated string include_columns = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the includeColumns at the given index.
   */
  com.google.protobuf.ByteString getIncludeColumnsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be excluded for a particular table.
   * </pre>
   *
   * <code>repeated string exclude_columns = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the excludeColumns.
   */
  java.util.List<java.lang.String> getExcludeColumnsList();

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be excluded for a particular table.
   * </pre>
   *
   * <code>repeated string exclude_columns = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of excludeColumns.
   */
  int getExcludeColumnsCount();

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be excluded for a particular table.
   * </pre>
   *
   * <code>repeated string exclude_columns = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The excludeColumns at the given index.
   */
  java.lang.String getExcludeColumns(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of columns to be excluded for a particular table.
   * </pre>
   *
   * <code>repeated string exclude_columns = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the excludeColumns at the given index.
   */
  com.google.protobuf.ByteString getExcludeColumnsBytes(int index);
}
