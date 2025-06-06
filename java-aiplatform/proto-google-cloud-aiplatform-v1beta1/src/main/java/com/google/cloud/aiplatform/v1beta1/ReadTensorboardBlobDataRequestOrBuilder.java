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
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ReadTensorboardBlobDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to list Blobs.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The timeSeries.
   */
  java.lang.String getTimeSeries();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to list Blobs.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for timeSeries.
   */
  com.google.protobuf.ByteString getTimeSeriesBytes();

  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @return A list containing the blobIds.
   */
  java.util.List<java.lang.String> getBlobIdsList();

  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @return The count of blobIds.
   */
  int getBlobIdsCount();

  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The blobIds at the given index.
   */
  java.lang.String getBlobIds(int index);

  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the blobIds at the given index.
   */
  com.google.protobuf.ByteString getBlobIdsBytes(int index);
}
