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

public interface FunnelEventFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelEventFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   *
   * @return Whether the eventName field is set.
   */
  boolean hasEventName();

  /**
   *
   *
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   *
   * @return The eventName.
   */
  java.lang.String getEventName();

  /**
   *
   *
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   *
   * @return The bytes for eventName.
   */
  com.google.protobuf.ByteString getEventNameBytes();

  /**
   *
   *
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   *
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>
   * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
   * </code>
   *
   * @return Whether the funnelParameterFilterExpression field is set.
   */
  boolean hasFunnelParameterFilterExpression();

  /**
   *
   *
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   *
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>
   * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
   * </code>
   *
   * @return The funnelParameterFilterExpression.
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpression
      getFunnelParameterFilterExpression();

  /**
   *
   *
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   *
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>
   * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
   * </code>
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder
      getFunnelParameterFilterExpressionOrBuilder();
}
