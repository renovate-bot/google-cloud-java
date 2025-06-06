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
// source: google/shopping/merchant/productstudio/v1alpha/textsuggestions.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.productstudio.v1alpha;

public interface ProductTextGenerationSuggestionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.productstudio.v1alpha.ProductTextGenerationSuggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The text generated
   * </pre>
   *
   * <code>optional string text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();

  /**
   *
   *
   * <pre>
   * The text generated
   * </pre>
   *
   * <code>optional string text = 1;</code>
   *
   * @return The text.
   */
  java.lang.String getText();

  /**
   *
   *
   * <pre>
   * The text generated
   * </pre>
   *
   * <code>optional string text = 1;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * The quality score associated with the generation. Heuristic implemented
   * according to the feedgen team's implementation styles.
   * </pre>
   *
   * <code>optional float score = 2;</code>
   *
   * @return Whether the score field is set.
   */
  boolean hasScore();

  /**
   *
   *
   * <pre>
   * The quality score associated with the generation. Heuristic implemented
   * according to the feedgen team's implementation styles.
   * </pre>
   *
   * <code>optional float score = 2;</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * A brief summarization of all the changes that have been made.
   * </pre>
   *
   * <code>optional string change_summary = 3;</code>
   *
   * @return Whether the changeSummary field is set.
   */
  boolean hasChangeSummary();

  /**
   *
   *
   * <pre>
   * A brief summarization of all the changes that have been made.
   * </pre>
   *
   * <code>optional string change_summary = 3;</code>
   *
   * @return The changeSummary.
   */
  java.lang.String getChangeSummary();

  /**
   *
   *
   * <pre>
   * A brief summarization of all the changes that have been made.
   * </pre>
   *
   * <code>optional string change_summary = 3;</code>
   *
   * @return The bytes for changeSummary.
   */
  com.google.protobuf.ByteString getChangeSummaryBytes();
}
