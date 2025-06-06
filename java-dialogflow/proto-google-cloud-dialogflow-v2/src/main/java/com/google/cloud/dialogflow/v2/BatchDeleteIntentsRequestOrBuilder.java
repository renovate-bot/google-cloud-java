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
// source: google/cloud/dialogflow/v2/intent.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

public interface BatchDeleteIntentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.BatchDeleteIntentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
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
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
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
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent intents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent> getIntentsList();

  /**
   *
   *
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent intents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent getIntents(int index);

  /**
   *
   *
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent intents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getIntentsCount();

  /**
   *
   *
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent intents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.IntentOrBuilder>
      getIntentsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent intents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.IntentOrBuilder getIntentsOrBuilder(int index);
}
