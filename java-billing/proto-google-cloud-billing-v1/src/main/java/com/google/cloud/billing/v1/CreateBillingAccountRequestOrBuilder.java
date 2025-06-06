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

public interface CreateBillingAccountRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.CreateBillingAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The billing account resource to create.
   * Currently CreateBillingAccount only supports subaccount creation, so
   * any created billing accounts must be under a provided parent billing
   * account.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the billingAccount field is set.
   */
  boolean hasBillingAccount();

  /**
   *
   *
   * <pre>
   * Required. The billing account resource to create.
   * Currently CreateBillingAccount only supports subaccount creation, so
   * any created billing accounts must be under a provided parent billing
   * account.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The billingAccount.
   */
  com.google.cloud.billing.v1.BillingAccount getBillingAccount();

  /**
   *
   *
   * <pre>
   * Required. The billing account resource to create.
   * Currently CreateBillingAccount only supports subaccount creation, so
   * any created billing accounts must be under a provided parent billing
   * account.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.billing.v1.BillingAccountOrBuilder getBillingAccountOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The parent to create a billing account from.
   * Format:
   *   - `billingAccounts/{billing_account_id}`, for example,
   *      `billingAccounts/012345-567890-ABCDEF`
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Optional. The parent to create a billing account from.
   * Format:
   *   - `billingAccounts/{billing_account_id}`, for example,
   *      `billingAccounts/012345-567890-ABCDEF`
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();
}
