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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.videointelligence.v1p3beta1;

public interface StreamingStorageConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Enable streaming storage. Default: false.
   * </pre>
   *
   * <code>bool enable_storage_annotation_result = 1;</code>
   *
   * @return The enableStorageAnnotationResult.
   */
  boolean getEnableStorageAnnotationResult();

  /**
   *
   *
   * <pre>
   * Cloud Storage URI to store all annotation results for one client. Client
   * should specify this field as the top-level storage directory. Annotation
   * results of different sessions will be put into different sub-directories
   * denoted by project_name and session_id. All sub-directories will be auto
   * generated by program and will be made accessible to client in response
   * proto. URIs must be specified in the following format:
   * `gs://bucket-id/object-id` `bucket-id` should be a valid Cloud Storage
   * bucket created by client and bucket permission shall also be configured
   * properly. `object-id` can be arbitrary string that make sense to client.
   * Other URI formats will return error and cause Cloud Storage write failure.
   * </pre>
   *
   * <code>string annotation_result_storage_directory = 3;</code>
   *
   * @return The annotationResultStorageDirectory.
   */
  java.lang.String getAnnotationResultStorageDirectory();

  /**
   *
   *
   * <pre>
   * Cloud Storage URI to store all annotation results for one client. Client
   * should specify this field as the top-level storage directory. Annotation
   * results of different sessions will be put into different sub-directories
   * denoted by project_name and session_id. All sub-directories will be auto
   * generated by program and will be made accessible to client in response
   * proto. URIs must be specified in the following format:
   * `gs://bucket-id/object-id` `bucket-id` should be a valid Cloud Storage
   * bucket created by client and bucket permission shall also be configured
   * properly. `object-id` can be arbitrary string that make sense to client.
   * Other URI formats will return error and cause Cloud Storage write failure.
   * </pre>
   *
   * <code>string annotation_result_storage_directory = 3;</code>
   *
   * @return The bytes for annotationResultStorageDirectory.
   */
  com.google.protobuf.ByteString getAnnotationResultStorageDirectoryBytes();
}
