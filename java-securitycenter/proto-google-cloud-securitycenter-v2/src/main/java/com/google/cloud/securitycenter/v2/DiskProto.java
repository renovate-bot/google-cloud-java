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
// source: google/cloud/securitycenter/v2/disk.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public final class DiskProto {
  private DiskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Disk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Disk_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/securitycenter/v2/disk.pr"
          + "oto\022\036google.cloud.securitycenter.v2\"\024\n\004D"
          + "isk\022\014\n\004name\030\001 \001(\tB\343\001\n\"com.google.cloud.s"
          + "ecuritycenter.v2B\tDiskProtoP\001ZJcloud.goo"
          + "gle.com/go/securitycenter/apiv2/security"
          + "centerpb;securitycenterpb\252\002\036Google.Cloud"
          + ".SecurityCenter.V2\312\002\036Google\\Cloud\\Securi"
          + "tyCenter\\V2\352\002!Google::Cloud::SecurityCen"
          + "ter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v2_Disk_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Disk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Disk_descriptor,
            new java.lang.String[] {
              "Name",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
