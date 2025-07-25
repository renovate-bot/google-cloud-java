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
// source: google/ads/admanager/v1/geo_target_messages.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public final class GeoTargetMessagesProto {
  private GeoTargetMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_GeoTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GeoTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "1google/ads/admanager/v1/geo_target_mes"
          + "sages.proto\022\027google.ads.admanager.v1\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/api/resource.proto\"\270\003\n"
          + "\tGeoTarget\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\036\n"
          + "\014display_name\030\002 \001(\tB\003\340A\003H\000\210\001\001\022I\n"
          + "\020canonical_parent\030\003 \001(\tB*\340A\003\372A$\n"
          + "\"admanager.googleapis.com/GeoTargetH\001\210\001\001\022\031\n"
          + "\014parent_names\030\004 \003(\tB\003\340A\003\022\035\n"
          + "\013region_code\030\005 \001(\tB\003\340A\003H\002\210\001\001\022\026\n"
          + "\004type\030\006 \001(\tB\003\340A\003H\003\210\001\001\022\034\n\n"
          + "targetable\030\007 \001(\010B\003\340A\003H\004\210\001\001:o\352Al\n"
          + "\"adman"
          + "ager.googleapis.com/GeoTarget\022/networks/{network_code}/geoTargets/{geo_target}*\n"
          + "geoTargets2\tgeoTargetB\017\n\r"
          + "_display_nameB\023\n"
          + "\021_canonical_parentB\016\n"
          + "\014_region_codeB\007\n"
          + "\005_typeB\r\n"
          + "\013_targetableB\312\001\n"
          + "\033com.google.ads.admanager.v1B\026GeoTargetMessagesProtoP\001Z@g"
          + "oogle.golang.org/genproto/googleapis/ads"
          + "/admanager/v1;admanager\252\002\027Google.Ads.AdM"
          + "anager.V1\312\002\027Google\\Ads\\AdManager\\V1\352\002\032Go"
          + "ogle::Ads::AdManager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_GeoTarget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_GeoTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_GeoTarget_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "CanonicalParent",
              "ParentNames",
              "RegionCode",
              "Type",
              "Targetable",
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
