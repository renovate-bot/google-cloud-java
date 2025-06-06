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
// source: google/cloud/discoveryengine/v1alpha/completion.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public final class CompletionProto {
  private CompletionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_SuggestionDenyListEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_SuggestionDenyListEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CompletionSuggestion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CompletionSuggestion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/discoveryengine/v1alpha/c"
          + "ompletion.proto\022$google.cloud.discoverye"
          + "ngine.v1alpha\032\037google/api/field_behavior"
          + ".proto\"\356\001\n\027SuggestionDenyListEntry\022\031\n\014bl"
          + "ock_phrase\030\001 \001(\tB\003\340A\002\022h\n\016match_operator\030"
          + "\002 \001(\0162K.google.cloud.discoveryengine.v1a"
          + "lpha.SuggestionDenyListEntry.MatchOperat"
          + "orB\003\340A\002\"N\n\rMatchOperator\022\036\n\032MATCH_OPERAT"
          + "OR_UNSPECIFIED\020\000\022\017\n\013EXACT_MATCH\020\001\022\014\n\010CON"
          + "TAINS\020\002\"\307\001\n\024CompletionSuggestion\022\026\n\014glob"
          + "al_score\030\002 \001(\001H\000\022\023\n\tfrequency\030\003 \001(\003H\000\022\027\n"
          + "\nsuggestion\030\001 \001(\tB\003\340A\002\022\025\n\rlanguage_code\030"
          + "\004 \001(\t\022\020\n\010group_id\030\005 \001(\t\022\023\n\013group_score\030\006"
          + " \001(\001\022\033\n\023alternative_phrases\030\007 \003(\tB\016\n\014ran"
          + "king_infoB\233\002\n(com.google.cloud.discovery"
          + "engine.v1alphaB\017CompletionProtoP\001ZRcloud"
          + ".google.com/go/discoveryengine/apiv1alph"
          + "a/discoveryenginepb;discoveryenginepb\242\002\017"
          + "DISCOVERYENGINE\252\002$Google.Cloud.Discovery"
          + "Engine.V1Alpha\312\002$Google\\Cloud\\DiscoveryE"
          + "ngine\\V1alpha\352\002\'Google::Cloud::Discovery"
          + "Engine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_SuggestionDenyListEntry_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_SuggestionDenyListEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_SuggestionDenyListEntry_descriptor,
            new java.lang.String[] {
              "BlockPhrase", "MatchOperator",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CompletionSuggestion_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_CompletionSuggestion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CompletionSuggestion_descriptor,
            new java.lang.String[] {
              "GlobalScore",
              "Frequency",
              "Suggestion",
              "LanguageCode",
              "GroupId",
              "GroupScore",
              "AlternativePhrases",
              "RankingInfo",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
