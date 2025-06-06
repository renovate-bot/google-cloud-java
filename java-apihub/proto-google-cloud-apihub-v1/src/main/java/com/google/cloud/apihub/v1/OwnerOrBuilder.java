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
// source: google/cloud/apihub/v1/common_fields.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

public interface OwnerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.Owner)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the owner.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the owner.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The email of the owner.
   * </pre>
   *
   * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();

  /**
   *
   *
   * <pre>
   * Required. The email of the owner.
   * </pre>
   *
   * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();
}
