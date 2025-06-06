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
// source: google/cloud/automl/v1beta1/video.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public final class VideoProto {
  private VideoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_VideoClassificationDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_VideoClassificationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_VideoClassificationModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_VideoClassificationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingModelMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/automl/v1beta1/video.prot"
          + "o\022\033google.cloud.automl.v1beta1\0320google/c"
          + "loud/automl/v1beta1/classification.proto"
          + "\"$\n\"VideoClassificationDatasetMetadata\"$"
          + "\n\"VideoObjectTrackingDatasetMetadata\"\"\n "
          + "VideoClassificationModelMetadata\"\"\n Vide"
          + "oObjectTrackingModelMetadataB\247\001\n\037com.goo"
          + "gle.cloud.automl.v1beta1B\nVideoProtoP\001Z7"
          + "cloud.google.com/go/automl/apiv1beta1/au"
          + "tomlpb;automlpb\312\002\033Google\\Cloud\\AutoMl\\V1"
          + "beta1\352\002\036Google::Cloud::AutoML::V1beta1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_VideoClassificationDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_VideoClassificationDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_VideoClassificationDatasetMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingDatasetMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_VideoClassificationModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_VideoClassificationModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_VideoClassificationModelMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_VideoObjectTrackingModelMetadata_descriptor,
            new java.lang.String[] {});
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
