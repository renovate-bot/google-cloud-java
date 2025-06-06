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
// source: google/cloud/dataproc/v1/batches.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface ListBatchesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListBatchesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of batches.
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
   * Required. The parent, which owns this collection of batches.
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
   * Optional. The maximum number of batches to return in each response.
   * The service may return fewer than this value.
   * The default page size is 20; the maximum page size is 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token received from a previous `ListBatches` call.
   * Provide this token to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * Optional. A page token received from a previous `ListBatches` call.
   * Provide this token to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A filter for the batches to return in the response.
   *
   * A filter is a logical expression constraining the values of various fields
   * in each batch resource. Filters are case sensitive, and may contain
   * multiple clauses combined with logical operators (AND/OR).
   * Supported fields are `batch_id`, `batch_uuid`, `state`, and `create_time`.
   *
   * e.g. `state = RUNNING and create_time &lt; "2023-01-01T00:00:00Z"`
   * filters for batches in state RUNNING that were created before 2023-01-01
   *
   * See https://google.aip.dev/assets/misc/ebnf-filtering.txt for a detailed
   * description of the filter syntax and a list of supported comparisons.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Optional. A filter for the batches to return in the response.
   *
   * A filter is a logical expression constraining the values of various fields
   * in each batch resource. Filters are case sensitive, and may contain
   * multiple clauses combined with logical operators (AND/OR).
   * Supported fields are `batch_id`, `batch_uuid`, `state`, and `create_time`.
   *
   * e.g. `state = RUNNING and create_time &lt; "2023-01-01T00:00:00Z"`
   * filters for batches in state RUNNING that were created before 2023-01-01
   *
   * See https://google.aip.dev/assets/misc/ebnf-filtering.txt for a detailed
   * description of the filter syntax and a list of supported comparisons.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Field(s) on which to sort the list of batches.
   *
   * Currently the only supported sort orders are unspecified (empty) and
   * `create_time desc` to sort by most recently created batches first.
   *
   * See https://google.aip.dev/132#ordering for more details.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();

  /**
   *
   *
   * <pre>
   * Optional. Field(s) on which to sort the list of batches.
   *
   * Currently the only supported sort orders are unspecified (empty) and
   * `create_time desc` to sort by most recently created batches first.
   *
   * See https://google.aip.dev/132#ordering for more details.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
