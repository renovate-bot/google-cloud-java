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
// source: google/cloud/tasks/v2beta2/task.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tasks.v2beta2;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_TaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_TaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AttemptStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AttemptStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/tasks/v2beta2/task.proto\022"
          + "\032google.cloud.tasks.v2beta2\032\031google/api/"
          + "resource.proto\032\'google/cloud/tasks/v2bet"
          + "a2/target.proto\032\037google/protobuf/timesta"
          + "mp.proto\032\027google/rpc/status.proto\"\351\004\n\004Ta"
          + "sk\022\014\n\004name\030\001 \001(\t\022S\n\027app_engine_http_requ"
          + "est\030\003 \001(\01320.google.cloud.tasks.v2beta2.A"
          + "ppEngineHttpRequestH\000\022?\n\014pull_message\030\004 "
          + "\001(\0132\'.google.cloud.tasks.v2beta2.PullMes"
          + "sageH\000\022?\n\014http_request\030\r \001(\0132\'.google.cl"
          + "oud.tasks.v2beta2.HttpRequestH\000\0221\n\rsched"
          + "ule_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013create_time\030\006 \001(\0132\032.google.protobu"
          + "f.Timestamp\0226\n\006status\030\007 \001(\0132&.google.clo"
          + "ud.tasks.v2beta2.TaskStatus\0223\n\004view\030\010 \001("
          + "\0162%.google.cloud.tasks.v2beta2.Task.View"
          + "\"1\n\004View\022\024\n\020VIEW_UNSPECIFIED\020\000\022\t\n\005BASIC\020"
          + "\001\022\010\n\004FULL\020\002:h\352Ae\n\036cloudtasks.googleapis."
          + "com/Task\022Cprojects/{project}/locations/{"
          + "location}/queues/{queue}/tasks/{task}B\016\n"
          + "\014payload_type\"\335\001\n\nTaskStatus\022\036\n\026attempt_"
          + "dispatch_count\030\001 \001(\005\022\036\n\026attempt_response"
          + "_count\030\002 \001(\005\022G\n\024first_attempt_status\030\003 \001"
          + "(\0132).google.cloud.tasks.v2beta2.AttemptS"
          + "tatus\022F\n\023last_attempt_status\030\004 \001(\0132).goo"
          + "gle.cloud.tasks.v2beta2.AttemptStatus\"\325\001"
          + "\n\rAttemptStatus\0221\n\rschedule_time\030\001 \001(\0132\032"
          + ".google.protobuf.Timestamp\0221\n\rdispatch_t"
          + "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\0221\n"
          + "\rresponse_time\030\003 \001(\0132\032.google.protobuf.T"
          + "imestamp\022+\n\017response_status\030\004 \001(\0132\022.goog"
          + "le.rpc.StatusBr\n\036com.google.cloud.tasks."
          + "v2beta2B\tTaskProtoP\001ZCcloud.google.com/g"
          + "o/cloudtasks/apiv2beta2/cloudtaskspb;clo"
          + "udtaskspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.tasks.v2beta2.TargetProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2beta2_Task_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta2_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_Task_descriptor,
            new java.lang.String[] {
              "Name",
              "AppEngineHttpRequest",
              "PullMessage",
              "HttpRequest",
              "ScheduleTime",
              "CreateTime",
              "Status",
              "View",
              "PayloadType",
            });
    internal_static_google_cloud_tasks_v2beta2_TaskStatus_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta2_TaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_TaskStatus_descriptor,
            new java.lang.String[] {
              "AttemptDispatchCount",
              "AttemptResponseCount",
              "FirstAttemptStatus",
              "LastAttemptStatus",
            });
    internal_static_google_cloud_tasks_v2beta2_AttemptStatus_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2beta2_AttemptStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AttemptStatus_descriptor,
            new java.lang.String[] {
              "ScheduleTime", "DispatchTime", "ResponseTime", "ResponseStatus",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2beta2.TargetProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
