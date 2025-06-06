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
// source: google/cloud/retail/v2/serving_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

public final class ServingConfigProto {
  private ServingConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ServingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ServingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "+google/cloud/retail/v2/serving_config."
          + "proto\022\026google.cloud.retail.v2\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032#google/cloud/retail/v2/common"
          + ".proto\032+google/cloud/retail/v2/search_service.proto\"\226\010\n\r"
          + "ServingConfig\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\005\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\020\n"
          + "\010model_id\030\003 \001(\t\022\035\n"
          + "\025price_reranking_level\030\004 \001(\t\022\031\n"
          + "\021facet_control_ids\030\005 \003(\t\022R\n"
          + "\022dynamic_facet_spec\030\006"
          + " \001(\01326.google.cloud.retail.v2.SearchRequest.DynamicFacetSpec\022\031\n"
          + "\021boost_control_ids\030\007 \003(\t\022\032\n"
          + "\022filter_control_ids\030\t \003(\t\022\034\n"
          + "\024redirect_control_ids\030\n"
          + " \003(\t\022#\n"
          + "\033twoway_synonyms_control_ids\030\022 \003(\t\022#\n"
          + "\033oneway_synonyms_control_ids\030\014 \003(\t\022$\n"
          + "\034do_not_associate_control_ids\030\r"
          + " \003(\t\022\037\n"
          + "\027replacement_control_ids\030\016 \003(\t\022\032\n"
          + "\022ignore_control_ids\030\017 \003(\t\022\027\n"
          + "\017diversity_level\030\010 \001(\t\022K\n"
          + "\016diversity_type\030\024"
          + " \001(\01623.google.cloud.retail.v2.ServingConfig.DiversityType\022$\n"
          + "\034enable_category_filter_level\030\020 \001(\t\022\034\n"
          + "\024ignore_recs_denylist\030\030 \001(\010\022W\n"
          + "\024personalization_spec\030\025"
          + " \001(\01329.google.cloud.retail.v2.SearchRequest.PersonalizationSpec\022D\n"
          + "\016solution_types\030\023"
          + " \003(\0162$.google.cloud.retail.v2.SolutionTypeB\006\340A\002\340A\005\"d\n\r"
          + "DiversityType\022\036\n"
          + "\032DIVERSITY_TYPE_UNSPECIFIED\020\000\022\030\n"
          + "\024RULE_BASED_DIVERSITY\020\002\022\031\n"
          + "\025DATA_DRIVEN_DIVERSITY\020\003:\205\001\352A\201\001\n"
          + "#retail.googleapis.com/ServingConfig\022Zprojects/{project}/locations/{"
          + "location}/catalogs/{catalog}/servingConfigs/{serving_config}B\275\001\n"
          + "\032com.google.cloud.retail.v2B\022ServingConfigProtoP\001Z2cloud"
          + ".google.com/go/retail/apiv2/retailpb;ret"
          + "ailpb\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312"
          + "\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2.SearchServiceProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_ServingConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_ServingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ServingConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "ModelId",
              "PriceRerankingLevel",
              "FacetControlIds",
              "DynamicFacetSpec",
              "BoostControlIds",
              "FilterControlIds",
              "RedirectControlIds",
              "TwowaySynonymsControlIds",
              "OnewaySynonymsControlIds",
              "DoNotAssociateControlIds",
              "ReplacementControlIds",
              "IgnoreControlIds",
              "DiversityLevel",
              "DiversityType",
              "EnableCategoryFilterLevel",
              "IgnoreRecsDenylist",
              "PersonalizationSpec",
              "SolutionTypes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.cloud.retail.v2.SearchServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
