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
// source: google/cloud/discoveryengine/v1alpha/document_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public interface GetProcessedDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.GetProcessedDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Document][google.cloud.discoveryengine.v1alpha.Document], such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}/documents/{document}`.
   *
   * If the caller does not have permission to access the
   * [Document][google.cloud.discoveryengine.v1alpha.Document], regardless of
   * whether or not it exists, a `PERMISSION_DENIED` error is returned.
   *
   * If the requested [Document][google.cloud.discoveryengine.v1alpha.Document]
   * does not exist, a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Document][google.cloud.discoveryengine.v1alpha.Document], such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}/documents/{document}`.
   *
   * If the caller does not have permission to access the
   * [Document][google.cloud.discoveryengine.v1alpha.Document], regardless of
   * whether or not it exists, a `PERMISSION_DENIED` error is returned.
   *
   * If the requested [Document][google.cloud.discoveryengine.v1alpha.Document]
   * does not exist, a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. What type of processing to return.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.GetProcessedDocumentRequest.ProcessedDocumentType processed_document_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for processedDocumentType.
   */
  int getProcessedDocumentTypeValue();

  /**
   *
   *
   * <pre>
   * Required. What type of processing to return.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.GetProcessedDocumentRequest.ProcessedDocumentType processed_document_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The processedDocumentType.
   */
  com.google.cloud.discoveryengine.v1alpha.GetProcessedDocumentRequest.ProcessedDocumentType
      getProcessedDocumentType();

  /**
   *
   *
   * <pre>
   * What format output should be.  If unspecified, defaults to JSON.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.GetProcessedDocumentRequest.ProcessedDocumentFormat processed_document_format = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for processedDocumentFormat.
   */
  int getProcessedDocumentFormatValue();

  /**
   *
   *
   * <pre>
   * What format output should be.  If unspecified, defaults to JSON.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.GetProcessedDocumentRequest.ProcessedDocumentFormat processed_document_format = 3;
   * </code>
   *
   * @return The processedDocumentFormat.
   */
  com.google.cloud.discoveryengine.v1alpha.GetProcessedDocumentRequest.ProcessedDocumentFormat
      getProcessedDocumentFormat();
}
