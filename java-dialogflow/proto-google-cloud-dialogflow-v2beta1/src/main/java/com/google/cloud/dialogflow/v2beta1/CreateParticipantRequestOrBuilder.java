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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public interface CreateParticipantRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.CreateParticipantRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource identifier of the conversation adding the participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Resource identifier of the conversation adding the participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The participant to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the participant field is set.
   */
  boolean hasParticipant();

  /**
   *
   *
   * <pre>
   * Required. The participant to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The participant.
   */
  com.google.cloud.dialogflow.v2beta1.Participant getParticipant();

  /**
   *
   *
   * <pre>
   * Required. The participant to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder getParticipantOrBuilder();
}
