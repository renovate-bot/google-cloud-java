/*
 * Copyright 2025 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/image.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

public final class Image {
  private Image() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_Layer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_Layer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_Fingerprint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_Fingerprint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_ImageNote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_ImageNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_ImageOccurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_ImageOccurrence_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\026grafeas/v1/image.proto\022\ngrafeas.v1\"-\n\005"
          + "Layer\022\021\n\tdirective\030\001 \001(\t\022\021\n\targuments\030\002 "
          + "\001(\t\"@\n\013Fingerprint\022\017\n\007v1_name\030\001 \001(\t\022\017\n\007v"
          + "2_blob\030\002 \003(\t\022\017\n\007v2_name\030\003 \001(\t\"O\n\tImageNo"
          + "te\022\024\n\014resource_url\030\001 \001(\t\022,\n\013fingerprint\030"
          + "\002 \001(\0132\027.grafeas.v1.Fingerprint\"\223\001\n\017Image"
          + "Occurrence\022,\n\013fingerprint\030\001 \001(\0132\027.grafea"
          + "s.v1.Fingerprint\022\020\n\010distance\030\002 \001(\005\022%\n\nla"
          + "yer_info\030\003 \003(\0132\021.grafeas.v1.Layer\022\031\n\021bas"
          + "e_resource_url\030\004 \001(\tBQ\n\rio.grafeas.v1P\001Z"
          + "8google.golang.org/genproto/googleapis/g"
          + "rafeas/v1;grafeas\242\002\003GRAb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_grafeas_v1_Layer_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_Layer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_Layer_descriptor,
            new java.lang.String[] {
              "Directive", "Arguments",
            });
    internal_static_grafeas_v1_Fingerprint_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1_Fingerprint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_Fingerprint_descriptor,
            new java.lang.String[] {
              "V1Name", "V2Blob", "V2Name",
            });
    internal_static_grafeas_v1_ImageNote_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1_ImageNote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_ImageNote_descriptor,
            new java.lang.String[] {
              "ResourceUrl", "Fingerprint",
            });
    internal_static_grafeas_v1_ImageOccurrence_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1_ImageOccurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_ImageOccurrence_descriptor,
            new java.lang.String[] {
              "Fingerprint", "Distance", "LayerInfo", "BaseResourceUrl",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
