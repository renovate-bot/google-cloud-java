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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

public interface CustomEmojiOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.CustomEmoji)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the custom emoji, assigned by the server.
   *
   * Format: `customEmojis/{customEmoji}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the custom emoji, assigned by the server.
   *
   * Format: `customEmojis/{customEmoji}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Unique key for the custom emoji resource.
   * </pre>
   *
   * <code>
   * string uid = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. Unique key for the custom emoji resource.
   * </pre>
   *
   * <code>
   * string uid = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. User-provided name for the custom emoji, which is
   * unique within the organization.
   *
   * Required when the custom emoji is created, output only otherwise.
   *
   * Emoji names must start and end with colons, must be lowercase and can only
   * contain alphanumeric characters, hyphens, and underscores.
   * Hyphens and underscores should be used to separate words and cannot be used
   * consecutively.
   *
   * Example: `:valid-emoji-name:`
   * </pre>
   *
   * <code>
   * string emoji_name = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The emojiName.
   */
  java.lang.String getEmojiName();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. User-provided name for the custom emoji, which is
   * unique within the organization.
   *
   * Required when the custom emoji is created, output only otherwise.
   *
   * Emoji names must start and end with colons, must be lowercase and can only
   * contain alphanumeric characters, hyphens, and underscores.
   * Hyphens and underscores should be used to separate words and cannot be used
   * consecutively.
   *
   * Example: `:valid-emoji-name:`
   * </pre>
   *
   * <code>
   * string emoji_name = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for emojiName.
   */
  com.google.protobuf.ByteString getEmojiNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A temporary image URL for the custom emoji, valid for at least
   * 10 minutes. Note that this is not populated in the response when the custom
   * emoji is created.
   * </pre>
   *
   * <code>string temporary_image_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The temporaryImageUri.
   */
  java.lang.String getTemporaryImageUri();

  /**
   *
   *
   * <pre>
   * Output only. A temporary image URL for the custom emoji, valid for at least
   * 10 minutes. Note that this is not populated in the response when the custom
   * emoji is created.
   * </pre>
   *
   * <code>string temporary_image_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for temporaryImageUri.
   */
  com.google.protobuf.ByteString getTemporaryImageUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Payload data.
   * Required when the custom emoji is created.
   * </pre>
   *
   * <code>
   * .google.chat.v1.CustomEmoji.CustomEmojiPayload payload = 5 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Payload data.
   * Required when the custom emoji is created.
   * </pre>
   *
   * <code>
   * .google.chat.v1.CustomEmoji.CustomEmojiPayload payload = 5 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The payload.
   */
  com.google.chat.v1.CustomEmoji.CustomEmojiPayload getPayload();

  /**
   *
   *
   * <pre>
   * Optional. Input only. Payload data.
   * Required when the custom emoji is created.
   * </pre>
   *
   * <code>
   * .google.chat.v1.CustomEmoji.CustomEmojiPayload payload = 5 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.chat.v1.CustomEmoji.CustomEmojiPayloadOrBuilder getPayloadOrBuilder();
}
