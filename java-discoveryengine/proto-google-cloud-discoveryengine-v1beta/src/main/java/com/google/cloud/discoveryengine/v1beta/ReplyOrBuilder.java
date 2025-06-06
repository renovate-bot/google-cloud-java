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
// source: google/cloud/discoveryengine/v1beta/conversation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public interface ReplyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.Reply)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * DEPRECATED: use `summary` instead.
   * Text reply.
   * </pre>
   *
   * <code>string reply = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.discoveryengine.v1beta.Reply.reply is deprecated. See
   *     google/cloud/discoveryengine/v1beta/conversation.proto;l=98
   * @return The reply.
   */
  @java.lang.Deprecated
  java.lang.String getReply();

  /**
   *
   *
   * <pre>
   * DEPRECATED: use `summary` instead.
   * Text reply.
   * </pre>
   *
   * <code>string reply = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.discoveryengine.v1beta.Reply.reply is deprecated. See
   *     google/cloud/discoveryengine/v1beta/conversation.proto;l=98
   * @return The bytes for reply.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getReplyBytes();

  /**
   *
   *
   * <pre>
   * References in the reply.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.Reply.Reference references = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.discoveryengine.v1beta.Reply.Reference> getReferencesList();

  /**
   *
   *
   * <pre>
   * References in the reply.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.Reply.Reference references = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.discoveryengine.v1beta.Reply.Reference getReferences(int index);

  /**
   *
   *
   * <pre>
   * References in the reply.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.Reply.Reference references = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getReferencesCount();

  /**
   *
   *
   * <pre>
   * References in the reply.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.Reply.Reference references = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<? extends com.google.cloud.discoveryengine.v1beta.Reply.ReferenceOrBuilder>
      getReferencesOrBuilderList();

  /**
   *
   *
   * <pre>
   * References in the reply.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.Reply.Reference references = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.discoveryengine.v1beta.Reply.ReferenceOrBuilder getReferencesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Summary based on search results.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchResponse.Summary summary = 3;</code>
   *
   * @return Whether the summary field is set.
   */
  boolean hasSummary();

  /**
   *
   *
   * <pre>
   * Summary based on search results.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchResponse.Summary summary = 3;</code>
   *
   * @return The summary.
   */
  com.google.cloud.discoveryengine.v1beta.SearchResponse.Summary getSummary();

  /**
   *
   *
   * <pre>
   * Summary based on search results.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchResponse.Summary summary = 3;</code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchResponse.SummaryOrBuilder getSummaryOrBuilder();
}
