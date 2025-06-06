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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface NodeInitializationActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.NodeInitializationAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Cloud Storage URI of executable file.
   * </pre>
   *
   * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The executableFile.
   */
  java.lang.String getExecutableFile();

  /**
   *
   *
   * <pre>
   * Required. Cloud Storage URI of executable file.
   * </pre>
   *
   * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for executableFile.
   */
  com.google.protobuf.ByteString getExecutableFileBytes();

  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   *
   * Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the executionTimeout field is set.
   */
  boolean hasExecutionTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   *
   * Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The executionTimeout.
   */
  com.google.protobuf.Duration getExecutionTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   *
   * Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getExecutionTimeoutOrBuilder();
}
