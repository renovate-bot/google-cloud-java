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
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.commerce.consumer.procurement.v1alpha1;

public interface SubscriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1alpha1.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The timestamp when the subscription begins, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the subscription begins, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the subscription begins, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The timestamp when the subscription ends, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the subscription ends, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the subscription ends, if applicable.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether auto renewal is enabled by user choice on current subscription.
   * This field indicates order/subscription status after pending plan change is
   * cancelled or rejected.
   * </pre>
   *
   * <code>bool auto_renewal_enabled = 2;</code>
   *
   * @return The autoRenewalEnabled.
   */
  boolean getAutoRenewalEnabled();
}
