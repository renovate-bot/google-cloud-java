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
// source:
// google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_action_recognition.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLVideoActionRecognitionProto {
  private AutoMLVideoActionRecognitionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n^google/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_video_action_r"
          + "ecognition.proto\0228google.cloud.aiplatfor"
          + "m.v1.schema.trainingjob.definition\"\214\001\n\034A"
          + "utoMlVideoActionRecognition\022l\n\006inputs\030\001 "
          + "\001(\0132\\.google.cloud.aiplatform.v1.schema."
          + "trainingjob.definition.AutoMlVideoAction"
          + "RecognitionInputs\"\252\002\n\"AutoMlVideoActionR"
          + "ecognitionInputs\022z\n\nmodel_type\030\001 \001(\0162f.g"
          + "oogle.cloud.aiplatform.v1.schema.trainin"
          + "gjob.definition.AutoMlVideoActionRecogni"
          + "tionInputs.ModelType\"\207\001\n\tModelType\022\032\n\026MO"
          + "DEL_TYPE_UNSPECIFIED\020\000\022\t\n\005CLOUD\020\001\022\026\n\022MOB"
          + "ILE_VERSATILE_1\020\002\022\035\n\031MOBILE_JETSON_VERSA"
          + "TILE_1\020\003\022\034\n\030MOBILE_CORAL_VERSATILE_1\020\004B\370"
          + "\002\n<com.google.cloud.aiplatform.v1.schema"
          + ".trainingjob.definitionB!AutoMLVideoActi"
          + "onRecognitionProtoP\001Z\\cloud.google.com/g"
          + "o/aiplatform/apiv1/schema/trainingjob/de"
          + "finition/definitionpb;definitionpb\252\0028Goo"
          + "gle.Cloud.AIPlatform.V1.Schema.TrainingJ"
          + "ob.Definition\312\0028Google\\Cloud\\AIPlatform\\"
          + "V1\\Schema\\TrainingJob\\Definition\352\002>Googl"
          + "e::Cloud::AIPlatform::V1::Schema::Traini"
          + "ngJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognition_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_descriptor,
            new java.lang.String[] {
              "ModelType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
