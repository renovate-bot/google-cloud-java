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
// source: google/cloud/retail/v2/catalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

public final class CatalogProto {
  private CatalogProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ProductLevelConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ProductLevelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CatalogAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CatalogAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_IgnoredFacetValues_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_IgnoredFacetValues_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacetValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacetValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_RerankConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_RerankConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_AttributesConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_AttributesConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CompletionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CompletionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_Catalog_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Catalog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "$google/cloud/retail/v2/catalog.proto\022\026"
          + "google.cloud.retail.v2\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032#google/cloud/retail/v2/common.proto\032"
          + "*google/cloud/retail/v2/import_config.proto\032\037google/protobuf/timestamp.proto\"^\n"
          + "\022ProductLevelConfig\022\036\n"
          + "\026ingestion_product_type\030\001 \001(\t\022(\n"
          + " merchant_center_product_id_field\030\002 \001(\t\"\367\017\n"
          + "\020CatalogAttribute\022\020\n"
          + "\003key\030\001 \001(\tB\003\340A\002\022\023\n"
          + "\006in_use\030\t \001(\010B\003\340A\003\022I\n"
          + "\004type\030\n"
          + " \001(\01626.google.cloud.retail.v2.CatalogAttribute.AttributeTypeB\003\340A\003\022R\n"
          + "\020indexable_option\030\005"
          + " \001(\01628.google.cloud.retail.v2.CatalogAttribute.IndexableOption\022a\n"
          + "\030dynamic_facetable_option\030\006 \001(\0162?.google.cloud"
          + ".retail.v2.CatalogAttribute.DynamicFacetableOption\022T\n"
          + "\021searchable_option\030\007 \001(\01629."
          + "google.cloud.retail.v2.CatalogAttribute.SearchableOption\022_\n"
          + "\027exact_searchable_option\030\013"
          + " \001(\0162>.google.cloud.retail.v2.CatalogAttribute.ExactSearchableOption\022V\n"
          + "\022retrievable_option\030\014 \001(\0162:.google.cloud.ret"
          + "ail.v2.CatalogAttribute.RetrievableOption\022J\n"
          + "\014facet_config\030\r"
          + " \001(\01324.google.cloud.retail.v2.CatalogAttribute.FacetConfig\032\351\005\n"
          + "\013FacetConfig\0229\n"
          + "\017facet_intervals\030\001 \003(\0132 .google.cloud.retail.v2.Interval\022e\n"
          + "\024ignored_facet_values\030\002 \003(\0132G.google.cloud.re"
          + "tail.v2.CatalogAttribute.FacetConfig.IgnoredFacetValues\022b\n"
          + "\023merged_facet_values\030\003"
          + " \003(\0132E.google.cloud.retail.v2.CatalogAttribute.FacetConfig.MergedFacetValue\022V\n"
          + "\014merged_facet\030\004 \001(\0132@.google.cloud.retail."
          + "v2.CatalogAttribute.FacetConfig.MergedFacet\022X\n\r"
          + "rerank_config\030\005 \001(\0132A.google.clou"
          + "d.retail.v2.CatalogAttribute.FacetConfig.RerankConfig\032\202\001\n"
          + "\022IgnoredFacetValues\022\016\n"
          + "\006values\030\001 \003(\t\022.\n\n"
          + "start_time\030\002 \001(\0132\032.google.protobuf.Timestamp\022,\n"
          + "\010end_time\030\003 \001(\0132\032.google.protobuf.Timestamp\0328\n"
          + "\020MergedFacetValue\022\016\n"
          + "\006values\030\001 \003(\t\022\024\n"
          + "\014merged_value\030\002 \001(\t\032\'\n"
          + "\013MergedFacet\022\030\n"
          + "\020merged_facet_key\030\001 \001(\t\032:\n"
          + "\014RerankConfig\022\024\n"
          + "\014rerank_facet\030\001 \001(\010\022\024\n"
          + "\014facet_values\030\002 \003(\t\"8\n\r"
          + "AttributeType\022\013\n"
          + "\007UNKNOWN\020\000\022\013\n"
          + "\007TEXTUAL\020\001\022\r\n"
          + "\tNUMERICAL\020\002\"b\n"
          + "\017IndexableOption\022 \n"
          + "\034INDEXABLE_OPTION_UNSPECIFIED\020\000\022\025\n"
          + "\021INDEXABLE_ENABLED\020\001\022\026\n"
          + "\022INDEXABLE_DISABLED\020\002\"\201\001\n"
          + "\026DynamicFacetableOption\022(\n"
          + "$DYNAMIC_FACETABLE_OPTION_UNSPECIFIED\020\000\022\035\n"
          + "\031DYNAMIC_FACETABLE_ENABLED\020\001\022\036\n"
          + "\032DYNAMIC_FACETABLE_DISABLED\020\002\"f\n"
          + "\020SearchableOption\022!\n"
          + "\035SEARCHABLE_OPTION_UNSPECIFIED\020\000\022\026\n"
          + "\022SEARCHABLE_ENABLED\020\001\022\027\n"
          + "\023SEARCHABLE_DISABLED\020\002\"}\n"
          + "\025ExactSearchableOption\022\'\n"
          + "#EXACT_SEARCHABLE_OPTION_UNSPECIFIED\020\000\022\034\n"
          + "\030EXACT_SEARCHABLE_ENABLED\020\001\022\035\n"
          + "\031EXACT_SEARCHABLE_DISABLED\020\002\"j\n"
          + "\021RetrievableOption\022\"\n"
          + "\036RETRIEVABLE_OPTION_UNSPECIFIED\020\000\022\027\n"
          + "\023RETRIEVABLE_ENABLED\020\001\022\030\n"
          + "\024RETRIEVABLE_DISABLED\020\002\"\266\003\n"
          + "\020AttributesConfig\022\024\n"
          + "\004name\030\001 \001(\tB\006\340A\002\340A\005\022[\n"
          + "\022catalog_attributes\030\002"
          + " \003(\0132?.google.cloud.retail.v2.AttributesConfig.CatalogAttributesEntry\022Q\n"
          + "\026attribute_config_level\030\003"
          + " \001(\0162,.google.cloud.retail.v2.AttributeConfigLevelB\003\340A\003\032b\n"
          + "\026CatalogAttributesEntry\022\013\n"
          + "\003key\030\001 \001(\t\0227\n"
          + "\005value\030\002"
          + " \001(\0132(.google.cloud.retail.v2.CatalogAttribute:\0028\001:x\352Au\n"
          + "&retail.googleapis.com/AttributesConfig\022Kprojects/{project}/l"
          + "ocations/{location}/catalogs/{catalog}/attributesConfig\"\231\005\n"
          + "\020CompletionConfig\022\024\n"
          + "\004name\030\001 \001(\tB\006\340A\002\340A\005\022\026\n"
          + "\016matching_order\030\002 \001(\t\022\027\n"
          + "\017max_suggestions\030\003 \001(\005\022\031\n"
          + "\021min_prefix_length\030\004 \001(\005\022\025\n\r"
          + "auto_learning\030\013 \001(\010\022X\n"
          + "\030suggestions_input_config\030\005 \001(\01321.google"
          + ".cloud.retail.v2.CompletionDataInputConfigB\003\340A\003\022.\n"
          + "!last_suggestions_import_operation\030\006 \001(\tB\003\340A\003\022U\n"
          + "\025denylist_input_config\030\007"
          + " \001(\01321.google.cloud.retail.v2.CompletionDataInputConfigB\003\340A\003\022+\n"
          + "\036last_denylist_import_operation\030\010 \001(\tB\003\340A\003\022V\n"
          + "\026allowlist_input_config\030\t"
          + " \001(\01321.google.cloud.retail.v2.CompletionDataInputConfigB\003\340A\003\022,\n"
          + "\037last_allowlist_import_operation\030\n"
          + " \001(\tB\003\340A\003:x\352Au\n"
          + "&retail.googleapis.com/CompletionConfig\022Kprojects/{project}/locations/{lo"
          + "cation}/catalogs/{catalog}/completionConfig\"\354\001\n"
          + "\007Catalog\022\024\n"
          + "\004name\030\001 \001(\tB\006\340A\002\340A\005\022\034\n"
          + "\014display_name\030\002 \001(\tB\006\340A\002\340A\005\022M\n"
          + "\024product_level_config\030\004"
          + " \001(\0132*.google.cloud.retail.v2.ProductLevelConfigB\003\340A\002:^\352A[\n"
          + "\035retail.googleapis.com/Catalog\022:projects/{projec"
          + "t}/locations/{location}/catalogs/{catalog}B\267\001\n"
          + "\032com.google.cloud.retail.v2B\014CatalogProtoP\001Z2cloud.google.com/go/retail/ap"
          + "iv2/retailpb;retailpb\242\002\006RETAIL\252\002\026Google."
          + "Cloud.Retail.V2\312\002\026Google\\Cloud\\Retail\\V2"
          + "\352\002\031Google::Cloud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2.ImportConfigProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_ProductLevelConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_ProductLevelConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ProductLevelConfig_descriptor,
            new java.lang.String[] {
              "IngestionProductType", "MerchantCenterProductIdField",
            });
    internal_static_google_cloud_retail_v2_CatalogAttribute_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_CatalogAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CatalogAttribute_descriptor,
            new java.lang.String[] {
              "Key",
              "InUse",
              "Type",
              "IndexableOption",
              "DynamicFacetableOption",
              "SearchableOption",
              "ExactSearchableOption",
              "RetrievableOption",
              "FacetConfig",
            });
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_descriptor =
        internal_static_google_cloud_retail_v2_CatalogAttribute_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_descriptor,
            new java.lang.String[] {
              "FacetIntervals",
              "IgnoredFacetValues",
              "MergedFacetValues",
              "MergedFacet",
              "RerankConfig",
            });
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_IgnoredFacetValues_descriptor =
        internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_IgnoredFacetValues_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_IgnoredFacetValues_descriptor,
            new java.lang.String[] {
              "Values", "StartTime", "EndTime",
            });
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacetValue_descriptor =
        internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacetValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacetValue_descriptor,
            new java.lang.String[] {
              "Values", "MergedValue",
            });
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacet_descriptor =
        internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_MergedFacet_descriptor,
            new java.lang.String[] {
              "MergedFacetKey",
            });
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_RerankConfig_descriptor =
        internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_RerankConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CatalogAttribute_FacetConfig_RerankConfig_descriptor,
            new java.lang.String[] {
              "RerankFacet", "FacetValues",
            });
    internal_static_google_cloud_retail_v2_AttributesConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_AttributesConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_AttributesConfig_descriptor,
            new java.lang.String[] {
              "Name", "CatalogAttributes", "AttributeConfigLevel",
            });
    internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2_AttributesConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_CompletionConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_CompletionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CompletionConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "MatchingOrder",
              "MaxSuggestions",
              "MinPrefixLength",
              "AutoLearning",
              "SuggestionsInputConfig",
              "LastSuggestionsImportOperation",
              "DenylistInputConfig",
              "LastDenylistImportOperation",
              "AllowlistInputConfig",
              "LastAllowlistImportOperation",
            });
    internal_static_google_cloud_retail_v2_Catalog_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_Catalog_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_Catalog_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "ProductLevelConfig",
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
    com.google.cloud.retail.v2.ImportConfigProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
