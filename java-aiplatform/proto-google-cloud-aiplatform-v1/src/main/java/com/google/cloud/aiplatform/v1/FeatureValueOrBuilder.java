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
// source: google/cloud/aiplatform/v1/featurestore_online_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface FeatureValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FeatureValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Bool type feature value.
   * </pre>
   *
   * <code>bool bool_value = 1;</code>
   *
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();

  /**
   *
   *
   * <pre>
   * Bool type feature value.
   * </pre>
   *
   * <code>bool bool_value = 1;</code>
   *
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   *
   *
   * <pre>
   * Double type feature value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();

  /**
   *
   *
   * <pre>
   * Double type feature value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   *
   *
   * <pre>
   * Int64 feature value.
   * </pre>
   *
   * <code>int64 int64_value = 5;</code>
   *
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();

  /**
   *
   *
   * <pre>
   * Int64 feature value.
   * </pre>
   *
   * <code>int64 int64_value = 5;</code>
   *
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   *
   *
   * <pre>
   * String feature value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();

  /**
   *
   *
   * <pre>
   * String feature value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();

  /**
   *
   *
   * <pre>
   * String feature value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * A list of bool type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BoolArray bool_array_value = 7;</code>
   *
   * @return Whether the boolArrayValue field is set.
   */
  boolean hasBoolArrayValue();

  /**
   *
   *
   * <pre>
   * A list of bool type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BoolArray bool_array_value = 7;</code>
   *
   * @return The boolArrayValue.
   */
  com.google.cloud.aiplatform.v1.BoolArray getBoolArrayValue();

  /**
   *
   *
   * <pre>
   * A list of bool type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BoolArray bool_array_value = 7;</code>
   */
  com.google.cloud.aiplatform.v1.BoolArrayOrBuilder getBoolArrayValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of double type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DoubleArray double_array_value = 8;</code>
   *
   * @return Whether the doubleArrayValue field is set.
   */
  boolean hasDoubleArrayValue();

  /**
   *
   *
   * <pre>
   * A list of double type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DoubleArray double_array_value = 8;</code>
   *
   * @return The doubleArrayValue.
   */
  com.google.cloud.aiplatform.v1.DoubleArray getDoubleArrayValue();

  /**
   *
   *
   * <pre>
   * A list of double type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DoubleArray double_array_value = 8;</code>
   */
  com.google.cloud.aiplatform.v1.DoubleArrayOrBuilder getDoubleArrayValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of int64 type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Int64Array int64_array_value = 11;</code>
   *
   * @return Whether the int64ArrayValue field is set.
   */
  boolean hasInt64ArrayValue();

  /**
   *
   *
   * <pre>
   * A list of int64 type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Int64Array int64_array_value = 11;</code>
   *
   * @return The int64ArrayValue.
   */
  com.google.cloud.aiplatform.v1.Int64Array getInt64ArrayValue();

  /**
   *
   *
   * <pre>
   * A list of int64 type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Int64Array int64_array_value = 11;</code>
   */
  com.google.cloud.aiplatform.v1.Int64ArrayOrBuilder getInt64ArrayValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of string type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StringArray string_array_value = 12;</code>
   *
   * @return Whether the stringArrayValue field is set.
   */
  boolean hasStringArrayValue();

  /**
   *
   *
   * <pre>
   * A list of string type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StringArray string_array_value = 12;</code>
   *
   * @return The stringArrayValue.
   */
  com.google.cloud.aiplatform.v1.StringArray getStringArrayValue();

  /**
   *
   *
   * <pre>
   * A list of string type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StringArray string_array_value = 12;</code>
   */
  com.google.cloud.aiplatform.v1.StringArrayOrBuilder getStringArrayValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Bytes feature value.
   * </pre>
   *
   * <code>bytes bytes_value = 13;</code>
   *
   * @return Whether the bytesValue field is set.
   */
  boolean hasBytesValue();

  /**
   *
   *
   * <pre>
   * Bytes feature value.
   * </pre>
   *
   * <code>bytes bytes_value = 13;</code>
   *
   * @return The bytesValue.
   */
  com.google.protobuf.ByteString getBytesValue();

  /**
   *
   *
   * <pre>
   * A struct type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StructValue struct_value = 15;</code>
   *
   * @return Whether the structValue field is set.
   */
  boolean hasStructValue();

  /**
   *
   *
   * <pre>
   * A struct type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StructValue struct_value = 15;</code>
   *
   * @return The structValue.
   */
  com.google.cloud.aiplatform.v1.StructValue getStructValue();

  /**
   *
   *
   * <pre>
   * A struct type feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StructValue struct_value = 15;</code>
   */
  com.google.cloud.aiplatform.v1.StructValueOrBuilder getStructValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata of feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureValue.Metadata metadata = 14;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();

  /**
   *
   *
   * <pre>
   * Metadata of feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureValue.Metadata metadata = 14;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.aiplatform.v1.FeatureValue.Metadata getMetadata();

  /**
   *
   *
   * <pre>
   * Metadata of feature value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureValue.Metadata metadata = 14;</code>
   */
  com.google.cloud.aiplatform.v1.FeatureValue.MetadataOrBuilder getMetadataOrBuilder();

  com.google.cloud.aiplatform.v1.FeatureValue.ValueCase getValueCase();
}
