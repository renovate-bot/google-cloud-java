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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

public interface PrivateServiceConnectConnectivityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.PrivateServiceConnectConnectivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A service attachment that exposes a database, and has the
   * following format:
   * projects/{project}/regions/{region}/serviceAttachments/{service_attachment_name}
   * </pre>
   *
   * <code>string service_attachment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceAttachment.
   */
  java.lang.String getServiceAttachment();

  /**
   *
   *
   * <pre>
   * Required. A service attachment that exposes a database, and has the
   * following format:
   * projects/{project}/regions/{region}/serviceAttachments/{service_attachment_name}
   * </pre>
   *
   * <code>string service_attachment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceAttachment.
   */
  com.google.protobuf.ByteString getServiceAttachmentBytes();
}
