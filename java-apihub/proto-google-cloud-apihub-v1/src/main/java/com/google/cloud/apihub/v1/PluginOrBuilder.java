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
// source: google/cloud/apihub/v1/plugin_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

public interface PluginOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.Plugin)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the plugin.
   * Format: `projects/{project}/locations/{location}/plugins/{plugin}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The name of the plugin.
   * Format: `projects/{project}/locations/{location}/plugins/{plugin}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the plugin. Max length is 50 characters
   * (Unicode code points).
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. The display name of the plugin. Max length is 50 characters
   * (Unicode code points).
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-plugin-type`
   * attribute.
   * The number of allowed values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();

  /**
   *
   *
   * <pre>
   * Required. The type of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-plugin-type`
   * attribute.
   * The number of allowed values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.apihub.v1.AttributeValues getType();

  /**
   *
   *
   * <pre>
   * Required. The type of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-plugin-type`
   * attribute.
   * The number of allowed values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The plugin description. Max length is 2000 characters (Unicode
   * code points).
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. The plugin description. Max length is 2000 characters (Unicode
   * code points).
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Represents the state of the plugin.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Plugin.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Represents the state of the plugin.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Plugin.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.apihub.v1.Plugin.State getState();
}
