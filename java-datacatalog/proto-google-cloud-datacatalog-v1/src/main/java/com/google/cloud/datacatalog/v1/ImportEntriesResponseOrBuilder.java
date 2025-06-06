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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

public interface ImportEntriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ImportEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cumulative number of entries created and entries updated as a result of
   * import operation.
   * </pre>
   *
   * <code>optional int64 upserted_entries_count = 5;</code>
   *
   * @return Whether the upsertedEntriesCount field is set.
   */
  boolean hasUpsertedEntriesCount();

  /**
   *
   *
   * <pre>
   * Cumulative number of entries created and entries updated as a result of
   * import operation.
   * </pre>
   *
   * <code>optional int64 upserted_entries_count = 5;</code>
   *
   * @return The upsertedEntriesCount.
   */
  long getUpsertedEntriesCount();

  /**
   *
   *
   * <pre>
   * Number of entries deleted as a result of import operation.
   * </pre>
   *
   * <code>optional int64 deleted_entries_count = 6;</code>
   *
   * @return Whether the deletedEntriesCount field is set.
   */
  boolean hasDeletedEntriesCount();

  /**
   *
   *
   * <pre>
   * Number of entries deleted as a result of import operation.
   * </pre>
   *
   * <code>optional int64 deleted_entries_count = 6;</code>
   *
   * @return The deletedEntriesCount.
   */
  long getDeletedEntriesCount();
}
