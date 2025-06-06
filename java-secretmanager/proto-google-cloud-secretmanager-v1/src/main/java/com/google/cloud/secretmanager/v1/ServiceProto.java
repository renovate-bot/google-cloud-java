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
// source: google/cloud/secretmanager/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.secretmanager.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_GetSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_GetSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "+google/cloud/secretmanager/v1/service."
          + "proto\022\035google.cloud.secretmanager.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032-google/"
          + "cloud/secretmanager/v1/resources.proto\032\036"
          + "google/iam/v1/iam_policy.proto\032\032google/i"
          + "am/v1/policy.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\"\227\001\n"
          + "\022ListSecretsRequest\022;\n"
          + "\006parent\030\001 \001(\t"
          + "B+\340A\002\372A%\022#secretmanager.googleapis.com/Secret\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\"z\n"
          + "\023ListSecretsResponse\0226\n"
          + "\007secrets\030\001 \003(\0132%.google.cloud.secretmanager.v1.Secret\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\022\n\n"
          + "total_size\030\003 \001(\005\"\246\001\n"
          + "\023CreateSecretRequest\022;\n"
          + "\006parent\030\001 \001(\tB"
          + "+\340A\002\372A%\022#secretmanager.googleapis.com/Secret\022\026\n"
          + "\tsecret_id\030\002 \001(\tB\003\340A\002\022:\n"
          + "\006secret\030\003"
          + " \001(\0132%.google.cloud.secretmanager.v1.SecretB\003\340A\002\"\232\001\n"
          + "\027AddSecretVersionRequest\022;\n"
          + "\006parent\030\001 \001(\tB+\340A\002\372A%\n"
          + "#secretmanager.googleapis.com/Secret\022B\n"
          + "\007payload\030\002 \001(\0132,.goo"
          + "gle.cloud.secretmanager.v1.SecretPayloadB\003\340A\002\"M\n"
          + "\020GetSecretRequest\0229\n"
          + "\004name\030\001 \001(\tB+\340A\002\372A%\n"
          + "#secretmanager.googleapis.com/Secret\"\236\001\n"
          + "\031ListSecretVersionsRequest\022;\n"
          + "\006parent\030\001 \001(\tB+\340A\002\372A%\n"
          + "#secretmanager.googleapis.com/Secret\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\"\211\001\n"
          + "\032ListSecretVersionsResponse\022>\n"
          + "\010versions\030\001 \003(\0132,.google.cloud.secretmanager.v1.SecretVersion\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\022\n\n"
          + "total_size\030\003 \001(\005\"[\n"
          + "\027GetSecretVersionRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*secretmanager.googleapis.com/SecretVersion\"\207\001\n"
          + "\023UpdateSecretRequest\022:\n"
          + "\006secret\030\001 \001(\0132%"
          + ".google.cloud.secretmanager.v1.SecretB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"^\n"
          + "\032AccessSecretVersionRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*secretmanager.googleapis.com/SecretVersion\"\233\001\n"
          + "\033AccessSecretVersionResponse\022=\n"
          + "\004name\030\001 \001(\tB/\372A,\n"
          + "*secretmanager.googleapis.com/SecretVersion\022=\n"
          + "\007payload\030\002 \001(\0132,.google.cloud.secretmanager.v1.SecretPayload\"c\n"
          + "\023DeleteSecretRequest\0229\n"
          + "\004name\030\001 \001(\tB+\340A\002\372A%\n"
          + "#secretmanager.googleapis.com/Secret\022\021\n"
          + "\004etag\030\002 \001(\tB\003\340A\001\"r\n"
          + "\033DisableSecretVersionRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*secretmanager.googleapis.com/SecretVersion\022\021\n"
          + "\004etag\030\002 \001(\tB\003\340A\001\"q\n"
          + "\032EnableSecretVersionRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*secretmanager.googleapis.com/SecretVersion\022\021\n"
          + "\004etag\030\002 \001(\tB\003\340A\001\"r\n"
          + "\033DestroySecretVersionRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*secretmanager.googleapis.com/SecretVersion\022\021\n"
          + "\004etag\030\002 \001(\tB\003\340A\0012\350\034\n"
          + "\024SecretManagerService\022\325\001\n"
          + "\013ListSecrets\0221.google.cloud.secretmanager.v1.ListSecr"
          + "etsRequest\0322.google.cloud.secretmanager."
          + "v1.ListSecretsResponse\"_\332A\006parent\202\323\344\223\002P\022"
          + "\037/v1/{parent=projects/*}/secretsZ-\022+/v1/"
          + "{parent=projects/*/locations/*}/secrets\022\354\001\n"
          + "\014CreateSecret\0222.google.cloud.secretmanager.v1.CreateSecretRequest\032%.google.cl"
          + "oud.secretmanager.v1.Secret\"\200\001\332A\027parent,"
          + "secret_id,secret\202\323\344\223\002`\"\037/v1/{parent=proj"
          + "ects/*}/secrets:\006secretZ5\"+/v1/{parent=p"
          + "rojects/*/locations/*}/secrets:\006secret\022\202\002\n"
          + "\020AddSecretVersion\0226.google.cloud.secre"
          + "tmanager.v1.AddSecretVersionRequest\032,.google.cloud.secretmanager.v1.SecretVersio"
          + "n\"\207\001\332A\016parent,payload\202\323\344\223\002p\",/v1/{parent"
          + "=projects/*/secrets/*}:addVersion:\001*Z=\"8"
          + "/v1/{parent=projects/*/locations/*/secrets/*}:addVersion:\001*\022\302\001\n"
          + "\tGetSecret\022/.google.cloud.secretmanager.v1.GetSecretReque"
          + "st\032%.google.cloud.secretmanager.v1.Secre"
          + "t\"]\332A\004name\202\323\344\223\002P\022\037/v1/{name=projects/*/s"
          + "ecrets/*}Z-\022+/v1/{name=projects/*/locations/*/secrets/*}\022\365\001\n"
          + "\014UpdateSecret\0222.google.cloud.secretmanager.v1.UpdateSecretRe"
          + "quest\032%.google.cloud.secretmanager.v1.Se"
          + "cret\"\211\001\332A\022secret,update_mask\202\323\344\223\002n2&/v1/"
          + "{secret.name=projects/*/secrets/*}:\006secr"
          + "etZ<22/v1/{secret.name=projects/*/locations/*/secrets/*}:\006secret\022\271\001\n"
          + "\014DeleteSecret\0222.google.cloud.secretmanager.v1.Delete"
          + "SecretRequest\032\026.google.protobuf.Empty\"]\332"
          + "A\004name\202\323\344\223\002P*\037/v1/{name=projects/*/secre"
          + "ts/*}Z-*+/v1/{name=projects/*/locations/*/secrets/*}\022\200\002\n"
          + "\022ListSecretVersions\0228.google.cloud.secretmanager.v1.ListSecretVe"
          + "rsionsRequest\0329.google.cloud.secretmanag"
          + "er.v1.ListSecretVersionsResponse\"u\332A\006par"
          + "ent\202\323\344\223\002f\022*/v1/{parent=projects/*/secret"
          + "s/*}/versionsZ8\0226/v1/{parent=projects/*/locations/*/secrets/*}/versions\022\355\001\n"
          + "\020GetSecretVersion\0226.google.cloud.secretmanage"
          + "r.v1.GetSecretVersionRequest\032,.google.cl"
          + "oud.secretmanager.v1.SecretVersion\"s\332A\004n"
          + "ame\202\323\344\223\002f\022*/v1/{name=projects/*/secrets/"
          + "*/versions/*}Z8\0226/v1/{name=projects/*/locations/*/secrets/*/versions/*}\022\220\002\n"
          + "\023AccessSecretVersion\0229.google.cloud.secretman"
          + "ager.v1.AccessSecretVersionRequest\032:.google.cloud.secretmanager.v1.AccessSecretV"
          + "ersionResponse\"\201\001\332A\004name\202\323\344\223\002t\0221/v1/{nam"
          + "e=projects/*/secrets/*/versions/*}:acces"
          + "sZ?\022=/v1/{name=projects/*/locations/*/secrets/*/versions/*}:access\022\214\002\n"
          + "\024DisableSecretVersion\022:.google.cloud.secretmanager"
          + ".v1.DisableSecretVersionRequest\032,.google"
          + ".cloud.secretmanager.v1.SecretVersion\"\211\001"
          + "\332A\004name\202\323\344\223\002|\"2/v1/{name=projects/*/secr"
          + "ets/*/versions/*}:disable:\001*ZC\">/v1/{nam"
          + "e=projects/*/locations/*/secrets/*/versions/*}:disable:\001*\022\210\002\n"
          + "\023EnableSecretVersion\0229.google.cloud.secretmanager.v1.Enable"
          + "SecretVersionRequest\032,.google.cloud.secr"
          + "etmanager.v1.SecretVersion\"\207\001\332A\004name\202\323\344\223"
          + "\002z\"1/v1/{name=projects/*/secrets/*/versi"
          + "ons/*}:enable:\001*ZB\"=/v1/{name=projects/*"
          + "/locations/*/secrets/*/versions/*}:enable:\001*\022\214\002\n"
          + "\024DestroySecretVersion\022:.google.cloud.secretmanager.v1.DestroySecretVersi"
          + "onRequest\032,.google.cloud.secretmanager.v"
          + "1.SecretVersion\"\211\001\332A\004name\202\323\344\223\002|\"2/v1/{na"
          + "me=projects/*/secrets/*/versions/*}:dest"
          + "roy:\001*ZC\">/v1/{name=projects/*/locations/*/secrets/*/versions/*}:destroy:\001*\022\311\001\n"
          + "\014SetIamPolicy\022\".google.iam.v1.SetIamPolic"
          + "yRequest\032\025.google.iam.v1.Policy\"~\202\323\344\223\002x\""
          + "0/v1/{resource=projects/*/secrets/*}:setIamPolicy:\001*ZA\"</v1/{resource=projects/*"
          + "/locations/*/secrets/*}:setIamPolicy:\001*\022\303\001\n"
          + "\014GetIamPolicy\022\".google.iam.v1.GetIamP"
          + "olicyRequest\032\025.google.iam.v1.Policy\"x\202\323\344"
          + "\223\002r\0220/v1/{resource=projects/*/secrets/*}"
          + ":getIamPolicyZ>\022</v1/{resource=projects/"
          + "*/locations/*/secrets/*}:getIamPolicy\022\367\001\n"
          + "\022TestIamPermissions\022(.google.iam.v1.Tes"
          + "tIamPermissionsRequest\032).google.iam.v1.T"
          + "estIamPermissionsResponse\"\213\001\202\323\344\223\002\204\001\"6/v1"
          + "/{resource=projects/*/secrets/*}:testIamPermissions:\001*ZG\"B/v1/{resource=projects"
          + "/*/locations/*/secrets/*}:testIamPermiss"
          + "ions:\001*\032P\312A\034secretmanager.googleapis.com"
          + "\322A.https://www.googleapis.com/auth/cloud-platformB\345\001\n"
          + "!com.google.cloud.secretmanager.v1B\014ServiceProtoP\001ZGcloud.google.co"
          + "m/go/secretmanager/apiv1/secretmanagerpb"
          + ";secretmanagerpb\242\002\003GSM\252\002\035Google.Cloud.Se"
          + "cretManager.V1\312\002\035Google\\Cloud\\SecretManager\\V1\352\002"
          + " Google::Cloud::SecretManager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.secretmanager.v1.ResourcesProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_descriptor,
            new java.lang.String[] {
              "Secrets", "NextPageToken", "TotalSize",
            });
    internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SecretId", "Secret",
            });
    internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Payload",
            });
    internal_static_google_cloud_secretmanager_v1_GetSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_secretmanager_v1_GetSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_GetSecretRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken", "TotalSize",
            });
    internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_descriptor,
            new java.lang.String[] {
              "Secret", "UpdateMask",
            });
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor,
            new java.lang.String[] {
              "Name", "Payload",
            });
    internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
            });
    internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
            });
    internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
            });
    internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
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
    com.google.cloud.secretmanager.v1.ResourcesProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
