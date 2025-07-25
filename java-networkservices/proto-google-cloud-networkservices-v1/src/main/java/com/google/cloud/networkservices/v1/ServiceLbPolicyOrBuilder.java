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
// source: google/cloud/networkservices/v1/service_lb_policy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkservices.v1;

public interface ServiceLbPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.ServiceLbPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of the ServiceLbPolicy resource. It matches pattern
   * `projects/{project}/locations/{location}/serviceLbPolicies/{service_lb_policy_name}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. Name of the ServiceLbPolicy resource. It matches pattern
   * `projects/{project}/locations/{location}/serviceLbPolicies/{service_lb_policy_name}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the ServiceLbPolicy resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the ServiceLbPolicy resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the ServiceLbPolicy resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the ServiceLbPolicy resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the ServiceLbPolicy resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The type of load balancing algorithm to be used. The default
   * behavior is WATERFALL_BY_REGION.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.LoadBalancingAlgorithm load_balancing_algorithm = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for loadBalancingAlgorithm.
   */
  int getLoadBalancingAlgorithmValue();

  /**
   *
   *
   * <pre>
   * Optional. The type of load balancing algorithm to be used. The default
   * behavior is WATERFALL_BY_REGION.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.LoadBalancingAlgorithm load_balancing_algorithm = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The loadBalancingAlgorithm.
   */
  com.google.cloud.networkservices.v1.ServiceLbPolicy.LoadBalancingAlgorithm
      getLoadBalancingAlgorithm();

  /**
   *
   *
   * <pre>
   * Optional. Configuration to automatically move traffic away for unhealthy
   * IG/NEG for the associated Backend Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.AutoCapacityDrain auto_capacity_drain = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the autoCapacityDrain field is set.
   */
  boolean hasAutoCapacityDrain();

  /**
   *
   *
   * <pre>
   * Optional. Configuration to automatically move traffic away for unhealthy
   * IG/NEG for the associated Backend Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.AutoCapacityDrain auto_capacity_drain = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The autoCapacityDrain.
   */
  com.google.cloud.networkservices.v1.ServiceLbPolicy.AutoCapacityDrain getAutoCapacityDrain();

  /**
   *
   *
   * <pre>
   * Optional. Configuration to automatically move traffic away for unhealthy
   * IG/NEG for the associated Backend Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.AutoCapacityDrain auto_capacity_drain = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.networkservices.v1.ServiceLbPolicy.AutoCapacityDrainOrBuilder
      getAutoCapacityDrainOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration related to health based failover.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.FailoverConfig failover_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the failoverConfig field is set.
   */
  boolean hasFailoverConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration related to health based failover.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.FailoverConfig failover_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The failoverConfig.
   */
  com.google.cloud.networkservices.v1.ServiceLbPolicy.FailoverConfig getFailoverConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration related to health based failover.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.FailoverConfig failover_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.networkservices.v1.ServiceLbPolicy.FailoverConfigOrBuilder
      getFailoverConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration to provide isolation support for the associated
   * Backend Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.IsolationConfig isolation_config = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the isolationConfig field is set.
   */
  boolean hasIsolationConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration to provide isolation support for the associated
   * Backend Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.IsolationConfig isolation_config = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The isolationConfig.
   */
  com.google.cloud.networkservices.v1.ServiceLbPolicy.IsolationConfig getIsolationConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration to provide isolation support for the associated
   * Backend Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceLbPolicy.IsolationConfig isolation_config = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.networkservices.v1.ServiceLbPolicy.IsolationConfigOrBuilder
      getIsolationConfigOrBuilder();
}
