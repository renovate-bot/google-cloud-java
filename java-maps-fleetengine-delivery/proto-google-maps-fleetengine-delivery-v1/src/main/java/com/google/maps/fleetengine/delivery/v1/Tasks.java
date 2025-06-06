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
// source: google/maps/fleetengine/delivery/v1/tasks.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.delivery.v1;

public final class Tasks {
  private Tasks() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_delivery_v1_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_delivery_v1_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_delivery_v1_Task_JourneySharingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_delivery_v1_Task_JourneySharingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_VisibilityOption_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_VisibilityOption_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/maps/fleetengine/delivery/v1/ta"
          + "sks.proto\022\034maps.fleetengine.delivery.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\0320google/maps/fleeten"
          + "gine/delivery/v1/common.proto\032;google/ma"
          + "ps/fleetengine/delivery/v1/delivery_vehi"
          + "cles.proto\032\036google/protobuf/duration.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\267\014\n\004"
          + "Task\022\014\n\004name\030\001 \001(\t\022=\n\004type\030\002 \001(\0162\'.maps."
          + "fleetengine.delivery.v1.Task.TypeB\006\340A\002\340A"
          + "\005\022<\n\005state\030\003 \001(\0162(.maps.fleetengine.deli"
          + "very.v1.Task.StateB\003\340A\002\022D\n\014task_outcome\030"
          + "\t \001(\0162..maps.fleetengine.delivery.v1.Tas"
          + "k.TaskOutcome\0225\n\021task_outcome_time\030\n \001(\013"
          + "2\032.google.protobuf.Timestamp\022I\n\025task_out"
          + "come_location\030\013 \001(\0132*.maps.fleetengine.d"
          + "elivery.v1.LocationInfo\022b\n\034task_outcome_"
          + "location_source\030\014 \001(\0162<.maps.fleetengine"
          + ".delivery.v1.Task.TaskOutcomeLocationSou"
          + "rce\022\030\n\013tracking_id\030\004 \001(\tB\003\340A\005\022 \n\023deliver"
          + "y_vehicle_id\030\005 \001(\tB\003\340A\003\022I\n\020planned_locat"
          + "ion\030\006 \001(\0132*.maps.fleetengine.delivery.v1"
          + ".LocationInfoB\003\340A\005\0228\n\rtask_duration\030\007 \001("
          + "\0132\031.google.protobuf.DurationB\006\340A\002\340A\005\022D\n\022"
          + "target_time_window\030\016 \001(\0132(.maps.fleeteng"
          + "ine.delivery.v1.TimeWindow\022X\n\024journey_sh"
          + "aring_info\030\010 \001(\01325.maps.fleetengine.deli"
          + "very.v1.Task.JourneySharingInfoB\003\340A\003\022W\n\031"
          + "task_tracking_view_config\030\r \001(\01324.maps.f"
          + "leetengine.delivery.v1.TaskTrackingViewC"
          + "onfig\022?\n\nattributes\030\017 \003(\0132+.maps.fleeten"
          + "gine.delivery.v1.TaskAttribute\032\344\001\n\022Journ"
          + "eySharingInfo\022_\n\"remaining_vehicle_journ"
          + "ey_segments\030\001 \003(\01323.maps.fleetengine.del"
          + "ivery.v1.VehicleJourneySegment\022L\n\rlast_l"
          + "ocation\030\002 \001(\01325.maps.fleetengine.deliver"
          + "y.v1.DeliveryVehicleLocation\022\037\n\027last_loc"
          + "ation_snappable\030\003 \001(\010\"[\n\004Type\022\024\n\020TYPE_UN"
          + "SPECIFIED\020\000\022\n\n\006PICKUP\020\001\022\014\n\010DELIVERY\020\002\022\022\n"
          + "\016SCHEDULED_STOP\020\003\022\017\n\013UNAVAILABLE\020\004\"4\n\005St"
          + "ate\022\025\n\021STATE_UNSPECIFIED\020\000\022\010\n\004OPEN\020\001\022\n\n\006"
          + "CLOSED\020\002\"F\n\013TaskOutcome\022\034\n\030TASK_OUTCOME_"
          + "UNSPECIFIED\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n\006FAILED\020\002"
          + "\"r\n\031TaskOutcomeLocationSource\022,\n(TASK_OU"
          + "TCOME_LOCATION_SOURCE_UNSPECIFIED\020\000\022\014\n\010P"
          + "ROVIDER\020\002\022\031\n\025LAST_VEHICLE_LOCATION\020\003:G\352A"
          + "D\n\037fleetengine.googleapis.com/Task\022!prov"
          + "iders/{provider}/tasks/{task}\"\313\007\n\026TaskTr"
          + "ackingViewConfig\022o\n route_polyline_point"
          + "s_visibility\030\001 \001(\0132E.maps.fleetengine.de"
          + "livery.v1.TaskTrackingViewConfig.Visibil"
          + "ityOption\022p\n!estimated_arrival_time_visi"
          + "bility\030\002 \001(\0132E.maps.fleetengine.delivery"
          + ".v1.TaskTrackingViewConfig.VisibilityOpt"
          + "ion\022x\n)estimated_task_completion_time_vi"
          + "sibility\030\003 \001(\0132E.maps.fleetengine.delive"
          + "ry.v1.TaskTrackingViewConfig.VisibilityO"
          + "ption\022t\n%remaining_driving_distance_visi"
          + "bility\030\004 \001(\0132E.maps.fleetengine.delivery"
          + ".v1.TaskTrackingViewConfig.VisibilityOpt"
          + "ion\022n\n\037remaining_stop_count_visibility\030\005"
          + " \001(\0132E.maps.fleetengine.delivery.v1.Task"
          + "TrackingViewConfig.VisibilityOption\022j\n\033v"
          + "ehicle_location_visibility\030\006 \001(\0132E.maps."
          + "fleetengine.delivery.v1.TaskTrackingView"
          + "Config.VisibilityOption\032\201\002\n\020VisibilityOp"
          + "tion\022(\n\036remaining_stop_count_threshold\030\001"
          + " \001(\005H\000\022T\n/duration_until_estimated_arriv"
          + "al_time_threshold\030\002 \001(\0132\031.google.protobu"
          + "f.DurationH\000\0225\n+remaining_driving_distan"
          + "ce_meters_threshold\030\003 \001(\005H\000\022\020\n\006always\030\004 "
          + "\001(\010H\000\022\017\n\005never\030\005 \001(\010H\000B\023\n\021visibility_opt"
          + "ionB\372\001\n\'com.google.maps.fleetengine.deli"
          + "very.v1B\005TasksP\001ZIcloud.google.com/go/ma"
          + "ps/fleetengine/delivery/apiv1/deliverypb"
          + ";deliverypb\242\002\004CFED\252\002#Google.Maps.FleetEn"
          + "gine.Delivery.V1\312\002#Google\\Maps\\FleetEngi"
          + "ne\\Delivery\\V1\352\002\'Google::Maps::FleetEngi"
          + "ne::Delivery::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.maps.fleetengine.delivery.v1.Common.getDescriptor(),
              com.google.maps.fleetengine.delivery.v1.DeliveryVehicles.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_maps_fleetengine_delivery_v1_Task_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_maps_fleetengine_delivery_v1_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_delivery_v1_Task_descriptor,
            new java.lang.String[] {
              "Name",
              "Type",
              "State",
              "TaskOutcome",
              "TaskOutcomeTime",
              "TaskOutcomeLocation",
              "TaskOutcomeLocationSource",
              "TrackingId",
              "DeliveryVehicleId",
              "PlannedLocation",
              "TaskDuration",
              "TargetTimeWindow",
              "JourneySharingInfo",
              "TaskTrackingViewConfig",
              "Attributes",
            });
    internal_static_maps_fleetengine_delivery_v1_Task_JourneySharingInfo_descriptor =
        internal_static_maps_fleetengine_delivery_v1_Task_descriptor.getNestedTypes().get(0);
    internal_static_maps_fleetengine_delivery_v1_Task_JourneySharingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_delivery_v1_Task_JourneySharingInfo_descriptor,
            new java.lang.String[] {
              "RemainingVehicleJourneySegments", "LastLocation", "LastLocationSnappable",
            });
    internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_descriptor,
            new java.lang.String[] {
              "RoutePolylinePointsVisibility",
              "EstimatedArrivalTimeVisibility",
              "EstimatedTaskCompletionTimeVisibility",
              "RemainingDrivingDistanceVisibility",
              "RemainingStopCountVisibility",
              "VehicleLocationVisibility",
            });
    internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_VisibilityOption_descriptor =
        internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_VisibilityOption_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_delivery_v1_TaskTrackingViewConfig_VisibilityOption_descriptor,
            new java.lang.String[] {
              "RemainingStopCountThreshold",
              "DurationUntilEstimatedArrivalTimeThreshold",
              "RemainingDrivingDistanceMetersThreshold",
              "Always",
              "Never",
              "VisibilityOption",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.maps.fleetengine.delivery.v1.Common.getDescriptor();
    com.google.maps.fleetengine.delivery.v1.DeliveryVehicles.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
