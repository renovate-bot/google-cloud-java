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
// source: google/cloud/websecurityscanner/v1alpha/crawled_url.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.websecurityscanner.v1alpha;

public final class CrawledUrlProto {
  private CrawledUrlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "9google/cloud/websecurityscanner/v1alph"
          + "a/crawled_url.proto\022\'google.cloud.websecurityscanner.v1alpha\"<\n\n"
          + "CrawledUrl\022\023\n"
          + "\013http_method\030\001 \001(\t\022\013\n"
          + "\003url\030\002 \001(\t\022\014\n"
          + "\004body\030\003 \001(\tB\235\001\n"
          + "+com.google.cloud.websecurityscanner.v1alphaB\017CrawledUrlProtoP\001Z[cloud.goo"
          + "gle.com/go/websecurityscanner/apiv1alpha/websecurityscannerpb;websecurityscanner"
          + "pbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_descriptor,
            new java.lang.String[] {
              "HttpMethod", "Url", "Body",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
