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
// source: google/cloud/parallelstore/v1/parallelstore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.parallelstore.v1;

public final class ParallelstoreProto {
  private ParallelstoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_SourceGcsBucket_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_SourceGcsBucket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_DestinationGcsBucket_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_DestinationGcsBucket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_SourceParallelstore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_SourceParallelstore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_DestinationParallelstore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_DestinationParallelstore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ImportDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ImportDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ExportDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ExportDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ImportDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ImportDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_TransferErrorLogEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_TransferErrorLogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_TransferErrorSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_TransferErrorSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ImportDataMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ImportDataMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ExportDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ExportDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_ExportDataMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_ExportDataMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_TransferOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_TransferOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1_TransferCounters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1_TransferCounters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "1google/cloud/parallelstore/v1/parallelstore.proto\022\035google.cloud.parallelstore."
          + "v1\032\034google/api/annotations.proto\032\027google"
          + "/api/client.proto\032\037google/api/field_beha"
          + "vior.proto\032\033google/api/field_info.proto\032"
          + "\031google/api/resource.proto\032#google/longr"
          + "unning/operations.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask"
          + ".proto\032\037google/protobuf/timestamp.proto\032\025google/rpc/code.proto\"\371\010\n"
          + "\010Instance\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\030\n"
          + "\013description\030\002 \001(\tB\003\340A\001\022A\n"
          + "\005state\030\003"
          + " \001(\0162-.google.cloud.parallelstore.v1.Instance.StateB\003\340A\003\0224\n"
          + "\013create_time\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022H\n"
          + "\006labels\030\006 \003(\01323.google"
          + ".cloud.parallelstore.v1.Instance.LabelsEntryB\003\340A\001\022\034\n"
          + "\014capacity_gib\030\010 \001(\003B\006\340A\005\340A\002\022\033\n"
          + "\014daos_version\030\t \001(\tB\005\030\001\340A\003\022\032\n\r"
          + "access_points\030\n"
          + " \003(\tB\003\340A\003\022:\n"
          + "\007network\030\013 \001(\tB)\340A\005\340A\001\372A \n"
          + "\036compute.googleapis.com/Network\022D\n"
          + "\021reserved_ip_range\030\014 \001(\tB)\340A\005\340A\001\372A \n"
          + "\036compute.googleapis.com/Address\022N\n"
          + "\033effective_reserved_ip_range\030\016 \001(\tB)\340A\005\340A\003\372A \n"
          + "\036compute.googleapis.com/Address\022Q\n"
          + "\021file_stripe_level\030\017"
          + " \001(\0162..google.cloud.parallelstore.v1.FileStripeLevelB\006\340A\005\340A\001\022[\n"
          + "\026directory_stripe_level\030\020 \001(\01623.google.cloud.par"
          + "allelstore.v1.DirectoryStripeLevelB\006\340A\005\340A\001\022N\n"
          + "\017deployment_type\030\021 \001(\0162-.google.clo"
          + "ud.parallelstore.v1.DeploymentTypeB\006\340A\005\340A\001\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"p\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\n\n"
          + "\006ACTIVE\020\002\022\014\n"
          + "\010DELETING\020\003\022\n\n"
          + "\006FAILED\020\004\022\r\n"
          + "\tUPGRADING\020\005\022\r\n"
          + "\tREPAIRING\020\006:}\352Az\n"
          + "%parallelstore.googleapis.com/I"
          + "nstance\022<projects/{project}/locations/{location}/instances/{instance}*"
          + "\tinstances2\010instance\"\262\001\n"
          + "\024ListInstancesRequest\022=\n"
          + "\006parent\030\001 \001("
          + "\tB-\340A\002\372A\'\022%parallelstore.googleapis.com/Instance\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\201\001\n"
          + "\025ListInstancesResponse\022:\n"
          + "\tinstances\030\001 \003(\0132\'.google.cloud.parallelstore.v1.Instance\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"Q\n"
          + "\022GetInstanceRequest\022;\n"
          + "\004name\030\001 \001(\tB-\340A\002\372A\'\n"
          + "%parallelstore.googleapis.com/Instance\"\311\001\n"
          + "\025CreateInstanceRequest\022=\n"
          + "\006parent\030\001 \001("
          + "\tB-\340A\002\372A\'\022%parallelstore.googleapis.com/Instance\022\030\n"
          + "\013instance_id\030\002 \001(\tB\003\340A\002\022>\n"
          + "\010instance\030\003"
          + " \001(\0132\'.google.cloud.parallelstore.v1.InstanceB\003\340A\002\022\027\n\n"
          + "request_id\030\004 \001(\tB\003\340A\001\"\246\001\n"
          + "\025UpdateInstanceRequest\0224\n"
          + "\013update_mask\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022>\n"
          + "\010instance\030\002"
          + " \001(\0132\'.google.cloud.parallelstore.v1.InstanceB\003\340A\002\022\027\n\n"
          + "request_id\030\003 \001(\tB\003\340A\001\"m\n"
          + "\025DeleteInstanceRequest\022;\n"
          + "\004name\030\001 \001(\tB-\340A\002\372A\'\n"
          + "%parallelstore.googleapis.com/Instance\022\027\n\n"
          + "request_id\030\002 \001(\tB\003\340A\001\"\200\002\n"
          + "\021OperationMetadata\0224\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\004 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\005 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\007 \001(\tB\003\340A\003\"#\n"
          + "\017SourceGcsBucket\022\020\n"
          + "\003uri\030\001 \001(\tB\003\340A\002\"(\n"
          + "\024DestinationGcsBucket\022\020\n"
          + "\003uri\030\001 \001(\tB\003\340A\002\"(\n"
          + "\023SourceParallelstore\022\021\n"
          + "\004path\030\001 \001(\tB\003\340A\001\"-\n"
          + "\030DestinationParallelstore\022\021\n"
          + "\004path\030\001 \001(\tB\003\340A\001\"\371\002\n"
          + "\021ImportDataRequest\022K\n"
          + "\021source_gcs_bucket\030\002"
          + " \001(\0132..google.cloud.parallelstore.v1.SourceGcsBucketH\000\022\\\n"
          + "\031destination_parallelstore\030\003"
          + " \001(\01327.google.cloud.parallelstore.v1.DestinationParallelstoreH\001\022;\n"
          + "\004name\030\001 \001(\tB-\340A\002\372A\'\n"
          + "%parallelstore.googleapis.com/Instance\022\037\n\n"
          + "request_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\022B\n"
          + "\017service_account\030\005 \001(\tB)\340A\001\372A#\n"
          + "!iam.googleapis.com/ServiceAccountB\010\n"
          + "\006sourceB\r\n"
          + "\013destination\"\371\002\n"
          + "\021ExportDataRequest\022R\n"
          + "\024source_parallelstore\030\002 \001(\01322.google.c"
          + "loud.parallelstore.v1.SourceParallelstoreH\000\022U\n"
          + "\026destination_gcs_bucket\030\003 \001(\01323.go"
          + "ogle.cloud.parallelstore.v1.DestinationGcsBucketH\001\022;\n"
          + "\004name\030\001 \001(\tB-\340A\002\372A\'\n"
          + "%parallelstore.googleapis.com/Instance\022\037\n\n"
          + "request_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\022B\n"
          + "\017service_account\030\005 \001(\tB)\340A\001\372A#\n"
          + "!iam.googleapis.com/ServiceAccountB\010\n"
          + "\006sourceB\r\n"
          + "\013destination\"\024\n"
          + "\022ImportDataResponse\";\n"
          + "\025TransferErrorLogEntry\022\013\n"
          + "\003uri\030\001 \001(\t\022\025\n\r"
          + "error_details\030\002 \003(\t\"\242\001\n"
          + "\024TransferErrorSummary\022$\n\n"
          + "error_code\030\001 \001(\0162\020.google.rpc.Code\022\023\n"
          + "\013error_count\030\002 \001(\003\022O\n"
          + "\021error_log_entries\030\004 \003(\01324.google"
          + ".cloud.parallelstore.v1.TransferErrorLogEntry\"\327\002\n"
          + "\022ImportDataMetadata\022T\n"
          + "\022operation_metadata\030\001"
          + " \001(\01328.google.cloud.parallelstore.v1.TransferOperationMetadata\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\004 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\005 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\006 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\007 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\010 \001(\tB\003\340A\003\"\024\n"
          + "\022ExportDataResponse\"\327\002\n"
          + "\022ExportDataMetadata\022T\n"
          + "\022operation_metadata\030\001 \001(\01328.google.cloud."
          + "parallelstore.v1.TransferOperationMetadata\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\004 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\005 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\006 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\007 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\010 \001(\tB\003\340A\003\"\200\005\n"
          + "\031TransferOperationMetadata\022W\n"
          + "\024source_parallelstore\030\007 \001(\01322.google.cloud.paral"
          + "lelstore.v1.SourceParallelstoreB\003\340A\003H\000\022P\n"
          + "\021source_gcs_bucket\030\010 \001(\0132..google.cloud"
          + ".parallelstore.v1.SourceGcsBucketB\003\340A\003H\000\022Z\n"
          + "\026destination_gcs_bucket\030\t \001(\01323.googl"
          + "e.cloud.parallelstore.v1.DestinationGcsBucketB\003\340A\003H\001\022a\n"
          + "\031destination_parallelstore\030\n"
          + " \001(\01327.google.cloud.parallelstore.v1.DestinationParallelstoreB\003\340A\003H\001\022F\n"
          + "\010counters\030\003"
          + " \001(\0132/.google.cloud.parallelstore.v1.TransferCountersB\003\340A\003\022G\n\r"
          + "transfer_type\030\006"
          + " \001(\0162+.google.cloud.parallelstore.v1.TransferTypeB\003\340A\003\022O\n\r"
          + "error_summary\030\r"
          + " \003(\01323.google.cloud.parallelstore.v1.TransferErrorSummaryB\003\340A\003B\010\n"
          + "\006sourceB\r\n"
          + "\013destination\"\312\001\n"
          + "\020TransferCounters\022\025\n\r"
          + "objects_found\030\001 \001(\003\022\023\n"
          + "\013bytes_found\030\002 \001(\003\022\027\n"
          + "\017objects_skipped\030\003 \001(\003\022\025\n\r"
          + "bytes_skipped\030\004 \001(\003\022\026\n"
          + "\016objects_copied\030\005 \001(\003\022\024\n"
          + "\014bytes_copied\030\006 \001(\003\022\026\n"
          + "\016objects_failed\030\007 \001(\003\022\024\n"
          + "\014bytes_failed\030\010 \001(\003*E\n"
          + "\014TransferType\022\035\n"
          + "\031TRANSFER_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006IMPORT\020\001\022\n\n"
          + "\006EXPORT\020\002*\212\001\n"
          + "\017FileStripeLevel\022!\n"
          + "\035FILE_STRIPE_LEVEL_UNSPECIFIED\020\000\022\031\n"
          + "\025FILE_STRIPE_LEVEL_MIN\020\001\022\036\n"
          + "\032FILE_STRIPE_LEVEL_BALANCED\020\002\022\031\n"
          + "\025FILE_STRIPE_LEVEL_MAX\020\003*\243\001\n"
          + "\024DirectoryStripeLevel\022&\n"
          + "\"DIRECTORY_STRIPE_LEVEL_UNSPECIFIED\020\000\022\036\n"
          + "\032DIRECTORY_STRIPE_LEVEL_MIN\020\001\022#\n"
          + "\037DIRECTORY_STRIPE_LEVEL_BALANCED\020\002\022\036\n"
          + "\032DIRECTORY_STRIPE_LEVEL_MAX\020\003*N\n"
          + "\016DeploymentType\022\037\n"
          + "\033DEPLOYMENT_TYPE_UNSPECIFIED\020\000\022\013\n"
          + "\007SCRATCH\020\001\022\016\n\n"
          + "PERSISTENT\020\0022\213\014\n\r"
          + "Parallelstore\022\272\001\n\r"
          + "ListInstances\0223.google.cloud.parallelstore.v1.ListInstancesRequest\0324.goo"
          + "gle.cloud.parallelstore.v1.ListInstances"
          + "Response\">\332A\006parent\202\323\344\223\002/\022-/v1/{parent=projects/*/locations/*}/instances\022\247\001\n"
          + "\013GetInstance\0221.google.cloud.parallelstore.v1"
          + ".GetInstanceRequest\032\'.google.cloud.paral"
          + "lelstore.v1.Instance\"<\332A\004name\202\323\344\223\002/\022-/v1"
          + "/{name=projects/*/locations/*/instances/*}\022\344\001\n"
          + "\016CreateInstance\0224.google.cloud.par"
          + "allelstore.v1.CreateInstanceRequest\032\035.google.longrunning.Operation\"}\312A\035\n"
          + "\010Instance\022\021OperationMetadata\332A\033parent,instance,i"
          + "nstance_id\202\323\344\223\0029\"-/v1/{parent=projects/*/locations/*}/instances:\010instance\022\346\001\n"
          + "\016UpdateInstance\0224.google.cloud.parallelstor"
          + "e.v1.UpdateInstanceRequest\032\035.google.longrunning.Operation\"\177\312A\035\n"
          + "\010Instance\022\021Operat"
          + "ionMetadata\332A\024instance,update_mask\202\323\344\223\002B"
          + "26/v1/{instance.name=projects/*/locations/*/instances/*}:\010instance\022\320\001\n"
          + "\016DeleteInstance\0224.google.cloud.parallelstore.v1.De"
          + "leteInstanceRequest\032\035.google.longrunning.Operation\"i\312A*\n"
          + "\025google.protobuf.Empty\022\021"
          + "OperationMetadata\332A\004name\202\323\344\223\002/*-/v1/{nam"
          + "e=projects/*/locations/*/instances/*}\022\315\001\n\n"
          + "ImportData\0220.google.cloud.parallelstor"
          + "e.v1.ImportDataRequest\032\035.google.longrunning.Operation\"n\312A(\n"
          + "\022ImportDataResponse\022\022ImportDataMetadata\202\323\344\223\002=\"8/v1/{name=proj"
          + "ects/*/locations/*/instances/*}:importData:\001*\022\315\001\n\n"
          + "ExportData\0220.google.cloud.para"
          + "llelstore.v1.ExportDataRequest\032\035.google.longrunning.Operation\"n\312A(\n"
          + "\022ExportDataResponse\022\022ExportDataMetadata\202\323\344\223\002=\"8/v1/{n"
          + "ame=projects/*/locations/*/instances/*}:"
          + "exportData:\001*\032P\312A\034parallelstore.googleap"
          + "is.com\322A.https://www.googleapis.com/auth/cloud-platformB\356\003\n"
          + "!com.google.cloud.parallelstore.v1B\022ParallelstoreProtoP\001ZGclo"
          + "ud.google.com/go/parallelstore/apiv1/par"
          + "allelstorepb;parallelstorepb\252\002\035Google.Cl"
          + "oud.Parallelstore.V1\312\002\035Google\\Cloud\\Parallelstore\\V1\352\002"
          + " Google::Cloud::Parallelstore::V1\352AN\n"
          + "\036compute.googleapis.com/Netwo"
          + "rk\022,projects/{project}/global/networks/{network}\352AY\n"
          + "\036compute.googleapis.com/Addr"
          + "ess\0227projects/{project}/regions/{region}/addresses/{address}\352AY\n"
          + "!iam.googleapis.com/ServiceAccount\0224projects/{project}/s"
          + "erviceAccounts/{service_account}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.CodeProto.getDescriptor(),
            });
    internal_static_google_cloud_parallelstore_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_parallelstore_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "State",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "CapacityGib",
              "DaosVersion",
              "AccessPoints",
              "Network",
              "ReservedIpRange",
              "EffectiveReservedIpRange",
              "FileStripeLevel",
              "DirectoryStripeLevel",
              "DeploymentType",
            });
    internal_static_google_cloud_parallelstore_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_parallelstore_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_parallelstore_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_parallelstore_v1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_parallelstore_v1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_parallelstore_v1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_parallelstore_v1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_parallelstore_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_parallelstore_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_parallelstore_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_parallelstore_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance", "RequestId",
            });
    internal_static_google_cloud_parallelstore_v1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_parallelstore_v1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance", "RequestId",
            });
    internal_static_google_cloud_parallelstore_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_parallelstore_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_parallelstore_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_parallelstore_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_parallelstore_v1_SourceGcsBucket_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_parallelstore_v1_SourceGcsBucket_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_SourceGcsBucket_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_parallelstore_v1_DestinationGcsBucket_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_parallelstore_v1_DestinationGcsBucket_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_DestinationGcsBucket_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_parallelstore_v1_SourceParallelstore_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_parallelstore_v1_SourceParallelstore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_SourceParallelstore_descriptor,
            new java.lang.String[] {
              "Path",
            });
    internal_static_google_cloud_parallelstore_v1_DestinationParallelstore_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_parallelstore_v1_DestinationParallelstore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_DestinationParallelstore_descriptor,
            new java.lang.String[] {
              "Path",
            });
    internal_static_google_cloud_parallelstore_v1_ImportDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_parallelstore_v1_ImportDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ImportDataRequest_descriptor,
            new java.lang.String[] {
              "SourceGcsBucket",
              "DestinationParallelstore",
              "Name",
              "RequestId",
              "ServiceAccount",
              "Source",
              "Destination",
            });
    internal_static_google_cloud_parallelstore_v1_ExportDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_parallelstore_v1_ExportDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ExportDataRequest_descriptor,
            new java.lang.String[] {
              "SourceParallelstore",
              "DestinationGcsBucket",
              "Name",
              "RequestId",
              "ServiceAccount",
              "Source",
              "Destination",
            });
    internal_static_google_cloud_parallelstore_v1_ImportDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_parallelstore_v1_ImportDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ImportDataResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_parallelstore_v1_TransferErrorLogEntry_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_parallelstore_v1_TransferErrorLogEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_TransferErrorLogEntry_descriptor,
            new java.lang.String[] {
              "Uri", "ErrorDetails",
            });
    internal_static_google_cloud_parallelstore_v1_TransferErrorSummary_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_parallelstore_v1_TransferErrorSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_TransferErrorSummary_descriptor,
            new java.lang.String[] {
              "ErrorCode", "ErrorCount", "ErrorLogEntries",
            });
    internal_static_google_cloud_parallelstore_v1_ImportDataMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_parallelstore_v1_ImportDataMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ImportDataMetadata_descriptor,
            new java.lang.String[] {
              "OperationMetadata",
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_parallelstore_v1_ExportDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_parallelstore_v1_ExportDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ExportDataResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_parallelstore_v1_ExportDataMetadata_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_parallelstore_v1_ExportDataMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_ExportDataMetadata_descriptor,
            new java.lang.String[] {
              "OperationMetadata",
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_parallelstore_v1_TransferOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_parallelstore_v1_TransferOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_TransferOperationMetadata_descriptor,
            new java.lang.String[] {
              "SourceParallelstore",
              "SourceGcsBucket",
              "DestinationGcsBucket",
              "DestinationParallelstore",
              "Counters",
              "TransferType",
              "ErrorSummary",
              "Source",
              "Destination",
            });
    internal_static_google_cloud_parallelstore_v1_TransferCounters_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_parallelstore_v1_TransferCounters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1_TransferCounters_descriptor,
            new java.lang.String[] {
              "ObjectsFound",
              "BytesFound",
              "ObjectsSkipped",
              "BytesSkipped",
              "ObjectsCopied",
              "BytesCopied",
              "ObjectsFailed",
              "BytesFailed",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.CodeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
