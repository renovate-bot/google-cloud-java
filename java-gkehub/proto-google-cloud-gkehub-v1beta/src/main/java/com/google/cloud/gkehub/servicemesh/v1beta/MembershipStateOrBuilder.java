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
// source: google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.servicemesh.v1beta;

public interface MembershipStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.servicemesh.v1beta.MembershipState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Status of control plane management
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipState.ControlPlaneManagement control_plane_management = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the controlPlaneManagement field is set.
   */
  boolean hasControlPlaneManagement();

  /**
   *
   *
   * <pre>
   * Output only. Status of control plane management
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipState.ControlPlaneManagement control_plane_management = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The controlPlaneManagement.
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.ControlPlaneManagement
      getControlPlaneManagement();

  /**
   *
   *
   * <pre>
   * Output only. Status of control plane management
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipState.ControlPlaneManagement control_plane_management = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.ControlPlaneManagementOrBuilder
      getControlPlaneManagementOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Status of data plane management.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipState.DataPlaneManagement data_plane_management = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataPlaneManagement field is set.
   */
  boolean hasDataPlaneManagement();

  /**
   *
   *
   * <pre>
   * Output only. Status of data plane management.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipState.DataPlaneManagement data_plane_management = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataPlaneManagement.
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.DataPlaneManagement
      getDataPlaneManagement();

  /**
   *
   *
   * <pre>
   * Output only. Status of data plane management.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipState.DataPlaneManagement data_plane_management = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.DataPlaneManagementOrBuilder
      getDataPlaneManagementOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. List of conditions reported for this membership.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1beta.MembershipState.Condition conditions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.Condition>
      getConditionsList();

  /**
   *
   *
   * <pre>
   * Output only. List of conditions reported for this membership.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1beta.MembershipState.Condition conditions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.Condition getConditions(int index);

  /**
   *
   *
   * <pre>
   * Output only. List of conditions reported for this membership.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1beta.MembershipState.Condition conditions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();

  /**
   *
   *
   * <pre>
   * Output only. List of conditions reported for this membership.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1beta.MembershipState.Condition conditions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.ConditionOrBuilder>
      getConditionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. List of conditions reported for this membership.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1beta.MembershipState.Condition conditions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipState.ConditionOrBuilder
      getConditionsOrBuilder(int index);
}
