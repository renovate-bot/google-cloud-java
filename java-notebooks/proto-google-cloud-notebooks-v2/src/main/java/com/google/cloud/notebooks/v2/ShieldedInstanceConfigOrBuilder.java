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

public interface ShieldedInstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v2.ShieldedInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Defines whether the VM instance has Secure Boot enabled.
   *
   * Secure Boot helps ensure that the system only runs authentic software by
   * verifying the digital signature of all boot components, and halting the
   * boot process if signature verification fails. Disabled by default.
   * </pre>
   *
   * <code>bool enable_secure_boot = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableSecureBoot.
   */
  boolean getEnableSecureBoot();

  /**
   *
   *
   * <pre>
   * Optional. Defines whether the VM instance has the vTPM enabled. Enabled by
   * default.
   * </pre>
   *
   * <code>bool enable_vtpm = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableVtpm.
   */
  boolean getEnableVtpm();

  /**
   *
   *
   * <pre>
   * Optional. Defines whether the VM instance has integrity monitoring enabled.
   *
   * Enables monitoring and attestation of the boot integrity of the VM
   * instance. The attestation is performed against the integrity policy
   * baseline. This baseline is initially derived from the implicitly trusted
   * boot image when the VM instance is created. Enabled by default.
   * </pre>
   *
   * <code>bool enable_integrity_monitoring = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableIntegrityMonitoring.
   */
  boolean getEnableIntegrityMonitoring();
}
