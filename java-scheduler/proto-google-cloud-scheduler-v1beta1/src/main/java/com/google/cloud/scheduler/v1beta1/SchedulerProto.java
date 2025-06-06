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
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.scheduler.v1beta1;

public final class SchedulerProto {
  private SchedulerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/scheduler/v1beta1/cloudsc"
          + "heduler.proto\022\036google.cloud.scheduler.v1"
          + "beta1\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032(google/cloud/scheduler/v1beta1/job.pro"
          + "to\032\033google/protobuf/empty.proto\032 google/"
          + "protobuf/field_mask.proto\"\243\001\n\017ListJobsRe"
          + "quest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!cloudsche"
          + "duler.googleapis.com/Job\022\016\n\006filter\030\004 \001(\t"
          + "\022\021\n\tpage_size\030\005 \001(\005\022\022\n\npage_token\030\006 \001(\t\022"
          + "\036\n\026legacy_app_engine_cron\030\007 \001(\010\"^\n\020ListJ"
          + "obsResponse\0221\n\004jobs\030\001 \003(\0132#.google.cloud"
          + ".scheduler.v1beta1.Job\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\"H\n\rGetJobRequest\0227\n\004name\030\001 \001(\tB)"
          + "\340A\002\372A#\n!cloudscheduler.googleapis.com/Jo"
          + "b\"\204\001\n\020CreateJobRequest\0229\n\006parent\030\001 \001(\tB)"
          + "\340A\002\372A#\022!cloudscheduler.googleapis.com/Jo"
          + "b\0225\n\003job\030\002 \001(\0132#.google.cloud.scheduler."
          + "v1beta1.JobB\003\340A\002\"z\n\020UpdateJobRequest\0225\n\003"
          + "job\030\001 \001(\0132#.google.cloud.scheduler.v1bet"
          + "a1.JobB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.googl"
          + "e.protobuf.FieldMask\"k\n\020DeleteJobRequest"
          + "\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.g"
          + "oogleapis.com/Job\022\036\n\026legacy_app_engine_c"
          + "ron\030\002 \001(\010\"J\n\017PauseJobRequest\0227\n\004name\030\001 \001"
          + "(\tB)\340A\002\372A#\n!cloudscheduler.googleapis.co"
          + "m/Job\"K\n\020ResumeJobRequest\0227\n\004name\030\001 \001(\tB"
          + ")\340A\002\372A#\n!cloudscheduler.googleapis.com/J"
          + "ob\"h\n\rRunJobRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A"
          + "#\n!cloudscheduler.googleapis.com/Job\022\036\n\026"
          + "legacy_app_engine_cron\030\002 \001(\0102\246\013\n\016CloudSc"
          + "heduler\022\255\001\n\010ListJobs\022/.google.cloud.sche"
          + "duler.v1beta1.ListJobsRequest\0320.google.c"
          + "loud.scheduler.v1beta1.ListJobsResponse\""
          + ">\332A\006parent\202\323\344\223\002/\022-/v1beta1/{parent=proje"
          + "cts/*/locations/*}/jobs\022\232\001\n\006GetJob\022-.goo"
          + "gle.cloud.scheduler.v1beta1.GetJobReques"
          + "t\032#.google.cloud.scheduler.v1beta1.Job\"<"
          + "\332A\004name\202\323\344\223\002/\022-/v1beta1/{name=projects/*"
          + "/locations/*/jobs/*}\022\253\001\n\tCreateJob\0220.goo"
          + "gle.cloud.scheduler.v1beta1.CreateJobReq"
          + "uest\032#.google.cloud.scheduler.v1beta1.Jo"
          + "b\"G\332A\nparent,job\202\323\344\223\0024\"-/v1beta1/{parent"
          + "=projects/*/locations/*}/jobs:\003job\022\264\001\n\tU"
          + "pdateJob\0220.google.cloud.scheduler.v1beta"
          + "1.UpdateJobRequest\032#.google.cloud.schedu"
          + "ler.v1beta1.Job\"P\332A\017job,update_mask\202\323\344\223\002"
          + "821/v1beta1/{job.name=projects/*/locatio"
          + "ns/*/jobs/*}:\003job\022\223\001\n\tDeleteJob\0220.google"
          + ".cloud.scheduler.v1beta1.DeleteJobReques"
          + "t\032\026.google.protobuf.Empty\"<\332A\004name\202\323\344\223\002/"
          + "*-/v1beta1/{name=projects/*/locations/*/"
          + "jobs/*}\022\247\001\n\010PauseJob\022/.google.cloud.sche"
          + "duler.v1beta1.PauseJobRequest\032#.google.c"
          + "loud.scheduler.v1beta1.Job\"E\332A\004name\202\323\344\223\002"
          + "8\"3/v1beta1/{name=projects/*/locations/*"
          + "/jobs/*}:pause:\001*\022\252\001\n\tResumeJob\0220.google"
          + ".cloud.scheduler.v1beta1.ResumeJobReques"
          + "t\032#.google.cloud.scheduler.v1beta1.Job\"F"
          + "\332A\004name\202\323\344\223\0029\"4/v1beta1/{name=projects/*"
          + "/locations/*/jobs/*}:resume:\001*\022\241\001\n\006RunJo"
          + "b\022-.google.cloud.scheduler.v1beta1.RunJo"
          + "bRequest\032#.google.cloud.scheduler.v1beta"
          + "1.Job\"C\332A\004name\202\323\344\223\0026\"1/v1beta1/{name=pro"
          + "jects/*/locations/*/jobs/*}:run:\001*\032Q\312A\035c"
          + "loudscheduler.googleapis.com\322A.https://w"
          + "ww.googleapis.com/auth/cloud-platformB\204\001"
          + "\n\"com.google.cloud.scheduler.v1beta1B\016Sc"
          + "hedulerProtoP\001Z@cloud.google.com/go/sche"
          + "duler/apiv1beta1/schedulerpb;schedulerpb"
          + "\242\002\tSCHEDULERb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.scheduler.v1beta1.JobProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "LegacyAppEngineCron",
            });
    internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken",
            });
    internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Job",
            });
    internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask",
            });
    internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "LegacyAppEngineCron",
            });
    internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_PauseJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_ResumeJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1beta1_RunJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "LegacyAppEngineCron",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.scheduler.v1beta1.JobProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
