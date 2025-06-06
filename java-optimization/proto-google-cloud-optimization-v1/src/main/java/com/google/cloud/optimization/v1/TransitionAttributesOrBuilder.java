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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.optimization.v1;

public interface TransitionAttributesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.TransitionAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Tags defining the set of (src-&gt;dst) transitions these attributes apply to.
   *
   * A source visit or vehicle start matches iff its
   * [VisitRequest.tags][google.cloud.optimization.v1.Shipment.VisitRequest.tags]
   * or [Vehicle.start_tags][google.cloud.optimization.v1.Vehicle.start_tags]
   * either contains `src_tag` or does not contain `excluded_src_tag` (depending
   * on which of these two fields is non-empty).
   * </pre>
   *
   * <code>string src_tag = 1;</code>
   *
   * @return The srcTag.
   */
  java.lang.String getSrcTag();

  /**
   *
   *
   * <pre>
   * Tags defining the set of (src-&gt;dst) transitions these attributes apply to.
   *
   * A source visit or vehicle start matches iff its
   * [VisitRequest.tags][google.cloud.optimization.v1.Shipment.VisitRequest.tags]
   * or [Vehicle.start_tags][google.cloud.optimization.v1.Vehicle.start_tags]
   * either contains `src_tag` or does not contain `excluded_src_tag` (depending
   * on which of these two fields is non-empty).
   * </pre>
   *
   * <code>string src_tag = 1;</code>
   *
   * @return The bytes for srcTag.
   */
  com.google.protobuf.ByteString getSrcTagBytes();

  /**
   *
   *
   * <pre>
   * See `src_tag`. Exactly one of `src_tag` and `excluded_src_tag` must be
   * non-empty.
   * </pre>
   *
   * <code>string excluded_src_tag = 2;</code>
   *
   * @return The excludedSrcTag.
   */
  java.lang.String getExcludedSrcTag();

  /**
   *
   *
   * <pre>
   * See `src_tag`. Exactly one of `src_tag` and `excluded_src_tag` must be
   * non-empty.
   * </pre>
   *
   * <code>string excluded_src_tag = 2;</code>
   *
   * @return The bytes for excludedSrcTag.
   */
  com.google.protobuf.ByteString getExcludedSrcTagBytes();

  /**
   *
   *
   * <pre>
   * A destination visit or vehicle end matches iff its
   * [VisitRequest.tags][google.cloud.optimization.v1.Shipment.VisitRequest.tags]
   * or [Vehicle.end_tags][google.cloud.optimization.v1.Vehicle.end_tags] either
   * contains `dst_tag` or does not contain `excluded_dst_tag` (depending on
   * which of these two fields is non-empty).
   * </pre>
   *
   * <code>string dst_tag = 3;</code>
   *
   * @return The dstTag.
   */
  java.lang.String getDstTag();

  /**
   *
   *
   * <pre>
   * A destination visit or vehicle end matches iff its
   * [VisitRequest.tags][google.cloud.optimization.v1.Shipment.VisitRequest.tags]
   * or [Vehicle.end_tags][google.cloud.optimization.v1.Vehicle.end_tags] either
   * contains `dst_tag` or does not contain `excluded_dst_tag` (depending on
   * which of these two fields is non-empty).
   * </pre>
   *
   * <code>string dst_tag = 3;</code>
   *
   * @return The bytes for dstTag.
   */
  com.google.protobuf.ByteString getDstTagBytes();

  /**
   *
   *
   * <pre>
   * See `dst_tag`. Exactly one of `dst_tag` and `excluded_dst_tag` must be
   * non-empty.
   * </pre>
   *
   * <code>string excluded_dst_tag = 4;</code>
   *
   * @return The excludedDstTag.
   */
  java.lang.String getExcludedDstTag();

  /**
   *
   *
   * <pre>
   * See `dst_tag`. Exactly one of `dst_tag` and `excluded_dst_tag` must be
   * non-empty.
   * </pre>
   *
   * <code>string excluded_dst_tag = 4;</code>
   *
   * @return The bytes for excludedDstTag.
   */
  com.google.protobuf.ByteString getExcludedDstTagBytes();

  /**
   *
   *
   * <pre>
   * Specifies a cost for performing this transition. This is in the same unit
   * as all other costs in the model and must not be negative. It is applied on
   * top of all other existing costs.
   * </pre>
   *
   * <code>double cost = 5;</code>
   *
   * @return The cost.
   */
  double getCost();

  /**
   *
   *
   * <pre>
   * Specifies a cost per kilometer applied to the distance traveled while
   * performing this transition. It adds up to any
   * [Vehicle.cost_per_kilometer][google.cloud.optimization.v1.Vehicle.cost_per_kilometer]
   * specified on vehicles.
   * </pre>
   *
   * <code>double cost_per_kilometer = 6;</code>
   *
   * @return The costPerKilometer.
   */
  double getCostPerKilometer();

  /**
   *
   *
   * <pre>
   * Specifies a limit on the distance traveled while performing this
   * transition.
   *
   * As of 2021/06, only soft limits are supported.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.DistanceLimit distance_limit = 7;</code>
   *
   * @return Whether the distanceLimit field is set.
   */
  boolean hasDistanceLimit();

  /**
   *
   *
   * <pre>
   * Specifies a limit on the distance traveled while performing this
   * transition.
   *
   * As of 2021/06, only soft limits are supported.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.DistanceLimit distance_limit = 7;</code>
   *
   * @return The distanceLimit.
   */
  com.google.cloud.optimization.v1.DistanceLimit getDistanceLimit();

  /**
   *
   *
   * <pre>
   * Specifies a limit on the distance traveled while performing this
   * transition.
   *
   * As of 2021/06, only soft limits are supported.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.DistanceLimit distance_limit = 7;</code>
   */
  com.google.cloud.optimization.v1.DistanceLimitOrBuilder getDistanceLimitOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies a delay incurred when performing this transition.
   *
   * This delay always occurs *after* finishing the source visit and *before*
   * starting the destination visit.
   * </pre>
   *
   * <code>.google.protobuf.Duration delay = 8;</code>
   *
   * @return Whether the delay field is set.
   */
  boolean hasDelay();

  /**
   *
   *
   * <pre>
   * Specifies a delay incurred when performing this transition.
   *
   * This delay always occurs *after* finishing the source visit and *before*
   * starting the destination visit.
   * </pre>
   *
   * <code>.google.protobuf.Duration delay = 8;</code>
   *
   * @return The delay.
   */
  com.google.protobuf.Duration getDelay();

  /**
   *
   *
   * <pre>
   * Specifies a delay incurred when performing this transition.
   *
   * This delay always occurs *after* finishing the source visit and *before*
   * starting the destination visit.
   * </pre>
   *
   * <code>.google.protobuf.Duration delay = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getDelayOrBuilder();
}
