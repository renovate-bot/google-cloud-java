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
// source: google/cloud/retail/v2alpha/branch_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

public interface ListBranchesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ListBranchesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The view to apply to the returned
   * [Branch][google.cloud.retail.v2alpha.Branch]. Defaults to
   * [Branch.BranchView.BASIC] if unspecified.
   * See documentation of fields of [Branch][google.cloud.retail.v2alpha.Branch]
   * to find what fields are excluded from BASIC view.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.BranchView view = 2;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();

  /**
   *
   *
   * <pre>
   * The view to apply to the returned
   * [Branch][google.cloud.retail.v2alpha.Branch]. Defaults to
   * [Branch.BranchView.BASIC] if unspecified.
   * See documentation of fields of [Branch][google.cloud.retail.v2alpha.Branch]
   * to find what fields are excluded from BASIC view.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.BranchView view = 2;</code>
   *
   * @return The view.
   */
  com.google.cloud.retail.v2alpha.BranchView getView();
}
