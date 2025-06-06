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
// source: google/maps/fleetengine/v1/traffic.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.v1;

public interface ConsumableTrafficPolylineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.ConsumableTrafficPolyline)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Traffic speed along the path from the previous waypoint to the current
   * waypoint.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.SpeedReadingInterval speed_reading_interval = 1;</code>
   */
  java.util.List<com.google.maps.fleetengine.v1.SpeedReadingInterval> getSpeedReadingIntervalList();

  /**
   *
   *
   * <pre>
   * Traffic speed along the path from the previous waypoint to the current
   * waypoint.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.SpeedReadingInterval speed_reading_interval = 1;</code>
   */
  com.google.maps.fleetengine.v1.SpeedReadingInterval getSpeedReadingInterval(int index);

  /**
   *
   *
   * <pre>
   * Traffic speed along the path from the previous waypoint to the current
   * waypoint.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.SpeedReadingInterval speed_reading_interval = 1;</code>
   */
  int getSpeedReadingIntervalCount();

  /**
   *
   *
   * <pre>
   * Traffic speed along the path from the previous waypoint to the current
   * waypoint.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.SpeedReadingInterval speed_reading_interval = 1;</code>
   */
  java.util.List<? extends com.google.maps.fleetengine.v1.SpeedReadingIntervalOrBuilder>
      getSpeedReadingIntervalOrBuilderList();

  /**
   *
   *
   * <pre>
   * Traffic speed along the path from the previous waypoint to the current
   * waypoint.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.SpeedReadingInterval speed_reading_interval = 1;</code>
   */
  com.google.maps.fleetengine.v1.SpeedReadingIntervalOrBuilder getSpeedReadingIntervalOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The path the driver is taking from the previous waypoint to the current
   * waypoint. This path has landmarks in it so clients can show traffic markers
   * along the path (see `speed_reading_interval`).  Decoding is not yet
   * supported.
   * </pre>
   *
   * <code>string encoded_path_to_waypoint = 2;</code>
   *
   * @return The encodedPathToWaypoint.
   */
  java.lang.String getEncodedPathToWaypoint();

  /**
   *
   *
   * <pre>
   * The path the driver is taking from the previous waypoint to the current
   * waypoint. This path has landmarks in it so clients can show traffic markers
   * along the path (see `speed_reading_interval`).  Decoding is not yet
   * supported.
   * </pre>
   *
   * <code>string encoded_path_to_waypoint = 2;</code>
   *
   * @return The bytes for encodedPathToWaypoint.
   */
  com.google.protobuf.ByteString getEncodedPathToWaypointBytes();
}
