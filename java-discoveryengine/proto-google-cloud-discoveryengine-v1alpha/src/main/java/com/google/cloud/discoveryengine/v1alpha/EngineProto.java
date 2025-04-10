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
// source: google/cloud/discoveryengine/v1alpha/engine.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public final class EngineProto {
  private EngineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/discoveryengine/v1alpha/e"
          + "ngine.proto\022$google.cloud.discoveryengin"
          + "e.v1alpha\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\0321google/cl"
          + "oud/discoveryengine/v1alpha/common.proto"
          + "\032\037google/protobuf/timestamp.proto\"\364\025\n\006En"
          + "gine\022m\n\030similar_documents_config\030\t \001(\0132I"
          + ".google.cloud.discoveryengine.v1alpha.En"
          + "gine.SimilarDocumentsEngineConfigH\000\022[\n\022c"
          + "hat_engine_config\030\013 \001(\0132=.google.cloud.d"
          + "iscoveryengine.v1alpha.Engine.ChatEngine"
          + "ConfigH\000\022_\n\024search_engine_config\030\r \001(\0132?"
          + ".google.cloud.discoveryengine.v1alpha.En"
          + "gine.SearchEngineConfigH\000\022z\n\"media_recom"
          + "mendation_engine_config\030\016 \001(\0132L.google.c"
          + "loud.discoveryengine.v1alpha.Engine.Medi"
          + "aRecommendationEngineConfigH\000\022k\n\027recomme"
          + "ndation_metadata\030\n \001(\0132C.google.cloud.di"
          + "scoveryengine.v1alpha.Engine.Recommendat"
          + "ionMetadataB\003\340A\003H\001\022d\n\024chat_engine_metada"
          + "ta\030\014 \001(\0132?.google.cloud.discoveryengine."
          + "v1alpha.Engine.ChatEngineMetadataB\003\340A\003H\001"
          + "\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\031\n\014display_name\030\002 \001("
          + "\tB\003\340A\002\0224\n\013create_time\030\003 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0224\n\013update_time\030\004 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022\026\n\016da"
          + "ta_store_ids\030\005 \003(\t\022N\n\rsolution_type\030\006 \001("
          + "\01622.google.cloud.discoveryengine.v1alpha"
          + ".SolutionTypeB\003\340A\002\022Q\n\021industry_vertical\030"
          + "\020 \001(\01626.google.cloud.discoveryengine.v1a"
          + "lpha.IndustryVertical\022P\n\rcommon_config\030\017"
          + " \001(\01329.google.cloud.discoveryengine.v1al"
          + "pha.Engine.CommonConfig\032\246\001\n\022SearchEngine"
          + "Config\022E\n\013search_tier\030\001 \001(\01620.google.clo"
          + "ud.discoveryengine.v1alpha.SearchTier\022I\n"
          + "\016search_add_ons\030\002 \003(\01621.google.cloud.dis"
          + "coveryengine.v1alpha.SearchAddOn\032\036\n\034Simi"
          + "larDocumentsEngineConfig\032\206\004\n\037MediaRecomm"
          + "endationEngineConfig\022\021\n\004type\030\001 \001(\tB\003\340A\002\022"
          + "\036\n\026optimization_objective\030\002 \001(\t\022\217\001\n\035opti"
          + "mization_objective_config\030\003 \001(\0132h.google"
          + ".cloud.discoveryengine.v1alpha.Engine.Me"
          + "diaRecommendationEngineConfig.Optimizati"
          + "onObjectiveConfig\022r\n\016training_state\030\004 \001("
          + "\0162Z.google.cloud.discoveryengine.v1alpha"
          + ".Engine.MediaRecommendationEngineConfig."
          + "TrainingState\032_\n\033OptimizationObjectiveCo"
          + "nfig\022\031\n\014target_field\030\001 \001(\tB\003\340A\002\022%\n\030targe"
          + "t_field_value_float\030\002 \001(\002B\003\340A\002\"I\n\rTraini"
          + "ngState\022\036\n\032TRAINING_STATE_UNSPECIFIED\020\000\022"
          + "\n\n\006PAUSED\020\001\022\014\n\010TRAINING\020\002\032\230\002\n\020ChatEngine"
          + "Config\022p\n\025agent_creation_config\030\001 \001(\0132Q."
          + "google.cloud.discoveryengine.v1alpha.Eng"
          + "ine.ChatEngineConfig.AgentCreationConfig"
          + "\022 \n\030dialogflow_agent_to_link\030\002 \001(\t\032p\n\023Ag"
          + "entCreationConfig\022\020\n\010business\030\001 \001(\t\022\035\n\025d"
          + "efault_language_code\030\002 \001(\t\022\026\n\ttime_zone\030"
          + "\003 \001(\tB\003\340A\002\022\020\n\010location\030\004 \001(\t\032$\n\014CommonCo"
          + "nfig\022\024\n\014company_name\030\001 \001(\t\032\340\003\n\026Recommend"
          + "ationMetadata\022l\n\rserving_state\030\001 \001(\0162P.g"
          + "oogle.cloud.discoveryengine.v1alpha.Engi"
          + "ne.RecommendationMetadata.ServingStateB\003"
          + "\340A\003\022f\n\ndata_state\030\002 \001(\0162M.google.cloud.d"
          + "iscoveryengine.v1alpha.Engine.Recommenda"
          + "tionMetadata.DataStateB\003\340A\003\0227\n\016last_tune"
          + "_time\030\003 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022\035\n\020tuning_operation\030\004 \001(\tB\003\340A\003\"R\n\014S"
          + "ervingState\022\035\n\031SERVING_STATE_UNSPECIFIED"
          + "\020\000\022\014\n\010INACTIVE\020\001\022\n\n\006ACTIVE\020\002\022\t\n\005TUNED\020\003\""
          + "D\n\tDataState\022\032\n\026DATA_STATE_UNSPECIFIED\020\000"
          + "\022\013\n\007DATA_OK\020\001\022\016\n\nDATA_ERROR\020\002\032.\n\022ChatEng"
          + "ineMetadata\022\030\n\020dialogflow_agent\030\001 \001(\t:}\352"
          + "Az\n%discoveryengine.googleapis.com/Engin"
          + "e\022Qprojects/{project}/locations/{locatio"
          + "n}/collections/{collection}/engines/{eng"
          + "ine}B\017\n\rengine_configB\021\n\017engine_metadata"
          + "B\227\002\n(com.google.cloud.discoveryengine.v1"
          + "alphaB\013EngineProtoP\001ZRcloud.google.com/g"
          + "o/discoveryengine/apiv1alpha/discoveryen"
          + "ginepb;discoveryenginepb\242\002\017DISCOVERYENGI"
          + "NE\252\002$Google.Cloud.DiscoveryEngine.V1Alph"
          + "a\312\002$Google\\Cloud\\DiscoveryEngine\\V1alpha"
          + "\352\002\'Google::Cloud::DiscoveryEngine::V1alp"
          + "hab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor,
            new java.lang.String[] {
              "SimilarDocumentsConfig",
              "ChatEngineConfig",
              "SearchEngineConfig",
              "MediaRecommendationEngineConfig",
              "RecommendationMetadata",
              "ChatEngineMetadata",
              "Name",
              "DisplayName",
              "CreateTime",
              "UpdateTime",
              "DataStoreIds",
              "SolutionType",
              "IndustryVertical",
              "CommonConfig",
              "EngineConfig",
              "EngineMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_descriptor,
            new java.lang.String[] {
              "SearchTier", "SearchAddOns",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor,
            new java.lang.String[] {
              "Type", "OptimizationObjective", "OptimizationObjectiveConfig", "TrainingState",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_descriptor,
            new java.lang.String[] {
              "TargetField", "TargetFieldValueFloat",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor,
            new java.lang.String[] {
              "AgentCreationConfig", "DialogflowAgentToLink",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_descriptor,
            new java.lang.String[] {
              "Business", "DefaultLanguageCode", "TimeZone", "Location",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_descriptor,
            new java.lang.String[] {
              "CompanyName",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_descriptor,
            new java.lang.String[] {
              "ServingState", "DataState", "LastTuneTime", "TuningOperation",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_descriptor,
            new java.lang.String[] {
              "DialogflowAgent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
