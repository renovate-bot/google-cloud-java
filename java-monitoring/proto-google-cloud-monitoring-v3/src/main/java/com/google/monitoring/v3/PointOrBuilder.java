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
// source: google/monitoring/v3/metric.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

public interface PointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.Point)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time is optional, but if it is supplied, it must equal the
   * end time.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   *
   * @return Whether the interval field is set.
   */
  boolean hasInterval();

  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time is optional, but if it is supplied, it must equal the
   * end time.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   *
   * @return The interval.
   */
  com.google.monitoring.v3.TimeInterval getInterval();

  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time is optional, but if it is supplied, it must equal the
   * end time.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   */
  com.google.monitoring.v3.TimeIntervalOrBuilder getIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();

  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   *
   * @return The value.
   */
  com.google.monitoring.v3.TypedValue getValue();

  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   */
  com.google.monitoring.v3.TypedValueOrBuilder getValueOrBuilder();
}
