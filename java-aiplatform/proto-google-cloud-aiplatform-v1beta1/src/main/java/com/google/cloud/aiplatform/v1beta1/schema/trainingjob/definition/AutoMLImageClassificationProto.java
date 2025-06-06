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
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_classification.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLImageClassificationProto {
  private AutoMLImageClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n_google/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_image_cla"
          + "ssification.proto\022=google.cloud.aiplatfo"
          + "rm.v1beta1.schema.trainingjob.definition"
          + "\"\377\001\n\031AutoMlImageClassification\022n\n\006inputs"
          + "\030\001 \001(\0132^.google.cloud.aiplatform.v1beta1"
          + ".schema.trainingjob.definition.AutoMlIma"
          + "geClassificationInputs\022r\n\010metadata\030\002 \001(\013"
          + "2`.google.cloud.aiplatform.v1beta1.schem"
          + "a.trainingjob.definition.AutoMlImageClas"
          + "sificationMetadata\"\230\003\n\037AutoMlImageClassi"
          + "ficationInputs\022|\n\nmodel_type\030\001 \001(\0162h.goo"
          + "gle.cloud.aiplatform.v1beta1.schema.trai"
          + "ningjob.definition.AutoMlImageClassifica"
          + "tionInputs.ModelType\022\025\n\rbase_model_id\030\002 "
          + "\001(\t\022\037\n\027budget_milli_node_hours\030\003 \001(\003\022\036\n\026"
          + "disable_early_stopping\030\004 \001(\010\022\023\n\013multi_la"
          + "bel\030\005 \001(\010\"\211\001\n\tModelType\022\032\n\026MODEL_TYPE_UN"
          + "SPECIFIED\020\000\022\t\n\005CLOUD\020\001\022\033\n\027MOBILE_TF_LOW_"
          + "LATENCY_1\020\002\022\031\n\025MOBILE_TF_VERSATILE_1\020\003\022\035"
          + "\n\031MOBILE_TF_HIGH_ACCURACY_1\020\004\"\303\002\n!AutoMl"
          + "ImageClassificationMetadata\022\035\n\025cost_mill"
          + "i_node_hours\030\001 \001(\003\022\225\001\n\026successful_stop_r"
          + "eason\030\002 \001(\0162u.google.cloud.aiplatform.v1"
          + "beta1.schema.trainingjob.definition.Auto"
          + "MlImageClassificationMetadata.Successful"
          + "StopReason\"g\n\024SuccessfulStopReason\022&\n\"SU"
          + "CCESSFUL_STOP_REASON_UNSPECIFIED\020\000\022\022\n\016BU"
          + "DGET_REACHED\020\001\022\023\n\017MODEL_CONVERGED\020\002B\216\003\nA"
          + "com.google.cloud.aiplatform.v1beta1.sche"
          + "ma.trainingjob.definitionB\036AutoMLImageCl"
          + "assificationProtoP\001Zacloud.google.com/go"
          + "/aiplatform/apiv1beta1/schema/trainingjo"
          + "b/definition/definitionpb;definitionpb\252\002"
          + "=Google.Cloud.AIPlatform.V1Beta1.Schema."
          + "TrainingJob.Definition\312\002=Google\\Cloud\\AI"
          + "Platform\\V1beta1\\Schema\\TrainingJob\\Defi"
          + "nition\352\002CGoogle::Cloud::AIPlatform::V1be"
          + "ta1::Schema::TrainingJob::Definitionb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassification_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassification_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationInputs_descriptor,
            new java.lang.String[] {
              "ModelType",
              "BaseModelId",
              "BudgetMilliNodeHours",
              "DisableEarlyStopping",
              "MultiLabel",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor,
            new java.lang.String[] {
              "CostMilliNodeHours", "SuccessfulStopReason",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
