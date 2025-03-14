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
// source: google/cloud/parallelstore/v1beta/parallelstore.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.parallelstore.v1beta;

public final class ParallelstoreProto {
  private ParallelstoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_SourceGcsBucket_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_SourceGcsBucket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_DestinationGcsBucket_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_DestinationGcsBucket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_SourceParallelstore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_SourceParallelstore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_DestinationParallelstore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_DestinationParallelstore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ImportDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ImportDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ExportDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ExportDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ImportDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ImportDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ImportDataMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ImportDataMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ExportDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ExportDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_ExportDataMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_ExportDataMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_TransferOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_TransferOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_parallelstore_v1beta_TransferCounters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_parallelstore_v1beta_TransferCounters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/parallelstore/v1beta/para"
          + "llelstore.proto\022!google.cloud.parallelst"
          + "ore.v1beta\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\032\033google/api/field_inf"
          + "o.proto\032\031google/api/resource.proto\032#goog"
          + "le/longrunning/operations.proto\032\033google/"
          + "protobuf/empty.proto\032 google/protobuf/fi"
          + "eld_mask.proto\032\037google/protobuf/timestam"
          + "p.proto\"\363\010\n\010Instance\022\021\n\004name\030\001 \001(\tB\003\340A\010\022"
          + "\030\n\013description\030\002 \001(\tB\003\340A\001\022E\n\005state\030\003 \001(\016"
          + "21.google.cloud.parallelstore.v1beta.Ins"
          + "tance.StateB\003\340A\003\0224\n\013create_time\030\004 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0224\n\013update"
          + "_time\030\005 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022L\n\006labels\030\006 \003(\01327.google.cloud.para"
          + "llelstore.v1beta.Instance.LabelsEntryB\003\340"
          + "A\001\022\034\n\014capacity_gib\030\010 \001(\003B\006\340A\005\340A\002\022\031\n\014daos"
          + "_version\030\t \001(\tB\003\340A\003\022\032\n\raccess_points\030\n \003"
          + "(\tB\003\340A\003\022:\n\007network\030\013 \001(\tB)\340A\005\340A\001\372A \n\036com"
          + "pute.googleapis.com/Network\022D\n\021reserved_"
          + "ip_range\030\014 \001(\tB)\340A\005\340A\001\372A \n\036compute.googl"
          + "eapis.com/Address\022N\n\033effective_reserved_"
          + "ip_range\030\016 \001(\tB)\340A\005\340A\003\372A \n\036compute.googl"
          + "eapis.com/Address\022R\n\021file_stripe_level\030\017"
          + " \001(\01622.google.cloud.parallelstore.v1beta"
          + ".FileStripeLevelB\003\340A\001\022\\\n\026directory_strip"
          + "e_level\030\020 \001(\01627.google.cloud.parallelsto"
          + "re.v1beta.DirectoryStripeLevelB\003\340A\001\022O\n\017d"
          + "eployment_type\030\021 \001(\01621.google.cloud.para"
          + "llelstore.v1beta.DeploymentTypeB\003\340A\001\032-\n\013"
          + "LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:"
          + "\0028\001\"a\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010C"
          + "REATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010DELETING\020\003\022\n\n\006F"
          + "AILED\020\004\022\r\n\tUPGRADING\020\005:}\352Az\n%parallelsto"
          + "re.googleapis.com/Instance\022<projects/{pr"
          + "oject}/locations/{location}/instances/{i"
          + "nstance}*\tinstances2\010instance\"\262\001\n\024ListIn"
          + "stancesRequest\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\022%"
          + "parallelstore.googleapis.com/Instance\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001("
          + "\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030"
          + "\005 \001(\tB\003\340A\001\"\205\001\n\025ListInstancesResponse\022>\n\t"
          + "instances\030\001 \003(\0132+.google.cloud.parallels"
          + "tore.v1beta.Instance\022\027\n\017next_page_token\030"
          + "\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"Q\n\022GetInstanc"
          + "eRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%parallel"
          + "store.googleapis.com/Instance\"\315\001\n\025Create"
          + "InstanceRequest\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\022"
          + "%parallelstore.googleapis.com/Instance\022\030"
          + "\n\013instance_id\030\002 \001(\tB\003\340A\002\022B\n\010instance\030\003 \001"
          + "(\0132+.google.cloud.parallelstore.v1beta.I"
          + "nstanceB\003\340A\002\022\027\n\nrequest_id\030\004 \001(\tB\003\340A\001\"\252\001"
          + "\n\025UpdateInstanceRequest\0224\n\013update_mask\030\001"
          + " \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022B\n"
          + "\010instance\030\002 \001(\0132+.google.cloud.parallels"
          + "tore.v1beta.InstanceB\003\340A\002\022\027\n\nrequest_id\030"
          + "\003 \001(\tB\003\340A\001\"m\n\025DeleteInstanceRequest\022;\n\004n"
          + "ame\030\001 \001(\tB-\340A\002\372A\'\n%parallelstore.googlea"
          + "pis.com/Instance\022\027\n\nrequest_id\030\002 \001(\tB\003\340A"
          + "\001\"\200\002\n\021OperationMetadata\0224\n\013create_time\030\001"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 "
          + "\001(\tB\003\340A\003\022\033\n\016status_message\030\005 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n\013ap"
          + "i_version\030\007 \001(\tB\003\340A\003\"#\n\017SourceGcsBucket\022"
          + "\020\n\003uri\030\001 \001(\tB\003\340A\002\"(\n\024DestinationGcsBucke"
          + "t\022\020\n\003uri\030\001 \001(\tB\003\340A\002\"(\n\023SourceParallelsto"
          + "re\022\021\n\004path\030\001 \001(\tB\003\340A\001\"-\n\030DestinationPara"
          + "llelstore\022\021\n\004path\030\001 \001(\tB\003\340A\001\"\201\003\n\021ImportD"
          + "ataRequest\022O\n\021source_gcs_bucket\030\002 \001(\01322."
          + "google.cloud.parallelstore.v1beta.Source"
          + "GcsBucketH\000\022`\n\031destination_parallelstore"
          + "\030\003 \001(\0132;.google.cloud.parallelstore.v1be"
          + "ta.DestinationParallelstoreH\001\022;\n\004name\030\001 "
          + "\001(\tB-\340A\002\372A\'\n%parallelstore.googleapis.co"
          + "m/Instance\022\037\n\nrequest_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010"
          + "\002\010\001\022B\n\017service_account\030\005 \001(\tB)\340A\001\372A#\n!ia"
          + "m.googleapis.com/ServiceAccountB\010\n\006sourc"
          + "eB\r\n\013destination\"\201\003\n\021ExportDataRequest\022V"
          + "\n\024source_parallelstore\030\002 \001(\01326.google.cl"
          + "oud.parallelstore.v1beta.SourceParallels"
          + "toreH\000\022Y\n\026destination_gcs_bucket\030\003 \001(\01327"
          + ".google.cloud.parallelstore.v1beta.Desti"
          + "nationGcsBucketH\001\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n"
          + "%parallelstore.googleapis.com/Instance\022\037"
          + "\n\nrequest_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\022B\n\017servi"
          + "ce_account\030\005 \001(\tB)\340A\001\372A#\n!iam.googleapis"
          + ".com/ServiceAccountB\010\n\006sourceB\r\n\013destina"
          + "tion\"\024\n\022ImportDataResponse\"\333\002\n\022ImportDat"
          + "aMetadata\022X\n\022operation_metadata\030\001 \001(\0132<."
          + "google.cloud.parallelstore.v1beta.Transf"
          + "erOperationMetadata\0224\n\013create_time\030\002 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0221\n\010end"
          + "_time\030\003 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022\023\n\006target\030\004 \001(\tB\003\340A\003\022\021\n\004verb\030\005 \001(\tB"
          + "\003\340A\003\022\033\n\016status_message\030\006 \001(\tB\003\340A\003\022#\n\026req"
          + "uested_cancellation\030\007 \001(\010B\003\340A\003\022\030\n\013api_ve"
          + "rsion\030\010 \001(\tB\003\340A\003\"\024\n\022ExportDataResponse\"\333"
          + "\002\n\022ExportDataMetadata\022X\n\022operation_metad"
          + "ata\030\001 \001(\0132<.google.cloud.parallelstore.v"
          + "1beta.TransferOperationMetadata\0224\n\013creat"
          + "e_time\030\002 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\0221\n\010end_time\030\003 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\022\023\n\006target\030\004 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\005 \001(\tB\003\340A\003\022\033\n\016status_message\030\006 \001(\t"
          + "B\003\340A\003\022#\n\026requested_cancellation\030\007 \001(\010B\003\340"
          + "A\003\022\030\n\013api_version\030\010 \001(\tB\003\340A\003\"\307\004\n\031Transfe"
          + "rOperationMetadata\022[\n\024source_parallelsto"
          + "re\030\007 \001(\01326.google.cloud.parallelstore.v1"
          + "beta.SourceParallelstoreB\003\340A\003H\000\022T\n\021sourc"
          + "e_gcs_bucket\030\010 \001(\01322.google.cloud.parall"
          + "elstore.v1beta.SourceGcsBucketB\003\340A\003H\000\022^\n"
          + "\026destination_gcs_bucket\030\t \001(\01327.google.c"
          + "loud.parallelstore.v1beta.DestinationGcs"
          + "BucketB\003\340A\003H\001\022e\n\031destination_parallelsto"
          + "re\030\n \001(\0132;.google.cloud.parallelstore.v1"
          + "beta.DestinationParallelstoreB\003\340A\003H\001\022J\n\010"
          + "counters\030\003 \001(\01323.google.cloud.parallelst"
          + "ore.v1beta.TransferCountersB\003\340A\003\022K\n\rtran"
          + "sfer_type\030\006 \001(\0162/.google.cloud.parallels"
          + "tore.v1beta.TransferTypeB\003\340A\003B\010\n\006sourceB"
          + "\r\n\013destination\"\234\001\n\020TransferCounters\022\025\n\ro"
          + "bjects_found\030\001 \001(\003\022\023\n\013bytes_found\030\002 \001(\003\022"
          + "\027\n\017objects_skipped\030\003 \001(\003\022\025\n\rbytes_skippe"
          + "d\030\004 \001(\003\022\026\n\016objects_copied\030\005 \001(\003\022\024\n\014bytes"
          + "_copied\030\006 \001(\003*E\n\014TransferType\022\035\n\031TRANSFE"
          + "R_TYPE_UNSPECIFIED\020\000\022\n\n\006IMPORT\020\001\022\n\n\006EXPO"
          + "RT\020\002*\212\001\n\017FileStripeLevel\022!\n\035FILE_STRIPE_"
          + "LEVEL_UNSPECIFIED\020\000\022\031\n\025FILE_STRIPE_LEVEL"
          + "_MIN\020\001\022\036\n\032FILE_STRIPE_LEVEL_BALANCED\020\002\022\031"
          + "\n\025FILE_STRIPE_LEVEL_MAX\020\003*\243\001\n\024DirectoryS"
          + "tripeLevel\022&\n\"DIRECTORY_STRIPE_LEVEL_UNS"
          + "PECIFIED\020\000\022\036\n\032DIRECTORY_STRIPE_LEVEL_MIN"
          + "\020\001\022#\n\037DIRECTORY_STRIPE_LEVEL_BALANCED\020\002\022"
          + "\036\n\032DIRECTORY_STRIPE_LEVEL_MAX\020\003*N\n\016Deplo"
          + "ymentType\022\037\n\033DEPLOYMENT_TYPE_UNSPECIFIED"
          + "\020\000\022\013\n\007SCRATCH\020\001\022\016\n\nPERSISTENT\020\0022\315\014\n\rPara"
          + "llelstore\022\306\001\n\rListInstances\0227.google.clo"
          + "ud.parallelstore.v1beta.ListInstancesReq"
          + "uest\0328.google.cloud.parallelstore.v1beta"
          + ".ListInstancesResponse\"B\332A\006parent\202\323\344\223\0023\022"
          + "1/v1beta/{parent=projects/*/locations/*}"
          + "/instances\022\263\001\n\013GetInstance\0225.google.clou"
          + "d.parallelstore.v1beta.GetInstanceReques"
          + "t\032+.google.cloud.parallelstore.v1beta.In"
          + "stance\"@\332A\004name\202\323\344\223\0023\0221/v1beta/{name=pro"
          + "jects/*/locations/*/instances/*}\022\355\001\n\016Cre"
          + "ateInstance\0228.google.cloud.parallelstore"
          + ".v1beta.CreateInstanceRequest\032\035.google.l"
          + "ongrunning.Operation\"\201\001\312A\035\n\010Instance\022\021Op"
          + "erationMetadata\332A\033parent,instance,instan"
          + "ce_id\202\323\344\223\002=\"1/v1beta/{parent=projects/*/"
          + "locations/*}/instances:\010instance\022\357\001\n\016Upd"
          + "ateInstance\0228.google.cloud.parallelstore"
          + ".v1beta.UpdateInstanceRequest\032\035.google.l"
          + "ongrunning.Operation\"\203\001\312A\035\n\010Instance\022\021Op"
          + "erationMetadata\332A\024instance,update_mask\202\323"
          + "\344\223\002F2:/v1beta/{instance.name=projects/*/"
          + "locations/*/instances/*}:\010instance\022\330\001\n\016D"
          + "eleteInstance\0228.google.cloud.parallelsto"
          + "re.v1beta.DeleteInstanceRequest\032\035.google"
          + ".longrunning.Operation\"m\312A*\n\025google.prot"
          + "obuf.Empty\022\021OperationMetadata\332A\004name\202\323\344\223"
          + "\0023*1/v1beta/{name=projects/*/locations/*"
          + "/instances/*}\022\325\001\n\nImportData\0224.google.cl"
          + "oud.parallelstore.v1beta.ImportDataReque"
          + "st\032\035.google.longrunning.Operation\"r\312A(\n\022"
          + "ImportDataResponse\022\022ImportDataMetadata\202\323"
          + "\344\223\002A\"</v1beta/{name=projects/*/locations"
          + "/*/instances/*}:importData:\001*\022\325\001\n\nExport"
          + "Data\0224.google.cloud.parallelstore.v1beta"
          + ".ExportDataRequest\032\035.google.longrunning."
          + "Operation\"r\312A(\n\022ExportDataResponse\022\022Expo"
          + "rtDataMetadata\202\323\344\223\002A\"</v1beta/{name=proj"
          + "ects/*/locations/*/instances/*}:exportDa"
          + "ta:\001*\032P\312A\034parallelstore.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\202\004\n%com.google.cloud.parallelsto"
          + "re.v1betaB\022ParallelstoreProtoP\001ZKcloud.g"
          + "oogle.com/go/parallelstore/apiv1beta/par"
          + "allelstorepb;parallelstorepb\252\002!Google.Cl"
          + "oud.Parallelstore.V1Beta\312\002!Google\\Cloud\\"
          + "Parallelstore\\V1beta\352\002$Google::Cloud::Pa"
          + "rallelstore::V1beta\352AN\n\036compute.googleap"
          + "is.com/Network\022,projects/{project}/globa"
          + "l/networks/{network}\352AY\n\036compute.googlea"
          + "pis.com/Address\0227projects/{project}/regi"
          + "ons/{region}/addresses/{address}\352AY\n!iam"
          + ".googleapis.com/ServiceAccount\0224projects"
          + "/{project}/serviceAccounts/{service_acco"
          + "unt}b\006proto3"
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
            });
    internal_static_google_cloud_parallelstore_v1beta_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_parallelstore_v1beta_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_Instance_descriptor,
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
    internal_static_google_cloud_parallelstore_v1beta_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_parallelstore_v1beta_Instance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_parallelstore_v1beta_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_parallelstore_v1beta_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_parallelstore_v1beta_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_parallelstore_v1beta_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_parallelstore_v1beta_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_parallelstore_v1beta_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_parallelstore_v1beta_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_parallelstore_v1beta_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_parallelstore_v1beta_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance", "RequestId",
            });
    internal_static_google_cloud_parallelstore_v1beta_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_parallelstore_v1beta_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance", "RequestId",
            });
    internal_static_google_cloud_parallelstore_v1beta_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_parallelstore_v1beta_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_parallelstore_v1beta_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_parallelstore_v1beta_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_parallelstore_v1beta_SourceGcsBucket_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_parallelstore_v1beta_SourceGcsBucket_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_SourceGcsBucket_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_parallelstore_v1beta_DestinationGcsBucket_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_parallelstore_v1beta_DestinationGcsBucket_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_DestinationGcsBucket_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_parallelstore_v1beta_SourceParallelstore_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_parallelstore_v1beta_SourceParallelstore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_SourceParallelstore_descriptor,
            new java.lang.String[] {
              "Path",
            });
    internal_static_google_cloud_parallelstore_v1beta_DestinationParallelstore_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_parallelstore_v1beta_DestinationParallelstore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_DestinationParallelstore_descriptor,
            new java.lang.String[] {
              "Path",
            });
    internal_static_google_cloud_parallelstore_v1beta_ImportDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_parallelstore_v1beta_ImportDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ImportDataRequest_descriptor,
            new java.lang.String[] {
              "SourceGcsBucket",
              "DestinationParallelstore",
              "Name",
              "RequestId",
              "ServiceAccount",
              "Source",
              "Destination",
            });
    internal_static_google_cloud_parallelstore_v1beta_ExportDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_parallelstore_v1beta_ExportDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ExportDataRequest_descriptor,
            new java.lang.String[] {
              "SourceParallelstore",
              "DestinationGcsBucket",
              "Name",
              "RequestId",
              "ServiceAccount",
              "Source",
              "Destination",
            });
    internal_static_google_cloud_parallelstore_v1beta_ImportDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_parallelstore_v1beta_ImportDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ImportDataResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_parallelstore_v1beta_ImportDataMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_parallelstore_v1beta_ImportDataMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ImportDataMetadata_descriptor,
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
    internal_static_google_cloud_parallelstore_v1beta_ExportDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_parallelstore_v1beta_ExportDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ExportDataResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_parallelstore_v1beta_ExportDataMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_parallelstore_v1beta_ExportDataMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_ExportDataMetadata_descriptor,
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
    internal_static_google_cloud_parallelstore_v1beta_TransferOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_parallelstore_v1beta_TransferOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_TransferOperationMetadata_descriptor,
            new java.lang.String[] {
              "SourceParallelstore",
              "SourceGcsBucket",
              "DestinationGcsBucket",
              "DestinationParallelstore",
              "Counters",
              "TransferType",
              "Source",
              "Destination",
            });
    internal_static_google_cloud_parallelstore_v1beta_TransferCounters_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_parallelstore_v1beta_TransferCounters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_parallelstore_v1beta_TransferCounters_descriptor,
            new java.lang.String[] {
              "ObjectsFound",
              "BytesFound",
              "ObjectsSkipped",
              "BytesSkipped",
              "ObjectsCopied",
              "BytesCopied",
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
