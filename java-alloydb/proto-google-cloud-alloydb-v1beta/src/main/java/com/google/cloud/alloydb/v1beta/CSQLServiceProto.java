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
// source: google/cloud/alloydb/v1beta/csql_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1beta;

public final class CSQLServiceProto {
  private CSQLServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_v1beta_RestoreFromCloudSQLRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_v1beta_RestoreFromCloudSQLRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/alloydb/v1beta/csql_servi"
          + "ce.proto\022\033google.cloud.alloydb.v1beta\032\034g"
          + "oogle/api/annotations.proto\032\027google/api/"
          + "client.proto\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\0320google"
          + "/cloud/alloydb/v1beta/csql_resources.pro"
          + "to\032+google/cloud/alloydb/v1beta/resource"
          + "s.proto\032)google/cloud/alloydb/v1beta/ser"
          + "vice.proto\032#google/longrunning/operation"
          + "s.proto\"\217\002\n\032RestoreFromCloudSQLRequest\022Z"
          + "\n\032cloudsql_backup_run_source\030e \001(\01324.goo"
          + "gle.cloud.alloydb.v1beta.CloudSQLBackupR"
          + "unSourceH\000\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036allo"
          + "ydb.googleapis.com/Cluster\022\027\n\ncluster_id"
          + "\030\002 \001(\tB\003\340A\002\022:\n\007cluster\030\003 \001(\0132$.google.cl"
          + "oud.alloydb.v1beta.ClusterB\003\340A\002B\010\n\006sourc"
          + "e2\323\002\n\020AlloyDBCSQLAdmin\022\362\001\n\023RestoreFromCl"
          + "oudSQL\0227.google.cloud.alloydb.v1beta.Res"
          + "toreFromCloudSQLRequest\032\035.google.longrun"
          + "ning.Operation\"\202\001\312A\034\n\007Cluster\022\021Operation"
          + "Metadata\332A\021parent,cluster_id\202\323\344\223\002I\"D/v1b"
          + "eta/{parent=projects/*/locations/*}/clus"
          + "ters:restoreFromCloudSQL:\001*\032J\312A\026alloydb."
          + "googleapis.com\322A.https://www.googleapis."
          + "com/auth/cloud-platformB\315\001\n\037com.google.c"
          + "loud.alloydb.v1betaB\020CSQLServiceProtoP\001Z"
          + "9cloud.google.com/go/alloydb/apiv1beta/a"
          + "lloydbpb;alloydbpb\252\002\033Google.Cloud.AlloyD"
          + "b.V1Beta\312\002\033Google\\Cloud\\AlloyDb\\V1beta\352\002"
          + "\036Google::Cloud::AlloyDB::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.alloydb.v1beta.CsqlResourcesProto.getDescriptor(),
              com.google.cloud.alloydb.v1beta.ResourcesProto.getDescriptor(),
              com.google.cloud.alloydb.v1beta.ServiceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_alloydb_v1beta_RestoreFromCloudSQLRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_alloydb_v1beta_RestoreFromCloudSQLRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_v1beta_RestoreFromCloudSQLRequest_descriptor,
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
    com.google.cloud.alloydb.v1beta.CsqlResourcesProto.getDescriptor();
    com.google.cloud.alloydb.v1beta.ResourcesProto.getDescriptor();
    com.google.cloud.alloydb.v1beta.ServiceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
