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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tpu.v2alpha1;

public interface ListQueuedResourcesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.ListQueuedResourcesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The listed queued resources.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.QueuedResource queued_resources = 1;</code>
   */
  java.util.List<com.google.cloud.tpu.v2alpha1.QueuedResource> getQueuedResourcesList();

  /**
   *
   *
   * <pre>
   * The listed queued resources.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.QueuedResource queued_resources = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource getQueuedResources(int index);

  /**
   *
   *
   * <pre>
   * The listed queued resources.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.QueuedResource queued_resources = 1;</code>
   */
  int getQueuedResourcesCount();

  /**
   *
   *
   * <pre>
   * The listed queued resources.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.QueuedResource queued_resources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2alpha1.QueuedResourceOrBuilder>
      getQueuedResourcesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The listed queued resources.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.QueuedResource queued_resources = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceOrBuilder getQueuedResourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The next page token or empty if none.
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
   * The next page token or empty if none.
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
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();

  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();

  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);

  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
