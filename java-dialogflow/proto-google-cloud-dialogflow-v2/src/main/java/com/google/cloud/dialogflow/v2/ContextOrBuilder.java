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
// source: google/cloud/dialogflow/v2/context.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

public interface ContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Context)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the context. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`,
   * or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.
   *
   * The `Context ID` is always converted to lowercase, may only contain
   * characters in `a-zA-Z0-9_-%` and may be at most 250 bytes long.
   *
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   *
   * The following context names are reserved for internal use by Dialogflow.
   * You should not use these contexts or create contexts with these names:
   *
   * * `__system_counters__`
   * * `*_id_dialog_context`
   * * `*_dialog_params_size`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the context. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`,
   * or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.
   *
   * The `Context ID` is always converted to lowercase, may only contain
   * characters in `a-zA-Z0-9_-%` and may be at most 250 bytes long.
   *
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   *
   * The following context names are reserved for internal use by Dialogflow.
   * You should not use these contexts or create contexts with these names:
   *
   * * `__system_counters__`
   * * `*_id_dialog_context`
   * * `*_dialog_params_size`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of conversational query requests after which the
   * context expires. The default is `0`. If set to `0`, the context expires
   * immediately. Contexts expire automatically after 20 minutes if there
   * are no matching queries.
   * </pre>
   *
   * <code>int32 lifespan_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The lifespanCount.
   */
  int getLifespanCount();

  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   *
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   *
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();

  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   *
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   *
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();

  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   *
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   *
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();
}
