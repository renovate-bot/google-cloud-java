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

public interface DeleteWorkstationClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.DeleteWorkstationClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the workstation cluster to delete.
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
   * Required. Name of the workstation cluster to delete.
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
   * Optional. If set, validate the request and preview the review, but do not
   * apply it.
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
   * Optional. If set, the request will be rejected if the latest version of the
   * workstation cluster on the server does not have this ETag.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. If set, the request will be rejected if the latest version of the
   * workstation cluster on the server does not have this ETag.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, any workstation configurations and workstations in the
   * workstation cluster are also deleted. Otherwise, the request only
   * works if the workstation cluster has no configurations or workstations.
   * </pre>
   *
   * <code>bool force = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The force.
   */
  boolean getForce();
}
