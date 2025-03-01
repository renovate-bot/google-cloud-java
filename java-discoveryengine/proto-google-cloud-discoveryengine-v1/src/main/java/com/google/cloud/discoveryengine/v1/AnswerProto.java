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
// source: google/cloud/discoveryengine/v1/answer.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public final class AnswerProto {
  private AnswerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/discoveryengine/v1/answer"
          + ".proto\022\037google.cloud.discoveryengine.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032\034google/protobuf/str"
          + "uct.proto\032\037google/protobuf/timestamp.pro"
          + "to\"\331\"\n\006Answer\022\021\n\004name\030\001 \001(\tB\003\340A\005\022<\n\005stat"
          + "e\030\002 \001(\0162-.google.cloud.discoveryengine.v"
          + "1.Answer.State\022\023\n\013answer_text\030\003 \001(\t\022C\n\tc"
          + "itations\030\004 \003(\01320.google.cloud.discoverye"
          + "ngine.v1.Answer.Citation\022E\n\nreferences\030\005"
          + " \003(\01321.google.cloud.discoveryengine.v1.A"
          + "nswer.Reference\022\031\n\021related_questions\030\006 \003"
          + "(\t\022;\n\005steps\030\007 \003(\0132,.google.cloud.discove"
          + "ryengine.v1.Answer.Step\022`\n\030query_underst"
          + "anding_info\030\n \001(\0132>.google.cloud.discove"
          + "ryengine.v1.Answer.QueryUnderstandingInf"
          + "o\022[\n\026answer_skipped_reasons\030\013 \003(\0162;.goog"
          + "le.cloud.discoveryengine.v1.Answer.Answe"
          + "rSkippedReason\0224\n\013create_time\030\010 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\0226\n\rcomplete"
          + "_time\030\t \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\032{\n\010Citation\022\023\n\013start_index\030\001 \001(\003\022\021\n"
          + "\tend_index\030\002 \001(\003\022G\n\007sources\030\003 \003(\01326.goog"
          + "le.cloud.discoveryengine.v1.Answer.Citat"
          + "ionSource\032&\n\016CitationSource\022\024\n\014reference"
          + "_id\030\001 \001(\t\032\202\n\n\tReference\022p\n\032unstructured_"
          + "document_info\030\001 \001(\0132J.google.cloud.disco"
          + "veryengine.v1.Answer.Reference.Unstructu"
          + "redDocumentInfoH\000\022Q\n\nchunk_info\030\002 \001(\0132;."
          + "google.cloud.discoveryengine.v1.Answer.R"
          + "eference.ChunkInfoH\000\022l\n\030structured_docum"
          + "ent_info\030\003 \001(\0132H.google.cloud.discoverye"
          + "ngine.v1.Answer.Reference.StructuredDocu"
          + "mentInfoH\000\032\201\003\n\030UnstructuredDocumentInfo\022"
          + ">\n\010document\030\001 \001(\tB,\372A)\n\'discoveryengine."
          + "googleapis.com/Document\022\013\n\003uri\030\002 \001(\t\022\r\n\005"
          + "title\030\003 \001(\t\022o\n\016chunk_contents\030\004 \003(\0132W.go"
          + "ogle.cloud.discoveryengine.v1.Answer.Ref"
          + "erence.UnstructuredDocumentInfo.ChunkCon"
          + "tent\022,\n\013struct_data\030\005 \001(\0132\027.google.proto"
          + "buf.Struct\032j\n\014ChunkContent\022\017\n\007content\030\001 "
          + "\001(\t\022\027\n\017page_identifier\030\002 \001(\t\022\034\n\017relevanc"
          + "e_score\030\003 \001(\002H\000\210\001\001B\022\n\020_relevance_score\032\251"
          + "\003\n\tChunkInfo\0228\n\005chunk\030\001 \001(\tB)\372A&\n$discov"
          + "eryengine.googleapis.com/Chunk\022\017\n\007conten"
          + "t\030\002 \001(\t\022\034\n\017relevance_score\030\003 \001(\002H\000\210\001\001\022g\n"
          + "\021document_metadata\030\004 \001(\0132L.google.cloud."
          + "discoveryengine.v1.Answer.Reference.Chun"
          + "kInfo.DocumentMetadata\032\265\001\n\020DocumentMetad"
          + "ata\022>\n\010document\030\001 \001(\tB,\372A)\n\'discoveryeng"
          + "ine.googleapis.com/Document\022\013\n\003uri\030\002 \001(\t"
          + "\022\r\n\005title\030\003 \001(\t\022\027\n\017page_identifier\030\004 \001(\t"
          + "\022,\n\013struct_data\030\005 \001(\0132\027.google.protobuf."
          + "StructB\022\n\020_relevance_score\032\206\001\n\026Structure"
          + "dDocumentInfo\022>\n\010document\030\001 \001(\tB,\372A)\n\'di"
          + "scoveryengine.googleapis.com/Document\022,\n"
          + "\013struct_data\030\002 \001(\0132\027.google.protobuf.Str"
          + "uctB\t\n\007content\032\274\010\n\004Step\022A\n\005state\030\001 \001(\01622"
          + ".google.cloud.discoveryengine.v1.Answer."
          + "Step.State\022\023\n\013description\030\002 \001(\t\022\017\n\007thoug"
          + "ht\030\003 \001(\t\022D\n\007actions\030\004 \003(\01323.google.cloud"
          + ".discoveryengine.v1.Answer.Step.Action\032\270"
          + "\006\n\006Action\022Y\n\rsearch_action\030\002 \001(\0132@.googl"
          + "e.cloud.discoveryengine.v1.Answer.Step.A"
          + "ction.SearchActionH\000\022T\n\013observation\030\003 \001("
          + "\0132?.google.cloud.discoveryengine.v1.Answ"
          + "er.Step.Action.Observation\032\035\n\014SearchActi"
          + "on\022\r\n\005query\030\001 \001(\t\032\323\004\n\013Observation\022d\n\016sea"
          + "rch_results\030\002 \003(\0132L.google.cloud.discove"
          + "ryengine.v1.Answer.Step.Action.Observati"
          + "on.SearchResult\032\335\003\n\014SearchResult\022\020\n\010docu"
          + "ment\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022n"
          + "\n\014snippet_info\030\004 \003(\0132X.google.cloud.disc"
          + "overyengine.v1.Answer.Step.Action.Observ"
          + "ation.SearchResult.SnippetInfo\022j\n\nchunk_"
          + "info\030\005 \003(\0132V.google.cloud.discoveryengin"
          + "e.v1.Answer.Step.Action.Observation.Sear"
          + "chResult.ChunkInfo\022,\n\013struct_data\030\006 \001(\0132"
          + "\027.google.protobuf.Struct\0326\n\013SnippetInfo\022"
          + "\017\n\007snippet\030\001 \001(\t\022\026\n\016snippet_status\030\002 \001(\t"
          + "\032]\n\tChunkInfo\022\r\n\005chunk\030\001 \001(\t\022\017\n\007content\030"
          + "\002 \001(\t\022\034\n\017relevance_score\030\003 \001(\002H\000\210\001\001B\022\n\020_"
          + "relevance_scoreB\010\n\006action\"J\n\005State\022\025\n\021ST"
          + "ATE_UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\n\n\006FA"
          + "ILED\020\002\022\r\n\tSUCCEEDED\020\003\032\272\003\n\026QueryUnderstan"
          + "dingInfo\022y\n\031query_classification_info\030\001 "
          + "\003(\0132V.google.cloud.discoveryengine.v1.An"
          + "swer.QueryUnderstandingInfo.QueryClassif"
          + "icationInfo\032\244\002\n\027QueryClassificationInfo\022"
          + "i\n\004type\030\001 \001(\0162[.google.cloud.discoveryen"
          + "gine.v1.Answer.QueryUnderstandingInfo.Qu"
          + "eryClassificationInfo.Type\022\020\n\010positive\030\002"
          + " \001(\010\"\213\001\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\025\n\021A"
          + "DVERSARIAL_QUERY\020\001\022\034\n\030NON_ANSWER_SEEKING"
          + "_QUERY\020\002\022\027\n\023JAIL_BREAKING_QUERY\020\003\022\037\n\033NON"
          + "_ANSWER_SEEKING_QUERY_V2\020\004\"J\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\n\n\006F"
          + "AILED\020\002\022\r\n\tSUCCEEDED\020\003\"\335\002\n\023AnswerSkipped"
          + "Reason\022%\n!ANSWER_SKIPPED_REASON_UNSPECIF"
          + "IED\020\000\022\035\n\031ADVERSARIAL_QUERY_IGNORED\020\001\022$\n "
          + "NON_ANSWER_SEEKING_QUERY_IGNORED\020\002\022\037\n\033OU"
          + "T_OF_DOMAIN_QUERY_IGNORED\020\003\022\036\n\032POTENTIAL"
          + "_POLICY_VIOLATION\020\004\022\027\n\023NO_RELEVANT_CONTE"
          + "NT\020\005\022\037\n\033JAIL_BREAKING_QUERY_IGNORED\020\006\022\035\n"
          + "\031CUSTOMER_POLICY_VIOLATION\020\007\022\'\n#NON_ANSW"
          + "ER_SEEKING_QUERY_IGNORED_V2\020\010\022\027\n\023LOW_GRO"
          + "UNDED_ANSWER\020\t:\205\003\352A\201\003\n%discoveryengine.g"
          + "oogleapis.com/Answer\022cprojects/{project}"
          + "/locations/{location}/dataStores/{data_s"
          + "tore}/sessions/{session}/answers/{answer"
          + "}\022|projects/{project}/locations/{locatio"
          + "n}/collections/{collection}/dataStores/{"
          + "data_store}/sessions/{session}/answers/{"
          + "answer}\022uprojects/{project}/locations/{l"
          + "ocation}/collections/{collection}/engine"
          + "s/{engine}/sessions/{session}/answers/{a"
          + "nswer}B\376\001\n#com.google.cloud.discoveryeng"
          + "ine.v1B\013AnswerProtoP\001ZMcloud.google.com/"
          + "go/discoveryengine/apiv1/discoveryengine"
          + "pb;discoveryenginepb\242\002\017DISCOVERYENGINE\252\002"
          + "\037Google.Cloud.DiscoveryEngine.V1\312\002\037Googl"
          + "e\\Cloud\\DiscoveryEngine\\V1\352\002\"Google::Clo"
          + "ud::DiscoveryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "AnswerText",
              "Citations",
              "References",
              "RelatedQuestions",
              "Steps",
              "QueryUnderstandingInfo",
              "AnswerSkippedReasons",
              "CreateTime",
              "CompleteTime",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Citation_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Sources",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_CitationSource_descriptor,
            new java.lang.String[] {
              "ReferenceId",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor,
            new java.lang.String[] {
              "UnstructuredDocumentInfo", "ChunkInfo", "StructuredDocumentInfo", "Content",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "ChunkContents", "StructData",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor,
            new java.lang.String[] {
              "Content", "PageIdentifier", "RelevanceScore",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore", "DocumentMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "PageIdentifier", "StructData",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Reference_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Reference_StructuredDocumentInfo_descriptor,
            new java.lang.String[] {
              "Document", "StructData",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor,
            new java.lang.String[] {
              "State", "Description", "Thought", "Actions",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor,
            new java.lang.String[] {
              "SearchAction", "Observation", "Action",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_SearchAction_descriptor,
            new java.lang.String[] {
              "Query",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor,
            new java.lang.String[] {
              "SearchResults",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "SnippetInfo", "ChunkInfo", "StructData",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor,
            new java.lang.String[] {
              "Snippet", "SnippetStatus",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor,
            new java.lang.String[] {
              "QueryClassificationInfo",
            });
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor,
            new java.lang.String[] {
              "Type", "Positive",
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
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
