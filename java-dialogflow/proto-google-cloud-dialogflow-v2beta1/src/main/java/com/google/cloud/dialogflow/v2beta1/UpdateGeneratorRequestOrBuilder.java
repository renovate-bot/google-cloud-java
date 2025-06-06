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
// source: google/cloud/dialogflow/v2beta1/generator.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public interface UpdateGeneratorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateGeneratorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The generator to update.
   * The name field of generator is to identify the generator to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Generator generator = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the generator field is set.
   */
  boolean hasGenerator();

  /**
   *
   *
   * <pre>
   * Required. The generator to update.
   * The name field of generator is to identify the generator to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Generator generator = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The generator.
   */
  com.google.cloud.dialogflow.v2beta1.Generator getGenerator();

  /**
   *
   *
   * <pre>
   * Required. The generator to update.
   * The name field of generator is to identify the generator to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Generator generator = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.GeneratorOrBuilder getGeneratorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
