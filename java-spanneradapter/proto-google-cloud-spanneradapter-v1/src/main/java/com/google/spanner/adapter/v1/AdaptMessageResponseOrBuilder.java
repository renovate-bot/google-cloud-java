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
// source: google/spanner/adapter/v1/adapter.proto

// Protobuf Java Version: 3.25.8
package com.google.spanner.adapter.v1;

public interface AdaptMessageResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.adapter.v1.AdaptMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Uninterpreted bytes from the underlying wire protocol.
   * </pre>
   *
   * <code>bytes payload = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   *
   *
   * <pre>
   * Optional. Opaque state updates to be applied by the client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_updates = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getStateUpdatesCount();

  /**
   *
   *
   * <pre>
   * Optional. Opaque state updates to be applied by the client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_updates = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsStateUpdates(java.lang.String key);

  /** Use {@link #getStateUpdatesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getStateUpdates();

  /**
   *
   *
   * <pre>
   * Optional. Opaque state updates to be applied by the client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_updates = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getStateUpdatesMap();

  /**
   *
   *
   * <pre>
   * Optional. Opaque state updates to be applied by the client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_updates = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getStateUpdatesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Opaque state updates to be applied by the client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_updates = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getStateUpdatesOrThrow(java.lang.String key);
}
