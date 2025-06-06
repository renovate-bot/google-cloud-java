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
// source: google/cloud/contentwarehouse/v1/document.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface DocumentReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.DocumentReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the referenced document.
   * </pre>
   *
   * <code>
   * string document_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The documentName.
   */
  java.lang.String getDocumentName();

  /**
   *
   *
   * <pre>
   * Required. Name of the referenced document.
   * </pre>
   *
   * <code>
   * string document_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for documentName.
   */
  com.google.protobuf.ByteString getDocumentNameBytes();

  /**
   *
   *
   * <pre>
   * display_name of the referenced document; this name does not need to be
   * consistent to the display_name in the Document proto, depending on the ACL
   * constraint.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * display_name of the referenced document; this name does not need to be
   * consistent to the display_name in the Document proto, depending on the ACL
   * constraint.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Stores the subset of the referenced document's content.
   * This is useful to allow user peek the information of the referenced
   * document.
   * </pre>
   *
   * <code>string snippet = 3;</code>
   *
   * @return The snippet.
   */
  java.lang.String getSnippet();

  /**
   *
   *
   * <pre>
   * Stores the subset of the referenced document's content.
   * This is useful to allow user peek the information of the referenced
   * document.
   * </pre>
   *
   * <code>string snippet = 3;</code>
   *
   * @return The bytes for snippet.
   */
  com.google.protobuf.ByteString getSnippetBytes();

  /**
   *
   *
   * <pre>
   * The document type of the document being referenced.
   * </pre>
   *
   * <code>bool document_is_folder = 4;</code>
   *
   * @return The documentIsFolder.
   */
  boolean getDocumentIsFolder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the document is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Document is a folder with retention policy.
   * </pre>
   *
   * <code>bool document_is_retention_folder = 8;</code>
   *
   * @return The documentIsRetentionFolder.
   */
  boolean getDocumentIsRetentionFolder();

  /**
   *
   *
   * <pre>
   * Document is a folder with legal hold.
   * </pre>
   *
   * <code>bool document_is_legal_hold_folder = 9;</code>
   *
   * @return The documentIsLegalHoldFolder.
   */
  boolean getDocumentIsLegalHoldFolder();
}
