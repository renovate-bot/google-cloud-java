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
// source: google/cloud/aiplatform/v1/index.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public final class IndexProto {
  private IndexProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Index_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_SparseEmbedding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_SparseEmbedding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "&google/cloud/aiplatform/v1/index.proto"
          + "\022\032google.cloud.aiplatform.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0323google/cloud/aiplatform/v1/deployed_index_ref.proto\0320google/cloud/aipl"
          + "atform/v1/encryption_spec.proto\032\034google/"
          + "protobuf/struct.proto\032\037google/protobuf/timestamp.proto\"\244\007\n"
          + "\005Index\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\023\n"
          + "\013description\030\003 \001(\t\022 \n"
          + "\023metadata_schema_uri\030\004 \001(\tB\003\340A\005\022(\n"
          + "\010metadata\030\006 \001(\0132\026.google.protobuf.Value\022K\n"
          + "\020deployed_indexes\030\007 \003(\0132,.goog"
          + "le.cloud.aiplatform.v1.DeployedIndexRefB\003\340A\003\022\014\n"
          + "\004etag\030\010 \001(\t\022=\n"
          + "\006labels\030\t \003(\0132-.google.cloud.aiplatform.v1.Index.LabelsEntry\0224\n"
          + "\013create_time\030\n"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\013 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022@\n"
          + "\013index_stats\030\016"
          + " \001(\0132&.google.cloud.aiplatform.v1.IndexStatsB\003\340A\003\022U\n"
          + "\023index_update_method\030\020"
          + " \001(\01623.google.cloud.aiplatform.v1.Index.IndexUpdateMethodB\003\340A\005\022H\n"
          + "\017encryption_spec\030\021"
          + " \001(\0132*.google.cloud.aiplatform.v1.EncryptionSpecB\003\340A\005\022\032\n\r"
          + "satisfies_pzs\030\022 \001(\010B\003\340A\003\022\032\n\r"
          + "satisfies_pzi\030\023 \001(\010B\003\340A\003\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"]\n"
          + "\021IndexUpdateMethod\022#\n"
          + "\037INDEX_UPDATE_METHOD_UNSPECIFIED\020\000\022\020\n"
          + "\014BATCH_UPDATE\020\001\022\021\n\r"
          + "STREAM_UPDATE\020\002:]\352AZ\n"
          + "\037aiplatform.googleap"
          + "is.com/Index\0227projects/{project}/locations/{location}/indexes/{index}\"\237\007\n"
          + "\016IndexDatapoint\022\031\n"
          + "\014datapoint_id\030\001 \001(\tB\003\340A\002\022\033\n"
          + "\016feature_vector\030\002 \003(\002B\003\340A\002\022Y\n"
          + "\020sparse_embedding\030\007"
          + " \001(\0132:.google.cloud.aiplatform.v1.IndexDatapoint.SparseEmbeddingB\003\340A\001\022N\n"
          + "\trestricts\030\004"
          + " \003(\01326.google.cloud.aiplatform.v1.IndexDatapoint.RestrictionB\003\340A\001\022]\n"
          + "\021numeric_restricts\030\006 \003(\0132=.google.cloud.ai"
          + "platform.v1.IndexDatapoint.NumericRestrictionB\003\340A\001\022Q\n"
          + "\014crowding_tag\030\005 \001(\01326.googl"
          + "e.cloud.aiplatform.v1.IndexDatapoint.CrowdingTagB\003\340A\001\032?\n"
          + "\017SparseEmbedding\022\023\n"
          + "\006values\030\001 \003(\002B\003\340A\002\022\027\n\n"
          + "dimensions\030\002 \003(\003B\003\340A\002\032G\n"
          + "\013Restriction\022\021\n"
          + "\tnamespace\030\001 \001(\t\022\022\n\n"
          + "allow_list\030\002 \003(\t\022\021\n"
          + "\tdeny_list\030\003 \003(\t\032\302\002\n"
          + "\022NumericRestriction\022\023\n"
          + "\tvalue_int\030\002 \001(\003H\000\022\025\n"
          + "\013value_float\030\003 \001(\002H\000\022\026\n"
          + "\014value_double\030\004 \001(\001H\000\022\021\n"
          + "\tnamespace\030\001 \001(\t\022R\n"
          + "\002op\030\005 \001(\0162F.goog"
          + "le.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction.Operator\"x\n"
          + "\010Operator\022\030\n"
          + "\024OPERATOR_UNSPECIFIED\020\000\022\010\n"
          + "\004LESS\020\001\022\016\n\n"
          + "LESS_EQUAL\020\002\022\t\n"
          + "\005EQUAL\020\003\022\021\n\r"
          + "GREATER_EQUAL\020\004\022\013\n"
          + "\007GREATER\020\005\022\r\n"
          + "\tNOT_EQUAL\020\006B\007\n"
          + "\005Value\032)\n"
          + "\013CrowdingTag\022\032\n"
          + "\022crowding_attribute\030\001 \001(\t\"f\n\n"
          + "IndexStats\022\032\n\r"
          + "vectors_count\030\001 \001(\003B\003\340A\003\022!\n"
          + "\024sparse_vectors_count\030\003 \001(\003B\003\340A\003\022\031\n"
          + "\014shards_count\030\002 \001(\005B\003\340A\003B\310\001\n"
          + "\036com.google.cloud.aiplatform.v1B\n"
          + "IndexProtoP\001Z>cloud.google.com/go/aiplatform/apiv1/aiplatfor"
          + "mpb;aiplatformpb\252\002\032Google.Cloud.AIPlatfo"
          + "rm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Goo"
          + "gle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Index_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Index_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "IndexStats",
              "IndexUpdateMethod",
              "EncryptionSpec",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Index_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor,
            new java.lang.String[] {
              "DatapointId",
              "FeatureVector",
              "SparseEmbedding",
              "Restricts",
              "NumericRestricts",
              "CrowdingTag",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_SparseEmbedding_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_SparseEmbedding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_SparseEmbedding_descriptor,
            new java.lang.String[] {
              "Values", "Dimensions",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor,
            new java.lang.String[] {
              "Namespace", "AllowList", "DenyList",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_descriptor,
            new java.lang.String[] {
              "ValueInt", "ValueFloat", "ValueDouble", "Namespace", "Op", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor,
            new java.lang.String[] {
              "CrowdingAttribute",
            });
    internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_IndexStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor,
            new java.lang.String[] {
              "VectorsCount", "SparseVectorsCount", "ShardsCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
