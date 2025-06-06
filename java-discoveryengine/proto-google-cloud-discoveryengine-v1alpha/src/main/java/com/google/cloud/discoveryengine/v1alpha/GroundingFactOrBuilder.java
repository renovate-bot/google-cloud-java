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
// source: google/cloud/discoveryengine/v1alpha/grounding.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public interface GroundingFactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.GroundingFact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Text content of the fact. Can be at most 10K characters long.
   * </pre>
   *
   * <code>string fact_text = 1;</code>
   *
   * @return The factText.
   */
  java.lang.String getFactText();

  /**
   *
   *
   * <pre>
   * Text content of the fact. Can be at most 10K characters long.
   * </pre>
   *
   * <code>string fact_text = 1;</code>
   *
   * @return The bytes for factText.
   */
  com.google.protobuf.ByteString getFactTextBytes();

  /**
   *
   *
   * <pre>
   * Attributes associated with the fact.
   * Common attributes include `source` (indicating where the fact was sourced
   * from), `author` (indicating the author of the fact), and so on.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  int getAttributesCount();

  /**
   *
   *
   * <pre>
   * Attributes associated with the fact.
   * Common attributes include `source` (indicating where the fact was sourced
   * from), `author` (indicating the author of the fact), and so on.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  boolean containsAttributes(java.lang.String key);

  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAttributes();

  /**
   *
   *
   * <pre>
   * Attributes associated with the fact.
   * Common attributes include `source` (indicating where the fact was sourced
   * from), `author` (indicating the author of the fact), and so on.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAttributesMap();

  /**
   *
   *
   * <pre>
   * Attributes associated with the fact.
   * Common attributes include `source` (indicating where the fact was sourced
   * from), `author` (indicating the author of the fact), and so on.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  /* nullable */
  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Attributes associated with the fact.
   * Common attributes include `source` (indicating where the fact was sourced
   * from), `author` (indicating the author of the fact), and so on.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  java.lang.String getAttributesOrThrow(java.lang.String key);
}
