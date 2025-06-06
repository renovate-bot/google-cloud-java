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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface InsightListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.InsightList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.Insight> getInsightsList();

  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.Insight getInsights(int index);

  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getInsightsCount();

  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.InsightOrBuilder>
      getInsightsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.InsightOrBuilder getInsightsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
