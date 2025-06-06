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
// source: google/devtools/artifactregistry/v1/attachment.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public final class AttachmentProto {
  private AttachmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_Attachment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_Attachment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_Attachment_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_Attachment_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListAttachmentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListAttachmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListAttachmentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListAttachmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetAttachmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetAttachmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_CreateAttachmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_CreateAttachmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_DeleteAttachmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_DeleteAttachmentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "4google/devtools/artifactregistry/v1/attachment.proto\022#google.devtools.artifact"
          + "registry.v1\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032\037google/protobuf/timestamp.proto\"\302\004\n\n"
          + "Attachment\022\014\n"
          + "\004name\030\001 \001(\t\022\023\n"
          + "\006target\030\002 \001(\tB\003\340A\002\022\014\n"
          + "\004type\030\003 \001(\t\022\034\n"
          + "\024attachment_namespace\030\004 \001(\t\022Z\n"
          + "\013annotations\030\005 \003(\0132@.google.devtools.ar"
          + "tifactregistry.v1.Attachment.AnnotationsEntryB\003\340A\001\0224\n"
          + "\013create_time\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022;\n"
          + "\005files\030\010 \003(\tB,\340A\002\372A&\n"
          + "$artifactregistry.googleapis.com/File\022\035\n"
          + "\020oci_version_name\030\t \001(\tB\003\340A\003\0322\n"
          + "\020AnnotationsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:\214\001\352A\210\001\n"
          + "*artifactregistry.googleapis.com/Attachment\022Zproje"
          + "cts/{project}/locations/{location}/repos"
          + "itories/{repository}/attachments/{attachment}\"\230\001\n"
          + "\026ListAttachmentsRequest\022B\n"
          + "\006parent\030\001 \001("
          + "\tB2\340A\002\372A,\022*artifactregistry.googleapis.com/Attachment\022\023\n"
          + "\006filter\030\002 \001(\tB\003\340A\001\022\021\n"
          + "\tpage_size\030\003 \001(\005\022\022\n\n"
          + "page_token\030\004 \001(\t\"x\n"
          + "\027ListAttachmentsResponse\022D\n"
          + "\013attachments\030\001"
          + " \003(\0132/.google.devtools.artifactregistry.v1.Attachment\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"X\n"
          + "\024GetAttachmentRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*artifactregistry.googleapis.com/Attachment\"\303\001\n"
          + "\027CreateAttachmentRequest\022B\n"
          + "\006parent\030\001 \001("
          + "\tB2\340A\002\372A,\022*artifactregistry.googleapis.com/Attachment\022\032\n\r"
          + "attachment_id\030\002 \001(\tB\003\340A\002\022H\n\n"
          + "attachment\030\003 \001(\0132/.g"
          + "oogle.devtools.artifactregistry.v1.AttachmentB\003\340A\002\"[\n"
          + "\027DeleteAttachmentRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*artifactregistry.googleapis.com/AttachmentB\372\001\n"
          + "\'com.google.devtools.artifactregistry.v1B\017AttachmentP"
          + "rotoP\001ZPcloud.google.com/go/artifactregi"
          + "stry/apiv1/artifactregistrypb;artifactregistrypb\252\002"
          + " Google.Cloud.ArtifactRegistry.V1\312\002 Google\\Cloud\\ArtifactRegistry\\V1\352\002"
          + "#Google::Cloud::ArtifactRegistry::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_Attachment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_Attachment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_Attachment_descriptor,
            new java.lang.String[] {
              "Name",
              "Target",
              "Type",
              "AttachmentNamespace",
              "Annotations",
              "CreateTime",
              "UpdateTime",
              "Files",
              "OciVersionName",
            });
    internal_static_google_devtools_artifactregistry_v1_Attachment_AnnotationsEntry_descriptor =
        internal_static_google_devtools_artifactregistry_v1_Attachment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_artifactregistry_v1_Attachment_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_Attachment_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_devtools_artifactregistry_v1_ListAttachmentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ListAttachmentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListAttachmentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_ListAttachmentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ListAttachmentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListAttachmentsResponse_descriptor,
            new java.lang.String[] {
              "Attachments", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetAttachmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_GetAttachmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetAttachmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1_CreateAttachmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_CreateAttachmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_CreateAttachmentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AttachmentId", "Attachment",
            });
    internal_static_google_devtools_artifactregistry_v1_DeleteAttachmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1_DeleteAttachmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_DeleteAttachmentRequest_descriptor,
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
