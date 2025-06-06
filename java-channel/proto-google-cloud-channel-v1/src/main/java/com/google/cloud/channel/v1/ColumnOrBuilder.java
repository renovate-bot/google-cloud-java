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
// source: google/cloud/channel/v1/reports_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

@java.lang.Deprecated
public interface ColumnOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Column)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique name of the column (for example, customer_domain,
   * channel_partner, customer_cost). You can use column IDs in
   * [RunReportJobRequest.filter][google.cloud.channel.v1.RunReportJobRequest.filter].
   * To see all reports and their columns, call
   * [CloudChannelReportsService.ListReports][google.cloud.channel.v1.CloudChannelReportsService.ListReports].
   * </pre>
   *
   * <code>string column_id = 1;</code>
   *
   * @return The columnId.
   */
  java.lang.String getColumnId();

  /**
   *
   *
   * <pre>
   * The unique name of the column (for example, customer_domain,
   * channel_partner, customer_cost). You can use column IDs in
   * [RunReportJobRequest.filter][google.cloud.channel.v1.RunReportJobRequest.filter].
   * To see all reports and their columns, call
   * [CloudChannelReportsService.ListReports][google.cloud.channel.v1.CloudChannelReportsService.ListReports].
   * </pre>
   *
   * <code>string column_id = 1;</code>
   *
   * @return The bytes for columnId.
   */
  com.google.protobuf.ByteString getColumnIdBytes();

  /**
   *
   *
   * <pre>
   * The column's display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * The column's display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The type of the values for this column.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Column.DataType data_type = 3;</code>
   *
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();

  /**
   *
   *
   * <pre>
   * The type of the values for this column.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Column.DataType data_type = 3;</code>
   *
   * @return The dataType.
   */
  com.google.cloud.channel.v1.Column.DataType getDataType();
}
