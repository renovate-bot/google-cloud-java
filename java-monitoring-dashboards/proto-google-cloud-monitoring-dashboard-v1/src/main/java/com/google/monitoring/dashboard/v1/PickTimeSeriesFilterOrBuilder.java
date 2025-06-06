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
// source: google/monitoring/dashboard/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.dashboard.v1;

public interface PickTimeSeriesFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.PickTimeSeriesFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * `ranking_method` is applied to each time series independently to produce
   * the value which will be used to compare the time series to other time
   * series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
   *
   * @return The enum numeric value on the wire for rankingMethod.
   */
  int getRankingMethodValue();

  /**
   *
   *
   * <pre>
   * `ranking_method` is applied to each time series independently to produce
   * the value which will be used to compare the time series to other time
   * series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
   *
   * @return The rankingMethod.
   */
  com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method getRankingMethod();

  /**
   *
   *
   * <pre>
   * How many time series to allow to pass through the filter.
   * </pre>
   *
   * <code>int32 num_time_series = 2;</code>
   *
   * @return The numTimeSeries.
   */
  int getNumTimeSeries();

  /**
   *
   *
   * <pre>
   * How to use the ranking to select time series that pass through the filter.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
   *
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();

  /**
   *
   *
   * <pre>
   * How to use the ranking to select time series that pass through the filter.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
   *
   * @return The direction.
   */
  com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction getDirection();

  /**
   *
   *
   * <pre>
   * Select the top N streams/time series within this time interval
   * </pre>
   *
   * <code>.google.type.Interval interval = 4;</code>
   *
   * @return Whether the interval field is set.
   */
  boolean hasInterval();

  /**
   *
   *
   * <pre>
   * Select the top N streams/time series within this time interval
   * </pre>
   *
   * <code>.google.type.Interval interval = 4;</code>
   *
   * @return The interval.
   */
  com.google.type.Interval getInterval();

  /**
   *
   *
   * <pre>
   * Select the top N streams/time series within this time interval
   * </pre>
   *
   * <code>.google.type.Interval interval = 4;</code>
   */
  com.google.type.IntervalOrBuilder getIntervalOrBuilder();
}
