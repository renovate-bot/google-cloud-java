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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datastream.v1alpha1;

public interface ValidationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.Validation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A short description of the validation.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * A short description of the validation.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Validation execution status.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Validation.Status status = 2;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();

  /**
   *
   *
   * <pre>
   * Validation execution status.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Validation.Status status = 2;</code>
   *
   * @return The status.
   */
  com.google.cloud.datastream.v1alpha1.Validation.Status getStatus();

  /**
   *
   *
   * <pre>
   * Messages reflecting the validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.ValidationMessage message = 3;</code>
   */
  java.util.List<com.google.cloud.datastream.v1alpha1.ValidationMessage> getMessageList();

  /**
   *
   *
   * <pre>
   * Messages reflecting the validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.ValidationMessage message = 3;</code>
   */
  com.google.cloud.datastream.v1alpha1.ValidationMessage getMessage(int index);

  /**
   *
   *
   * <pre>
   * Messages reflecting the validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.ValidationMessage message = 3;</code>
   */
  int getMessageCount();

  /**
   *
   *
   * <pre>
   * Messages reflecting the validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.ValidationMessage message = 3;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1alpha1.ValidationMessageOrBuilder>
      getMessageOrBuilderList();

  /**
   *
   *
   * <pre>
   * Messages reflecting the validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.ValidationMessage message = 3;</code>
   */
  com.google.cloud.datastream.v1alpha1.ValidationMessageOrBuilder getMessageOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A custom code identifying this validation.
   * </pre>
   *
   * <code>string code = 4;</code>
   *
   * @return The code.
   */
  java.lang.String getCode();

  /**
   *
   *
   * <pre>
   * A custom code identifying this validation.
   * </pre>
   *
   * <code>string code = 4;</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();
}
