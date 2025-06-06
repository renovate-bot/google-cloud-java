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
// source: google/cloud/backupdr/v1/backupvault_gce.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

public interface TagsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.Tags)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. An array of tags. Each tag must be 1-63 characters long, and
   * comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the items.
   */
  java.util.List<java.lang.String> getItemsList();

  /**
   *
   *
   * <pre>
   * Optional. An array of tags. Each tag must be 1-63 characters long, and
   * comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of items.
   */
  int getItemsCount();

  /**
   *
   *
   * <pre>
   * Optional. An array of tags. Each tag must be 1-63 characters long, and
   * comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The items at the given index.
   */
  java.lang.String getItems(int index);

  /**
   *
   *
   * <pre>
   * Optional. An array of tags. Each tag must be 1-63 characters long, and
   * comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the items at the given index.
   */
  com.google.protobuf.ByteString getItemsBytes(int index);
}
