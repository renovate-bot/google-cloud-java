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
// source: google/monitoring/v3/alert_service.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

public final class AlertServiceProto {
  private AlertServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateAlertPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateAlertPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetAlertPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetAlertPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListAlertPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListAlertPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListAlertPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListAlertPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateAlertPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateAlertPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteAlertPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteAlertPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "(google/monitoring/v3/alert_service.pro"
          + "to\022\024google.monitoring.v3\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google/api/resource.proto\032"
          + " google/monitoring/v3/alert.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\"\225\001\n"
          + "\030CreateAlertPolicyRequest\022;\n"
          + "\004name\030\003 \001(\tB"
          + "-\340A\002\372A\'\022%monitoring.googleapis.com/AlertPolicy\022<\n"
          + "\014alert_policy\030\002"
          + " \001(\0132!.google.monitoring.v3.AlertPolicyB\003\340A\002\"T\n"
          + "\025GetAlertPolicyRequest\022;\n"
          + "\004name\030\003 \001(\tB-\340A\002\372A\'\n"
          + "%monitoring.googleapis.com/AlertPolicy\"\264\001\n"
          + "\030ListAlertPoliciesRequest\022;\n"
          + "\004name\030\004 \001(\tB-\340"
          + "A\002\372A\'\022%monitoring.googleapis.com/AlertPolicy\022\023\n"
          + "\006filter\030\005 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\006 \001(\tB\003\340A\001\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\"\203\001\n"
          + "\031ListAlertPoliciesResponse\0229\n"
          + "\016alert_policies\030\003 \003(\0132!.google.monitoring.v3.AlertPolicy\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\022\n\n"
          + "total_size\030\004 \001(\005\"\216\001\n"
          + "\030UpdateAlertPolicyRequest\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001\022<\n"
          + "\014alert_policy\030\003"
          + " \001(\0132!.google.monitoring.v3.AlertPolicyB\003\340A\002\"W\n"
          + "\030DeleteAlertPolicyRequest\022;\n"
          + "\004name\030\003 \001(\tB-\340A\002\372A\'\n"
          + "%monitoring.googleapis.com/AlertPolicy2\236\010\n"
          + "\022AlertPolicyService\022\250\001\n"
          + "\021ListAlertPolicies\022..google.monitoring.v3.ListAlertPoliciesRequest\032/"
          + ".google.monitoring.v3.ListAlertPoliciesR"
          + "esponse\"2\332A\004name\202\323\344\223\002%\022#/v3/{name=projects/*}/alertPolicies\022\226\001\n"
          + "\016GetAlertPolicy\022+.google.monitoring.v3.GetAlertPolicyRequ"
          + "est\032!.google.monitoring.v3.AlertPolicy\"4"
          + "\332A\004name\202\323\344\223\002\'\022%/v3/{name=projects/*/alertPolicies/*}\022\265\001\n"
          + "\021CreateAlertPolicy\022..google.monitoring.v3.CreateAlertPolicyReque"
          + "st\032!.google.monitoring.v3.AlertPolicy\"M\332"
          + "A\021name,alert_policy\202\323\344\223\0023\"#/v3/{name=projects/*}/alertPolicies:\014alert_policy\022\221\001\n"
          + "\021DeleteAlertPolicy\022..google.monitoring.v"
          + "3.DeleteAlertPolicyRequest\032\026.google.prot"
          + "obuf.Empty\"4\332A\004name\202\323\344\223\002\'*%/v3/{name=projects/*/alertPolicies/*}\022\313\001\n"
          + "\021UpdateAlertPolicy\022..google.monitoring.v3.UpdateAler"
          + "tPolicyRequest\032!.google.monitoring.v3.Al"
          + "ertPolicy\"c\332A\030update_mask,alert_policy\202\323"
          + "\344\223\002B22/v3/{alert_policy.name=projects/*/"
          + "alertPolicies/*}:\014alert_policy\032\251\001\312A\031moni"
          + "toring.googleapis.com\322A\211\001https://www.goo"
          + "gleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/monitoring,https"
          + "://www.googleapis.com/auth/monitoring.readB\314\001\n"
          + "\030com.google.monitoring.v3B\021AlertServiceProtoP\001ZAcloud.google.com/go/monito"
          + "ring/apiv3/v2/monitoringpb;monitoringpb\252"
          + "\002\032Google.Cloud.Monitoring.V3\312\002\032Google\\Cl"
          + "oud\\Monitoring\\V3\352\002\035Google::Cloud::Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.AlertProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_CreateAlertPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_CreateAlertPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateAlertPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name", "AlertPolicy",
            });
    internal_static_google_monitoring_v3_GetAlertPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_GetAlertPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetAlertPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListAlertPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_ListAlertPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListAlertPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListAlertPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_ListAlertPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListAlertPoliciesResponse_descriptor,
            new java.lang.String[] {
              "AlertPolicies", "NextPageToken", "TotalSize",
            });
    internal_static_google_monitoring_v3_UpdateAlertPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_UpdateAlertPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateAlertPolicyRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "AlertPolicy",
            });
    internal_static_google_monitoring_v3_DeleteAlertPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_DeleteAlertPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteAlertPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.AlertProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
