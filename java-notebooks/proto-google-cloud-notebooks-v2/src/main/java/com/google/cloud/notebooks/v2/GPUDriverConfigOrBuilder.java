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
// source: google/cloud/notebooks/v2/gce_setup.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.notebooks.v2;

public interface GPUDriverConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v2.GPUDriverConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Whether the end user authorizes Google Cloud to install GPU
   * driver on this VM instance. If this field is empty or set to false, the GPU
   * driver won't be installed. Only applicable to instances with GPUs.
   * </pre>
   *
   * <code>bool enable_gpu_driver = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableGpuDriver.
   */
  boolean getEnableGpuDriver();

  /**
   *
   *
   * <pre>
   * Optional. Specify a custom Cloud Storage path where the GPU driver is
   * stored. If not specified, we'll automatically choose from official GPU
   * drivers.
   * </pre>
   *
   * <code>string custom_gpu_driver_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The customGpuDriverPath.
   */
  java.lang.String getCustomGpuDriverPath();

  /**
   *
   *
   * <pre>
   * Optional. Specify a custom Cloud Storage path where the GPU driver is
   * stored. If not specified, we'll automatically choose from official GPU
   * drivers.
   * </pre>
   *
   * <code>string custom_gpu_driver_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for customGpuDriverPath.
   */
  com.google.protobuf.ByteString getCustomGpuDriverPathBytes();
}
