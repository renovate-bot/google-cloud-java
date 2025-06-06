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
// source: google/cloud/dialogflow/v2beta1/agent.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public interface SubAgentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SubAgent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();

  /**
   *
   *
   * <pre>
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Optional. The unique identifier (`environment name` in dialogflow console)
   * of this sub-agent environment. Assumes draft environment if `environment`
   * is not set.
   * </pre>
   *
   * <code>string environment = 2;</code>
   *
   * @return The environment.
   */
  java.lang.String getEnvironment();

  /**
   *
   *
   * <pre>
   * Optional. The unique identifier (`environment name` in dialogflow console)
   * of this sub-agent environment. Assumes draft environment if `environment`
   * is not set.
   * </pre>
   *
   * <code>string environment = 2;</code>
   *
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString getEnvironmentBytes();
}
