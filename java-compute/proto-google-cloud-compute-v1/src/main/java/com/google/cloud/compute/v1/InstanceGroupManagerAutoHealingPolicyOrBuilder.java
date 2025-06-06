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

public interface InstanceGroupManagerAutoHealingPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URL for the health check that signals autohealing.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return Whether the healthCheck field is set.
   */
  boolean hasHealthCheck();

  /**
   *
   *
   * <pre>
   * The URL for the health check that signals autohealing.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return The healthCheck.
   */
  java.lang.String getHealthCheck();

  /**
   *
   *
   * <pre>
   * The URL for the health check that signals autohealing.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return The bytes for healthCheck.
   */
  com.google.protobuf.ByteString getHealthCheckBytes();

  /**
   *
   *
   * <pre>
   * The initial delay is the number of seconds that a new VM takes to initialize and run its startup script. During a VM's initial delay period, the MIG ignores unsuccessful health checks because the VM might be in the startup process. This prevents the MIG from prematurely recreating a VM. If the health check receives a healthy response during the initial delay, it indicates that the startup process is complete and the VM is ready. The value of initial delay must be between 0 and 3600 seconds. The default value is 0.
   * </pre>
   *
   * <code>optional int32 initial_delay_sec = 263207002;</code>
   *
   * @return Whether the initialDelaySec field is set.
   */
  boolean hasInitialDelaySec();

  /**
   *
   *
   * <pre>
   * The initial delay is the number of seconds that a new VM takes to initialize and run its startup script. During a VM's initial delay period, the MIG ignores unsuccessful health checks because the VM might be in the startup process. This prevents the MIG from prematurely recreating a VM. If the health check receives a healthy response during the initial delay, it indicates that the startup process is complete and the VM is ready. The value of initial delay must be between 0 and 3600 seconds. The default value is 0.
   * </pre>
   *
   * <code>optional int32 initial_delay_sec = 263207002;</code>
   *
   * @return The initialDelaySec.
   */
  int getInitialDelaySec();
}
