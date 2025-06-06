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
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

public final class MetadataProto {
  private MetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_CreateEntityRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_CreateEntityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DeleteEntityRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DeleteEntityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GetEntityRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetEntityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListPartitionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListPartitionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DeletePartitionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DeletePartitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GetPartitionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetPartitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_Compatibility_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_Compatibility_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Partition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Partition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Schema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Schema_SchemaField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Schema_SchemaField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Schema_PartitionField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Schema_PartitionField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_StorageFormat_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_StorageFormat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_StorageFormat_CsvOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_StorageFormat_CsvOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_StorageFormat_JsonOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_StorageFormat_JsonOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_StorageFormat_IcebergOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_StorageFormat_IcebergOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_StorageAccess_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_StorageAccess_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "\'google/cloud/dataplex/v1/metadata.prot"
          + "o\022\030google.cloud.dataplex.v1\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\032\033google/protobuf/"
          + "empty.proto\032\037google/protobuf/timestamp.proto\"\236\001\n"
          + "\023CreateEntityRequest\0224\n"
          + "\006parent\030\001 \001(\tB$\340A\002\372A\036\n"
          + "\034dataplex.googleapis.com/Zone\0225\n"
          + "\006entity\030\003 \001(\0132"
          + " .google.cloud.dataplex.v1.EntityB\003\340A\002\022\032\n\r"
          + "validate_only\030\004 \001(\010B\003\340A\001\"h\n"
          + "\023UpdateEntityRequest\0225\n"
          + "\006entity\030\002 \001(\0132"
          + " .google.cloud.dataplex.v1.EntityB\003\340A\002\022\032\n\r"
          + "validate_only\030\003 \001(\010B\003\340A\001\"^\n"
          + "\023DeleteEntityRequest\0224\n"
          + "\004name\030\001 \001(\tB&\340A\002\372A \n"
          + "\036dataplex.googleapis.com/Entity\022\021\n"
          + "\004etag\030\002 \001(\tB\003\340A\002\"\243\002\n"
          + "\023ListEntitiesRequest\0224\n"
          + "\006parent\030\001 \001(\tB$\340A\002\372A\036\n"
          + "\034dataplex.googleapis.com/Zone\022K\n"
          + "\004view\030\002 \001(\01628.google.cloud.datap"
          + "lex.v1.ListEntitiesRequest.EntityViewB\003\340A\002\022\026\n"
          + "\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\004 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\005 \001(\tB\003\340A\001\"C\n\n"
          + "EntityView\022\033\n"
          + "\027ENTITY_VIEW_UNSPECIFIED\020\000\022\n\n"
          + "\006TABLES\020\001\022\014\n"
          + "\010FILESETS\020\002\"c\n"
          + "\024ListEntitiesResponse\0222\n"
          + "\010entities\030\001 \003(\0132 .google.cloud.dataplex.v1.Entity\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\336\001\n"
          + "\020GetEntityRequest\0224\n"
          + "\004name\030\001 \001(\tB&\340A\002\372A \n"
          + "\036dataplex.googleapis.com/Entity\022H\n"
          + "\004view\030\002"
          + " \001(\01625.google.cloud.dataplex.v1.GetEntityRequest.EntityViewB\003\340A\001\"J\n\n"
          + "EntityView\022\033\n"
          + "\027ENTITY_VIEW_UNSPECIFIED\020\000\022\t\n"
          + "\005BASIC\020\001\022\n\n"
          + "\006SCHEMA\020\002\022\010\n"
          + "\004FULL\020\004\"\225\001\n"
          + "\025ListPartitionsRequest\0226\n"
          + "\006parent\030\001 \001(\tB&\340A\002\372A \n"
          + "\036dataplex.googleapis.com/Entity\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\"\251\001\n"
          + "\026CreatePartitionRequest\0226\n"
          + "\006parent\030\001 \001(\tB&\340A\002\372A \n"
          + "\036dataplex.googleapis.com/Entity\022;\n"
          + "\tpartition\030\003 \001("
          + "\0132#.google.cloud.dataplex.v1.PartitionB\003\340A\002\022\032\n\r"
          + "validate_only\030\004 \001(\010B\003\340A\001\"f\n"
          + "\026DeletePartitionRequest\0227\n"
          + "\004name\030\001 \001(\tB)\340A\002\372A#\n"
          + "!dataplex.googleapis.com/Partition\022\023\n"
          + "\004etag\030\002 \001(\tB\005\030\001\340A\001\"j\n"
          + "\026ListPartitionsResponse\0227\n\n"
          + "partitions\030\001 \003(\0132#.google.cloud.dataplex.v1.Partition\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"N\n"
          + "\023GetPartitionRequest\0227\n"
          + "\004name\030\001 \001(\tB)\340A\002\372A#\n"
          + "!dataplex.googleapis.com/Partition\"\311\t\n"
          + "\006Entity\0224\n"
          + "\004name\030\001 \001(\tB&\340A\003\372A \n"
          + "\036dataplex.googleapis.com/Entity\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\001\022\030\n"
          + "\013description\030\003 \001(\tB\003\340A\001\0224\n"
          + "\013create_time\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\006"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\017\n"
          + "\002id\030\007 \001(\tB\003\340A\002\022\021\n"
          + "\004etag\030\010 \001(\tB\003\340A\001\022;\n"
          + "\004type\030\n"
          + " \001(\0162%.google.cloud.dataplex.v1.Entity.TypeB\006\340A\002\340A\005\022\025\n"
          + "\005asset\030\013 \001(\tB\006\340A\002\340A\005\022\031\n"
          + "\tdata_path\030\014 \001(\tB\006\340A\002\340A\005\022\036\n"
          + "\021data_path_pattern\030\r"
          + " \001(\tB\003\340A\001\022\032\n\r"
          + "catalog_entry\030\016 \001(\tB\003\340A\003\022?\n"
          + "\006system\030\017"
          + " \001(\0162\'.google.cloud.dataplex.v1.StorageSystemB\006\340A\002\340A\005\022<\n"
          + "\006format\030\020 \001(\0132\'."
          + "google.cloud.dataplex.v1.StorageFormatB\003\340A\002\022P\n\r"
          + "compatibility\030\023 \001(\01324.google.clou"
          + "d.dataplex.v1.Entity.CompatibilityStatusB\003\340A\003\022<\n"
          + "\006access\030\025"
          + " \001(\0132\'.google.cloud.dataplex.v1.StorageAccessB\003\340A\003\022\020\n"
          + "\003uid\030\026 \001(\tB\003\340A\003\0225\n"
          + "\006schema\0302 \001(\0132"
          + " .google.cloud.dataplex.v1.SchemaB\003\340A\002\032\220\002\n"
          + "\023CompatibilityStatus\022_\n"
          + "\016hive_metastore\030\001 \001(\0132B.google.cl"
          + "oud.dataplex.v1.Entity.CompatibilityStatus.CompatibilityB\003\340A\003\022Y\n"
          + "\010bigquery\030\002 \001(\0132"
          + "B.google.cloud.dataplex.v1.Entity.CompatibilityStatus.CompatibilityB\003\340A\003\032=\n\r"
          + "Compatibility\022\027\n\n"
          + "compatible\030\001 \001(\010B\003\340A\003\022\023\n"
          + "\006reason\030\002 \001(\tB\003\340A\003\"4\n"
          + "\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\t\n"
          + "\005TABLE\020\001\022\013\n"
          + "\007FILESET\020\002:x\352Au\n"
          + "\036dataplex.googleapis.com/Entity\022Sprojects/{pr"
          + "oject}/locations/{location}/lakes/{lake}/zones/{zone}/entities/{entity}\"\241\002\n"
          + "\tPartition\0227\n"
          + "\004name\030\001 \001(\tB)\340A\003\372A#\n"
          + "!dataplex.googleapis.com/Partition\022\026\n"
          + "\006values\030\002 \003(\tB\006\340A\002\340A\005\022\030\n"
          + "\010location\030\003 \001(\tB\006\340A\002\340A\005\022\023\n"
          + "\004etag\030\004 \001(\tB\005\030\001\340A\001:\223\001\352A\217\001\n"
          + "!dataplex.googleapis.com/Partition\022jprojects/{project}/loca"
          + "tions/{location}/lakes/{lake}/zones/{zon"
          + "e}/entities/{entity}/partitions/{partition}\"\267\007\n"
          + "\006Schema\022\031\n"
          + "\014user_managed\030\001 \001(\010B\003\340A\002\022A\n"
          + "\006fields\030\002"
          + " \003(\0132,.google.cloud.dataplex.v1.Schema.SchemaFieldB\003\340A\001\022N\n"
          + "\020partition_fields\030\003"
          + " \003(\0132/.google.cloud.dataplex.v1.Schema.PartitionFieldB\003\340A\001\022M\n"
          + "\017partition_style\030\004"
          + " \001(\0162/.google.cloud.dataplex.v1.Schema.PartitionStyleB\003\340A\001\032\361\001\n"
          + "\013SchemaField\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022\030\n"
          + "\013description\030\002 \001(\tB\003\340A\001\0228\n"
          + "\004type\030\003 \001(\0162%.google.cloud.dataplex.v1.Schema.TypeB\003\340A\002\0228\n"
          + "\004mode\030\004 \001(\0162%.google.cloud.dataplex.v1.Schema.ModeB\003\340A\002\022A\n"
          + "\006fields\030\n"
          + " \003(\0132,.google.cloud.dataplex.v1.Schema.SchemaFieldB\003\340A\001\032`\n"
          + "\016PartitionField\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022;\n"
          + "\004type\030\002 \001"
          + "(\0162%.google.cloud.dataplex.v1.Schema.TypeB\006\340A\002\340A\005\"\311\001\n"
          + "\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\013\n"
          + "\007BOOLEAN\020\001\022\010\n"
          + "\004BYTE\020\002\022\t\n"
          + "\005INT16\020\003\022\t\n"
          + "\005INT32\020\004\022\t\n"
          + "\005INT64\020\005\022\t\n"
          + "\005FLOAT\020\006\022\n\n"
          + "\006DOUBLE\020\007\022\013\n"
          + "\007DECIMAL\020\010\022\n\n"
          + "\006STRING\020\t\022\n\n"
          + "\006BINARY\020\n"
          + "\022\r\n"
          + "\tTIMESTAMP\020\013\022\010\n"
          + "\004DATE\020\014\022\010\n"
          + "\004TIME\020\r"
          + "\022\n\n"
          + "\006RECORD\020\016\022\010\n"
          + "\004NULL\020d\"F\n"
          + "\004Mode\022\024\n"
          + "\020MODE_UNSPECIFIED\020\000\022\014\n"
          + "\010REQUIRED\020\001\022\014\n"
          + "\010NULLABLE\020\002\022\014\n"
          + "\010REPEATED\020\003\"F\n"
          + "\016PartitionStyle\022\037\n"
          + "\033PARTITION_STYLE_UNSPECIFIED\020\000\022\023\n"
          + "\017HIVE_COMPATIBLE\020\001\"\364\006\n\r"
          + "StorageFormat\022C\n"
          + "\006format\030\001 \001(\0162..google"
          + ".cloud.dataplex.v1.StorageFormat.FormatB\003\340A\003\022Z\n"
          + "\022compression_format\030\002 \001(\01629.googl"
          + "e.cloud.dataplex.v1.StorageFormat.CompressionFormatB\003\340A\001\022\026\n"
          + "\tmime_type\030\003 \001(\tB\003\340A\002\022F\n"
          + "\003csv\030\n"
          + " \001(\01322.google.cloud.dataplex.v1.StorageFormat.CsvOptionsB\003\340A\001H\000\022H\n"
          + "\004json\030\013"
          + " \001(\01323.google.cloud.dataplex.v1.StorageFormat.JsonOptionsB\003\340A\001H\000\022N\n"
          + "\007iceberg\030\014 "
          + "\001(\01326.google.cloud.dataplex.v1.StorageFormat.IcebergOptionsB\003\340A\001H\000\032i\n\n"
          + "CsvOptions\022\025\n"
          + "\010encoding\030\001 \001(\tB\003\340A\001\022\030\n"
          + "\013header_rows\030\002 \001(\005B\003\340A\001\022\026\n"
          + "\tdelimiter\030\003 \001(\tB\003\340A\001\022\022\n"
          + "\005quote\030\004 \001(\tB\003\340A\001\032$\n"
          + "\013JsonOptions\022\025\n"
          + "\010encoding\030\001 \001(\tB\003\340A\001\0320\n"
          + "\016IcebergOptions\022\036\n"
          + "\021metadata_location\030\001 \001(\tB\003\340A\001\"\253\001\n"
          + "\006Format\022\026\n"
          + "\022FORMAT_UNSPECIFIED\020\000\022\013\n"
          + "\007PARQUET\020\001\022\010\n"
          + "\004AVRO\020\002\022\007\n"
          + "\003ORC\020\003\022\007\n"
          + "\003CSV\020d\022\010\n"
          + "\004JSON\020e\022\n\n"
          + "\005IMAGE\020\310\001\022\n\n"
          + "\005AUDIO\020\311\001\022\n\n"
          + "\005VIDEO\020\312\001\022\t\n"
          + "\004TEXT\020\313\001\022\r\n"
          + "\010TFRECORD\020\314\001\022\n\n"
          + "\005OTHER\020\350\007\022\014\n"
          + "\007UNKNOWN\020\351\007\"L\n"
          + "\021CompressionFormat\022\"\n"
          + "\036COMPRESSION_FORMAT_UNSPECIFIED\020\000\022\010\n"
          + "\004GZIP\020\002\022\t\n"
          + "\005BZIP2\020\003B\t\n"
          + "\007options\"\232\001\n\r"
          + "StorageAccess\022E\n"
          + "\004read\030\025 \001(\01622.g"
          + "oogle.cloud.dataplex.v1.StorageAccess.AccessModeB\003\340A\003\"B\n\n"
          + "AccessMode\022\033\n"
          + "\027ACCESS_MODE_UNSPECIFIED\020\000\022\n\n"
          + "\006DIRECT\020\001\022\013\n"
          + "\007MANAGED\020\002*P\n\r"
          + "StorageSystem\022\036\n"
          + "\032STORAGE_SYSTEM_UNSPECIFIED\020\000\022\021\n\r"
          + "CLOUD_STORAGE\020\001\022\014\n"
          + "\010BIGQUERY\020\0022\211\016\n"
          + "\017MetadataService\022\275\001\n"
          + "\014CreateEntity\022-.google.cloud.dataplex.v1.CreateEntityRequest\032"
          + " .google.cloud.dataplex.v1.Entity\"\\\332A\r"
          + "parent,entity\202\323\344\223\002F\"</v1/{parent=p"
          + "rojects/*/locations/*/lakes/*/zones/*}/entities:\006entity\022\264\001\n"
          + "\014UpdateEntity\022-.google.cloud.dataplex.v1.UpdateEntityRequest\032"
          + " .google.cloud.dataplex.v1.Entity\"S\202\323\344\223\002"
          + "M\032C/v1/{entity.name=projects/*/locations"
          + "/*/lakes/*/zones/*/entities/*}:\006entity\022\242\001\n"
          + "\014DeleteEntity\022-.google.cloud.dataplex."
          + "v1.DeleteEntityRequest\032\026.google.protobuf"
          + ".Empty\"K\332A\004name\202\323\344\223\002>*</v1/{name=project"
          + "s/*/locations/*/lakes/*/zones/*/entities/*}\022\246\001\n"
          + "\tGetEntity\022*.google.cloud.dataplex.v1.GetEntityRequest\032 .google.cloud.dat"
          + "aplex.v1.Entity\"K\332A\004name\202\323\344\223\002>\022</v1/{nam"
          + "e=projects/*/locations/*/lakes/*/zones/*/entities/*}\022\274\001\n"
          + "\014ListEntities\022-.google.cloud.dataplex.v1.ListEntitiesRequest\032..g"
          + "oogle.cloud.dataplex.v1.ListEntitiesResp"
          + "onse\"M\332A\006parent\202\323\344\223\002>\022</v1/{parent=proje"
          + "cts/*/locations/*/lakes/*/zones/*}/entities\022\331\001\n"
          + "\017CreatePartition\0220.google.cloud.dataplex.v1.CreatePartitionRequest\032#.goog"
          + "le.cloud.dataplex.v1.Partition\"o\332A\020paren"
          + "t,partition\202\323\344\223\002V\"I/v1/{parent=projects/"
          + "*/locations/*/lakes/*/zones/*/entities/*}/partitions:\tpartition\022\266\001\n"
          + "\017DeletePartition\0220.google.cloud.dataplex.v1.DeletePar"
          + "titionRequest\032\026.google.protobuf.Empty\"Y\332"
          + "A\004name\202\323\344\223\002L*J/v1/{name=projects/*/locat"
          + "ions/*/lakes/*/zones/*/entities/*/partitions/**}\022\275\001\n"
          + "\014GetPartition\022-.google.cloud.dataplex.v1.GetPartitionRequest\032#.googl"
          + "e.cloud.dataplex.v1.Partition\"Y\332A\004name\202\323"
          + "\344\223\002L\022J/v1/{name=projects/*/locations/*/l"
          + "akes/*/zones/*/entities/*/partitions/**}\022\317\001\n"
          + "\016ListPartitions\022/.google.cloud.dataplex.v1.ListPartitionsRequest\0320.google.cl"
          + "oud.dataplex.v1.ListPartitionsResponse\"Z"
          + "\332A\006parent\202\323\344\223\002K\022I/v1/{parent=projects/*/"
          + "locations/*/lakes/*/zones/*/entities/*}/"
          + "partitions\032K\312A\027dataplex.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-platformBi\n"
          + "\034com.google.cloud.dataplex.v1B\r"
          + "MetadataProtoP\001Z8cloud.google.com/go/dataplex/apiv1/dataplexpb;dataplexpbb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_CreateEntityRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_CreateEntityRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_CreateEntityRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entity", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_UpdateEntityRequest_descriptor,
            new java.lang.String[] {
              "Entity", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_DeleteEntityRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DeleteEntityRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DeleteEntityRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
            });
    internal_static_google_cloud_dataplex_v1_ListEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_ListEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "View", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_descriptor,
            new java.lang.String[] {
              "Entities", "NextPageToken",
            });
    internal_static_google_cloud_dataplex_v1_GetEntityRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataplex_v1_GetEntityRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GetEntityRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_dataplex_v1_ListPartitionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataplex_v1_ListPartitionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListPartitionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Partition", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_DeletePartitionRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataplex_v1_DeletePartitionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DeletePartitionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
            });
    internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_descriptor,
            new java.lang.String[] {
              "Partitions", "NextPageToken",
            });
    internal_static_google_cloud_dataplex_v1_GetPartitionRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dataplex_v1_GetPartitionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GetPartitionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataplex_v1_Entity_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dataplex_v1_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Entity_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Id",
              "Etag",
              "Type",
              "Asset",
              "DataPath",
              "DataPathPattern",
              "CatalogEntry",
              "System",
              "Format",
              "Compatibility",
              "Access",
              "Uid",
              "Schema",
            });
    internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_descriptor =
        internal_static_google_cloud_dataplex_v1_Entity_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_descriptor,
            new java.lang.String[] {
              "HiveMetastore", "Bigquery",
            });
    internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_Compatibility_descriptor =
        internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_Compatibility_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Entity_CompatibilityStatus_Compatibility_descriptor,
            new java.lang.String[] {
              "Compatible", "Reason",
            });
    internal_static_google_cloud_dataplex_v1_Partition_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dataplex_v1_Partition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Partition_descriptor,
            new java.lang.String[] {
              "Name", "Values", "Location", "Etag",
            });
    internal_static_google_cloud_dataplex_v1_Schema_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dataplex_v1_Schema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Schema_descriptor,
            new java.lang.String[] {
              "UserManaged", "Fields", "PartitionFields", "PartitionStyle",
            });
    internal_static_google_cloud_dataplex_v1_Schema_SchemaField_descriptor =
        internal_static_google_cloud_dataplex_v1_Schema_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Schema_SchemaField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Schema_SchemaField_descriptor,
            new java.lang.String[] {
              "Name", "Description", "Type", "Mode", "Fields",
            });
    internal_static_google_cloud_dataplex_v1_Schema_PartitionField_descriptor =
        internal_static_google_cloud_dataplex_v1_Schema_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_Schema_PartitionField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Schema_PartitionField_descriptor,
            new java.lang.String[] {
              "Name", "Type",
            });
    internal_static_google_cloud_dataplex_v1_StorageFormat_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dataplex_v1_StorageFormat_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_StorageFormat_descriptor,
            new java.lang.String[] {
              "Format", "CompressionFormat", "MimeType", "Csv", "Json", "Iceberg", "Options",
            });
    internal_static_google_cloud_dataplex_v1_StorageFormat_CsvOptions_descriptor =
        internal_static_google_cloud_dataplex_v1_StorageFormat_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_StorageFormat_CsvOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_StorageFormat_CsvOptions_descriptor,
            new java.lang.String[] {
              "Encoding", "HeaderRows", "Delimiter", "Quote",
            });
    internal_static_google_cloud_dataplex_v1_StorageFormat_JsonOptions_descriptor =
        internal_static_google_cloud_dataplex_v1_StorageFormat_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_StorageFormat_JsonOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_StorageFormat_JsonOptions_descriptor,
            new java.lang.String[] {
              "Encoding",
            });
    internal_static_google_cloud_dataplex_v1_StorageFormat_IcebergOptions_descriptor =
        internal_static_google_cloud_dataplex_v1_StorageFormat_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_StorageFormat_IcebergOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_StorageFormat_IcebergOptions_descriptor,
            new java.lang.String[] {
              "MetadataLocation",
            });
    internal_static_google_cloud_dataplex_v1_StorageAccess_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dataplex_v1_StorageAccess_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_StorageAccess_descriptor,
            new java.lang.String[] {
              "Read",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
