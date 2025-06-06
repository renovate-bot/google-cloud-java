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
// source: google/cloud/alloydb/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1;

public interface ListSupportedDatabaseFlagsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.ListSupportedDatabaseFlagsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource. The required format is:
   *  * projects/{project}/locations/{location}
   *
   * Regardless of the parent specified here, as long it is contains a valid
   * project and location, the service will return a static list of supported
   * flags resources. Note that we do not yet support region-specific
   * flags.
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
   * Required. The name of the parent resource. The required format is:
   *  * projects/{project}/locations/{location}
   *
   * Regardless of the parent specified here, as long it is contains a valid
   * project and location, the service will return a static list of supported
   * flags resources. Note that we do not yet support region-specific
   * flags.
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
   * Requested page size. Server may return fewer items than requested.
   * If unspecified, server will pick an appropriate default.
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
   * A token identifying a page of results the server should return.
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
   * A token identifying a page of results the server should return.
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
   * Optional. The scope for which supported flags are requested. If not
   * specified, default is DATABASE.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SupportedDatabaseFlag.Scope scope = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();

  /**
   *
   *
   * <pre>
   * Optional. The scope for which supported flags are requested. If not
   * specified, default is DATABASE.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SupportedDatabaseFlag.Scope scope = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scope.
   */
  com.google.cloud.alloydb.v1.SupportedDatabaseFlag.Scope getScope();
}
