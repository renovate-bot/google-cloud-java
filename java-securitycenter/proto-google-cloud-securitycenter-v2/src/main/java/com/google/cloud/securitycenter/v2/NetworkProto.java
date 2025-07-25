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
// source: google/cloud/securitycenter/v2/network.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public final class NetworkProto {
  private NetworkProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Network_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Network_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v2/network"
          + ".proto\022\036google.cloud.securitycenter.v2\"\027"
          + "\n\007Network\022\014\n\004name\030\001 \001(\tB\346\001\n\"com.google.c"
          + "loud.securitycenter.v2B\014NetworkProtoP\001ZJ"
          + "cloud.google.com/go/securitycenter/apiv2"
          + "/securitycenterpb;securitycenterpb\252\002\036Goo"
          + "gle.Cloud.SecurityCenter.V2\312\002\036Google\\Clo"
          + "ud\\SecurityCenter\\V2\352\002!Google::Cloud::Se"
          + "curityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v2_Network_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Network_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Network_descriptor,
            new java.lang.String[] {
              "Name",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
