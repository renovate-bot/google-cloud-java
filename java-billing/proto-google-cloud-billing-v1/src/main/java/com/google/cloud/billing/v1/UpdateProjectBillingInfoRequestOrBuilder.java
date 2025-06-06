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
// source: google/cloud/billing/v1/cloud_billing.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.billing.v1;

public interface UpdateProjectBillingInfoRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.UpdateProjectBillingInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the project associated with the billing
   * information that you want to update. For example,
   * `projects/tokyo-rain-123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the project associated with the billing
   * information that you want to update. For example,
   * `projects/tokyo-rain-123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The new billing information for the project. Output-only fields are
   * ignored; thus, you can leave empty all fields except
   * `billing_account_name`.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
   *
   * @return Whether the projectBillingInfo field is set.
   */
  boolean hasProjectBillingInfo();

  /**
   *
   *
   * <pre>
   * The new billing information for the project. Output-only fields are
   * ignored; thus, you can leave empty all fields except
   * `billing_account_name`.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
   *
   * @return The projectBillingInfo.
   */
  com.google.cloud.billing.v1.ProjectBillingInfo getProjectBillingInfo();

  /**
   *
   *
   * <pre>
   * The new billing information for the project. Output-only fields are
   * ignored; thus, you can leave empty all fields except
   * `billing_account_name`.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
   */
  com.google.cloud.billing.v1.ProjectBillingInfoOrBuilder getProjectBillingInfoOrBuilder();
}
