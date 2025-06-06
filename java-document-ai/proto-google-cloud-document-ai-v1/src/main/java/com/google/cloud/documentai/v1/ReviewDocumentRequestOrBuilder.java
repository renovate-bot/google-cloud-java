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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1;

public interface ReviewDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.ReviewDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   *
   * @return Whether the inlineDocument field is set.
   */
  boolean hasInlineDocument();

  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   *
   * @return The inlineDocument.
   */
  com.google.cloud.documentai.v1.Document getInlineDocument();

  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   */
  com.google.cloud.documentai.v1.DocumentOrBuilder getInlineDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [HumanReviewConfig][google.cloud.documentai.v1.HumanReviewConfig] that the
   * document will be reviewed with.
   * </pre>
   *
   * <code>
   * string human_review_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The humanReviewConfig.
   */
  java.lang.String getHumanReviewConfig();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [HumanReviewConfig][google.cloud.documentai.v1.HumanReviewConfig] that the
   * document will be reviewed with.
   * </pre>
   *
   * <code>
   * string human_review_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for humanReviewConfig.
   */
  com.google.protobuf.ByteString getHumanReviewConfigBytes();

  /**
   *
   *
   * <pre>
   * Whether the validation should be performed on the ad-hoc review request.
   * </pre>
   *
   * <code>bool enable_schema_validation = 3;</code>
   *
   * @return The enableSchemaValidation.
   */
  boolean getEnableSchemaValidation();

  /**
   *
   *
   * <pre>
   * The priority of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ReviewDocumentRequest.Priority priority = 5;</code>
   *
   * @return The enum numeric value on the wire for priority.
   */
  int getPriorityValue();

  /**
   *
   *
   * <pre>
   * The priority of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ReviewDocumentRequest.Priority priority = 5;</code>
   *
   * @return The priority.
   */
  com.google.cloud.documentai.v1.ReviewDocumentRequest.Priority getPriority();

  /**
   *
   *
   * <pre>
   * The document schema of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.DocumentSchema document_schema = 6;</code>
   *
   * @return Whether the documentSchema field is set.
   */
  boolean hasDocumentSchema();

  /**
   *
   *
   * <pre>
   * The document schema of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.DocumentSchema document_schema = 6;</code>
   *
   * @return The documentSchema.
   */
  com.google.cloud.documentai.v1.DocumentSchema getDocumentSchema();

  /**
   *
   *
   * <pre>
   * The document schema of the human review task.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.DocumentSchema document_schema = 6;</code>
   */
  com.google.cloud.documentai.v1.DocumentSchemaOrBuilder getDocumentSchemaOrBuilder();

  com.google.cloud.documentai.v1.ReviewDocumentRequest.SourceCase getSourceCase();
}
