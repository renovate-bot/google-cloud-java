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
// source: google/cloud/eventarc/publishing/v1/cloud_event.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.eventarc.publishing.v1;

public final class CloudEventProto {
  private CloudEventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_CloudEventAttributeValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_CloudEventAttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_AttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "5google/cloud/eventarc/publishing/v1/cloud_event.proto\022#google.cloud.eventarc.p"
          + "ublishing.v1\032\037google/api/field_behavior."
          + "proto\032\031google/protobuf/any.proto\032\037google/protobuf/timestamp.proto\"\374\004\n\n"
          + "CloudEvent\022\017\n"
          + "\002id\030\001 \001(\tB\003\340A\002\022\023\n"
          + "\006source\030\002 \001(\tB\003\340A\002\022\031\n"
          + "\014spec_version\030\003 \001(\tB\003\340A\002\022\021\n"
          + "\004type\030\004 \001(\tB\003\340A\002\022X\n\n"
          + "attributes\030\005 \003(\0132?.google.cloud."
          + "eventarc.publishing.v1.CloudEvent.AttributesEntryB\003\340A\001\022\032\n"
          + "\013binary_data\030\006 \001(\014B\003\340A\001H\000\022\030\n"
          + "\ttext_data\030\007 \001(\tB\003\340A\001H\000\022/\n\n"
          + "proto_data\030\010 \001(\0132\024.google.protobuf.AnyB\003\340A\001H\000\032\323\001\n"
          + "\030CloudEventAttributeValue\022\024\n\n"
          + "ce_boolean\030\001 \001(\010H\000\022\024\n\n"
          + "ce_integer\030\002 \001(\005H\000\022\023\n"
          + "\tce_string\030\003 \001(\tH\000\022\022\n"
          + "\010ce_bytes\030\004 \001(\014H\000\022\020\n"
          + "\006ce_uri\030\005 \001(\tH\000\022\024\n\n"
          + "ce_uri_ref\030\006 \001(\tH\000\0222\n"
          + "\014ce_timestamp\030\007 \001(\0132\032.google.protobuf.TimestampH\000B\006\n"
          + "\004attr\032{\n"
          + "\017AttributesEntry\022\013\n"
          + "\003key\030\001 \001(\t\022W\n"
          + "\005value\030\002 \001(\0132H.google.cloud.eventa"
          + "rc.publishing.v1.CloudEvent.CloudEventAttributeValue:\0028\001B\006\n"
          + "\004dataB\373\001\n"
          + "\'com.google.cloud.eventarc.publishing.v1B\017CloudEvent"
          + "ProtoP\001ZGcloud.google.com/go/eventarc/publishing/apiv1/publishingpb;publishingpb"
          + "\252\002#Google.Cloud.Eventarc.Publishing.V1\312\002"
          + "#Google\\Cloud\\Eventarc\\Publishing\\V1\352\002\'G"
          + "oogle::Cloud::Eventarc::Publishing::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_descriptor,
            new java.lang.String[] {
              "Id",
              "Source",
              "SpecVersion",
              "Type",
              "Attributes",
              "BinaryData",
              "TextData",
              "ProtoData",
              "Data",
            });
    internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_CloudEventAttributeValue_descriptor =
        internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_CloudEventAttributeValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_CloudEventAttributeValue_descriptor,
            new java.lang.String[] {
              "CeBoolean",
              "CeInteger",
              "CeString",
              "CeBytes",
              "CeUri",
              "CeUriRef",
              "CeTimestamp",
              "Attr",
            });
    internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_AttributesEntry_descriptor =
        internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_CloudEvent_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
