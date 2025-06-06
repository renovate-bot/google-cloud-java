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
// source: google/cloud/networkmanagement/v1/reachability.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkmanagement.v1;

public final class ReachabilityServiceProto {
  private ReachabilityServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/networkmanagement/v1/reac"
          + "hability.proto\022!google.cloud.networkmana"
          + "gement.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\0329google/cloud/networkmanagement/v1/"
          + "connectivity_test.proto\032#google/longrunn"
          + "ing/operations.proto\032\033google/protobuf/em"
          + "pty.proto\032 google/protobuf/field_mask.pr"
          + "oto\032\037google/protobuf/timestamp.proto\"\254\001\n"
          + "\034ListConnectivityTestsRequest\022C\n\006parent\030"
          + "\001 \001(\tB3\340A\002\372A-\n+cloudresourcemanager.goog"
          + "leapis.com/Project\022\021\n\tpage_size\030\002 \001(\005\022\022\n"
          + "\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010ord"
          + "er_by\030\005 \001(\t\"\225\001\n\035ListConnectivityTestsRes"
          + "ponse\022F\n\tresources\030\001 \003(\01323.google.cloud."
          + "networkmanagement.v1.ConnectivityTest\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003 "
          + "\003(\t\"e\n\032GetConnectivityTestRequest\022G\n\004nam"
          + "e\030\001 \001(\tB9\340A\002\372A3\n1networkmanagement.googl"
          + "eapis.com/ConnectivityTest\"\306\001\n\035CreateCon"
          + "nectivityTestRequest\022C\n\006parent\030\001 \001(\tB3\340A"
          + "\002\372A-\n+cloudresourcemanager.googleapis.co"
          + "m/Project\022\024\n\007test_id\030\002 \001(\tB\003\340A\002\022J\n\010resou"
          + "rce\030\003 \001(\01323.google.cloud.networkmanageme"
          + "nt.v1.ConnectivityTestB\003\340A\002\"\241\001\n\035UpdateCo"
          + "nnectivityTestRequest\0224\n\013update_mask\030\001 \001"
          + "(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022J\n\010r"
          + "esource\030\002 \001(\01323.google.cloud.networkmana"
          + "gement.v1.ConnectivityTestB\003\340A\002\"h\n\035Delet"
          + "eConnectivityTestRequest\022G\n\004name\030\001 \001(\tB9"
          + "\340A\002\372A3\n1networkmanagement.googleapis.com"
          + "/ConnectivityTest\"g\n\034RerunConnectivityTe"
          + "stRequest\022G\n\004name\030\001 \001(\tB9\340A\002\372A3\n1network"
          + "management.googleapis.com/ConnectivityTe"
          + "st\"\326\001\n\021OperationMetadata\022/\n\013create_time\030"
          + "\001 \001(\0132\032.google.protobuf.Timestamp\022,\n\010end"
          + "_time\030\002 \001(\0132\032.google.protobuf.Timestamp\022"
          + "\016\n\006target\030\003 \001(\t\022\014\n\004verb\030\004 \001(\t\022\025\n\rstatus_"
          + "detail\030\005 \001(\t\022\030\n\020cancel_requested\030\006 \001(\010\022\023"
          + "\n\013api_version\030\007 \001(\t2\226\r\n\023ReachabilityServ"
          + "ice\022\347\001\n\025ListConnectivityTests\022?.google.c"
          + "loud.networkmanagement.v1.ListConnectivi"
          + "tyTestsRequest\032@.google.cloud.networkman"
          + "agement.v1.ListConnectivityTestsResponse"
          + "\"K\332A\006parent\202\323\344\223\002<\022:/v1/{parent=projects/"
          + "*/locations/global}/connectivityTests\022\324\001"
          + "\n\023GetConnectivityTest\022=.google.cloud.net"
          + "workmanagement.v1.GetConnectivityTestReq"
          + "uest\0323.google.cloud.networkmanagement.v1"
          + ".ConnectivityTest\"I\332A\004name\202\323\344\223\002<\022:/v1/{n"
          + "ame=projects/*/locations/global/connecti"
          + "vityTests/*}\022\254\002\n\026CreateConnectivityTest\022"
          + "@.google.cloud.networkmanagement.v1.Crea"
          + "teConnectivityTestRequest\032\035.google.longr"
          + "unning.Operation\"\260\001\312AG\n2google.cloud.net"
          + "workmanagement.v1.ConnectivityTest\022\021Oper"
          + "ationMetadata\332A\027parent,test_id,resource\202"
          + "\323\344\223\002F\":/v1/{parent=projects/*/locations/"
          + "global}/connectivityTests:\010resource\022\262\002\n\026"
          + "UpdateConnectivityTest\022@.google.cloud.ne"
          + "tworkmanagement.v1.UpdateConnectivityTes"
          + "tRequest\032\035.google.longrunning.Operation\""
          + "\266\001\312AG\n2google.cloud.networkmanagement.v1"
          + ".ConnectivityTest\022\021OperationMetadata\332A\024u"
          + "pdate_mask,resource\202\323\344\223\002O2C/v1/{resource"
          + ".name=projects/*/locations/global/connec"
          + "tivityTests/*}:\010resource\022\217\002\n\025RerunConnec"
          + "tivityTest\022?.google.cloud.networkmanagem"
          + "ent.v1.RerunConnectivityTestRequest\032\035.go"
          + "ogle.longrunning.Operation\"\225\001\312AG\n2google"
          + ".cloud.networkmanagement.v1.Connectivity"
          + "Test\022\021OperationMetadata\202\323\344\223\002E\"@/v1/{name"
          + "=projects/*/locations/global/connectivit"
          + "yTests/*}:rerun:\001*\022\361\001\n\026DeleteConnectivit"
          + "yTest\022@.google.cloud.networkmanagement.v"
          + "1.DeleteConnectivityTestRequest\032\035.google"
          + ".longrunning.Operation\"v\312A*\n\025google.prot"
          + "obuf.Empty\022\021OperationMetadata\332A\004name\202\323\344\223"
          + "\002<*:/v1/{name=projects/*/locations/globa"
          + "l/connectivityTests/*}\032T\312A networkmanage"
          + "ment.googleapis.com\322A.https://www.google"
          + "apis.com/auth/cloud-platformB\207\002\n%com.goo"
          + "gle.cloud.networkmanagement.v1B\030Reachabi"
          + "lityServiceProtoP\001ZScloud.google.com/go/"
          + "networkmanagement/apiv1/networkmanagemen"
          + "tpb;networkmanagementpb\252\002!Google.Cloud.N"
          + "etworkManagement.V1\312\002!Google\\Cloud\\Netwo"
          + "rkManagement\\V1\352\002$Google::Cloud::Network"
          + "Management::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.networkmanagement.v1.TestOuterClass.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TestId", "Resource",
            });
    internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Resource",
            });
    internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_networkmanagement_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
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
    com.google.cloud.networkmanagement.v1.TestOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
