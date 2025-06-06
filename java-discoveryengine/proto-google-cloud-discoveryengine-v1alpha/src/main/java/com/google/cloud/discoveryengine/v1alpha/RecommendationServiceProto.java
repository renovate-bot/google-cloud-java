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
// source: google/cloud/discoveryengine/v1alpha/recommendation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public final class RecommendationServiceProto {
  private RecommendationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/discoveryengine/v1alpha/r"
          + "ecommendation_service.proto\022$google.clou"
          + "d.discoveryengine.v1alpha\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0323google/cloud/disco"
          + "veryengine/v1alpha/document.proto\0325googl"
          + "e/cloud/discoveryengine/v1alpha/user_eve"
          + "nt.proto\032\034google/protobuf/struct.proto\"\217"
          + "\004\n\020RecommendRequest\022L\n\016serving_config\030\001 "
          + "\001(\tB4\340A\002\372A.\n,discoveryengine.googleapis."
          + "com/ServingConfig\022H\n\nuser_event\030\002 \001(\0132/."
          + "google.cloud.discoveryengine.v1alpha.Use"
          + "rEventB\003\340A\002\022\021\n\tpage_size\030\003 \001(\005\022\016\n\006filter"
          + "\030\004 \001(\t\022\025\n\rvalidate_only\030\005 \001(\010\022R\n\006params\030"
          + "\006 \003(\0132B.google.cloud.discoveryengine.v1a"
          + "lpha.RecommendRequest.ParamsEntry\022[\n\013use"
          + "r_labels\030\010 \003(\0132F.google.cloud.discoverye"
          + "ngine.v1alpha.RecommendRequest.UserLabel"
          + "sEntry\032E\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022%\n\005va"
          + "lue\030\002 \001(\0132\026.google.protobuf.Value:\0028\001\0321\n"
          + "\017UserLabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"\327\003\n\021RecommendResponse\022]\n\007result"
          + "s\030\001 \003(\0132L.google.cloud.discoveryengine.v"
          + "1alpha.RecommendResponse.RecommendationR"
          + "esult\022\031\n\021attribution_token\030\002 \001(\t\022\023\n\013miss"
          + "ing_ids\030\003 \003(\t\022\025\n\rvalidate_only\030\004 \001(\010\032\233\002\n"
          + "\024RecommendationResult\022\n\n\002id\030\001 \001(\t\022@\n\010doc"
          + "ument\030\002 \001(\0132..google.cloud.discoveryengi"
          + "ne.v1alpha.Document\022l\n\010metadata\030\003 \003(\0132Z."
          + "google.cloud.discoveryengine.v1alpha.Rec"
          + "ommendResponse.RecommendationResult.Meta"
          + "dataEntry\032G\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022"
          + "%\n\005value\030\002 \001(\0132\026.google.protobuf.Value:\002"
          + "8\0012\250\004\n\025RecommendationService\022\272\003\n\tRecomme"
          + "nd\0226.google.cloud.discoveryengine.v1alph"
          + "a.RecommendRequest\0327.google.cloud.discov"
          + "eryengine.v1alpha.RecommendResponse\"\273\002\202\323"
          + "\344\223\002\264\002\"X/v1alpha/{serving_config=projects"
          + "/*/locations/*/dataStores/*/servingConfi"
          + "gs/*}:recommend:\001*Zk\"f/v1alpha/{serving_"
          + "config=projects/*/locations/*/collection"
          + "s/*/dataStores/*/servingConfigs/*}:recom"
          + "mend:\001*Zh\"c/v1alpha/{serving_config=proj"
          + "ects/*/locations/*/collections/*/engines"
          + "/*/servingConfigs/*}:recommend:\001*\032R\312A\036di"
          + "scoveryengine.googleapis.com\322A.https://w"
          + "ww.googleapis.com/auth/cloud-platformB\246\002"
          + "\n(com.google.cloud.discoveryengine.v1alp"
          + "haB\032RecommendationServiceProtoP\001ZRcloud."
          + "google.com/go/discoveryengine/apiv1alpha"
          + "/discoveryenginepb;discoveryenginepb\242\002\017D"
          + "ISCOVERYENGINE\252\002$Google.Cloud.DiscoveryE"
          + "ngine.V1Alpha\312\002$Google\\Cloud\\DiscoveryEn"
          + "gine\\V1alpha\352\002\'Google::Cloud::DiscoveryE"
          + "ngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig",
              "UserEvent",
              "PageSize",
              "Filter",
              "ValidateOnly",
              "Params",
              "UserLabels",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_UserLabelsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_RecommendRequest_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_descriptor,
            new java.lang.String[] {
              "Results", "AttributionToken", "MissingIds", "ValidateOnly",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_descriptor,
            new java.lang.String[] {
              "Id", "Document", "Metadata",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_MetadataEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_RecommendResponse_RecommendationResult_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
