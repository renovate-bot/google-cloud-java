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

public interface RollbackTargetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.RollbackTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `DeliveryPipeline` for which the rollback `Rollout` must be
   * created. The format is
   * `projects/{project_id}/locations/{location_name}/deliveryPipelines/{pipeline_name}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The `DeliveryPipeline` for which the rollback `Rollout` must be
   * created. The format is
   * `projects/{project_id}/locations/{location_name}/deliveryPipelines/{pipeline_name}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the `Target` that is being rolled back.
   * </pre>
   *
   * <code>string target_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The targetId.
   */
  java.lang.String getTargetId();

  /**
   *
   *
   * <pre>
   * Required. ID of the `Target` that is being rolled back.
   * </pre>
   *
   * <code>string target_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString getTargetIdBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the rollback `Rollout` to create.
   * </pre>
   *
   * <code>string rollout_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The rolloutId.
   */
  java.lang.String getRolloutId();

  /**
   *
   *
   * <pre>
   * Required. ID of the rollback `Rollout` to create.
   * </pre>
   *
   * <code>string rollout_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for rolloutId.
   */
  com.google.protobuf.ByteString getRolloutIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. ID of the `Release` to roll back to. If this isn't specified, the
   * previous successful `Rollout` to the specified target will be used to
   * determine the `Release`.
   * </pre>
   *
   * <code>string release_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The releaseId.
   */
  java.lang.String getReleaseId();

  /**
   *
   *
   * <pre>
   * Optional. ID of the `Release` to roll back to. If this isn't specified, the
   * previous successful `Rollout` to the specified target will be used to
   * determine the `Release`.
   * </pre>
   *
   * <code>string release_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for releaseId.
   */
  com.google.protobuf.ByteString getReleaseIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. If provided, this must be the latest `Rollout` that is on the
   * `Target`.
   * </pre>
   *
   * <code>string rollout_to_roll_back = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rolloutToRollBack.
   */
  java.lang.String getRolloutToRollBack();

  /**
   *
   *
   * <pre>
   * Optional. If provided, this must be the latest `Rollout` that is on the
   * `Target`.
   * </pre>
   *
   * <code>string rollout_to_roll_back = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for rolloutToRollBack.
   */
  com.google.protobuf.ByteString getRolloutToRollBackBytes();

  /**
   *
   *
   * <pre>
   * Optional. Configs for the rollback `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.RollbackTargetConfig rollback_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the rollbackConfig field is set.
   */
  boolean hasRollbackConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configs for the rollback `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.RollbackTargetConfig rollback_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The rollbackConfig.
   */
  com.google.cloud.deploy.v1.RollbackTargetConfig getRollbackConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configs for the rollback `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.RollbackTargetConfig rollback_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.RollbackTargetConfigOrBuilder getRollbackConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, the request is validated and the user is provided
   * with a `RollbackTargetResponse`.
   * </pre>
   *
   * <code>bool validate_only = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deploy_policy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the overrideDeployPolicy.
   */
  java.util.List<java.lang.String> getOverrideDeployPolicyList();

  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deploy_policy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of overrideDeployPolicy.
   */
  int getOverrideDeployPolicyCount();

  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deploy_policy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The overrideDeployPolicy at the given index.
   */
  java.lang.String getOverrideDeployPolicy(int index);

  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deploy_policy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the overrideDeployPolicy at the given index.
   */
  com.google.protobuf.ByteString getOverrideDeployPolicyBytes(int index);
}
