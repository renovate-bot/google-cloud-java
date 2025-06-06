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
// source: google/dataflow/v1beta3/jobs.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

public interface DisplayDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.DisplayData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The key identifying the display data.
   * This is intended to be used as a label for the display data
   * when viewed in a dax monitoring system.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();

  /**
   *
   *
   * <pre>
   * The key identifying the display data.
   * This is intended to be used as a label for the display data
   * when viewed in a dax monitoring system.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * The namespace for the key. This is usually a class name or programming
   * language namespace (i.e. python module) which defines the display data.
   * This allows a dax monitoring system to specially handle the data
   * and perform custom rendering.
   * </pre>
   *
   * <code>string namespace = 2;</code>
   *
   * @return The namespace.
   */
  java.lang.String getNamespace();

  /**
   *
   *
   * <pre>
   * The namespace for the key. This is usually a class name or programming
   * language namespace (i.e. python module) which defines the display data.
   * This allows a dax monitoring system to specially handle the data
   * and perform custom rendering.
   * </pre>
   *
   * <code>string namespace = 2;</code>
   *
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString getNamespaceBytes();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of string type.
   * </pre>
   *
   * <code>string str_value = 4;</code>
   *
   * @return Whether the strValue field is set.
   */
  boolean hasStrValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of string type.
   * </pre>
   *
   * <code>string str_value = 4;</code>
   *
   * @return The strValue.
   */
  java.lang.String getStrValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of string type.
   * </pre>
   *
   * <code>string str_value = 4;</code>
   *
   * @return The bytes for strValue.
   */
  com.google.protobuf.ByteString getStrValueBytes();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of int64 type.
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
   * Contains value if the data is of int64 type.
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
   * Contains value if the data is of float type.
   * </pre>
   *
   * <code>float float_value = 6;</code>
   *
   * @return Whether the floatValue field is set.
   */
  boolean hasFloatValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of float type.
   * </pre>
   *
   * <code>float float_value = 6;</code>
   *
   * @return The floatValue.
   */
  float getFloatValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of java class type.
   * </pre>
   *
   * <code>string java_class_value = 7;</code>
   *
   * @return Whether the javaClassValue field is set.
   */
  boolean hasJavaClassValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of java class type.
   * </pre>
   *
   * <code>string java_class_value = 7;</code>
   *
   * @return The javaClassValue.
   */
  java.lang.String getJavaClassValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of java class type.
   * </pre>
   *
   * <code>string java_class_value = 7;</code>
   *
   * @return The bytes for javaClassValue.
   */
  com.google.protobuf.ByteString getJavaClassValueBytes();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 8;</code>
   *
   * @return Whether the timestampValue field is set.
   */
  boolean hasTimestampValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 8;</code>
   *
   * @return The timestampValue.
   */
  com.google.protobuf.Timestamp getTimestampValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of duration type.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_value = 9;</code>
   *
   * @return Whether the durationValue field is set.
   */
  boolean hasDurationValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of duration type.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_value = 9;</code>
   *
   * @return The durationValue.
   */
  com.google.protobuf.Duration getDurationValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of duration type.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_value = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of a boolean type.
   * </pre>
   *
   * <code>bool bool_value = 10;</code>
   *
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();

  /**
   *
   *
   * <pre>
   * Contains value if the data is of a boolean type.
   * </pre>
   *
   * <code>bool bool_value = 10;</code>
   *
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   *
   *
   * <pre>
   * A possible additional shorter value to display.
   * For example a java_class_name_value of com.mypackage.MyDoFn
   * will be stored with MyDoFn as the short_str_value and
   * com.mypackage.MyDoFn as the java_class_name value.
   * short_str_value can be displayed and java_class_name_value
   * will be displayed as a tooltip.
   * </pre>
   *
   * <code>string short_str_value = 11;</code>
   *
   * @return The shortStrValue.
   */
  java.lang.String getShortStrValue();

  /**
   *
   *
   * <pre>
   * A possible additional shorter value to display.
   * For example a java_class_name_value of com.mypackage.MyDoFn
   * will be stored with MyDoFn as the short_str_value and
   * com.mypackage.MyDoFn as the java_class_name value.
   * short_str_value can be displayed and java_class_name_value
   * will be displayed as a tooltip.
   * </pre>
   *
   * <code>string short_str_value = 11;</code>
   *
   * @return The bytes for shortStrValue.
   */
  com.google.protobuf.ByteString getShortStrValueBytes();

  /**
   *
   *
   * <pre>
   * An optional full URL.
   * </pre>
   *
   * <code>string url = 12;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();

  /**
   *
   *
   * <pre>
   * An optional full URL.
   * </pre>
   *
   * <code>string url = 12;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * An optional label to display in a dax UI for the element.
   * </pre>
   *
   * <code>string label = 13;</code>
   *
   * @return The label.
   */
  java.lang.String getLabel();

  /**
   *
   *
   * <pre>
   * An optional label to display in a dax UI for the element.
   * </pre>
   *
   * <code>string label = 13;</code>
   *
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString getLabelBytes();

  com.google.dataflow.v1beta3.DisplayData.ValueCase getValueCase();
}
