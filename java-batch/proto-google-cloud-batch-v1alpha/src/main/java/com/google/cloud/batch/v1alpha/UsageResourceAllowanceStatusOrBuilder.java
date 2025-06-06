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
// source: google/cloud/batch/v1alpha/resource_allowance.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.batch.v1alpha;

public interface UsageResourceAllowanceStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.UsageResourceAllowanceStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. ResourceAllowance state.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.ResourceAllowanceState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. ResourceAllowance state.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.ResourceAllowanceState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.batch.v1alpha.ResourceAllowanceState getState();

  /**
   *
   *
   * <pre>
   * Output only. ResourceAllowance consumption status for usage resources.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.LimitStatus limit_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the limitStatus field is set.
   */
  boolean hasLimitStatus();

  /**
   *
   *
   * <pre>
   * Output only. ResourceAllowance consumption status for usage resources.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.LimitStatus limit_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The limitStatus.
   */
  com.google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.LimitStatus getLimitStatus();

  /**
   *
   *
   * <pre>
   * Output only. ResourceAllowance consumption status for usage resources.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.LimitStatus limit_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.LimitStatusOrBuilder
      getLimitStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The report of ResourceAllowance consumptions in a time period.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.ConsumptionReport report = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the report field is set.
   */
  boolean hasReport();

  /**
   *
   *
   * <pre>
   * Output only. The report of ResourceAllowance consumptions in a time period.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.ConsumptionReport report = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The report.
   */
  com.google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.ConsumptionReport getReport();

  /**
   *
   *
   * <pre>
   * Output only. The report of ResourceAllowance consumptions in a time period.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.ConsumptionReport report = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.batch.v1alpha.UsageResourceAllowanceStatus.ConsumptionReportOrBuilder
      getReportOrBuilder();
}
