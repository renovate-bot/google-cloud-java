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
// source: google/cloud/cloudcontrolspartner/v1beta/customer_workloads.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.cloudcontrolspartner.v1beta;

public final class CustomerWorkloadsProto {
  private CustomerWorkloadsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Workload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Workload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_GetWorkloadRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_GetWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingStep_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingStep_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "Agoogle/cloud/cloudcontrolspartner/v1beta/customer_workloads.proto\022(google.clou"
          + "d.cloudcontrolspartner.v1beta\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032?google/cloud/cloudcontrolspar"
          + "tner/v1beta/completion_state.proto\032\037google/protobuf/timestamp.proto\"\312\006\n"
          + "\010Workload\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\026\n"
          + "\tfolder_id\030\002 \001(\003B\003\340A\003\0224\n"
          + "\013create_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006folder\030\004 \001(\tB\003\340A\003\022d\n"
          + "\031workload_onboarding_state\030\005 \001(\0132A.goog"
          + "le.cloud.cloudcontrolspartner.v1beta.WorkloadOnboardingState\022\024\n"
          + "\014is_onboarded\030\006 \001(\010\022!\n"
          + "\031key_management_project_id\030\007 \001(\t\022\020\n"
          + "\010location\030\010 \001(\t\022K\n"
          + "\007partner\030\t \001(\0162:.googl"
          + "e.cloud.cloudcontrolspartner.v1beta.Workload.Partner\"\242\002\n"
          + "\007Partner\022\027\n"
          + "\023PARTNER_UNSPECIFIED\020\000\022\"\n"
          + "\036PARTNER_LOCAL_CONTROLS_BY_S3NS\020\001\022+\n"
          + "\'PARTNER_SOVEREIGN_CONTROLS_BY_T_SYSTEMS\020\002\022-\n"
          + ")PARTNER_SOVEREIGN_CONTROLS_BY_SIA_MINSAIT\020\003\022%\n"
          + "!PARTNER_SOVEREIGN_CONTROLS_BY_PSN\020\004\022\'\n"
          + "#PARTNER_SOVEREIGN_CONTROLS_BY_CNTXT\020\006\022.\n"
          + "*PARTNER_SOVEREIGN_CONTROLS_BY_CNTXT_NO_EKM\020\007:\244\001\352A\240\001\n"
          + ",cloudcontrolspartner.googleapis.com/Workload\022["
          + "organizations/{organization}/locations/{"
          + "location}/customers/{customer}/workloads/{workload}*"
          + "\tworkloads2\010workload\"\257\001\n"
          + "\024ListWorkloadsRequest\022D\n"
          + "\006parent\030\001 \001(\tB4\340A\002\372A"
          + ".\022,cloudcontrolspartner.googleapis.com/Workload\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\214\001\n"
          + "\025ListWorkloadsResponse\022E\n"
          + "\tworkloads\030\001"
          + " \003(\01322.google.cloud.cloudcontrolspartner.v1beta.Workload\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"X\n"
          + "\022GetWorkloadRequest\022B\n"
          + "\004name\030\001 \001(\tB4\340A\002\372A.\n"
          + ",cloudcontrolspartner.googleapis.com/Workload\"u\n"
          + "\027WorkloadOnboardingState\022Z\n"
          + "\020onboarding_steps\030\001 \003(\0132@.google.cloud.cloudcon"
          + "trolspartner.v1beta.WorkloadOnboardingStep\"\206\003\n"
          + "\026WorkloadOnboardingStep\022S\n"
          + "\004step\030\001 "
          + "\001(\0162E.google.cloud.cloudcontrolspartner.v1beta.WorkloadOnboardingStep.Step\022.\n\n"
          + "start_time\030\002 \001(\0132\032.google.protobuf.Timestamp\0223\n"
          + "\017completion_time\030\003 \001(\0132\032.google.protobuf.Timestamp\022X\n"
          + "\020completion_state\030\004 \001("
          + "\01629.google.cloud.cloudcontrolspartner.v1beta.CompletionStateB\003\340A\003\"X\n"
          + "\004Step\022\024\n"
          + "\020STEP_UNSPECIFIED\020\000\022\023\n"
          + "\017EKM_PROVISIONED\020\001\022%\n"
          + "!SIGNED_ACCESS_APPROVAL_CONFIGURED\020\002B\256\002\n"
          + ",com.google.cloud.cloudcontrolspartner.v1"
          + "betaB\026CustomerWorkloadsProtoP\001Z`cloud.google.com/go/cloudcontrolspartner/apiv1be"
          + "ta/cloudcontrolspartnerpb;cloudcontrolspartnerpb\252\002(Google.Cloud.CloudControlsPar"
          + "tner.V1Beta\312\002(Google\\Cloud\\CloudControls"
          + "Partner\\V1beta\352\002+Google::Cloud::CloudControlsPartner::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.CompletionStateProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Workload_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Workload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_Workload_descriptor,
            new java.lang.String[] {
              "Name",
              "FolderId",
              "CreateTime",
              "Folder",
              "WorkloadOnboardingState",
              "IsOnboarded",
              "KeyManagementProjectId",
              "Location",
              "Partner",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_ListWorkloadsResponse_descriptor,
            new java.lang.String[] {
              "Workloads", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_GetWorkloadRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_GetWorkloadRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_GetWorkloadRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingState_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingState_descriptor,
            new java.lang.String[] {
              "OnboardingSteps",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingStep_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingStep_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_WorkloadOnboardingStep_descriptor,
            new java.lang.String[] {
              "Step", "StartTime", "CompletionTime", "CompletionState",
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
    com.google.cloud.cloudcontrolspartner.v1beta.CompletionStateProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
