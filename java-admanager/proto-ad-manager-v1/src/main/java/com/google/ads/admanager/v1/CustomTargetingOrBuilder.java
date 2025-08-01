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
// source: google/ads/admanager/v1/targeting.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public interface CustomTargetingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.CustomTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. These clauses are all ORed together.
   * </pre>
   *
   * <code>
   * repeated .google.ads.admanager.v1.CustomTargetingClause custom_targeting_clauses = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.ads.admanager.v1.CustomTargetingClause> getCustomTargetingClausesList();

  /**
   *
   *
   * <pre>
   * Optional. These clauses are all ORed together.
   * </pre>
   *
   * <code>
   * repeated .google.ads.admanager.v1.CustomTargetingClause custom_targeting_clauses = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.ads.admanager.v1.CustomTargetingClause getCustomTargetingClauses(int index);

  /**
   *
   *
   * <pre>
   * Optional. These clauses are all ORed together.
   * </pre>
   *
   * <code>
   * repeated .google.ads.admanager.v1.CustomTargetingClause custom_targeting_clauses = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getCustomTargetingClausesCount();

  /**
   *
   *
   * <pre>
   * Optional. These clauses are all ORed together.
   * </pre>
   *
   * <code>
   * repeated .google.ads.admanager.v1.CustomTargetingClause custom_targeting_clauses = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.ads.admanager.v1.CustomTargetingClauseOrBuilder>
      getCustomTargetingClausesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. These clauses are all ORed together.
   * </pre>
   *
   * <code>
   * repeated .google.ads.admanager.v1.CustomTargetingClause custom_targeting_clauses = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.ads.admanager.v1.CustomTargetingClauseOrBuilder getCustomTargetingClausesOrBuilder(
      int index);
}
