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
// source: google/appengine/v1/network_settings.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public final class NetworkSettingsProto {
  private NetworkSettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_NetworkSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_NetworkSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/appengine/v1/network_settings.p"
          + "roto\022\023google.appengine.v1\"\252\002\n\017NetworkSet"
          + "tings\022[\n\027ingress_traffic_allowed\030\001 \001(\0162:"
          + ".google.appengine.v1.NetworkSettings.Ing"
          + "ressTrafficAllowed\"\271\001\n\025IngressTrafficAll"
          + "owed\022\'\n#INGRESS_TRAFFIC_ALLOWED_UNSPECIF"
          + "IED\020\000\022\037\n\033INGRESS_TRAFFIC_ALLOWED_ALL\020\001\022)"
          + "\n%INGRESS_TRAFFIC_ALLOWED_INTERNAL_ONLY\020"
          + "\002\022+\n\'INGRESS_TRAFFIC_ALLOWED_INTERNAL_AN"
          + "D_LB\020\003B\305\001\n\027com.google.appengine.v1B\024Netw"
          + "orkSettingsProtoP\001Z;cloud.google.com/go/"
          + "appengine/apiv1/appenginepb;appenginepb\252"
          + "\002\031Google.Cloud.AppEngine.V1\312\002\031Google\\Clo"
          + "ud\\AppEngine\\V1\352\002\034Google::Cloud::AppEngi"
          + "ne::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_appengine_v1_NetworkSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_NetworkSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_NetworkSettings_descriptor,
            new java.lang.String[] {
              "IngressTrafficAllowed",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
