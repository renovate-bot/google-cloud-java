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
// source: google/cloud/visionai/v1/lva.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface OperatorDefinitionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.OperatorDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of this operator.
   *
   * Tentatively [A-Z][a-zA-Z0-9]*, e.g., BboxCounter, PetDetector,
   * PetDetector1.
   * </pre>
   *
   * <code>string operator = 1;</code>
   *
   * @return The operator.
   */
  java.lang.String getOperator();

  /**
   *
   *
   * <pre>
   * The name of this operator.
   *
   * Tentatively [A-Z][a-zA-Z0-9]*, e.g., BboxCounter, PetDetector,
   * PetDetector1.
   * </pre>
   *
   * <code>string operator = 1;</code>
   *
   * @return The bytes for operator.
   */
  com.google.protobuf.ByteString getOperatorBytes();

  /**
   *
   *
   * <pre>
   * Declares input arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition input_args = 2;
   * </code>
   */
  java.util.List<com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition>
      getInputArgsList();

  /**
   *
   *
   * <pre>
   * Declares input arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition input_args = 2;
   * </code>
   */
  com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition getInputArgs(int index);

  /**
   *
   *
   * <pre>
   * Declares input arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition input_args = 2;
   * </code>
   */
  int getInputArgsCount();

  /**
   *
   *
   * <pre>
   * Declares input arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition input_args = 2;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinitionOrBuilder>
      getInputArgsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Declares input arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition input_args = 2;
   * </code>
   */
  com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinitionOrBuilder getInputArgsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Declares output arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition output_args = 3;
   * </code>
   */
  java.util.List<com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition>
      getOutputArgsList();

  /**
   *
   *
   * <pre>
   * Declares output arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition output_args = 3;
   * </code>
   */
  com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition getOutputArgs(int index);

  /**
   *
   *
   * <pre>
   * Declares output arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition output_args = 3;
   * </code>
   */
  int getOutputArgsCount();

  /**
   *
   *
   * <pre>
   * Declares output arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition output_args = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinitionOrBuilder>
      getOutputArgsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Declares output arguments.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinition output_args = 3;
   * </code>
   */
  com.google.cloud.visionai.v1.OperatorDefinition.ArgumentDefinitionOrBuilder
      getOutputArgsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Declares the attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.AttributeDefinition attributes = 4;
   * </code>
   */
  java.util.List<com.google.cloud.visionai.v1.OperatorDefinition.AttributeDefinition>
      getAttributesList();

  /**
   *
   *
   * <pre>
   * Declares the attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.AttributeDefinition attributes = 4;
   * </code>
   */
  com.google.cloud.visionai.v1.OperatorDefinition.AttributeDefinition getAttributes(int index);

  /**
   *
   *
   * <pre>
   * Declares the attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.AttributeDefinition attributes = 4;
   * </code>
   */
  int getAttributesCount();

  /**
   *
   *
   * <pre>
   * Declares the attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.AttributeDefinition attributes = 4;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.visionai.v1.OperatorDefinition.AttributeDefinitionOrBuilder>
      getAttributesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Declares the attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.OperatorDefinition.AttributeDefinition attributes = 4;
   * </code>
   */
  com.google.cloud.visionai.v1.OperatorDefinition.AttributeDefinitionOrBuilder
      getAttributesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The resources for running the operator.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ResourceSpecification resources = 5;</code>
   *
   * @return Whether the resources field is set.
   */
  boolean hasResources();

  /**
   *
   *
   * <pre>
   * The resources for running the operator.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ResourceSpecification resources = 5;</code>
   *
   * @return The resources.
   */
  com.google.cloud.visionai.v1.ResourceSpecification getResources();

  /**
   *
   *
   * <pre>
   * The resources for running the operator.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ResourceSpecification resources = 5;</code>
   */
  com.google.cloud.visionai.v1.ResourceSpecificationOrBuilder getResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * Short description of the operator.
   * </pre>
   *
   * <code>string short_description = 6;</code>
   *
   * @return The shortDescription.
   */
  java.lang.String getShortDescription();

  /**
   *
   *
   * <pre>
   * Short description of the operator.
   * </pre>
   *
   * <code>string short_description = 6;</code>
   *
   * @return The bytes for shortDescription.
   */
  com.google.protobuf.ByteString getShortDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Full description of the operator.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Full description of the operator.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
