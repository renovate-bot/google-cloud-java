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
// source: google/cloud/automl/v1beta1/text.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public final class TextProto {
  private TextProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/automl/v1beta1/text.proto"
          + "\022\033google.cloud.automl.v1beta1\0320google/cl"
          + "oud/automl/v1beta1/classification.proto\""
          + "q\n!TextClassificationDatasetMetadata\022L\n\023"
          + "classification_type\030\001 \001(\0162/.google.cloud"
          + ".automl.v1beta1.ClassificationType\"o\n\037Te"
          + "xtClassificationModelMetadata\022L\n\023classif"
          + "ication_type\030\003 \001(\0162/.google.cloud.automl"
          + ".v1beta1.ClassificationType\"\037\n\035TextExtra"
          + "ctionDatasetMetadata\"1\n\033TextExtractionMo"
          + "delMetadata\022\022\n\nmodel_hint\030\003 \001(\t\"5\n\034TextS"
          + "entimentDatasetMetadata\022\025\n\rsentiment_max"
          + "\030\001 \001(\005\"\034\n\032TextSentimentModelMetadataB\246\001\n"
          + "\037com.google.cloud.automl.v1beta1B\tTextPr"
          + "otoP\001Z7cloud.google.com/go/automl/apiv1b"
          + "eta1/automlpb;automlpb\312\002\033Google\\Cloud\\Au"
          + "toMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1"
          + "beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextExtractionDatasetMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextExtractionModelMetadata_descriptor,
            new java.lang.String[] {
              "ModelHint",
            });
    internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor,
            new java.lang.String[] {
              "SentimentMax",
            });
    internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextSentimentModelMetadata_descriptor,
            new java.lang.String[] {});
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
