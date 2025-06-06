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
// source: google/cloud/talent/v4/tenant.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.talent.v4;

public final class TenantProto {
  private TenantProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Tenant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Tenant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/talent/v4/tenant.proto\022\026g"
          + "oogle.cloud.talent.v4\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\"v\n\006Tenant\022\014\n\004name\030\001 \001(\t\022\030\n\013external_id"
          + "\030\002 \001(\tB\003\340A\002:D\352AA\n\032jobs.googleapis.com/Te"
          + "nant\022#projects/{project}/tenants/{tenant"
          + "}Be\n\032com.google.cloud.talent.v4B\013TenantP"
          + "rotoP\001Z2cloud.google.com/go/talent/apiv4"
          + "/talentpb;talentpb\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_Tenant_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_Tenant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Tenant_descriptor,
            new java.lang.String[] {
              "Name", "ExternalId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
