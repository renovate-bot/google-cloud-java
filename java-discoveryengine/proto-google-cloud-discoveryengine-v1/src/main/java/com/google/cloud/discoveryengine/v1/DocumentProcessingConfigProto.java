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
// source: google/cloud/discoveryengine/v1/document_processing_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public final class DocumentProcessingConfigProto {
  private DocumentProcessingConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_LayoutBasedChunkingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_LayoutBasedChunkingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_DigitalParsingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_DigitalParsingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_OcrParsingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_OcrParsingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_LayoutParsingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_LayoutParsingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfigOverridesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfigOverridesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/discoveryengine/v1/docume"
          + "nt_processing_config.proto\022\037google.cloud"
          + ".discoveryengine.v1\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\""
          + "\204\016\n\030DocumentProcessingConfig\022\014\n\004name\030\001 \001"
          + "(\t\022a\n\017chunking_config\030\003 \001(\0132H.google.clo"
          + "ud.discoveryengine.v1.DocumentProcessing"
          + "Config.ChunkingConfig\022g\n\026default_parsing"
          + "_config\030\004 \001(\0132G.google.cloud.discoveryen"
          + "gine.v1.DocumentProcessingConfig.Parsing"
          + "Config\022w\n\030parsing_config_overrides\030\005 \003(\013"
          + "2U.google.cloud.discoveryengine.v1.Docum"
          + "entProcessingConfig.ParsingConfigOverrid"
          + "esEntry\032\377\001\n\016ChunkingConfig\022\212\001\n\034layout_ba"
          + "sed_chunking_config\030\001 \001(\0132b.google.cloud"
          + ".discoveryengine.v1.DocumentProcessingCo"
          + "nfig.ChunkingConfig.LayoutBasedChunkingC"
          + "onfigH\000\032R\n\031LayoutBasedChunkingConfig\022\022\n\n"
          + "chunk_size\030\001 \001(\005\022!\n\031include_ancestor_hea"
          + "dings\030\002 \001(\010B\014\n\nchunk_mode\032\374\005\n\rParsingCon"
          + "fig\022~\n\026digital_parsing_config\030\001 \001(\0132\\.go"
          + "ogle.cloud.discoveryengine.v1.DocumentPr"
          + "ocessingConfig.ParsingConfig.DigitalPars"
          + "ingConfigH\000\022v\n\022ocr_parsing_config\030\002 \001(\0132"
          + "X.google.cloud.discoveryengine.v1.Docume"
          + "ntProcessingConfig.ParsingConfig.OcrPars"
          + "ingConfigH\000\022|\n\025layout_parsing_config\030\003 \001"
          + "(\0132[.google.cloud.discoveryengine.v1.Doc"
          + "umentProcessingConfig.ParsingConfig.Layo"
          + "utParsingConfigH\000\032\026\n\024DigitalParsingConfi"
          + "g\032S\n\020OcrParsingConfig\022&\n\032enhanced_docume"
          + "nt_elements\030\001 \003(\tB\002\030\001\022\027\n\017use_native_text"
          + "\030\002 \001(\010\032\356\001\n\023LayoutParsingConfig\022$\n\027enable"
          + "_table_annotation\030\001 \001(\010B\003\340A\001\022$\n\027enable_i"
          + "mage_annotation\030\002 \001(\010B\003\340A\001\022%\n\030structured"
          + "_content_types\030\t \003(\tB\003\340A\001\022\"\n\025exclude_htm"
          + "l_elements\030\n \003(\tB\003\340A\001\022!\n\024exclude_html_cl"
          + "asses\030\013 \003(\tB\003\340A\001\022\035\n\020exclude_html_ids\030\014 \003"
          + "(\tB\003\340A\001B\027\n\025type_dedicated_config\032\206\001\n\033Par"
          + "singConfigOverridesEntry\022\013\n\003key\030\001 \001(\t\022V\n"
          + "\005value\030\002 \001(\0132G.google.cloud.discoveryeng"
          + "ine.v1.DocumentProcessingConfig.ParsingC"
          + "onfig:\0028\001:\212\002\352A\206\002\n7discoveryengine.google"
          + "apis.com/DocumentProcessingConfig\022Xproje"
          + "cts/{project}/locations/{location}/dataS"
          + "tores/{data_store}/documentProcessingCon"
          + "fig\022qprojects/{project}/locations/{locat"
          + "ion}/collections/{collection}/dataStores"
          + "/{data_store}/documentProcessingConfigB\220"
          + "\002\n#com.google.cloud.discoveryengine.v1B\035"
          + "DocumentProcessingConfigProtoP\001ZMcloud.g"
          + "oogle.com/go/discoveryengine/apiv1/disco"
          + "veryenginepb;discoveryenginepb\242\002\017DISCOVE"
          + "RYENGINE\252\002\037Google.Cloud.DiscoveryEngine."
          + "V1\312\002\037Google\\Cloud\\DiscoveryEngine\\V1\352\002\"G"
          + "oogle::Cloud::DiscoveryEngine::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_descriptor,
            new java.lang.String[] {
              "Name", "ChunkingConfig", "DefaultParsingConfig", "ParsingConfigOverrides",
            });
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_descriptor,
            new java.lang.String[] {
              "LayoutBasedChunkingConfig", "ChunkMode",
            });
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_LayoutBasedChunkingConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_LayoutBasedChunkingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ChunkingConfig_LayoutBasedChunkingConfig_descriptor,
            new java.lang.String[] {
              "ChunkSize", "IncludeAncestorHeadings",
            });
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_descriptor,
            new java.lang.String[] {
              "DigitalParsingConfig",
              "OcrParsingConfig",
              "LayoutParsingConfig",
              "TypeDedicatedConfig",
            });
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_DigitalParsingConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_DigitalParsingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_DigitalParsingConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_OcrParsingConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_OcrParsingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_OcrParsingConfig_descriptor,
            new java.lang.String[] {
              "EnhancedDocumentElements", "UseNativeText",
            });
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_LayoutParsingConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_LayoutParsingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfig_LayoutParsingConfig_descriptor,
            new java.lang.String[] {
              "EnableTableAnnotation",
              "EnableImageAnnotation",
              "StructuredContentTypes",
              "ExcludeHtmlElements",
              "ExcludeHtmlClasses",
              "ExcludeHtmlIds",
            });
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfigOverridesEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfigOverridesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DocumentProcessingConfig_ParsingConfigOverridesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
