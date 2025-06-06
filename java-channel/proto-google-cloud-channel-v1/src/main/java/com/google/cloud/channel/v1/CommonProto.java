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
// source: google/cloud/channel/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_EduData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_EduData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_CloudIdentityInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_CloudIdentityInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Value_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_AdminUser_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_AdminUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "$google/cloud/channel/v1/common.proto\022\027"
          + "google.cloud.channel.v1\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/protobuf/any.proto\"\260\003\n"
          + "\007EduData\022F\n"
          + "\016institute_type\030\001 \001(\0162"
          + "..google.cloud.channel.v1.EduData.InstituteType\022F\n"
          + "\016institute_size\030\002 \001(\0162..google"
          + ".cloud.channel.v1.EduData.InstituteSize\022\017\n"
          + "\007website\030\003 \001(\t\"H\n\r"
          + "InstituteType\022\036\n"
          + "\032INSTITUTE_TYPE_UNSPECIFIED\020\000\022\007\n"
          + "\003K12\020\001\022\016\n\n"
          + "UNIVERSITY\020\002\"\271\001\n\r"
          + "InstituteSize\022\036\n"
          + "\032INSTITUTE_SIZE_UNSPECIFIED\020\000\022\016\n\n"
          + "SIZE_1_100\020\001\022\020\n"
          + "\014SIZE_101_500\020\002\022\021\n\r"
          + "SIZE_501_1000\020\003\022\022\n"
          + "\016SIZE_1001_2000\020\004\022\022\n"
          + "\016SIZE_2001_5000\020\005\022\023\n"
          + "\017SIZE_5001_10000\020\006\022\026\n"
          + "\022SIZE_10001_OR_MORE\020\007\"\200\003\n"
          + "\021CloudIdentityInfo\022N\n\r"
          + "customer_type\030\001 "
          + "\001(\01627.google.cloud.channel.v1.CloudIdentityInfo.CustomerType\022\033\n"
          + "\016primary_domain\030\t \001(\tB\003\340A\003\022\037\n"
          + "\022is_domain_verified\030\004 \001(\010B\003\340A\003\022\027\n"
          + "\017alternate_email\030\006 \001(\t\022\024\n"
          + "\014phone_number\030\007 \001(\t\022\025\n\r"
          + "language_code\030\010 \001(\t\022\036\n"
          + "\021admin_console_uri\030\n"
          + " \001(\tB\003\340A\003\0222\n"
          + "\010edu_data\030\026 \001(\0132 .google.cloud.channel.v1.EduData\"C\n"
          + "\014CustomerType\022\035\n"
          + "\031CUSTOMER_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006DOMAIN\020\001\022\010\n"
          + "\004TEAM\020\002\"\231\001\n"
          + "\005Value\022\025\n"
          + "\013int64_value\030\001 \001(\003H\000\022\026\n"
          + "\014string_value\030\002 \001(\tH\000\022\026\n"
          + "\014double_value\030\003 \001(\001H\000\022+\n"
          + "\013proto_value\030\004 \001(\0132\024.google.protobuf.AnyH\000\022\024\n\n"
          + "bool_value\030\005 \001(\010H\000B\006\n"
          + "\004kind\"C\n"
          + "\tAdminUser\022\r\n"
          + "\005email\030\001 \001(\t\022\022\n\n"
          + "given_name\030\002 \001(\t\022\023\n"
          + "\013family_name\030\003 \001(\tBc\n"
          + "\033com.google.cloud.channel.v1B\013CommonProtoP\001Z5cloud.google.com/go/ch"
          + "annel/apiv1/channelpb;channelpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
            });
    internal_static_google_cloud_channel_v1_EduData_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_EduData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_EduData_descriptor,
            new java.lang.String[] {
              "InstituteType", "InstituteSize", "Website",
            });
    internal_static_google_cloud_channel_v1_CloudIdentityInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_channel_v1_CloudIdentityInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_CloudIdentityInfo_descriptor,
            new java.lang.String[] {
              "CustomerType",
              "PrimaryDomain",
              "IsDomainVerified",
              "AlternateEmail",
              "PhoneNumber",
              "LanguageCode",
              "AdminConsoleUri",
              "EduData",
            });
    internal_static_google_cloud_channel_v1_Value_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_channel_v1_Value_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Value_descriptor,
            new java.lang.String[] {
              "Int64Value", "StringValue", "DoubleValue", "ProtoValue", "BoolValue", "Kind",
            });
    internal_static_google_cloud_channel_v1_AdminUser_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_channel_v1_AdminUser_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_AdminUser_descriptor,
            new java.lang.String[] {
              "Email", "GivenName", "FamilyName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
