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
// source: google/cloud/automl/v1beta1/model_evaluation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public final class ModelEvaluationOuterClass {
  private ModelEvaluationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ModelEvaluation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/automl/v1beta1/model_eval"
          + "uation.proto\022\033google.cloud.automl.v1beta"
          + "1\032\031google/api/resource.proto\0320google/clo"
          + "ud/automl/v1beta1/classification.proto\032+"
          + "google/cloud/automl/v1beta1/detection.pr"
          + "oto\032,google/cloud/automl/v1beta1/regress"
          + "ion.proto\032(google/cloud/automl/v1beta1/t"
          + "ables.proto\0321google/cloud/automl/v1beta1"
          + "/text_extraction.proto\0320google/cloud/aut"
          + "oml/v1beta1/text_sentiment.proto\032-google"
          + "/cloud/automl/v1beta1/translation.proto\032"
          + "\037google/protobuf/timestamp.proto\"\261\010\n\017Mod"
          + "elEvaluation\022i\n!classification_evaluatio"
          + "n_metrics\030\010 \001(\0132<.google.cloud.automl.v1"
          + "beta1.ClassificationEvaluationMetricsH\000\022"
          + "a\n\035regression_evaluation_metrics\030\030 \001(\01328"
          + ".google.cloud.automl.v1beta1.RegressionE"
          + "valuationMetricsH\000\022c\n\036translation_evalua"
          + "tion_metrics\030\t \001(\01329.google.cloud.automl"
          + ".v1beta1.TranslationEvaluationMetricsH\000\022"
          + "w\n)image_object_detection_evaluation_met"
          + "rics\030\014 \001(\0132B.google.cloud.automl.v1beta1"
          + ".ImageObjectDetectionEvaluationMetricsH\000"
          + "\022u\n(video_object_tracking_evaluation_met"
          + "rics\030\016 \001(\0132A.google.cloud.automl.v1beta1"
          + ".VideoObjectTrackingEvaluationMetricsH\000\022"
          + "h\n!text_sentiment_evaluation_metrics\030\013 \001"
          + "(\0132;.google.cloud.automl.v1beta1.TextSen"
          + "timentEvaluationMetricsH\000\022j\n\"text_extrac"
          + "tion_evaluation_metrics\030\r \001(\0132<.google.c"
          + "loud.automl.v1beta1.TextExtractionEvalua"
          + "tionMetricsH\000\022\014\n\004name\030\001 \001(\t\022\032\n\022annotatio"
          + "n_spec_id\030\002 \001(\t\022\024\n\014display_name\030\017 \001(\t\022/\n"
          + "\013create_time\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022\037\n\027evaluated_example_count\030\006 \001(\005:"
          + "\207\001\352A\203\001\n%automl.googleapis.com/ModelEvalu"
          + "ation\022Zprojects/{project}/locations/{loc"
          + "ation}/models/{model}/modelEvaluations/{"
          + "model_evaluation}B\t\n\007metricsB\233\001\n\037com.goo"
          + "gle.cloud.automl.v1beta1P\001Z7cloud.google"
          + ".com/go/automl/apiv1beta1/automlpb;autom"
          + "lpb\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Goog"
          + "le::Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.Detection.getDescriptor(),
              com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.Tables.getDescriptor(),
              com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor(),
              com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_ModelEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor,
            new java.lang.String[] {
              "ClassificationEvaluationMetrics",
              "RegressionEvaluationMetrics",
              "TranslationEvaluationMetrics",
              "ImageObjectDetectionEvaluationMetrics",
              "VideoObjectTrackingEvaluationMetrics",
              "TextSentimentEvaluationMetrics",
              "TextExtractionEvaluationMetrics",
              "Name",
              "AnnotationSpecId",
              "DisplayName",
              "CreateTime",
              "EvaluatedExampleCount",
              "Metrics",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Detection.getDescriptor();
    com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Tables.getDescriptor();
    com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor();
    com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
