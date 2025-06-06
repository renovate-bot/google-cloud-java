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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contactcenterinsights.v1;

public interface PhraseMatchRuleConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The configuration for the exact match rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
   *
   * @return Whether the exactMatchConfig field is set.
   */
  boolean hasExactMatchConfig();

  /**
   *
   *
   * <pre>
   * The configuration for the exact match rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
   *
   * @return The exactMatchConfig.
   */
  com.google.cloud.contactcenterinsights.v1.ExactMatchConfig getExactMatchConfig();

  /**
   *
   *
   * <pre>
   * The configuration for the exact match rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
   */
  com.google.cloud.contactcenterinsights.v1.ExactMatchConfigOrBuilder
      getExactMatchConfigOrBuilder();

  com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.ConfigCase getConfigCase();
}
