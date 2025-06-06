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
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.telcoautomation.v1alpha1;

public interface UpdateDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.UpdateDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `deployment` to update.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Deployment deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();

  /**
   *
   *
   * <pre>
   * Required. The `deployment` to update.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Deployment deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deployment.
   */
  com.google.cloud.telcoautomation.v1alpha1.Deployment getDeployment();

  /**
   *
   *
   * <pre>
   * Required. The `deployment` to update.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Deployment deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.telcoautomation.v1alpha1.DeploymentOrBuilder getDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Update mask is used to specify the fields to be overwritten in
   * the `deployment` resource by the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Update mask is used to specify the fields to be overwritten in
   * the `deployment` resource by the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Update mask is used to specify the fields to be overwritten in
   * the `deployment` resource by the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
