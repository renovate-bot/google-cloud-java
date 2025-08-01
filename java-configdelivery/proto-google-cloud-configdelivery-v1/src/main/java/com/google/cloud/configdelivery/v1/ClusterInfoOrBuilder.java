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
// source: google/cloud/configdelivery/v1/config_delivery.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.configdelivery.v1;

public interface ClusterInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.configdelivery.v1.ClusterInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. gkehub membership of target cluster
   * </pre>
   *
   * <code>
   * string membership = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The membership.
   */
  java.lang.String getMembership();

  /**
   *
   *
   * <pre>
   * Output only. gkehub membership of target cluster
   * </pre>
   *
   * <code>
   * string membership = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for membership.
   */
  com.google.protobuf.ByteString getMembershipBytes();

  /**
   *
   *
   * <pre>
   * Output only. Desired state for the resource bundle.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo desired = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the desired field is set.
   */
  boolean hasDesired();

  /**
   *
   *
   * <pre>
   * Output only. Desired state for the resource bundle.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo desired = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The desired.
   */
  com.google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo getDesired();

  /**
   *
   *
   * <pre>
   * Output only. Desired state for the resource bundle.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo desired = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.configdelivery.v1.ResourceBundleDeploymentInfoOrBuilder getDesiredOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Initial state of the resource bundle prior to the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo initial = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the initial field is set.
   */
  boolean hasInitial();

  /**
   *
   *
   * <pre>
   * Output only. Initial state of the resource bundle prior to the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo initial = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The initial.
   */
  com.google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo getInitial();

  /**
   *
   *
   * <pre>
   * Output only. Initial state of the resource bundle prior to the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo initial = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.configdelivery.v1.ResourceBundleDeploymentInfoOrBuilder getInitialOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the resource bundle.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo current = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the current field is set.
   */
  boolean hasCurrent();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the resource bundle.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo current = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The current.
   */
  com.google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo getCurrent();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the resource bundle.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ResourceBundleDeploymentInfo current = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.configdelivery.v1.ResourceBundleDeploymentInfoOrBuilder getCurrentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the rollout for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ClusterInfo.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. State of the rollout for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.configdelivery.v1.ClusterInfo.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.configdelivery.v1.ClusterInfo.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Unordered list. Messages convey additional information related
   * to the deployment.
   * </pre>
   *
   * <code>
   * repeated string messages = 6 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the messages.
   */
  java.util.List<java.lang.String> getMessagesList();

  /**
   *
   *
   * <pre>
   * Output only. Unordered list. Messages convey additional information related
   * to the deployment.
   * </pre>
   *
   * <code>
   * repeated string messages = 6 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of messages.
   */
  int getMessagesCount();

  /**
   *
   *
   * <pre>
   * Output only. Unordered list. Messages convey additional information related
   * to the deployment.
   * </pre>
   *
   * <code>
   * repeated string messages = 6 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The messages at the given index.
   */
  java.lang.String getMessages(int index);

  /**
   *
   *
   * <pre>
   * Output only. Unordered list. Messages convey additional information related
   * to the deployment.
   * </pre>
   *
   * <code>
   * repeated string messages = 6 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the messages at the given index.
   */
  com.google.protobuf.ByteString getMessagesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when reconciliation starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when reconciliation starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when reconciliation starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when reconciliation ends.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when reconciliation ends.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when reconciliation ends.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
