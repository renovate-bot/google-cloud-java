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
// source: google/cloud/aiplatform/v1/reasoning_engine.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public final class ReasoningEngineProto {
  private ReasoningEngineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_PackageSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_PackageSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_DeploymentSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_DeploymentSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ReasoningEngine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReasoningEngine_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/reasoning_e"
          + "ngine.proto\022\032google.cloud.aiplatform.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032(google/cloud/aiplat"
          + "form/v1/env_var.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\374\004\n\023ReasoningEngineSpec\022!\n\017service_"
          + "account\030\001 \001(\tB\003\340A\001H\000\210\001\001\022V\n\014package_spec\030"
          + "\002 \001(\0132;.google.cloud.aiplatform.v1.Reaso"
          + "ningEngineSpec.PackageSpecB\003\340A\001\022\\\n\017deplo"
          + "yment_spec\030\004 \001(\0132>.google.cloud.aiplatfo"
          + "rm.v1.ReasoningEngineSpec.DeploymentSpec"
          + "B\003\340A\001\0223\n\rclass_methods\030\003 \003(\0132\027.google.pr"
          + "otobuf.StructB\003\340A\001\022\034\n\017agent_framework\030\005 "
          + "\001(\tB\003\340A\001\032\230\001\n\013PackageSpec\022\"\n\025pickle_objec"
          + "t_gcs_uri\030\001 \001(\tB\003\340A\001\022%\n\030dependency_files"
          + "_gcs_uri\030\002 \001(\tB\003\340A\001\022!\n\024requirements_gcs_"
          + "uri\030\003 \001(\tB\003\340A\001\022\033\n\016python_version\030\004 \001(\tB\003"
          + "\340A\001\032\211\001\n\016DeploymentSpec\0224\n\003env\030\001 \003(\0132\".go"
          + "ogle.cloud.aiplatform.v1.EnvVarB\003\340A\001\022A\n\n"
          + "secret_env\030\002 \003(\0132(.google.cloud.aiplatfo"
          + "rm.v1.SecretEnvVarB\003\340A\001B\022\n\020_service_acco"
          + "unt\"\276\003\n\017ReasoningEngine\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\010\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\030\n\013descrip"
          + "tion\030\007 \001(\tB\003\340A\001\022B\n\004spec\030\003 \001(\0132/.google.c"
          + "loud.aiplatform.v1.ReasoningEngineSpecB\003"
          + "\340A\001\0224\n\013create_time\030\004 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\0224\n\013update_time\030\005 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\022\021\n\004etag\030"
          + "\006 \001(\tB\003\340A\001:\237\001\352A\233\001\n)aiplatform.googleapis"
          + ".com/ReasoningEngine\022Kprojects/{project}"
          + "/locations/{location}/reasoningEngines/{"
          + "reasoning_engine}*\020reasoningEngines2\017rea"
          + "soningEngineB\322\001\n\036com.google.cloud.aiplat"
          + "form.v1B\024ReasoningEngineProtoP\001Z>cloud.g"
          + "oogle.com/go/aiplatform/apiv1/aiplatform"
          + "pb;aiplatformpb\252\002\032Google.Cloud.AIPlatfor"
          + "m.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Goog"
          + "le::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_descriptor,
            new java.lang.String[] {
              "ServiceAccount", "PackageSpec", "DeploymentSpec", "ClassMethods", "AgentFramework",
            });
    internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_PackageSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_PackageSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_PackageSpec_descriptor,
            new java.lang.String[] {
              "PickleObjectGcsUri", "DependencyFilesGcsUri", "RequirementsGcsUri", "PythonVersion",
            });
    internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_DeploymentSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_DeploymentSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ReasoningEngineSpec_DeploymentSpec_descriptor,
            new java.lang.String[] {
              "Env", "SecretEnv",
            });
    internal_static_google_cloud_aiplatform_v1_ReasoningEngine_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ReasoningEngine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ReasoningEngine_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "Spec", "CreateTime", "UpdateTime", "Etag",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
