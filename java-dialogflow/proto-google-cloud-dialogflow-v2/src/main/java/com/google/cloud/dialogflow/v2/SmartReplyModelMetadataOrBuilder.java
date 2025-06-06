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
// source: google/cloud/dialogflow/v2/conversation_model.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

public interface SmartReplyModelMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SmartReplyModelMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Type of the smart reply model. If not provided, model_type is
   * used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for trainingModelType.
   */
  int getTrainingModelTypeValue();

  /**
   *
   *
   * <pre>
   * Optional. Type of the smart reply model. If not provided, model_type is
   * used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The trainingModelType.
   */
  com.google.cloud.dialogflow.v2.ConversationModel.ModelType getTrainingModelType();
}
