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
// source: google/cloud/dialogflow/cx/v3beta1/entity_type.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3beta1;

public interface DeleteEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.DeleteEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to delete.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to delete.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * This field has no effect for entity type not being used.
   * For entity types that are used by intents or pages:
   *
   * *  If `force` is set to false, an error will be returned with message
   *    indicating the referencing resources.
   * *  If `force` is set to true, Dialogflow will remove the entity type, as
   *    well as any references to the entity type (i.e. Page
   *    [parameter][google.cloud.dialogflow.cx.v3beta1.Form.Parameter] of the
   *    entity type will be changed to
   *    '&#64;sys.any' and intent
   *    [parameter][google.cloud.dialogflow.cx.v3beta1.Intent.Parameter] of the
   *    entity type will be removed).
   * </pre>
   *
   * <code>bool force = 2;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
