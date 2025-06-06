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
// source: google/cloud/securitycenter/v2/cloud_armor.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public final class CloudArmorProto {
  private CloudArmorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_CloudArmor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_CloudArmor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_SecurityPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_SecurityPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Requests_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Requests_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_AdaptiveProtection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_AdaptiveProtection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Attack_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Attack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "0google/cloud/securitycenter/v2/cloud_a"
          + "rmor.proto\022\036google.cloud.securitycenter.v2\032\036google/protobuf/duration.proto\"\336\002\n\n"
          + "CloudArmor\022G\n"
          + "\017security_policy\030\001 \001(\0132..goo"
          + "gle.cloud.securitycenter.v2.SecurityPolicy\022:\n"
          + "\010requests\030\002 \001(\0132(.google.cloud.securitycenter.v2.Requests\022O\n"
          + "\023adaptive_protection\030\003"
          + " \001(\01322.google.cloud.securitycenter.v2.AdaptiveProtection\0226\n"
          + "\006attack\030\004 \001(\0132&.google.cloud.securitycenter.v2.Attack\022\025\n\r"
          + "threat_vector\030\005 \001(\t\022+\n"
          + "\010duration\030\006 \001(\0132\031.google.protobuf.Duration\"=\n"
          + "\016SecurityPolicy\022\014\n"
          + "\004name\030\001 \001(\t\022\014\n"
          + "\004type\030\002 \001(\t\022\017\n"
          + "\007preview\030\003 \001(\010\"j\n"
          + "\010Requests\022\r\n"
          + "\005ratio\030\001 \001(\001\022\032\n"
          + "\022short_term_allowed\030\002 \001(\005\022\031\n"
          + "\021long_term_allowed\030\003 \001(\005\022\030\n"
          + "\020long_term_denied\030\004 \001(\005\"(\n"
          + "\022AdaptiveProtection\022\022\n\n"
          + "confidence\030\001 \001(\001\"\202\001\n"
          + "\006Attack\022\027\n"
          + "\017volume_pps_long\030\004 \001(\003\022\027\n"
          + "\017volume_bps_long\030\005 \001(\003\022\026\n"
          + "\016classification\030\003 \001(\t\022\026\n\n"
          + "volume_pps\030\001 \001(\005B\002\030\001\022\026\n\n"
          + "volume_bps\030\002 \001(\005B\002\030\001B\351\001\n"
          + "\"com.google.cloud.securitycenter.v2B\017CloudArmorProtoP\001ZJcloud.g"
          + "oogle.com/go/securitycenter/apiv2/securi"
          + "tycenterpb;securitycenterpb\252\002\036Google.Clo"
          + "ud.SecurityCenter.V2\312\002\036Google\\Cloud\\Secu"
          + "rityCenter\\V2\352\002!Google::Cloud::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_CloudArmor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_CloudArmor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_CloudArmor_descriptor,
            new java.lang.String[] {
              "SecurityPolicy",
              "Requests",
              "AdaptiveProtection",
              "Attack",
              "ThreatVector",
              "Duration",
            });
    internal_static_google_cloud_securitycenter_v2_SecurityPolicy_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v2_SecurityPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_SecurityPolicy_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Preview",
            });
    internal_static_google_cloud_securitycenter_v2_Requests_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_securitycenter_v2_Requests_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Requests_descriptor,
            new java.lang.String[] {
              "Ratio", "ShortTermAllowed", "LongTermAllowed", "LongTermDenied",
            });
    internal_static_google_cloud_securitycenter_v2_AdaptiveProtection_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_securitycenter_v2_AdaptiveProtection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_AdaptiveProtection_descriptor,
            new java.lang.String[] {
              "Confidence",
            });
    internal_static_google_cloud_securitycenter_v2_Attack_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_securitycenter_v2_Attack_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Attack_descriptor,
            new java.lang.String[] {
              "VolumePpsLong", "VolumeBpsLong", "Classification", "VolumePps", "VolumeBps",
            });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
