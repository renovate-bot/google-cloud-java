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
// source: google/analytics/admin/v1alpha/event_create_and_edit.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public interface EventEditRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.EventEditRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Resource name for this EventEditRule resource.
   * Format:
   * properties/{property}/dataStreams/{data_stream}/eventEditRules/{event_edit_rule}
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
   * Identifier. Resource name for this EventEditRule resource.
   * Format:
   * properties/{property}/dataStreams/{data_stream}/eventEditRules/{event_edit_rule}
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
   * Required. The display name of this event edit rule. Maximum of 255
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. The display name of this event edit rule. Maximum of 255
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Conditions on the source event must match for this rule to be
   * applied. Must have at least one condition, and can have up to 10 max.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.MatchingCondition event_conditions = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.MatchingCondition> getEventConditionsList();

  /**
   *
   *
   * <pre>
   * Required. Conditions on the source event must match for this rule to be
   * applied. Must have at least one condition, and can have up to 10 max.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.MatchingCondition event_conditions = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.MatchingCondition getEventConditions(int index);

  /**
   *
   *
   * <pre>
   * Required. Conditions on the source event must match for this rule to be
   * applied. Must have at least one condition, and can have up to 10 max.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.MatchingCondition event_conditions = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getEventConditionsCount();

  /**
   *
   *
   * <pre>
   * Required. Conditions on the source event must match for this rule to be
   * applied. Must have at least one condition, and can have up to 10 max.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.MatchingCondition event_conditions = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.MatchingConditionOrBuilder>
      getEventConditionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Conditions on the source event must match for this rule to be
   * applied. Must have at least one condition, and can have up to 10 max.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.MatchingCondition event_conditions = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.MatchingConditionOrBuilder getEventConditionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. Parameter mutations define parameter behavior on the new event,
   * and are applied in order. A maximum of 20 mutations can be applied.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ParameterMutation parameter_mutations = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.ParameterMutation> getParameterMutationsList();

  /**
   *
   *
   * <pre>
   * Required. Parameter mutations define parameter behavior on the new event,
   * and are applied in order. A maximum of 20 mutations can be applied.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ParameterMutation parameter_mutations = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.ParameterMutation getParameterMutations(int index);

  /**
   *
   *
   * <pre>
   * Required. Parameter mutations define parameter behavior on the new event,
   * and are applied in order. A maximum of 20 mutations can be applied.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ParameterMutation parameter_mutations = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getParameterMutationsCount();

  /**
   *
   *
   * <pre>
   * Required. Parameter mutations define parameter behavior on the new event,
   * and are applied in order. A maximum of 20 mutations can be applied.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ParameterMutation parameter_mutations = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.ParameterMutationOrBuilder>
      getParameterMutationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Parameter mutations define parameter behavior on the new event,
   * and are applied in order. A maximum of 20 mutations can be applied.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ParameterMutation parameter_mutations = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.ParameterMutationOrBuilder getParameterMutationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The order for which this rule will be processed. Rules with an
   * order value lower than this will be processed before this rule, rules with
   * an order value higher than this will be processed after this rule. New
   * event edit rules will be assigned an order value at the end of the order.
   *
   * This value does not apply to event create rules.
   * </pre>
   *
   * <code>int64 processing_order = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The processingOrder.
   */
  long getProcessingOrder();
}
