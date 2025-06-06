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
// source: google/cloud/lustre/v1/lustre.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.lustre.v1;

public final class LustreProto {
  private LustreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/lustre/v1/lustre.proto\022\026g"
          + "oogle.cloud.lustre.v1\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\031go"
          + "ogle/api/resource.proto\032%google/cloud/lu"
          + "stre/v1/instance.proto\032%google/cloud/lus"
          + "tre/v1/transfer.proto\032#google/longrunnin"
          + "g/operations.proto\032\033google/protobuf/empt"
          + "y.proto2\305\013\n\006Lustre\022\254\001\n\rListInstances\022,.g"
          + "oogle.cloud.lustre.v1.ListInstancesReque"
          + "st\032-.google.cloud.lustre.v1.ListInstance"
          + "sResponse\">\332A\006parent\202\323\344\223\002/\022-/v1/{parent="
          + "projects/*/locations/*}/instances\022\231\001\n\013Ge"
          + "tInstance\022*.google.cloud.lustre.v1.GetIn"
          + "stanceRequest\032 .google.cloud.lustre.v1.I"
          + "nstance\"<\332A\004name\202\323\344\223\002/\022-/v1/{name=projec"
          + "ts/*/locations/*/instances/*}\022\335\001\n\016Create"
          + "Instance\022-.google.cloud.lustre.v1.Create"
          + "InstanceRequest\032\035.google.longrunning.Ope"
          + "ration\"}\312A\035\n\010Instance\022\021OperationMetadata"
          + "\332A\033parent,instance,instance_id\202\323\344\223\0029\"-/v"
          + "1/{parent=projects/*/locations/*}/instan"
          + "ces:\010instance\022\337\001\n\016UpdateInstance\022-.googl"
          + "e.cloud.lustre.v1.UpdateInstanceRequest\032"
          + "\035.google.longrunning.Operation\"\177\312A\035\n\010Ins"
          + "tance\022\021OperationMetadata\332A\024instance,upda"
          + "te_mask\202\323\344\223\002B26/v1/{instance.name=projec"
          + "ts/*/locations/*/instances/*}:\010instance\022"
          + "\311\001\n\016DeleteInstance\022-.google.cloud.lustre"
          + ".v1.DeleteInstanceRequest\032\035.google.longr"
          + "unning.Operation\"i\312A*\n\025google.protobuf.E"
          + "mpty\022\021OperationMetadata\332A\004name\202\323\344\223\002/*-/v"
          + "1/{name=projects/*/locations/*/instances"
          + "/*}\022\315\001\n\nImportData\022).google.cloud.lustre"
          + ".v1.ImportDataRequest\032\035.google.longrunni"
          + "ng.Operation\"u\312A(\n\022ImportDataResponse\022\022I"
          + "mportDataMetadata\332A\004name\202\323\344\223\002=\"8/v1/{nam"
          + "e=projects/*/locations/*/instances/*}:im"
          + "portData:\001*\022\306\001\n\nExportData\022).google.clou"
          + "d.lustre.v1.ExportDataRequest\032\035.google.l"
          + "ongrunning.Operation\"n\312A(\n\022ExportDataRes"
          + "ponse\022\022ExportDataMetadata\202\323\344\223\002=\"8/v1/{na"
          + "me=projects/*/locations/*/instances/*}:e"
          + "xportData:\001*\032I\312A\025lustre.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\214\002\n\032com.google.cloud.lustre.v1B\013"
          + "LustreProtoP\001Z2cloud.google.com/go/lustr"
          + "e/apiv1/lustrepb;lustrepb\352AY\n!iam.google"
          + "apis.com/ServiceAccount\0224projects/{proje"
          + "ct}/serviceAccounts/{service_account}\352AN"
          + "\n\036compute.googleapis.com/Network\022,projec"
          + "ts/{project}/global/networks/{network}b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.lustre.v1.InstanceProto.getDescriptor(),
              com.google.cloud.lustre.v1.TransferProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.lustre.v1.InstanceProto.getDescriptor();
    com.google.cloud.lustre.v1.TransferProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
