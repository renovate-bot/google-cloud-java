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
// source: google/cloud/tasks/v2beta2/target.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tasks.v2beta2;

public final class TargetProto {
  private TargetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_PullTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_PullTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_PullMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_HttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_HttpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_HttpRequest_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_HttpRequest_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_PathOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_PathOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_QueryOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_QueryOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_UriOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_UriOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_HttpTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_HttpTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_HttpTarget_Header_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_HttpTarget_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_HttpTarget_HeaderOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_HttpTarget_HeaderOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_OAuthToken_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_OAuthToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_OidcToken_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_OidcToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "\'google/cloud/tasks/v2beta2/target.prot"
          + "o\022\032google.cloud.tasks.v2beta2\032\037google/api/field_behavior.proto\"\014\n\n"
          + "PullTarget\"+\n"
          + "\013PullMessage\022\017\n"
          + "\007payload\030\001 \001(\014\022\013\n"
          + "\003tag\030\002 \001(\t\"h\n"
          + "\023AppEngineHttpTarget\022Q\n"
          + "\033app_engine_routing_override\030\001"
          + " \001(\0132,.google.cloud.tasks.v2beta2.AppEngineRouting\"\304\002\n"
          + "\024AppEngineHttpRequest\022;\n"
          + "\013http_method\030\001 \001(\0162&.google.cloud.tasks.v2beta2.HttpMethod\022H\n"
          + "\022app_engine_routing\030\002"
          + " \001(\0132,.google.cloud.tasks.v2beta2.AppEngineRouting\022\024\n"
          + "\014relative_url\030\003 \001(\t\022N\n"
          + "\007headers\030\004 \003(\0132=.google.clou"
          + "d.tasks.v2beta2.AppEngineHttpRequest.HeadersEntry\022\017\n"
          + "\007payload\030\005 \001(\014\032.\n"
          + "\014HeadersEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"T\n"
          + "\020AppEngineRouting\022\017\n"
          + "\007service\030\001 \001(\t\022\017\n"
          + "\007version\030\002 \001(\t\022\020\n"
          + "\010instance\030\003 \001(\t\022\014\n"
          + "\004host\030\004 \001(\t\"\365\002\n"
          + "\013HttpRequest\022\020\n"
          + "\003url\030\001 \001(\tB\003\340A\002\022;\n"
          + "\013http_method\030\002 \001(\0162&.google.cloud.tasks.v2beta2.HttpMethod\022E\n"
          + "\007headers\030\003 \003(\01324.googl"
          + "e.cloud.tasks.v2beta2.HttpRequest.HeadersEntry\022\014\n"
          + "\004body\030\004 \001(\014\022=\n"
          + "\013oauth_token\030\005 \001("
          + "\0132&.google.cloud.tasks.v2beta2.OAuthTokenH\000\022;\n\n"
          + "oidc_token\030\006 \001(\0132%.google.cloud.tasks.v2beta2.OidcTokenH\000\032.\n"
          + "\014HeadersEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001B\026\n"
          + "\024authorization_header\"\034\n"
          + "\014PathOverride\022\014\n"
          + "\004path\030\001 \001(\t\"%\n\r"
          + "QueryOverride\022\024\n"
          + "\014query_params\030\001 \001(\t\"\227\004\n"
          + "\013UriOverride\022C\n"
          + "\006scheme\030\001 \001(\0162.."
          + "google.cloud.tasks.v2beta2.UriOverride.SchemeH\000\210\001\001\022\021\n"
          + "\004host\030\002 \001(\tH\001\210\001\001\022\021\n"
          + "\004port\030\003 \001(\003H\002\210\001\001\022?\n\r"
          + "path_override\030\004 \001(\0132(.google.cloud.tasks.v2beta2.PathOverride\022A\n"
          + "\016query_override\030\005 \001(\0132).google.cloud.tasks.v2beta2.QueryOverride\022a\n"
          + "\031uri_override_enforce_mode\030\006 \001(\0162>.google.cloud.tasks.v2b"
          + "eta2.UriOverride.UriOverrideEnforceMode\"5\n"
          + "\006Scheme\022\026\n"
          + "\022SCHEME_UNSPECIFIED\020\000\022\010\n"
          + "\004HTTP\020\001\022\t\n"
          + "\005HTTPS\020\002\"b\n"
          + "\026UriOverrideEnforceMode\022)\n"
          + "%URI_OVERRIDE_ENFORCE_MODE_UNSPECIFIED\020\000\022\021\n\r"
          + "IF_NOT_EXISTS\020\001\022\n\n"
          + "\006ALWAYS\020\002B\t\n"
          + "\007_schemeB\007\n"
          + "\005_hostB\007\n"
          + "\005_port\"\344\003\n\n"
          + "HttpTarget\022=\n"
          + "\014uri_override\030\001 \001(\0132\'.google.cloud.tasks.v2beta2.UriOverride\022;\n"
          + "\013http_method\030\002 \001(\0162&.google.cloud.tasks.v2beta2.HttpMethod\022O\n"
          + "\020header_overrides\030\003 \003(\01325.google.cl"
          + "oud.tasks.v2beta2.HttpTarget.HeaderOverride\022=\n"
          + "\013oauth_token\030\005"
          + " \001(\0132&.google.cloud.tasks.v2beta2.OAuthTokenH\000\022;\n\n"
          + "oidc_token\030\006 \001(\0132%.google.cloud.tasks.v2beta2.OidcTokenH\000\032$\n"
          + "\006Header\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t\032O\n"
          + "\016HeaderOverride\022=\n"
          + "\006header\030\001 \001(\0132-.google.cloud.tasks.v2beta2.HttpTarget.HeaderB\026\n"
          + "\024authorization_header\":\n\n"
          + "OAuthToken\022\035\n"
          + "\025service_account_email\030\001 \001(\t\022\r\n"
          + "\005scope\030\002 \001(\t\"<\n"
          + "\tOidcToken\022\035\n"
          + "\025service_account_email\030\001 \001(\t\022\020\n"
          + "\010audience\030\002 \001(\t*s\n\n"
          + "HttpMethod\022\033\n"
          + "\027HTTP_METHOD_UNSPECIFIED\020\000\022\010\n"
          + "\004POST\020\001\022\007\n"
          + "\003GET\020\002\022\010\n"
          + "\004HEAD\020\003\022\007\n"
          + "\003PUT\020\004\022\n\n"
          + "\006DELETE\020\005\022\t\n"
          + "\005PATCH\020\006\022\013\n"
          + "\007OPTIONS\020\007Bt\n"
          + "\036com.google.cloud.tasks.v2beta2B\013TargetProtoP\001ZC"
          + "cloud.google.com/go/cloudtasks/apiv2beta2/cloudtaskspb;cloudtaskspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2beta2_PullTarget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta2_PullTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_PullTarget_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta2_PullMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor,
            new java.lang.String[] {
              "Payload", "Tag",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor,
            new java.lang.String[] {
              "AppEngineRoutingOverride",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor,
            new java.lang.String[] {
              "HttpMethod", "AppEngineRouting", "RelativeUrl", "Headers", "Payload",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_descriptor =
        internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_descriptor,
            new java.lang.String[] {
              "Service", "Version", "Instance", "Host",
            });
    internal_static_google_cloud_tasks_v2beta2_HttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_tasks_v2beta2_HttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_HttpRequest_descriptor,
            new java.lang.String[] {
              "Url",
              "HttpMethod",
              "Headers",
              "Body",
              "OauthToken",
              "OidcToken",
              "AuthorizationHeader",
            });
    internal_static_google_cloud_tasks_v2beta2_HttpRequest_HeadersEntry_descriptor =
        internal_static_google_cloud_tasks_v2beta2_HttpRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_tasks_v2beta2_HttpRequest_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_HttpRequest_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_tasks_v2beta2_PathOverride_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_tasks_v2beta2_PathOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_PathOverride_descriptor,
            new java.lang.String[] {
              "Path",
            });
    internal_static_google_cloud_tasks_v2beta2_QueryOverride_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_tasks_v2beta2_QueryOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_QueryOverride_descriptor,
            new java.lang.String[] {
              "QueryParams",
            });
    internal_static_google_cloud_tasks_v2beta2_UriOverride_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_tasks_v2beta2_UriOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_UriOverride_descriptor,
            new java.lang.String[] {
              "Scheme", "Host", "Port", "PathOverride", "QueryOverride", "UriOverrideEnforceMode",
            });
    internal_static_google_cloud_tasks_v2beta2_HttpTarget_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_tasks_v2beta2_HttpTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_HttpTarget_descriptor,
            new java.lang.String[] {
              "UriOverride",
              "HttpMethod",
              "HeaderOverrides",
              "OauthToken",
              "OidcToken",
              "AuthorizationHeader",
            });
    internal_static_google_cloud_tasks_v2beta2_HttpTarget_Header_descriptor =
        internal_static_google_cloud_tasks_v2beta2_HttpTarget_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_tasks_v2beta2_HttpTarget_Header_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_HttpTarget_Header_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_tasks_v2beta2_HttpTarget_HeaderOverride_descriptor =
        internal_static_google_cloud_tasks_v2beta2_HttpTarget_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_tasks_v2beta2_HttpTarget_HeaderOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_HttpTarget_HeaderOverride_descriptor,
            new java.lang.String[] {
              "Header",
            });
    internal_static_google_cloud_tasks_v2beta2_OAuthToken_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_tasks_v2beta2_OAuthToken_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_OAuthToken_descriptor,
            new java.lang.String[] {
              "ServiceAccountEmail", "Scope",
            });
    internal_static_google_cloud_tasks_v2beta2_OidcToken_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_tasks_v2beta2_OidcToken_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_OidcToken_descriptor,
            new java.lang.String[] {
              "ServiceAccountEmail", "Audience",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
