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
// source: google/cloud/billing/budgets/v1beta1/budget_model.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.billing.budgets.v1beta1;

public interface BudgetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1beta1.Budget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the budget.
   * The resource name implies the scope of a budget. Values are of the form
   * `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the budget.
   * The resource name implies the scope of a budget. Values are of the form
   * `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User data for display name in UI.
   * Validation: &lt;= 60 chars.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * User data for display name in UI.
   * Validation: &lt;= 60 chars.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filters that define which resources are used to compute the
   * actual spend against the budget amount, such as projects, services, and the
   * budget's time period, as well as other filters.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Filter budget_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the budgetFilter field is set.
   */
  boolean hasBudgetFilter();

  /**
   *
   *
   * <pre>
   * Optional. Filters that define which resources are used to compute the
   * actual spend against the budget amount, such as projects, services, and the
   * budget's time period, as well as other filters.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Filter budget_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The budgetFilter.
   */
  com.google.cloud.billing.budgets.v1beta1.Filter getBudgetFilter();

  /**
   *
   *
   * <pre>
   * Optional. Filters that define which resources are used to compute the
   * actual spend against the budget amount, such as projects, services, and the
   * budget's time period, as well as other filters.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Filter budget_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.billing.budgets.v1beta1.FilterOrBuilder getBudgetFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Budgeted amount.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.BudgetAmount amount = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the amount field is set.
   */
  boolean hasAmount();

  /**
   *
   *
   * <pre>
   * Required. Budgeted amount.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.BudgetAmount amount = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The amount.
   */
  com.google.cloud.billing.budgets.v1beta1.BudgetAmount getAmount();

  /**
   *
   *
   * <pre>
   * Required. Budgeted amount.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.BudgetAmount amount = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.billing.budgets.v1beta1.BudgetAmountOrBuilder getAmountOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   *
   * Optional for `pubsubTopic` notifications.
   *
   * Required if using email notifications.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.billing.budgets.v1beta1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.billing.budgets.v1beta1.ThresholdRule> getThresholdRulesList();

  /**
   *
   *
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   *
   * Optional for `pubsubTopic` notifications.
   *
   * Required if using email notifications.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.billing.budgets.v1beta1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.billing.budgets.v1beta1.ThresholdRule getThresholdRules(int index);

  /**
   *
   *
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   *
   * Optional for `pubsubTopic` notifications.
   *
   * Required if using email notifications.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.billing.budgets.v1beta1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getThresholdRulesCount();

  /**
   *
   *
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   *
   * Optional for `pubsubTopic` notifications.
   *
   * Required if using email notifications.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.billing.budgets.v1beta1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.billing.budgets.v1beta1.ThresholdRuleOrBuilder>
      getThresholdRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   *
   * Optional for `pubsubTopic` notifications.
   *
   * Required if using email notifications.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.billing.budgets.v1beta1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.billing.budgets.v1beta1.ThresholdRuleOrBuilder getThresholdRulesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Rules to apply to notifications sent based on budget spend and
   * thresholds.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.AllUpdatesRule all_updates_rule = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the allUpdatesRule field is set.
   */
  boolean hasAllUpdatesRule();

  /**
   *
   *
   * <pre>
   * Optional. Rules to apply to notifications sent based on budget spend and
   * thresholds.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.AllUpdatesRule all_updates_rule = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The allUpdatesRule.
   */
  com.google.cloud.billing.budgets.v1beta1.AllUpdatesRule getAllUpdatesRule();

  /**
   *
   *
   * <pre>
   * Optional. Rules to apply to notifications sent based on budget spend and
   * thresholds.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.AllUpdatesRule all_updates_rule = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.billing.budgets.v1beta1.AllUpdatesRuleOrBuilder getAllUpdatesRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Etag to validate that the object is unchanged for a
   * read-modify-write operation.
   * An empty etag will cause an update to overwrite other changes.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. Etag to validate that the object is unchanged for a
   * read-modify-write operation.
   * An empty etag will cause an update to overwrite other changes.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
