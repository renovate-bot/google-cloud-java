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
// source: google/cloud/aiplatform/v1beta1/notebook_software_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface PostStartupScriptConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PostStartupScriptConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string post_startup_script = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The postStartupScript.
   */
  java.lang.String getPostStartupScript();

  /**
   * <code>string post_startup_script = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for postStartupScript.
   */
  com.google.protobuf.ByteString getPostStartupScriptBytes();

  /**
   * <code>string post_startup_script_url = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The postStartupScriptUrl.
   */
  java.lang.String getPostStartupScriptUrl();

  /**
   * <code>string post_startup_script_url = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for postStartupScriptUrl.
   */
  com.google.protobuf.ByteString getPostStartupScriptUrlBytes();

  /**
   * <code>
   * .google.cloud.aiplatform.v1beta1.PostStartupScriptConfig.PostStartupScriptBehavior post_startup_script_behavior = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for postStartupScriptBehavior.
   */
  int getPostStartupScriptBehaviorValue();

  /**
   * <code>
   * .google.cloud.aiplatform.v1beta1.PostStartupScriptConfig.PostStartupScriptBehavior post_startup_script_behavior = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The postStartupScriptBehavior.
   */
  com.google.cloud.aiplatform.v1beta1.PostStartupScriptConfig.PostStartupScriptBehavior
      getPostStartupScriptBehavior();
}
