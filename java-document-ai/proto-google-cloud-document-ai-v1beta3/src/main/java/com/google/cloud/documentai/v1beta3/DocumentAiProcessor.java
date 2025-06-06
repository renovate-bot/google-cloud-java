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
// source: google/cloud/documentai/v1beta3/processor.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

public final class DocumentAiProcessor {
  private DocumentAiProcessor() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_FoundationGenAiModelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_FoundationGenAiModelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_CustomGenAiModelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_CustomGenAiModelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Processor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Processor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "/google/cloud/documentai/v1beta3/processor.proto\022\037google.cloud.documentai.v1bet"
          + "a3\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\0325google/cloud/documentai/v1beta3/document_schema.proto\0320g"
          + "oogle/cloud/documentai/v1beta3/evaluatio"
          + "n.proto\032\037google/protobuf/timestamp.proto\"\272\017\n"
          + "\020ProcessorVersion\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\024\n"
          + "\014display_name\030\002 \001(\t\022H\n"
          + "\017document_schema\030\014"
          + " \001(\0132/.google.cloud.documentai.v1beta3.DocumentSchema\022K\n"
          + "\005state\030\006 \001(\01627.google"
          + ".cloud.documentai.v1beta3.ProcessorVersion.StateB\003\340A\003\022/\n"
          + "\013create_time\030\007 \001(\0132\032.google.protobuf.Timestamp\022O\n"
          + "\021latest_evaluation\030\010"
          + " \001(\01324.google.cloud.documentai.v1beta3.EvaluationReference\022\024\n"
          + "\014kms_key_name\030\t \001(\t\022\034\n"
          + "\024kms_key_version_name\030\n"
          + " \001(\t\022\033\n"
          + "\016google_managed\030\013 \001(\010B\003\340A\003\022[\n"
          + "\020deprecation_info\030\r"
          + " \001(\0132A.google.cloud.documentai.v1beta3.ProcessorVersion.DeprecationInfo\022T\n"
          + "\n"
          + "model_type\030\017 \001(\0162;.google.cloud.documen"
          + "tai.v1beta3.ProcessorVersion.ModelTypeB\003\340A\003\022\032\n\r"
          + "satisfies_pzs\030\020 \001(\010B\003\340A\003\022\032\n\r"
          + "satisfies_pzi\030\021 \001(\010B\003\340A\003\022`\n"
          + "\021gen_ai_model_info\030\022 \001(\0132@.google.cloud.documentai.v1beta3"
          + ".ProcessorVersion.GenAiModelInfoB\003\340A\003\032\237\001\n"
          + "\017DeprecationInfo\0224\n"
          + "\020deprecation_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022V\n"
          + "\035replacement_processor_version\030\002 \001(\tB/\372A,\n"
          + "*documentai.googleapis.com/ProcessorVersion\032\231\005\n"
          + "\016GenAiModelInfo\022\201\001\n"
          + "\034foundation_gen_ai_model_info\030\001 \001(\0132Y.google.cloud.documen"
          + "tai.v1beta3.ProcessorVersion.GenAiModelInfo.FoundationGenAiModelInfoH\000\022y\n"
          + "\030custom_gen_ai_model_info\030\002 \001(\0132U.google.cloud."
          + "documentai.v1beta3.ProcessorVersion.GenAiModelInfo.CustomGenAiModelInfoH\000\032[\n"
          + "\030FoundationGenAiModelInfo\022\032\n"
          + "\022finetuning_allowed\030\001 \001(\010\022#\n"
          + "\033min_train_labeled_documents\030\002 \001(\005\032\234\002\n"
          + "\024CustomGenAiModelInfo\022\200\001\n"
          + "\021custom_model_type\030\001 \001(\0162e.google.cloud.docum"
          + "entai.v1beta3.ProcessorVersion.GenAiMode"
          + "lInfo.CustomGenAiModelInfo.CustomModelType\022!\n"
          + "\031base_processor_version_id\030\002 \001(\t\"^\n"
          + "\017CustomModelType\022!\n"
          + "\035CUSTOM_MODEL_TYPE_UNSPECIFIED\020\000\022\030\n"
          + "\024VERSIONED_FOUNDATION\020\001\022\016\n"
          + "\n"
          + "FINE_TUNED\020\002B\014\n\n"
          + "model_info\"\223\001\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010DEPLOYED\020\001\022\r\n"
          + "\tDEPLOYING\020\002\022\016\n\n"
          + "UNDEPLOYED\020\003\022\017\n"
          + "\013UNDEPLOYING\020\004\022\014\n"
          + "\010CREATING\020\005\022\014\n"
          + "\010DELETING\020\006\022\n\n"
          + "\006FAILED\020\007\022\r\n"
          + "\tIMPORTING\020\010\"Y\n"
          + "\tModelType\022\032\n"
          + "\026MODEL_TYPE_UNSPECIFIED\020\000\022\031\n"
          + "\025MODEL_TYPE_GENERATIVE\020\001\022\025\n"
          + "\021MODEL_TYPE_CUSTOM\020\002:\226\001\352A\222\001\n"
          + "*documentai.googleapis.com/ProcessorVersion\022"
          + "dprojects/{project}/locations/{location}"
          + "/processors/{processor}/processorVersions/{processor_version}\"r\n"
          + "\025ProcessorVersionAlias\022\r\n"
          + "\005alias\030\001 \001(\t\022J\n"
          + "\021processor_version\030\002 \001(\tB/\372A,\n"
          + "*documentai.googleapis.com/ProcessorVersion\"\312\005\n"
          + "\tProcessor\022\024\n"
          + "\004name\030\001 \001(\tB\006\340A\005\340A\003\022\014\n"
          + "\004type\030\002 \001(\t\022\024\n"
          + "\014display_name\030\003 \001(\t\022D\n"
          + "\005state\030\004 \001(\01620.google.cloud."
          + "documentai.v1beta3.Processor.StateB\003\340A\003\022R\n"
          + "\031default_processor_version\030\t \001(\tB/\372A,\n"
          + "*documentai.googleapis.com/ProcessorVersion\022^\n"
          + "\031processor_version_aliases\030\n"
          + " \003(\01326.google.cloud.documentai.v1beta3.ProcessorVersionAliasB\003\340A\003\022"
          + " \n"
          + "\020process_endpoint\030\006 \001(\tB\006\340A\003\340A\005\022/\n"
          + "\013create_time\030\007 \001(\0132\032.google.protobuf.Timestamp\022\024\n"
          + "\014kms_key_name\030\010 \001(\t\022\032\n\r"
          + "satisfies_pzs\030\014 \001(\010B\003\340A\003\022\032\n\r"
          + "satisfies_pzi\030\r"
          + " \001(\010B\003\340A\003\"~\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\013\n"
          + "\007ENABLED\020\001\022\014\n"
          + "\010DISABLED\020\002\022\014\n"
          + "\010ENABLING\020\003\022\r\n"
          + "\tDISABLING\020\004\022\014\n"
          + "\010CREATING\020\005\022\n\n"
          + "\006FAILED\020\006\022\014\n"
          + "\010DELETING\020\007:h\352Ae\n"
          + "#documentai.googleapis.com/Processor\022>projects"
          + "/{project}/locations/{location}/processors/{processor}B\352\001\n"
          + "#com.google.cloud.documentai.v1beta3B\023DocumentAiProcessorP\001ZCc"
          + "loud.google.com/go/documentai/apiv1beta3"
          + "/documentaipb;documentaipb\252\002\037Google.Clou"
          + "d.DocumentAI.V1Beta3\312\002\037Google\\Cloud\\Docu"
          + "mentAI\\V1beta3\352\002\"Google::Cloud::DocumentAI::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor(),
              com.google.cloud.documentai.v1beta3.DocumentAiEvaluation.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "DocumentSchema",
              "State",
              "CreateTime",
              "LatestEvaluation",
              "KmsKeyName",
              "KmsKeyVersionName",
              "GoogleManaged",
              "DeprecationInfo",
              "ModelType",
              "SatisfiesPzs",
              "SatisfiesPzi",
              "GenAiModelInfo",
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor =
        internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor,
            new java.lang.String[] {
              "DeprecationTime", "ReplacementProcessorVersion",
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_descriptor =
        internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_descriptor,
            new java.lang.String[] {
              "FoundationGenAiModelInfo", "CustomGenAiModelInfo", "ModelInfo",
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_FoundationGenAiModelInfo_descriptor =
        internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_FoundationGenAiModelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_FoundationGenAiModelInfo_descriptor,
            new java.lang.String[] {
              "FinetuningAllowed", "MinTrainLabeledDocuments",
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_CustomGenAiModelInfo_descriptor =
        internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_CustomGenAiModelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_GenAiModelInfo_CustomGenAiModelInfo_descriptor,
            new java.lang.String[] {
              "CustomModelType", "BaseProcessorVersionId",
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor,
            new java.lang.String[] {
              "Alias", "ProcessorVersion",
            });
    internal_static_google_cloud_documentai_v1beta3_Processor_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_Processor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Processor_descriptor,
            new java.lang.String[] {
              "Name",
              "Type",
              "DisplayName",
              "State",
              "DefaultProcessorVersion",
              "ProcessorVersionAliases",
              "ProcessEndpoint",
              "CreateTime",
              "KmsKeyName",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentAiEvaluation.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
