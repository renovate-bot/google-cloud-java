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
// source: google/cloud/websecurityscanner/v1beta/scan_run.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.websecurityscanner.v1beta;

public final class ScanRunProto {
  private ScanRunProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanRun_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/websecurityscanner/v1beta"
          + "/scan_run.proto\022&google.cloud.websecurit"
          + "yscanner.v1beta\032\031google/api/resource.pro"
          + "to\032Agoogle/cloud/websecurityscanner/v1be"
          + "ta/scan_run_error_trace.proto\032Cgoogle/cl"
          + "oud/websecurityscanner/v1beta/scan_run_w"
          + "arning_trace.proto\032\037google/protobuf/time"
          + "stamp.proto\"\322\006\n\007ScanRun\022\014\n\004name\030\001 \001(\t\022W\n"
          + "\017execution_state\030\002 \001(\0162>.google.cloud.we"
          + "bsecurityscanner.v1beta.ScanRun.Executio"
          + "nState\022Q\n\014result_state\030\003 \001(\0162;.google.cl"
          + "oud.websecurityscanner.v1beta.ScanRun.Re"
          + "sultState\022.\n\nstart_time\030\004 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022,\n\010end_time\030\005 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022\032\n\022urls_crawled_"
          + "count\030\006 \001(\003\022\031\n\021urls_tested_count\030\007 \001(\003\022\033"
          + "\n\023has_vulnerabilities\030\010 \001(\010\022\030\n\020progress_"
          + "percent\030\t \001(\005\022N\n\013error_trace\030\n \001(\01329.goo"
          + "gle.cloud.websecurityscanner.v1beta.Scan"
          + "RunErrorTrace\022S\n\016warning_traces\030\013 \003(\0132;."
          + "google.cloud.websecurityscanner.v1beta.S"
          + "canRunWarningTrace\"Y\n\016ExecutionState\022\037\n\033"
          + "EXECUTION_STATE_UNSPECIFIED\020\000\022\n\n\006QUEUED\020"
          + "\001\022\014\n\010SCANNING\020\002\022\014\n\010FINISHED\020\003\"O\n\013ResultS"
          + "tate\022\034\n\030RESULT_STATE_UNSPECIFIED\020\000\022\013\n\007SU"
          + "CCESS\020\001\022\t\n\005ERROR\020\002\022\n\n\006KILLED\020\003:p\352Am\n)web"
          + "securityscanner.googleapis.com/ScanRun\022@"
          + "projects/{project}/scanConfigs/{scan_con"
          + "fig}/scanRuns/{scan_run}B\226\002\n*com.google."
          + "cloud.websecurityscanner.v1betaB\014ScanRun"
          + "ProtoP\001ZZcloud.google.com/go/websecurity"
          + "scanner/apiv1beta/websecurityscannerpb;w"
          + "ebsecurityscannerpb\252\002&Google.Cloud.WebSe"
          + "curityScanner.V1Beta\312\002&Google\\Cloud\\WebS"
          + "ecurityScanner\\V1beta\352\002)Google::Cloud::W"
          + "ebSecurityScanner::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.websecurityscanner.v1beta.ScanRunErrorTraceProto.getDescriptor(),
              com.google.cloud.websecurityscanner.v1beta.ScanRunWarningTraceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1beta_ScanRun_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanRun_descriptor,
            new java.lang.String[] {
              "Name",
              "ExecutionState",
              "ResultState",
              "StartTime",
              "EndTime",
              "UrlsCrawledCount",
              "UrlsTestedCount",
              "HasVulnerabilities",
              "ProgressPercent",
              "ErrorTrace",
              "WarningTraces",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1beta.ScanRunErrorTraceProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1beta.ScanRunWarningTraceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
