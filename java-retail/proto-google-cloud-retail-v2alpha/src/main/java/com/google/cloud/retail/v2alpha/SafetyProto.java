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
// source: google/cloud/retail/v2alpha/safety.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

public final class SafetyProto {
  private SafetyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_SafetySetting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_SafetySetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/retail/v2alpha/safety.pro"
          + "to\022\033google.cloud.retail.v2alpha\032\037google/"
          + "api/field_behavior.proto\"\344\003\n\rSafetySetti"
          + "ng\022;\n\010category\030\001 \001(\0162).google.cloud.reta"
          + "il.v2alpha.HarmCategory\022P\n\tthreshold\030\002 \001"
          + "(\0162=.google.cloud.retail.v2alpha.SafetyS"
          + "etting.HarmBlockThreshold\022O\n\006method\030\003 \001("
          + "\0162:.google.cloud.retail.v2alpha.SafetySe"
          + "tting.HarmBlockMethodB\003\340A\001\"\235\001\n\022HarmBlock"
          + "Threshold\022$\n HARM_BLOCK_THRESHOLD_UNSPEC"
          + "IFIED\020\000\022\027\n\023BLOCK_LOW_AND_ABOVE\020\001\022\032\n\026BLOC"
          + "K_MEDIUM_AND_ABOVE\020\002\022\023\n\017BLOCK_ONLY_HIGH\020"
          + "\003\022\016\n\nBLOCK_NONE\020\004\022\007\n\003OFF\020\005\"S\n\017HarmBlockM"
          + "ethod\022!\n\035HARM_BLOCK_METHOD_UNSPECIFIED\020\000"
          + "\022\014\n\010SEVERITY\020\001\022\017\n\013PROBABILITY\020\002*\327\001\n\014Harm"
          + "Category\022\035\n\031HARM_CATEGORY_UNSPECIFIED\020\000\022"
          + "\035\n\031HARM_CATEGORY_HATE_SPEECH\020\001\022#\n\037HARM_C"
          + "ATEGORY_DANGEROUS_CONTENT\020\002\022\034\n\030HARM_CATE"
          + "GORY_HARASSMENT\020\003\022#\n\037HARM_CATEGORY_SEXUA"
          + "LLY_EXPLICIT\020\004\022!\n\035HARM_CATEGORY_CIVIC_IN"
          + "TEGRITY\020\005B\317\001\n\037com.google.cloud.retail.v2"
          + "alphaB\013SafetyProtoP\001Z7cloud.google.com/g"
          + "o/retail/apiv2alpha/retailpb;retailpb\242\002\006"
          + "RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033G"
          + "oogle\\Cloud\\Retail\\V2alpha\352\002\036Google::Clo"
          + "ud::Retail::V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_SafetySetting_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_SafetySetting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_SafetySetting_descriptor,
            new java.lang.String[] {
              "Category", "Threshold", "Method",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
