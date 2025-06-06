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
// source: google/cloud/networksecurity/v1/server_tls_policy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networksecurity.v1;

public final class ServerTlsPolicyProto {
  private ServerTlsPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_MTLSPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_MTLSPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_GetServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_GetServerTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_CreateServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_CreateServerTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_UpdateServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_UpdateServerTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1_DeleteServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_DeleteServerTlsPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "7google/cloud/networksecurity/v1/server_tls_policy.proto\022\037google.cloud.networks"
          + "ecurity.v1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032)google/cloud/networksecurity/v1/tls.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\272\005\n"
          + "\017ServerTlsPolicy\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022\023\n"
          + "\013description\030\002 \001(\t\0224\n"
          + "\013create_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022L\n"
          + "\006labels\030\005"
          + " \003(\0132<.google.cloud.networksecurity.v1.ServerTlsPolicy.LabelsEntry\022\022\n\n"
          + "allow_open\030\006 \001(\010\022P\n"
          + "\022server_certificate\030\007 \001(\01324.goo"
          + "gle.cloud.networksecurity.v1.CertificateProvider\022P\n"
          + "\013mtls_policy\030\010 \001(\0132;.google.c"
          + "loud.networksecurity.v1.ServerTlsPolicy.MTLSPolicy\032Y\n\n"
          + "MTLSPolicy\022K\n"
          + "\024client_validation_ca\030\001"
          + " \003(\0132-.google.cloud.networksecurity.v1.ValidationCA\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:\202\001\352A\177\n"
          + ".networksecurity.googleapis.com/ServerTlsPoli"
          + "cy\022Mprojects/{project}/locations/{locati"
          + "on}/serverTlsPolicies/{server_tls_policy}\"\200\001\n"
          + "\034ListServerTlsPoliciesRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"\207\001\n"
          + "\035ListServerTlsPoliciesResponse\022M\n"
          + "\023server_tls_policies\030\001 \003(\01320.go"
          + "ogle.cloud.networksecurity.v1.ServerTlsPolicy\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"a\n"
          + "\031GetServerTlsPolicyRequest\022D\n"
          + "\004name\030\001 \001(\tB6\340A\002\372A0\n"
          + ".networksecurity.googleapis.com/ServerTlsPolicy\"\333\001\n"
          + "\034CreateServerTlsPolicyRequest\022F\n"
          + "\006parent\030\001 \001("
          + "\tB6\340A\002\372A0\022.networksecurity.googleapis.com/ServerTlsPolicy\022!\n"
          + "\024server_tls_policy_id\030\002 \001(\tB\003\340A\002\022P\n"
          + "\021server_tls_policy\030\003"
          + " \001(\01320.google.cloud.networksecurity.v1.ServerTlsPolicyB\003\340A\002\"\246\001\n"
          + "\034UpdateServerTlsPolicyRequest\0224\n"
          + "\013update_mask\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001\022P\n"
          + "\021server_tls_policy\030\002 \001(\01320.google.cloud"
          + ".networksecurity.v1.ServerTlsPolicyB\003\340A\002\"d\n"
          + "\034DeleteServerTlsPolicyRequest\022D\n"
          + "\004name\030\001 \001(\tB6\340A\002\372A0\n"
          + ".networksecurity.googleapis.com/ServerTlsPolicyB\365\001\n"
          + "#com.google.cloud.networksecurity.v1B\024ServerTlsPolicyP"
          + "rotoP\001ZMcloud.google.com/go/networksecurity/apiv1/networksecuritypb;networksecur"
          + "itypb\252\002\037Google.Cloud.NetworkSecurity.V1\312"
          + "\002\037Google\\Cloud\\NetworkSecurity\\V1\352\002\"Goog"
          + "le::Cloud::NetworkSecurity::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.networksecurity.v1.TlsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "AllowOpen",
              "ServerCertificate",
              "MtlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_MTLSPolicy_descriptor =
        internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_MTLSPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_MTLSPolicy_descriptor,
            new java.lang.String[] {
              "ClientValidationCa",
            });
    internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_ServerTlsPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_descriptor,
            new java.lang.String[] {
              "ServerTlsPolicies", "NextPageToken",
            });
    internal_static_google_cloud_networksecurity_v1_GetServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1_GetServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_GetServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networksecurity_v1_CreateServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networksecurity_v1_CreateServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_CreateServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServerTlsPolicyId", "ServerTlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1_UpdateServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networksecurity_v1_UpdateServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_UpdateServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "ServerTlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1_DeleteServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networksecurity_v1_DeleteServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1_DeleteServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networksecurity.v1.TlsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
