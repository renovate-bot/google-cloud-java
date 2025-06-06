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
// source: google/cloud/discoveryengine/v1alpha/engine_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public final class EngineServiceProto {
  private EngineServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_PauseEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_PauseEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ResumeEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ResumeEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/discoveryengine/v1alpha/e"
          + "ngine_service.proto\022$google.cloud.discov"
          + "eryengine.v1alpha\032\034google/api/annotation"
          + "s.proto\032\027google/api/client.proto\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\0321google/cloud/discoveryengi"
          + "ne/v1alpha/engine.proto\032#google/longrunn"
          + "ing/operations.proto\032\033google/protobuf/em"
          + "pty.proto\032 google/protobuf/field_mask.pr"
          + "oto\032\037google/protobuf/timestamp.proto\"\263\001\n"
          + "\023CreateEngineRequest\022A\n\006parent\030\001 \001(\tB1\340A"
          + "\002\372A+\n)discoveryengine.googleapis.com/Col"
          + "lection\022A\n\006engine\030\002 \001(\0132,.google.cloud.d"
          + "iscoveryengine.v1alpha.EngineB\003\340A\002\022\026\n\ten"
          + "gine_id\030\003 \001(\tB\003\340A\002\"x\n\024CreateEngineMetada"
          + "ta\022/\n\013create_time\030\001 \001(\0132\032.google.protobu"
          + "f.Timestamp\022/\n\013update_time\030\002 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\"R\n\023DeleteEngineRequ"
          + "est\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%discoveryengi"
          + "ne.googleapis.com/Engine\"x\n\024DeleteEngine"
          + "Metadata\022/\n\013create_time\030\001 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032"
          + ".google.protobuf.Timestamp\"O\n\020GetEngineR"
          + "equest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%discoverye"
          + "ngine.googleapis.com/Engine\"\235\001\n\022ListEngi"
          + "nesRequest\022A\n\006parent\030\001 \001(\tB1\340A\002\372A+\n)disc"
          + "overyengine.googleapis.com/Collection\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001("
          + "\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\"m\n\023ListEngin"
          + "esResponse\022=\n\007engines\030\001 \003(\0132,.google.clo"
          + "ud.discoveryengine.v1alpha.Engine\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"\211\001\n\023UpdateEngineReque"
          + "st\022A\n\006engine\030\001 \001(\0132,.google.cloud.discov"
          + "eryengine.v1alpha.EngineB\003\340A\002\022/\n\013update_"
          + "mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"Q"
          + "\n\022PauseEngineRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372"
          + "A\'\n%discoveryengine.googleapis.com/Engin"
          + "e\"R\n\023ResumeEngineRequest\022;\n\004name\030\001 \001(\tB-"
          + "\340A\002\372A\'\n%discoveryengine.googleapis.com/E"
          + "ngine\"P\n\021TuneEngineRequest\022;\n\004name\030\001 \001(\t"
          + "B-\340A\002\372A\'\n%discoveryengine.googleapis.com"
          + "/Engine\"S\n\022TuneEngineMetadata\022=\n\006engine\030"
          + "\001 \001(\tB-\340A\002\372A\'\n%discoveryengine.googleapi"
          + "s.com/Engine\"\024\n\022TuneEngineResponse2\300\017\n\rE"
          + "ngineService\022\276\002\n\014CreateEngine\0229.google.c"
          + "loud.discoveryengine.v1alpha.CreateEngin"
          + "eRequest\032\035.google.longrunning.Operation\""
          + "\323\001\312Ah\n+google.cloud.discoveryengine.v1al"
          + "pha.Engine\0229google.cloud.discoveryengine"
          + ".v1alpha.CreateEngineMetadata\332A\027parent,e"
          + "ngine,engine_id\202\323\344\223\002H\">/v1alpha/{parent="
          + "projects/*/locations/*/collections/*}/en"
          + "gines:\006engine\022\215\002\n\014DeleteEngine\0229.google."
          + "cloud.discoveryengine.v1alpha.DeleteEngi"
          + "neRequest\032\035.google.longrunning.Operation"
          + "\"\242\001\312AR\n\025google.protobuf.Empty\0229google.cl"
          + "oud.discoveryengine.v1alpha.DeleteEngine"
          + "Metadata\332A\004name\202\323\344\223\002@*>/v1alpha/{name=pr"
          + "ojects/*/locations/*/collections/*/engin"
          + "es/*}\022\343\001\n\014UpdateEngine\0229.google.cloud.di"
          + "scoveryengine.v1alpha.UpdateEngineReques"
          + "t\032,.google.cloud.discoveryengine.v1alpha"
          + ".Engine\"j\332A\022engine,update_mask\202\323\344\223\002O2E/v"
          + "1alpha/{engine.name=projects/*/locations"
          + "/*/collections/*/engines/*}:\006engine\022\300\001\n\t"
          + "GetEngine\0226.google.cloud.discoveryengine"
          + ".v1alpha.GetEngineRequest\032,.google.cloud"
          + ".discoveryengine.v1alpha.Engine\"M\332A\004name"
          + "\202\323\344\223\002@\022>/v1alpha/{name=projects/*/locati"
          + "ons/*/collections/*/engines/*}\022\323\001\n\013ListE"
          + "ngines\0228.google.cloud.discoveryengine.v1"
          + "alpha.ListEnginesRequest\0329.google.cloud."
          + "discoveryengine.v1alpha.ListEnginesRespo"
          + "nse\"O\332A\006parent\202\323\344\223\002@\022>/v1alpha/{parent=p"
          + "rojects/*/locations/*/collections/*}/eng"
          + "ines\022\315\001\n\013PauseEngine\0228.google.cloud.disc"
          + "overyengine.v1alpha.PauseEngineRequest\032,"
          + ".google.cloud.discoveryengine.v1alpha.En"
          + "gine\"V\332A\004name\202\323\344\223\002I\"D/v1alpha/{name=proj"
          + "ects/*/locations/*/collections/*/engines"
          + "/*}:pause:\001*\022\320\001\n\014ResumeEngine\0229.google.c"
          + "loud.discoveryengine.v1alpha.ResumeEngin"
          + "eRequest\032,.google.cloud.discoveryengine."
          + "v1alpha.Engine\"W\332A\004name\202\323\344\223\002J\"E/v1alpha/"
          + "{name=projects/*/locations/*/collections"
          + "/*/engines/*}:resume:\001*\022\347\001\n\nTuneEngine\0227"
          + ".google.cloud.discoveryengine.v1alpha.Tu"
          + "neEngineRequest\032\035.google.longrunning.Ope"
          + "ration\"\200\001\312A(\n\022TuneEngineResponse\022\022TuneEn"
          + "gineMetadata\332A\004name\202\323\344\223\002H\"C/v1alpha/{nam"
          + "e=projects/*/locations/*/collections/*/e"
          + "ngines/*}:tune:\001*\032R\312A\036discoveryengine.go"
          + "ogleapis.com\322A.https://www.googleapis.co"
          + "m/auth/cloud-platformB\236\002\n(com.google.clo"
          + "ud.discoveryengine.v1alphaB\022EngineServic"
          + "eProtoP\001ZRcloud.google.com/go/discoverye"
          + "ngine/apiv1alpha/discoveryenginepb;disco"
          + "veryenginepb\242\002\017DISCOVERYENGINE\252\002$Google."
          + "Cloud.DiscoveryEngine.V1Alpha\312\002$Google\\C"
          + "loud\\DiscoveryEngine\\V1alpha\352\002\'Google::C"
          + "loud::DiscoveryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.EngineProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Engine", "EngineId",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CreateEngineMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_DeleteEngineMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_GetEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_descriptor,
            new java.lang.String[] {
              "Engines", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UpdateEngineRequest_descriptor,
            new java.lang.String[] {
              "Engine", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_PauseEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1alpha_PauseEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_PauseEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ResumeEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_discoveryengine_v1alpha_ResumeEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ResumeEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineMetadata_descriptor,
            new java.lang.String[] {
              "Engine",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TuneEngineResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.EngineProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
