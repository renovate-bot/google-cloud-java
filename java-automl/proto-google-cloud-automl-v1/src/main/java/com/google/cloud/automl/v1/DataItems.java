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
// source: google/cloud/automl/v1/data_items.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1;

public final class DataItems {
  private DataItems() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Image_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextSnippet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextSnippet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_DocumentDimensions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_DocumentDimensions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Document_Layout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Document_Layout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ExamplePayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExamplePayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/automl/v1/data_items.prot"
          + "o\022\026google.cloud.automl.v1\032%google/cloud/"
          + "automl/v1/geometry.proto\032\037google/cloud/a"
          + "utoml/v1/io.proto\032)google/cloud/automl/v"
          + "1/text_segment.proto\"=\n\005Image\022\025\n\013image_b"
          + "ytes\030\001 \001(\014H\000\022\025\n\rthumbnail_uri\030\004 \001(\tB\006\n\004d"
          + "ata\"F\n\013TextSnippet\022\017\n\007content\030\001 \001(\t\022\021\n\tm"
          + "ime_type\030\002 \001(\t\022\023\n\013content_uri\030\004 \001(\t\"\352\001\n\022"
          + "DocumentDimensions\022N\n\004unit\030\001 \001(\0162@.googl"
          + "e.cloud.automl.v1.DocumentDimensions.Doc"
          + "umentDimensionUnit\022\r\n\005width\030\002 \001(\002\022\016\n\006hei"
          + "ght\030\003 \001(\002\"e\n\025DocumentDimensionUnit\022\'\n#DO"
          + "CUMENT_DIMENSION_UNIT_UNSPECIFIED\020\000\022\010\n\004I"
          + "NCH\020\001\022\016\n\nCENTIMETER\020\002\022\t\n\005POINT\020\003\"\326\005\n\010Doc"
          + "ument\022A\n\014input_config\030\001 \001(\0132+.google.clo"
          + "ud.automl.v1.DocumentInputConfig\022:\n\rdocu"
          + "ment_text\030\002 \001(\0132#.google.cloud.automl.v1"
          + ".TextSnippet\0227\n\006layout\030\003 \003(\0132\'.google.cl"
          + "oud.automl.v1.Document.Layout\022G\n\023documen"
          + "t_dimensions\030\004 \001(\0132*.google.cloud.automl"
          + ".v1.DocumentDimensions\022\022\n\npage_count\030\005 \001"
          + "(\005\032\264\003\n\006Layout\0229\n\014text_segment\030\001 \001(\0132#.go"
          + "ogle.cloud.automl.v1.TextSegment\022\023\n\013page"
          + "_number\030\002 \001(\005\022;\n\rbounding_poly\030\003 \001(\0132$.g"
          + "oogle.cloud.automl.v1.BoundingPoly\022R\n\021te"
          + "xt_segment_type\030\004 \001(\01627.google.cloud.aut"
          + "oml.v1.Document.Layout.TextSegmentType\"\310"
          + "\001\n\017TextSegmentType\022!\n\035TEXT_SEGMENT_TYPE_"
          + "UNSPECIFIED\020\000\022\t\n\005TOKEN\020\001\022\r\n\tPARAGRAPH\020\002\022"
          + "\016\n\nFORM_FIELD\020\003\022\023\n\017FORM_FIELD_NAME\020\004\022\027\n\023"
          + "FORM_FIELD_CONTENTS\020\005\022\t\n\005TABLE\020\006\022\020\n\014TABL"
          + "E_HEADER\020\007\022\r\n\tTABLE_ROW\020\010\022\016\n\nTABLE_CELL\020"
          + "\t\"\276\001\n\016ExamplePayload\022.\n\005image\030\001 \001(\0132\035.go"
          + "ogle.cloud.automl.v1.ImageH\000\022;\n\014text_sni"
          + "ppet\030\002 \001(\0132#.google.cloud.automl.v1.Text"
          + "SnippetH\000\0224\n\010document\030\004 \001(\0132 .google.clo"
          + "ud.automl.v1.DocumentH\000B\t\n\007payloadB\240\001\n\032c"
          + "om.google.cloud.automl.v1P\001Z2cloud.googl"
          + "e.com/go/automl/apiv1/automlpb;automlpb\252"
          + "\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\"
          + "AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1.Geometry.getDescriptor(),
              com.google.cloud.automl.v1.Io.getDescriptor(),
              com.google.cloud.automl.v1.TextSegmentProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_Image_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_Image_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Image_descriptor,
            new java.lang.String[] {
              "ImageBytes", "ThumbnailUri", "Data",
            });
    internal_static_google_cloud_automl_v1_TextSnippet_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_TextSnippet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextSnippet_descriptor,
            new java.lang.String[] {
              "Content", "MimeType", "ContentUri",
            });
    internal_static_google_cloud_automl_v1_DocumentDimensions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_DocumentDimensions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_DocumentDimensions_descriptor,
            new java.lang.String[] {
              "Unit", "Width", "Height",
            });
    internal_static_google_cloud_automl_v1_Document_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Document_descriptor,
            new java.lang.String[] {
              "InputConfig", "DocumentText", "Layout", "DocumentDimensions", "PageCount",
            });
    internal_static_google_cloud_automl_v1_Document_Layout_descriptor =
        internal_static_google_cloud_automl_v1_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_Document_Layout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Document_Layout_descriptor,
            new java.lang.String[] {
              "TextSegment", "PageNumber", "BoundingPoly", "TextSegmentType",
            });
    internal_static_google_cloud_automl_v1_ExamplePayload_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1_ExamplePayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ExamplePayload_descriptor,
            new java.lang.String[] {
              "Image", "TextSnippet", "Document", "Payload",
            });
    com.google.cloud.automl.v1.Geometry.getDescriptor();
    com.google.cloud.automl.v1.Io.getDescriptor();
    com.google.cloud.automl.v1.TextSegmentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
