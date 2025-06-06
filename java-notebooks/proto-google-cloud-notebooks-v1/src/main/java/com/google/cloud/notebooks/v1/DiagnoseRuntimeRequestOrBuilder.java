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
// source: google/cloud/notebooks/v1/managed_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.notebooks.v1;

public interface DiagnoseRuntimeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.DiagnoseRuntimeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/runtimes/{runtimes_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Defines flags that are used to run the diagnostic tool
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the diagnosticConfig field is set.
   */
  boolean hasDiagnosticConfig();

  /**
   *
   *
   * <pre>
   * Required. Defines flags that are used to run the diagnostic tool
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The diagnosticConfig.
   */
  com.google.cloud.notebooks.v1.DiagnosticConfig getDiagnosticConfig();

  /**
   *
   *
   * <pre>
   * Required. Defines flags that are used to run the diagnostic tool
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.DiagnosticConfig diagnostic_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.notebooks.v1.DiagnosticConfigOrBuilder getDiagnosticConfigOrBuilder();
}
