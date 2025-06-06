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
// source: google/cloud/language/v1/language_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.language.v1;

public interface ClassifyTextRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.ClassifyTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();

  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The document.
   */
  com.google.cloud.language.v1.Document getDocument();

  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.language.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Model options to use for classification. Defaults to v1 options if not
   * specified.
   * </pre>
   *
   * <code>.google.cloud.language.v1.ClassificationModelOptions classification_model_options = 3;
   * </code>
   *
   * @return Whether the classificationModelOptions field is set.
   */
  boolean hasClassificationModelOptions();

  /**
   *
   *
   * <pre>
   * Model options to use for classification. Defaults to v1 options if not
   * specified.
   * </pre>
   *
   * <code>.google.cloud.language.v1.ClassificationModelOptions classification_model_options = 3;
   * </code>
   *
   * @return The classificationModelOptions.
   */
  com.google.cloud.language.v1.ClassificationModelOptions getClassificationModelOptions();

  /**
   *
   *
   * <pre>
   * Model options to use for classification. Defaults to v1 options if not
   * specified.
   * </pre>
   *
   * <code>.google.cloud.language.v1.ClassificationModelOptions classification_model_options = 3;
   * </code>
   */
  com.google.cloud.language.v1.ClassificationModelOptionsOrBuilder
      getClassificationModelOptionsOrBuilder();
}
