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
// source: google/api/serviceusage/v1beta1/serviceusage.proto

// Protobuf Java Version: 3.25.8
package com.google.api.serviceusage.v1beta1;

public interface DeleteAdminOverrideRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.DeleteAdminOverrideRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the override to delete.
   *
   * An example name would be:
   * `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The resource name of the override to delete.
   *
   * An example name would be:
   * `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Whether to force the deletion of the quota override.
   * Setting the force parameter to 'true' ignores all quota safety checks that
   * would fail the request. QuotaSafetyCheck lists all such validations.
   * </pre>
   *
   * <code>bool force = 2;</code>
   *
   * @return The force.
   */
  boolean getForce();

  /**
   *
   *
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 3;</code>
   *
   * @return A list containing the forceOnly.
   */
  java.util.List<com.google.api.serviceusage.v1beta1.QuotaSafetyCheck> getForceOnlyList();

  /**
   *
   *
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 3;</code>
   *
   * @return The count of forceOnly.
   */
  int getForceOnlyCount();

  /**
   *
   *
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The forceOnly at the given index.
   */
  com.google.api.serviceusage.v1beta1.QuotaSafetyCheck getForceOnly(int index);

  /**
   *
   *
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 3;</code>
   *
   * @return A list containing the enum numeric values on the wire for forceOnly.
   */
  java.util.List<java.lang.Integer> getForceOnlyValueList();

  /**
   *
   *
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of forceOnly at the given index.
   */
  int getForceOnlyValue(int index);
}
