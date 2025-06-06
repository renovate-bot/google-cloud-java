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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface ImportAssetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ImportAssetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The file contains all assets information to be imported.
   * * The file is in JSONL format.
   * * Each line corresponding to one asset.
   * * Each line will be converted into InputImageAsset proto.
   * </pre>
   *
   * <code>string assets_gcs_uri = 2;</code>
   *
   * @return Whether the assetsGcsUri field is set.
   */
  boolean hasAssetsGcsUri();

  /**
   *
   *
   * <pre>
   * The file contains all assets information to be imported.
   * * The file is in JSONL format.
   * * Each line corresponding to one asset.
   * * Each line will be converted into InputImageAsset proto.
   * </pre>
   *
   * <code>string assets_gcs_uri = 2;</code>
   *
   * @return The assetsGcsUri.
   */
  java.lang.String getAssetsGcsUri();

  /**
   *
   *
   * <pre>
   * The file contains all assets information to be imported.
   * * The file is in JSONL format.
   * * Each line corresponding to one asset.
   * * Each line will be converted into InputImageAsset proto.
   * </pre>
   *
   * <code>string assets_gcs_uri = 2;</code>
   *
   * @return The bytes for assetsGcsUri.
   */
  com.google.protobuf.ByteString getAssetsGcsUriBytes();

  /**
   *
   *
   * <pre>
   * Required. The parent corpus resource where the assets will be imported.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
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
   * Required. The parent corpus resource where the assets will be imported.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  com.google.cloud.visionai.v1.ImportAssetsRequest.SourceCase getSourceCase();
}
