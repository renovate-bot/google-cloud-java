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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface ViewIndexedAssetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ViewIndexedAssetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The index that owns this collection of assets.
   * Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The index.
   */
  java.lang.String getIndex();

  /**
   *
   *
   * <pre>
   * Required. The index that owns this collection of assets.
   * Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for index.
   */
  com.google.protobuf.ByteString getIndexBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of assets to return. The service may return fewer than
   * this value.
   * If unspecified, at most 50 assets will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ViewIndexedAssets` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ViewIndexedAssets` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ViewIndexedAssets` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ViewIndexedAssets` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The filter applied to the returned list.
   * Only the following filterings are supported:
   * "asset_id = xxxx", which returns asset with specified id.
   * "asset_id = xxxx, yyyy, zzzz", which returns assets with specified ids.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * The filter applied to the returned list.
   * Only the following filterings are supported:
   * "asset_id = xxxx", which returns asset with specified id.
   * "asset_id = xxxx, yyyy, zzzz", which returns assets with specified ids.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
