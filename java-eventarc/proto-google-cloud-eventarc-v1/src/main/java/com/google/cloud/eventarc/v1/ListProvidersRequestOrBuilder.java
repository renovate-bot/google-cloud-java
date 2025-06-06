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
// source: google/cloud/eventarc/v1/eventarc.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.eventarc.v1;

public interface ListProvidersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.ListProvidersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent of the provider to get.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent of the provider to get.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of providers to return on each page.
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
   * The page token; provide the value from the `next_page_token` field in a
   * previous `ListProviders` call to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListProviders` must
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
   * The page token; provide the value from the `next_page_token` field in a
   * previous `ListProviders` call to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListProviders` must
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
   * The sorting order of the resources returned. Value should be a
   * comma-separated list of fields. The default sorting oder is ascending. To
   * specify descending order for a field, append a `desc` suffix; for example:
   * `name desc, _id`.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();

  /**
   *
   *
   * <pre>
   * The sorting order of the resources returned. Value should be a
   * comma-separated list of fields. The default sorting oder is ascending. To
   * specify descending order for a field, append a `desc` suffix; for example:
   * `name desc, _id`.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * The filter field that the list request will filter on.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * The filter field that the list request will filter on.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
