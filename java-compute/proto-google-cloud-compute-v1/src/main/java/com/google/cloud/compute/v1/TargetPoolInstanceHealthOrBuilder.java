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

public interface TargetPoolInstanceHealthOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetPoolInstanceHealth)
    com.google.protobuf.MessageOrBuilder {

  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  java.util.List<com.google.cloud.compute.v1.HealthStatus> getHealthStatusList();

  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  com.google.cloud.compute.v1.HealthStatus getHealthStatus(int index);

  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  int getHealthStatusCount();

  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  java.util.List<? extends com.google.cloud.compute.v1.HealthStatusOrBuilder>
      getHealthStatusOrBuilderList();

  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  com.google.cloud.compute.v1.HealthStatusOrBuilder getHealthStatusOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();
}
