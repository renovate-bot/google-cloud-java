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
// source: google/cloud/contentwarehouse/v1/pipelines.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface ProcessWithDocAiPipelineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.ProcessWithDocAiPipeline)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @return A list containing the documents.
   */
  java.util.List<java.lang.String> getDocumentsList();

  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @return The count of documents.
   */
  int getDocumentsCount();

  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The documents at the given index.
   */
  java.lang.String getDocuments(int index);

  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the documents at the given index.
   */
  com.google.protobuf.ByteString getDocumentsBytes(int index);

  /**
   *
   *
   * <pre>
   * The Cloud Storage folder path used to store the exported documents before
   * being sent to CDW.
   * Format: `gs://&lt;bucket-name&gt;/&lt;folder-name&gt;`.
   * </pre>
   *
   * <code>string export_folder_path = 2;</code>
   *
   * @return The exportFolderPath.
   */
  java.lang.String getExportFolderPath();

  /**
   *
   *
   * <pre>
   * The Cloud Storage folder path used to store the exported documents before
   * being sent to CDW.
   * Format: `gs://&lt;bucket-name&gt;/&lt;folder-name&gt;`.
   * </pre>
   *
   * <code>string export_folder_path = 2;</code>
   *
   * @return The bytes for exportFolderPath.
   */
  com.google.protobuf.ByteString getExportFolderPathBytes();

  /**
   *
   *
   * <pre>
   * The CDW processor information.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ProcessorInfo processor_info = 3;</code>
   *
   * @return Whether the processorInfo field is set.
   */
  boolean hasProcessorInfo();

  /**
   *
   *
   * <pre>
   * The CDW processor information.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ProcessorInfo processor_info = 3;</code>
   *
   * @return The processorInfo.
   */
  com.google.cloud.contentwarehouse.v1.ProcessorInfo getProcessorInfo();

  /**
   *
   *
   * <pre>
   * The CDW processor information.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ProcessorInfo processor_info = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.ProcessorInfoOrBuilder getProcessorInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud Storage folder path used to store the raw results from
   * processors.
   * Format: `gs://&lt;bucket-name&gt;/&lt;folder-name&gt;`.
   * </pre>
   *
   * <code>string processor_results_folder_path = 4;</code>
   *
   * @return The processorResultsFolderPath.
   */
  java.lang.String getProcessorResultsFolderPath();

  /**
   *
   *
   * <pre>
   * The Cloud Storage folder path used to store the raw results from
   * processors.
   * Format: `gs://&lt;bucket-name&gt;/&lt;folder-name&gt;`.
   * </pre>
   *
   * <code>string processor_results_folder_path = 4;</code>
   *
   * @return The bytes for processorResultsFolderPath.
   */
  com.google.protobuf.ByteString getProcessorResultsFolderPathBytes();
}
