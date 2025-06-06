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
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ModelMonitoringAlertConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Email alert config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig.EmailAlertConfig email_alert_config = 1;
   * </code>
   *
   * @return Whether the emailAlertConfig field is set.
   */
  boolean hasEmailAlertConfig();

  /**
   *
   *
   * <pre>
   * Email alert config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig.EmailAlertConfig email_alert_config = 1;
   * </code>
   *
   * @return The emailAlertConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig.EmailAlertConfig
      getEmailAlertConfig();

  /**
   *
   *
   * <pre>
   * Email alert config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig.EmailAlertConfig email_alert_config = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig.EmailAlertConfigOrBuilder
      getEmailAlertConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Dump the anomalies to Cloud Logging. The anomalies will be put to json
   * payload encoded from proto
   * [google.cloud.aiplatform.logging.ModelMonitoringAnomaliesLogEntry][].
   * This can be further sinked to Pub/Sub or any other services supported
   * by Cloud Logging.
   * </pre>
   *
   * <code>bool enable_logging = 2;</code>
   *
   * @return The enableLogging.
   */
  boolean getEnableLogging();

  /**
   *
   *
   * <pre>
   * Resource names of the NotificationChannels to send alert.
   * Must be of the format
   * `projects/&lt;project_id_or_number&gt;/notificationChannels/&lt;channel_id&gt;`
   * </pre>
   *
   * <code>repeated string notification_channels = 3 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the notificationChannels.
   */
  java.util.List<java.lang.String> getNotificationChannelsList();

  /**
   *
   *
   * <pre>
   * Resource names of the NotificationChannels to send alert.
   * Must be of the format
   * `projects/&lt;project_id_or_number&gt;/notificationChannels/&lt;channel_id&gt;`
   * </pre>
   *
   * <code>repeated string notification_channels = 3 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of notificationChannels.
   */
  int getNotificationChannelsCount();

  /**
   *
   *
   * <pre>
   * Resource names of the NotificationChannels to send alert.
   * Must be of the format
   * `projects/&lt;project_id_or_number&gt;/notificationChannels/&lt;channel_id&gt;`
   * </pre>
   *
   * <code>repeated string notification_channels = 3 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The notificationChannels at the given index.
   */
  java.lang.String getNotificationChannels(int index);

  /**
   *
   *
   * <pre>
   * Resource names of the NotificationChannels to send alert.
   * Must be of the format
   * `projects/&lt;project_id_or_number&gt;/notificationChannels/&lt;channel_id&gt;`
   * </pre>
   *
   * <code>repeated string notification_channels = 3 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the notificationChannels at the given index.
   */
  com.google.protobuf.ByteString getNotificationChannelsBytes(int index);

  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig.AlertCase getAlertCase();
}
