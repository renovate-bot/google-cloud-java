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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface GetRoutePolicyRouterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRoutePolicyRouterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Policy name for this request. Name must conform to RFC1035
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();

  /**
   *
   *
   * <pre>
   * The Policy name for this request. Name must conform to RFC1035
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return The policy.
   */
  java.lang.String getPolicy();

  /**
   *
   *
   * <pre>
   * The Policy name for this request. Name must conform to RFC1035
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return The bytes for policy.
   */
  com.google.protobuf.ByteString getPolicyBytes();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  java.lang.String getProject();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();

  /**
   *
   *
   * <pre>
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Name of the Router resource to query for the route policy. The name should conform to RFC1035.
   * </pre>
   *
   * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The router.
   */
  java.lang.String getRouter();

  /**
   *
   *
   * <pre>
   * Name of the Router resource to query for the route policy. The name should conform to RFC1035.
   * </pre>
   *
   * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for router.
   */
  com.google.protobuf.ByteString getRouterBytes();
}
