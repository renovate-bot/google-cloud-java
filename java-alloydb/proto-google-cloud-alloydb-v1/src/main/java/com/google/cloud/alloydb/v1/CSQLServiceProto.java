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
// source: google/cloud/alloydb/v1/csql_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1;

public final class CSQLServiceProto {
  private CSQLServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_v1_RestoreFromCloudSQLRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_v1_RestoreFromCloudSQLRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/alloydb/v1/csql_service.p"
          + "roto\022\027google.cloud.alloydb.v1\032\034google/ap"
          + "i/annotations.proto\032\027google/api/client.p"
          + "roto\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032,google/cloud/a"
          + "lloydb/v1/csql_resources.proto\032\'google/c"
          + "loud/alloydb/v1/resources.proto\032%google/"
          + "cloud/alloydb/v1/service.proto\032#google/l"
          + "ongrunning/operations.proto\"\207\002\n\032RestoreF"
          + "romCloudSQLRequest\022V\n\032cloudsql_backup_ru"
          + "n_source\030e \001(\01320.google.cloud.alloydb.v1"
          + ".CloudSQLBackupRunSourceH\000\0226\n\006parent\030\001 \001"
          + "(\tB&\340A\002\372A \022\036alloydb.googleapis.com/Clust"
          + "er\022\027\n\ncluster_id\030\002 \001(\tB\003\340A\002\0226\n\007cluster\030\003"
          + " \001(\0132 .google.cloud.alloydb.v1.ClusterB\003"
          + "\340A\002B\010\n\006source2\312\002\n\020AlloyDBCSQLAdmin\022\351\001\n\023R"
          + "estoreFromCloudSQL\0223.google.cloud.alloyd"
          + "b.v1.RestoreFromCloudSQLRequest\032\035.google"
          + ".longrunning.Operation\"~\312A\034\n\007Cluster\022\021Op"
          + "erationMetadata\332A\021parent,cluster_id\202\323\344\223\002"
          + "E\"@/v1/{parent=projects/*/locations/*}/c"
          + "lusters:restoreFromCloudSQL:\001*\032J\312A\026alloy"
          + "db.googleapis.com\322A.https://www.googleap"
          + "is.com/auth/cloud-platformB\271\001\n\033com.googl"
          + "e.cloud.alloydb.v1B\020CSQLServiceProtoP\001Z5"
          + "cloud.google.com/go/alloydb/apiv1/alloyd"
          + "bpb;alloydbpb\252\002\027Google.Cloud.AlloyDb.V1\312"
          + "\002\027Google\\Cloud\\AlloyDb\\V1\352\002\032Google::Clou"
          + "d::AlloyDB::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.alloydb.v1.CsqlResourcesProto.getDescriptor(),
              com.google.cloud.alloydb.v1.ResourcesProto.getDescriptor(),
              com.google.cloud.alloydb.v1.ServiceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_alloydb_v1_RestoreFromCloudSQLRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_alloydb_v1_RestoreFromCloudSQLRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_v1_RestoreFromCloudSQLRequest_descriptor,
            new java.lang.String[] {
              "CloudsqlBackupRunSource", "Parent", "ClusterId", "Cluster", "Source",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.alloydb.v1.CsqlResourcesProto.getDescriptor();
    com.google.cloud.alloydb.v1.ResourcesProto.getDescriptor();
    com.google.cloud.alloydb.v1.ServiceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
