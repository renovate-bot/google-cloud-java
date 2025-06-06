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
// source: google/cloud/securitycenter/v1p1beta1/organization_settings.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v1p1beta1;

public final class OrganizationSettingsOuterClass {
  private OrganizationSettingsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/securitycenter/v1p1beta1/"
          + "organization_settings.proto\022%google.clou"
          + "d.securitycenter.v1p1beta1\032\031google/api/r"
          + "esource.proto\"\254\004\n\024OrganizationSettings\022\014"
          + "\n\004name\030\001 \001(\t\022\036\n\026enable_asset_discovery\030\002"
          + " \001(\010\022p\n\026asset_discovery_config\030\003 \001(\0132P.g"
          + "oogle.cloud.securitycenter.v1p1beta1.Org"
          + "anizationSettings.AssetDiscoveryConfig\032\207"
          + "\002\n\024AssetDiscoveryConfig\022\023\n\013project_ids\030\001"
          + " \003(\t\022v\n\016inclusion_mode\030\002 \001(\0162^.google.cl"
          + "oud.securitycenter.v1p1beta1.Organizatio"
          + "nSettings.AssetDiscoveryConfig.Inclusion"
          + "Mode\022\022\n\nfolder_ids\030\003 \003(\t\"N\n\rInclusionMod"
          + "e\022\036\n\032INCLUSION_MODE_UNSPECIFIED\020\000\022\020\n\014INC"
          + "LUDE_ONLY\020\001\022\013\n\007EXCLUDE\020\002:j\352Ag\n2securityc"
          + "enter.googleapis.com/OrganizationSetting"
          + "s\0221organizations/{organization}/organiza"
          + "tionSettingsB\373\001\n)com.google.cloud.securi"
          + "tycenter.v1p1beta1P\001ZQcloud.google.com/g"
          + "o/securitycenter/apiv1p1beta1/securityce"
          + "nterpb;securitycenterpb\252\002%Google.Cloud.S"
          + "ecurityCenter.V1P1Beta1\312\002%Google\\Cloud\\S"
          + "ecurityCenter\\V1p1beta1\352\002(Google::Cloud:"
          + ":SecurityCenter::V1p1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_descriptor,
            new java.lang.String[] {
              "Name", "EnableAssetDiscovery", "AssetDiscoveryConfig",
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor =
        internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor,
            new java.lang.String[] {
              "ProjectIds", "InclusionMode", "FolderIds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
