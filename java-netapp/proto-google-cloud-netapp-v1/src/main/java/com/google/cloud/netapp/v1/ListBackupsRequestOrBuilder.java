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
// source: google/cloud/netapp/v1/backup.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

public interface ListBackupsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.ListBackupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The backupVault for which to retrieve backup information,
   * in the format
   * `projects/{project_id}/locations/{location}/backupVaults/{backup_vault_id}`.
   * To retrieve backup information for all locations, use "-" for the
   * `{location}` value.
   * To retrieve backup information for all backupVaults, use "-" for the
   * `{backup_vault_id}` value.
   * To retrieve backup information for a volume, use "-" for the
   * `{backup_vault_id}` value and specify volume full name with the filter.
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
   * Required. The backupVault for which to retrieve backup information,
   * in the format
   * `projects/{project_id}/locations/{location}/backupVaults/{backup_vault_id}`.
   * To retrieve backup information for all locations, use "-" for the
   * `{location}` value.
   * To retrieve backup information for all backupVaults, use "-" for the
   * `{backup_vault_id}` value.
   * To retrieve backup information for a volume, use "-" for the
   * `{backup_vault_id}` value and specify volume full name with the filter.
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
   * The maximum number of items to return. The service may return fewer
   * than this value. The maximum value
   * is 1000; values above 1000 will be coerced to 1000.
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
   * The next_page_token value to use if there are additional
   * results to retrieve for this list request.
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
   * The next_page_token value to use if there are additional
   * results to retrieve for this list request.
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
   * Sort results. Supported values are "name", "name desc" or "" (unsorted).
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
   * Sort results. Supported values are "name", "name desc" or "" (unsorted).
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
   * The standard list filter.
   * If specified, backups will be returned based on the attribute name that
   * matches the filter expression. If empty, then no backups are filtered out.
   * See https://google.aip.dev/160
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
   * The standard list filter.
   * If specified, backups will be returned based on the attribute name that
   * matches the filter expression. If empty, then no backups are filtered out.
   * See https://google.aip.dev/160
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
