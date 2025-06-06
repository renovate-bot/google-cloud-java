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
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v1beta1;

public interface UpdateSecurityMarksRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.UpdateSecurityMarksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The security marks resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.SecurityMarks security_marks = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the securityMarks field is set.
   */
  boolean hasSecurityMarks();

  /**
   *
   *
   * <pre>
   * Required. The security marks resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.SecurityMarks security_marks = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The securityMarks.
   */
  com.google.cloud.securitycenter.v1beta1.SecurityMarks getSecurityMarks();

  /**
   *
   *
   * <pre>
   * Required. The security marks resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.SecurityMarks security_marks = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1beta1.SecurityMarksOrBuilder getSecurityMarksOrBuilder();

  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the security marks resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the security marks resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the security marks resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the updated SecurityMarks take effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The time at which the updated SecurityMarks take effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The time at which the updated SecurityMarks take effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();
}
