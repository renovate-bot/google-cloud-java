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
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

public interface ImportProcessorVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ImportProcessorVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The source processor version to import from. The source processor version
   * and destination processor need to be in the same environment and region.
   * Note that ProcessorVersions with `model_type` `MODEL_TYPE_LLM` are not
   * supported.
   * </pre>
   *
   * <code>string processor_version_source = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the processorVersionSource field is set.
   */
  boolean hasProcessorVersionSource();

  /**
   *
   *
   * <pre>
   * The source processor version to import from. The source processor version
   * and destination processor need to be in the same environment and region.
   * Note that ProcessorVersions with `model_type` `MODEL_TYPE_LLM` are not
   * supported.
   * </pre>
   *
   * <code>string processor_version_source = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The processorVersionSource.
   */
  java.lang.String getProcessorVersionSource();

  /**
   *
   *
   * <pre>
   * The source processor version to import from. The source processor version
   * and destination processor need to be in the same environment and region.
   * Note that ProcessorVersions with `model_type` `MODEL_TYPE_LLM` are not
   * supported.
   * </pre>
   *
   * <code>string processor_version_source = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for processorVersionSource.
   */
  com.google.protobuf.ByteString getProcessorVersionSourceBytes();

  /**
   *
   *
   * <pre>
   * The source processor version to import from. It can be from a different
   * environment and region than the destination processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ImportProcessorVersionRequest.ExternalProcessorVersionSource external_processor_version_source = 3;
   * </code>
   *
   * @return Whether the externalProcessorVersionSource field is set.
   */
  boolean hasExternalProcessorVersionSource();

  /**
   *
   *
   * <pre>
   * The source processor version to import from. It can be from a different
   * environment and region than the destination processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ImportProcessorVersionRequest.ExternalProcessorVersionSource external_processor_version_source = 3;
   * </code>
   *
   * @return The externalProcessorVersionSource.
   */
  com.google.cloud.documentai.v1beta3.ImportProcessorVersionRequest.ExternalProcessorVersionSource
      getExternalProcessorVersionSource();

  /**
   *
   *
   * <pre>
   * The source processor version to import from. It can be from a different
   * environment and region than the destination processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ImportProcessorVersionRequest.ExternalProcessorVersionSource external_processor_version_source = 3;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ImportProcessorVersionRequest
          .ExternalProcessorVersionSourceOrBuilder
      getExternalProcessorVersionSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The destination processor name to create the processor version
   * in. Format:
   * `projects/{project}/locations/{location}/processors/{processor}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The destination processor name to create the processor version
   * in. Format:
   * `projects/{project}/locations/{location}/processors/{processor}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  com.google.cloud.documentai.v1beta3.ImportProcessorVersionRequest.SourceCase getSourceCase();
}
