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
// source: google/cloud/retail/v2alpha/merchant_center_account_link_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

public final class MerchantCenterAccountLinkServiceProto {
  private MerchantCenterAccountLinkServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_DeleteMerchantCenterAccountLinkRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_DeleteMerchantCenterAccountLinkRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/cloud/retail/v2alpha/merchant_c"
          + "enter_account_link_service.proto\022\033google"
          + ".cloud.retail.v2alpha\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\032>google/cloud/retail/v2"
          + "alpha/merchant_center_account_link.proto"
          + "\032#google/longrunning/operations.proto\032\033g"
          + "oogle/protobuf/empty.proto\"^\n%ListMercha"
          + "ntCenterAccountLinksRequest\0225\n\006parent\030\001 "
          + "\001(\tB%\340A\002\372A\037\n\035retail.googleapis.com/Catal"
          + "og\"\207\001\n&ListMerchantCenterAccountLinksRes"
          + "ponse\022]\n\035merchant_center_account_links\030\001"
          + " \003(\01326.google.cloud.retail.v2alpha.Merch"
          + "antCenterAccountLink\"\302\001\n&CreateMerchantC"
          + "enterAccountLinkRequest\0225\n\006parent\030\001 \001(\tB"
          + "%\340A\002\372A\037\n\035retail.googleapis.com/Catalog\022a"
          + "\n\034merchant_center_account_link\030\002 \001(\01326.g"
          + "oogle.cloud.retail.v2alpha.MerchantCente"
          + "rAccountLinkB\003\340A\002\"o\n&DeleteMerchantCente"
          + "rAccountLinkRequest\022E\n\004name\030\001 \001(\tB7\340A\002\372A"
          + "1\n/retail.googleapis.com/MerchantCenterA"
          + "ccountLink2\376\007\n MerchantCenterAccountLink"
          + "Service\022\212\002\n\036ListMerchantCenterAccountLin"
          + "ks\022B.google.cloud.retail.v2alpha.ListMer"
          + "chantCenterAccountLinksRequest\032C.google."
          + "cloud.retail.v2alpha.ListMerchantCenterA"
          + "ccountLinksResponse\"_\332A\006parent\202\323\344\223\002P\022N/v"
          + "2alpha/{parent=projects/*/locations/*/ca"
          + "talogs/*}/merchantCenterAccountLinks\022\241\003\n"
          + "\037CreateMerchantCenterAccountLink\022C.googl"
          + "e.cloud.retail.v2alpha.CreateMerchantCen"
          + "terAccountLinkRequest\032\035.google.longrunni"
          + "ng.Operation\"\231\002\312A|\n5google.cloud.retail."
          + "v2alpha.MerchantCenterAccountLink\022Cgoogl"
          + "e.cloud.retail.v2alpha.CreateMerchantCen"
          + "terAccountLinkMetadata\332A#parent,merchant"
          + "_center_account_link\202\323\344\223\002n\"N/v2alpha/{pa"
          + "rent=projects/*/locations/*/catalogs/*}/"
          + "merchantCenterAccountLinks:\034merchant_cen"
          + "ter_account_link\022\335\001\n\037DeleteMerchantCente"
          + "rAccountLink\022C.google.cloud.retail.v2alp"
          + "ha.DeleteMerchantCenterAccountLinkReques"
          + "t\032\026.google.protobuf.Empty\"]\332A\004name\202\323\344\223\002P"
          + "*N/v2alpha/{name=projects/*/locations/*/"
          + "catalogs/*/merchantCenterAccountLinks/*}"
          + "\032I\312A\025retail.googleapis.com\322A.https://www"
          + ".googleapis.com/auth/cloud-platformB\351\001\n\037"
          + "com.google.cloud.retail.v2alphaB%Merchan"
          + "tCenterAccountLinkServiceProtoP\001Z7cloud."
          + "google.com/go/retail/apiv2alpha/retailpb"
          + ";retailpb\242\002\006RETAIL\252\002\033Google.Cloud.Retail"
          + ".V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002"
          + "\036Google::Cloud::Retail::V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.MerchantCenterAccountLinkProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ListMerchantCenterAccountLinksResponse_descriptor,
            new java.lang.String[] {
              "MerchantCenterAccountLinks",
            });
    internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CreateMerchantCenterAccountLinkRequest_descriptor,
            new java.lang.String[] {
              "Parent", "MerchantCenterAccountLink",
            });
    internal_static_google_cloud_retail_v2alpha_DeleteMerchantCenterAccountLinkRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2alpha_DeleteMerchantCenterAccountLinkRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_DeleteMerchantCenterAccountLinkRequest_descriptor,
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.MerchantCenterAccountLinkProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
