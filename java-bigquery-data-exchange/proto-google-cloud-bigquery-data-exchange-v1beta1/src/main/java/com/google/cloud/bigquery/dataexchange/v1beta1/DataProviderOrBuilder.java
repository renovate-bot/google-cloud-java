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
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.dataexchange.v1beta1;

public interface DataProviderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.dataexchange.v1beta1.DataProvider)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the data provider.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Optional. Name of the data provider.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Email or URL of the data provider.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The primaryContact.
   */
  java.lang.String getPrimaryContact();

  /**
   *
   *
   * <pre>
   * Optional. Email or URL of the data provider.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for primaryContact.
   */
  com.google.protobuf.ByteString getPrimaryContactBytes();
}
