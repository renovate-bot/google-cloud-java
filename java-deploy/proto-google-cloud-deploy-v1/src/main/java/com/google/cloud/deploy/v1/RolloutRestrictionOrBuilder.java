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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.deploy.v1;

public interface RolloutRestrictionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.RolloutRestriction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Restriction rule ID. Required and must be unique within a
   * DeployPolicy. The format is `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * Required. Restriction rule ID. Required and must be unique within a
   * DeployPolicy. The format is `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. What invoked the action. If left empty, all invoker types will be
   * restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.DeployPolicy.Invoker invokers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the invokers.
   */
  java.util.List<com.google.cloud.deploy.v1.DeployPolicy.Invoker> getInvokersList();

  /**
   *
   *
   * <pre>
   * Optional. What invoked the action. If left empty, all invoker types will be
   * restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.DeployPolicy.Invoker invokers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of invokers.
   */
  int getInvokersCount();

  /**
   *
   *
   * <pre>
   * Optional. What invoked the action. If left empty, all invoker types will be
   * restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.DeployPolicy.Invoker invokers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The invokers at the given index.
   */
  com.google.cloud.deploy.v1.DeployPolicy.Invoker getInvokers(int index);

  /**
   *
   *
   * <pre>
   * Optional. What invoked the action. If left empty, all invoker types will be
   * restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.DeployPolicy.Invoker invokers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for invokers.
   */
  java.util.List<java.lang.Integer> getInvokersValueList();

  /**
   *
   *
   * <pre>
   * Optional. What invoked the action. If left empty, all invoker types will be
   * restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.DeployPolicy.Invoker invokers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of invokers at the given index.
   */
  int getInvokersValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. Rollout actions to be restricted as part of the policy. If left
   * empty, all actions will be restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RolloutRestriction.RolloutActions actions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the actions.
   */
  java.util.List<com.google.cloud.deploy.v1.RolloutRestriction.RolloutActions> getActionsList();

  /**
   *
   *
   * <pre>
   * Optional. Rollout actions to be restricted as part of the policy. If left
   * empty, all actions will be restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RolloutRestriction.RolloutActions actions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of actions.
   */
  int getActionsCount();

  /**
   *
   *
   * <pre>
   * Optional. Rollout actions to be restricted as part of the policy. If left
   * empty, all actions will be restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RolloutRestriction.RolloutActions actions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The actions at the given index.
   */
  com.google.cloud.deploy.v1.RolloutRestriction.RolloutActions getActions(int index);

  /**
   *
   *
   * <pre>
   * Optional. Rollout actions to be restricted as part of the policy. If left
   * empty, all actions will be restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RolloutRestriction.RolloutActions actions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for actions.
   */
  java.util.List<java.lang.Integer> getActionsValueList();

  /**
   *
   *
   * <pre>
   * Optional. Rollout actions to be restricted as part of the policy. If left
   * empty, all actions will be restricted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RolloutRestriction.RolloutActions actions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of actions at the given index.
   */
  int getActionsValue(int index);

  /**
   *
   *
   * <pre>
   * Required. Time window within which actions are restricted.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TimeWindows time_windows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the timeWindows field is set.
   */
  boolean hasTimeWindows();

  /**
   *
   *
   * <pre>
   * Required. Time window within which actions are restricted.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TimeWindows time_windows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The timeWindows.
   */
  com.google.cloud.deploy.v1.TimeWindows getTimeWindows();

  /**
   *
   *
   * <pre>
   * Required. Time window within which actions are restricted.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TimeWindows time_windows = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.deploy.v1.TimeWindowsOrBuilder getTimeWindowsOrBuilder();
}
