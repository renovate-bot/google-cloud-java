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
// source: google/cloud/aiplatform/v1beta1/model_monitoring_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface SearchModelMonitoringAlertsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SearchModelMonitoringAlertsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Alerts retrieved for the requested objectives. Sorted by alert time
   * descendingly.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringAlert model_monitoring_alerts = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlert>
      getModelMonitoringAlertsList();

  /**
   *
   *
   * <pre>
   * Alerts retrieved for the requested objectives. Sorted by alert time
   * descendingly.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringAlert model_monitoring_alerts = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlert getModelMonitoringAlerts(int index);

  /**
   *
   *
   * <pre>
   * Alerts retrieved for the requested objectives. Sorted by alert time
   * descendingly.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringAlert model_monitoring_alerts = 1;
   * </code>
   */
  int getModelMonitoringAlertsCount();

  /**
   *
   *
   * <pre>
   * Alerts retrieved for the requested objectives. Sorted by alert time
   * descendingly.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringAlert model_monitoring_alerts = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertOrBuilder>
      getModelMonitoringAlertsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Alerts retrieved for the requested objectives. Sorted by alert time
   * descendingly.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringAlert model_monitoring_alerts = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertOrBuilder
      getModelMonitoringAlertsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The total number of alerts retrieved by the requested objectives.
   * </pre>
   *
   * <code>int64 total_number_alerts = 2;</code>
   *
   * @return The totalNumberAlerts.
   */
  long getTotalNumberAlerts();

  /**
   *
   *
   * <pre>
   * The page token that can be used by the next
   * [ModelMonitoringService.SearchModelMonitoringAlerts][google.cloud.aiplatform.v1beta1.ModelMonitoringService.SearchModelMonitoringAlerts]
   * call.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * The page token that can be used by the next
   * [ModelMonitoringService.SearchModelMonitoringAlerts][google.cloud.aiplatform.v1beta1.ModelMonitoringService.SearchModelMonitoringAlerts]
   * call.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
