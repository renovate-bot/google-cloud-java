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

public interface BatchReadTensorboardTimeSeriesDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Tensorboard containing
   * TensorboardTimeSeries to read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
   * The TensorboardTimeSeries referenced by
   * [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series]
   * must be sub resources of this Tensorboard.
   * </pre>
   *
   * <code>
   * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tensorboard.
   */
  java.lang.String getTensorboard();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Tensorboard containing
   * TensorboardTimeSeries to read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
   * The TensorboardTimeSeries referenced by
   * [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series]
   * must be sub resources of this Tensorboard.
   * </pre>
   *
   * <code>
   * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tensorboard.
   */
  com.google.protobuf.ByteString getTensorboardBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data
   * from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the timeSeries.
   */
  java.util.List<java.lang.String> getTimeSeriesList();

  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data
   * from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of timeSeries.
   */
  int getTimeSeriesCount();

  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data
   * from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The timeSeries at the given index.
   */
  java.lang.String getTimeSeries(int index);

  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data
   * from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the timeSeries at the given index.
   */
  com.google.protobuf.ByteString getTimeSeriesBytes(int index);
}
