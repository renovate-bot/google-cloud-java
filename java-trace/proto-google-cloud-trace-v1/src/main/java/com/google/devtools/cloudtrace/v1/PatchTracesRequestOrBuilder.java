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
// source: google/devtools/cloudtrace/v1/trace.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.cloudtrace.v1;

public interface PatchTracesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.PatchTracesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();

  /**
   *
   *
   * <pre>
   * Required. ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The body of the message.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the traces field is set.
   */
  boolean hasTraces();

  /**
   *
   *
   * <pre>
   * Required. The body of the message.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The traces.
   */
  com.google.devtools.cloudtrace.v1.Traces getTraces();

  /**
   *
   *
   * <pre>
   * Required. The body of the message.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.devtools.cloudtrace.v1.TracesOrBuilder getTracesOrBuilder();
}
