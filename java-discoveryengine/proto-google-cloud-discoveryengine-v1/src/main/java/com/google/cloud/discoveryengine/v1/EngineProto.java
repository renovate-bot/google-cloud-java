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
// source: google/cloud/discoveryengine/v1/engine.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public final class EngineProto {
  private EngineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Engine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Engine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Engine_SearchEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Engine_SearchEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_AgentCreationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_AgentCreationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Engine_CommonConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Engine_CommonConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/discoveryengine/v1/engine"
          + ".proto\022\037google.cloud.discoveryengine.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032,google/cloud/discov"
          + "eryengine/v1/common.proto\032\037google/protob"
          + "uf/timestamp.proto\"\244\013\n\006Engine\022V\n\022chat_en"
          + "gine_config\030\013 \001(\01328.google.cloud.discove"
          + "ryengine.v1.Engine.ChatEngineConfigH\000\022Z\n"
          + "\024search_engine_config\030\r \001(\0132:.google.clo"
          + "ud.discoveryengine.v1.Engine.SearchEngin"
          + "eConfigH\000\022_\n\024chat_engine_metadata\030\014 \001(\0132"
          + ":.google.cloud.discoveryengine.v1.Engine"
          + ".ChatEngineMetadataB\003\340A\003H\001\022\021\n\004name\030\001 \001(\t"
          + "B\003\340A\005\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\0224\n\013crea"
          + "te_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\0224\n\013update_time\030\004 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\022\026\n\016data_store_ids\030\005"
          + " \003(\t\022I\n\rsolution_type\030\006 \001(\0162-.google.clo"
          + "ud.discoveryengine.v1.SolutionTypeB\003\340A\002\022"
          + "L\n\021industry_vertical\030\020 \001(\01621.google.clou"
          + "d.discoveryengine.v1.IndustryVertical\022K\n"
          + "\rcommon_config\030\017 \001(\01324.google.cloud.disc"
          + "overyengine.v1.Engine.CommonConfig\022\036\n\021di"
          + "sable_analytics\030\032 \001(\010B\003\340A\001\032\234\001\n\022SearchEng"
          + "ineConfig\022@\n\013search_tier\030\001 \001(\0162+.google."
          + "cloud.discoveryengine.v1.SearchTier\022D\n\016s"
          + "earch_add_ons\030\002 \003(\0162,.google.cloud.disco"
          + "veryengine.v1.SearchAddOn\032\264\002\n\020ChatEngine"
          + "Config\022k\n\025agent_creation_config\030\001 \001(\0132L."
          + "google.cloud.discoveryengine.v1.Engine.C"
          + "hatEngineConfig.AgentCreationConfig\022 \n\030d"
          + "ialogflow_agent_to_link\030\002 \001(\t\022\037\n\022allow_c"
          + "ross_region\030\003 \001(\010B\003\340A\001\032p\n\023AgentCreationC"
          + "onfig\022\020\n\010business\030\001 \001(\t\022\035\n\025default_langu"
          + "age_code\030\002 \001(\t\022\026\n\ttime_zone\030\003 \001(\tB\003\340A\002\022\020"
          + "\n\010location\030\004 \001(\t\032$\n\014CommonConfig\022\024\n\014comp"
          + "any_name\030\001 \001(\t\032.\n\022ChatEngineMetadata\022\030\n\020"
          + "dialogflow_agent\030\001 \001(\t:}\352Az\n%discoveryen"
          + "gine.googleapis.com/Engine\022Qprojects/{pr"
          + "oject}/locations/{location}/collections/"
          + "{collection}/engines/{engine}B\017\n\rengine_"
          + "configB\021\n\017engine_metadataB\376\001\n#com.google"
          + ".cloud.discoveryengine.v1B\013EngineProtoP\001"
          + "ZMcloud.google.com/go/discoveryengine/ap"
          + "iv1/discoveryenginepb;discoveryenginepb\242"
          + "\002\017DISCOVERYENGINE\252\002\037Google.Cloud.Discove"
          + "ryEngine.V1\312\002\037Google\\Cloud\\DiscoveryEngi"
          + "ne\\V1\352\002\"Google::Cloud::DiscoveryEngine::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_Engine_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Engine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Engine_descriptor,
            new java.lang.String[] {
              "ChatEngineConfig",
              "SearchEngineConfig",
              "ChatEngineMetadata",
              "Name",
              "DisplayName",
              "CreateTime",
              "UpdateTime",
              "DataStoreIds",
              "SolutionType",
              "IndustryVertical",
              "CommonConfig",
              "DisableAnalytics",
              "EngineConfig",
              "EngineMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1_Engine_SearchEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Engine_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Engine_SearchEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Engine_SearchEngineConfig_descriptor,
            new java.lang.String[] {
              "SearchTier", "SearchAddOns",
            });
    internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Engine_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_descriptor,
            new java.lang.String[] {
              "AgentCreationConfig", "DialogflowAgentToLink", "AllowCrossRegion",
            });
    internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_AgentCreationConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_AgentCreationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineConfig_AgentCreationConfig_descriptor,
            new java.lang.String[] {
              "Business", "DefaultLanguageCode", "TimeZone", "Location",
            });
    internal_static_google_cloud_discoveryengine_v1_Engine_CommonConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Engine_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_Engine_CommonConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Engine_CommonConfig_descriptor,
            new java.lang.String[] {
              "CompanyName",
            });
    internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Engine_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Engine_ChatEngineMetadata_descriptor,
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
    com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
