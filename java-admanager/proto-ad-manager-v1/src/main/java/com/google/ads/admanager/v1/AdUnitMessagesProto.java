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
// source: google/ads/admanager/v1/ad_unit_messages.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public final class AdUnitMessagesProto {
  private AdUnitMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_AdUnit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_AdUnit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_AdUnitSize_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_AdUnitSize_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_AdUnitParent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_AdUnitParent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_LabelFrequencyCap_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_LabelFrequencyCap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ".google/ads/admanager/v1/ad_unit_messag"
          + "es.proto\022\027google.ads.admanager.v1\032+googl"
          + "e/ads/admanager/v1/ad_unit_enums.proto\032+google/ads/admanager/v1/applied_label.pr"
          + "oto\0323google/ads/admanager/v1/environment_type_enum.proto\032+google/ads/admanager/v"
          + "1/frequency_cap.proto\032\"google/ads/admana"
          + "ger/v1/size.proto\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\032\036g"
          + "oogle/protobuf/duration.proto\032\037google/protobuf/timestamp.proto\"\200\017\n"
          + "\006AdUnit\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\027\n\n"
          + "ad_unit_id\030\017 \001(\003B\003\340A\003\022G\n"
          + "\016parent_ad_unit\030\n"
          + " \001(\tB*\340A\002\340A\005\372A!\n"
          + "\037admanager.googleapis.com/AdUnitH\000\210\001\001\022?\n"
          + "\013parent_path\030\013"
          + " \003(\0132%.google.ads.admanager.v1.AdUnitParentB\003\340A\003\022\036\n"
          + "\014display_name\030\t \001(\tB\003\340A\002H\001\210\001\001\022!\n"
          + "\014ad_unit_code\030\002 \001(\tB\006\340A\001\340A\005H\002\210\001\001\022P\n"
          + "\006status\030\r"
          + " \001(\01626.google.ads.admanage"
          + "r.v1.AdUnitStatusEnum.AdUnitStatusB\003\340A\003H\003\210\001\001\022_\n"
          + "\025applied_target_window\030, \001(\01626.go"
          + "ogle.ads.admanager.v1.TargetWindowEnum.TargetWindowB\003\340A\001H\004\210\001\001\022d\n"
          + "\027effective_target_window\030- \001(\01626.google.ads.admanager.v1"
          + ".TargetWindowEnum.TargetWindowB\006\340A\007\340A\003H\005\210\001\001\022<\n\r"
          + "applied_teams\030\003 \003(\tB%\340A\001\372A\037\n"
          + "\035admanager.googleapis.com/Team\0224\n"
          + "\005teams\030\004 \003(\tB%\340A\003\372A\037\n"
          + "\035admanager.googleapis.com/Team\022\035\n"
          + "\013description\030\005 \001(\tB\003\340A\001H\006\210\001\001\022%\n"
          + "\023explicitly_targeted\030\006 \001(\010B\003\340A\001H\007\210\001\001\022\036\n"
          + "\014has_children\030\007 \001(\010B\003\340A\003H\010\210\001\001\0229\n"
          + "\013update_time\030\010 \001(\0132\032.google.protobuf.TimestampB\003\340A\003H"
          + "\t\210\001\001\022?\n\r"
          + "ad_unit_sizes\030\016"
          + " \003(\0132#.google.ads.admanager.v1.AdUnitSizeB\003\340A\001\0223\n"
          + "\037external_set_top_box_channel_id\030\021 \001(\tB\005\030\001\340A\001H\n"
          + "\210\001\001\022:\n\r"
          + "refresh_delay\030\023"
          + " \001(\0132\031.google.protobuf.DurationB\003\340A\001H\013\210\001\001\022B\n"
          + "\016applied_labels\030\025 \003"
          + "(\0132%.google.ads.admanager.v1.AppliedLabelB\003\340A\001\022L\n"
          + "\030effective_applied_labels\030\026 \003(\013"
          + "2%.google.ads.admanager.v1.AppliedLabelB\003\340A\003\022U\n"
          + "\034applied_label_frequency_caps\030\027 \003"
          + "(\0132*.google.ads.admanager.v1.LabelFrequencyCapB\003\340A\001\022W\n"
          + "\036effective_label_frequency_caps\030\030"
          + " \003(\0132*.google.ads.admanager.v1.LabelFrequencyCapB\003\340A\003\022^\n"
          + "\017smart_size_mode\030\031"
          + " \001(\01628.google.ads.admanager.v1.SmartSizeModeEnum.SmartSizeModeB\006\340A\001\340A\007H\014\210\001\001\022)\n"
          + "\027applied_adsense_enabled\030\032 \001(\010B\003\340A\001H\r"
          + "\210\001\001\022+\n"
          + "\031effective_adsense_enabled\030\033"
          + " \001(\010B\003\340A\003H\016\210\001\001:`\352A]\n"
          + "\037admanager.googleapis.com/AdUn"
          + "it\022)networks/{network_code}/adUnits/{ad_unit}*\007adUnits2\006adUnitB\021\n"
          + "\017_parent_ad_unitB\017\n\r"
          + "_display_nameB\017\n\r"
          + "_ad_unit_codeB\t\n"
          + "\007_statusB\030\n"
          + "\026_applied_target_windowB\032\n"
          + "\030_effective_target_windowB\016\n"
          + "\014_descriptionB\026\n"
          + "\024_explicitly_targetedB\017\n\r"
          + "_has_childrenB\016\n"
          + "\014_update_timeB\"\n"
          + " _external_set_top_box_channel_idB\020\n"
          + "\016_refresh_delayB\022\n"
          + "\020_smart_size_modeB\032\n"
          + "\030_applied_adsense_enabledB\034\n"
          + "\032_effective_adsense_enabled\"\316\001\n\n"
          + "AdUnitSize\0220\n"
          + "\004size\030\001 \001(\0132\035.google.ads.admanager.v1.SizeB\003\340A\002\022[\n"
          + "\020environment_type\030\002 \001(\0162<.g"
          + "oogle.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentTypeB\003\340A\002\0221\n\n"
          + "companions\030\003 \003(\0132\035.google.ads.admanager.v1.Size\"\205\001\n"
          + "\014AdUnitParent\022?\n"
          + "\016parent_ad_unit\030\001 \001(\tB\'\340A\003\372A!\n"
          + "\037admanager.googleapis.com/AdUnit\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\003\022\031\n"
          + "\014ad_unit_code\030\003 \001(\tB\003\340A\003\"\210\001\n"
          + "\021LabelFrequencyCap\0225\n"
          + "\005label\030\001 \001(\tB&\340A\002\372A \n"
          + "\036admanager.googleapis.com/Label\022<\n\r"
          + "frequency_cap\030\002 \001(\0132%.google.ads.admanager.v1.FrequencyCapB\307\001\n"
          + "\033com.google.ads.admanager.v1B\023AdUnitMessagesPro"
          + "toP\001Z@google.golang.org/genproto/googlea"
          + "pis/ads/admanager/v1;admanager\252\002\027Google."
          + "Ads.AdManager.V1\312\002\027Google\\Ads\\AdManager\\"
          + "V1\352\002\032Google::Ads::AdManager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.AdUnitEnumsProto.getDescriptor(),
              com.google.ads.admanager.v1.AppliedLabelProto.getDescriptor(),
              com.google.ads.admanager.v1.EnvironmentTypeEnumProto.getDescriptor(),
              com.google.ads.admanager.v1.FrequencyCapProto.getDescriptor(),
              com.google.ads.admanager.v1.SizeProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_AdUnit_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_AdUnit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_AdUnit_descriptor,
            new java.lang.String[] {
              "Name",
              "AdUnitId",
              "ParentAdUnit",
              "ParentPath",
              "DisplayName",
              "AdUnitCode",
              "Status",
              "AppliedTargetWindow",
              "EffectiveTargetWindow",
              "AppliedTeams",
              "Teams",
              "Description",
              "ExplicitlyTargeted",
              "HasChildren",
              "UpdateTime",
              "AdUnitSizes",
              "ExternalSetTopBoxChannelId",
              "RefreshDelay",
              "AppliedLabels",
              "EffectiveAppliedLabels",
              "AppliedLabelFrequencyCaps",
              "EffectiveLabelFrequencyCaps",
              "SmartSizeMode",
              "AppliedAdsenseEnabled",
              "EffectiveAdsenseEnabled",
            });
    internal_static_google_ads_admanager_v1_AdUnitSize_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_AdUnitSize_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_AdUnitSize_descriptor,
            new java.lang.String[] {
              "Size", "EnvironmentType", "Companions",
            });
    internal_static_google_ads_admanager_v1_AdUnitParent_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_AdUnitParent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_AdUnitParent_descriptor,
            new java.lang.String[] {
              "ParentAdUnit", "DisplayName", "AdUnitCode",
            });
    internal_static_google_ads_admanager_v1_LabelFrequencyCap_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_admanager_v1_LabelFrequencyCap_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_LabelFrequencyCap_descriptor,
            new java.lang.String[] {
              "Label", "FrequencyCap",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.AdUnitEnumsProto.getDescriptor();
    com.google.ads.admanager.v1.AppliedLabelProto.getDescriptor();
    com.google.ads.admanager.v1.EnvironmentTypeEnumProto.getDescriptor();
    com.google.ads.admanager.v1.FrequencyCapProto.getDescriptor();
    com.google.ads.admanager.v1.SizeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
