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
// source: google/cloud/datastream/v1alpha1/datastream.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datastream.v1alpha1;

public interface FetchErrorsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.FetchErrorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of errors on the Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.Error errors = 1;</code>
   */
  java.util.List<com.google.cloud.datastream.v1alpha1.Error> getErrorsList();

  /**
   *
   *
   * <pre>
   * The list of errors on the Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.Error errors = 1;</code>
   */
  com.google.cloud.datastream.v1alpha1.Error getErrors(int index);

  /**
   *
   *
   * <pre>
   * The list of errors on the Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.Error errors = 1;</code>
   */
  int getErrorsCount();

  /**
   *
   *
   * <pre>
   * The list of errors on the Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.Error errors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1alpha1.ErrorOrBuilder>
      getErrorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of errors on the Stream.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.Error errors = 1;</code>
   */
  com.google.cloud.datastream.v1alpha1.ErrorOrBuilder getErrorsOrBuilder(int index);
}
