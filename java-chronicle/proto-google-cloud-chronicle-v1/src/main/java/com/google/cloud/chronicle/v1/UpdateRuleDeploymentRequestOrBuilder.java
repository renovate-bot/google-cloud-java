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
// source: google/cloud/chronicle/v1/rule.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.chronicle.v1;

public interface UpdateRuleDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.chronicle.v1.UpdateRuleDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The rule deployment to update.
   *
   * The rule deployment's `name` field is used to identify the rule deployment
   * to update. Format:
   * `projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.RuleDeployment rule_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ruleDeployment field is set.
   */
  boolean hasRuleDeployment();

  /**
   *
   *
   * <pre>
   * Required. The rule deployment to update.
   *
   * The rule deployment's `name` field is used to identify the rule deployment
   * to update. Format:
   * `projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.RuleDeployment rule_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ruleDeployment.
   */
  com.google.cloud.chronicle.v1.RuleDeployment getRuleDeployment();

  /**
   *
   *
   * <pre>
   * Required. The rule deployment to update.
   *
   * The rule deployment's `name` field is used to identify the rule deployment
   * to update. Format:
   * `projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.RuleDeployment rule_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.chronicle.v1.RuleDeploymentOrBuilder getRuleDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
