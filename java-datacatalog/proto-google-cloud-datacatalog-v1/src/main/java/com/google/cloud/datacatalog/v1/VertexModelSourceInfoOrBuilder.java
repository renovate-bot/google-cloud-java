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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

public interface VertexModelSourceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.VertexModelSourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the model source.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSourceInfo.ModelSourceType source_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for sourceType.
   */
  int getSourceTypeValue();

  /**
   *
   *
   * <pre>
   * Type of the model source.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSourceInfo.ModelSourceType source_type = 1;
   * </code>
   *
   * @return The sourceType.
   */
  com.google.cloud.datacatalog.v1.VertexModelSourceInfo.ModelSourceType getSourceType();

  /**
   *
   *
   * <pre>
   * If this Model is copy of another Model. If true then
   * [source_type][google.cloud.datacatalog.v1.VertexModelSourceInfo.source_type]
   * pertains to the original.
   * </pre>
   *
   * <code>bool copy = 2;</code>
   *
   * @return The copy.
   */
  boolean getCopy();
}
