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
// source: google/cloud/securitycenter/v2/exfiltration.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public final class ExfiltrationProto {
  private ExfiltrationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Exfiltration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Exfiltration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_ExfilResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_ExfilResource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/securitycenter/v2/exfiltr"
          + "ation.proto\022\036google.cloud.securitycenter"
          + ".v2\"\257\001\n\014Exfiltration\022>\n\007sources\030\001 \003(\0132-."
          + "google.cloud.securitycenter.v2.ExfilReso"
          + "urce\022>\n\007targets\030\002 \003(\0132-.google.cloud.sec"
          + "uritycenter.v2.ExfilResource\022\037\n\027total_ex"
          + "filtrated_bytes\030\003 \001(\003\"1\n\rExfilResource\022\014"
          + "\n\004name\030\001 \001(\t\022\022\n\ncomponents\030\002 \003(\tB\353\001\n\"com"
          + ".google.cloud.securitycenter.v2B\021Exfiltr"
          + "ationProtoP\001ZJcloud.google.com/go/securi"
          + "tycenter/apiv2/securitycenterpb;security"
          + "centerpb\252\002\036Google.Cloud.SecurityCenter.V"
          + "2\312\002\036Google\\Cloud\\SecurityCenter\\V2\352\002!Goo"
          + "gle::Cloud::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v2_Exfiltration_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Exfiltration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Exfiltration_descriptor,
            new java.lang.String[] {
              "Sources", "Targets", "TotalExfiltratedBytes",
            });
    internal_static_google_cloud_securitycenter_v2_ExfilResource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v2_ExfilResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_ExfilResource_descriptor,
            new java.lang.String[] {
              "Name", "Components",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
