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
// source: google/cloud/talent/v4beta1/filters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.talent.v4beta1;

public final class FiltersProto {
  private FiltersProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_LocationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CommuteFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/talent/v4beta1/filters.pr"
          + "oto\022\033google.cloud.talent.v4beta1\032\037google"
          + "/api/field_behavior.proto\032(google/cloud/"
          + "talent/v4beta1/common.proto\032\036google/prot"
          + "obuf/duration.proto\032\030google/type/latlng."
          + "proto\032\033google/type/timeofday.proto\"\200\005\n\010J"
          + "obQuery\022\r\n\005query\030\001 \001(\t\022\033\n\023query_language"
          + "_code\030\016 \001(\t\022\021\n\tcompanies\030\002 \003(\t\022E\n\020locati"
          + "on_filters\030\003 \003(\0132+.google.cloud.talent.v"
          + "4beta1.LocationFilter\022@\n\016job_categories\030"
          + "\004 \003(\0162(.google.cloud.talent.v4beta1.JobC"
          + "ategory\022B\n\016commute_filter\030\005 \001(\0132*.google"
          + ".cloud.talent.v4beta1.CommuteFilter\022\035\n\025c"
          + "ompany_display_names\030\006 \003(\t\022L\n\023compensati"
          + "on_filter\030\007 \001(\0132/.google.cloud.talent.v4"
          + "beta1.CompensationFilter\022\037\n\027custom_attri"
          + "bute_filter\030\010 \001(\t\022\033\n\023disable_spell_check"
          + "\030\t \001(\010\022E\n\020employment_types\030\n \003(\0162+.googl"
          + "e.cloud.talent.v4beta1.EmploymentType\022\026\n"
          + "\016language_codes\030\013 \003(\t\022G\n\022publish_time_ra"
          + "nge\030\014 \001(\0132+.google.cloud.talent.v4beta1."
          + "TimestampRange\022\025\n\rexcluded_jobs\030\r \003(\t\"\203\003"
          + "\n\016LocationFilter\022\017\n\007address\030\001 \001(\t\022\023\n\013reg"
          + "ion_code\030\002 \001(\t\022$\n\007lat_lng\030\003 \001(\0132\023.google"
          + ".type.LatLng\022\031\n\021distance_in_miles\030\004 \001(\001\022"
          + "a\n\026telecommute_preference\030\005 \001(\0162A.google"
          + ".cloud.talent.v4beta1.LocationFilter.Tel"
          + "ecommutePreference\022\017\n\007negated\030\006 \001(\010\"\225\001\n\025"
          + "TelecommutePreference\022&\n\"TELECOMMUTE_PRE"
          + "FERENCE_UNSPECIFIED\020\000\022\034\n\024TELECOMMUTE_EXC"
          + "LUDED\020\001\032\002\010\001\022\027\n\023TELECOMMUTE_ALLOWED\020\002\022\035\n\031"
          + "TELECOMMUTE_JOBS_EXCLUDED\020\003\"\312\003\n\022Compensa"
          + "tionFilter\022M\n\004type\030\001 \001(\0162:.google.cloud."
          + "talent.v4beta1.CompensationFilter.Filter"
          + "TypeB\003\340A\002\022R\n\005units\030\002 \003(\0162>.google.cloud."
          + "talent.v4beta1.CompensationInfo.Compensa"
          + "tionUnitB\003\340A\002\022N\n\005range\030\003 \001(\0132?.google.cl"
          + "oud.talent.v4beta1.CompensationInfo.Comp"
          + "ensationRange\0228\n0include_jobs_with_unspe"
          + "cified_compensation_range\030\004 \001(\010\"\206\001\n\nFilt"
          + "erType\022\033\n\027FILTER_TYPE_UNSPECIFIED\020\000\022\r\n\tU"
          + "NIT_ONLY\020\001\022\023\n\017UNIT_AND_AMOUNT\020\002\022\032\n\026ANNUA"
          + "LIZED_BASE_AMOUNT\020\003\022\033\n\027ANNUALIZED_TOTAL_"
          + "AMOUNT\020\004\"\313\003\n\rCommuteFilter\022G\n\016commute_me"
          + "thod\030\001 \001(\0162*.google.cloud.talent.v4beta1"
          + ".CommuteMethodB\003\340A\002\0223\n\021start_coordinates"
          + "\030\002 \001(\0132\023.google.type.LatLngB\003\340A\002\0227\n\017trav"
          + "el_duration\030\003 \001(\0132\031.google.protobuf.Dura"
          + "tionB\003\340A\002\022!\n\031allow_imprecise_addresses\030\004"
          + " \001(\010\022N\n\014road_traffic\030\005 \001(\01626.google.clou"
          + "d.talent.v4beta1.CommuteFilter.RoadTraff"
          + "icH\000\0220\n\016departure_time\030\006 \001(\0132\026.google.ty"
          + "pe.TimeOfDayH\000\"L\n\013RoadTraffic\022\034\n\030ROAD_TR"
          + "AFFIC_UNSPECIFIED\020\000\022\020\n\014TRAFFIC_FREE\020\001\022\r\n"
          + "\tBUSY_HOUR\020\002B\020\n\016traffic_optionBp\n\037com.go"
          + "ogle.cloud.talent.v4beta1B\014FiltersProtoP"
          + "\001Z7cloud.google.com/go/talent/apiv4beta1"
          + "/talentpb;talentpb\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
              com.google.type.TimeOfDayProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_JobQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor,
            new java.lang.String[] {
              "Query",
              "QueryLanguageCode",
              "Companies",
              "LocationFilters",
              "JobCategories",
              "CommuteFilter",
              "CompanyDisplayNames",
              "CompensationFilter",
              "CustomAttributeFilter",
              "DisableSpellCheck",
              "EmploymentTypes",
              "LanguageCodes",
              "PublishTimeRange",
              "ExcludedJobs",
            });
    internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_LocationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor,
            new java.lang.String[] {
              "Address",
              "RegionCode",
              "LatLng",
              "DistanceInMiles",
              "TelecommutePreference",
              "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_CompensationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor,
            new java.lang.String[] {
              "Type", "Units", "Range", "IncludeJobsWithUnspecifiedCompensationRange",
            });
    internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_CommuteFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor,
            new java.lang.String[] {
              "CommuteMethod",
              "StartCoordinates",
              "TravelDuration",
              "AllowImpreciseAddresses",
              "RoadTraffic",
              "DepartureTime",
              "TrafficOption",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
