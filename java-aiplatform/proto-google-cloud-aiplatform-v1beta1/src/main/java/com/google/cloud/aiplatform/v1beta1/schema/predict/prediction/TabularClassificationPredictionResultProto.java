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
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/tabular_classification.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class TabularClassificationPredictionResultProto {
  private TabularClassificationPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nVgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/prediction/tabular_classificati"
          + "on.proto\0229google.cloud.aiplatform.v1beta"
          + "1.schema.predict.prediction\"H\n%TabularCl"
          + "assificationPredictionResult\022\017\n\007classes\030"
          + "\001 \003(\t\022\016\n\006scores\030\002 \003(\002B\206\003\n=com.google.clo"
          + "ud.aiplatform.v1beta1.schema.predict.pre"
          + "dictionB*TabularClassificationPrediction"
          + "ResultProtoP\001Z]cloud.google.com/go/aipla"
          + "tform/apiv1beta1/schema/predict/predicti"
          + "on/predictionpb;predictionpb\252\0029Google.Cl"
          + "oud.AIPlatform.V1Beta1.Schema.Predict.Pr"
          + "ediction\312\0029Google\\Cloud\\AIPlatform\\V1bet"
          + "a1\\Schema\\Predict\\Prediction\352\002?Google::C"
          + "loud::AIPlatform::V1beta1::Schema::Predi"
          + "ct::Predictionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor,
            new java.lang.String[] {
              "Classes", "Scores",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
