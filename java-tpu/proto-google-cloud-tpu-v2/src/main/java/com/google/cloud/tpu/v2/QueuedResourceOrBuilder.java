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
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tpu.v2;

public interface QueuedResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.QueuedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The name of the QueuedResource.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The name of the QueuedResource.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the QueuedResource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the QueuedResource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the QueuedResource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Defines a TPU resource.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Tpu tpu = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the tpu field is set.
   */
  boolean hasTpu();

  /**
   *
   *
   * <pre>
   * Optional. Defines a TPU resource.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Tpu tpu = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tpu.
   */
  com.google.cloud.tpu.v2.QueuedResource.Tpu getTpu();

  /**
   *
   *
   * <pre>
   * Optional. Defines a TPU resource.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Tpu tpu = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.tpu.v2.QueuedResource.TpuOrBuilder getTpuOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Spot tier.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Spot spot = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the spot field is set.
   */
  boolean hasSpot();

  /**
   *
   *
   * <pre>
   * Optional. The Spot tier.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Spot spot = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The spot.
   */
  com.google.cloud.tpu.v2.QueuedResource.Spot getSpot();

  /**
   *
   *
   * <pre>
   * Optional. The Spot tier.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Spot spot = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.tpu.v2.QueuedResource.SpotOrBuilder getSpotOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Guaranteed tier
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Guaranteed guaranteed = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the guaranteed field is set.
   */
  boolean hasGuaranteed();

  /**
   *
   *
   * <pre>
   * Optional. The Guaranteed tier
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Guaranteed guaranteed = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The guaranteed.
   */
  com.google.cloud.tpu.v2.QueuedResource.Guaranteed getGuaranteed();

  /**
   *
   *
   * <pre>
   * Optional. The Guaranteed tier
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.Guaranteed guaranteed = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.tpu.v2.QueuedResource.GuaranteedOrBuilder getGuaranteedOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The queueing policy of the QueuedRequest.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.QueueingPolicy queueing_policy = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the queueingPolicy field is set.
   */
  boolean hasQueueingPolicy();

  /**
   *
   *
   * <pre>
   * Optional. The queueing policy of the QueuedRequest.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.QueueingPolicy queueing_policy = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The queueingPolicy.
   */
  com.google.cloud.tpu.v2.QueuedResource.QueueingPolicy getQueueingPolicy();

  /**
   *
   *
   * <pre>
   * Optional. The queueing policy of the QueuedRequest.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResource.QueueingPolicy queueing_policy = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.tpu.v2.QueuedResource.QueueingPolicyOrBuilder getQueueingPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the QueuedResource request.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResourceState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();

  /**
   *
   *
   * <pre>
   * Output only. State of the QueuedResource request.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResourceState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.tpu.v2.QueuedResourceState getState();

  /**
   *
   *
   * <pre>
   * Output only. State of the QueuedResource request.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2.QueuedResourceState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.tpu.v2.QueuedResourceStateOrBuilder getStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Name of the reservation in which the resource should be
   * provisioned. Format:
   * projects/{project}/locations/{zone}/reservations/{reservation}
   * </pre>
   *
   * <code>string reservation_name = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reservationName.
   */
  java.lang.String getReservationName();

  /**
   *
   *
   * <pre>
   * Optional. Name of the reservation in which the resource should be
   * provisioned. Format:
   * projects/{project}/locations/{zone}/reservations/{reservation}
   * </pre>
   *
   * <code>string reservation_name = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reservationName.
   */
  com.google.protobuf.ByteString getReservationNameBytes();

  com.google.cloud.tpu.v2.QueuedResource.ResourceCase getResourceCase();

  com.google.cloud.tpu.v2.QueuedResource.TierCase getTierCase();
}
