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
// source: google/cloud/contentwarehouse/v1/document.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface TimestampArrayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.TimestampArray)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of timestamp values.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.TimestampValue values = 1;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.TimestampValue> getValuesList();

  /**
   *
   *
   * <pre>
   * List of timestamp values.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.TimestampValue values = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.TimestampValue getValues(int index);

  /**
   *
   *
   * <pre>
   * List of timestamp values.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.TimestampValue values = 1;</code>
   */
  int getValuesCount();

  /**
   *
   *
   * <pre>
   * List of timestamp values.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.TimestampValue values = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.TimestampValueOrBuilder>
      getValuesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of timestamp values.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.TimestampValue values = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.TimestampValueOrBuilder getValuesOrBuilder(int index);
}
