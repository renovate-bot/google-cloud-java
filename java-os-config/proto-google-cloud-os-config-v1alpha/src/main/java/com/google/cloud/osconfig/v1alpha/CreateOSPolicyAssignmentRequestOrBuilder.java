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
// source: google/cloud/osconfig/v1alpha/os_policy_assignments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.osconfig.v1alpha;

public interface CreateOSPolicyAssignmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.CreateOSPolicyAssignmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name in the form:
   * projects/{project}/locations/{location}
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
   * Required. The parent resource name in the form:
   * projects/{project}/locations/{location}
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
   * Required. The OS policy assignment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the osPolicyAssignment field is set.
   */
  boolean hasOsPolicyAssignment();

  /**
   *
   *
   * <pre>
   * Required. The OS policy assignment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The osPolicyAssignment.
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment getOsPolicyAssignment();

  /**
   *
   *
   * <pre>
   * Required. The OS policy assignment to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The logical name of the OS policy assignment in the project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-63 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the project.
   * </pre>
   *
   * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The osPolicyAssignmentId.
   */
  java.lang.String getOsPolicyAssignmentId();

  /**
   *
   *
   * <pre>
   * Required. The logical name of the OS policy assignment in the project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-63 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the project.
   * </pre>
   *
   * <code>string os_policy_assignment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for osPolicyAssignmentId.
   */
  com.google.protobuf.ByteString getOsPolicyAssignmentIdBytes();
}
