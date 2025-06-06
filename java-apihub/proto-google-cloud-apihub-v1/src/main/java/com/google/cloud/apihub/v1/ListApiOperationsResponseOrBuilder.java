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
// source: google/cloud/apihub/v1/apihub_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

public interface ListApiOperationsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.ListApiOperationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The operations corresponding to an API version.
   * Only following field will be populated in the response: name,
   * spec, details.deprecated, details.http_operation.path.path,
   * details.http_operation.method and details.documentation.external_uri.
   * </pre>
   *
   * <code>repeated .google.cloud.apihub.v1.ApiOperation api_operations = 1;</code>
   */
  java.util.List<com.google.cloud.apihub.v1.ApiOperation> getApiOperationsList();

  /**
   *
   *
   * <pre>
   * The operations corresponding to an API version.
   * Only following field will be populated in the response: name,
   * spec, details.deprecated, details.http_operation.path.path,
   * details.http_operation.method and details.documentation.external_uri.
   * </pre>
   *
   * <code>repeated .google.cloud.apihub.v1.ApiOperation api_operations = 1;</code>
   */
  com.google.cloud.apihub.v1.ApiOperation getApiOperations(int index);

  /**
   *
   *
   * <pre>
   * The operations corresponding to an API version.
   * Only following field will be populated in the response: name,
   * spec, details.deprecated, details.http_operation.path.path,
   * details.http_operation.method and details.documentation.external_uri.
   * </pre>
   *
   * <code>repeated .google.cloud.apihub.v1.ApiOperation api_operations = 1;</code>
   */
  int getApiOperationsCount();

  /**
   *
   *
   * <pre>
   * The operations corresponding to an API version.
   * Only following field will be populated in the response: name,
   * spec, details.deprecated, details.http_operation.path.path,
   * details.http_operation.method and details.documentation.external_uri.
   * </pre>
   *
   * <code>repeated .google.cloud.apihub.v1.ApiOperation api_operations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.apihub.v1.ApiOperationOrBuilder>
      getApiOperationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The operations corresponding to an API version.
   * Only following field will be populated in the response: name,
   * spec, details.deprecated, details.http_operation.path.path,
   * details.http_operation.method and details.documentation.external_uri.
   * </pre>
   *
   * <code>repeated .google.cloud.apihub.v1.ApiOperation api_operations = 1;</code>
   */
  com.google.cloud.apihub.v1.ApiOperationOrBuilder getApiOperationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
