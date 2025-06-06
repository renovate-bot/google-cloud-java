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
// source: google/cloud/automl/v1beta1/detection.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public final class Detection {
  private Detection() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionEvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionEvaluationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingEvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingEvaluationMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/automl/v1beta1/detection."
          + "proto\022\033google.cloud.automl.v1beta1\032*goog"
          + "le/cloud/automl/v1beta1/geometry.proto\032\036"
          + "google/protobuf/duration.proto\"p\n\036ImageO"
          + "bjectDetectionAnnotation\022?\n\014bounding_box"
          + "\030\001 \001(\0132).google.cloud.automl.v1beta1.Bou"
          + "ndingPoly\022\r\n\005score\030\002 \001(\002\"\264\001\n\035VideoObject"
          + "TrackingAnnotation\022\023\n\013instance_id\030\001 \001(\t\022"
          + ".\n\013time_offset\030\002 \001(\0132\031.google.protobuf.D"
          + "uration\022?\n\014bounding_box\030\003 \001(\0132).google.c"
          + "loud.automl.v1beta1.BoundingPoly\022\r\n\005scor"
          + "e\030\004 \001(\002\"\256\002\n\027BoundingBoxMetricsEntry\022\025\n\ri"
          + "ou_threshold\030\001 \001(\002\022\036\n\026mean_average_preci"
          + "sion\030\002 \001(\002\022o\n\032confidence_metrics_entries"
          + "\030\003 \003(\0132K.google.cloud.automl.v1beta1.Bou"
          + "ndingBoxMetricsEntry.ConfidenceMetricsEn"
          + "try\032k\n\026ConfidenceMetricsEntry\022\034\n\024confide"
          + "nce_threshold\030\001 \001(\002\022\016\n\006recall\030\002 \001(\002\022\021\n\tp"
          + "recision\030\003 \001(\002\022\020\n\010f1_score\030\004 \001(\002\"\326\001\n%Ima"
          + "geObjectDetectionEvaluationMetrics\022$\n\034ev"
          + "aluated_bounding_box_count\030\001 \001(\005\022Z\n\034boun"
          + "ding_box_metrics_entries\030\002 \003(\01324.google."
          + "cloud.automl.v1beta1.BoundingBoxMetricsE"
          + "ntry\022+\n#bounding_box_mean_average_precis"
          + "ion\030\003 \001(\002\"\364\001\n$VideoObjectTrackingEvaluat"
          + "ionMetrics\022\035\n\025evaluated_frame_count\030\001 \001("
          + "\005\022$\n\034evaluated_bounding_box_count\030\002 \001(\005\022"
          + "Z\n\034bounding_box_metrics_entries\030\004 \003(\01324."
          + "google.cloud.automl.v1beta1.BoundingBoxM"
          + "etricsEntry\022+\n#bounding_box_mean_average"
          + "_precision\030\006 \001(\002B\233\001\n\037com.google.cloud.au"
          + "toml.v1beta1P\001Z7cloud.google.com/go/auto"
          + "ml/apiv1beta1/automlpb;automlpb\312\002\033Google"
          + "\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::A"
          + "utoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1beta1.Geometry.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionAnnotation_descriptor,
            new java.lang.String[] {
              "BoundingBox", "Score",
            });
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingAnnotation_descriptor,
            new java.lang.String[] {
              "InstanceId", "TimeOffset", "BoundingBox", "Score",
            });
    internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_descriptor,
            new java.lang.String[] {
              "IouThreshold", "MeanAveragePrecision", "ConfidenceMetricsEntries",
            });
    internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_descriptor,
            new java.lang.String[] {
              "ConfidenceThreshold", "Recall", "Precision", "F1Score",
            });
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "EvaluatedBoundingBoxCount",
              "BoundingBoxMetricsEntries",
              "BoundingBoxMeanAveragePrecision",
            });
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "EvaluatedFrameCount",
              "EvaluatedBoundingBoxCount",
              "BoundingBoxMetricsEntries",
              "BoundingBoxMeanAveragePrecision",
            });
    com.google.cloud.automl.v1beta1.Geometry.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
