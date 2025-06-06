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
// source: google/shopping/merchant/datasources/v1beta/datasources.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.datasources.v1beta;

public interface UpdateDataSourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.datasources.v1beta.UpdateDataSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The data source resource to update.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.datasources.v1beta.DataSource data_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataSource field is set.
   */
  boolean hasDataSource();

  /**
   *
   *
   * <pre>
   * Required. The data source resource to update.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.datasources.v1beta.DataSource data_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataSource.
   */
  com.google.shopping.merchant.datasources.v1beta.DataSource getDataSource();

  /**
   *
   *
   * <pre>
   * Required. The data source resource to update.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.datasources.v1beta.DataSource data_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.datasources.v1beta.DataSourceOrBuilder getDataSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of data source fields to be updated.
   *
   * Fields specified in the update mask without a value specified in the
   * body will be deleted from the data source.
   *
   * Providing special "*" value for full data source replacement is not
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The list of data source fields to be updated.
   *
   * Fields specified in the update mask without a value specified in the
   * body will be deleted from the data source.
   *
   * Providing special "*" value for full data source replacement is not
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The list of data source fields to be updated.
   *
   * Fields specified in the update mask without a value specified in the
   * body will be deleted from the data source.
   *
   * Providing special "*" value for full data source replacement is not
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
