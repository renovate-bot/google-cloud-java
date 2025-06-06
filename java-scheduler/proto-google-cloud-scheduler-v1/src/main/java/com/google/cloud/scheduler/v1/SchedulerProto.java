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
// source: google/cloud/scheduler/v1/cloudscheduler.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.scheduler.v1;

public final class SchedulerProto {
  private SchedulerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_PauseJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_PauseJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_ResumeJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_ResumeJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_RunJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_RunJobRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/scheduler/v1/cloudschedul"
          + "er.proto\022\031google.cloud.scheduler.v1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032#google/c"
          + "loud/scheduler/v1/job.proto\032\033google/prot"
          + "obuf/empty.proto\032 google/protobuf/field_"
          + "mask.proto\"s\n\017ListJobsRequest\0229\n\006parent\030"
          + "\001 \001(\tB)\340A\002\372A#\022!cloudscheduler.googleapis"
          + ".com/Job\022\021\n\tpage_size\030\005 \001(\005\022\022\n\npage_toke"
          + "n\030\006 \001(\t\"Y\n\020ListJobsResponse\022,\n\004jobs\030\001 \003("
          + "\0132\036.google.cloud.scheduler.v1.Job\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"H\n\rGetJobRequest\0227\n\004n"
          + "ame\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.google"
          + "apis.com/Job\"\177\n\020CreateJobRequest\0229\n\006pare"
          + "nt\030\001 \001(\tB)\340A\002\372A#\022!cloudscheduler.googlea"
          + "pis.com/Job\0220\n\003job\030\002 \001(\0132\036.google.cloud."
          + "scheduler.v1.JobB\003\340A\002\"u\n\020UpdateJobReques"
          + "t\0220\n\003job\030\001 \001(\0132\036.google.cloud.scheduler."
          + "v1.JobB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.googl"
          + "e.protobuf.FieldMask\"K\n\020DeleteJobRequest"
          + "\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.g"
          + "oogleapis.com/Job\"J\n\017PauseJobRequest\0227\n\004"
          + "name\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.googl"
          + "eapis.com/Job\"K\n\020ResumeJobRequest\0227\n\004nam"
          + "e\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.googleap"
          + "is.com/Job\"H\n\rRunJobRequest\0227\n\004name\030\001 \001("
          + "\tB)\340A\002\372A#\n!cloudscheduler.googleapis.com"
          + "/Job2\263\n\n\016CloudScheduler\022\236\001\n\010ListJobs\022*.g"
          + "oogle.cloud.scheduler.v1.ListJobsRequest"
          + "\032+.google.cloud.scheduler.v1.ListJobsRes"
          + "ponse\"9\332A\006parent\202\323\344\223\002*\022(/v1/{parent=proj"
          + "ects/*/locations/*}/jobs\022\213\001\n\006GetJob\022(.go"
          + "ogle.cloud.scheduler.v1.GetJobRequest\032\036."
          + "google.cloud.scheduler.v1.Job\"7\332A\004name\202\323"
          + "\344\223\002*\022(/v1/{name=projects/*/locations/*/j"
          + "obs/*}\022\234\001\n\tCreateJob\022+.google.cloud.sche"
          + "duler.v1.CreateJobRequest\032\036.google.cloud"
          + ".scheduler.v1.Job\"B\332A\nparent,job\202\323\344\223\002/\"("
          + "/v1/{parent=projects/*/locations/*}/jobs"
          + ":\003job\022\245\001\n\tUpdateJob\022+.google.cloud.sched"
          + "uler.v1.UpdateJobRequest\032\036.google.cloud."
          + "scheduler.v1.Job\"K\332A\017job,update_mask\202\323\344\223"
          + "\00232,/v1/{job.name=projects/*/locations/*"
          + "/jobs/*}:\003job\022\211\001\n\tDeleteJob\022+.google.clo"
          + "ud.scheduler.v1.DeleteJobRequest\032\026.googl"
          + "e.protobuf.Empty\"7\332A\004name\202\323\344\223\002**(/v1/{na"
          + "me=projects/*/locations/*/jobs/*}\022\230\001\n\010Pa"
          + "useJob\022*.google.cloud.scheduler.v1.Pause"
          + "JobRequest\032\036.google.cloud.scheduler.v1.J"
          + "ob\"@\332A\004name\202\323\344\223\0023\"./v1/{name=projects/*/"
          + "locations/*/jobs/*}:pause:\001*\022\233\001\n\tResumeJ"
          + "ob\022+.google.cloud.scheduler.v1.ResumeJob"
          + "Request\032\036.google.cloud.scheduler.v1.Job\""
          + "A\332A\004name\202\323\344\223\0024\"//v1/{name=projects/*/loc"
          + "ations/*/jobs/*}:resume:\001*\022\222\001\n\006RunJob\022(."
          + "google.cloud.scheduler.v1.RunJobRequest\032"
          + "\036.google.cloud.scheduler.v1.Job\">\332A\004name"
          + "\202\323\344\223\0021\",/v1/{name=projects/*/locations/*"
          + "/jobs/*}:run:\001*\032Q\312A\035cloudscheduler.googl"
          + "eapis.com\322A.https://www.googleapis.com/a"
          + "uth/cloud-platformBz\n\035com.google.cloud.s"
          + "cheduler.v1B\016SchedulerProtoP\001Z;cloud.goo"
          + "gle.com/go/scheduler/apiv1/schedulerpb;s"
          + "chedulerpb\242\002\tSCHEDULERb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.scheduler.v1.JobProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_scheduler_v1_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_scheduler_v1_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken",
            });
    internal_static_google_cloud_scheduler_v1_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_scheduler_v1_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_scheduler_v1_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Job",
            });
    internal_static_google_cloud_scheduler_v1_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_scheduler_v1_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask",
            });
    internal_static_google_cloud_scheduler_v1_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_scheduler_v1_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_PauseJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_scheduler_v1_PauseJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_PauseJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_ResumeJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_scheduler_v1_ResumeJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_ResumeJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_RunJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_scheduler_v1_RunJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_RunJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.cloud.scheduler.v1.JobProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
