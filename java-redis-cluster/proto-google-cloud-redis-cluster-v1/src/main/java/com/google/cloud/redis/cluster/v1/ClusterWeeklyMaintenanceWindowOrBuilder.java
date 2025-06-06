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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.redis.cluster.v1;

public interface ClusterWeeklyMaintenanceWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1.ClusterWeeklyMaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Allows to define schedule that runs specified day of the week.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day = 1;</code>
   *
   * @return The enum numeric value on the wire for day.
   */
  int getDayValue();

  /**
   *
   *
   * <pre>
   * Allows to define schedule that runs specified day of the week.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day = 1;</code>
   *
   * @return The day.
   */
  com.google.type.DayOfWeek getDay();

  /**
   *
   *
   * <pre>
   * Start time of the window in UTC.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Start time of the window in UTC.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2;</code>
   *
   * @return The startTime.
   */
  com.google.type.TimeOfDay getStartTime();

  /**
   *
   *
   * <pre>
   * Start time of the window in UTC.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2;</code>
   */
  com.google.type.TimeOfDayOrBuilder getStartTimeOrBuilder();
}
