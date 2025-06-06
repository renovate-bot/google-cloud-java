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

public interface RollbackTargetConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.RollbackTargetConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The rollback `Rollout` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Rollout rollout = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the rollout field is set.
   */
  boolean hasRollout();

  /**
   *
   *
   * <pre>
   * Optional. The rollback `Rollout` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Rollout rollout = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The rollout.
   */
  com.google.cloud.deploy.v1.Rollout getRollout();

  /**
   *
   *
   * <pre>
   * Optional. The rollback `Rollout` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Rollout rollout = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.RolloutOrBuilder getRolloutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The starting phase ID for the `Rollout`. If unspecified, the
   * `Rollout` will start in the stable phase.
   * </pre>
   *
   * <code>string starting_phase_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The startingPhaseId.
   */
  java.lang.String getStartingPhaseId();

  /**
   *
   *
   * <pre>
   * Optional. The starting phase ID for the `Rollout`. If unspecified, the
   * `Rollout` will start in the stable phase.
   * </pre>
   *
   * <code>string starting_phase_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for startingPhaseId.
   */
  com.google.protobuf.ByteString getStartingPhaseIdBytes();
}
