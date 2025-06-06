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
// source: google/cloud/dataproc/v1/shared.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface EnvironmentConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.EnvironmentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the executionConfig field is set.
   */
  boolean hasExecutionConfig();

  /**
   *
   *
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The executionConfig.
   */
  com.google.cloud.dataproc.v1.ExecutionConfig getExecutionConfig();

  /**
   *
   *
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder getExecutionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the peripheralsConfig field is set.
   */
  boolean hasPeripheralsConfig();

  /**
   *
   *
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The peripheralsConfig.
   */
  com.google.cloud.dataproc.v1.PeripheralsConfig getPeripheralsConfig();

  /**
   *
   *
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder getPeripheralsConfigOrBuilder();
}
