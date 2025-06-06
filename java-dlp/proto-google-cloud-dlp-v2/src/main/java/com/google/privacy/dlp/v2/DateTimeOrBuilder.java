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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface DateTimeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DateTime)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * One or more of the following must be set.
   * Must be a valid date or time value.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();

  /**
   *
   *
   * <pre>
   * One or more of the following must be set.
   * Must be a valid date or time value.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return The date.
   */
  com.google.type.Date getDate();

  /**
   *
   *
   * <pre>
   * One or more of the following must be set.
   * Must be a valid date or time value.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   */
  com.google.type.DateOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Day of week
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2;</code>
   *
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  int getDayOfWeekValue();

  /**
   *
   *
   * <pre>
   * Day of week
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2;</code>
   *
   * @return The dayOfWeek.
   */
  com.google.type.DayOfWeek getDayOfWeek();

  /**
   *
   *
   * <pre>
   * Time of day
   * </pre>
   *
   * <code>.google.type.TimeOfDay time = 3;</code>
   *
   * @return Whether the time field is set.
   */
  boolean hasTime();

  /**
   *
   *
   * <pre>
   * Time of day
   * </pre>
   *
   * <code>.google.type.TimeOfDay time = 3;</code>
   *
   * @return The time.
   */
  com.google.type.TimeOfDay getTime();

  /**
   *
   *
   * <pre>
   * Time of day
   * </pre>
   *
   * <code>.google.type.TimeOfDay time = 3;</code>
   */
  com.google.type.TimeOfDayOrBuilder getTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time zone
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime.TimeZone time_zone = 4;</code>
   *
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();

  /**
   *
   *
   * <pre>
   * Time zone
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime.TimeZone time_zone = 4;</code>
   *
   * @return The timeZone.
   */
  com.google.privacy.dlp.v2.DateTime.TimeZone getTimeZone();

  /**
   *
   *
   * <pre>
   * Time zone
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime.TimeZone time_zone = 4;</code>
   */
  com.google.privacy.dlp.v2.DateTime.TimeZoneOrBuilder getTimeZoneOrBuilder();
}
