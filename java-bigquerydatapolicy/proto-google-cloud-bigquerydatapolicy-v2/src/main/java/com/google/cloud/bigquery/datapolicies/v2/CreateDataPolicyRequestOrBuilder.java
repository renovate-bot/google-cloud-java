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
// source: google/cloud/bigquery/datapolicies/v2/datapolicy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.datapolicies.v2;

public interface CreateDataPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datapolicies.v2.CreateDataPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the project that the data policy will belong to.
   * The format is `projects/{project_number}/locations/{location_id}`.
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
   * Required. Resource name of the project that the data policy will belong to.
   * The format is `projects/{project_number}/locations/{location_id}`.
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
   * Required. User-assigned (human readable) ID of the data policy that needs
   * to be unique within a project. Used as {data_policy_id} in part of the
   * resource name.
   * </pre>
   *
   * <code>string data_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataPolicyId.
   */
  java.lang.String getDataPolicyId();

  /**
   *
   *
   * <pre>
   * Required. User-assigned (human readable) ID of the data policy that needs
   * to be unique within a project. Used as {data_policy_id} in part of the
   * resource name.
   * </pre>
   *
   * <code>string data_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataPolicyId.
   */
  com.google.protobuf.ByteString getDataPolicyIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The data policy to create. The `name` field does not need to be
   * provided for the data policy creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v2.DataPolicy data_policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataPolicy field is set.
   */
  boolean hasDataPolicy();

  /**
   *
   *
   * <pre>
   * Required. The data policy to create. The `name` field does not need to be
   * provided for the data policy creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v2.DataPolicy data_policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataPolicy.
   */
  com.google.cloud.bigquery.datapolicies.v2.DataPolicy getDataPolicy();

  /**
   *
   *
   * <pre>
   * Required. The data policy to create. The `name` field does not need to be
   * provided for the data policy creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v2.DataPolicy data_policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.datapolicies.v2.DataPolicyOrBuilder getDataPolicyOrBuilder();
}
