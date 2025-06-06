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

public interface SubscribeListingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.dataexchange.v1beta1.SubscribeListingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * BigQuery destination dataset to create for the subscriber.
   * </pre>
   *
   * <code>.google.cloud.bigquery.dataexchange.v1beta1.DestinationDataset destination_dataset = 3;
   * </code>
   *
   * @return Whether the destinationDataset field is set.
   */
  boolean hasDestinationDataset();

  /**
   *
   *
   * <pre>
   * BigQuery destination dataset to create for the subscriber.
   * </pre>
   *
   * <code>.google.cloud.bigquery.dataexchange.v1beta1.DestinationDataset destination_dataset = 3;
   * </code>
   *
   * @return The destinationDataset.
   */
  com.google.cloud.bigquery.dataexchange.v1beta1.DestinationDataset getDestinationDataset();

  /**
   *
   *
   * <pre>
   * BigQuery destination dataset to create for the subscriber.
   * </pre>
   *
   * <code>.google.cloud.bigquery.dataexchange.v1beta1.DestinationDataset destination_dataset = 3;
   * </code>
   */
  com.google.cloud.bigquery.dataexchange.v1beta1.DestinationDatasetOrBuilder
      getDestinationDatasetOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the listing that you want to subscribe to.
   * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the listing that you want to subscribe to.
   * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  com.google.cloud.bigquery.dataexchange.v1beta1.SubscribeListingRequest.DestinationCase
      getDestinationCase();
}
