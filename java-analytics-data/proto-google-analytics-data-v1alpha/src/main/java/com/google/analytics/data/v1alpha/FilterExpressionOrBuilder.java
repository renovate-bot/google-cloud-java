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

public interface FilterExpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
   *
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();

  /**
   *
   *
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
   *
   * @return The andGroup.
   */
  com.google.analytics.data.v1alpha.FilterExpressionList getAndGroup();

  /**
   *
   *
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder getAndGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
   *
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();

  /**
   *
   *
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
   *
   * @return The orGroup.
   */
  com.google.analytics.data.v1alpha.FilterExpressionList getOrGroup();

  /**
   *
   *
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder getOrGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
   *
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();

  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
   *
   * @return The notExpression.
   */
  com.google.analytics.data.v1alpha.FilterExpression getNotExpression();

  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
   */
  com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getNotExpressionOrBuilder();

  /**
   *
   *
   * <pre>
   * A primitive filter. In the same FilterExpression, all of the filter's
   * field names need to be either all dimensions or all metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();

  /**
   *
   *
   * <pre>
   * A primitive filter. In the same FilterExpression, all of the filter's
   * field names need to be either all dimensions or all metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
   *
   * @return The filter.
   */
  com.google.analytics.data.v1alpha.Filter getFilter();

  /**
   *
   *
   * <pre>
   * A primitive filter. In the same FilterExpression, all of the filter's
   * field names need to be either all dimensions or all metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
   */
  com.google.analytics.data.v1alpha.FilterOrBuilder getFilterOrBuilder();

  com.google.analytics.data.v1alpha.FilterExpression.ExprCase getExprCase();
}
