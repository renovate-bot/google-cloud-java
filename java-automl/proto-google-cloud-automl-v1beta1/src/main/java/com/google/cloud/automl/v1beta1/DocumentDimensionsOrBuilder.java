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
// source: google/cloud/automl/v1beta1/data_items.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public interface DocumentDimensionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.DocumentDimensions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unit of the dimension.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
   *
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();

  /**
   *
   *
   * <pre>
   * Unit of the dimension.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
   *
   * @return The unit.
   */
  com.google.cloud.automl.v1beta1.DocumentDimensions.DocumentDimensionUnit getUnit();

  /**
   *
   *
   * <pre>
   * Width value of the document, works together with the unit.
   * </pre>
   *
   * <code>float width = 2;</code>
   *
   * @return The width.
   */
  float getWidth();

  /**
   *
   *
   * <pre>
   * Height value of the document, works together with the unit.
   * </pre>
   *
   * <code>float height = 3;</code>
   *
   * @return The height.
   */
  float getHeight();
}
