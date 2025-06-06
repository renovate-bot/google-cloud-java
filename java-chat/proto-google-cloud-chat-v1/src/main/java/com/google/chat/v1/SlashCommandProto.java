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
// source: google/chat/v1/slash_command.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

public final class SlashCommandProto {
  private SlashCommandProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_SlashCommand_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_SlashCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/chat/v1/slash_command.proto\022\016go"
          + "ogle.chat.v1\"\"\n\014SlashCommand\022\022\n\ncommand_"
          + "id\030\001 \001(\003B\252\001\n\022com.google.chat.v1B\021SlashCo"
          + "mmandProtoP\001Z,cloud.google.com/go/chat/a"
          + "piv1/chatpb;chatpb\242\002\013DYNAPIProto\252\002\023Googl"
          + "e.Apps.Chat.V1\312\002\023Google\\Apps\\Chat\\V1\352\002\026G"
          + "oogle::Apps::Chat::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_chat_v1_SlashCommand_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_SlashCommand_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_SlashCommand_descriptor,
            new java.lang.String[] {
              "CommandId",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
