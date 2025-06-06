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
// source: google/cloud/netapp/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_LocationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_LocationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "#google/cloud/netapp/v1/common.proto\022\026g"
          + "oogle.cloud.netapp.v1\032\037google/api/field_behavior.proto\"\261\001\n"
          + "\020LocationMetadata\022K\n"
          + "\030supported_service_levels\030\001"
          + " \003(\0162$.google.cloud.netapp.v1.ServiceLevelB\003\340A\003\022P\n"
          + "\032supported_flex_performance\030\002"
          + " \003(\0162\'.google.cloud.netapp.v1.FlexPerformanceB\003\340A\003*_\n"
          + "\014ServiceLevel\022\035\n"
          + "\031SERVICE_LEVEL_UNSPECIFIED\020\000\022\013\n"
          + "\007PREMIUM\020\001\022\013\n"
          + "\007EXTREME\020\002\022\014\n"
          + "\010STANDARD\020\003\022\010\n"
          + "\004FLEX\020\004*n\n"
          + "\017FlexPerformance\022 \n"
          + "\034FLEX_PERFORMANCE_UNSPECIFIED\020\000\022\034\n"
          + "\030FLEX_PERFORMANCE_DEFAULT\020\001\022\033\n"
          + "\027FLEX_PERFORMANCE_CUSTOM\020\002*U\n"
          + "\016EncryptionType\022\037\n"
          + "\033ENCRYPTION_TYPE_UNSPECIFIED\020\000\022\023\n"
          + "\017SERVICE_MANAGED\020\001\022\r\n"
          + "\tCLOUD_KMS\020\002*T\n"
          + "\024DirectoryServiceType\022&\n"
          + "\"DIRECTORY_SERVICE_TYPE_UNSPECIFIED\020\000\022\024\n"
          + "\020ACTIVE_DIRECTORY\020\001B\255\001\n"
          + "\032com.google.cloud.netapp.v1B\013CommonProtoP\001Z2cloud.google.com"
          + "/go/netapp/apiv1/netapppb;netapppb\252\002\026Goo"
          + "gle.Cloud.NetApp.V1\312\002\026Google\\Cloud\\NetAp"
          + "p\\V1\352\002\031Google::Cloud::NetApp::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_netapp_v1_LocationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_LocationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_LocationMetadata_descriptor,
            new java.lang.String[] {
              "SupportedServiceLevels", "SupportedFlexPerformance",
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
