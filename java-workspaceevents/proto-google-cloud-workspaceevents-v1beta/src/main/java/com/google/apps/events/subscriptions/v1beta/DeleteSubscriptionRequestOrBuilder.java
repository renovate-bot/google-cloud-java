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
// source: google/apps/events/subscriptions/v1beta/subscriptions_service.proto

// Protobuf Java Version: 3.25.8
package com.google.apps.events.subscriptions.v1beta;

public interface DeleteSubscriptionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.events.subscriptions.v1beta.DeleteSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the subscription to delete.
   *
   * Format: `subscriptions/{subscription}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the subscription to delete.
   *
   * Format: `subscriptions/{subscription}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set to `true`, validates and previews the request, but doesn't
   * delete the subscription.
   * </pre>
   *
   * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Optional. If set to `true` and the subscription isn't found, the request
   * succeeds but doesn't delete the subscription.
   * </pre>
   *
   * <code>bool allow_missing = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   *
   *
   * <pre>
   * Optional. Etag of the subscription.
   *
   * If present, it must match with the server's etag. Otherwise, request
   * fails with the status `ABORTED`.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. Etag of the subscription.
   *
   * If present, it must match with the server's etag. Otherwise, request
   * fails with the status `ABORTED`.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
