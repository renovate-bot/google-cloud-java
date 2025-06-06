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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.clouderrorreporting.v1beta1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_TrackingIssue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_TrackingIssue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "8google/devtools/clouderrorreporting/v1beta1/common.proto\022+google.devtools.clou"
          + "derrorreporting.v1beta1\032\031google/api/reso"
          + "urce.proto\032\037google/protobuf/timestamp.proto\"\262\002\n\n"
          + "ErrorGroup\022\014\n"
          + "\004name\030\001 \001(\t\022\020\n"
          + "\010group_id\030\002 \001(\t\022S\n"
          + "\017tracking_issues\030\003 \003(\0132:.go"
          + "ogle.devtools.clouderrorreporting.v1beta1.TrackingIssue\022X\n"
          + "\021resolution_status\030\005 \001"
          + "(\0162=.google.devtools.clouderrorreporting.v1beta1.ResolutionStatus:U\352AR\n"
          + "-clouderr"
          + "orreporting.googleapis.com/ErrorGroup\022!projects/{project}/groups/{group}\"\034\n\r"
          + "TrackingIssue\022\013\n"
          + "\003url\030\001 \001(\t\"\357\001\n\n"
          + "ErrorEvent\022.\n"
          + "\n"
          + "event_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022T\n"
          + "\017service_context\030\002 \001(\0132;.google."
          + "devtools.clouderrorreporting.v1beta1.ServiceContext\022\017\n"
          + "\007message\030\003 \001(\t\022J\n"
          + "\007context\030\005"
          + " \001(\01329.google.devtools.clouderrorreporting.v1beta1.ErrorContext\"I\n"
          + "\016ServiceContext\022\017\n"
          + "\007service\030\002 \001(\t\022\017\n"
          + "\007version\030\003 \001(\t\022\025\n\r"
          + "resource_type\030\004 \001(\t\"\311\001\n"
          + "\014ErrorContext\022U\n"
          + "\014http_request\030\001 \001(\0132?.google.devtools.clo"
          + "uderrorreporting.v1beta1.HttpRequestContext\022\014\n"
          + "\004user\030\002 \001(\t\022T\n"
          + "\017report_location\030\003 \001"
          + "(\0132;.google.devtools.clouderrorreporting.v1beta1.SourceLocation\"\210\001\n"
          + "\022HttpRequestContext\022\016\n"
          + "\006method\030\001 \001(\t\022\013\n"
          + "\003url\030\002 \001(\t\022\022\n\n"
          + "user_agent\030\003 \001(\t\022\020\n"
          + "\010referrer\030\004 \001(\t\022\034\n"
          + "\024response_status_code\030\005 \001(\005\022\021\n"
          + "\tremote_ip\030\006 \001(\t\"O\n"
          + "\016SourceLocation\022\021\n"
          + "\tfile_path\030\001 \001(\t\022\023\n"
          + "\013line_number\030\002 \001(\005\022\025\n\r"
          + "function_name\030\004 \001(\t*j\n"
          + "\020ResolutionStatus\022!\n"
          + "\035RESOLUTION_STATUS_UNSPECIFIED\020\000\022\010\n"
          + "\004OPEN\020\001\022\020\n"
          + "\014ACKNOWLEDGED\020\002\022\014\n"
          + "\010RESOLVED\020\003\022\t\n"
          + "\005MUTED\020\004B\211\002\n"
          + "/com.google.devtools.clouderrorreporting.v1be"
          + "ta1B\013CommonProtoP\001ZOcloud.google.com/go/errorreporting/apiv1beta1/errorreporting"
          + "pb;errorreportingpb\370\001\001\252\002#Google.Cloud.Er"
          + "rorReporting.V1Beta1\312\002#Google\\Cloud\\Erro"
          + "rReporting\\V1beta1\352\002&Google::Cloud::ErrorReporting::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroup_descriptor,
            new java.lang.String[] {
              "Name", "GroupId", "TrackingIssues", "ResolutionStatus",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_TrackingIssue_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_clouderrorreporting_v1beta1_TrackingIssue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_TrackingIssue_descriptor,
            new java.lang.String[] {
              "Url",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorEvent_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorEvent_descriptor,
            new java.lang.String[] {
              "EventTime", "ServiceContext", "Message", "Context",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_descriptor,
            new java.lang.String[] {
              "Service", "Version", "ResourceType",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorContext_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorContext_descriptor,
            new java.lang.String[] {
              "HttpRequest", "User", "ReportLocation",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_descriptor,
            new java.lang.String[] {
              "Method", "Url", "UserAgent", "Referrer", "ResponseStatusCode", "RemoteIp",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor,
            new java.lang.String[] {
              "FilePath", "LineNumber", "FunctionName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
