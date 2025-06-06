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
// source: google/cloud/dialogflow/v2beta1/validation_result.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public final class ValidationResultProto {
  private ValidationResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ValidationError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ValidationError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ValidationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/dialogflow/v2beta1/valida"
          + "tion_result.proto\022\037google.cloud.dialogfl"
          + "ow.v2beta1\"\334\001\n\017ValidationError\022K\n\010severi"
          + "ty\030\001 \001(\01629.google.cloud.dialogflow.v2bet"
          + "a1.ValidationError.Severity\022\017\n\007entries\030\003"
          + " \003(\t\022\025\n\rerror_message\030\004 \001(\t\"T\n\010Severity\022"
          + "\030\n\024SEVERITY_UNSPECIFIED\020\000\022\010\n\004INFO\020\001\022\013\n\007W"
          + "ARNING\020\002\022\t\n\005ERROR\020\003\022\014\n\010CRITICAL\020\004\"_\n\020Val"
          + "idationResult\022K\n\021validation_errors\030\001 \003(\013"
          + "20.google.cloud.dialogflow.v2beta1.Valid"
          + "ationErrorB\252\001\n#com.google.cloud.dialogfl"
          + "ow.v2beta1B\025ValidationResultProtoP\001ZCclo"
          + "ud.google.com/go/dialogflow/apiv2beta1/d"
          + "ialogflowpb;dialogflowpb\242\002\002DF\252\002\037Google.C"
          + "loud.Dialogflow.V2Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_dialogflow_v2beta1_ValidationError_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_ValidationError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ValidationError_descriptor,
            new java.lang.String[] {
              "Severity", "Entries", "ErrorMessage",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ValidationResult_descriptor,
            new java.lang.String[] {
              "ValidationErrors",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
