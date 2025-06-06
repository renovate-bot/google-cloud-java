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
// source: google/cloud/retail/v2/user_event_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

public interface RejoinUserEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.RejoinUserEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The type of the user event rejoin to define the scope and range of the user
   * events to be rejoined with the latest product catalog. Defaults to
   * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
   * an invalid integer value.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for userEventRejoinScope.
   */
  int getUserEventRejoinScopeValue();

  /**
   *
   *
   * <pre>
   * The type of the user event rejoin to define the scope and range of the user
   * events to be rejoined with the latest product catalog. Defaults to
   * `USER_EVENT_REJOIN_SCOPE_UNSPECIFIED` if this field is not set, or set to
   * an invalid integer value.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope user_event_rejoin_scope = 2;
   * </code>
   *
   * @return The userEventRejoinScope.
   */
  com.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope getUserEventRejoinScope();
}
