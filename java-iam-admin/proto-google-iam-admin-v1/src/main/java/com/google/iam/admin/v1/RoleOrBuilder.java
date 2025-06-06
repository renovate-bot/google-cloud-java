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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.8
package com.google.iam.admin.v1;

public interface RoleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.Role)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the role.
   *
   * When Role is used in CreateRole, the role name must not be set.
   *
   * When Role is used in output and other input such as UpdateRole, the role
   * name is the complete path, e.g., roles/logging.viewer for predefined roles
   * and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
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
   * The name of the role.
   *
   * When Role is used in CreateRole, the role name must not be set.
   *
   * When Role is used in output and other input such as UpdateRole, the role
   * name is the complete path, e.g., roles/logging.viewer for predefined roles
   * and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
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
   * Optional. A human-readable title for the role.  Typically this
   * is limited to 100 UTF-8 bytes.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable title for the role.  Typically this
   * is limited to 100 UTF-8 bytes.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable description for the role.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable description for the role.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The names of the permissions this role grants when bound in an IAM policy.
   * </pre>
   *
   * <code>repeated string included_permissions = 7;</code>
   *
   * @return A list containing the includedPermissions.
   */
  java.util.List<java.lang.String> getIncludedPermissionsList();

  /**
   *
   *
   * <pre>
   * The names of the permissions this role grants when bound in an IAM policy.
   * </pre>
   *
   * <code>repeated string included_permissions = 7;</code>
   *
   * @return The count of includedPermissions.
   */
  int getIncludedPermissionsCount();

  /**
   *
   *
   * <pre>
   * The names of the permissions this role grants when bound in an IAM policy.
   * </pre>
   *
   * <code>repeated string included_permissions = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The includedPermissions at the given index.
   */
  java.lang.String getIncludedPermissions(int index);

  /**
   *
   *
   * <pre>
   * The names of the permissions this role grants when bound in an IAM policy.
   * </pre>
   *
   * <code>repeated string included_permissions = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the includedPermissions at the given index.
   */
  com.google.protobuf.ByteString getIncludedPermissionsBytes(int index);

  /**
   *
   *
   * <pre>
   * The current launch stage of the role. If the `ALPHA` launch stage has been
   * selected for a role, the `stage` field will not be included in the
   * returned definition for the role.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Role.RoleLaunchStage stage = 8;</code>
   *
   * @return The enum numeric value on the wire for stage.
   */
  int getStageValue();

  /**
   *
   *
   * <pre>
   * The current launch stage of the role. If the `ALPHA` launch stage has been
   * selected for a role, the `stage` field will not be included in the
   * returned definition for the role.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Role.RoleLaunchStage stage = 8;</code>
   *
   * @return The stage.
   */
  com.google.iam.admin.v1.Role.RoleLaunchStage getStage();

  /**
   *
   *
   * <pre>
   * Used to perform a consistent read-modify-write.
   * </pre>
   *
   * <code>bytes etag = 9;</code>
   *
   * @return The etag.
   */
  com.google.protobuf.ByteString getEtag();

  /**
   *
   *
   * <pre>
   * The current deleted state of the role. This field is read only.
   * It will be ignored in calls to CreateRole and UpdateRole.
   * </pre>
   *
   * <code>bool deleted = 11;</code>
   *
   * @return The deleted.
   */
  boolean getDeleted();
}
