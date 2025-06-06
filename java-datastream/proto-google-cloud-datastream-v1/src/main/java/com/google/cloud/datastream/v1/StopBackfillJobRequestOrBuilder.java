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
// source: google/cloud/datastream/v1/datastream.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datastream.v1;

public interface StopBackfillJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.StopBackfillJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the stream object resource to stop the backfill job
   * for.
   * </pre>
   *
   * <code>
   * string object = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The object.
   */
  java.lang.String getObject();

  /**
   *
   *
   * <pre>
   * Required. The name of the stream object resource to stop the backfill job
   * for.
   * </pre>
   *
   * <code>
   * string object = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for object.
   */
  com.google.protobuf.ByteString getObjectBytes();
}
