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
// source: google/cloud/discoveryengine/v1alpha/session_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public interface ListFilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.ListFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Session.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/engines/{engine}/sessions/{session}`
   * Name of the session resource to which the file belong.
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
   * Required. The resource name of the Session.
   * Format:
   * `projects/{project}/locations/{location}/collections/{collection}/engines/{engine}/sessions/{session}`
   * Name of the session resource to which the file belong.
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
   * Optional. The filter syntax consists of an expression language for
   * constructing a predicate from one or more fields of the files being
   * filtered. Filter expression is case-sensitive. Currently supported field
   * names are:
   * * upload_time
   * * last_add_time
   * * last_use_time
   * * file_name
   * * mime_type
   *
   * Some examples of filters would be:
   * * "file_name = 'file_1'"
   * * "file_name = 'file_1' AND mime_type = 'text/plain'"
   * * "last_use_time &gt; '2025-06-14T12:00:00Z'"
   *
   * For a full description of the filter format, please
   * see https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Optional. The filter syntax consists of an expression language for
   * constructing a predicate from one or more fields of the files being
   * filtered. Filter expression is case-sensitive. Currently supported field
   * names are:
   * * upload_time
   * * last_add_time
   * * last_use_time
   * * file_name
   * * mime_type
   *
   * Some examples of filters would be:
   * * "file_name = 'file_1'"
   * * "file_name = 'file_1' AND mime_type = 'text/plain'"
   * * "last_use_time &gt; '2025-06-14T12:00:00Z'"
   *
   * For a full description of the filter format, please
   * see https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of files to return. The service may return
   * fewer than this value. If unspecified, at most 100 files will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
   * If user specifies a value less than or equal to 0 - the request will be
   * rejected with an INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token received from a previous `ListFiles` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListFiles`
   * must match the call that provided the page token (except `page_size`, which
   * may differ).
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * Optional. A page token received from a previous `ListFiles` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListFiles`
   * must match the call that provided the page token (except `page_size`, which
   * may differ).
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
