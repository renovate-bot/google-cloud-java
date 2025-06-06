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
// source: google/cloud/discoveryengine/v1/serving_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public final class ServingConfigProto {
  private ServingConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ServingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ServingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ServingConfig_MediaConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ServingConfig_MediaConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ServingConfig_GenericConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ServingConfig_GenericConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "4google/cloud/discoveryengine/v1/serving_config.proto\022\037google.cloud.discoveryen"
          + "gine.v1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\032,google/clou"
          + "d/discoveryengine/v1/common.proto\0324google/cloud/discoveryengine/v1/search_servic"
          + "e.proto\032\037google/protobuf/timestamp.proto\"\374\013\n\r"
          + "ServingConfig\022R\n"
          + "\014media_config\030\007 \001(\013"
          + "2:.google.cloud.discoveryengine.v1.ServingConfig.MediaConfigH\000\022V\n"
          + "\016generic_config\030\n"
          + " \001(\0132<.google.cloud.discoveryengine.v1.ServingConfig.GenericConfigH\000\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\005\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022L\n\r"
          + "solution_type\030\003"
          + " \001(\0162-.google.cloud.discoveryengine.v1.SolutionTypeB\006\340A\002\340A\005\022\020\n"
          + "\010model_id\030\004 \001(\t\022\027\n"
          + "\017diversity_level\030\005 \001(\t\022\032\n"
          + "\022ranking_expression\030\025 \001(\t\0224\n"
          + "\013create_time\030\010 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\032\n"
          + "\022filter_control_ids\030\013 \003(\t\022\031\n"
          + "\021boost_control_ids\030\014 \003(\t\022\034\n"
          + "\024redirect_control_ids\030\016 \003(\t\022\034\n"
          + "\024synonyms_control_ids\030\017 \003(\t\022#\n"
          + "\033oneway_synonyms_control_ids\030\020 \003(\t\022\036\n"
          + "\026dissociate_control_ids\030\021 \003(\t\022\037\n"
          + "\027replacement_control_ids\030\022 \003(\t\022\032\n"
          + "\022ignore_control_ids\030\023 \003(\t\022\033\n"
          + "\023promote_control_ids\030\032 \003(\t\032\367\001\n"
          + "\013MediaConfig\022.\n"
          + "$content_watched_percentage_threshold\030\002 \001(\002H\000\022+\n"
          + "!content_watched_seconds_threshold\030\005 \001(\002H\000\022\033\n"
          + "\023demotion_event_type\030\001 \001(\t\022-\n"
          + " demote_content_watched_past_days\030% \001(\005B\003\340A\001\022%\n"
          + "\035content_freshness_cutoff_days\030\004 \001(\005B\030\n"
          + "\026demote_content_watched\032n\n\r"
          + "GenericConfig\022]\n"
          + "\023content_search_spec\030\001 \001(\0132@.google.cloud.d"
          + "iscoveryengine.v1.SearchRequest.ContentSearchSpec:\200\003\352A\374\002\n"
          + ",discoveryengine.googleapis.com/ServingConfig\022_projects/{projec"
          + "t}/locations/{location}/dataStores/{data_store}/servingConfigs/{serving_config}\022"
          + "xprojects/{project}/locations/{location}/collections/{collection}/dataStores/{da"
          + "ta_store}/servingConfigs/{serving_config}\022qprojects/{project}/locations/{locatio"
          + "n}/collections/{collection}/engines/{engine}/servingConfigs/{serving_config}B\021\n"
          + "\017vertical_configB\205\002\n"
          + "#com.google.cloud.discoveryengine.v1B\022ServingConfigProtoP\001ZMc"
          + "loud.google.com/go/discoveryengine/apiv1"
          + "/discoveryenginepb;discoveryenginepb\242\002\017D"
          + "ISCOVERYENGINE\252\002\037Google.Cloud.DiscoveryE"
          + "ngine.V1\312\002\037Google\\Cloud\\DiscoveryEngine\\"
          + "V1\352\002\"Google::Cloud::DiscoveryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.SearchServiceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_ServingConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_ServingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ServingConfig_descriptor,
            new java.lang.String[] {
              "MediaConfig",
              "GenericConfig",
              "Name",
              "DisplayName",
              "SolutionType",
              "ModelId",
              "DiversityLevel",
              "RankingExpression",
              "CreateTime",
              "UpdateTime",
              "FilterControlIds",
              "BoostControlIds",
              "RedirectControlIds",
              "SynonymsControlIds",
              "OnewaySynonymsControlIds",
              "DissociateControlIds",
              "ReplacementControlIds",
              "IgnoreControlIds",
              "PromoteControlIds",
              "VerticalConfig",
            });
    internal_static_google_cloud_discoveryengine_v1_ServingConfig_MediaConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_ServingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_ServingConfig_MediaConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ServingConfig_MediaConfig_descriptor,
            new java.lang.String[] {
              "ContentWatchedPercentageThreshold",
              "ContentWatchedSecondsThreshold",
              "DemotionEventType",
              "DemoteContentWatchedPastDays",
              "ContentFreshnessCutoffDays",
              "DemoteContentWatched",
            });
    internal_static_google_cloud_discoveryengine_v1_ServingConfig_GenericConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_ServingConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_ServingConfig_GenericConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ServingConfig_GenericConfig_descriptor,
            new java.lang.String[] {
              "ContentSearchSpec",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.SearchServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
