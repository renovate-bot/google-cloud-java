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
// source: google/cloud/workstations/v1beta/workstations.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.workstations.v1beta;

public interface GenerateAccessTokenRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.GenerateAccessTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Desired expiration time of the access token. This value must
   * be at most 24 hours in the future. If a value is not specified, the
   * token's expiration time will be set to a default value of 1 hour in the
   * future.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();

  /**
   *
   *
   * <pre>
   * Desired expiration time of the access token. This value must
   * be at most 24 hours in the future. If a value is not specified, the
   * token's expiration time will be set to a default value of 1 hour in the
   * future.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();

  /**
   *
   *
   * <pre>
   * Desired expiration time of the access token. This value must
   * be at most 24 hours in the future. If a value is not specified, the
   * token's expiration time will be set to a default value of 1 hour in the
   * future.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Desired lifetime duration of the access token. This value must
   * be at most 24 hours. If a value is not specified, the token's lifetime
   * will be set to a default value of 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   *
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();

  /**
   *
   *
   * <pre>
   * Desired lifetime duration of the access token. This value must
   * be at most 24 hours. If a value is not specified, the token's lifetime
   * will be set to a default value of 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   *
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();

  /**
   *
   *
   * <pre>
   * Desired lifetime duration of the access token. This value must
   * be at most 24 hours. If a value is not specified, the token's lifetime
   * will be set to a default value of 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Name of the workstation for which the access token should be
   * generated.
   * </pre>
   *
   * <code>
   * string workstation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The workstation.
   */
  java.lang.String getWorkstation();

  /**
   *
   *
   * <pre>
   * Required. Name of the workstation for which the access token should be
   * generated.
   * </pre>
   *
   * <code>
   * string workstation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for workstation.
   */
  com.google.protobuf.ByteString getWorkstationBytes();

  com.google.cloud.workstations.v1beta.GenerateAccessTokenRequest.ExpirationCase
      getExpirationCase();
}
