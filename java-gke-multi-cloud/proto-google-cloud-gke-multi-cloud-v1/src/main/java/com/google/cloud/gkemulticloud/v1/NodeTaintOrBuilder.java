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
// source: google/cloud/gkemulticloud/v1/common_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

public interface NodeTaintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.NodeTaint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Key for the taint.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  java.lang.String getKey();

  /**
   *
   *
   * <pre>
   * Required. Key for the taint.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Required. Value for the taint.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The value.
   */
  java.lang.String getValue();

  /**
   *
   *
   * <pre>
   * Required. Value for the taint.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * Required. The taint effect.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.NodeTaint.Effect effect = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for effect.
   */
  int getEffectValue();

  /**
   *
   *
   * <pre>
   * Required. The taint effect.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.NodeTaint.Effect effect = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The effect.
   */
  com.google.cloud.gkemulticloud.v1.NodeTaint.Effect getEffect();
}
