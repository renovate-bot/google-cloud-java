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

public interface CreateFeatureMonitorJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateFeatureMonitorJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of FeatureMonitor to create FeatureMonitorJob.
   * Format:
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The resource name of FeatureMonitor to create FeatureMonitorJob.
   * Format:
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The Monitor to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featureMonitorJob field is set.
   */
  boolean hasFeatureMonitorJob();

  /**
   *
   *
   * <pre>
   * Required. The Monitor to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featureMonitorJob.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureMonitorJob getFeatureMonitorJob();

  /**
   *
   *
   * <pre>
   * Required. The Monitor to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureMonitorJob feature_monitor_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureMonitorJobOrBuilder getFeatureMonitorJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Output only. System-generated ID for feature monitor job.
   * </pre>
   *
   * <code>
   * int64 feature_monitor_job_id = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The featureMonitorJobId.
   */
  long getFeatureMonitorJobId();
}
