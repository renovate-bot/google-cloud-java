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
// source: google/shopping/merchant/conversions/v1beta/conversionsources.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.conversions.v1beta;

public final class ConversionSourcesProto {
  private ConversionSourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_ConversionSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_ConversionSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_ConversionType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_ConversionType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_GoogleAnalyticsLink_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_GoogleAnalyticsLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_MerchantCenterDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_MerchantCenterDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_CreateConversionSourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_CreateConversionSourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_UpdateConversionSourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_UpdateConversionSourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_DeleteConversionSourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_DeleteConversionSourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_UndeleteConversionSourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_UndeleteConversionSourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_GetConversionSourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_GetConversionSourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/shopping/merchant/conversions/v"
          + "1beta/conversionsources.proto\022+google.sh"
          + "opping.merchant.conversions.v1beta\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032\033google/pr"
          + "otobuf/empty.proto\032 google/protobuf/fiel"
          + "d_mask.proto\032\037google/protobuf/timestamp."
          + "proto\"\252\006\n\020ConversionSource\022f\n\025google_ana"
          + "lytics_link\030\003 \001(\0132@.google.shopping.merc"
          + "hant.conversions.v1beta.GoogleAnalyticsL"
          + "inkB\003\340A\005H\000\022m\n\033merchant_center_destinatio"
          + "n\030\004 \001(\0132F.google.shopping.merchant.conve"
          + "rsions.v1beta.MerchantCenterDestinationH"
          + "\000\022\024\n\004name\030\001 \001(\tB\006\340A\003\340A\010\022W\n\005state\030\005 \001(\0162C"
          + ".google.shopping.merchant.conversions.v1"
          + "beta.ConversionSource.StateB\003\340A\003\0224\n\013expi"
          + "re_time\030\006 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\022a\n\ncontroller\030\007 \001(\0162H.google.shop"
          + "ping.merchant.conversions.v1beta.Convers"
          + "ionSource.ControllerB\003\340A\003\"E\n\005State\022\025\n\021ST"
          + "ATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\014\n\010ARCHIVE"
          + "D\020\002\022\013\n\007PENDING\020\003\"N\n\nController\022\032\n\026CONTRO"
          + "LLER_UNSPECIFIED\020\000\022\014\n\010MERCHANT\020\001\022\026\n\022YOUT"
          + "UBE_AFFILIATES\020\002:\220\001\352A\214\001\n+merchantapi.goo"
          + "gleapis.com/ConversionSource\0228accounts/{"
          + "account}/conversionSources/{conversion_s"
          + "ource}*\021conversionSources2\020conversionSou"
          + "rceB\r\n\013source_data\"\357\004\n\023AttributionSettin"
          + "gs\022-\n attribution_lookback_window_days\030\001"
          + " \001(\005B\003\340A\002\022q\n\021attribution_model\030\002 \001(\0162Q.g"
          + "oogle.shopping.merchant.conversions.v1be"
          + "ta.AttributionSettings.AttributionModelB"
          + "\003\340A\002\022p\n\017conversion_type\030\003 \003(\0132O.google.s"
          + "hopping.merchant.conversions.v1beta.Attr"
          + "ibutionSettings.ConversionTypeB\006\340A\006\340A\005\0328"
          + "\n\016ConversionType\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\023\n\006r"
          + "eport\030\002 \001(\010B\003\340A\003\"\211\002\n\020AttributionModel\022!\n"
          + "\035ATTRIBUTION_MODEL_UNSPECIFIED\020\000\022\034\n\030CROS"
          + "S_CHANNEL_LAST_CLICK\020\001\022\034\n\030ADS_PREFERRED_"
          + "LAST_CLICK\020\002\022\035\n\031CROSS_CHANNEL_DATA_DRIVE"
          + "N\020\005\022\035\n\031CROSS_CHANNEL_FIRST_CLICK\020\006\022\030\n\024CR"
          + "OSS_CHANNEL_LINEAR\020\007\022 \n\034CROSS_CHANNEL_PO"
          + "SITION_BASED\020\010\022\034\n\030CROSS_CHANNEL_TIME_DEC"
          + "AY\020\t\"\256\001\n\023GoogleAnalyticsLink\022\033\n\013property"
          + "_id\030\001 \001(\003B\006\340A\002\340A\005\022c\n\024attribution_setting"
          + "s\030\002 \001(\0132@.google.shopping.merchant.conve"
          + "rsions.v1beta.AttributionSettingsB\003\340A\003\022\025"
          + "\n\010property\030\003 \001(\tB\003\340A\003\"\321\001\n\031MerchantCenter"
          + "Destination\022\030\n\013destination\030\001 \001(\tB\003\340A\003\022c\n"
          + "\024attribution_settings\030\002 \001(\0132@.google.sho"
          + "pping.merchant.conversions.v1beta.Attrib"
          + "utionSettingsB\003\340A\002\022\031\n\014display_name\030\003 \001(\t"
          + "B\003\340A\002\022\032\n\rcurrency_code\030\004 \001(\tB\003\340A\002\"\303\001\n\035Cr"
          + "eateConversionSourceRequest\022C\n\006parent\030\001 "
          + "\001(\tB3\340A\002\372A-\022+merchantapi.googleapis.com/"
          + "ConversionSource\022]\n\021conversion_source\030\002 "
          + "\001(\0132=.google.shopping.merchant.conversio"
          + "ns.v1beta.ConversionSourceB\003\340A\002\"\264\001\n\035Upda"
          + "teConversionSourceRequest\022]\n\021conversion_"
          + "source\030\001 \001(\0132=.google.shopping.merchant."
          + "conversions.v1beta.ConversionSourceB\003\340A\002"
          + "\0224\n\013update_mask\030\002 \001(\0132\032.google.protobuf."
          + "FieldMaskB\003\340A\002\"b\n\035DeleteConversionSource"
          + "Request\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+merchanta"
          + "pi.googleapis.com/ConversionSource\"d\n\037Un"
          + "deleteConversionSourceRequest\022A\n\004name\030\001 "
          + "\001(\tB3\340A\002\372A-\n+merchantapi.googleapis.com/"
          + "ConversionSource\"_\n\032GetConversionSourceR"
          + "equest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+merchantap"
          + "i.googleapis.com/ConversionSource\"\257\001\n\034Li"
          + "stConversionSourcesRequest\022C\n\006parent\030\001 \001"
          + "(\tB3\340A\002\372A-\022+merchantapi.googleapis.com/C"
          + "onversionSource\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022"
          + "\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\031\n\014show_deleted"
          + "\030\004 \001(\010B\003\340A\001\"\223\001\n\035ListConversionSourcesRes"
          + "ponse\022Y\n\022conversion_sources\030\001 \003(\0132=.goog"
          + "le.shopping.merchant.conversions.v1beta."
          + "ConversionSource\022\027\n\017next_page_token\030\002 \001("
          + "\t2\322\014\n\030ConversionSourcesService\022\224\002\n\026Creat"
          + "eConversionSource\022J.google.shopping.merc"
          + "hant.conversions.v1beta.CreateConversion"
          + "SourceRequest\032=.google.shopping.merchant"
          + ".conversions.v1beta.ConversionSource\"o\332A"
          + "\030parent,conversion_source\202\323\344\223\002N\"9/conver"
          + "sions/v1beta/{parent=accounts/*}/convers"
          + "ionSources:\021conversion_source\022\254\002\n\026Update"
          + "ConversionSource\022J.google.shopping.merch"
          + "ant.conversions.v1beta.UpdateConversionS"
          + "ourceRequest\032=.google.shopping.merchant."
          + "conversions.v1beta.ConversionSource\"\206\001\332A"
          + "\035conversion_source,update_mask\202\323\344\223\002`2K/c"
          + "onversions/v1beta/{conversion_source.nam"
          + "e=accounts/*/conversionSources/*}:\021conve"
          + "rsion_source\022\306\001\n\026DeleteConversionSource\022"
          + "J.google.shopping.merchant.conversions.v"
          + "1beta.DeleteConversionSourceRequest\032\026.go"
          + "ogle.protobuf.Empty\"H\332A\004name\202\323\344\223\002;*9/con"
          + "versions/v1beta/{name=accounts/*/convers"
          + "ionSources/*}\022\366\001\n\030UndeleteConversionSour"
          + "ce\022L.google.shopping.merchant.conversion"
          + "s.v1beta.UndeleteConversionSourceRequest"
          + "\032=.google.shopping.merchant.conversions."
          + "v1beta.ConversionSource\"M\202\323\344\223\002G\"B/conver"
          + "sions/v1beta/{name=accounts/*/conversion"
          + "Sources/*}:undelete:\001*\022\347\001\n\023GetConversion"
          + "Source\022G.google.shopping.merchant.conver"
          + "sions.v1beta.GetConversionSourceRequest\032"
          + "=.google.shopping.merchant.conversions.v"
          + "1beta.ConversionSource\"H\332A\004name\202\323\344\223\002;\0229/"
          + "conversions/v1beta/{name=accounts/*/conv"
          + "ersionSources/*}\022\372\001\n\025ListConversionSourc"
          + "es\022I.google.shopping.merchant.conversion"
          + "s.v1beta.ListConversionSourcesRequest\032J."
          + "google.shopping.merchant.conversions.v1b"
          + "eta.ListConversionSourcesResponse\"J\332A\006pa"
          + "rent\202\323\344\223\002;\0229/conversions/v1beta/{parent="
          + "accounts/*}/conversionSources\032G\312A\032mercha"
          + "ntapi.googleapis.com\322A\'https://www.googl"
          + "eapis.com/auth/contentB\337\001\n/com.google.sh"
          + "opping.merchant.conversions.v1betaB\026Conv"
          + "ersionSourcesProtoP\001ZWcloud.google.com/g"
          + "o/shopping/merchant/conversions/apiv1bet"
          + "a/conversionspb;conversionspb\352A8\n\"mercha"
          + "ntapi.googleapis.com/Account\022\022accounts/{"
          + "account}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_conversions_v1beta_ConversionSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_conversions_v1beta_ConversionSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_ConversionSource_descriptor,
            new java.lang.String[] {
              "GoogleAnalyticsLink",
              "MerchantCenterDestination",
              "Name",
              "State",
              "ExpireTime",
              "Controller",
              "SourceData",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_descriptor,
            new java.lang.String[] {
              "AttributionLookbackWindowDays", "AttributionModel", "ConversionType",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_ConversionType_descriptor =
        internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_ConversionType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_AttributionSettings_ConversionType_descriptor,
            new java.lang.String[] {
              "Name", "Report",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_GoogleAnalyticsLink_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_merchant_conversions_v1beta_GoogleAnalyticsLink_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_GoogleAnalyticsLink_descriptor,
            new java.lang.String[] {
              "PropertyId", "AttributionSettings", "Property",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_MerchantCenterDestination_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_merchant_conversions_v1beta_MerchantCenterDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_MerchantCenterDestination_descriptor,
            new java.lang.String[] {
              "Destination", "AttributionSettings", "DisplayName", "CurrencyCode",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_CreateConversionSourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_shopping_merchant_conversions_v1beta_CreateConversionSourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_CreateConversionSourceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ConversionSource",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_UpdateConversionSourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_shopping_merchant_conversions_v1beta_UpdateConversionSourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_UpdateConversionSourceRequest_descriptor,
            new java.lang.String[] {
              "ConversionSource", "UpdateMask",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_DeleteConversionSourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_shopping_merchant_conversions_v1beta_DeleteConversionSourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_DeleteConversionSourceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_UndeleteConversionSourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_shopping_merchant_conversions_v1beta_UndeleteConversionSourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_UndeleteConversionSourceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_GetConversionSourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_shopping_merchant_conversions_v1beta_GetConversionSourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_GetConversionSourceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "ShowDeleted",
            });
    internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_conversions_v1beta_ListConversionSourcesResponse_descriptor,
            new java.lang.String[] {
              "ConversionSources", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
