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
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

public interface ListEntitiesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
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
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
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
   * Required. Specify the entity view to make a partial list request.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.ListEntitiesRequest.EntityView view = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();

  /**
   *
   *
   * <pre>
   * Required. Specify the entity view to make a partial list request.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.ListEntitiesRequest.EntityView view = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The view.
   */
  com.google.cloud.dataplex.v1.ListEntitiesRequest.EntityView getView();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of entities to return. The service may return
   * fewer than this value. If unspecified, 100 entities will be returned by
   * default. The maximum value is 500; larger values will will be truncated to
   * 500.
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
   * Optional. Page token received from a previous `ListEntities` call. Provide
   * this to retrieve the subsequent page. When paginating, all other parameters
   * provided to `ListEntities` must match the call that provided the
   * page token.
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
   * Optional. Page token received from a previous `ListEntities` call. Provide
   * this to retrieve the subsequent page. When paginating, all other parameters
   * provided to `ListEntities` must match the call that provided the
   * page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The following filter parameters can be added to the URL to limit
   * the entities returned by the API:
   *
   * - Entity ID: ?filter="id=entityID"
   * - Asset ID: ?filter="asset=assetID"
   * - Data path ?filter="data_path=gs://my-bucket"
   * - Is HIVE compatible: ?filter="hive_compatible=true"
   * - Is BigQuery compatible: ?filter="bigquery_compatible=true"
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Optional. The following filter parameters can be added to the URL to limit
   * the entities returned by the API:
   *
   * - Entity ID: ?filter="id=entityID"
   * - Asset ID: ?filter="asset=assetID"
   * - Data path ?filter="data_path=gs://my-bucket"
   * - Is HIVE compatible: ?filter="hive_compatible=true"
   * - Is BigQuery compatible: ?filter="bigquery_compatible=true"
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
