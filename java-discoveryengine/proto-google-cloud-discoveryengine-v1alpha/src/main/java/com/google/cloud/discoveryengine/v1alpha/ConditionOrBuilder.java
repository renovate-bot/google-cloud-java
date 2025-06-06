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
// source: google/cloud/discoveryengine/v1alpha/control.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public interface ConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.Condition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Search only
   * A list of terms to match the query on.
   *
   * Maximum of 10 query terms.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.QueryTerm query_terms = 2;
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1alpha.Condition.QueryTerm> getQueryTermsList();

  /**
   *
   *
   * <pre>
   * Search only
   * A list of terms to match the query on.
   *
   * Maximum of 10 query terms.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.QueryTerm query_terms = 2;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Condition.QueryTerm getQueryTerms(int index);

  /**
   *
   *
   * <pre>
   * Search only
   * A list of terms to match the query on.
   *
   * Maximum of 10 query terms.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.QueryTerm query_terms = 2;
   * </code>
   */
  int getQueryTermsCount();

  /**
   *
   *
   * <pre>
   * Search only
   * A list of terms to match the query on.
   *
   * Maximum of 10 query terms.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.QueryTerm query_terms = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.Condition.QueryTermOrBuilder>
      getQueryTermsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Search only
   * A list of terms to match the query on.
   *
   * Maximum of 10 query terms.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.QueryTerm query_terms = 2;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Condition.QueryTermOrBuilder getQueryTermsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when condition is active.
   *
   * Maximum of 10 time ranges.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.TimeRange active_time_range = 3;
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1alpha.Condition.TimeRange>
      getActiveTimeRangeList();

  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when condition is active.
   *
   * Maximum of 10 time ranges.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.TimeRange active_time_range = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Condition.TimeRange getActiveTimeRange(int index);

  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when condition is active.
   *
   * Maximum of 10 time ranges.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.TimeRange active_time_range = 3;
   * </code>
   */
  int getActiveTimeRangeCount();

  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when condition is active.
   *
   * Maximum of 10 time ranges.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.TimeRange active_time_range = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.Condition.TimeRangeOrBuilder>
      getActiveTimeRangeOrBuilderList();

  /**
   *
   *
   * <pre>
   * Range of time(s) specifying when condition is active.
   *
   * Maximum of 10 time ranges.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Condition.TimeRange active_time_range = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Condition.TimeRangeOrBuilder getActiveTimeRangeOrBuilder(
      int index);
}
