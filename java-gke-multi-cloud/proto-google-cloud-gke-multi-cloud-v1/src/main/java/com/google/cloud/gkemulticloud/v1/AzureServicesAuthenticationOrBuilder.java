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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

public interface AzureServicesAuthenticationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureServicesAuthentication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Azure Active Directory Tenant ID.
   * </pre>
   *
   * <code>string tenant_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tenantId.
   */
  java.lang.String getTenantId();

  /**
   *
   *
   * <pre>
   * Required. The Azure Active Directory Tenant ID.
   * </pre>
   *
   * <code>string tenant_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString getTenantIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Azure Active Directory Application ID.
   * </pre>
   *
   * <code>string application_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The applicationId.
   */
  java.lang.String getApplicationId();

  /**
   *
   *
   * <pre>
   * Required. The Azure Active Directory Application ID.
   * </pre>
   *
   * <code>string application_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for applicationId.
   */
  com.google.protobuf.ByteString getApplicationIdBytes();
}
