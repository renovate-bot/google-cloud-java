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

public interface MessageEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.MessageEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Participant role of the message.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.MessageEntry.Role role = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();

  /**
   *
   *
   * <pre>
   * Optional. Participant role of the message.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.MessageEntry.Role role = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The role.
   */
  com.google.cloud.dialogflow.v2beta1.MessageEntry.Role getRole();

  /**
   *
   *
   * <pre>
   * Optional. Transcript content of the message.
   * </pre>
   *
   * <code>string text = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The text.
   */
  java.lang.String getText();

  /**
   *
   *
   * <pre>
   * Optional. Transcript content of the message.
   * </pre>
   *
   * <code>string text = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Optional. The language of the text. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language) for a
   * list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();

  /**
   *
   *
   * <pre>
   * Optional. The language of the text. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language) for a
   * list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Create time of the message entry.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Optional. Create time of the message entry.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Optional. Create time of the message entry.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
