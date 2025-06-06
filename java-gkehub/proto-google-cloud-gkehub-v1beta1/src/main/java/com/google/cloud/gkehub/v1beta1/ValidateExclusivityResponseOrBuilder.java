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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.v1beta1;

public interface ValidateExclusivityResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The validation result.
   *
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();

  /**
   *
   *
   * <pre>
   * The validation result.
   *
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();

  /**
   *
   *
   * <pre>
   * The validation result.
   *
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();
}
