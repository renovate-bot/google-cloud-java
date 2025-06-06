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
// source: google/cloud/workflows/executions/v1beta/executions.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.workflows.executions.v1beta;

public final class ExecutionsProto {
  private ExecutionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_executions_v1beta_Execution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1beta_Execution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_executions_v1beta_Execution_Error_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1beta_Execution_Error_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_executions_v1beta_CreateExecutionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1beta_CreateExecutionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_executions_v1beta_GetExecutionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1beta_GetExecutionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_executions_v1beta_CancelExecutionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1beta_CancelExecutionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "9google/cloud/workflows/executions/v1beta/executions.proto\022(google.cloud.workfl"
          + "ows.executions.v1beta\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\032\037google/protobuf/timestamp.proto\"\370\004\n"
          + "\tExecution\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\0223\n\n"
          + "start_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022M\n"
          + "\005state\030\004 \001("
          + "\01629.google.cloud.workflows.executions.v1beta.Execution.StateB\003\340A\003\022\020\n"
          + "\010argument\030\005 \001(\t\022\023\n"
          + "\006result\030\006 \001(\tB\003\340A\003\022M\n"
          + "\005error\030\007 \001(\0132"
          + "9.google.cloud.workflows.executions.v1beta.Execution.ErrorB\003\340A\003\022!\n"
          + "\024workflow_revision_id\030\010 \001(\tB\003\340A\003\032)\n"
          + "\005Error\022\017\n"
          + "\007payload\030\001 \001(\t\022\017\n"
          + "\007context\030\002 \001(\t\"T\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\n\n"
          + "\006ACTIVE\020\001\022\r\n"
          + "\tSUCCEEDED\020\002\022\n\n"
          + "\006FAILED\020\003\022\r\n"
          + "\tCANCELLED\020\004:\206\001\352A\202\001\n"
          + "+workflowexecutions.googleapis.com/Execution\022"
          + "Sprojects/{project}/locations/{location}"
          + "/workflows/{workflow}/executions/{execution}\"\305\001\n"
          + "\025ListExecutionsRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!workflows.googleapis.com/Workflow\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\022J\n"
          + "\004view\030\004 \001(\01627.google.cloud.wo"
          + "rkflows.executions.v1beta.ExecutionViewB\003\340A\001\"z\n"
          + "\026ListExecutionsResponse\022G\n\n"
          + "executions\030\001"
          + " \003(\01323.google.cloud.workflows.executions.v1beta.Execution\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\240\001\n"
          + "\026CreateExecutionRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!workflows.googleapis.com/Workflow\022K\n"
          + "\texecution\030\002 \001(\01323.goog"
          + "le.cloud.workflows.executions.v1beta.ExecutionB\003\340A\002\"\244\001\n"
          + "\023GetExecutionRequest\022A\n"
          + "\004name\030\001 \001(\tB3\340A\002\372A-\n"
          + "+workflowexecutions.googleapis.com/Execution\022J\n"
          + "\004view\030\002 \001(\01627.g"
          + "oogle.cloud.workflows.executions.v1beta.ExecutionViewB\003\340A\001\"[\n"
          + "\026CancelExecutionRequest\022A\n"
          + "\004name\030\001 \001(\tB3\340A\002\372A-\n"
          + "+workflowexecutions.googleapis.com/Execution*D\n\r"
          + "ExecutionView\022\036\n"
          + "\032EXECUTION_VIEW_UNSPECIFIED\020\000\022\t\n"
          + "\005BASIC\020\001\022\010\n"
          + "\004FULL\020\0022\363\007\n\n"
          + "Executions\022\344\001\n"
          + "\016ListExecutions\022?.google.cloud.workflows.executions.v1beta.ListExecutionsRequest"
          + "\032@.google.cloud.workflows.executions.v1b"
          + "eta.ListExecutionsResponse\"O\332A\006parent\202\323\344"
          + "\223\002@\022>/v1beta/{parent=projects/*/locations/*/workflows/*}/executions\022\356\001\n"
          + "\017CreateExecution\022@.google.cloud.workflows.executi"
          + "ons.v1beta.CreateExecutionRequest\0323.google.cloud.workflows.executions.v1beta.Exe"
          + "cution\"d\332A\020parent,execution\202\323\344\223\002K\">/v1be"
          + "ta/{parent=projects/*/locations/*/workflows/*}/executions:\texecution\022\321\001\n"
          + "\014GetExecution\022=.google.cloud.workflows.execution"
          + "s.v1beta.GetExecutionRequest\0323.google.cloud.workflows.executions.v1beta.Executio"
          + "n\"M\332A\004name\202\323\344\223\002@\022>/v1beta/{name=projects"
          + "/*/locations/*/workflows/*/executions/*}\022\341\001\n"
          + "\017CancelExecution\022@.google.cloud.workflows.executions.v1beta.CancelExecutionR"
          + "equest\0323.google.cloud.workflows.executio"
          + "ns.v1beta.Execution\"W\332A\004name\202\323\344\223\002J\"E/v1b"
          + "eta/{name=projects/*/locations/*/workflo"
          + "ws/*/executions/*}:cancel:\001*\032U\312A!workflo"
          + "wexecutions.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\363\001\n"
          + ",com.google.cloud.workflows.executions.v1"
          + "betaB\017ExecutionsProtoP\001ZLcloud.google.co"
          + "m/go/workflows/executions/apiv1beta/executionspb;executionspb\352Aa\n"
          + "!workflows.googleapis.com/Workflow\022<projects/{project}/"
          + "locations/{location}/workflows/{workflow}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_workflows_executions_v1beta_Execution_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_workflows_executions_v1beta_Execution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_executions_v1beta_Execution_descriptor,
            new java.lang.String[] {
              "Name",
              "StartTime",
              "EndTime",
              "State",
              "Argument",
              "Result",
              "Error",
              "WorkflowRevisionId",
            });
    internal_static_google_cloud_workflows_executions_v1beta_Execution_Error_descriptor =
        internal_static_google_cloud_workflows_executions_v1beta_Execution_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_workflows_executions_v1beta_Execution_Error_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_executions_v1beta_Execution_Error_descriptor,
            new java.lang.String[] {
              "Payload", "Context",
            });
    internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "View",
            });
    internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_executions_v1beta_ListExecutionsResponse_descriptor,
            new java.lang.String[] {
              "Executions", "NextPageToken",
            });
    internal_static_google_cloud_workflows_executions_v1beta_CreateExecutionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_workflows_executions_v1beta_CreateExecutionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_executions_v1beta_CreateExecutionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Execution",
            });
    internal_static_google_cloud_workflows_executions_v1beta_GetExecutionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_workflows_executions_v1beta_GetExecutionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_executions_v1beta_GetExecutionRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_workflows_executions_v1beta_CancelExecutionRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_workflows_executions_v1beta_CancelExecutionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_executions_v1beta_CancelExecutionRequest_descriptor,
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
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
