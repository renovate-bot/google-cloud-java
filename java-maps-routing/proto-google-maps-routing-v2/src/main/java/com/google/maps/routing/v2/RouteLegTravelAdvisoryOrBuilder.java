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
// source: google/maps/routing/v2/route.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routing.v2;

public interface RouteLegTravelAdvisoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.RouteLegTravelAdvisory)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Contains information about tolls on the specific `RouteLeg`.
   * This field is only populated if we expect there are tolls on the
   * `RouteLeg`. If this field is set but the estimated_price subfield is not
   * populated, we expect that road contains tolls but we do not know an
   * estimated price. If this field does not exist, then there is no toll on the
   * `RouteLeg`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TollInfo toll_info = 1;</code>
   *
   * @return Whether the tollInfo field is set.
   */
  boolean hasTollInfo();

  /**
   *
   *
   * <pre>
   * Contains information about tolls on the specific `RouteLeg`.
   * This field is only populated if we expect there are tolls on the
   * `RouteLeg`. If this field is set but the estimated_price subfield is not
   * populated, we expect that road contains tolls but we do not know an
   * estimated price. If this field does not exist, then there is no toll on the
   * `RouteLeg`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TollInfo toll_info = 1;</code>
   *
   * @return The tollInfo.
   */
  com.google.maps.routing.v2.TollInfo getTollInfo();

  /**
   *
   *
   * <pre>
   * Contains information about tolls on the specific `RouteLeg`.
   * This field is only populated if we expect there are tolls on the
   * `RouteLeg`. If this field is set but the estimated_price subfield is not
   * populated, we expect that road contains tolls but we do not know an
   * estimated price. If this field does not exist, then there is no toll on the
   * `RouteLeg`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TollInfo toll_info = 1;</code>
   */
  com.google.maps.routing.v2.TollInfoOrBuilder getTollInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the `RouteLeg` without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 2;</code>
   */
  java.util.List<com.google.maps.routing.v2.SpeedReadingInterval> getSpeedReadingIntervalsList();

  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the `RouteLeg` without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 2;</code>
   */
  com.google.maps.routing.v2.SpeedReadingInterval getSpeedReadingIntervals(int index);

  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the `RouteLeg` without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 2;</code>
   */
  int getSpeedReadingIntervalsCount();

  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the `RouteLeg` without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 2;</code>
   */
  java.util.List<? extends com.google.maps.routing.v2.SpeedReadingIntervalOrBuilder>
      getSpeedReadingIntervalsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the `RouteLeg` without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 2;</code>
   */
  com.google.maps.routing.v2.SpeedReadingIntervalOrBuilder getSpeedReadingIntervalsOrBuilder(
      int index);
}
