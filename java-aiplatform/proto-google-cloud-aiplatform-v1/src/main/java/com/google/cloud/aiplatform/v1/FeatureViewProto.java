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
// source: google/cloud/aiplatform/v1/feature_view.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public final class FeatureViewProto {
  private FeatureViewProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_SyncConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_SyncConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_BruteForceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_BruteForceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_TreeAHConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_TreeAHConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_FeatureGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_VertexRagSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_VertexRagSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureView_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureView_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1/feature_vie"
          + "w.proto\022\032google.cloud.aiplatform.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032\037google/protobuf/timesta"
          + "mp.proto\"\321\020\n\013FeatureView\022W\n\020big_query_so"
          + "urce\030\006 \001(\01326.google.cloud.aiplatform.v1."
          + "FeatureView.BigQuerySourceB\003\340A\001H\000\022e\n\027fea"
          + "ture_registry_source\030\t \001(\0132=.google.clou"
          + "d.aiplatform.v1.FeatureView.FeatureRegis"
          + "trySourceB\003\340A\001H\000\022Y\n\021vertex_rag_source\030\022 "
          + "\001(\01327.google.cloud.aiplatform.v1.Feature"
          + "View.VertexRagSourceB\003\340A\001H\000\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\010\0224\n\013create_time\030\002 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0224\n\013update_time\030\003 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022\021\n\004et"
          + "ag\030\004 \001(\tB\003\340A\001\022H\n\006labels\030\005 \003(\01323.google.c"
          + "loud.aiplatform.v1.FeatureView.LabelsEnt"
          + "ryB\003\340A\001\022G\n\013sync_config\030\007 \001(\01322.google.cl"
          + "oud.aiplatform.v1.FeatureView.SyncConfig"
          + "\022N\n\014index_config\030\017 \001(\01323.google.cloud.ai"
          + "platform.v1.FeatureView.IndexConfigB\003\340A\001"
          + "\022\032\n\rsatisfies_pzs\030\023 \001(\010B\003\340A\003\022\032\n\rsatisfie"
          + "s_pzi\030\024 \001(\010B\003\340A\003\032B\n\016BigQuerySource\022\020\n\003ur"
          + "i\030\001 \001(\tB\003\340A\002\022\036\n\021entity_id_columns\030\002 \003(\tB"
          + "\003\340A\002\0323\n\nSyncConfig\022\014\n\004cron\030\001 \001(\t\022\027\n\ncont"
          + "inuous\030\002 \001(\010B\003\340A\001\032\347\005\n\013IndexConfig\022_\n\016tre"
          + "e_ah_config\030\006 \001(\0132@.google.cloud.aiplatf"
          + "orm.v1.FeatureView.IndexConfig.TreeAHCon"
          + "figB\003\340A\001H\000\022g\n\022brute_force_config\030\007 \001(\0132D"
          + ".google.cloud.aiplatform.v1.FeatureView."
          + "IndexConfig.BruteForceConfigB\003\340A\001H\000\022\035\n\020e"
          + "mbedding_column\030\001 \001(\tB\003\340A\001\022\033\n\016filter_col"
          + "umns\030\002 \003(\tB\003\340A\001\022\034\n\017crowding_column\030\003 \001(\t"
          + "B\003\340A\001\022%\n\023embedding_dimension\030\004 \001(\005B\003\340A\001H"
          + "\001\210\001\001\022k\n\025distance_measure_type\030\005 \001(\0162G.go"
          + "ogle.cloud.aiplatform.v1.FeatureView.Ind"
          + "exConfig.DistanceMeasureTypeB\003\340A\001\032\022\n\020Bru"
          + "teForceConfig\032Y\n\014TreeAHConfig\022+\n\031leaf_no"
          + "de_embedding_count\030\001 \001(\003B\003\340A\001H\000\210\001\001B\034\n\032_l"
          + "eaf_node_embedding_count\"\204\001\n\023DistanceMea"
          + "sureType\022%\n!DISTANCE_MEASURE_TYPE_UNSPEC"
          + "IFIED\020\000\022\027\n\023SQUARED_L2_DISTANCE\020\001\022\023\n\017COSI"
          + "NE_DISTANCE\020\002\022\030\n\024DOT_PRODUCT_DISTANCE\020\003B"
          + "\022\n\020algorithm_configB\026\n\024_embedding_dimens"
          + "ion\032\376\001\n\025FeatureRegistrySource\022g\n\016feature"
          + "_groups\030\001 \003(\0132J.google.cloud.aiplatform."
          + "v1.FeatureView.FeatureRegistrySource.Fea"
          + "tureGroupB\003\340A\002\022 \n\016project_number\030\002 \001(\003B\003"
          + "\340A\001H\000\210\001\001\032G\n\014FeatureGroup\022\035\n\020feature_grou"
          + "p_id\030\001 \001(\tB\003\340A\002\022\030\n\013feature_ids\030\002 \003(\tB\003\340A"
          + "\002B\021\n\017_project_number\032?\n\017VertexRagSource\022"
          + "\020\n\003uri\030\001 \001(\tB\003\340A\002\022\032\n\rrag_corpus_id\030\002 \001(\003"
          + "B\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val"
          + "ue\030\002 \001(\t:\0028\001:\233\001\352A\227\001\n%aiplatform.googleap"
          + "is.com/FeatureView\022nprojects/{project}/l"
          + "ocations/{location}/featureOnlineStores/"
          + "{feature_online_store}/featureViews/{fea"
          + "ture_view}B\010\n\006sourceB\316\001\n\036com.google.clou"
          + "d.aiplatform.v1B\020FeatureViewProtoP\001Z>clo"
          + "ud.google.com/go/aiplatform/apiv1/aiplat"
          + "formpb;aiplatformpb\252\002\032Google.Cloud.AIPla"
          + "tform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035"
          + "Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor,
            new java.lang.String[] {
              "BigQuerySource",
              "FeatureRegistrySource",
              "VertexRagSource",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "SyncConfig",
              "IndexConfig",
              "SatisfiesPzs",
              "SatisfiesPzi",
              "Source",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_BigQuerySource_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureView_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_BigQuerySource_descriptor,
            new java.lang.String[] {
              "Uri", "EntityIdColumns",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_SyncConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FeatureView_SyncConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_SyncConfig_descriptor,
            new java.lang.String[] {
              "Cron", "Continuous",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_descriptor,
            new java.lang.String[] {
              "TreeAhConfig",
              "BruteForceConfig",
              "EmbeddingColumn",
              "FilterColumns",
              "CrowdingColumn",
              "EmbeddingDimension",
              "DistanceMeasureType",
              "AlgorithmConfig",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_BruteForceConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_BruteForceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_BruteForceConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_TreeAHConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_TreeAHConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_IndexConfig_TreeAHConfig_descriptor,
            new java.lang.String[] {
              "LeafNodeEmbeddingCount",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_descriptor,
            new java.lang.String[] {
              "FeatureGroups", "ProjectNumber",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_FeatureGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor,
            new java.lang.String[] {
              "FeatureGroupId", "FeatureIds",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_VertexRagSource_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_FeatureView_VertexRagSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_VertexRagSource_descriptor,
            new java.lang.String[] {
              "Uri", "RagCorpusId",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureView_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureView_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_FeatureView_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureView_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
