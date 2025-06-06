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
// source: google/monitoring/v3/group_service.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

public final class GroupServiceProto {
  private GroupServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupMembersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupMembersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupMembersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/monitoring/v3/group_service.pro"
          + "to\022\024google.monitoring.v3\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032#google"
          + "/api/monitored_resource.proto\032\031google/ap"
          + "i/resource.proto\032!google/monitoring/v3/c"
          + "ommon.proto\032 google/monitoring/v3/group."
          + "proto\032\033google/protobuf/empty.proto\"\310\002\n\021L"
          + "istGroupsRequest\0225\n\004name\030\007 \001(\tB\'\340A\002\372A!\022\037"
          + "monitoring.googleapis.com/Group\022A\n\021child"
          + "ren_of_group\030\002 \001(\tB$\372A!\n\037monitoring.goog"
          + "leapis.com/GroupH\000\022B\n\022ancestors_of_group"
          + "\030\003 \001(\tB$\372A!\n\037monitoring.googleapis.com/G"
          + "roupH\000\022D\n\024descendants_of_group\030\004 \001(\tB$\372A"
          + "!\n\037monitoring.googleapis.com/GroupH\000\022\021\n\t"
          + "page_size\030\005 \001(\005\022\022\n\npage_token\030\006 \001(\tB\010\n\006f"
          + "ilter\"Y\n\022ListGroupsResponse\022*\n\005group\030\001 \003"
          + "(\0132\033.google.monitoring.v3.Group\022\027\n\017next_"
          + "page_token\030\002 \001(\t\"H\n\017GetGroupRequest\0225\n\004n"
          + "ame\030\003 \001(\tB\'\340A\002\372A!\n\037monitoring.googleapis"
          + ".com/Group\"\223\001\n\022CreateGroupRequest\0225\n\004nam"
          + "e\030\004 \001(\tB\'\340A\002\372A!\022\037monitoring.googleapis.c"
          + "om/Group\022/\n\005group\030\002 \001(\0132\033.google.monitor"
          + "ing.v3.GroupB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010"
          + "\"\\\n\022UpdateGroupRequest\022/\n\005group\030\002 \001(\0132\033."
          + "google.monitoring.v3.GroupB\003\340A\002\022\025\n\rvalid"
          + "ate_only\030\003 \001(\010\"^\n\022DeleteGroupRequest\0225\n\004"
          + "name\030\003 \001(\tB\'\340A\002\372A!\n\037monitoring.googleapi"
          + "s.com/Group\022\021\n\trecursive\030\004 \001(\010\"\275\001\n\027ListG"
          + "roupMembersRequest\0225\n\004name\030\007 \001(\tB\'\340A\002\372A!"
          + "\n\037monitoring.googleapis.com/Group\022\021\n\tpag"
          + "e_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022\016\n\006filt"
          + "er\030\005 \001(\t\0224\n\010interval\030\006 \001(\0132\".google.moni"
          + "toring.v3.TimeInterval\"w\n\030ListGroupMembe"
          + "rsResponse\022.\n\007members\030\001 \003(\0132\035.google.api"
          + ".MonitoredResource\022\027\n\017next_page_token\030\002 "
          + "\001(\t\022\022\n\ntotal_size\030\003 \001(\0052\230\010\n\014GroupService"
          + "\022\214\001\n\nListGroups\022\'.google.monitoring.v3.L"
          + "istGroupsRequest\032(.google.monitoring.v3."
          + "ListGroupsResponse\"+\332A\004name\202\323\344\223\002\036\022\034/v3/{"
          + "name=projects/*}/groups\022}\n\010GetGroup\022%.go"
          + "ogle.monitoring.v3.GetGroupRequest\032\033.goo"
          + "gle.monitoring.v3.Group\"-\332A\004name\202\323\344\223\002 \022\036"
          + "/v3/{name=projects/*/groups/*}\022\216\001\n\013Creat"
          + "eGroup\022(.google.monitoring.v3.CreateGrou"
          + "pRequest\032\033.google.monitoring.v3.Group\"8\332"
          + "A\nname,group\202\323\344\223\002%\"\034/v3/{name=projects/*"
          + "}/groups:\005group\022\221\001\n\013UpdateGroup\022(.google"
          + ".monitoring.v3.UpdateGroupRequest\032\033.goog"
          + "le.monitoring.v3.Group\";\332A\005group\202\323\344\223\002-\032$"
          + "/v3/{group.name=projects/*/groups/*}:\005gr"
          + "oup\022~\n\013DeleteGroup\022(.google.monitoring.v"
          + "3.DeleteGroupRequest\032\026.google.protobuf.E"
          + "mpty\"-\332A\004name\202\323\344\223\002 *\036/v3/{name=projects/"
          + "*/groups/*}\022\250\001\n\020ListGroupMembers\022-.googl"
          + "e.monitoring.v3.ListGroupMembersRequest\032"
          + "..google.monitoring.v3.ListGroupMembersR"
          + "esponse\"5\332A\004name\202\323\344\223\002(\022&/v3/{name=projec"
          + "ts/*/groups/*}/members\032\251\001\312A\031monitoring.g"
          + "oogleapis.com\322A\211\001https://www.googleapis."
          + "com/auth/cloud-platform,https://www.goog"
          + "leapis.com/auth/monitoring,https://www.g"
          + "oogleapis.com/auth/monitoring.readB\314\001\n\030c"
          + "om.google.monitoring.v3B\021GroupServicePro"
          + "toP\001ZAcloud.google.com/go/monitoring/api"
          + "v3/v2/monitoringpb;monitoringpb\252\002\032Google"
          + ".Cloud.Monitoring.V3\312\002\032Google\\Cloud\\Moni"
          + "toring\\V3\352\002\035Google::Cloud::Monitoring::V"
          + "3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
              com.google.monitoring.v3.GroupProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_ListGroupsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListGroupsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupsRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "ChildrenOfGroup",
              "AncestorsOfGroup",
              "DescendantsOfGroup",
              "PageSize",
              "PageToken",
              "Filter",
            });
    internal_static_google_monitoring_v3_ListGroupsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListGroupsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupsResponse_descriptor,
            new java.lang.String[] {
              "Group", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetGroupRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_CreateGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Group", "ValidateOnly",
            });
    internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_UpdateGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor,
            new java.lang.String[] {
              "Group", "ValidateOnly",
            });
    internal_static_google_monitoring_v3_DeleteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_DeleteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Recursive",
            });
    internal_static_google_monitoring_v3_ListGroupMembersRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_ListGroupMembersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupMembersRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken", "Filter", "Interval",
            });
    internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_ListGroupMembersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor,
            new java.lang.String[] {
              "Members", "NextPageToken", "TotalSize",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.GroupProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
