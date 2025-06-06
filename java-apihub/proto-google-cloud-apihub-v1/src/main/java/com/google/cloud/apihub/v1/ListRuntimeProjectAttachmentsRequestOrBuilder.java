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
// source: google/cloud/apihub/v1/runtime_project_attachment_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

public interface ListRuntimeProjectAttachmentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.ListRuntimeProjectAttachmentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of runtime project
   * attachments. Format: `projects/{project}/locations/{location}`
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
   * Required. The parent, which owns this collection of runtime project
   * attachments. Format: `projects/{project}/locations/{location}`
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
   * Optional. The maximum number of runtime project attachments to return. The
   * service may return fewer than this value. If unspecified, at most 50
   * runtime project attachments will be returned. The maximum value is 1000;
   * values above 1000 will be coerced to 1000.
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
   * Optional. A page token, received from a previous
   * `ListRuntimeProjectAttachments` call. Provide this to retrieve the
   * subsequent page.
   *
   * When paginating, all other parameters (except page_size) provided to
   * `ListRuntimeProjectAttachments` must match the call that provided the page
   * token.
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
   * Optional. A page token, received from a previous
   * `ListRuntimeProjectAttachments` call. Provide this to retrieve the
   * subsequent page.
   *
   * When paginating, all other parameters (except page_size) provided to
   * `ListRuntimeProjectAttachments` must match the call that provided the page
   * token.
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
   * Optional. An expression that filters the list of RuntimeProjectAttachments.
   *
   * A filter expression consists of a field name, a comparison
   * operator, and a value for filtering. The value must be a string. All
   * standard operators as documented at https://google.aip.dev/160 are
   * supported.
   *
   * The following fields in the `RuntimeProjectAttachment` are eligible for
   * filtering:
   *
   *   * `name` - The name of the RuntimeProjectAttachment.
   *   * `create_time` - The time at which the RuntimeProjectAttachment was
   *   created. The value should be in the
   *   (RFC3339)[https://tools.ietf.org/html/rfc3339] format.
   *   * `runtime_project` - The Google cloud project associated with the
   *   RuntimeProjectAttachment.
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
   * Optional. An expression that filters the list of RuntimeProjectAttachments.
   *
   * A filter expression consists of a field name, a comparison
   * operator, and a value for filtering. The value must be a string. All
   * standard operators as documented at https://google.aip.dev/160 are
   * supported.
   *
   * The following fields in the `RuntimeProjectAttachment` are eligible for
   * filtering:
   *
   *   * `name` - The name of the RuntimeProjectAttachment.
   *   * `create_time` - The time at which the RuntimeProjectAttachment was
   *   created. The value should be in the
   *   (RFC3339)[https://tools.ietf.org/html/rfc3339] format.
   *   * `runtime_project` - The Google cloud project associated with the
   *   RuntimeProjectAttachment.
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
   * Optional. Hint for how to order the results.
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
   * Optional. Hint for how to order the results.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
