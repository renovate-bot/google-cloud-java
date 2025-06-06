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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.data.v1alpha;

public interface FunnelFilterExpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelFilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression in `andGroup` have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpressionList and_group = 1;</code>
   *
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression in `andGroup` have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpressionList and_group = 1;</code>
   *
   * @return The andGroup.
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpressionList getAndGroup();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression in `andGroup` have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpressionListOrBuilder getAndGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression in `orGroup` have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpressionList or_group = 2;</code>
   *
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression in `orGroup` have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpressionList or_group = 2;</code>
   *
   * @return The orGroup.
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpressionList getOrGroup();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression in `orGroup` have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpressionListOrBuilder getOrGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpression not_expression = 3;</code>
   *
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpression not_expression = 3;</code>
   *
   * @return The notExpression.
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpression getNotExpression();

  /**
   *
   *
   * <pre>
   * The FunnelFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpression not_expression = 3;</code>
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpressionOrBuilder getNotExpressionOrBuilder();

  /**
   *
   *
   * <pre>
   * A funnel filter for a dimension or metric.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFieldFilter funnel_field_filter = 4;</code>
   *
   * @return Whether the funnelFieldFilter field is set.
   */
  boolean hasFunnelFieldFilter();

  /**
   *
   *
   * <pre>
   * A funnel filter for a dimension or metric.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFieldFilter funnel_field_filter = 4;</code>
   *
   * @return The funnelFieldFilter.
   */
  com.google.analytics.data.v1alpha.FunnelFieldFilter getFunnelFieldFilter();

  /**
   *
   *
   * <pre>
   * A funnel filter for a dimension or metric.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFieldFilter funnel_field_filter = 4;</code>
   */
  com.google.analytics.data.v1alpha.FunnelFieldFilterOrBuilder getFunnelFieldFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Creates a filter that matches events of a single event name. If a
   * parameter filter expression is specified, only the subset of events that
   * match both the single event name and the parameter filter expressions
   * match this event filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelEventFilter funnel_event_filter = 5;</code>
   *
   * @return Whether the funnelEventFilter field is set.
   */
  boolean hasFunnelEventFilter();

  /**
   *
   *
   * <pre>
   * Creates a filter that matches events of a single event name. If a
   * parameter filter expression is specified, only the subset of events that
   * match both the single event name and the parameter filter expressions
   * match this event filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelEventFilter funnel_event_filter = 5;</code>
   *
   * @return The funnelEventFilter.
   */
  com.google.analytics.data.v1alpha.FunnelEventFilter getFunnelEventFilter();

  /**
   *
   *
   * <pre>
   * Creates a filter that matches events of a single event name. If a
   * parameter filter expression is specified, only the subset of events that
   * match both the single event name and the parameter filter expressions
   * match this event filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelEventFilter funnel_event_filter = 5;</code>
   */
  com.google.analytics.data.v1alpha.FunnelEventFilterOrBuilder getFunnelEventFilterOrBuilder();

  com.google.analytics.data.v1alpha.FunnelFilterExpression.ExprCase getExprCase();
}
