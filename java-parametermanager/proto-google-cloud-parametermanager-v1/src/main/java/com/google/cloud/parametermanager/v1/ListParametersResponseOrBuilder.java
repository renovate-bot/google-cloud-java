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
// source: google/cloud/parametermanager/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.parametermanager.v1;

public interface ListParametersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.parametermanager.v1.ListParametersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of Parameters
   * </pre>
   *
   * <code>repeated .google.cloud.parametermanager.v1.Parameter parameters = 1;</code>
   */
  java.util.List<com.google.cloud.parametermanager.v1.Parameter> getParametersList();

  /**
   *
   *
   * <pre>
   * The list of Parameters
   * </pre>
   *
   * <code>repeated .google.cloud.parametermanager.v1.Parameter parameters = 1;</code>
   */
  com.google.cloud.parametermanager.v1.Parameter getParameters(int index);

  /**
   *
   *
   * <pre>
   * The list of Parameters
   * </pre>
   *
   * <code>repeated .google.cloud.parametermanager.v1.Parameter parameters = 1;</code>
   */
  int getParametersCount();

  /**
   *
   *
   * <pre>
   * The list of Parameters
   * </pre>
   *
   * <code>repeated .google.cloud.parametermanager.v1.Parameter parameters = 1;</code>
   */
  java.util.List<? extends com.google.cloud.parametermanager.v1.ParameterOrBuilder>
      getParametersOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of Parameters
   * </pre>
   *
   * <code>repeated .google.cloud.parametermanager.v1.Parameter parameters = 1;</code>
   */
  com.google.cloud.parametermanager.v1.ParameterOrBuilder getParametersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();

  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();

  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);

  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
