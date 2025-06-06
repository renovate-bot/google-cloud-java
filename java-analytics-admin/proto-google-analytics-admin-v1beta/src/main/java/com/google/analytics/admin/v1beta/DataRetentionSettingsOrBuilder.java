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
// source: google/analytics/admin/v1beta/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1beta;

public interface DataRetentionSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.DataRetentionSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name for this DataRetentionSetting resource.
   * Format: properties/{property}/dataRetentionSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Resource name for this DataRetentionSetting resource.
   * Format: properties/{property}/dataRetentionSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The length of time that event-level data is retained.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for eventDataRetention.
   */
  int getEventDataRetentionValue();

  /**
   *
   *
   * <pre>
   * Required. The length of time that event-level data is retained.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The eventDataRetention.
   */
  com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration getEventDataRetention();

  /**
   *
   *
   * <pre>
   * Required. The length of time that user-level data is retained.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration user_data_retention = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for userDataRetention.
   */
  int getUserDataRetentionValue();

  /**
   *
   *
   * <pre>
   * Required. The length of time that user-level data is retained.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration user_data_retention = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userDataRetention.
   */
  com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration getUserDataRetention();

  /**
   *
   *
   * <pre>
   * If true, reset the retention period for the user identifier with every
   * event from that user.
   * </pre>
   *
   * <code>bool reset_user_data_on_new_activity = 3;</code>
   *
   * @return The resetUserDataOnNewActivity.
   */
  boolean getResetUserDataOnNewActivity();
}
