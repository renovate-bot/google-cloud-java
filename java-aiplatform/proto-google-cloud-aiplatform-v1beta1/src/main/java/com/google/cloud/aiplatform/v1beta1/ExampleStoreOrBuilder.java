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
// source: google/cloud/aiplatform/v1beta1/example_store.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ExampleStoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExampleStore)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the ExampleStore. This is a unique
   * identifier. Format:
   * projects/{project}/locations/{location}/exampleStores/{example_store}
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
   * Identifier. The resource name of the ExampleStore. This is a unique
   * identifier. Format:
   * projects/{project}/locations/{location}/exampleStores/{example_store}
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
   * Required. Display name of the ExampleStore.
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
   * Required. Display name of the ExampleStore.
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
   * Optional. Description of the ExampleStore.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. Description of the ExampleStore.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ExampleStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ExampleStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ExampleStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ExampleStore was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ExampleStore was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this ExampleStore was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Example Store config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExampleStoreConfig example_store_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the exampleStoreConfig field is set.
   */
  boolean hasExampleStoreConfig();

  /**
   *
   *
   * <pre>
   * Required. Example Store config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExampleStoreConfig example_store_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The exampleStoreConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ExampleStoreConfig getExampleStoreConfig();

  /**
   *
   *
   * <pre>
   * Required. Example Store config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExampleStoreConfig example_store_config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ExampleStoreConfigOrBuilder getExampleStoreConfigOrBuilder();
}
