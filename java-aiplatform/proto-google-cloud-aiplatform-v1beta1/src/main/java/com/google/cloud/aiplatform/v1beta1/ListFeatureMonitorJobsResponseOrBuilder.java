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
// source: google/cloud/aiplatform/v1beta1/feature_registry_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ListFeatureMonitorJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListFeatureMonitorJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The FeatureMonitorJobs matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_jobs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FeatureMonitorJob> getFeatureMonitorJobsList();

  /**
   *
   *
   * <pre>
   * The FeatureMonitorJobs matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_jobs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureMonitorJob getFeatureMonitorJobs(int index);

  /**
   *
   *
   * <pre>
   * The FeatureMonitorJobs matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_jobs = 1;
   * </code>
   */
  int getFeatureMonitorJobsCount();

  /**
   *
   *
   * <pre>
   * The FeatureMonitorJobs matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_jobs = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureMonitorJobOrBuilder>
      getFeatureMonitorJobsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The FeatureMonitorJobs matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_jobs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureMonitorJobOrBuilder getFeatureMonitorJobsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListFeatureMonitorJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeatureMonitorJobsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListFeatureMonitorJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeatureMonitorJobsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
