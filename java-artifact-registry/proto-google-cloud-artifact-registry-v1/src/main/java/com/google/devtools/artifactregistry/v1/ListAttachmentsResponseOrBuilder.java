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
// source: google/devtools/artifactregistry/v1/attachment.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public interface ListAttachmentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ListAttachmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The attachments returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Attachment attachments = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1.Attachment> getAttachmentsList();

  /**
   *
   *
   * <pre>
   * The attachments returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Attachment attachments = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.Attachment getAttachments(int index);

  /**
   *
   *
   * <pre>
   * The attachments returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Attachment attachments = 1;</code>
   */
  int getAttachmentsCount();

  /**
   *
   *
   * <pre>
   * The attachments returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Attachment attachments = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1.AttachmentOrBuilder>
      getAttachmentsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The attachments returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Attachment attachments = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.AttachmentOrBuilder getAttachmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of attachments, or empty if there are
   * no more attachments to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of attachments, or empty if there are
   * no more attachments to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
