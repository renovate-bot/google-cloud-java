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
// source: google/apps/meet/v2beta/resource.proto

// Protobuf Java Version: 3.25.8
package com.google.apps.meet.v2beta;

public interface DriveDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.meet.v2beta.DriveDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The `fileId` for the underlying MP4 file. For example,
   * "1kuceFZohVoCh6FulBHxwy6I15Ogpc4hP". Use `$ GET
   * https://www.googleapis.com/drive/v3/files/{$fileId}?alt=media` to download
   * the blob. For more information, see
   * https://developers.google.com/drive/api/v3/reference/files/get.
   * </pre>
   *
   * <code>string file = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The file.
   */
  java.lang.String getFile();

  /**
   *
   *
   * <pre>
   * Output only. The `fileId` for the underlying MP4 file. For example,
   * "1kuceFZohVoCh6FulBHxwy6I15Ogpc4hP". Use `$ GET
   * https://www.googleapis.com/drive/v3/files/{$fileId}?alt=media` to download
   * the blob. For more information, see
   * https://developers.google.com/drive/api/v3/reference/files/get.
   * </pre>
   *
   * <code>string file = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString getFileBytes();

  /**
   *
   *
   * <pre>
   * Output only. Link used to play back the recording file in the browser. For
   * example, `https://drive.google.com/file/d/{$fileId}/view`.
   * </pre>
   *
   * <code>string export_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The exportUri.
   */
  java.lang.String getExportUri();

  /**
   *
   *
   * <pre>
   * Output only. Link used to play back the recording file in the browser. For
   * example, `https://drive.google.com/file/d/{$fileId}/view`.
   * </pre>
   *
   * <code>string export_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for exportUri.
   */
  com.google.protobuf.ByteString getExportUriBytes();
}
